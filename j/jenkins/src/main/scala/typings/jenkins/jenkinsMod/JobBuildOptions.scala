package typings.jenkins.jenkinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobBuildOptions extends js.Object {
  var name: String
  var parameters: js.UndefOr[js.Any] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object JobBuildOptions {
  @scala.inline
  def apply(name: String, parameters: js.Any = null, token: String = null): JobBuildOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[JobBuildOptions]
  }
}

