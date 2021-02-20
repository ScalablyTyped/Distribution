package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for web pages.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage extends StObject {
  
  /**
    * Fully matching images on the page. Can include resized copies of the
    * query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage]] = js.native
  
  /**
    * Title for the web page, may contain HTML markups.
    */
  var pageTitle: js.UndefOr[String] = js.native
  
  /**
    * Partial matching images on the page. Those images are similar enough to
    * share some key-point features. For example an original image will likely
    * have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage]] = js.native
  
  /**
    * (Deprecated) Overall relevancy score for the web page.
    */
  var score: js.UndefOr[Double] = js.native
  
  /**
    * The result web page URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPageMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullMatchingImages(value: js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage]): Self = StObject.set(x, "fullMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullMatchingImagesUndefined: Self = StObject.set(x, "fullMatchingImages", js.undefined)
    
    @scala.inline
    def setFullMatchingImagesVarargs(value: SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage*): Self = StObject.set(x, "fullMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
    
    @scala.inline
    def setPartialMatchingImages(value: js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage]): Self = StObject.set(x, "partialMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMatchingImagesUndefined: Self = StObject.set(x, "partialMatchingImages", js.undefined)
    
    @scala.inline
    def setPartialMatchingImagesVarargs(value: SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage*): Self = StObject.set(x, "partialMatchingImages", js.Array(value :_*))
    
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
