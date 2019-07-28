package typings.graphqlDashTools.distTransformsExtractFieldMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractField extends Transform {
  var from: js.Any
  var to: js.Any
  @JSName("transformRequest")
  def transformRequest_MExtractField(originalRequest: Request): Request
}

object ExtractField {
  @scala.inline
  def apply(
    from: js.Any,
    to: js.Any,
    transformRequest: Request => Request,
    transformResult: /* result */ Result => Result = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): ExtractField = {
    val __obj = js.Dynamic.literal(from = from, to = to, transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ExtractField]
  }
}

