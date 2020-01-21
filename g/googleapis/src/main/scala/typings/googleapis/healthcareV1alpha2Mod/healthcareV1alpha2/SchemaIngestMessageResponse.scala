package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Acknowledges that a message has been ingested into the specified HL7v2
  * store.
  */
@js.native
trait SchemaIngestMessageResponse extends js.Object {
  /**
    * HL7v2 ACK message.
    */
  var hl7Ack: js.UndefOr[String] = js.native
  /**
    * Created message resource.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaIngestMessageResponse {
  @scala.inline
  def apply(hl7Ack: String = null, message: SchemaMessage = null): SchemaIngestMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (hl7Ack != null) __obj.updateDynamic("hl7Ack")(hl7Ack.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIngestMessageResponse]
  }
}

