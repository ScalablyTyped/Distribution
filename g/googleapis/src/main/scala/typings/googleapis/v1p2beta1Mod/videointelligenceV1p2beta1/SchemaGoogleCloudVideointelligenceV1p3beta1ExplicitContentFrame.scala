package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame extends StObject {
  
  /**
    * Likelihood of the pornography content..
    */
  var pornographyLikelihood: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the video frame for this location.
    */
  var timeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame](x: Self) {
    
    inline def setPornographyLikelihood(value: String): Self = StObject.set(x, "pornographyLikelihood", value.asInstanceOf[js.Any])
    
    inline def setPornographyLikelihoodNull: Self = StObject.set(x, "pornographyLikelihood", null)
    
    inline def setPornographyLikelihoodUndefined: Self = StObject.set(x, "pornographyLikelihood", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetNull: Self = StObject.set(x, "timeOffset", null)
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
