package typings.graphqlToolsStitch

import typings.graphql.astMod.DefinitionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/stitch/typeFromAST", JSImport.Namespace)
@js.native
object typeFromASTMod extends js.Object {
  def default(node: DefinitionNode): GraphQLNamedType | GraphQLDirective | Null = js.native
  def getBlockStringIndentation(lines: js.Array[String]): Double = js.native
}

