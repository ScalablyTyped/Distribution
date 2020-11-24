package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxisDefaultsLabelsRotation extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var angle: js.UndefOr[Double | String] = js.native
}
object ChartAxisDefaultsLabelsRotation {
  
  @scala.inline
  def apply(): ChartAxisDefaultsLabelsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisDefaultsLabelsRotation]
  }
  
  @scala.inline
  implicit class ChartAxisDefaultsLabelsRotationOps[Self <: ChartAxisDefaultsLabelsRotation] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAngle(value: Double | String): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
  }
}
