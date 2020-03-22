package typings.mangopay2NodejsSdk.mod.hook

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.event.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookData extends EntityBaseData {
  /**
    * The event type
    */
  var EventType: typings.mangopay2NodejsSdk.mod.event.EventType
  /**
    * Whether the hook is enabled or not
    */
  var Status: HookStatus
  /**
    * This is the URL where your receive notification for each EventType
    */
  var Url: String
  /**
    * Whether the hook is valid or not
    */
  var Validity: HookValidity
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
}

