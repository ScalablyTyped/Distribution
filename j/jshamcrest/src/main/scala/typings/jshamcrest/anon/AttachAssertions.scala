package typings.jshamcrest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachAssertions extends js.Object {
  var attachAssertions: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
}

object AttachAssertions {
  @scala.inline
  def apply(attachAssertions: js.UndefOr[Boolean] = js.undefined, scope: js.Object = null): AttachAssertions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachAssertions)) __obj.updateDynamic("attachAssertions")(attachAssertions.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachAssertions]
  }
}

