package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchApprovePublisherConnectionsResponse extends StObject {
  
  /**
    * The publisher connections that have been approved.
    */
  var publisherConnections: js.UndefOr[js.Array[SchemaPublisherConnection]] = js.undefined
}
object SchemaBatchApprovePublisherConnectionsResponse {
  
  inline def apply(): SchemaBatchApprovePublisherConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchApprovePublisherConnectionsResponse]
  }
  
  extension [Self <: SchemaBatchApprovePublisherConnectionsResponse](x: Self) {
    
    inline def setPublisherConnections(value: js.Array[SchemaPublisherConnection]): Self = StObject.set(x, "publisherConnections", value.asInstanceOf[js.Any])
    
    inline def setPublisherConnectionsUndefined: Self = StObject.set(x, "publisherConnections", js.undefined)
    
    inline def setPublisherConnectionsVarargs(value: SchemaPublisherConnection*): Self = StObject.set(x, "publisherConnections", js.Array(value*))
  }
}
