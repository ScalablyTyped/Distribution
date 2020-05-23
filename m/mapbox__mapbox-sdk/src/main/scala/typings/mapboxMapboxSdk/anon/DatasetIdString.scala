package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetIdString extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
}

object DatasetIdString {
  @scala.inline
  def apply(datasetId: String = null): DatasetIdString = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetIdString]
  }
}

