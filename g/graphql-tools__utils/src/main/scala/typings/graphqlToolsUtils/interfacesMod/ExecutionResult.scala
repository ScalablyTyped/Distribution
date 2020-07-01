package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.executeMod.ExecutionResultDataDefault
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResult[TData]
  extends typings.graphql.executeMod.ExecutionResult[ExecutionResultDataDefault] {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
}

object ExecutionResult {
  @scala.inline
  def apply[TData](
    data: js.UndefOr[Null | ExecutionResultDataDefault] = js.undefined,
    errors: js.Array[GraphQLError] = null,
    extensions: Record[String, _] = null
  ): ExecutionResult[TData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionResult[TData]]
  }
}

