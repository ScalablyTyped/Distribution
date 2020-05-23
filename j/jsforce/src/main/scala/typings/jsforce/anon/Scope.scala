package typings.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Scope {
  @scala.inline
  def apply(scope: String = null, state: String = null): Scope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

