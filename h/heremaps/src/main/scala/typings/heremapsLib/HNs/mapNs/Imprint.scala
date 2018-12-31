package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class encapsulates the brand, copyright and terms of use elements on the map.
  */
@JSGlobal("H.map.Imprint")
@js.native
class Imprint protected () extends js.Object {
  /**
    * Constructor
    * @param map {H.Map} - The map where the imprint is attached to
    * @param opt_options {H.map.Imprint.Options=} - The options to style the imprint
    */
  def this(map: heremapsLib.HNs.Map) = this()
  def this(map: heremapsLib.HNs.Map, opt_options: heremapsLib.HNs.mapNs.ImprintNs.Options) = this()
  /**
    * Method adds a callback which will be triggered when the object is disposed
    * @param callback {Function}
    * @param opt_scope {Object=}
    */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
  /**
    * This method is used to capture the element view
    * @param canvas {HTMLCanvasElement} - HTML Canvas element to draw the view of the capturable element
    * @param pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
    * @param callback {function(HTMLCanvasElement=)} - Callback function to call once result of the capturing is ready
    * @param opt_errback {function(string)=} - Callback function to call if error occurred during capturing
    */
  def capture(canvas: stdLib.HTMLCanvasElement, pixelRatio: scala.Double): scala.Unit = js.native
  def capture(
    canvas: stdLib.HTMLCanvasElement,
    pixelRatio: scala.Double,
    callback: js.Function1[/* canvas */ stdLib.HTMLCanvasElement, scala.Unit]
  ): scala.Unit = js.native
  def capture(
    canvas: stdLib.HTMLCanvasElement,
    pixelRatio: scala.Double,
    callback: js.Function1[/* canvas */ stdLib.HTMLCanvasElement, scala.Unit],
    opt_errback: js.Function1[/* s */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This method retrieves the copyright string for the current view of the map.
    * @returns {string} - The copyright string for the current map view
    */
  def getCopyrights(): java.lang.String = js.native
  /**
    * To get the CSS style declaration of the imprint DOM element
    * @returns {CSSStyleDeclaration}
    */
  def getStyle(): stdLib.CSSStyleDeclaration = js.native
  /**
    * To set the imprint options. If no opt_options argument is defined then all values are reset to their defaults.
    * @param opt_options {H.map.Imprint.Options=} - The options to style the imprint
    */
  def setOptions(): scala.Unit = js.native
  def setOptions(opt_options: heremapsLib.HNs.mapNs.ImprintNs.Options): scala.Unit = js.native
}

