package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubMessage extends js.Object {
  
  /** Attributes for this message. If this field is empty, the message must contain non-empty data. This can be used to filter messages on the subscription. */
  var attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.PubsubMessage with TopLevel[js.Any]
  ] = js.native
  
  /** The message data field. If this field is empty, the message must contain at least one attribute. */
  var data: js.UndefOr[String] = js.native
  
  /**
    * ID of this message, assigned by the server when the message is published. Guaranteed to be unique within the topic. This value may be read by a subscriber that receives a
    * `PubsubMessage` via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String] = js.native
  
  /**
    * If non-empty, identifies related messages for which publish order should be respected. If a `Subscription` has `enable_message_ordering` set to `true`, messages published with the
    * same non-empty `ordering_key` value will be delivered to subscribers in the order in which they are received by the Pub/Sub system. All `PubsubMessage`s published in a given
    * `PublishRequest` must specify the same `ordering_key` value.
    */
  var orderingKey: js.UndefOr[String] = js.native
  
  /** The time at which the message was published, populated by the server when it receives the `Publish` call. It must not be populated by the publisher in a `Publish` call. */
  var publishTime: js.UndefOr[String] = js.native
}
object PubsubMessage {
  
  @scala.inline
  def apply(): PubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubMessage]
  }
  
  @scala.inline
  implicit class PubsubMessageOps[Self <: PubsubMessage] (val x: Self) extends AnyVal {
    
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
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.PubsubMessage with TopLevel[js.Any]
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setOrderingKey(value: String): Self = this.set("orderingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderingKey: Self = this.set("orderingKey", js.undefined)
    
    @scala.inline
    def setPublishTime(value: String): Self = this.set("publishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishTime: Self = this.set("publishTime", js.undefined)
  }
}
