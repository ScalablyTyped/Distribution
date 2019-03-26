package typings
package graphqlDashToolsLib.distTransformsFilterTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTypes
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var filter: js.Any
  @JSName("transformSchema")
  def transformSchema_MFilterTypes(schema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema
}

object FilterTypes {
  @scala.inline
  def apply(
    filter: js.Any,
    transformSchema: graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema,
    transformRequest: /* originalRequest */ graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request = null,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null
  ): FilterTypes = {
    val __obj = js.Dynamic.literal(filter = filter, transformSchema = js.Any.fromFunction1(transformSchema))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[FilterTypes]
  }
}

