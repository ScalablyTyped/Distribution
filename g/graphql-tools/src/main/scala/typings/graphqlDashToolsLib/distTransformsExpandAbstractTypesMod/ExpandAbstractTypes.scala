package typings
package graphqlDashToolsLib.distTransformsExpandAbstractTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandAbstractTypes
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var mapping: js.Any
  var reverseMapping: js.Any
  var targetSchema: js.Any
  @JSName("transformRequest")
  def transformRequest_MExpandAbstractTypes(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request
}

object ExpandAbstractTypes {
  @scala.inline
  def apply(
    mapping: js.Any,
    reverseMapping: js.Any,
    targetSchema: js.Any,
    transformRequest: graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null,
    transformSchema: /* schema */ graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema = null
  ): ExpandAbstractTypes = {
    val __obj = js.Dynamic.literal(mapping = mapping, reverseMapping = reverseMapping, targetSchema = targetSchema, transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ExpandAbstractTypes]
  }
}

