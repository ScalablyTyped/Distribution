package typings.hellojs.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSLogoutOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
}

object HelloJSLogoutOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): HelloJSLogoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSLogoutOptions]
  }
}

