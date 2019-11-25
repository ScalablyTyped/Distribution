package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasetIdString extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
}

object Anon_DatasetIdString {
  @scala.inline
  def apply(datasetId: String = null): Anon_DatasetIdString = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DatasetIdString]
  }
}

