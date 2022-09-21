package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsCatalogitemsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full resource name of catalog item, such as `projects/x/locations/global/catalogs/default_catalog/catalogitems/some_catalog_item_id`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsCatalogitemsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsCatalogitemsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsCatalogitemsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
