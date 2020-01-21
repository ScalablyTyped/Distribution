package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListClustersResponse is the result of ListClustersRequest.
  */
@js.native
trait SchemaListClustersResponse extends js.Object {
  /**
    * A list of clusters in the project in the specified zone, or across all
    * ones.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  /**
    * If any zones are listed here, the list of clusters returned may be
    * missing those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[SchemaCluster] = null, missingZones: js.Array[String] = null): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (missingZones != null) __obj.updateDynamic("missingZones")(missingZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
}

