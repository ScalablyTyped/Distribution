package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsGetdefaultbranch
  extends StObject
     with StandardParameters {
  
  /**
    * The parent catalog resource name, such as `projects/x/locations/global/catalogs/default_catalog`.
    */
  var catalog: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsGetdefaultbranch {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsGetdefaultbranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsGetdefaultbranch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsGetdefaultbranch](x: Self) {
    
    inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
  }
}
