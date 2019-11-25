package typings.graphqlDashTools.distTransformsAddArgumentsAsVariablesMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddArgumentsAsVariablesTransform extends Transform {
  var args: js.Any
  var schema: js.Any
  @JSName("transformRequest")
  def transformRequest_MAddArgumentsAsVariablesTransform(originalRequest: Request): Request
}

object AddArgumentsAsVariablesTransform {
  @scala.inline
  def apply(
    args: js.Any,
    schema: js.Any,
    transformRequest: Request => Request,
    transformResult: /* result */ Result => Result = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): AddArgumentsAsVariablesTransform = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[AddArgumentsAsVariablesTransform]
  }
}

