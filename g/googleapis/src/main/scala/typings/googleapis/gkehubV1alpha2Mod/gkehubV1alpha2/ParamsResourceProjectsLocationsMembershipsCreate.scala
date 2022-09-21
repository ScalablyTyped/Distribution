package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMembershipsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters.
    */
  var membershipId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent (project and location) where the Memberships will be created. Specified in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMembership] = js.undefined
}
object ParamsResourceProjectsLocationsMembershipsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsMembershipsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMembershipsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMembershipsCreate](x: Self) {
    
    inline def setMembershipId(value: String): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setMembershipIdUndefined: Self = StObject.set(x, "membershipId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaMembership): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
