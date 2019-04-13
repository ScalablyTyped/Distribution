package typings
package koaDashRouterLib.koaDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterAllowedMethodsOptions extends js.Object {
  /**
    * throw the returned value in place of the default MethodNotAllowed error
    */
  var methodNotAllowed: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * throw the returned value in place of the default NotImplemented error
    */
  var notImplemented: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * throw error instead of setting status and header
    */
  var `throw`: js.UndefOr[scala.Boolean] = js.undefined
}

object IRouterAllowedMethodsOptions {
  @scala.inline
  def apply(
    methodNotAllowed: () => _ = null,
    notImplemented: () => _ = null,
    `throw`: js.UndefOr[scala.Boolean] = js.undefined
  ): IRouterAllowedMethodsOptions = {
    val __obj = js.Dynamic.literal()
    if (methodNotAllowed != null) __obj.updateDynamic("methodNotAllowed")(js.Any.fromFunction0(methodNotAllowed))
    if (notImplemented != null) __obj.updateDynamic("notImplemented")(js.Any.fromFunction0(notImplemented))
    if (!js.isUndefined(`throw`)) __obj.updateDynamic("throw")(`throw`)
    __obj.asInstanceOf[IRouterAllowedMethodsOptions]
  }
}

