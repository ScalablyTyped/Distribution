package typings.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLSchema
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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelegateToSchemaOptions[TContext]]
  }
}

