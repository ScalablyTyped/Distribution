package typings
package gradientDashStringLib.gradientDashStringMod.gradientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var hsvSpin: js.UndefOr[java.lang.String] = js.undefined
  var interpolation: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(hsvSpin: java.lang.String = null, interpolation: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (hsvSpin != null) __obj.updateDynamic("hsvSpin")(hsvSpin)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    __obj.asInstanceOf[Options]
  }
}

