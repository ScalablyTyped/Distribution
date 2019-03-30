package typings
package graphqlLib.typeDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/directives", "GraphQLDirective")
@js.native
class GraphQLDirective protected () extends js.Object {
  def this(config: GraphQLDirectiveConfig) = this()
  var args: js.Array[graphqlLib.typeDefinitionMod.GraphQLArgument] = js.native
  var astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.DirectiveDefinitionNode] = js.native
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  var locations: js.Array[graphqlLib.languageDirectiveLocationMod.DirectiveLocationEnum] = js.native
  var name: java.lang.String = js.native
  def toConfig(): GraphQLDirectiveConfig with graphqlLib.Anon_Args = js.native
}

