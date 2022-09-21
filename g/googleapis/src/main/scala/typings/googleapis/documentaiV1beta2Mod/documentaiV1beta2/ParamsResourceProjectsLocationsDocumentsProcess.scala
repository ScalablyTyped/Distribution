package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDocumentsProcess
  extends StObject
     with StandardParameters {
  
  /**
    * Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no location is specified, a region will be chosen automatically. This field is only populated when used in ProcessDocument method.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDocumentsProcess {
  
  inline def apply(): ParamsResourceProjectsLocationsDocumentsProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDocumentsProcess]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDocumentsProcess](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
