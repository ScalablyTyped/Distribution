package typings.graphql.anon

import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coerced extends CoercedVariableValues {
  var coerced: js.UndefOr[scala.Nothing] = js.native
  var errors: js.Array[GraphQLError] = js.native
}

object Coerced {
  @scala.inline
  def apply(errors: js.Array[GraphQLError]): Coerced = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coerced]
  }
  @scala.inline
  implicit class CoercedOps[Self <: Coerced] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

