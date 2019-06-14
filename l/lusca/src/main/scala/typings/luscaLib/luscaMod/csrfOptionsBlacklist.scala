package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsBlacklist extends csrfOptionsBlacklistOrWhitelist {
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var whitelist: js.UndefOr[scala.Nothing] = js.undefined
}

object csrfOptionsBlacklist {
  @scala.inline
  def apply(blacklist: js.Array[java.lang.String] = null, whitelist: js.UndefOr[scala.Nothing] = js.undefined): csrfOptionsBlacklist = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (!js.isUndefined(whitelist)) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[csrfOptionsBlacklist]
  }
}

