package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message and its corresponding acknowledgment ID.
  */
@js.native
trait SchemaReceivedMessage extends js.Object {
  /**
    * This ID can be used to acknowledge the received message.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * The message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
}

object SchemaReceivedMessage {
  @scala.inline
  def apply(): SchemaReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReceivedMessage]
  }
  @scala.inline
  implicit class SchemaReceivedMessageOps[Self <: SchemaReceivedMessage] (val x: Self) extends AnyVal {
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
    def setMessage(value: SchemaPubsubMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

