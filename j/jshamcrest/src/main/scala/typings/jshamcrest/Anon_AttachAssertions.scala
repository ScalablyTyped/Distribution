package typings.jshamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachAssertions extends js.Object {
  var attachAssertions: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
}

object Anon_AttachAssertions {
  @scala.inline
  def apply(attachAssertions: js.UndefOr[Boolean] = js.undefined, scope: js.Object = null): Anon_AttachAssertions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachAssertions)) __obj.updateDynamic("attachAssertions")(attachAssertions.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttachAssertions]
  }
}

