package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies what kind of log the caller must write
  */
@js.native
trait SchemaLogConfig extends js.Object {
  /**
    * Cloud audit options.
    */
  var cloudAudit: js.UndefOr[SchemaLogConfigCloudAuditOptions] = js.native
  /**
    * Counter options.
    */
  var counter: js.UndefOr[SchemaLogConfigCounterOptions] = js.native
  /**
    * Data access options.
    */
  var dataAccess: js.UndefOr[SchemaLogConfigDataAccessOptions] = js.native
}

object SchemaLogConfig {
  @scala.inline
  def apply(
    cloudAudit: SchemaLogConfigCloudAuditOptions = null,
    counter: SchemaLogConfigCounterOptions = null,
    dataAccess: SchemaLogConfigDataAccessOptions = null
  ): SchemaLogConfig = {
    val __obj = js.Dynamic.literal()
    if (cloudAudit != null) __obj.updateDynamic("cloudAudit")(cloudAudit.asInstanceOf[js.Any])
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (dataAccess != null) __obj.updateDynamic("dataAccess")(dataAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLogConfig]
  }
}

