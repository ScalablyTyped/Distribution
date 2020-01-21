package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for GenerateConfigReport method.
  */
@js.native
trait SchemaGenerateConfigReportRequest extends js.Object {
  /**
    * Service configuration for which we want to generate the report. For this
    * version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var newConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Service configuration against which the comparison will be done. For this
    * version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var oldConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGenerateConfigReportRequest {
  @scala.inline
  def apply(newConfig: StringDictionary[js.Any] = null, oldConfig: StringDictionary[js.Any] = null): SchemaGenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    if (newConfig != null) __obj.updateDynamic("newConfig")(newConfig.asInstanceOf[js.Any])
    if (oldConfig != null) __obj.updateDynamic("oldConfig")(oldConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenerateConfigReportRequest]
  }
}

