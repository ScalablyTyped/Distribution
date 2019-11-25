package typings.materializeDashCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleOptions extends js.Object {
  /**
    * If accordion versus collapsible
    * @default true
    */
  var accordion: Boolean
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double
  /**
    * Transition out duration in milliseconds.
    * @default 300
    */
  var outDuration: Double
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(`this`: Collapsible, el: Element): Unit
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(`this`: Collapsible, el: Element): Unit
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(`this`: Collapsible, el: Element): Unit
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(`this`: Collapsible, el: Element): Unit
}

object CollapsibleOptions {
  @scala.inline
  def apply(
    accordion: Boolean,
    inDuration: Double,
    onCloseEnd: (Collapsible, Element) => Unit,
    onCloseStart: (Collapsible, Element) => Unit,
    onOpenEnd: (Collapsible, Element) => Unit,
    onOpenStart: (Collapsible, Element) => Unit,
    outDuration: Double
  ): CollapsibleOptions = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction2(onCloseEnd), onCloseStart = js.Any.fromFunction2(onCloseStart), onOpenEnd = js.Any.fromFunction2(onOpenEnd), onOpenStart = js.Any.fromFunction2(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollapsibleOptions]
  }
}

