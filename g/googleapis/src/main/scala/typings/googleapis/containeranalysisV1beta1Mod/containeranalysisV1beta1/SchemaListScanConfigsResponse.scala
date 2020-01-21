package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing scan configurations.
  */
@js.native
trait SchemaListScanConfigsResponse extends js.Object {
  /**
    * The next pagination token in the list response. It should be used as
    * `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The scan configurations requested.
    */
  var scanConfigs: js.UndefOr[js.Array[SchemaScanConfig]] = js.native
}

object SchemaListScanConfigsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, scanConfigs: js.Array[SchemaScanConfig] = null): SchemaListScanConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (scanConfigs != null) __obj.updateDynamic("scanConfigs")(scanConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListScanConfigsResponse]
  }
}

