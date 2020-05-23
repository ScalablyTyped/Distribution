package typings.graphql.directivesMod

import typings.graphql.anon.GraphQLDirectiveConfigarg
import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/directives", "GraphQLDirective")
@js.native
class GraphQLDirective protected () extends js.Object {
  def this(config: GraphQLDirectiveConfig) = this()
  var args: js.Array[GraphQLArgument] = js.native
  var astNode: Maybe[DirectiveDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var isRepeatable: Boolean = js.native
  var locations: js.Array[DirectiveLocationEnum] = js.native
  var name: String = js.native
  def toConfig(): GraphQLDirectiveConfigarg = js.native
}

