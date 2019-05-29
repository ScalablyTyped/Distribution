package typings
package graphqlLib.executionValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoercedVariableValues extends js.Object {
  var coerced: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError]] = js.undefined
}

object CoercedVariableValues {
  @scala.inline
  def apply(
    coerced: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    errors: js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = null
  ): CoercedVariableValues = {
    val __obj = js.Dynamic.literal()
    if (coerced != null) __obj.updateDynamic("coerced")(coerced)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[CoercedVariableValues]
  }
}

