package typings.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var name: String
  var padding: js.UndefOr[Double] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(
    name: String,
    align: String = null,
    padding: Int | Double = null,
    prompt: String = null,
    width: Int | Double = null
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(name = name)
    if (align != null) __obj.updateDynamic("align")(align)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

