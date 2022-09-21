package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsTimeSeriesRequest
  extends StObject
     with BaseRequest {
  
  /** an existing URL */
  var url: String
}
object UrlsTimeSeriesRequest {
  
  inline def apply(url: String): UrlsTimeSeriesRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsTimeSeriesRequest]
  }
  
  extension [Self <: UrlsTimeSeriesRequest](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
