package typings
package jshamcrestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachAssertions extends js.Object {
  var attachAssertions: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
}

object Anon_AttachAssertions {
  @scala.inline
  def apply(attachAssertions: js.UndefOr[scala.Boolean] = js.undefined, scope: js.Object = null): Anon_AttachAssertions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachAssertions)) __obj.updateDynamic("attachAssertions")(attachAssertions)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_AttachAssertions]
  }
}

