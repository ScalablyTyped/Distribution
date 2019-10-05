package typings.kendoDashUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object SegmentOptions {
  @scala.inline
  def apply(name: String = null): SegmentOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SegmentOptions]
  }
}

