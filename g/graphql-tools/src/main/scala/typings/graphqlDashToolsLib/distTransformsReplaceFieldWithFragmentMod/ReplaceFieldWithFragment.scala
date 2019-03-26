package typings
package graphqlDashToolsLib.distTransformsReplaceFieldWithFragmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceFieldWithFragment
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var mapping: js.Any
  var targetSchema: js.Any
  @JSName("transformRequest")
  def transformRequest_MReplaceFieldWithFragment(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request
}

object ReplaceFieldWithFragment {
  @scala.inline
  def apply(
    mapping: js.Any,
    targetSchema: js.Any,
    transformRequest: graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null,
    transformSchema: /* schema */ graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema = null
  ): ReplaceFieldWithFragment = {
    val __obj = js.Dynamic.literal(mapping = mapping, targetSchema = targetSchema, transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ReplaceFieldWithFragment]
  }
}

