package typings.materializeDashCss.M

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
  def onCloseEnd(`this`: Materialbox, el: Element): Unit
  /**
    * Callback function called before materialbox is closed
    * @default null
    */
  def onCloseStart(`this`: Materialbox, el: Element): Unit
  /**
    * Callback function called after materialbox is opened
    * @default null
    */
  def onOpenEnd(`this`: Materialbox, el: Element): Unit
  /**
    * Callback function called before materialbox is opened
    * @default null
    */
  def onOpenStart(`this`: Materialbox, el: Element): Unit
}

object MaterialboxOptions {
  @scala.inline
  def apply(
    inDuration: Double,
    onCloseEnd: (Materialbox, Element) => Unit,
    onCloseStart: (Materialbox, Element) => Unit,
    onOpenEnd: (Materialbox, Element) => Unit,
    onOpenStart: (Materialbox, Element) => Unit,
    outDuration: Double
  ): MaterialboxOptions = {
    val __obj = js.Dynamic.literal(inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction2(onCloseEnd), onCloseStart = js.Any.fromFunction2(onCloseStart), onOpenEnd = js.Any.fromFunction2(onOpenEnd), onOpenStart = js.Any.fromFunction2(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaterialboxOptions]
  }
}

