package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of all clusters in a project.
  */
@js.native
trait SchemaListClustersResponse extends js.Object {
  /**
    * Output only. The clusters in the project.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent &lt;code&gt;ListClustersRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[SchemaCluster] = null, nextPageToken: String = null): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
}

