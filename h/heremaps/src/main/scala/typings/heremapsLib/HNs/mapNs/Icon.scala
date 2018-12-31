package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A visual representation of the H.map.Marker.
  */
@JSGlobal("H.map.Icon")
@js.native
class Icon protected () extends js.Object {
  /**
    * Constructor
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @param opt_options {H.map.Icon.Options=}
    */
  def this(bitmap: java.lang.String) = this()
  def this(bitmap: stdLib.HTMLCanvasElement) = this()
  def this(bitmap: stdLib.HTMLImageElement) = this()
  def this(bitmap: java.lang.String, opt_options: heremapsLib.HNs.mapNs.IconNs.Options) = this()
  def this(bitmap: stdLib.HTMLCanvasElement, opt_options: heremapsLib.HNs.mapNs.IconNs.Options) = this()
  def this(bitmap: stdLib.HTMLImageElement, opt_options: heremapsLib.HNs.mapNs.IconNs.Options) = this()
  /**
    * This method allows to listen for specific event triggered by the object. Keep in mind, that you must removeEventListener manually or dispose an object when you no longer need it.
    * Otherwise memory leak is possible.
    * @param type {string} - name of event
    * @param handler {Function} - event handler function
    * @param opt_capture {boolean=} - if set to true will listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - scope for the handler function
    */
  def addEventListener(`type`: java.lang.String, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, handler: js.Function0[scala.Unit], opt_capture: scala.Boolean): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    handler: js.Function0[scala.Unit],
    opt_capture: scala.Boolean,
    opt_scope: js.Object
  ): scala.Unit = js.native
  /**
    * This method adds callback which is triggered when the object is being disposed
    * @param callback {Function} - The callback function.
    * @param opt_scope {Object=} - An optional scope to call the callback in.
    */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
  /**
    * This method will dispatch event on the event target object
    * @param evt {(H.util.Event | string)} - event object or event name
    */
  def dispatchEvent(evt: heremapsLib.HNs.utilNs.Event): scala.Unit = js.native
  def dispatchEvent(evt: java.lang.String): scala.Unit = js.native
  /**
    * Removes listeners from this object. Classes that extend EventTarget may need to override this method in order to remove references to DOM Elements and additional listeners.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Returns the anchor point of this icon or null if an anchor wasn't specified in the constructor's options and the state of this icon is not H.map.Icon.prototype.State.READY.
    * @returns {?H.math.Point}
    */
  def getAnchor(): heremapsLib.HNs.mathNs.Point = js.native
  /**
    * Returns the bitmap of this icon or null if the bitmap is not ready yet (see H.map.Icon#getState)
    * @returns {?(HTMLImageElement | HTMLCanvasElement)}
    */
  def getBitmap(): stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
  /**
    * Returns the hit area of the icon.
    * @returns {?H.map.HitArea} - icon's anchor point
    */
  def getHitArea(): HitArea = js.native
  /**
    * Returns the size of this icon or null if a size wasn't specified in the constructor's options and the state of this icon is not H.map.Icon.prototype.State.READY
    * @returns {?H.math.Size}
    */
  def getSize(): heremapsLib.HNs.mathNs.Size = js.native
  /**
    * Returns the icon's bitmap loading state
    * @returns {H.map.Icon.prototype.State}
    */
  def getState(): heremapsLib.HNs.mapNs.IconNs.State = js.native
  /**
    * This method will removed previously added listener from the event target
    * @param type {string} - name of event
    * @param handler {Function} - previously added event handler
    * @param opt_capture {boolean=} - if set to true will listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - scope for the handler function
    */
  def removeEventListener(`type`: java.lang.String, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, handler: js.Function0[scala.Unit], opt_capture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    handler: js.Function0[scala.Unit],
    opt_capture: scala.Boolean,
    opt_scope: js.Object
  ): scala.Unit = js.native
}

