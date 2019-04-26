package typings
package atHapiNesLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSubscribeFlags extends js.Object {
  var revoked: js.UndefOr[scala.Boolean] = js.undefined
}

object ClientSubscribeFlags {
  @scala.inline
  def apply(revoked: js.UndefOr[scala.Boolean] = js.undefined): ClientSubscribeFlags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(revoked)) __obj.updateDynamic("revoked")(revoked)
    __obj.asInstanceOf[ClientSubscribeFlags]
  }
}

