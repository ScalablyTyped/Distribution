package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchApprovePublisherConnectionsRequest extends StObject {
  
  /**
    * Required. The names of the publishers with which connections will be approved. In the pattern `bidders/{bidder\}/publisherConnections/{publisher\}` where `{bidder\}` is the account ID of the bidder, and `{publisher\}` is the ads.txt/app-ads.txt publisher ID.
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchApprovePublisherConnectionsRequest {
  
  inline def apply(): SchemaBatchApprovePublisherConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchApprovePublisherConnectionsRequest]
  }
  
  extension [Self <: SchemaBatchApprovePublisherConnectionsRequest](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
