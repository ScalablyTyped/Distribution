package typings.graphqlDashTools.distTransformsWrapQueryMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapQuery extends Transform {
  var extractor: js.Any
  var path: js.Any
  var wrapper: js.Any
  @JSName("transformRequest")
  def transformRequest_MWrapQuery(originalRequest: Request): Request
  @JSName("transformResult")
  def transformResult_MWrapQuery(originalResult: Result): Result
}

object WrapQuery {
  @scala.inline
  def apply(
    extractor: js.Any,
    path: js.Any,
    transformRequest: Request => Request,
    transformResult: Result => Result,
    wrapper: js.Any,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): WrapQuery = {
    val __obj = js.Dynamic.literal(extractor = extractor, path = path, transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), wrapper = wrapper)
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[WrapQuery]
  }
}

