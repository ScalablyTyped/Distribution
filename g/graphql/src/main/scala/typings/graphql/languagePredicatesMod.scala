package typings.graphql

import typings.graphql.languageAstMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/predicates", JSImport.Namespace)
@js.native
object languagePredicatesMod extends js.Object {
  def isDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ Boolean = js.native
  def isExecutableDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ Boolean = js.native
  def isSelectionNode(node: ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ Boolean = js.native
  def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
  def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  def isTypeNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeNode */ Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
}

