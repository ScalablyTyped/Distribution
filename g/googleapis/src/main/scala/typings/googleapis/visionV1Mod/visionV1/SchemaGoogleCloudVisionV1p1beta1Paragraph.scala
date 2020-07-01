package typings.googleapis.visionV1Mod.visionV1

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
  def apply(
    boundingBox: SchemaGoogleCloudVisionV1p1beta1BoundingPoly = null,
    confidence: js.UndefOr[Double] = js.undefined,
    property: SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty = null,
    words: js.Array[SchemaGoogleCloudVisionV1p1beta1Word] = null
  ): SchemaGoogleCloudVisionV1p1beta1Paragraph = {
    val __obj = js.Dynamic.literal()
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Paragraph]
  }
}

