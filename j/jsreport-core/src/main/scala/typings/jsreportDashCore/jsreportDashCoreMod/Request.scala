package typings.jsreportDashCore.jsreportDashCoreMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var data: js.Any
  var options: js.Object
  var template: Partial[Template]
}

object Request {
  @scala.inline
  def apply(data: js.Any, options: js.Object, template: Partial[Template]): Request = {
    val __obj = js.Dynamic.literal(data = data, options = options, template = template)
  
    __obj.asInstanceOf[Request]
  }
}

