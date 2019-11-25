package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DarkLightAnonLargeMediumNone extends js.Object {
  var dark: js.UndefOr[Anon_LargeMediumNone] = js.undefined
  var light: js.UndefOr[Anon_LargeMediumNone] = js.undefined
}

object Anon_DarkLightAnonLargeMediumNone {
  @scala.inline
  def apply(dark: Anon_LargeMediumNone = null, light: Anon_LargeMediumNone = null): Anon_DarkLightAnonLargeMediumNone = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DarkLightAnonLargeMediumNone]
  }
}

