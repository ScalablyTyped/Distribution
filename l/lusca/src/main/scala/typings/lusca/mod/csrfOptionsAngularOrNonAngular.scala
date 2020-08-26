package typings.lusca.mod

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
  def csrfOptionsAngular(angular: `true`): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
  @scala.inline
  def csrfOptionsNonAngular(): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
}

