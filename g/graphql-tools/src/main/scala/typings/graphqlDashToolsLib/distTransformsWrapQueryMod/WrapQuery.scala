package typings
package graphqlDashToolsLib.distTransformsWrapQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapQuery
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var extractor: js.Any
  var path: js.Any
  var wrapper: js.Any
  @JSName("transformRequest")
  def transformRequest_MWrapQuery(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request
  @JSName("transformResult")
  def transformResult_MWrapQuery(originalResult: graphqlDashToolsLib.distInterfacesMod.Result): graphqlDashToolsLib.distInterfacesMod.Result
}

object WrapQuery {
  @scala.inline
  def apply(
    extractor: js.Any,
    path: js.Any,
    transformRequest: graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request,
    transformResult: graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result,
    wrapper: js.Any,
    transformSchema: /* schema */ graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema = null
  ): WrapQuery = {
    val __obj = js.Dynamic.literal(extractor = extractor, path = path, transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), wrapper = wrapper)
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[WrapQuery]
  }
}

