package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var field: java.lang.String
  var text: java.lang.String
  var title: java.lang.String
  var value: js.Any
}

object Template {
  @scala.inline
  def apply(
    field: java.lang.String,
    text: java.lang.String,
    title: java.lang.String,
    value: js.Any,
    className: java.lang.String = null
  ): Template = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("value")(value)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[Template]
  }
}

