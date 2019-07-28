package typings.graphqlDashTools.distTransformsTransformRootFieldsMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformRootFields extends Transform {
  var transform: js.Any
  @JSName("transformSchema")
  def transformSchema_MTransformRootFields(originalSchema: GraphQLSchema): GraphQLSchema
}

object TransformRootFields {
  @scala.inline
  def apply(
    transform: js.Any,
    transformSchema: GraphQLSchema => GraphQLSchema,
    transformRequest: /* originalRequest */ Request => Request = null,
    transformResult: /* result */ Result => Result = null
  ): TransformRootFields = {
    val __obj = js.Dynamic.literal(transform = transform, transformSchema = js.Any.fromFunction1(transformSchema))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[TransformRootFields]
  }
}

