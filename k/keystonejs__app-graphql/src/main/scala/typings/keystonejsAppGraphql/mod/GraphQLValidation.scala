package typings.keystonejsAppGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLValidation extends js.Object {
   // TODO: fetch the correct type in apollo server validations
  def definitionLimit(limit: Double): js.Any
  def depthLimit(limit: Double): js.Any
   // TODO: fetch the correct type in apollo server validations
  def fieldLimit(limit: Double): js.Any
}

object GraphQLValidation {
  @scala.inline
  def apply(definitionLimit: Double => js.Any, depthLimit: Double => js.Any, fieldLimit: Double => js.Any): GraphQLValidation = {
    val __obj = js.Dynamic.literal(definitionLimit = js.Any.fromFunction1(definitionLimit), depthLimit = js.Any.fromFunction1(depthLimit), fieldLimit = js.Any.fromFunction1(fieldLimit))
    __obj.asInstanceOf[GraphQLValidation]
  }
}

