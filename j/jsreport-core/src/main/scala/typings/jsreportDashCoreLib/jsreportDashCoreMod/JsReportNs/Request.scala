package typings
package jsreportDashCoreLib.jsreportDashCoreMod.JsReportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var data: js.Any
  var options: js.Object
  var template: stdLib.Partial[Template]
}

object Request {
  @scala.inline
  def apply(data: js.Any, options: js.Object, template: stdLib.Partial[Template]): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Request]
  }
}

