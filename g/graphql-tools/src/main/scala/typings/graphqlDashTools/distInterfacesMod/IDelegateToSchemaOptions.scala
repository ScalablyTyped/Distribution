package typings.graphqlDashTools.distInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelegateToSchemaOptions[TContext] extends js.Object {
  var args: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var context: TContext
  var fieldName: String
  var info: IGraphQLToolsResolveInfo
  var operation: Operation
  var schema: GraphQLSchema
  var skipValidation: js.UndefOr[Boolean] = js.undefined
  var transforms: js.UndefOr[js.Array[Transform]] = js.undefined
}

object IDelegateToSchemaOptions {
  @scala.inline
  def apply[TContext](
    context: TContext,
    fieldName: String,
    info: IGraphQLToolsResolveInfo,
    operation: Operation,
    schema: GraphQLSchema,
    args: StringDictionary[js.Any] = null,
    skipValidation: js.UndefOr[Boolean] = js.undefined,
    transforms: js.Array[Transform] = null
  ): IDelegateToSchemaOptions[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fieldName = fieldName, info = info, operation = operation, schema = schema)
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    __obj.asInstanceOf[IDelegateToSchemaOptions[TContext]]
  }
}

