package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `Pull` method.
  */
@js.native
trait SchemaPullResponse extends js.Object {
  /**
    * Received Pub/Sub messages. The list will be empty if there are no more
    * messages available in the backlog. For JSON, the response can be entirely
    * empty. The Pub/Sub system may return fewer than the `maxMessages`
    * requested even if there are more messages available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[SchemaReceivedMessage]] = js.native
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
    def setReceivedMessagesVarargs(value: SchemaReceivedMessage*): Self = this.set("receivedMessages", js.Array(value :_*))
    @scala.inline
    def setReceivedMessages(value: js.Array[SchemaReceivedMessage]): Self = this.set("receivedMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceivedMessages: Self = this.set("receivedMessages", js.undefined)
  }
  
}

