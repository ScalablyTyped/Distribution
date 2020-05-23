package typings.lusca.mod

import typings.lusca.anon.Name
import typings.lusca.anon.Options
import typings.lusca.luscaBooleans.`false`
import typings.lusca.luscaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lusca.mod.csrfOptionsAngular
  - typings.lusca.mod.csrfOptionsNonAngular
*/
trait csrfOptionsAngularOrNonAngular extends js.Object

object csrfOptionsAngularOrNonAngular {
  @scala.inline
  def csrfOptionsAngular(angular: `true`, cookie: String | Options = null): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
  @scala.inline
  def csrfOptionsNonAngular(angular: `false` = null, cookie: String | Name = null): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal()
    if (angular != null) __obj.updateDynamic("angular")(angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
}

