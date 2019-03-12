package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorShowDropDownListParams extends js.Object {
  var node: JSONEditorNode
  var optionClassName: java.lang.String
  var optionSelectedClassName: java.lang.String
  var value: java.lang.String
  var values: js.Array[js.Object]
  var x: scala.Double
  var y: scala.Double
  def callback(value: js.Any): scala.Unit
}

object JSONEditorShowDropDownListParams {
  @scala.inline
  def apply(
    callback: js.Any => scala.Unit,
    node: JSONEditorNode,
    optionClassName: java.lang.String,
    optionSelectedClassName: java.lang.String,
    value: java.lang.String,
    values: js.Array[js.Object],
    x: scala.Double,
    y: scala.Double
  ): JSONEditorShowDropDownListParams = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), node = node, optionClassName = optionClassName, optionSelectedClassName = optionSelectedClassName, value = value, values = values, x = x, y = y)
  
    __obj.asInstanceOf[JSONEditorShowDropDownListParams]
  }
}

