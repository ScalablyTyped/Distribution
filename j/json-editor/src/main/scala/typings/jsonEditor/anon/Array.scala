package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var array: OptionsJSONEditorArrayOptions = js.native
  var `object`: Options = js.native
}

object Array {
  @scala.inline
  def apply(array: OptionsJSONEditorArrayOptions, `object`: Options): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
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
    def setArray(value: OptionsJSONEditorArrayOptions): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: Options): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

