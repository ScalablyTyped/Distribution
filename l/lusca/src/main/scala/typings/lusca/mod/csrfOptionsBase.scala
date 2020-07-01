package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsBase extends js.Object {
  /**
    * The name of the response header containing the CSRF token
    * @default 'x-csrf-token'
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    *  An object with create/validate methods for custom tokens
    */
  var impl: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * The name of the CSRF token in the model.
    * @default '_csrf'
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * @default '_csrfSecret'
    */
  var secret: js.UndefOr[String] = js.undefined
}

object csrfOptionsBase {
  @scala.inline
  def apply(header: String = null, impl: () => _ = null, key: String = null, secret: String = null): csrfOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (impl != null) __obj.updateDynamic("impl")(js.Any.fromFunction0(impl))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsBase]
  }
}

