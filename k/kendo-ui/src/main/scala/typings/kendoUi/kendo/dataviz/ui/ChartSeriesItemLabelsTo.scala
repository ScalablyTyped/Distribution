package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemLabelsTo extends js.Object {
  
  var background: js.UndefOr[String | js.Function] = js.native
  
  var border: js.UndefOr[ChartSeriesItemLabelsToBorder] = js.native
  
  var color: js.UndefOr[String | js.Function] = js.native
  
  var font: js.UndefOr[String | js.Function] = js.native
  
  var format: js.UndefOr[String | js.Function] = js.native
  
  var margin: js.UndefOr[Double | ChartSeriesItemLabelsToMargin] = js.native
  
  var padding: js.UndefOr[Double | ChartSeriesItemLabelsToPadding] = js.native
  
  var position: js.UndefOr[String | js.Function] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var visible: js.UndefOr[Boolean | js.Function] = js.native
}
object ChartSeriesItemLabelsTo {
  
  @scala.inline
  def apply(): ChartSeriesItemLabelsTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemLabelsTo]
  }
  
  @scala.inline
  implicit class ChartSeriesItemLabelsToOps[Self <: ChartSeriesItemLabelsTo] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String | js.Function): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartSeriesItemLabelsToBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String | js.Function): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFont(value: String | js.Function): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFormat(value: String | js.Function): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartSeriesItemLabelsToMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | ChartSeriesItemLabelsToPadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPosition(value: String | js.Function): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean | js.Function): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
