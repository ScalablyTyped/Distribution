package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structural unit of text representing a number of words in certain order.
  */
@js.native
trait SchemaParagraph extends js.Object {
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
  var boundingBox: js.UndefOr[SchemaBoundingPoly] = js.native
  /**
    * Confidence of the OCR results for the paragraph. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Additional information detected for the paragraph.
    */
  var property: js.UndefOr[SchemaTextProperty] = js.native
  /**
    * List of words in this paragraph.
    */
  var words: js.UndefOr[js.Array[SchemaWord]] = js.native
}

object SchemaParagraph {
  @scala.inline
  def apply(): SchemaParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraph]
  }
  @scala.inline
  implicit class SchemaParagraphOps[Self <: SchemaParagraph] (val x: Self) extends AnyVal {
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
    def setBoundingBox(value: SchemaBoundingPoly): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setProperty(value: SchemaTextProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setWordsVarargs(value: SchemaWord*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[SchemaWord]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

