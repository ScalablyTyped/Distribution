package typings.jsoneditor.jsoneditorMod

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
    val __obj = js.Dynamic.literal(field = field, text = text, title = title, value = value)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[Template]
  }
}

