package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsWhitelist extends csrfOptionsBlacklistOrWhitelist {
  var blacklist: js.UndefOr[scala.Nothing] = js.undefined
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object csrfOptionsWhitelist {
  @scala.inline
  def apply(blacklist: js.UndefOr[scala.Nothing] = js.undefined, whitelist: js.Array[java.lang.String] = null): csrfOptionsWhitelist = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blacklist)) __obj.updateDynamic("blacklist")(blacklist)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[csrfOptionsWhitelist]
  }
}

