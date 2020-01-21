package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties needed for quota operations.
  */
@js.native
trait SchemaQuotaProperties extends js.Object {
  /**
    * Quota mode for this operation.
    */
  var quotaMode: js.UndefOr[String] = js.native
}

object SchemaQuotaProperties {
  @scala.inline
  def apply(quotaMode: String = null): SchemaQuotaProperties = {
    val __obj = js.Dynamic.literal()
    if (quotaMode != null) __obj.updateDynamic("quotaMode")(quotaMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuotaProperties]
  }
}

