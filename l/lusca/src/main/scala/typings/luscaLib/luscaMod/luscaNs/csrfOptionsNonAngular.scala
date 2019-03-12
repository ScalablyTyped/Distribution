package typings
package luscaLib.luscaMod.luscaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsNonAngular extends csrfOptions {
  var angular: js.UndefOr[luscaLib.luscaLibNumbers.`false`] = js.undefined
  var cookie: js.UndefOr[java.lang.String | luscaLib.Anon_Name] = js.undefined
  var impl: js.UndefOr[js.Function0[_]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
}

object csrfOptionsNonAngular {
  @scala.inline
  def apply(
    angular: luscaLib.luscaLibNumbers.`false` = null,
    cookie: java.lang.String | luscaLib.Anon_Name = null,
    impl: () => _ = null,
    key: java.lang.String = null,
    secret: java.lang.String = null
  ): csrfOptionsNonAngular = {
    val __obj = js.Dynamic.literal()
    if (angular != null) __obj.updateDynamic("angular")(angular)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (impl != null) __obj.updateDynamic("impl")(js.Any.fromFunction0(impl))
    if (key != null) __obj.updateDynamic("key")(key)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[csrfOptionsNonAngular]
  }
}

