package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var field: String
  var text: String
  var title: String
  var value: js.Any
}

object Template {
  @scala.inline
  def apply(field: String, text: String, title: String, value: js.Any, className: String = null): Template = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

