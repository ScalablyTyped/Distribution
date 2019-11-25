package typings.lusca.luscaMod

import typings.lusca.Anon_Name
import typings.lusca.Anon_Options
import typings.lusca.luscaNumbers.`false`
import typings.lusca.luscaNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lusca.luscaMod.csrfOptionsAngular
  - typings.lusca.luscaMod.csrfOptionsNonAngular
*/
trait csrfOptionsAngularOrNonAngular extends js.Object

object csrfOptionsAngularOrNonAngular {
  @scala.inline
  def csrfOptionsAngular(angular: `true`, cookie: String | Anon_Options = null): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
  @scala.inline
  def csrfOptionsNonAngular(angular: `false` = null, cookie: String | Anon_Name = null): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal()
    if (angular != null) __obj.updateDynamic("angular")(angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
}

