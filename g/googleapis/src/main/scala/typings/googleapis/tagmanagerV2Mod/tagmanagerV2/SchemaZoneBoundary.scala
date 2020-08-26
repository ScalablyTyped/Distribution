package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Zone&#39;s boundaries.
  */
@js.native
trait SchemaZoneBoundary extends js.Object {
  /**
    * The conditions that, when conjoined, make up the boundary.
    */
  var condition: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * Custom evaluation trigger IDs. A zone will evaluate its boundary
    * conditions when any of the listed triggers are true.
    */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.native
}

object SchemaZoneBoundary {
  @scala.inline
  def apply(): SchemaZoneBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneBoundary]
  }
  @scala.inline
  implicit class SchemaZoneBoundaryOps[Self <: SchemaZoneBoundary] (val x: Self) extends AnyVal {
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
    def setConditionVarargs(value: SchemaCondition*): Self = this.set("condition", js.Array(value :_*))
    @scala.inline
    def setCondition(value: js.Array[SchemaCondition]): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setCustomEvaluationTriggerIdVarargs(value: String*): Self = this.set("customEvaluationTriggerId", js.Array(value :_*))
    @scala.inline
    def setCustomEvaluationTriggerId(value: js.Array[String]): Self = this.set("customEvaluationTriggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomEvaluationTriggerId: Self = this.set("customEvaluationTriggerId", js.undefined)
  }
  
}

