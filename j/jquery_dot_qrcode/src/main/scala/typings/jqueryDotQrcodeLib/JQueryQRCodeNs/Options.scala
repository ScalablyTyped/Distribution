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

