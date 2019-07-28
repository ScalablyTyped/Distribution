package typings.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: String = null, event: js.Any = null, tpl: js.Any = null, `type`: String = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (event != null) __obj.updateDynamic("event")(event)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Color]
  }
}

