package typings.jshamcrest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var scope: js.UndefOr[js.Object] = js.undefined
}

object Scope {
  @scala.inline
  def apply(scope: js.Object = null): Scope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

