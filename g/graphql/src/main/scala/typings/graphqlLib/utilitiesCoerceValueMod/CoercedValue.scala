package typings
package graphqlLib.utilitiesCoerceValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoercedValue extends js.Object {
  val errors: js.UndefOr[js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError]]
  val value: js.Any
}

object CoercedValue {
  @scala.inline
  def apply(value: js.Any, errors: js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = null): CoercedValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[CoercedValue]
  }
}

