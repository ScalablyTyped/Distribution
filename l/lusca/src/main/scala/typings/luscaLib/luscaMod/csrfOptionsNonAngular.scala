package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsNonAngular extends csrfOptionsAngularOrNonAngular {
  var angular: js.UndefOr[luscaLib.luscaLibNumbers.`false`] = js.undefined
  var cookie: js.UndefOr[java.lang.String | luscaLib.Anon_Name] = js.undefined
}

object csrfOptionsNonAngular {
  @scala.inline
  def apply(
    angular: luscaLib.luscaLibNumbers.`false` = null,
    cookie: java.lang.String | luscaLib.Anon_Name = null
  ): csrfOptionsNonAngular = {
    val __obj = js.Dynamic.literal()
    if (angular != null) __obj.updateDynamic("angular")(angular)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsNonAngular]
  }
}

