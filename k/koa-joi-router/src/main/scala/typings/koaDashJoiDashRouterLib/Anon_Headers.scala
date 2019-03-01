package typings
package koaDashJoiDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers
  extends koaDashJoiDashRouterLib.koaDashJoiDashRouterMod.createRouterNs.OutputValidation {
  var headers: joiLib.joiMod.SchemaLike
}

object Anon_Headers {
  @scala.inline
  def apply(headers: joiLib.joiMod.SchemaLike): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Headers]
  }
}

