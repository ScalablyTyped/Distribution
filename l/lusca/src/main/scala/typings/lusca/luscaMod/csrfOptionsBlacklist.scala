package typings.lusca.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsBlacklist extends csrfOptionsBlacklistOrWhitelist {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
}

object csrfOptionsBlacklist {
  @scala.inline
  def apply(blacklist: js.Array[String] = null): csrfOptionsBlacklist = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    __obj.asInstanceOf[csrfOptionsBlacklist]
  }
}

