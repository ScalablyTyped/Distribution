package typings.graphql.executionValuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.errorGraphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoercedVariableValues extends js.Object {
  var coerced: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
}

object CoercedVariableValues {
  @scala.inline
  def apply(coerced: StringDictionary[js.Any] = null, errors: js.Array[GraphQLError] = null): CoercedVariableValues = {
    val __obj = js.Dynamic.literal()
    if (coerced != null) __obj.updateDynamic("coerced")(coerced)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[CoercedVariableValues]
  }
}

