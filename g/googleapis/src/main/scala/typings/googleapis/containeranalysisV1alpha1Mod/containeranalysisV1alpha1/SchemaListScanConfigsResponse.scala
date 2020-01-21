package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of scan configs for the project.
  */
@js.native
trait SchemaListScanConfigsResponse extends js.Object {
  /**
    * A page token to pass in order to get more scan configs.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The set of scan configs.
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

