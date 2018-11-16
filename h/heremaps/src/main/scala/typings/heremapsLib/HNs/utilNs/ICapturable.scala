package typings
package heremapsLib.HNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICapturable extends js.Object {
  /**
               * This method is used to capture the element view
               * @param canvas {HTMLCanvasElement} - HTML Canvas element to draw the view of the capturable element
               * @param pixelRation {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
               * @param callback {ICapturable~captureCallback} - Callback function to call once result of the capturing is ready
               * @param opt_errback {ICapturable~errorCallback} - Callback function to call if error occurred during capturing
               */
  def capture(
    canvas: stdLib.HTMLCanvasElement,
    pixelRation: scala.Double,
    callback: js.Function1[/* canvas */ js.UndefOr[stdLib.HTMLCanvasElement], scala.Unit]
  ): scala.Unit = js.native
  /**
               * This method is used to capture the element view
               * @param canvas {HTMLCanvasElement} - HTML Canvas element to draw the view of the capturable element
               * @param pixelRation {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
               * @param callback {ICapturable~captureCallback} - Callback function to call once result of the capturing is ready
               * @param opt_errback {ICapturable~errorCallback} - Callback function to call if error occurred during capturing
               */
  def capture(
    canvas: stdLib.HTMLCanvasElement,
    pixelRation: scala.Double,
    callback: js.Function1[/* canvas */ js.UndefOr[stdLib.HTMLCanvasElement], scala.Unit],
    opt_errback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

