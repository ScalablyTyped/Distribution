package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends js.Object {
  /** Set a specific timeout in milliseconds (disabled) */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOptions]
  }
}

