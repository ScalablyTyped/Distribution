package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents a run of text that all has the same
  * styling.
  */
@js.native
trait SchemaTextRun extends js.Object {
  /**
    * The text of this run.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The styling applied to this run.
    */
  var style: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaTextRun {
  @scala.inline
  def apply(content: String = null, style: SchemaTextStyle = null): SchemaTextRun = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextRun]
  }
}

