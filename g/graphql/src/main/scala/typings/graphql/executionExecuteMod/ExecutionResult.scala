package typings.graphql.executionExecuteMod

import typings.graphql.errorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResult[TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
}

object ExecutionResult {
  @scala.inline
  def apply[TData](data: TData = null, errors: js.Array[GraphQLError] = null): ExecutionResult[TData] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[ExecutionResult[TData]]
  }
}

