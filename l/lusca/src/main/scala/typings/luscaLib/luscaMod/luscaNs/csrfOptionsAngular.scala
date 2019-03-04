package typings
package luscaLib.luscaMod.luscaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsAngular extends csrfOptions {
  var angular: luscaLib.luscaLibNumbers.`true`
  var cookie: js.UndefOr[java.lang.String | luscaLib.Anon_Options] = js.undefined
  var impl: js.UndefOr[js.Function0[_]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
}

object csrfOptionsAngular {
  @scala.inline
  def apply(
    angular: luscaLib.luscaLibNumbers.`true`,
    cookie: java.lang.String | luscaLib.Anon_Options = null,
    impl: js.Function0[_] = null,
    key: java.lang.String = null,
    secret: java.lang.String = null
  ): csrfOptionsAngular = {
    val __obj = js.Dynamic.literal(angular = angular)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (impl != null) __obj.updateDynamic("impl")(impl)
    if (key != null) __obj.updateDynamic("key")(key)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[csrfOptionsAngular]
  }
}

