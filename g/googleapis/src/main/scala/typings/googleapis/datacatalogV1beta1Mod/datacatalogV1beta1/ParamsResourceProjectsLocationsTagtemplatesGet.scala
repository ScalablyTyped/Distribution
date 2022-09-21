package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTagtemplatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the tag template. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTagtemplatesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsTagtemplatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTagtemplatesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTagtemplatesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
