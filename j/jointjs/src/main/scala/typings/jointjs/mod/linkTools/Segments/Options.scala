package typings.jointjs.mod.linkTools.Segments

import typings.jointjs.mod.anchors.AnchorJSON
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.ToolView
import typings.jointjs.mod.g.Point
import typings.jointjs.mod.linkTools.AnchorCallback
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends typings.jointjs.mod.dia.ToolView.Options {
  
  var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.native
  
  var handleClass: js.UndefOr[js.Any] = js.native
  
  var redundancyRemoval: js.UndefOr[Boolean] = js.native
  
  var segmentLengthThreshold: js.UndefOr[Double] = js.native
  
  var snapHandle: js.UndefOr[Boolean] = js.native
  
  var snapRadius: js.UndefOr[Double] = js.native
  
  var stopPropagation: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnchor(
      value: (/* coords */ Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
    ): Self = this.set("anchor", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setHandleClass(value: js.Any): Self = this.set("handleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleClass: Self = this.set("handleClass", js.undefined)
    
    @scala.inline
    def setRedundancyRemoval(value: Boolean): Self = this.set("redundancyRemoval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedundancyRemoval: Self = this.set("redundancyRemoval", js.undefined)
    
    @scala.inline
    def setSegmentLengthThreshold(value: Double): Self = this.set("segmentLengthThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentLengthThreshold: Self = this.set("segmentLengthThreshold", js.undefined)
    
    @scala.inline
    def setSnapHandle(value: Boolean): Self = this.set("snapHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapHandle: Self = this.set("snapHandle", js.undefined)
    
    @scala.inline
    def setSnapRadius(value: Double): Self = this.set("snapRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapRadius: Self = this.set("snapRadius", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
  }
}
