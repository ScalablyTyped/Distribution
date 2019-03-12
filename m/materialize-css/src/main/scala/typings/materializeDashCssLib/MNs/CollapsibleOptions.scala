package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleOptions extends js.Object {
  /**
    * If accordion versus collapsible
    * @default true
    */
  var accordion: scala.Boolean
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: scala.Double
  /**
    * Transition out duration in milliseconds.
    * @default 300
    */
  var outDuration: scala.Double
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(`this`: Collapsible, el: stdLib.Element): scala.Unit
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(`this`: Collapsible, el: stdLib.Element): scala.Unit
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(`this`: Collapsible, el: stdLib.Element): scala.Unit
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(`this`: Collapsible, el: stdLib.Element): scala.Unit
}

object CollapsibleOptions {
  @scala.inline
  def apply(
    accordion: scala.Boolean,
    inDuration: scala.Double,
    onCloseEnd: (Collapsible, stdLib.Element) => scala.Unit,
    onCloseStart: (Collapsible, stdLib.Element) => scala.Unit,
    onOpenEnd: (Collapsible, stdLib.Element) => scala.Unit,
    onOpenStart: (Collapsible, stdLib.Element) => scala.Unit,
    outDuration: scala.Double
  ): CollapsibleOptions = {
    val __obj = js.Dynamic.literal(accordion = accordion, inDuration = inDuration, onCloseEnd = js.Any.fromFunction2(onCloseEnd), onCloseStart = js.Any.fromFunction2(onCloseStart), onOpenEnd = js.Any.fromFunction2(onOpenEnd), onOpenStart = js.Any.fromFunction2(onOpenStart), outDuration = outDuration)
  
    __obj.asInstanceOf[CollapsibleOptions]
  }
}

