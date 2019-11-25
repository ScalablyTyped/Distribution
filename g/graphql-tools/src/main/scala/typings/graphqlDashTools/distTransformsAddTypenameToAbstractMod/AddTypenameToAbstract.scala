package typings.graphqlDashTools.distTransformsAddTypenameToAbstractMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTypenameToAbstract extends Transform {
  var targetSchema: js.Any
  @JSName("transformRequest")
  def transformRequest_MAddTypenameToAbstract(originalRequest: Request): Request
}

object AddTypenameToAbstract {
  @scala.inline
  def apply(
    targetSchema: js.Any,
    transformRequest: Request => Request,
    transformResult: /* result */ Result => Result = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): AddTypenameToAbstract = {
    val __obj = js.Dynamic.literal(targetSchema = targetSchema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[AddTypenameToAbstract]
  }
}

