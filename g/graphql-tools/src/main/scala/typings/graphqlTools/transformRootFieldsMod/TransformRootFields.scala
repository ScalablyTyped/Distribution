package typings.graphqlTools.transformRootFieldsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.Request
import typings.graphqlTools.interfacesMod.Result
import typings.graphqlTools.interfacesMod.Transform
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
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[TransformRootFields]
  }
}

