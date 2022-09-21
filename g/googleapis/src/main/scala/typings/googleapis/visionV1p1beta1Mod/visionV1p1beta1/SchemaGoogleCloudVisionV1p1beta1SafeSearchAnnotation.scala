package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation extends StObject {
  
  /**
    * Represents the adult content likelihood for the image. Adult content may contain elements such as nudity, pornographic images or cartoons, or sexual activities.
    */
  var adult: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Likelihood that this is a medical image.
    */
  var medical: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Likelihood that the request image contains racy content. Racy content may include (but is not limited to) skimpy or sheer clothing, strategically covered nudity, lewd or provocative poses, or close-ups of sensitive body areas.
    */
  var racy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Spoof likelihood. The likelihood that an modification was made to the image's canonical version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Likelihood that this image contains violent content.
    */
  var violence: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation](x: Self) {
    
    inline def setAdult(value: String): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
    
    inline def setAdultNull: Self = StObject.set(x, "adult", null)
    
    inline def setAdultUndefined: Self = StObject.set(x, "adult", js.undefined)
    
    inline def setMedical(value: String): Self = StObject.set(x, "medical", value.asInstanceOf[js.Any])
    
    inline def setMedicalNull: Self = StObject.set(x, "medical", null)
    
    inline def setMedicalUndefined: Self = StObject.set(x, "medical", js.undefined)
    
    inline def setRacy(value: String): Self = StObject.set(x, "racy", value.asInstanceOf[js.Any])
    
    inline def setRacyNull: Self = StObject.set(x, "racy", null)
    
    inline def setRacyUndefined: Self = StObject.set(x, "racy", js.undefined)
    
    inline def setSpoof(value: String): Self = StObject.set(x, "spoof", value.asInstanceOf[js.Any])
    
    inline def setSpoofNull: Self = StObject.set(x, "spoof", null)
    
    inline def setSpoofUndefined: Self = StObject.set(x, "spoof", js.undefined)
    
    inline def setViolence(value: String): Self = StObject.set(x, "violence", value.asInstanceOf[js.Any])
    
    inline def setViolenceNull: Self = StObject.set(x, "violence", null)
    
    inline def setViolenceUndefined: Self = StObject.set(x, "violence", js.undefined)
  }
}
