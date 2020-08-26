package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structural unit of text representing a number of words in certain order.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1Paragraph extends js.Object {
  /**
    * The bounding box for the paragraph. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:   * when the text is horizontal it might look
    * like:      0----1      |    |      3----2   * when it&#39;s rotated 180
    * degrees around the top-left corner it becomes:      2----3      |    |
    * 1----0   and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1BoundingPoly] = js.native
  /**
    * Confidence of the OCR results for the paragraph. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Additional information detected for the paragraph.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty] = js.native
  /**
    * List of words in this paragraph.
    */
  var words: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Word]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1Paragraph {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Paragraph]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ParagraphOps[Self <: SchemaGoogleCloudVisionV1p1beta1Paragraph] (val x: Self) extends AnyVal {
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
    def setBoundingBox(value: SchemaGoogleCloudVisionV1p1beta1BoundingPoly): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setProperty(value: SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setWordsVarargs(value: SchemaGoogleCloudVisionV1p1beta1Word*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Word]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

