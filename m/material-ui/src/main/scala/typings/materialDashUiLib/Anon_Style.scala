package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Style extends js.Object {
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object Anon_Style {
  @scala.inline
  def apply(style: reactLib.reactMod.ReactNs.CSSProperties = null): Anon_Style = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_Style]
  }
}

