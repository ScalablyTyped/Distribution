package typings.inboxsdk.inboxsdkMod.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButterBarInstance extends js.Object {
  def hideGmailMessage(): Unit = js.native
  def hideMessage(messageKey: String): Unit = js.native
  def hideMessage(messageKey: js.Object): Unit = js.native
  def showError(options: MessageDescriptor): Destroyer = js.native
  def showLoading(options: LoadingMessageDescriptor): Destroyer = js.native
  def showMessage(options: MessageDescriptor): Destroyer = js.native
  def showSaving(options: SavingMessageDescriptor): SavingResolver = js.native
}

