package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1IngressSource extends StObject {
  
  /**
    * An AccessLevel resource name that allow resources within the ServicePerimeters to be accessed from the internet. AccessLevels listed must be in the same policy as this ServicePerimeter. Referencing a nonexistent AccessLevel will cause an error. If no AccessLevel names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL`. If a single `*` is specified for `access_level`, then all IngressSources will be allowed.
    */
  var accessLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Google Cloud resource that is allowed to ingress the perimeter. Requests from these resources will be allowed to access perimeter data. Currently only projects are allowed. Format: `projects/{project_number\}` The project may be in any Google Cloud organization, not just the organization that the perimeter is defined in. `*` is not allowed, the case of allowing all Google Cloud resources only is not supported.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1IngressSource {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1IngressSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1IngressSource]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1IngressSource](x: Self) {
    
    inline def setAccessLevel(value: String): Self = StObject.set(x, "accessLevel", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelNull: Self = StObject.set(x, "accessLevel", null)
    
    inline def setAccessLevelUndefined: Self = StObject.set(x, "accessLevel", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
