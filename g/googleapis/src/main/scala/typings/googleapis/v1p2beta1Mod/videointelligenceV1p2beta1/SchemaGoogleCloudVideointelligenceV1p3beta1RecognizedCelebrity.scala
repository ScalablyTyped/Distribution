package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity extends StObject {
  
  /**
    * The recognized celebrity.
    */
  var celebrity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1Celebrity] = js.undefined
  
  /**
    * Recognition confidence. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity](x: Self) {
    
    inline def setCelebrity(value: SchemaGoogleCloudVideointelligenceV1p3beta1Celebrity): Self = StObject.set(x, "celebrity", value.asInstanceOf[js.Any])
    
    inline def setCelebrityUndefined: Self = StObject.set(x, "celebrity", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}
