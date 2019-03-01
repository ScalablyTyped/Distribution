package typings
package jdenticonLib.jdenticonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdenticonConfig extends js.Object {
  var lightness: js.UndefOr[jdenticonLib.Anon_Color] = js.undefined
  var saturation: js.UndefOr[scala.Double] = js.undefined
}

object JdenticonConfig {
  @scala.inline
  def apply(lightness: jdenticonLib.Anon_Color = null, saturation: scala.Int | scala.Double = null): JdenticonConfig = {
    val __obj = js.Dynamic.literal()
    if (lightness != null) __obj.updateDynamic("lightness")(lightness)
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JdenticonConfig]
  }
}

