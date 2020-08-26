package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata associated with a long running operation resource.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * Percentage of completion of this operation, ranging from 0 to 100.
    */
  var progressPercentage: js.UndefOr[Double] = js.native
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The start time of the operation.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Detailed status information for each step. The order is undetermined.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.native
}

object SchemaOperationMetadata {
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  @scala.inline
  implicit class SchemaOperationMetadataOps[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
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
    def setProgressPercentage(value: Double): Self = this.set("progressPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressPercentage: Self = this.set("progressPercentage", js.undefined)
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceNames: Self = this.set("resourceNames", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStepsVarargs(value: SchemaStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[SchemaStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

