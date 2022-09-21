package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * By default, a version that is tagged may not be deleted. If force=true, the version and any tags pointing to the version are deleted.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the version to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
