package typings
package graphqlDashToolsLib.distTransformsRenameRootFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameRootFields
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var transformer: js.Any
  @JSName("transformSchema")
  def transformSchema_MRenameRootFields(originalSchema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema
}

object RenameRootFields {
  @scala.inline
  def apply(
    transformSchema: graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema,
    transformer: js.Any,
    transformRequest: /* originalRequest */ graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request = null,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null
  ): RenameRootFields = {
    val __obj = js.Dynamic.literal(transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer)
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[RenameRootFields]
  }
}

