package typings.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var name: String
  var padding: js.UndefOr[Double] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonAlign {
  @scala.inline
  def apply(
    name: String,
    align: String = null,
    padding: Int | Double = null,
    prompt: String = null,
    width: Int | Double = null
  ): AnonAlign = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
}

