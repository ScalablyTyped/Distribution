package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOptions extends js.Object {
  /**
    * Boolean value indicating whether the error handler should be used for all errors or only for errors occurring
    * on this property (`true` value).
    * This concept only makes sense for `array` or `object` schemas as other values don't have children.
    * @default false
    */
  var self: js.UndefOr[Boolean] = js.undefined
}

object ErrorOptions {
  @scala.inline
  def apply(self: js.UndefOr[Boolean] = js.undefined): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOptions]
  }
}

