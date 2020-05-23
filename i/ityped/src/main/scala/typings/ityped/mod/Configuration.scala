package typings.ityped.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var loop: js.UndefOr[Boolean] = js.undefined
  var pause: js.UndefOr[Double] = js.undefined
  var strings: js.UndefOr[js.Array[String]] = js.undefined
  var typeSpeed: js.UndefOr[Double] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    loop: js.UndefOr[Boolean] = js.undefined,
    pause: js.UndefOr[Double] = js.undefined,
    strings: js.Array[String] = null,
    typeSpeed: js.UndefOr[Double] = js.undefined
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.get.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (!js.isUndefined(typeSpeed)) __obj.updateDynamic("typeSpeed")(typeSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

