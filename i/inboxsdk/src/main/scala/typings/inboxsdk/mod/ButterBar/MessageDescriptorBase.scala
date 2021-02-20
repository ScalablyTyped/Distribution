package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDescriptorBase extends StObject {
  
  var buttons: js.UndefOr[js.Array[MessageButtonDescriptor]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var hideOnViewChanged: js.UndefOr[Boolean] = js.native
  
  var messageKey: js.UndefOr[js.Object | String] = js.native
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var time: js.UndefOr[Double] = js.native
}
object MessageDescriptorBase {
  
  @scala.inline
  def apply(): MessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageDescriptorBase]
  }
  
  @scala.inline
  implicit class MessageDescriptorBaseMutableBuilder[Self <: MessageDescriptorBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[MessageButtonDescriptor]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: MessageButtonDescriptor*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
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
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
