package typings.matrixBotSdk.libSynapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseRoomListing extends StObject {
  
  var canonical_alias: String
  
  var creator: String
  
  var encryption: String
  
  var federatable: Boolean
  
  var guest_access: String
  
  var history_visibility: String
  
  var join_rules: String
  
  var joined_local_members: Double
  
  var joined_members: Double
  
  var name: String
  
  var public: Boolean
  
  var room_id: String
  
  var state_events: Double
  
  var version: String
}
object SynapseRoomListing {
  
  inline def apply(
    canonical_alias: String,
    creator: String,
    encryption: String,
    federatable: Boolean,
    guest_access: String,
    history_visibility: String,
    join_rules: String,
    joined_local_members: Double,
    joined_members: Double,
    name: String,
    public: Boolean,
    room_id: String,
    state_events: Double,
    version: String
  ): SynapseRoomListing = {
    val __obj = js.Dynamic.literal(canonical_alias = canonical_alias.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], federatable = federatable.asInstanceOf[js.Any], guest_access = guest_access.asInstanceOf[js.Any], history_visibility = history_visibility.asInstanceOf[js.Any], join_rules = join_rules.asInstanceOf[js.Any], joined_local_members = joined_local_members.asInstanceOf[js.Any], joined_members = joined_members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], state_events = state_events.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynapseRoomListing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynapseRoomListing] (val x: Self) extends AnyVal {
    
    inline def setCanonical_alias(value: String): Self = StObject.set(x, "canonical_alias", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setFederatable(value: Boolean): Self = StObject.set(x, "federatable", value.asInstanceOf[js.Any])
    
    inline def setGuest_access(value: String): Self = StObject.set(x, "guest_access", value.asInstanceOf[js.Any])
    
    inline def setHistory_visibility(value: String): Self = StObject.set(x, "history_visibility", value.asInstanceOf[js.Any])
    
    inline def setJoin_rules(value: String): Self = StObject.set(x, "join_rules", value.asInstanceOf[js.Any])
    
    inline def setJoined_local_members(value: Double): Self = StObject.set(x, "joined_local_members", value.asInstanceOf[js.Any])
    
    inline def setJoined_members(value: Double): Self = StObject.set(x, "joined_members", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
    
    inline def setState_events(value: Double): Self = StObject.set(x, "state_events", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
