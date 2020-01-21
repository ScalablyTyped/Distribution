package typings.jshamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScope extends js.Object {
  var scope: js.UndefOr[js.Object] = js.undefined
}

object AnonScope {
  @scala.inline
  def apply(scope: js.Object = null): AnonScope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScope]
  }
}

