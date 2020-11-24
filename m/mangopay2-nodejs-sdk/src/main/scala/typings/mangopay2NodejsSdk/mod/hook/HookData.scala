package typings.mangopay2NodejsSdk.mod.hook

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.event.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookData extends EntityBaseData {
  
  /**
    * The event type
    */
  var EventType: typings.mangopay2NodejsSdk.mod.event.EventType = js.native
  
  /**
    * Whether the hook is enabled or not
    */
  var Status: HookStatus = js.native
  
  /**
    * This is the URL where your receive notification for each EventType
    */
  var Url: String = js.native
  
  /**
    * Whether the hook is valid or not
    */
  var Validity: HookValidity = js.native
}
object HookData {
  
  @scala.inline
  def apply(
    CreationDate: Double,
    EventType: EventType,
    Id: String,
    Status: HookStatus,
    Tag: String,
    Url: String,
    Validity: HookValidity
  ): HookData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookData]
  }
  
  @scala.inline
  implicit class HookDataOps[Self <: HookData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventType(value: EventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: HookStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: HookValidity): Self = this.set("Validity", value.asInstanceOf[js.Any])
  }
}
