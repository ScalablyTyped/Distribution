package typings.graphql

import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/getOperationAST", JSImport.Namespace)
@js.native
object utilitiesGetOperationASTMod extends js.Object {
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
}

