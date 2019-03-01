package typings
package jsreportDashCoreLib.jsreportDashCoreMod.JsReportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDefinition extends js.Object {
  var directory: java.lang.String
  var main: js.Any
  var options: js.Any
}

object ExtensionDefinition {
  @scala.inline
  def apply(directory: java.lang.String, main: js.Any, options: js.Any): ExtensionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directory")(directory)
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ExtensionDefinition]
  }
}

