package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButterBarInstance extends StObject {
  
  def hideGmailMessage(): Unit = js.native
  
  def hideMessage(messageKey: String): Unit = js.native
  def hideMessage(messageKey: js.Object): Unit = js.native
  
  def showError(options: MessageDescriptor): Destroyer = js.native
  
  def showLoading(options: LoadingMessageDescriptor): Destroyer = js.native
  
  def showMessage(options: MessageDescriptor): Destroyer = js.native
  
  def showSaving(options: SavingMessageDescriptor): SavingResolver = js.native
}
