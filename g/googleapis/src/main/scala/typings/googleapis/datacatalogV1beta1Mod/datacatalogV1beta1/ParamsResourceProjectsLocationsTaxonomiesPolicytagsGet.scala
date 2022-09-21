package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the requested policy tag.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
