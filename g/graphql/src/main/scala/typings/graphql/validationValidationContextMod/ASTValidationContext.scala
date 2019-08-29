package typings.graphql.validationValidationContextMod

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.FragmentSpreadNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.languageAstMod.SelectionSetNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ASTValidationContext")
@js.native
class ASTValidationContext protected () extends js.Object {
  def this(ast: DocumentNode) = this()
  def getDocument(): DocumentNode = js.native
  def getErrors(): js.Array[GraphQLError] = js.native
  def getFragment(name: String): Maybe[FragmentDefinitionNode] = js.native
  def getFragmentSpreads(node: SelectionSetNode): js.Array[FragmentSpreadNode] = js.native
  def getRecursivelyReferencedFragments(operation: OperationDefinitionNode): js.Array[FragmentDefinitionNode] = js.native
  def reportError(error: GraphQLError): js.UndefOr[scala.Nothing] = js.native
}

