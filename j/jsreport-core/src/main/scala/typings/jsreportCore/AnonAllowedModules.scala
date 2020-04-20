package typings.jsreportCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedModules extends js.Object {
  var allowedModules: js.Array[String]
}

object AnonAllowedModules {
  @scala.inline
  def apply(allowedModules: js.Array[String]): AnonAllowedModules = {
    val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedModules]
  }
}

