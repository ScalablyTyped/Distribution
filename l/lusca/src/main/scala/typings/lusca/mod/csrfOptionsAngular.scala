package typings.lusca.mod

import typings.lusca.anon.Options
import typings.lusca.luscaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsAngular extends csrfOptionsAngularOrNonAngular {
  var angular: `true`
  var cookie: js.UndefOr[String | Options] = js.undefined
}

object csrfOptionsAngular {
  @scala.inline
  def apply(angular: `true`, cookie: String | Options = null): csrfOptionsAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngular]
  }
}

