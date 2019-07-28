package typings.graphqlDashTools.distTransformsFilterTypesMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTypes extends Transform {
  var filter: js.Any
  @JSName("transformSchema")
  def transformSchema_MFilterTypes(schema: GraphQLSchema): GraphQLSchema
}

object FilterTypes {
  @scala.inline
  def apply(
    filter: js.Any,
    transformSchema: GraphQLSchema => GraphQLSchema,
    transformRequest: /* originalRequest */ Request => Request = null,
    transformResult: /* result */ Result => Result = null
  ): FilterTypes = {
    val __obj = js.Dynamic.literal(filter = filter, transformSchema = js.Any.fromFunction1(transformSchema))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[FilterTypes]
  }
}

