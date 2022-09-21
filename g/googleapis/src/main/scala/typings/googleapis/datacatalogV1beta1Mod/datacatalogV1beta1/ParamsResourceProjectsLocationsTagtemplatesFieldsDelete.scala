package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTagtemplatesFieldsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Currently, this field must always be set to `true`. This confirms the deletion of this field from any tags using this field. `force = false` will be supported in the future.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The name of the tag template field to delete. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template_id\}/fields/{tag_template_field_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTagtemplatesFieldsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsTagtemplatesFieldsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTagtemplatesFieldsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
