package typings.lusca.luscaMod

import typings.lusca.Anon_Name
import typings.lusca.luscaNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsNonAngular extends csrfOptionsAngularOrNonAngular {
  var angular: js.UndefOr[`false`] = js.undefined
  var cookie: js.UndefOr[String | Anon_Name] = js.undefined
}

object csrfOptionsNonAngular {
  @scala.inline
  def apply(angular: `false` = null, cookie: String | Anon_Name = null): csrfOptionsNonAngular = {
    val __obj = js.Dynamic.literal()
    if (angular != null) __obj.updateDynamic("angular")(angular)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsNonAngular]
  }
}

