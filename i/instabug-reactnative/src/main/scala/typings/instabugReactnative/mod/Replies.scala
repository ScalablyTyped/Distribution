package typings.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instabug-reactnative", "Replies")
@js.native
object Replies extends js.Object {
  def getUnreadRepliesCount(messageCountCallback: js.Function1[/* count */ Double, Unit]): Unit = js.native
  def hasChats(callback: js.Function1[/* previousChats */ Boolean, Unit]): Unit = js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  def setInAppNotificationSound(shouldPlaySound: Boolean): Unit = js.native
  def setInAppNotificationsEnabled(inAppNotificationsEnabled: Boolean): Unit = js.native
  def setOnNewReplyReceivedCallback(onNewReplyReceivedCallback: js.Function0[Unit]): Unit = js.native
  def setOnNewReplyReceivedHandler(onNewReplyReceivedHandler: js.Function0[Unit]): Unit = js.native
  def show(): Unit = js.native
}

