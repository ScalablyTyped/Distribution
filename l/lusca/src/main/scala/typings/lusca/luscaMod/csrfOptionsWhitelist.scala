package typings.lusca.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsWhitelist extends csrfOptionsBlacklistOrWhitelist {
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object csrfOptionsWhitelist {
  @scala.inline
  def apply(whitelist: js.Array[String] = null): csrfOptionsWhitelist = {
    val __obj = js.Dynamic.literal()
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsWhitelist]
  }
}

