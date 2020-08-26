package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart3dFrameOptions extends js.Object {
  /**
    * (Highcharts) The back side of the frame around a 3D chart.
    */
  var back: js.UndefOr[Chart3dFrameBackOptions] = js.native
  /**
    * (Highcharts) The bottom of the frame around a 3D chart.
    */
  var bottom: js.UndefOr[Chart3dFrameBottomOptions] = js.native
  /**
    * (Highcharts) The front of the frame around a 3D chart.
    */
  var front: js.UndefOr[Chart3dFrameFrontOptions] = js.native
  /**
    * (Highcharts) The left side of the frame around a 3D chart.
    */
  var left: js.UndefOr[Chart3dFrameLeftOptions] = js.native
  /**
    * (Highcharts) The right of the frame around a 3D chart.
    */
  var right: js.UndefOr[Chart3dFrameRightOptions] = js.native
  /**
    * (Highcharts) General pixel thickness for the frame faces.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The top of the frame around a 3D chart.
    */
  var top: js.UndefOr[Chart3dFrameTopOptions] = js.native
  /**
    * (Highcharts) Whether the frames are visible.
    */
  var visible: js.UndefOr[String] = js.native
}

object Chart3dFrameOptions {
  @scala.inline
  def apply(): Chart3dFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dFrameOptions]
  }
  @scala.inline
  implicit class Chart3dFrameOptionsOps[Self <: Chart3dFrameOptions] (val x: Self) extends AnyVal {
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
    def setBack(value: Chart3dFrameBackOptions): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    @scala.inline
    def setBottom(value: Chart3dFrameBottomOptions): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setFront(value: Chart3dFrameFrontOptions): Self = this.set("front", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFront: Self = this.set("front", js.undefined)
    @scala.inline
    def setLeft(value: Chart3dFrameLeftOptions): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Chart3dFrameRightOptions): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTop(value: Chart3dFrameTopOptions): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

