package typings.jshamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachAssertions extends js.Object {
  var attachAssertions: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
}

object AnonAttachAssertions {
  @scala.inline
  def apply(attachAssertions: js.UndefOr[Boolean] = js.undefined, scope: js.Object = null): AnonAttachAssertions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachAssertions)) __obj.updateDynamic("attachAssertions")(attachAssertions.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachAssertions]
  }
}

