package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement describes the content of a range of indices in the text
  * content of a Shape or TableCell.
  */
@js.native
trait SchemaTextElement extends js.Object {
  /**
    * A TextElement representing a spot in the text that is dynamically
    * replaced with content that can change over time.
    */
  var autoText: js.UndefOr[SchemaAutoText] = js.native
  /**
    * The zero-based end index of this text element, exclusive, in Unicode code
    * units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * A marker representing the beginning of a new paragraph.  The
    * `start_index` and `end_index` of this TextElement represent the range of
    * the paragraph. Other TextElements with an index range contained inside
    * this paragraph&#39;s range are considered to be part of this paragraph.
    * The range of indices of two separate paragraphs will never overlap.
    */
  var paragraphMarker: js.UndefOr[SchemaParagraphMarker] = js.native
  /**
    * The zero-based start index of this text element, in Unicode code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * A TextElement representing a run of text where all of the characters in
    * the run have the same TextStyle.  The `start_index` and `end_index` of
    * TextRuns will always be fully contained in the index range of a single
    * `paragraph_marker` TextElement. In other words, a TextRun will never span
    * multiple paragraphs.
    */
  var textRun: js.UndefOr[SchemaTextRun] = js.native
}

object SchemaTextElement {
  @scala.inline
  def apply(
    autoText: SchemaAutoText = null,
    endIndex: Int | Double = null,
    paragraphMarker: SchemaParagraphMarker = null,
    startIndex: Int | Double = null,
    textRun: SchemaTextRun = null
  ): SchemaTextElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (paragraphMarker != null) __obj.updateDynamic("paragraphMarker")(paragraphMarker.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextElement]
  }
}

