package typings.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var name: String
  var padding: js.UndefOr[Double] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Align {
  @scala.inline
  def apply(
    name: String,
    align: String = null,
    padding: js.UndefOr[Double] = js.undefined,
    prompt: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Align = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

