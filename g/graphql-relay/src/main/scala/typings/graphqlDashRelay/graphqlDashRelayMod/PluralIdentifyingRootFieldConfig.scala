package typings.graphqlDashRelay.graphqlDashRelayMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralIdentifyingRootFieldConfig extends js.Object {
  var argName: String
  var description: js.UndefOr[String] = js.undefined
  var inputType: GraphQLInputType
  var outputType: GraphQLOutputType
  def resolveSingleInput(input: js.Any, context: js.Any, info: GraphQLResolveInfo): js.Any
}

object PluralIdentifyingRootFieldConfig {
  @scala.inline
  def apply(
    argName: String,
    inputType: GraphQLInputType,
    outputType: GraphQLOutputType,
    resolveSingleInput: (js.Any, js.Any, GraphQLResolveInfo) => js.Any,
    description: String = null
  ): PluralIdentifyingRootFieldConfig = {
    val __obj = js.Dynamic.literal(argName = argName.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], resolveSingleInput = js.Any.fromFunction3(resolveSingleInput))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralIdentifyingRootFieldConfig]
  }
}

