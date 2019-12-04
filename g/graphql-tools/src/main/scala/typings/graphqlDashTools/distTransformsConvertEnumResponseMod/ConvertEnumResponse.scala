package typings.graphqlDashTools.distTransformsConvertEnumResponseMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertEnumResponse extends Transform {
  var enumNode: js.Any
  @JSName("transformResult")
  def transformResult_MConvertEnumResponse(result: js.Any): js.Any
}

object ConvertEnumResponse {
  @scala.inline
  def apply(
    enumNode: js.Any,
    transformResult: js.Any => js.Any,
    transformRequest: /* originalRequest */ Request => Request = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): ConvertEnumResponse = {
    val __obj = js.Dynamic.literal(enumNode = enumNode.asInstanceOf[js.Any], transformResult = js.Any.fromFunction1(transformResult))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ConvertEnumResponse]
  }
}

