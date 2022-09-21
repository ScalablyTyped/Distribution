package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsUsereventsWrite
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent catalog resource name, such as `projects/1234/locations/global/catalogs/default_catalog`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaUserEvent] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsUsereventsWrite {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsUsereventsWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsUsereventsWrite]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsUsereventsWrite](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaUserEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
