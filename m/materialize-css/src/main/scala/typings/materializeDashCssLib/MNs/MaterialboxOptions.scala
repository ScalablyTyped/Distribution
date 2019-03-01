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

object MaterialboxOptions {
  @scala.inline
  def apply(
    inDuration: scala.Double,
    onCloseEnd: js.Function2[Materialbox, stdLib.Element, scala.Unit],
    onCloseStart: js.Function2[Materialbox, stdLib.Element, scala.Unit],
    onOpenEnd: js.Function2[Materialbox, stdLib.Element, scala.Unit],
    onOpenStart: js.Function2[Materialbox, stdLib.Element, scala.Unit],
    outDuration: scala.Double
  ): MaterialboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inDuration")(inDuration)
    __obj.updateDynamic("onCloseEnd")(onCloseEnd)
    __obj.updateDynamic("onCloseStart")(onCloseStart)
    __obj.updateDynamic("onOpenEnd")(onOpenEnd)
    __obj.updateDynamic("onOpenStart")(onOpenStart)
    __obj.updateDynamic("outDuration")(outDuration)
    __obj.asInstanceOf[MaterialboxOptions]
  }
}

