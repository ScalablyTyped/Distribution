package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment extends StObject {
  
  /**
    * Labels for this request.
    */
  var labels: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment](x: Self) {
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
