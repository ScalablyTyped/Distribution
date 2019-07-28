package typings.gradientDashString.gradientDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var hsvSpin: js.UndefOr[String] = js.undefined
  var interpolation: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(hsvSpin: String = null, interpolation: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (hsvSpin != null) __obj.updateDynamic("hsvSpin")(hsvSpin)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    __obj.asInstanceOf[Options]
  }
}

