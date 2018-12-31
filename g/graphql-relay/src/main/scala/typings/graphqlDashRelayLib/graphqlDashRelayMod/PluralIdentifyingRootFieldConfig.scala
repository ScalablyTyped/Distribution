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

