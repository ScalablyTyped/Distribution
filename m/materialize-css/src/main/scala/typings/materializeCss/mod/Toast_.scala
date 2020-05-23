package typings.materializeCss.mod

import typings.materializeCss.M.Toast
import typings.materializeCss.M.ToastOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Toast")
@js.native
class Toast_ () extends Toast {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: ToastOptions = js.native
  /**
    * Describes the current pan state of the Toast.
    */
  /* CompleteClass */
  override var panning: Boolean = js.native
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  /* CompleteClass */
  override var timeRemaining: Double = js.native
  /**
    * remove a specific toast
    */
  /* CompleteClass */
  override def dismiss(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Toast")
@js.native
object Toast_ extends js.Object {
  /**
    * dismiss all toasts
    */
  def dismissAll(): Unit = js.native
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Toast = js.native
}

