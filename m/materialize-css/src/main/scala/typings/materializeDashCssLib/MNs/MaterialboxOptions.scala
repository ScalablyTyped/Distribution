package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialboxOptions extends js.Object {
  /**
    * Transition in duration in milliseconds
    * @default 275
    */
  var inDuration: scala.Double
  /**
    * Transition out duration in milliseconds
    * @default 200
    */
  var outDuration: scala.Double
  /**
    * Callback function called after materialbox is closed
    * @default null
    */
  def onCloseEnd(`this`: Materialbox, el: stdLib.Element): scala.Unit
  /**
    * Callback function called before materialbox is closed
    * @default null
    */
  def onCloseStart(`this`: Materialbox, el: stdLib.Element): scala.Unit
  /**
    * Callback function called after materialbox is opened
    * @default null
    */
  def onOpenEnd(`this`: Materialbox, el: stdLib.Element): scala.Unit
  /**
    * Callback function called before materialbox is opened
    * @default null
    */
  def onOpenStart(`this`: Materialbox, el: stdLib.Element): scala.Unit
}

