package typings
package jenkinsLib.jenkinsMod.createNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobBuildOptions extends js.Object {
  var name: java.lang.String
  var parameters: js.UndefOr[js.Any] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object JobBuildOptions {
  @scala.inline
  def apply(name: java.lang.String, parameters: js.Any = null, token: java.lang.String = null): JobBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[JobBuildOptions]
  }
}

