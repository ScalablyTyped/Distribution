package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  def isKeyboard(e: reactLib.Event): scala.Boolean
  def off(el: reactLib.Element, `type`: java.lang.String, callback: stdLib.EventListener): scala.Unit
  def on(el: reactLib.Element, `type`: java.lang.String, callback: stdLib.EventListener): scala.Unit
  def once(el: reactLib.Element, `type`: java.lang.String, callback: stdLib.EventListener): scala.Unit
}

object Events {
  @scala.inline
  def apply(
    isKeyboard: js.Function1[reactLib.Event, scala.Boolean],
    off: js.Function3[reactLib.Element, java.lang.String, stdLib.EventListener, scala.Unit],
    on: js.Function3[reactLib.Element, java.lang.String, stdLib.EventListener, scala.Unit],
    once: js.Function3[reactLib.Element, java.lang.String, stdLib.EventListener, scala.Unit]
  ): Events = {
    val __obj = js.Dynamic.literal(isKeyboard = isKeyboard, off = off, on = on, once = once)
  
    __obj.asInstanceOf[Events]
  }
}

