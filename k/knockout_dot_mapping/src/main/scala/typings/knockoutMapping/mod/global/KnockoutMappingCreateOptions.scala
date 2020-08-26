package typings.knockoutMapping.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutMappingCreateOptions extends js.Object {
  var data: js.Any = js.native
  var parent: js.Any = js.native
}

object KnockoutMappingCreateOptions {
  @scala.inline
  def apply(data: js.Any, parent: js.Any): KnockoutMappingCreateOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutMappingCreateOptions]
  }
  @scala.inline
  implicit class KnockoutMappingCreateOptionsOps[Self <: KnockoutMappingCreateOptions] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

