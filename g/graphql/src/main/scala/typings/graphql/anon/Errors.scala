package typings.graphql.anon

import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends CoercedVariableValues {
  var errors: js.Array[GraphQLError]
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[GraphQLError]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

