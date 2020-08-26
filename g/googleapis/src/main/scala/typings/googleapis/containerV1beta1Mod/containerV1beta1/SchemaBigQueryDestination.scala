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
  def apply(): SchemaBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryDestination]
  }
  @scala.inline
  implicit class SchemaBigQueryDestinationOps[Self <: SchemaBigQueryDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
  }
  
}

