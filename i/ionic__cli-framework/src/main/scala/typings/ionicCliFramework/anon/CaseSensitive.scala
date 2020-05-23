package typings.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
}

object CaseSensitive {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[Boolean] = js.undefined): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
}

