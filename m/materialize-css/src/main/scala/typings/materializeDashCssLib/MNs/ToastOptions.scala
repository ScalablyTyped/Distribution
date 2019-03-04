package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a Toast.
    * @default 0.8
    */
  var activationPercent: scala.Double
  /**
    * Classes to be added to the toast element.
    */
  var classes: java.lang.String
  /**
    * Length in ms the Toast stays before dismissal.
    * @default 4000
    */
  var displayLength: scala.Double
  /**
    * The HTML content of the Toast.
    */
  var html: java.lang.String
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: scala.Double
  /**
    * Transition out duration in milliseconds.
    * @default 375
    */
  var outDuration: scala.Double
  /**
    * Callback function called when toast is dismissed.
    */
  def completeCallback(): scala.Unit
}

object ToastOptions {
  @scala.inline
  def apply(
    activationPercent: scala.Double,
    classes: java.lang.String,
    completeCallback: js.Function0[scala.Unit],
    displayLength: scala.Double,
    html: java.lang.String,
    inDuration: scala.Double,
    outDuration: scala.Double
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(activationPercent = activationPercent, classes = classes, completeCallback = completeCallback, displayLength = displayLength, html = html, inDuration = inDuration, outDuration = outDuration)
  
    __obj.asInstanceOf[ToastOptions]
  }
}

