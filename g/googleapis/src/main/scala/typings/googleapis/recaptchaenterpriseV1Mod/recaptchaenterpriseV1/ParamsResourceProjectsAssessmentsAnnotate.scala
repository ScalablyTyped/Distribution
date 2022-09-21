package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAssessmentsAnnotate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Assessment, in the format "projects/{project\}/assessments/{assessment\}".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest] = js.undefined
}
object ParamsResourceProjectsAssessmentsAnnotate {
  
  inline def apply(): ParamsResourceProjectsAssessmentsAnnotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAssessmentsAnnotate]
  }
  
  extension [Self <: ParamsResourceProjectsAssessmentsAnnotate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
