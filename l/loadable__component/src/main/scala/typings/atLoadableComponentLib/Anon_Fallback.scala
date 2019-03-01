package typings
package atLoadableComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fallback extends js.Object {
  var fallback: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

object Anon_Fallback {
  @scala.inline
  def apply(fallback: reactLib.reactMod.Global.JSXNs.Element = null): Anon_Fallback = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    __obj.asInstanceOf[Anon_Fallback]
  }
}

