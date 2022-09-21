package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProductsetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the ProductSet to get. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsProductsetsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsProductsetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProductsetsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProductsetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
