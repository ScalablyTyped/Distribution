package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a report.
  */
@js.native
trait SchemaReport extends js.Object {
  /**
    * Key used to identify a report.
    */
  var key: js.UndefOr[SchemaReportKey] = js.native
  /**
    * Report metadata.
    */
  var metadata: js.UndefOr[SchemaReportMetadata] = js.native
  /**
    * Report parameters.
    */
  var params: js.UndefOr[SchemaParameters] = js.native
}

object SchemaReport {
  @scala.inline
  def apply(
    key: SchemaReportKey = null,
    metadata: SchemaReportMetadata = null,
    params: SchemaParameters = null
  ): SchemaReport = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReport]
  }
}

