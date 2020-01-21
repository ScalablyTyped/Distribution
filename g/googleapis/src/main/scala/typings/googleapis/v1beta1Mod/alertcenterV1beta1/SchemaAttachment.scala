package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attachment with application-specific information about an alert.
  */
@js.native
trait SchemaAttachment extends js.Object {
  /**
    * A CSV file attachment.
    */
  var csv: js.UndefOr[SchemaCsv] = js.native
}

object SchemaAttachment {
  @scala.inline
  def apply(csv: SchemaCsv = null): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttachment]
  }
}

