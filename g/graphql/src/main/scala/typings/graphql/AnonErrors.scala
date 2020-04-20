package typings.graphql

import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends CoercedVariableValues {
  var errors: js.Array[GraphQLError]
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[GraphQLError]): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
}

