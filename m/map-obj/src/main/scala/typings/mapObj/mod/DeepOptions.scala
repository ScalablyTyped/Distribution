package typings.mapObj.mod

import typings.mapObj.mapObjBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepOptions extends Options {
  @JSName("deep")
  var deep_DeepOptions: `true` = js.native
}

object DeepOptions {
  @scala.inline
  def apply(deep: `true`): DeepOptions = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepOptions]
  }
  @scala.inline
  implicit class DeepOptionsOps[Self <: DeepOptions] (val x: Self) extends AnyVal {
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
    def setDeep(value: `true`): Self = this.set("deep", value.asInstanceOf[js.Any])
  }
  
}

