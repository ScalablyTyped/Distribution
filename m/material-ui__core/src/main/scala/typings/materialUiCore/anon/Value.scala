package typings.materialUiCore.anon

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var node: HTMLInputElement = js.native
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean]) = js.native
}

object Value {
  @scala.inline
  def apply(node: HTMLInputElement, value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Value = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setNode(value: HTMLInputElement): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: (String | Double | Boolean)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

