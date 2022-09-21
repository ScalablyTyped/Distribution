package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsTimeSeriesRequest
  extends StObject
     with BaseRequest {
  
  /** an existing tag name */
  var tag: String
}
object TagsTimeSeriesRequest {
  
  inline def apply(tag: String): TagsTimeSeriesRequest = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsTimeSeriesRequest]
  }
  
  extension [Self <: TagsTimeSeriesRequest](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
