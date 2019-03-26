package typings
package graphqlDashToolsLib.distTransformsTransformRootFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformRootFields
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var transform: js.Any
  @JSName("transformSchema")
  def transformSchema_MTransformRootFields(originalSchema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema
}

object TransformRootFields {
  @scala.inline
  def apply(
    transform: js.Any,
    transformSchema: graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema,
    transformRequest: /* originalRequest */ graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request = null,
    transformResult: /* result */ graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result = null
  ): TransformRootFields = {
    val __obj = js.Dynamic.literal(transform = transform, transformSchema = js.Any.fromFunction1(transformSchema))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[TransformRootFields]
  }
}

