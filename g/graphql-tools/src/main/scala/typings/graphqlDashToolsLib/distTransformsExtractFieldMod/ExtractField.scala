package typings
package graphqlDashToolsLib.distTransformsExtractFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractField
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var from: js.Any
  var to: js.Any
  @JSName("transformRequest")
  def transformRequest_MExtractField(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request
}

object ExtractField {
  @scala.inline
  def apply(
    from: js.Any,
    to: js.Any,
    transformRequest: graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null,
    transformSchema: /* schema */ graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema = null
  ): ExtractField = {
    val __obj = js.Dynamic.literal(from = from, to = to, transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ExtractField]
  }
}

