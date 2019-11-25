package typings.jsreportDashCore.jsreportDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDefinition extends js.Object {
  var directory: String
  var main: js.Any
  var options: js.Any
}

object ExtensionDefinition {
  @scala.inline
  def apply(directory: String, main: js.Any, options: js.Any): ExtensionDefinition = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionDefinition]
  }
}

