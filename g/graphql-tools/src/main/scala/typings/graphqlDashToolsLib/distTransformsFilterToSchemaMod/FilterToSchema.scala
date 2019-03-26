package typings
package graphqlDashToolsLib.distTransformsFilterToSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterToSchema
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var targetSchema: js.Any
  @JSName("transformRequest")
  def transformRequest_MFilterToSchema(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request
}

object FilterToSchema {
  @scala.inline
  def apply(
    targetSchema: js.Any,
    transformRequest: graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null,
    transformSchema: /* schema */ graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema = null
  ): FilterToSchema = {
    val __obj = js.Dynamic.literal(targetSchema = targetSchema, transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[FilterToSchema]
  }
}

