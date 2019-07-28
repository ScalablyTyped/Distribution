package typings.atKoaRouter.atKoaRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAllowedMethodsOptions extends js.Object {
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
  var `throw`: js.UndefOr[Boolean] = js.undefined
}

object RouterAllowedMethodsOptions {
  @scala.inline
  def apply(
    methodNotAllowed: () => _ = null,
    notImplemented: () => _ = null,
    `throw`: js.UndefOr[Boolean] = js.undefined
  ): RouterAllowedMethodsOptions = {
    val __obj = js.Dynamic.literal()
    if (methodNotAllowed != null) __obj.updateDynamic("methodNotAllowed")(js.Any.fromFunction0(methodNotAllowed))
    if (notImplemented != null) __obj.updateDynamic("notImplemented")(js.Any.fromFunction0(notImplemented))
    if (!js.isUndefined(`throw`)) __obj.updateDynamic("throw")(`throw`)
    __obj.asInstanceOf[RouterAllowedMethodsOptions]
  }
}

