package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DarkLight extends js.Object {
  var dark: js.UndefOr[Anon_LargeMediumNone] = js.undefined
  var light: js.UndefOr[Anon_LargeMediumNone] = js.undefined
}

object Anon_DarkLight {
  @scala.inline
  def apply(dark: Anon_LargeMediumNone = null, light: Anon_LargeMediumNone = null): Anon_DarkLight = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (light != null) __obj.updateDynamic("light")(light)
    __obj.asInstanceOf[Anon_DarkLight]
  }
}

