package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores rollup test status of multiple steps that were run as a group and
  * outcome of each individual step.
  */
@js.native
trait SchemaPrimaryStep extends js.Object {
  /**
    * Step Id and outcome of each individual step.
    */
  var individualOutcome: js.UndefOr[js.Array[SchemaIndividualOutcome]] = js.native
  /**
    * Rollup test status of multiple steps that were run with the same
    * configuration as a group.
    */
  var rollUp: js.UndefOr[String] = js.native
}

object SchemaPrimaryStep {
  @scala.inline
  def apply(): SchemaPrimaryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrimaryStep]
  }
  @scala.inline
  implicit class SchemaPrimaryStepOps[Self <: SchemaPrimaryStep] (val x: Self) extends AnyVal {
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
    def setIndividualOutcomeVarargs(value: SchemaIndividualOutcome*): Self = this.set("individualOutcome", js.Array(value :_*))
    @scala.inline
    def setIndividualOutcome(value: js.Array[SchemaIndividualOutcome]): Self = this.set("individualOutcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndividualOutcome: Self = this.set("individualOutcome", js.undefined)
    @scala.inline
    def setRollUp(value: String): Self = this.set("rollUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollUp: Self = this.set("rollUp", js.undefined)
  }
  
}

