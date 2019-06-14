package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsBase extends js.Object {
  var impl: js.UndefOr[js.Function0[_]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
}

object csrfOptionsBase {
  @scala.inline
  def apply(impl: () => _ = null, key: java.lang.String = null, secret: java.lang.String = null): csrfOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (impl != null) __obj.updateDynamic("impl")(js.Any.fromFunction0(impl))
    if (key != null) __obj.updateDynamic("key")(key)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[csrfOptionsBase]
  }
}

