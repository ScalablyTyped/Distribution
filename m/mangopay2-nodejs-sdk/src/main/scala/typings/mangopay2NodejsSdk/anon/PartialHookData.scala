package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.event.EventType
import typings.mangopay2NodejsSdk.mod.hook.HookStatus
import typings.mangopay2NodejsSdk.mod.hook.HookValidity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData> */
trait PartialHookData extends StObject {
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var EventType: js.UndefOr[typings.mangopay2NodejsSdk.mod.event.EventType] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var Status: js.UndefOr[HookStatus] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var Url: js.UndefOr[String] = js.undefined
  
  var Validity: js.UndefOr[HookValidity] = js.undefined
}
object PartialHookData {
  
  @scala.inline
  def apply(): PartialHookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookData]
  }
  
  @scala.inline
  implicit class PartialHookDataMutableBuilder[Self <: PartialHookData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setStatus(value: HookStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setValidity(value: HookValidity): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUndefined: Self = StObject.set(x, "Validity", js.undefined)
  }
}
