package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVideosAnnotate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoRequest] = js.undefined
}
object ParamsResourceVideosAnnotate {
  
  inline def apply(): ParamsResourceVideosAnnotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideosAnnotate]
  }
  
  extension [Self <: ParamsResourceVideosAnnotate](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
