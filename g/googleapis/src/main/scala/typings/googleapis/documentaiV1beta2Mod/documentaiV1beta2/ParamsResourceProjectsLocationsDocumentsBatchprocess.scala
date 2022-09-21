package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDocumentsBatchprocess
  extends StObject
     with StandardParameters {
  
  /**
    * Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no location is specified, a region will be chosen automatically.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDocumentsBatchprocess {
  
  inline def apply(): ParamsResourceProjectsLocationsDocumentsBatchprocess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDocumentsBatchprocess]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDocumentsBatchprocess](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
