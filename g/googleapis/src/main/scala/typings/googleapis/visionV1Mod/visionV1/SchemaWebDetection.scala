package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relevant information for the image from the Internet.
  */
@js.native
trait SchemaWebDetection extends StObject {
  
  /**
    * The service&#39;s best guess as to the topic of the request image.
    * Inferred from similar images on the open web.
    */
  var bestGuessLabels: js.UndefOr[js.Array[SchemaWebLabel]] = js.native
  
  /**
    * Fully matching images from the Internet. Can include resized copies of
    * the query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  
  /**
    * Web pages containing the matching images from the Internet.
    */
  var pagesWithMatchingImages: js.UndefOr[js.Array[SchemaWebPage]] = js.native
  
  /**
    * Partial matching images from the Internet. Those images are similar
    * enough to share some key-point features. For example an original image
    * will likely have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  
  /**
    * The visually similar image results.
    */
  var visuallySimilarImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  
  /**
    * Deduced entities from similar images on the Internet.
    */
  var webEntities: js.UndefOr[js.Array[SchemaWebEntity]] = js.native
}
object SchemaWebDetection {
  
  @scala.inline
  def apply(): SchemaWebDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebDetection]
  }
  
  @scala.inline
  implicit class SchemaWebDetectionMutableBuilder[Self <: SchemaWebDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBestGuessLabels(value: js.Array[SchemaWebLabel]): Self = StObject.set(x, "bestGuessLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestGuessLabelsUndefined: Self = StObject.set(x, "bestGuessLabels", js.undefined)
    
    @scala.inline
    def setBestGuessLabelsVarargs(value: SchemaWebLabel*): Self = StObject.set(x, "bestGuessLabels", js.Array(value :_*))
    
    @scala.inline
    def setFullMatchingImages(value: js.Array[SchemaWebImage]): Self = StObject.set(x, "fullMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullMatchingImagesUndefined: Self = StObject.set(x, "fullMatchingImages", js.undefined)
    
    @scala.inline
    def setFullMatchingImagesVarargs(value: SchemaWebImage*): Self = StObject.set(x, "fullMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPagesWithMatchingImages(value: js.Array[SchemaWebPage]): Self = StObject.set(x, "pagesWithMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesWithMatchingImagesUndefined: Self = StObject.set(x, "pagesWithMatchingImages", js.undefined)
    
    @scala.inline
    def setPagesWithMatchingImagesVarargs(value: SchemaWebPage*): Self = StObject.set(x, "pagesWithMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPartialMatchingImages(value: js.Array[SchemaWebImage]): Self = StObject.set(x, "partialMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMatchingImagesUndefined: Self = StObject.set(x, "partialMatchingImages", js.undefined)
    
    @scala.inline
    def setPartialMatchingImagesVarargs(value: SchemaWebImage*): Self = StObject.set(x, "partialMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setVisuallySimilarImages(value: js.Array[SchemaWebImage]): Self = StObject.set(x, "visuallySimilarImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisuallySimilarImagesUndefined: Self = StObject.set(x, "visuallySimilarImages", js.undefined)
    
    @scala.inline
    def setVisuallySimilarImagesVarargs(value: SchemaWebImage*): Self = StObject.set(x, "visuallySimilarImages", js.Array(value :_*))
    
    @scala.inline
    def setWebEntities(value: js.Array[SchemaWebEntity]): Self = StObject.set(x, "webEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebEntitiesUndefined: Self = StObject.set(x, "webEntities", js.undefined)
    
    @scala.inline
    def setWebEntitiesVarargs(value: SchemaWebEntity*): Self = StObject.set(x, "webEntities", js.Array(value :_*))
  }
}
