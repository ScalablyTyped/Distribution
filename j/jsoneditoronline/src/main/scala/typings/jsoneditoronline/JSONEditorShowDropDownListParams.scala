package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorShowDropDownListParams extends js.Object {
  var node: JSONEditorNode = js.native
  var optionClassName: String = js.native
  var optionSelectedClassName: String = js.native
  var value: String = js.native
  var values: js.Array[js.Object] = js.native
  var x: Double = js.native
  var y: Double = js.native
  def callback(value: js.Any): Unit = js.native
}

object JSONEditorShowDropDownListParams {
  @scala.inline
  def apply(
    callback: js.Any => Unit,
    node: JSONEditorNode,
    optionClassName: String,
    optionSelectedClassName: String,
    value: String,
    values: js.Array[js.Object],
    x: Double,
    y: Double
  ): JSONEditorShowDropDownListParams = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), node = node.asInstanceOf[js.Any], optionClassName = optionClassName.asInstanceOf[js.Any], optionSelectedClassName = optionSelectedClassName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorShowDropDownListParams]
  }
  @scala.inline
  implicit class JSONEditorShowDropDownListParamsOps[Self <: JSONEditorShowDropDownListParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallback(value: js.Any => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setNode(value: JSONEditorNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionClassName(value: String): Self = this.set("optionClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionSelectedClassName(value: String): Self = this.set("optionSelectedClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: js.Object*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[js.Object]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

