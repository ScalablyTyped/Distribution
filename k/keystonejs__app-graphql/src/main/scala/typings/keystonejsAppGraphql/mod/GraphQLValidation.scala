package typings.keystonejsAppGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLValidation extends js.Object {
   // TODO: fetch the correct type in apollo server validations
  def definitionLimit(limit: Double): js.Any = js.native
  def depthLimit(limit: Double): js.Any = js.native
   // TODO: fetch the correct type in apollo server validations
  def fieldLimit(limit: Double): js.Any = js.native
}

object GraphQLValidation {
  @scala.inline
  def apply(definitionLimit: Double => js.Any, depthLimit: Double => js.Any, fieldLimit: Double => js.Any): GraphQLValidation = {
    val __obj = js.Dynamic.literal(definitionLimit = js.Any.fromFunction1(definitionLimit), depthLimit = js.Any.fromFunction1(depthLimit), fieldLimit = js.Any.fromFunction1(fieldLimit))
    __obj.asInstanceOf[GraphQLValidation]
  }
  @scala.inline
  implicit class GraphQLValidationOps[Self <: GraphQLValidation] (val x: Self) extends AnyVal {
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
    def setDefinitionLimit(value: Double => js.Any): Self = this.set("definitionLimit", js.Any.fromFunction1(value))
    @scala.inline
    def setDepthLimit(value: Double => js.Any): Self = this.set("depthLimit", js.Any.fromFunction1(value))
    @scala.inline
    def setFieldLimit(value: Double => js.Any): Self = this.set("fieldLimit", js.Any.fromFunction1(value))
  }
  
}

