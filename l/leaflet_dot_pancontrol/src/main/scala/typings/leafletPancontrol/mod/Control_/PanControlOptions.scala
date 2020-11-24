package typings.leafletPancontrol.mod.Control_

import typings.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanControlOptions extends ControlOptions {
  
  var panOffset: js.UndefOr[Double] = js.native
}
object PanControlOptions {
  
  @scala.inline
  def apply(): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanControlOptions]
  }
  
  @scala.inline
  implicit class PanControlOptionsOps[Self <: PanControlOptions] (val x: Self) extends AnyVal {
    
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
    def setPanOffset(value: Double): Self = this.set("panOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanOffset: Self = this.set("panOffset", js.undefined)
  }
}
