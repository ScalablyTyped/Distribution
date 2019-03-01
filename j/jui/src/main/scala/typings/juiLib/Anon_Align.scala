package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[juiLib.juiLibStrings.left | juiLib.juiLibStrings.right] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  var valign: js.UndefOr[juiLib.juiLibStrings.top | juiLib.juiLibStrings.bottom] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(
    align: juiLib.juiLibStrings.left | juiLib.juiLibStrings.right = null,
    event: js.Any = null,
    items: js.Array[_] = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    tpl: js.Any = null,
    valign: juiLib.juiLibStrings.top | juiLib.juiLibStrings.bottom = null
  ): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

