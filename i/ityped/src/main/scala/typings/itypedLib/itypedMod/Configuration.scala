package typings
package itypedLib.itypedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var pause: js.UndefOr[scala.Double] = js.undefined
  var strings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var typeSpeed: js.UndefOr[scala.Double] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    pause: scala.Int | scala.Double = null,
    strings: js.Array[java.lang.String] = null,
    typeSpeed: scala.Int | scala.Double = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings)
    if (typeSpeed != null) __obj.updateDynamic("typeSpeed")(typeSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

