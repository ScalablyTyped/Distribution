package typings.hopscotch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TourDefinition extends HopscotchConfiguration {
  var id: String = js.native
  var steps: js.Array[StepDefinition] = js.native
}

object TourDefinition {
  @scala.inline
  def apply(id: String, steps: js.Array[StepDefinition]): TourDefinition = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourDefinition]
  }
  @scala.inline
  implicit class TourDefinitionOps[Self <: TourDefinition] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: StepDefinition*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[StepDefinition]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
  
}

