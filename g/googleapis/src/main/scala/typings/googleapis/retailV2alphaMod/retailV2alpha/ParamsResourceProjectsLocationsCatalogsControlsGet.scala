package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsControlsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Control to delete. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/controls/{control_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsControlsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsControlsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsControlsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsControlsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
