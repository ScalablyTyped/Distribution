package typings.heremaps.H.map.SpatialStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a style. If a property is not set, the default value from H.map.SpatialStyle is taken.
  * @property strokeColor {string=} - The color of the stroke in CSS syntax.
  * @property fillColor {string=} - The color of the stroke in CSS syntax.
  * @property lineWidth {number=} - The width of the line in pixels, default is 2. The maximum supported line width is 100.
  * @property lineCap {H.map.SpatialStyle.LineCap=} - The style of the end caps for a line.
  * @property lineJoin {H.map.SpatialStyle.LineJoin=} - The type of corner created, when two lines meet.
  * @property miterLimit {number=} - The miter limit in pixel, default is 10. The maximum supported miter limit is 100
  * @property lineDash {Array<number>} - The line dash pattern as an even numbered list of distances to alternately produce a line and a space. If the browser doesn't support this feature
  * this style property is ignored.
  * @property lineDashOffset {number=} - The phase offset of the line dash pattern
  */
trait Options extends js.Object {
  var fillColor: js.UndefOr[String] = js.undefined
  var lineCap: js.UndefOr[LineCap] = js.undefined
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[LineJoin] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fillColor: String = null,
    lineCap: LineCap = null,
    lineDash: js.Array[Double] = null,
    lineDashOffset: Int | Double = null,
    lineJoin: LineJoin = null,
    lineWidth: Int | Double = null,
    miterLimit: Int | Double = null,
    strokeColor: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash.asInstanceOf[js.Any])
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

