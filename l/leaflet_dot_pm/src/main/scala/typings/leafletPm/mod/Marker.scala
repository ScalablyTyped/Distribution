package typings.leafletPm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker extends js.Object {
  
  var pm: typings.leafletPm.mod.PM.Edit.Marker = js.native
}
object Marker {
  
  @scala.inline
  def apply(pm: typings.leafletPm.mod.PM.Edit.Marker): Marker = {
    val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  
  @scala.inline
  implicit class MarkerOps[Self <: Marker] (val x: Self) extends AnyVal {
    
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
    def setPm(value: typings.leafletPm.mod.PM.Edit.Marker): Self = this.set("pm", value.asInstanceOf[js.Any])
  }
}
