package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the HumanReviewConfig that the document will be reviewed with.
    */
  var humanReviewConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDocumentaiV1ReviewDocumentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument {
  
  inline def apply(): ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument](x: Self) {
    
    inline def setHumanReviewConfig(value: String): Self = StObject.set(x, "humanReviewConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewConfigUndefined: Self = StObject.set(x, "humanReviewConfig", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDocumentaiV1ReviewDocumentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
