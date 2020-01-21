package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a Toast.
    * @default 0.8
    */
  var activationPercent: Double
  /**
    * Classes to be added to the toast element.
    */
  var classes: String
  /**
    * Length in ms the Toast stays before dismissal.
    * @default 4000
    */
  var displayLength: Double
  /**
    * The HTML content of the Toast.
    */
  var html: String
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double
  /**
    * Transition out duration in milliseconds.
    * @default 375
    */
  var outDuration: Double
  /**
    * Callback function called when toast is dismissed.
    */
  def completeCallback(): Unit
}

object ToastOptions {
  @scala.inline
  def apply(
    activationPercent: Double,
    classes: String,
    completeCallback: () => Unit,
    displayLength: Double,
    html: String,
    inDuration: Double,
    outDuration: Double
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(activationPercent = activationPercent.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], completeCallback = js.Any.fromFunction0(completeCallback), displayLength = displayLength.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToastOptions]
  }
}

