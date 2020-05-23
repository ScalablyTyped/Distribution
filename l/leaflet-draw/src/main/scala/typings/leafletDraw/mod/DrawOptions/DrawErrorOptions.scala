package typings.leafletDraw.mod.DrawOptions

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
  def apply(color: String = null, message: String = null, timeout: js.UndefOr[Double] = js.undefined): DrawErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawErrorOptions]
  }
}

