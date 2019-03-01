package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hide extends js.Object {
  def hide(): scala.Unit
  def isEnabled(): scala.Boolean
  def show(): scala.Unit
}

object Anon_Hide {
  @scala.inline
  def apply(
    hide: js.Function0[scala.Unit],
    isEnabled: js.Function0[scala.Boolean],
    show: js.Function0[scala.Unit]
  ): Anon_Hide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Hide]
  }
}

