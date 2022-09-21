package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMembershipsValidateexclusivity
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The YAML of the membership CR in the cluster. Empty if the membership CR does not exist.
    */
  var crManifest: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The intended membership name under the `parent`. This method only does validation in anticipation of a CreateMembership call with the same name.
    */
  var intendedMembership: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent (project and location) where the Memberships will be created. Specified in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMembershipsValidateexclusivity {
  
  inline def apply(): ParamsResourceProjectsLocationsMembershipsValidateexclusivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMembershipsValidateexclusivity]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMembershipsValidateexclusivity](x: Self) {
    
    inline def setCrManifest(value: String): Self = StObject.set(x, "crManifest", value.asInstanceOf[js.Any])
    
    inline def setCrManifestUndefined: Self = StObject.set(x, "crManifest", js.undefined)
    
    inline def setIntendedMembership(value: String): Self = StObject.set(x, "intendedMembership", value.asInstanceOf[js.Any])
    
    inline def setIntendedMembershipUndefined: Self = StObject.set(x, "intendedMembership", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
