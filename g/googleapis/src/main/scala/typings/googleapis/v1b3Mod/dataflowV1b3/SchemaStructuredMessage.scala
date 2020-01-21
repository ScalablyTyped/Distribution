package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rich message format, including a human readable string, a key for
  * identifying the message, and structured data associated with the message
  * for programmatic consumption.
  */
@js.native
trait SchemaStructuredMessage extends js.Object {
  /**
    * Identifier for this message type.  Used by external systems to
    * internationalize or personalize message.
    */
  var messageKey: js.UndefOr[String] = js.native
  /**
    * Human-readable version of message.
    */
  var messageText: js.UndefOr[String] = js.native
  /**
    * The structured data associated with this message.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameter]] = js.native
}

object SchemaStructuredMessage {
  @scala.inline
  def apply(
    messageKey: String = null,
    messageText: String = null,
    parameters: js.Array[SchemaParameter] = null
  ): SchemaStructuredMessage = {
    val __obj = js.Dynamic.literal()
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (messageText != null) __obj.updateDynamic("messageText")(messageText.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStructuredMessage]
  }
}

