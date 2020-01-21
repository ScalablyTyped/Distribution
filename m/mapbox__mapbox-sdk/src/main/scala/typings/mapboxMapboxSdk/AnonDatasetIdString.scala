package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatasetIdString extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
}

object AnonDatasetIdString {
  @scala.inline
  def apply(datasetId: String = null): AnonDatasetIdString = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatasetIdString]
  }
}

