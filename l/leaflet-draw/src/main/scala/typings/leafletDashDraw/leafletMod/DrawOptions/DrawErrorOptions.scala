package typings.leafletDashDraw.leafletMod.DrawOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawErrorOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object DrawErrorOptions {
  @scala.inline
  def apply(color: String = null, message: String = null, timeout: Int | Double = null): DrawErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (message != null) __obj.updateDynamic("message")(message)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawErrorOptions]
  }
}

