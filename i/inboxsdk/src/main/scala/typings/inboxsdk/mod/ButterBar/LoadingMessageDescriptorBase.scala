package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingMessageDescriptorBase extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var hideOnViewChanged: js.UndefOr[Boolean] = js.undefined
  
  var messageKey: js.UndefOr[js.Object | String] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
}
object LoadingMessageDescriptorBase {
  
  inline def apply(): LoadingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingMessageDescriptorBase]
  }
  
  extension [Self <: LoadingMessageDescriptorBase](x: Self) {
    
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
  }
}
