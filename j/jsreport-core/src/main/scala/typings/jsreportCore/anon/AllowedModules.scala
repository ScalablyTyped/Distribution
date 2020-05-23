package typings.jsreportCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowedModules extends js.Object {
  var allowedModules: js.Array[String]
}

object AllowedModules {
  @scala.inline
  def apply(allowedModules: js.Array[String]): AllowedModules = {
    val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedModules]
  }
}

