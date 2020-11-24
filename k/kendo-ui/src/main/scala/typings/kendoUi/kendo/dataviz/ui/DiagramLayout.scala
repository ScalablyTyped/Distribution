package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramLayout extends js.Object {
  
  var endRadialAngle: js.UndefOr[Double] = js.native
  
  var grid: js.UndefOr[DiagramLayoutGrid] = js.native
  
  var horizontalSeparation: js.UndefOr[Double] = js.native
  
  var iterations: js.UndefOr[Double] = js.native
  
  var layerSeparation: js.UndefOr[Double] = js.native
  
  var nodeDistance: js.UndefOr[Double] = js.native
  
  var radialFirstLevelSeparation: js.UndefOr[Double] = js.native
  
  var radialSeparation: js.UndefOr[Double] = js.native
  
  var startRadialAngle: js.UndefOr[Double] = js.native
  
  var subtype: js.UndefOr[String] = js.native
  
  var tipOverTreeStartLevel: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var underneathHorizontalOffset: js.UndefOr[Double] = js.native
  
  var underneathVerticalSeparation: js.UndefOr[Double] = js.native
  
  var underneathVerticalTopOffset: js.UndefOr[Double] = js.native
  
  var verticalSeparation: js.UndefOr[Double] = js.native
}
object DiagramLayout {
  
  @scala.inline
  def apply(): DiagramLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramLayout]
  }
  
  @scala.inline
  implicit class DiagramLayoutOps[Self <: DiagramLayout] (val x: Self) extends AnyVal {
    
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
    def setEndRadialAngle(value: Double): Self = this.set("endRadialAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndRadialAngle: Self = this.set("endRadialAngle", js.undefined)
    
    @scala.inline
    def setGrid(value: DiagramLayoutGrid): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setHorizontalSeparation(value: Double): Self = this.set("horizontalSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalSeparation: Self = this.set("horizontalSeparation", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setLayerSeparation(value: Double): Self = this.set("layerSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerSeparation: Self = this.set("layerSeparation", js.undefined)
    
    @scala.inline
    def setNodeDistance(value: Double): Self = this.set("nodeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeDistance: Self = this.set("nodeDistance", js.undefined)
    
    @scala.inline
    def setRadialFirstLevelSeparation(value: Double): Self = this.set("radialFirstLevelSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadialFirstLevelSeparation: Self = this.set("radialFirstLevelSeparation", js.undefined)
    
    @scala.inline
    def setRadialSeparation(value: Double): Self = this.set("radialSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadialSeparation: Self = this.set("radialSeparation", js.undefined)
    
    @scala.inline
    def setStartRadialAngle(value: Double): Self = this.set("startRadialAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRadialAngle: Self = this.set("startRadialAngle", js.undefined)
    
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    
    @scala.inline
    def setTipOverTreeStartLevel(value: Double): Self = this.set("tipOverTreeStartLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipOverTreeStartLevel: Self = this.set("tipOverTreeStartLevel", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderneathHorizontalOffset(value: Double): Self = this.set("underneathHorizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderneathHorizontalOffset: Self = this.set("underneathHorizontalOffset", js.undefined)
    
    @scala.inline
    def setUnderneathVerticalSeparation(value: Double): Self = this.set("underneathVerticalSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderneathVerticalSeparation: Self = this.set("underneathVerticalSeparation", js.undefined)
    
    @scala.inline
    def setUnderneathVerticalTopOffset(value: Double): Self = this.set("underneathVerticalTopOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderneathVerticalTopOffset: Self = this.set("underneathVerticalTopOffset", js.undefined)
    
    @scala.inline
    def setVerticalSeparation(value: Double): Self = this.set("verticalSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalSeparation: Self = this.set("verticalSeparation", js.undefined)
  }
}
