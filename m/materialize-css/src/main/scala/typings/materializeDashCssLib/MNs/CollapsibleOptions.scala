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

