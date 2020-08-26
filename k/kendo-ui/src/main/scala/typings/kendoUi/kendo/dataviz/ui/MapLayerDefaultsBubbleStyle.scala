package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerDefaultsBubbleStyle extends js.Object {
  var fill: js.UndefOr[MapLayerDefaultsBubbleStyleFill] = js.native
  var stroke: js.UndefOr[MapLayerDefaultsBubbleStyleStroke] = js.native
}

object MapLayerDefaultsBubbleStyle {
  @scala.inline
  def apply(): MapLayerDefaultsBubbleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsBubbleStyle]
  }
  @scala.inline
  implicit class MapLayerDefaultsBubbleStyleOps[Self <: MapLayerDefaultsBubbleStyle] (val x: Self) extends AnyVal {
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
    def setFill(value: MapLayerDefaultsBubbleStyleFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setStroke(value: MapLayerDefaultsBubbleStyleStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
  
}

