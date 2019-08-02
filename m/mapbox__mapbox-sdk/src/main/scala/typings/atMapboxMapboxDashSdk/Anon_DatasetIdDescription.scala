package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasetIdDescription extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_DatasetIdDescription {
  @scala.inline
  def apply(datasetId: String = null, description: String = null, name: String = null): Anon_DatasetIdDescription = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_DatasetIdDescription]
  }
}

