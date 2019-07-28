package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scope extends js.Object {
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Anon_Scope {
  @scala.inline
  def apply(scope: String = null, state: String = null): Anon_Scope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Scope]
  }
}

