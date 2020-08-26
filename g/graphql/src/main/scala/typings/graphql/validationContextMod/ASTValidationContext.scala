package typings.graphql.validationContextMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.FragmentSpreadNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ASTValidationContext")
@js.native
class ASTValidationContext protected () extends js.Object {
  def this(ast: DocumentNode, onError: js.Function1[/* err */ GraphQLError, Unit]) = this()
  def getDocument(): DocumentNode = js.native
  def getFragment(name: String): Maybe[FragmentDefinitionNode] = js.native
  def getFragmentSpreads(node: SelectionSetNode): js.Array[FragmentSpreadNode] = js.native
  def getRecursivelyReferencedFragments(operation: OperationDefinitionNode): js.Array[FragmentDefinitionNode] = js.native
  def reportError(error: GraphQLError): js.UndefOr[scala.Nothing] = js.native
}

