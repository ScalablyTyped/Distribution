package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListScreenshotClustersResponse extends js.Object {
  /**
    * The set of clusters associated with an execution Always set
    */
  var clusters: js.UndefOr[js.Array[SchemaScreenshotCluster]] = js.native
}

object SchemaListScreenshotClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[SchemaScreenshotCluster] = null): SchemaListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListScreenshotClustersResponse]
  }
}

