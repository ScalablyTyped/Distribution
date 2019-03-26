package typings
package graphqlDashToolsLib.distTransformsAddArgumentsAsVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddArgumentsAsVariablesTransform
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var args: js.Any
  var schema: js.Any
  @JSName("transformRequest")
  def transformRequest_MAddArgumentsAsVariablesTransform(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request
}

object AddArgumentsAsVariablesTransform {
  @scala.inline
  def apply(
    args: js.Any,
    schema: js.Any,
    transformRequest: graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null,
    transformSchema: /* schema */ graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema = null
  ): AddArgumentsAsVariablesTransform = {
    val __obj = js.Dynamic.literal(args = args, schema = schema, transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[AddArgumentsAsVariablesTransform]
  }
}

