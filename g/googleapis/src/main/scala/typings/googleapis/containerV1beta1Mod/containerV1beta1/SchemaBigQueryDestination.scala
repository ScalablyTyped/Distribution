package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for using BigQuery as the destination of resource usage export.
  */
@js.native
trait SchemaBigQueryDestination extends js.Object {
  /**
    * The ID of a BigQuery Dataset.
    */
  var datasetId: js.UndefOr[String] = js.native
}

object SchemaBigQueryDestination {
  @scala.inline
  def apply(datasetId: String = null): SchemaBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBigQueryDestination]
  }
}

