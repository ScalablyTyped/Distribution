package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingMessageDescriptorBase extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var confirmationText: js.UndefOr[String] = js.undefined
  
  var confirmationTime: js.UndefOr[Double] = js.undefined
  
  var hideOnViewChanged: js.UndefOr[Boolean] = js.undefined
  
  var messageKey: js.UndefOr[js.Object | String] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var showConfirmation: js.UndefOr[Boolean] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
}
object SavingMessageDescriptorBase {
  
  inline def apply(): SavingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingMessageDescriptorBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingMessageDescriptorBase] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setConfirmationText(value: String): Self = StObject.set(x, "confirmationText", value.asInstanceOf[js.Any])
    
    inline def setConfirmationTextUndefined: Self = StObject.set(x, "confirmationText", js.undefined)
    
    inline def setConfirmationTime(value: Double): Self = StObject.set(x, "confirmationTime", value.asInstanceOf[js.Any])
    
    inline def setConfirmationTimeUndefined: Self = StObject.set(x, "confirmationTime", js.undefined)
    
    inline def setHideOnViewChanged(value: Boolean): Self = StObject.set(x, "hideOnViewChanged", value.asInstanceOf[js.Any])
    
    inline def setHideOnViewChangedUndefined: Self = StObject.set(x, "hideOnViewChanged", js.undefined)
    
    inline def setMessageKey(value: js.Object | String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setShowConfirmation(value: Boolean): Self = StObject.set(x, "showConfirmation", value.asInstanceOf[js.Any])
    
    inline def setShowConfirmationUndefined: Self = StObject.set(x, "showConfirmation", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
