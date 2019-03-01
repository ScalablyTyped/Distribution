package typings
package jqueryDotQrcodeLib.JQueryQRCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Background color or image element, null for transparent background
    * @default null
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Error correction level: 'L', 'M', 'Q' or 'H'
    * @default 'L'
    */
  var ecLevel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Code color or image element
    * @default '#000'
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** @default '#000' */
  var fontcolor: js.UndefOr[java.lang.String] = js.undefined
  /** @default 'sans' */
  var fontname: js.UndefOr[java.lang.String] = js.undefined
  /** @default null */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /** @default 'no label' */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Left offset in pixels, if drawn onto existing canvas
    * @default 0
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** @default 0.5 */
  var mPosX: js.UndefOr[scala.Double] = js.undefined
  /** @default 0.5 */
  var mPosY: js.UndefOr[scala.Double] = js.undefined
  /** @default 0.1 */
  var mSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * End of version range, somewhere in 1 .. 40
    * @default 40
    */
  var maxVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * Start of version range, somewhere in 1 .. 40
    * @default 1
    */
  var minVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * Mode
    * @default Mode.NORMAL
    */
  var mode: js.UndefOr[Mode] = js.undefined
  /**
    * Quiet zone in modules
    * @default 0
    */
  var quiet: js.UndefOr[scala.Double] = js.undefined
  /**
    * Corner radius relative to module width: 0.0 .. 0.5
    * @default 0
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Render method: 'canvas', 'image' or 'div'
    * @default 'canvas'
    */
  var render: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Size in pixel
    * @default 200
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * The text content of the QR code.
    * @default 'no text'
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Top offset in pixels, if drawn onto existing canvas
    * @default 0
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    ecLevel: java.lang.String = null,
    fill: java.lang.String = null,
    fontcolor: java.lang.String = null,
    fontname: java.lang.String = null,
    image: java.lang.String = null,
    label: java.lang.String = null,
    left: scala.Int | scala.Double = null,
    mPosX: scala.Int | scala.Double = null,
    mPosY: scala.Int | scala.Double = null,
    mSize: scala.Int | scala.Double = null,
    maxVersion: scala.Int | scala.Double = null,
    minVersion: scala.Int | scala.Double = null,
    mode: Mode = null,
    quiet: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    render: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    top: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (ecLevel != null) __obj.updateDynamic("ecLevel")(ecLevel)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fontcolor != null) __obj.updateDynamic("fontcolor")(fontcolor)
    if (fontname != null) __obj.updateDynamic("fontname")(fontname)
    if (image != null) __obj.updateDynamic("image")(image)
    if (label != null) __obj.updateDynamic("label")(label)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (mPosX != null) __obj.updateDynamic("mPosX")(mPosX.asInstanceOf[js.Any])
    if (mPosY != null) __obj.updateDynamic("mPosY")(mPosY.asInstanceOf[js.Any])
    if (mSize != null) __obj.updateDynamic("mSize")(mSize.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (quiet != null) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

