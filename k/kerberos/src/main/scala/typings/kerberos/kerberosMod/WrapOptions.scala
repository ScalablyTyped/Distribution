package typings.kerberos.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapOptions extends js.Object {
  /**
    * @description The user to authorize
    */
  var user: js.UndefOr[String] = js.undefined
}

object WrapOptions {
  @scala.inline
  def apply(user: String = null): WrapOptions = {
    val __obj = js.Dynamic.literal()
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[WrapOptions]
  }
}

