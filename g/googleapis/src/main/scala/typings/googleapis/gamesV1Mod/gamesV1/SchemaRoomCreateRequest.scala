package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a room creation request.
  */
@js.native
trait SchemaRoomCreateRequest extends StObject {
  
  /**
    * Criteria for auto-matching players into this room.
    */
  var autoMatchingCriteria: js.UndefOr[SchemaRoomAutoMatchingCriteria] = js.native
  
  /**
    * The capabilities that this client supports for realtime communication.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Client address for the player creating the room.
    */
  var clientAddress: js.UndefOr[SchemaRoomClientAddress] = js.native
  
  /**
    * The player IDs to invite to the room.
    */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomCreateRequest.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Network diagnostics for the client creating the room.
    */
  var networkDiagnostics: js.UndefOr[SchemaNetworkDiagnostics] = js.native
  
  /**
    * A randomly generated numeric ID. This number is used at the server to
    * ensure that the request is handled correctly across retries.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * The variant / mode of the application to be played. This can be any
    * integer value, or left blank. You should use a small number of variants
    * to keep the auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.native
}
object SchemaRoomCreateRequest {
  
  @scala.inline
  def apply(): SchemaRoomCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomCreateRequest]
  }
  
  @scala.inline
  implicit class SchemaRoomCreateRequestMutableBuilder[Self <: SchemaRoomCreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMatchingCriteria(value: SchemaRoomAutoMatchingCriteria): Self = StObject.set(x, "autoMatchingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMatchingCriteriaUndefined: Self = StObject.set(x, "autoMatchingCriteria", js.undefined)
    
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    @scala.inline
    def setClientAddress(value: SchemaRoomClientAddress): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAddressUndefined: Self = StObject.set(x, "clientAddress", js.undefined)
    
    @scala.inline
    def setInvitedPlayerIds(value: js.Array[String]): Self = StObject.set(x, "invitedPlayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedPlayerIdsUndefined: Self = StObject.set(x, "invitedPlayerIds", js.undefined)
    
    @scala.inline
    def setInvitedPlayerIdsVarargs(value: String*): Self = StObject.set(x, "invitedPlayerIds", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworkDiagnostics(value: SchemaNetworkDiagnostics): Self = StObject.set(x, "networkDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDiagnosticsUndefined: Self = StObject.set(x, "networkDiagnostics", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
