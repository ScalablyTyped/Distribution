package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicGroupQuery extends StObject {
  
  /**
    * Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org,
    * org.department=='engineering')` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area=='foo' &&
    * loc.building_id=='bar')` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried).
    * `user.name.value.equalsIgnoreCase('jOhn DoE')`
    */
  var query: js.UndefOr[String] = js.undefined
  
  /** Resource type for the Dynamic Group Query */
  var resourceType: js.UndefOr[String] = js.undefined
}
object DynamicGroupQuery {
  
  inline def apply(): DynamicGroupQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicGroupQuery]
  }
  
  extension [Self <: DynamicGroupQuery](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
