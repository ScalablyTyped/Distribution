package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsControlsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Control to delete. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/controls/{control_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsControlsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsControlsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsControlsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsControlsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
