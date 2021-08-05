package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponsePaginationInfo extends StObject {
  
  var group_id: Null
  
  var source: Null
}
object TimelineFeedResponsePaginationInfo {
  
  inline def apply(group_id: Null, source: Null): TimelineFeedResponsePaginationInfo = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponsePaginationInfo]
  }
  
  extension [Self <: TimelineFeedResponsePaginationInfo](x: Self) {
    
    inline def setGroup_id(value: Null): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
