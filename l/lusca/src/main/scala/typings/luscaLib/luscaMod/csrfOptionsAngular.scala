package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsAngular extends csrfOptionsAngularOrNonAngular {
  var angular: luscaLib.luscaLibNumbers.`true`
  var cookie: js.UndefOr[java.lang.String | luscaLib.Anon_Options] = js.undefined
}

object csrfOptionsAngular {
  @scala.inline
  def apply(angular: luscaLib.luscaLibNumbers.`true`, cookie: java.lang.String | luscaLib.Anon_Options = null): csrfOptionsAngular = {
    val __obj = js.Dynamic.literal(angular = angular)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngular]
  }
}

