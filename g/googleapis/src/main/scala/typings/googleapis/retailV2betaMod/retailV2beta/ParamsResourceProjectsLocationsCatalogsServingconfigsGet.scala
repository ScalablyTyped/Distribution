package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsServingconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the ServingConfig to get. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/servingConfigs/{serving_config_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsServingconfigsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsServingconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsServingconfigsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsServingconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
