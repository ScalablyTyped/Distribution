package typings.jointjs.mod.anchors

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.linkAnchors.ConnectionClosestAnchorArguments
import typings.jointjs.mod.linkAnchors.ConnectionLengthAnchorArguments
import typings.jointjs.mod.linkAnchors.ConnectionPerpendicularAnchorArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var bottom: BBoxAnchorArguments = js.native
  var bottomLeft: BBoxAnchorArguments = js.native
  var bottomRight: BBoxAnchorArguments = js.native
  var center: BBoxAnchorArguments = js.native
  var connectionClosest: ConnectionClosestAnchorArguments = js.native
  var connectionLength: ConnectionLengthAnchorArguments = js.native
  var connectionPerpendicular: ConnectionPerpendicularAnchorArguments = js.native
  var connectionRatio: ConnectionLengthAnchorArguments = js.native
  var left: BBoxAnchorArguments = js.native
  var midSide: MidSideAnchorArguments = js.native
  var modelCenter: ModelCenterAnchorArguments = js.native
  var perpendicular: PaddingAnchorArguments = js.native
  var right: BBoxAnchorArguments = js.native
  var top: BBoxAnchorArguments = js.native
  var topLeft: BBoxAnchorArguments = js.native
  var topRight: BBoxAnchorArguments = js.native
}

object AnchorArgumentsMap {
  @scala.inline
  def apply(
    bottom: BBoxAnchorArguments,
    bottomLeft: BBoxAnchorArguments,
    bottomRight: BBoxAnchorArguments,
    center: BBoxAnchorArguments,
    connectionClosest: ConnectionClosestAnchorArguments,
    connectionLength: ConnectionLengthAnchorArguments,
    connectionPerpendicular: ConnectionPerpendicularAnchorArguments,
    connectionRatio: ConnectionLengthAnchorArguments,
    left: BBoxAnchorArguments,
    midSide: MidSideAnchorArguments,
    modelCenter: ModelCenterAnchorArguments,
    perpendicular: PaddingAnchorArguments,
    right: BBoxAnchorArguments,
    top: BBoxAnchorArguments,
    topLeft: BBoxAnchorArguments,
    topRight: BBoxAnchorArguments
  ): AnchorArgumentsMap = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], connectionClosest = connectionClosest.asInstanceOf[js.Any], connectionLength = connectionLength.asInstanceOf[js.Any], connectionPerpendicular = connectionPerpendicular.asInstanceOf[js.Any], connectionRatio = connectionRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], midSide = midSide.asInstanceOf[js.Any], modelCenter = modelCenter.asInstanceOf[js.Any], perpendicular = perpendicular.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorArgumentsMap]
  }
  @scala.inline
  implicit class AnchorArgumentsMapOps[Self <: AnchorArgumentsMap] (val x: Self) extends AnyVal {
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
    def setBottom(value: BBoxAnchorArguments): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomLeft(value: BBoxAnchorArguments): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomRight(value: BBoxAnchorArguments): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: BBoxAnchorArguments): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionClosest(value: ConnectionClosestAnchorArguments): Self = this.set("connectionClosest", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionLength(value: ConnectionLengthAnchorArguments): Self = this.set("connectionLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPerpendicular(value: ConnectionPerpendicularAnchorArguments): Self = this.set("connectionPerpendicular", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionRatio(value: ConnectionLengthAnchorArguments): Self = this.set("connectionRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: BBoxAnchorArguments): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setMidSide(value: MidSideAnchorArguments): Self = this.set("midSide", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelCenter(value: ModelCenterAnchorArguments): Self = this.set("modelCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerpendicular(value: PaddingAnchorArguments): Self = this.set("perpendicular", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: BBoxAnchorArguments): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: BBoxAnchorArguments): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: BBoxAnchorArguments): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopRight(value: BBoxAnchorArguments): Self = this.set("topRight", value.asInstanceOf[js.Any])
  }
  
}

