package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a join room request.
  */
trait SchemaRoomJoinRequest extends StObject {
  
  /**
    * The capabilities that this client supports for realtime communication.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Client address for the player joining the room.
    */
  var clientAddress: js.UndefOr[SchemaRoomClientAddress] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomJoinRequest.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Network diagnostics for the client joining the room.
    */
  var networkDiagnostics: js.UndefOr[SchemaNetworkDiagnostics] = js.undefined
}
object SchemaRoomJoinRequest {
  
  inline def apply(): SchemaRoomJoinRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomJoinRequest]
  }
  
  extension [Self <: SchemaRoomJoinRequest](x: Self) {
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    inline def setClientAddress(value: SchemaRoomClientAddress): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    inline def setClientAddressUndefined: Self = StObject.set(x, "clientAddress", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworkDiagnostics(value: SchemaNetworkDiagnostics): Self = StObject.set(x, "networkDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setNetworkDiagnosticsUndefined: Self = StObject.set(x, "networkDiagnostics", js.undefined)
  }
}
