package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for online images.
  */
trait SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage extends StObject {
  
  /**
    * (Deprecated) Overall relevancy score for the image.
    */
  var score: js.UndefOr[Double] = js.undefined
  
  /**
    * The result image URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImageMutableBuilder[Self <: SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
