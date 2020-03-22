package typings.jsreportCore.mod

import typings.jsreportCore.PartialTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var data: js.Any
  var options: js.Object
  var template: PartialTemplate
}

object Request {
  @scala.inline
  def apply(data: js.Any, options: js.Object, template: PartialTemplate): Request = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

