package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[Anon_Colors]
  }
}

