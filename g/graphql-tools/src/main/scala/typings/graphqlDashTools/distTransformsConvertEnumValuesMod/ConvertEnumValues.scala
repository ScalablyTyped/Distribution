package typings.graphqlDashTools.distTransformsConvertEnumValuesMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertEnumValues extends Transform {
  var enumValueMap: js.Any
  @JSName("transformSchema")
  def transformSchema_MConvertEnumValues(schema: GraphQLSchema): GraphQLSchema
}

object ConvertEnumValues {
  @scala.inline
  def apply(
    enumValueMap: js.Any,
    transformSchema: GraphQLSchema => GraphQLSchema,
    transformRequest: /* originalRequest */ Request => Request = null,
    transformResult: /* result */ Result => Result = null
  ): ConvertEnumValues = {
    val __obj = js.Dynamic.literal(enumValueMap = enumValueMap.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[ConvertEnumValues]
  }
}

