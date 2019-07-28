package typings.graphqlDashTools.distTransformsExpandAbstractTypesMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandAbstractTypes extends Transform {
  var mapping: js.Any
  var reverseMapping: js.Any
  var targetSchema: js.Any
  @JSName("transformRequest")
  def transformRequest_MExpandAbstractTypes(originalRequest: Request): Request
}

object ExpandAbstractTypes {
  @scala.inline
  def apply(
    mapping: js.Any,
    reverseMapping: js.Any,
    targetSchema: js.Any,
    transformRequest: Request => Request,
    transformResult: /* result */ Result => Result = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): ExpandAbstractTypes = {
    val __obj = js.Dynamic.literal(mapping = mapping, reverseMapping = reverseMapping, targetSchema = targetSchema, transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ExpandAbstractTypes]
  }
}

