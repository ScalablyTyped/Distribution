package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart3dFrameOptions extends js.Object {
  /**
    * (Highcharts) The back side of the frame around a 3D chart.
    */
  var back: js.UndefOr[Chart3dFrameBackOptions] = js.undefined
  /**
    * (Highcharts) The bottom of the frame around a 3D chart.
    */
  var bottom: js.UndefOr[Chart3dFrameBottomOptions] = js.undefined
  /**
    * (Highcharts) The front of the frame around a 3D chart.
    */
  var front: js.UndefOr[Chart3dFrameFrontOptions] = js.undefined
  /**
    * (Highcharts) The left side of the frame around a 3D chart.
    */
  var left: js.UndefOr[Chart3dFrameLeftOptions] = js.undefined
  /**
    * (Highcharts) The right of the frame around a 3D chart.
    */
  var right: js.UndefOr[Chart3dFrameRightOptions] = js.undefined
  /**
    * (Highcharts) General pixel thickness for the frame faces.
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The top of the frame around a 3D chart.
    */
  var top: js.UndefOr[Chart3dFrameTopOptions] = js.undefined
  /**
    * (Highcharts) Whether the frames are visible.
    */
  var visible: js.UndefOr[String] = js.undefined
}

object Chart3dFrameOptions {
  @scala.inline
  def apply(
    back: Chart3dFrameBackOptions = null,
    bottom: Chart3dFrameBottomOptions = null,
    front: Chart3dFrameFrontOptions = null,
    left: Chart3dFrameLeftOptions = null,
    right: Chart3dFrameRightOptions = null,
    size: Int | Double = null,
    top: Chart3dFrameTopOptions = null,
    visible: String = null
  ): Chart3dFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (front != null) __obj.updateDynamic("front")(front)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top)
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Chart3dFrameOptions]
  }
}

