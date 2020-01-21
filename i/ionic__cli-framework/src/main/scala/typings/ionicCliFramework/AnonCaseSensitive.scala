package typings.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
}

object AnonCaseSensitive {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[Boolean] = js.undefined): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitive]
  }
}

