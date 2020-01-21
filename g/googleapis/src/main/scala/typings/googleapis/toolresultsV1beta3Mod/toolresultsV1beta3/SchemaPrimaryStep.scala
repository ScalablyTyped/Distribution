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
  def apply(individualOutcome: js.Array[SchemaIndividualOutcome] = null, rollUp: String = null): SchemaPrimaryStep = {
    val __obj = js.Dynamic.literal()
    if (individualOutcome != null) __obj.updateDynamic("individualOutcome")(individualOutcome.asInstanceOf[js.Any])
    if (rollUp != null) __obj.updateDynamic("rollUp")(rollUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrimaryStep]
  }
}

