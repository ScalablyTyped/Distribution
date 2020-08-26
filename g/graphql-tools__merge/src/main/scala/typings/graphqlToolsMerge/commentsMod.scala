package typings.graphqlToolsMerge

import typings.graphql.astMod.ASTNode
import typings.graphql.astMod.TypeDefinitionNode
import typings.graphqlToolsMerge.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/comments", JSImport.Namespace)
@js.native
object commentsMod extends js.Object {
  def collectComment(node: TypeDefinitionNode): Unit = js.native
  def printComment(comment: String): String = js.native
  def printWithComments(ast: ASTNode): js.Any = js.native
  def pushComment(node: Description, entity: String): Unit = js.native
  def pushComment(node: Description, entity: String, field: js.UndefOr[scala.Nothing], argument: String): Unit = js.native
  def pushComment(node: Description, entity: String, field: String): Unit = js.native
  def pushComment(node: Description, entity: String, field: String, argument: String): Unit = js.native
  def resetComments(): Unit = js.native
}

