package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotation results for explicit content.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame extends StObject {
  
  /**
    * Likelihood of the pornography content..
    */
  var pornographyLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame](x: Self) {
    
    inline def setPornographyLikelihood(value: String): Self = StObject.set(x, "pornographyLikelihood", value.asInstanceOf[js.Any])
    
    inline def setPornographyLikelihoodUndefined: Self = StObject.set(x, "pornographyLikelihood", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
