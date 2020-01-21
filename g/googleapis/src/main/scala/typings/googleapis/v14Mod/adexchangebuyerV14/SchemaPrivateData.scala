package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPrivateData extends js.Object {
  var referenceId: js.UndefOr[String] = js.native
  var referencePayload: js.UndefOr[String] = js.native
}

object SchemaPrivateData {
  @scala.inline
  def apply(referenceId: String = null, referencePayload: String = null): SchemaPrivateData = {
    val __obj = js.Dynamic.literal()
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    if (referencePayload != null) __obj.updateDynamic("referencePayload")(referencePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrivateData]
  }
}

