package typings.graphqlTools.wrapQueryMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.Request
import typings.graphqlTools.interfacesMod.Result
import typings.graphqlTools.interfacesMod.Transform
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
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), wrapper = wrapper.asInstanceOf[js.Any])
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[WrapQuery]
  }
}

