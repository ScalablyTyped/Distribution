package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsUsereventsRejoin
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent catalog resource name, such as `projects/1234/locations/global/catalogs/default_catalog`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2RejoinUserEventsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsUsereventsRejoin {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsUsereventsRejoin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsUsereventsRejoin]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2RejoinUserEventsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
