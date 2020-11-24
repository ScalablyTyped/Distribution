package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Either a &lt;code&gt;PubsubMessage&lt;/code&gt; or a truncation event. One
  * of these two must be populated.
  */
@js.native
trait SchemaPullResponse extends js.Object {
  
  /**
    * This ID must be used to acknowledge the received event or message.
    */
  var ackId: js.UndefOr[String] = js.native
  
  /**
    * A pubsub message or truncation event.
    */
  var pubsubEvent: js.UndefOr[SchemaPubsubEvent] = js.native
}
object SchemaPullResponse {
  
  @scala.inline
  def apply(): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullResponse]
  }
  
  @scala.inline
  implicit class SchemaPullResponseOps[Self <: SchemaPullResponse] (val x: Self) extends AnyVal {
    
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
    def setAckId(value: String): Self = this.set("ackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckId: Self = this.set("ackId", js.undefined)
    
    @scala.inline
    def setPubsubEvent(value: SchemaPubsubEvent): Self = this.set("pubsubEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubEvent: Self = this.set("pubsubEvent", js.undefined)
  }
}
