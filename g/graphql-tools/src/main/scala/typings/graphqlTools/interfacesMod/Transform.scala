package typings.graphqlTools.interfacesMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var transformRequest: js.UndefOr[js.Function1[/* originalRequest */ Request, Request]] = js.undefined
  var transformResult: js.UndefOr[js.Function1[/* result */ Result, Result]] = js.undefined
  var transformSchema: js.UndefOr[js.Function1[/* schema */ GraphQLSchema, GraphQLSchema]] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    transformRequest: /* originalRequest */ Request => Request = null,
    transformResult: /* result */ Result => Result = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[Transform]
  }
}

