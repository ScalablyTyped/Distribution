package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details when multiple steps are run with the same configuration as a group.
  */
@js.native
trait SchemaMultiStep extends js.Object {
  /**
    * Unique int given to each step. Ranges from 0(inclusive) to total number
    * of steps(exclusive). The primary step is 0.
    */
  var multistepNumber: js.UndefOr[Double] = js.native
  /**
    * Present if it is a primary (original) step.
    */
  var primaryStep: js.UndefOr[SchemaPrimaryStep] = js.native
  /**
    * Step Id of the primary (original) step, which might be this step.
    */
  var primaryStepId: js.UndefOr[String] = js.native
}

object SchemaMultiStep {
  @scala.inline
  def apply(
    multistepNumber: js.UndefOr[Double] = js.undefined,
    primaryStep: SchemaPrimaryStep = null,
    primaryStepId: String = null
  ): SchemaMultiStep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multistepNumber)) __obj.updateDynamic("multistepNumber")(multistepNumber.get.asInstanceOf[js.Any])
    if (primaryStep != null) __obj.updateDynamic("primaryStep")(primaryStep.asInstanceOf[js.Any])
    if (primaryStepId != null) __obj.updateDynamic("primaryStepId")(primaryStepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMultiStep]
  }
}

