package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesAsyncbatchannotate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest] = js.undefined
}
object ParamsResourceFilesAsyncbatchannotate {
  
  inline def apply(): ParamsResourceFilesAsyncbatchannotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesAsyncbatchannotate]
  }
  
  extension [Self <: ParamsResourceFilesAsyncbatchannotate](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
