package typings.graphql.utilitiesCoerceValueMod

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoercedValue extends js.Object {
  val errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  val value: js.Any
}

object CoercedValue {
  @scala.inline
  def apply(value: js.Any, errors: js.Array[GraphQLError] = null): CoercedValue = {
    val __obj = js.Dynamic.literal(value = value)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[CoercedValue]
  }
}

