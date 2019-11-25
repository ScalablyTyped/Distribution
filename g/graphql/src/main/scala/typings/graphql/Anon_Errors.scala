package typings.graphql

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.executionValuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends CoercedVariableValues {
  var errors: js.Array[GraphQLError]
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[GraphQLError]): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

