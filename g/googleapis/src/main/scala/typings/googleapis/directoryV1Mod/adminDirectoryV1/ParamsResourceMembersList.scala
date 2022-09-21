package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMembersList
  extends StObject
     with StandardParameters {
  
  /**
    * Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    */
  var groupKey: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to list indirect memberships. Default: false.
    */
  var includeDerivedMembership: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of results to return. Max allowed value is 200.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The `roles` query parameter allows you to retrieve group members by role. Allowed values are `OWNER`, `MANAGER`, and `MEMBER`.
    */
  var roles: js.UndefOr[String] = js.undefined
}
object ParamsResourceMembersList {
  
  inline def apply(): ParamsResourceMembersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersList]
  }
  
  extension [Self <: ParamsResourceMembersList](x: Self) {
    
    inline def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setIncludeDerivedMembership(value: Boolean): Self = StObject.set(x, "includeDerivedMembership", value.asInstanceOf[js.Any])
    
    inline def setIncludeDerivedMembershipUndefined: Self = StObject.set(x, "includeDerivedMembership", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRoles(value: String): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
  }
}
