package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericClientOptions extends js.Object {
  /**
    * Indicates that the old argument order should be used for methods, with
    * optional arguments at the end instead of the callback at the end. This
    * option is only a temporary stopgap measure to smooth an API breakage.
    * It is deprecated, and new code should not use it.
    */
  var deprecatedArgumentOrder: js.UndefOr[scala.Boolean] = js.undefined
}

object GenericClientOptions {
  @scala.inline
  def apply(deprecatedArgumentOrder: js.UndefOr[scala.Boolean] = js.undefined): GenericClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecatedArgumentOrder)) __obj.updateDynamic("deprecatedArgumentOrder")(deprecatedArgumentOrder)
    __obj.asInstanceOf[GenericClientOptions]
  }
}

