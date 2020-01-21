package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selector that chooses target cluster for jobs based on metadata.
  */
@js.native
trait SchemaClusterSelector extends js.Object {
  /**
    * Required. The cluster labels. Cluster must have all labels to match.
    */
  var clusterLabels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The zone where workflow process executes. This parameter does
    * not affect the selection of the cluster.If unspecified, the zone of the
    * first cluster matching the selector is used.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaClusterSelector {
  @scala.inline
  def apply(clusterLabels: StringDictionary[String] = null, zone: String = null): SchemaClusterSelector = {
    val __obj = js.Dynamic.literal()
    if (clusterLabels != null) __obj.updateDynamic("clusterLabels")(clusterLabels.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusterSelector]
  }
}

