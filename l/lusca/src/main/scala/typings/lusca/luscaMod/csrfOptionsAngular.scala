package typings.lusca.luscaMod

import typings.lusca.Anon_Options
import typings.lusca.luscaNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsAngular extends csrfOptionsAngularOrNonAngular {
  var angular: `true`
  var cookie: js.UndefOr[String | Anon_Options] = js.undefined
}

object csrfOptionsAngular {
  @scala.inline
  def apply(angular: `true`, cookie: String | Anon_Options = null): csrfOptionsAngular = {
    val __obj = js.Dynamic.literal(angular = angular)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngular]
  }
}

