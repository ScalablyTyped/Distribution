package typings.lusca.mod

import typings.lusca.AnonOptions
import typings.lusca.luscaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsAngular extends csrfOptionsAngularOrNonAngular {
  var angular: `true`
  var cookie: js.UndefOr[String | AnonOptions] = js.undefined
}

object csrfOptionsAngular {
  @scala.inline
  def apply(angular: `true`, cookie: String | AnonOptions = null): csrfOptionsAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngular]
  }
}

