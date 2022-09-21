package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTagtemplatesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. If true, deletes all tags that use this template. Currently, `true` is the only supported value.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The name of the tag template to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTagtemplatesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsTagtemplatesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTagtemplatesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTagtemplatesDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
