package typings.jqueryQrcode.JQueryQRCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Background color or image element, null for transparent background
    * @default null
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * Error correction level: 'L', 'M', 'Q' or 'H'
    * @default 'L'
    */
  var ecLevel: js.UndefOr[String] = js.undefined
  /**
    * Code color or image element
    * @default '#000'
    */
  var fill: js.UndefOr[String] = js.undefined
  /** @default '#000' */
  var fontcolor: js.UndefOr[String] = js.undefined
  /** @default 'sans' */
  var fontname: js.UndefOr[String] = js.undefined
  /** @default null */
  var image: js.UndefOr[String] = js.undefined
  /** @default 'no label' */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Left offset in pixels, if drawn onto existing canvas
    * @default 0
    */
  var left: js.UndefOr[Double] = js.undefined
  /** @default 0.5 */
  var mPosX: js.UndefOr[Double] = js.undefined
  /** @default 0.5 */
  var mPosY: js.UndefOr[Double] = js.undefined
  /** @default 0.1 */
  var mSize: js.UndefOr[Double] = js.undefined
  /**
    * End of version range, somewhere in 1 .. 40
    * @default 40
    */
  var maxVersion: js.UndefOr[Double] = js.undefined
  /**
    * Start of version range, somewhere in 1 .. 40
    * @default 1
    */
  var minVersion: js.UndefOr[Double] = js.undefined
  /**
    * Mode
    * @default Mode.NORMAL
    */
  var mode: js.UndefOr[Mode] = js.undefined
  /**
    * Quiet zone in modules
    * @default 0
    */
  var quiet: js.UndefOr[Double] = js.undefined
  /**
    * Corner radius relative to module width: 0.0 .. 0.5
    * @default 0
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * Render method: 'canvas', 'image' or 'div'
    * @default 'canvas'
    */
  var render: js.UndefOr[String] = js.undefined
  /**
    * Size in pixel
    * @default 200
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * The text content of the QR code.
    * @default 'no text'
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Top offset in pixels, if drawn onto existing canvas
    * @default 0
    */
  var top: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    background: String = null,
    ecLevel: String = null,
    fill: String = null,
    fontcolor: String = null,
    fontname: String = null,
    image: String = null,
    label: String = null,
    left: js.UndefOr[Double] = js.undefined,
    mPosX: js.UndefOr[Double] = js.undefined,
    mPosY: js.UndefOr[Double] = js.undefined,
    mSize: js.UndefOr[Double] = js.undefined,
    maxVersion: js.UndefOr[Double] = js.undefined,
    minVersion: js.UndefOr[Double] = js.undefined,
    mode: Mode = null,
    quiet: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    render: String = null,
    size: js.UndefOr[Double] = js.undefined,
    text: String = null,
    top: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (ecLevel != null) __obj.updateDynamic("ecLevel")(ecLevel.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fontcolor != null) __obj.updateDynamic("fontcolor")(fontcolor.asInstanceOf[js.Any])
    if (fontname != null) __obj.updateDynamic("fontname")(fontname.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mPosX)) __obj.updateDynamic("mPosX")(mPosX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mPosY)) __obj.updateDynamic("mPosY")(mPosY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mSize)) __obj.updateDynamic("mSize")(mSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxVersion)) __obj.updateDynamic("maxVersion")(maxVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVersion)) __obj.updateDynamic("minVersion")(minVersion.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

