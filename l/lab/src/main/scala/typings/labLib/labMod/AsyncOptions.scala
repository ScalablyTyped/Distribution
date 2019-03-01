package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends js.Object {
  /** Set a specific timeout in milliseconds (disabled) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOptions]
  }
}

