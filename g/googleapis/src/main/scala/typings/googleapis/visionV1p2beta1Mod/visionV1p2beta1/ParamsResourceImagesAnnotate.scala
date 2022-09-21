package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceImagesAnnotate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest] = js.undefined
}
object ParamsResourceImagesAnnotate {
  
  inline def apply(): ParamsResourceImagesAnnotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceImagesAnnotate]
  }
  
  extension [Self <: ParamsResourceImagesAnnotate](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
