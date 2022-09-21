package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMembershipsGenerateexclusivitymanifest
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The YAML manifest of the membership CR retrieved by `kubectl get memberships membership`. Leave empty if the resource does not exist.
    */
  var crManifest: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The YAML manifest of the membership CRD retrieved by `kubectl get customresourcedefinitions membership`. Leave empty if the resource does not exist.
    */
  var crdManifest: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Membership resource name in the format `projects/x/locations/x/memberships/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMembershipsGenerateexclusivitymanifest {
  
  inline def apply(): ParamsResourceProjectsLocationsMembershipsGenerateexclusivitymanifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMembershipsGenerateexclusivitymanifest]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMembershipsGenerateexclusivitymanifest](x: Self) {
    
    inline def setCrManifest(value: String): Self = StObject.set(x, "crManifest", value.asInstanceOf[js.Any])
    
    inline def setCrManifestUndefined: Self = StObject.set(x, "crManifest", js.undefined)
    
    inline def setCrdManifest(value: String): Self = StObject.set(x, "crdManifest", value.asInstanceOf[js.Any])
    
    inline def setCrdManifestUndefined: Self = StObject.set(x, "crdManifest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
