package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSLogoutOptions extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object HelloJSLogoutOptions {
  @scala.inline
  def apply(force: js.UndefOr[scala.Boolean] = js.undefined): HelloJSLogoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[HelloJSLogoutOptions]
  }
}

