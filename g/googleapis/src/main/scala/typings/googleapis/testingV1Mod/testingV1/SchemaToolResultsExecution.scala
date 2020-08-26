package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a tool results execution resource.  This has the results of a
  * TestMatrix.
  */
@js.native
trait SchemaToolResultsExecution extends js.Object {
  /**
    * Output only. A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Output only. A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Output only. The cloud project that owns the tool results execution.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaToolResultsExecution {
  @scala.inline
  def apply(): SchemaToolResultsExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolResultsExecution]
  }
  @scala.inline
  implicit class SchemaToolResultsExecutionOps[Self <: SchemaToolResultsExecution] (val x: Self) extends AnyVal {
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
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

