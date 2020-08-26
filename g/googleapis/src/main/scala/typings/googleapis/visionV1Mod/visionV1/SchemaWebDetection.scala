package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relevant information for the image from the Internet.
  */
@js.native
trait SchemaWebDetection extends js.Object {
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
  implicit class SchemaWebDetectionOps[Self <: SchemaWebDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBestGuessLabelsVarargs(value: SchemaWebLabel*): Self = this.set("bestGuessLabels", js.Array(value :_*))
    @scala.inline
    def setBestGuessLabels(value: js.Array[SchemaWebLabel]): Self = this.set("bestGuessLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestGuessLabels: Self = this.set("bestGuessLabels", js.undefined)
    @scala.inline
    def setFullMatchingImagesVarargs(value: SchemaWebImage*): Self = this.set("fullMatchingImages", js.Array(value :_*))
    @scala.inline
    def setFullMatchingImages(value: js.Array[SchemaWebImage]): Self = this.set("fullMatchingImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullMatchingImages: Self = this.set("fullMatchingImages", js.undefined)
    @scala.inline
    def setPagesWithMatchingImagesVarargs(value: SchemaWebPage*): Self = this.set("pagesWithMatchingImages", js.Array(value :_*))
    @scala.inline
    def setPagesWithMatchingImages(value: js.Array[SchemaWebPage]): Self = this.set("pagesWithMatchingImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagesWithMatchingImages: Self = this.set("pagesWithMatchingImages", js.undefined)
    @scala.inline
    def setPartialMatchingImagesVarargs(value: SchemaWebImage*): Self = this.set("partialMatchingImages", js.Array(value :_*))
    @scala.inline
    def setPartialMatchingImages(value: js.Array[SchemaWebImage]): Self = this.set("partialMatchingImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialMatchingImages: Self = this.set("partialMatchingImages", js.undefined)
    @scala.inline
    def setVisuallySimilarImagesVarargs(value: SchemaWebImage*): Self = this.set("visuallySimilarImages", js.Array(value :_*))
    @scala.inline
    def setVisuallySimilarImages(value: js.Array[SchemaWebImage]): Self = this.set("visuallySimilarImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisuallySimilarImages: Self = this.set("visuallySimilarImages", js.undefined)
    @scala.inline
    def setWebEntitiesVarargs(value: SchemaWebEntity*): Self = this.set("webEntities", js.Array(value :_*))
    @scala.inline
    def setWebEntities(value: js.Array[SchemaWebEntity]): Self = this.set("webEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebEntities: Self = this.set("webEntities", js.undefined)
  }
  
}

