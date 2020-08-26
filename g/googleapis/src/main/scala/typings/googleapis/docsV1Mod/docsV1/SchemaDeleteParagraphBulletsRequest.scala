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
  def apply(): SchemaDeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteParagraphBulletsRequest]
  }
  @scala.inline
  implicit class SchemaDeleteParagraphBulletsRequestOps[Self <: SchemaDeleteParagraphBulletsRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: SchemaRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

