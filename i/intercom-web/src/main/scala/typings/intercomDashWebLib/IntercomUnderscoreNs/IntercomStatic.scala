package typings
package intercomDashWebLib.IntercomUnderscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomStatic extends js.Object {
  var booted: scala.Boolean = js.native
  def apply(command: IntercomCommand): scala.Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any): scala.Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any, param2: js.Any): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.boot, param: IntercomSettings): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.getVisitorId): java.lang.String = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.hide): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.onActivatorClick): scala.Unit = js.native
  def apply(
    command: intercomDashWebLib.intercomDashWebLibStrings.onActivatorClick,
    param: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.onHide): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.onHide, param: js.Function0[scala.Unit]): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.onShow): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.onShow, param: js.Function0[scala.Unit]): scala.Unit = js.native
  def apply(
    command: intercomDashWebLib.intercomDashWebLibStrings.onUnreadCountChange,
    cb: js.Function1[/* unreadCount */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.show): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.showMessages): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.showNewMessage): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.showNewMessage, param: java.lang.String): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.shutdown): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.trackEvent): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.trackEvent, tag: java.lang.String): scala.Unit = js.native
  def apply(
    command: intercomDashWebLib.intercomDashWebLibStrings.trackEvent,
    tag: java.lang.String,
    metadata: js.Any
  ): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.update): scala.Unit = js.native
  def apply(command: intercomDashWebLib.intercomDashWebLibStrings.update, param: IntercomSettings): scala.Unit = js.native
}

