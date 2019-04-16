package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawErrorOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object DrawErrorOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    message: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): DrawErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (message != null) __obj.updateDynamic("message")(message)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawErrorOptions]
  }
}

