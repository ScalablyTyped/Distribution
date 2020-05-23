package typings.intercomWeb.Intercom

import typings.intercomWeb.intercomWebStrings.boot
import typings.intercomWeb.intercomWebStrings.getVisitorId
import typings.intercomWeb.intercomWebStrings.hide
import typings.intercomWeb.intercomWebStrings.onActivatorClick
import typings.intercomWeb.intercomWebStrings.onHide
import typings.intercomWeb.intercomWebStrings.onShow
import typings.intercomWeb.intercomWebStrings.onUnreadCountChange
import typings.intercomWeb.intercomWebStrings.show
import typings.intercomWeb.intercomWebStrings.showMessages
import typings.intercomWeb.intercomWebStrings.showNewMessage
import typings.intercomWeb.intercomWebStrings.shutdown
import typings.intercomWeb.intercomWebStrings.trackEvent
import typings.intercomWeb.intercomWebStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomStatic extends js.Object {
  var booted: Boolean = js.native
  def apply(command: IntercomCommand): Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any): Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any, param2: js.Any): Unit = js.native
  def apply(command: boot, param: IntercomSettings): Unit = js.native
  def apply(command: getVisitorId): String = js.native
  def apply(command: hide): Unit = js.native
  def apply(command: onActivatorClick): Unit = js.native
  def apply(command: onActivatorClick, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onHide): Unit = js.native
  def apply(command: onHide, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onShow): Unit = js.native
  def apply(command: onShow, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onUnreadCountChange, cb: js.Function1[/* unreadCount */ Double, Unit]): Unit = js.native
  def apply(command: show): Unit = js.native
  def apply(command: showMessages): Unit = js.native
  def apply(command: showNewMessage): Unit = js.native
  def apply(command: showNewMessage, param: String): Unit = js.native
  def apply(command: shutdown): Unit = js.native
  def apply(command: trackEvent): Unit = js.native
  def apply(command: trackEvent, tag: String): Unit = js.native
  def apply(command: trackEvent, tag: String, metadata: js.Any): Unit = js.native
  def apply(command: update): Unit = js.native
  def apply(command: update, param: IntercomSettings): Unit = js.native
}

