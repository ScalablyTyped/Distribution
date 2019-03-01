package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralIdentifyingRootFieldConfig extends js.Object {
  var argName: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var inputType: graphqlLib.typeDefinitionMod.GraphQLInputType
  var outputType: graphqlLib.typeDefinitionMod.GraphQLOutputType
  def resolveSingleInput(input: js.Any, context: js.Any, info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo): js.Any
}

object PluralIdentifyingRootFieldConfig {
  @scala.inline
  def apply(
    argName: java.lang.String,
    inputType: graphqlLib.typeDefinitionMod.GraphQLInputType,
    outputType: graphqlLib.typeDefinitionMod.GraphQLOutputType,
    resolveSingleInput: js.Function3[js.Any, js.Any, graphqlLib.typeDefinitionMod.GraphQLResolveInfo, js.Any],
    description: java.lang.String = null
  ): PluralIdentifyingRootFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argName")(argName)
    __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    __obj.updateDynamic("outputType")(outputType.asInstanceOf[js.Any])
    __obj.updateDynamic("resolveSingleInput")(resolveSingleInput)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[PluralIdentifyingRootFieldConfig]
  }
}

