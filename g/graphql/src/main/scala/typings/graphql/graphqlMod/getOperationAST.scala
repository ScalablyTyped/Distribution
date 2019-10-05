package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getOperationAST")
@js.native
object getOperationAST extends js.Object {
  def apply(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
}

