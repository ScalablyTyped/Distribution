package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMembershipChangedMetadata extends StObject {
  
  var affectedMemberProfiles: js.UndefOr[js.Array[AppsDynamiteFrontendMember]] = js.undefined
  
  /** List of users and rosters whose membership status changed. */
  var affectedMembers: js.UndefOr[js.Array[AppsDynamiteMemberId]] = js.undefined
  
  var affectedMemberships: js.UndefOr[js.Array[AppsDynamiteMembershipChangedMetadataAffectedMembership]] = js.undefined
  
  /** The user whose action triggered this system message. */
  var initiator: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** Complete member profiles, when ListTopicsRequest FetchOptions.USER is set. Otherwise, only the id will be filled in. */
  var initiatorProfile: js.UndefOr[AppsDynamiteFrontendUser] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AppsDynamiteMembershipChangedMetadata {
  
  inline def apply(): AppsDynamiteMembershipChangedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMembershipChangedMetadata]
  }
  
  extension [Self <: AppsDynamiteMembershipChangedMetadata](x: Self) {
    
    inline def setAffectedMemberProfiles(value: js.Array[AppsDynamiteFrontendMember]): Self = StObject.set(x, "affectedMemberProfiles", value.asInstanceOf[js.Any])
    
    inline def setAffectedMemberProfilesUndefined: Self = StObject.set(x, "affectedMemberProfiles", js.undefined)
    
    inline def setAffectedMemberProfilesVarargs(value: AppsDynamiteFrontendMember*): Self = StObject.set(x, "affectedMemberProfiles", js.Array(value*))
    
    inline def setAffectedMembers(value: js.Array[AppsDynamiteMemberId]): Self = StObject.set(x, "affectedMembers", value.asInstanceOf[js.Any])
    
    inline def setAffectedMembersUndefined: Self = StObject.set(x, "affectedMembers", js.undefined)
    
    inline def setAffectedMembersVarargs(value: AppsDynamiteMemberId*): Self = StObject.set(x, "affectedMembers", js.Array(value*))
    
    inline def setAffectedMemberships(value: js.Array[AppsDynamiteMembershipChangedMetadataAffectedMembership]): Self = StObject.set(x, "affectedMemberships", value.asInstanceOf[js.Any])
    
    inline def setAffectedMembershipsUndefined: Self = StObject.set(x, "affectedMemberships", js.undefined)
    
    inline def setAffectedMembershipsVarargs(value: AppsDynamiteMembershipChangedMetadataAffectedMembership*): Self = StObject.set(x, "affectedMemberships", js.Array(value*))
    
    inline def setInitiator(value: AppsDynamiteUserId): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorProfile(value: AppsDynamiteFrontendUser): Self = StObject.set(x, "initiatorProfile", value.asInstanceOf[js.Any])
    
    inline def setInitiatorProfileUndefined: Self = StObject.set(x, "initiatorProfile", js.undefined)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
