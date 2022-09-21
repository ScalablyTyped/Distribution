package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipChangedMetadata extends StObject {
  
  var affectedMemberProfiles: js.UndefOr[js.Array[SchemaMember]] = js.undefined
  
  /**
    * List of users and rosters whose membership status changed.
    */
  var affectedMembers: js.UndefOr[js.Array[SchemaMemberId]] = js.undefined
  
  var affectedMemberships: js.UndefOr[js.Array[SchemaAffectedMembership]] = js.undefined
  
  /**
    * The user whose action triggered this system message.
    */
  var initiator: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Complete member profiles, when ListTopicsRequest FetchOptions.USER is set. Otherwise, only the id will be filled in.
    */
  var initiatorProfile: js.UndefOr[SchemaUser] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembershipChangedMetadata {
  
  inline def apply(): SchemaMembershipChangedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipChangedMetadata]
  }
  
  extension [Self <: SchemaMembershipChangedMetadata](x: Self) {
    
    inline def setAffectedMemberProfiles(value: js.Array[SchemaMember]): Self = StObject.set(x, "affectedMemberProfiles", value.asInstanceOf[js.Any])
    
    inline def setAffectedMemberProfilesUndefined: Self = StObject.set(x, "affectedMemberProfiles", js.undefined)
    
    inline def setAffectedMemberProfilesVarargs(value: SchemaMember*): Self = StObject.set(x, "affectedMemberProfiles", js.Array(value*))
    
    inline def setAffectedMembers(value: js.Array[SchemaMemberId]): Self = StObject.set(x, "affectedMembers", value.asInstanceOf[js.Any])
    
    inline def setAffectedMembersUndefined: Self = StObject.set(x, "affectedMembers", js.undefined)
    
    inline def setAffectedMembersVarargs(value: SchemaMemberId*): Self = StObject.set(x, "affectedMembers", js.Array(value*))
    
    inline def setAffectedMemberships(value: js.Array[SchemaAffectedMembership]): Self = StObject.set(x, "affectedMemberships", value.asInstanceOf[js.Any])
    
    inline def setAffectedMembershipsUndefined: Self = StObject.set(x, "affectedMemberships", js.undefined)
    
    inline def setAffectedMembershipsVarargs(value: SchemaAffectedMembership*): Self = StObject.set(x, "affectedMemberships", js.Array(value*))
    
    inline def setInitiator(value: SchemaUserId): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorProfile(value: SchemaUser): Self = StObject.set(x, "initiatorProfile", value.asInstanceOf[js.Any])
    
    inline def setInitiatorProfileUndefined: Self = StObject.set(x, "initiatorProfile", js.undefined)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
