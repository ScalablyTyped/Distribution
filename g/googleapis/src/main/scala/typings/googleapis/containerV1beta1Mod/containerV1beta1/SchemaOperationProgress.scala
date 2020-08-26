package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about operation (or operation stage) progress.
  */
@js.native
trait SchemaOperationProgress extends js.Object {
  /**
    * Progress metric bundle, for example:   metrics: [{name: &quot;nodes
    * done&quot;,     int_value: 15},             {name: &quot;nodes
    * total&quot;,    int_value: 32}] or   metrics: [{name:
    * &quot;progress&quot;,       double_value: 0.56},             {name:
    * &quot;progress scale&quot;, double_value: 1.0}]
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * A non-parameterized string describing an operation stage. Unset for
    * single-stage operations.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Substages of an operation or a stage.
    */
  var stages: js.UndefOr[js.Array[SchemaOperationProgress]] = js.native
  /**
    * Status of an operation stage. Unset for single-stage operations.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaOperationProgress {
  @scala.inline
  def apply(): SchemaOperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationProgress]
  }
  @scala.inline
  implicit class SchemaOperationProgressOps[Self <: SchemaOperationProgress] (val x: Self) extends AnyVal {
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
    def setMetricsVarargs(value: SchemaMetric*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStagesVarargs(value: SchemaOperationProgress*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: js.Array[SchemaOperationProgress]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

