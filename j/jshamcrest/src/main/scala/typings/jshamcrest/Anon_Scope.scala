package typings.jshamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scope extends js.Object {
  var scope: js.UndefOr[js.Object] = js.undefined
}

object Anon_Scope {
  @scala.inline
  def apply(scope: js.Object = null): Anon_Scope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scope]
  }
}

