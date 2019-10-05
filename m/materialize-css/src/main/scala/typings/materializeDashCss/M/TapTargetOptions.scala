package typings.materializeDashCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapTargetOptions extends js.Object {
  /**
    * Callback function called when Tap Target is closed
    * @default null
    */
  def onClose(`this`: TapTarget, origin: Element): Unit
  /**
    * Callback function called when Tap Target is opened
    * @default null
    */
  def onOpen(`this`: TapTarget, origin: Element): Unit
}

object TapTargetOptions {
  @scala.inline
  def apply(onClose: (TapTarget, Element) => Unit, onOpen: (TapTarget, Element) => Unit): TapTargetOptions = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction2(onClose), onOpen = js.Any.fromFunction2(onOpen))
  
    __obj.asInstanceOf[TapTargetOptions]
  }
}

