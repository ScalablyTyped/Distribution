package typings.leafletPm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerGroup extends js.Object {
  var pm: typings.leafletPm.mod.PM.Edit.LayerGroup = js.native
}

object LayerGroup {
  @scala.inline
  def apply(pm: typings.leafletPm.mod.PM.Edit.LayerGroup): LayerGroup = {
    val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerGroup]
  }
  @scala.inline
  implicit class LayerGroupOps[Self <: LayerGroup] (val x: Self) extends AnyVal {
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
    def setPm(value: typings.leafletPm.mod.PM.Edit.LayerGroup): Self = this.set("pm", value.asInstanceOf[js.Any])
  }
  
}

