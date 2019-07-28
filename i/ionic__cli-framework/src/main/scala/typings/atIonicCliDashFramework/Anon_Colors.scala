package typings.atIonicCliDashFramework

import typings.atIonicCliDashFramework.libColorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.UndefOr[Colors] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(colors: Colors = null): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[Anon_Colors]
  }
}

