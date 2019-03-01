package typings
package jsshaLib.jsshaMod.jsSHANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormatOptions extends js.Object {
  var b64Pad: js.UndefOr[java.lang.String] = js.undefined
  var outputUpper: js.UndefOr[scala.Boolean] = js.undefined
  var shakeLen: js.UndefOr[scala.Double] = js.undefined
}

object OutputFormatOptions {
  @scala.inline
  def apply(
    b64Pad: java.lang.String = null,
    outputUpper: js.UndefOr[scala.Boolean] = js.undefined,
    shakeLen: scala.Int | scala.Double = null
  ): OutputFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (b64Pad != null) __obj.updateDynamic("b64Pad")(b64Pad)
    if (!js.isUndefined(outputUpper)) __obj.updateDynamic("outputUpper")(outputUpper)
    if (shakeLen != null) __obj.updateDynamic("shakeLen")(shakeLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormatOptions]
  }
}

