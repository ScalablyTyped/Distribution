package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceImagesAsyncbatchannotate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAsyncBatchAnnotateImagesRequest] = js.undefined
}
object ParamsResourceImagesAsyncbatchannotate {
  
  inline def apply(): ParamsResourceImagesAsyncbatchannotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceImagesAsyncbatchannotate]
  }
  
  extension [Self <: ParamsResourceImagesAsyncbatchannotate](x: Self) {
    
    inline def setRequestBody(value: SchemaAsyncBatchAnnotateImagesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
