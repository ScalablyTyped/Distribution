package typings.jointjs.mod.linkTools.Anchor

import typings.jointjs.mod.anchors.AnchorJSON
import typings.jointjs.mod.attributes.NativeSVGAttributes
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.dia.ToolView
import typings.jointjs.mod.linkTools.AnchorCallback
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.jointjs.mod.dia.ToolView.Options {
  var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.native
  var areaPadding: js.UndefOr[Double] = js.native
  var customAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.native
  var defaultAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.native
  var redundancyRemoval: js.UndefOr[Boolean] = js.native
  var resetAnchor: js.UndefOr[Boolean | AnchorJSON] = js.native
  var restrictArea: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[AnchorCallback[Point]] = js.native
  var snapRadius: js.UndefOr[Double] = js.native
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
      value: (/* coords */ typings.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
    ): Self = this.set("anchor", js.Any.fromFunction6(value))
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setAreaPadding(value: Double): Self = this.set("areaPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaPadding: Self = this.set("areaPadding", js.undefined)
    @scala.inline
    def setCustomAnchorAttributes(value: NativeSVGAttributes): Self = this.set("customAnchorAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAnchorAttributes: Self = this.set("customAnchorAttributes", js.undefined)
    @scala.inline
    def setDefaultAnchorAttributes(value: NativeSVGAttributes): Self = this.set("defaultAnchorAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAnchorAttributes: Self = this.set("defaultAnchorAttributes", js.undefined)
    @scala.inline
    def setRedundancyRemoval(value: Boolean): Self = this.set("redundancyRemoval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedundancyRemoval: Self = this.set("redundancyRemoval", js.undefined)
    @scala.inline
    def setResetAnchor(value: Boolean | AnchorJSON): Self = this.set("resetAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetAnchor: Self = this.set("resetAnchor", js.undefined)
    @scala.inline
    def setRestrictArea(value: Boolean): Self = this.set("restrictArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictArea: Self = this.set("restrictArea", js.undefined)
    @scala.inline
    def setSnap(
      value: (/* coords */ typings.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => Point
    ): Self = this.set("snap", js.Any.fromFunction6(value))
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnapRadius(value: Double): Self = this.set("snapRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapRadius: Self = this.set("snapRadius", js.undefined)
  }
  
}

