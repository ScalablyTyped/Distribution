package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsSetdefaultbranch
  extends StObject
     with StandardParameters {
  
  /**
    * Full resource name of the catalog, such as `projects/x/locations/global/catalogs/default_catalog`.
    */
  var catalog: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2SetDefaultBranchRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsSetdefaultbranch {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsSetdefaultbranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsSetdefaultbranch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsSetdefaultbranch](x: Self) {
    
    inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2SetDefaultBranchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
