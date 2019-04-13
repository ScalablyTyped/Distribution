package typings
package inboxsdkLib.inboxsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadScriptOptions extends js.Object {
  var nowrap: js.UndefOr[scala.Boolean] = js.undefined
}

object LoadScriptOptions {
  @scala.inline
  def apply(nowrap: js.UndefOr[scala.Boolean] = js.undefined): LoadScriptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nowrap)) __obj.updateDynamic("nowrap")(nowrap)
    __obj.asInstanceOf[LoadScriptOptions]
  }
}

