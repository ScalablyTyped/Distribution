package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var transformRequest: js.UndefOr[RequestTransform] = js.undefined
  var transformResult: js.UndefOr[ResultTransform] = js.undefined
  var transformSchema: js.UndefOr[SchemaTransform] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    transformRequest: (/* originalRequest */ Request, /* delegationContext */ js.UndefOr[Record[String, js.Any]], /* transformationContext */ js.UndefOr[Record[String, js.Any]]) => Request = null,
    transformResult: (/* originalResult */ ExecutionResult[Record[String, js.Any]], /* delegationContext */ js.UndefOr[Record[String, js.Any]], /* transformationContext */ js.UndefOr[Record[String, js.Any]]) => ExecutionResult[Record[String, js.Any]] = null,
    transformSchema: /* originalSchema */ GraphQLSchema => GraphQLSchema = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction3(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction3(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[Transform]
  }
}

