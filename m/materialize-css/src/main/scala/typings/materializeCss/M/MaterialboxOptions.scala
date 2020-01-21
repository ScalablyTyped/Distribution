package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialboxOptions extends js.Object {
  /**
    * Transition in duration in milliseconds
    * @default 275
    */
  var inDuration: Double
  /**
    * Transition out duration in milliseconds
    * @default 200
    */
  var outDuration: Double
  /**
    * Callback function called after materialbox is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  /**
    * Callback function called before materialbox is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit
  /**
    * Callback function called after materialbox is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  /**
    * Callback function called before materialbox is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit
}

object MaterialboxOptions {
  @scala.inline
  def apply(
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): MaterialboxOptions = {
    val __obj = js.Dynamic.literal(inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaterialboxOptions]
  }
}

