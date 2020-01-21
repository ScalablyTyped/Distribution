package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListTensorFlowVersions.
  */
@js.native
trait SchemaListTensorFlowVersionsResponse extends js.Object {
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The listed nodes.
    */
  var tensorflowVersions: js.UndefOr[js.Array[SchemaTensorFlowVersion]] = js.native
}

object SchemaListTensorFlowVersionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tensorflowVersions: js.Array[SchemaTensorFlowVersion] = null): SchemaListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tensorflowVersions != null) __obj.updateDynamic("tensorflowVersions")(tensorflowVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTensorFlowVersionsResponse]
  }
}

