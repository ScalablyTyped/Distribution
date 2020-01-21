package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes bullets from all of the paragraphs that overlap with the given
  * range.  The nesting level of each paragraph will be visually preserved by
  * adding indent to the start of the corresponding paragraph.
  */
@js.native
trait SchemaDeleteParagraphBulletsRequest extends js.Object {
  /**
    * The range to delete bullets from.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}

object SchemaDeleteParagraphBulletsRequest {
  @scala.inline
  def apply(range: SchemaRange = null): SchemaDeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteParagraphBulletsRequest]
  }
}

