package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/getOperationAST", JSImport.Namespace)
@js.native
object utilitiesGetOperationASTMod extends js.Object {
  def getOperationAST(
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.OperationDefinitionNode] = js.native
}

