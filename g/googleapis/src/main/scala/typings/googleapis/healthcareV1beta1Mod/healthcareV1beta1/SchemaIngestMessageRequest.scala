package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ingests a message into the specified HL7v2 store.
  */
@js.native
trait SchemaIngestMessageRequest extends js.Object {
  /**
    * HL7v2 message to ingest.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaIngestMessageRequest {
  @scala.inline
  def apply(message: SchemaMessage = null): SchemaIngestMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIngestMessageRequest]
  }
}

