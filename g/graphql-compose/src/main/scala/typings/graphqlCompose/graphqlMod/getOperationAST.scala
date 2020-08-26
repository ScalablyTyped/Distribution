package typings.graphqlCompose.graphqlMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "getOperationAST")
@js.native
object getOperationAST extends js.Object {
  def apply(documentAST: DocumentNode): Maybe[OperationDefinitionNode] = js.native
  def apply(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
}

