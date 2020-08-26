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
  def apply(): SchemaMultiStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiStep]
  }
  @scala.inline
  implicit class SchemaMultiStepOps[Self <: SchemaMultiStep] (val x: Self) extends AnyVal {
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
    def setMultistepNumber(value: Double): Self = this.set("multistepNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultistepNumber: Self = this.set("multistepNumber", js.undefined)
    @scala.inline
    def setPrimaryStep(value: SchemaPrimaryStep): Self = this.set("primaryStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryStep: Self = this.set("primaryStep", js.undefined)
    @scala.inline
    def setPrimaryStepId(value: String): Self = this.set("primaryStepId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryStepId: Self = this.set("primaryStepId", js.undefined)
  }
  
}

