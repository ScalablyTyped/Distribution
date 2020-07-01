package typings.materializeCss.global.M

import typings.materializeCss.M.Toast
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Toast")
@js.native
class Toast_ () extends Toast {
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
@JSGlobal("M.Toast")
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

