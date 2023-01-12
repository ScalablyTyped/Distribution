package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDescriptorBase extends StObject {
  
  var buttons: js.UndefOr[js.Array[MessageButtonDescriptor]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var hideOnViewChanged: js.UndefOr[Boolean] = js.undefined
  
  var messageKey: js.UndefOr[js.Object | String] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
}
object MessageDescriptorBase {
  
  inline def apply(): MessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageDescriptorBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageDescriptorBase] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[MessageButtonDescriptor]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: MessageButtonDescriptor*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHideOnViewChanged(value: Boolean): Self = StObject.set(x, "hideOnViewChanged", value.asInstanceOf[js.Any])
    
    inline def setHideOnViewChangedUndefined: Self = StObject.set(x, "hideOnViewChanged", js.undefined)
    
    inline def setMessageKey(value: js.Object | String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
