package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingMessageDescriptorBase extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var confirmationText: js.UndefOr[String] = js.native
  
  var confirmationTime: js.UndefOr[Double] = js.native
  
  var hideOnViewChanged: js.UndefOr[Boolean] = js.native
  
  var messageKey: js.UndefOr[js.Object | String] = js.native
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var showConfirmation: js.UndefOr[Boolean] = js.native
  
  var time: js.UndefOr[Double] = js.native
}
object SavingMessageDescriptorBase {
  
  @scala.inline
  def apply(): SavingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingMessageDescriptorBase]
  }
  
  @scala.inline
  implicit class SavingMessageDescriptorBaseMutableBuilder[Self <: SavingMessageDescriptorBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setConfirmationText(value: String): Self = StObject.set(x, "confirmationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationTextUndefined: Self = StObject.set(x, "confirmationText", js.undefined)
    
    @scala.inline
    def setConfirmationTime(value: Double): Self = StObject.set(x, "confirmationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationTimeUndefined: Self = StObject.set(x, "confirmationTime", js.undefined)
    
    @scala.inline
    def setHideOnViewChanged(value: Boolean): Self = StObject.set(x, "hideOnViewChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnViewChangedUndefined: Self = StObject.set(x, "hideOnViewChanged", js.undefined)
    
    @scala.inline
    def setMessageKey(value: js.Object | String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setShowConfirmation(value: Boolean): Self = StObject.set(x, "showConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConfirmationUndefined: Self = StObject.set(x, "showConfirmation", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
