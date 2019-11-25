package typings.iotaDotLibDotJs

import typings.iotaDotLibDotJs.iotaDotLibDotJsMod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSecurity extends js.Object {
  var end: Double
  var security: js.UndefOr[Security] = js.undefined
  var start: Double
}

object Anon_EndSecurity {
  @scala.inline
  def apply(end: Double, start: Double, security: Security = null): Anon_EndSecurity = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndSecurity]
  }
}

