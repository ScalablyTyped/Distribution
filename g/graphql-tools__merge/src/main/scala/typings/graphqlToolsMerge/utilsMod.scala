package typings.graphqlToolsMerge

import typings.graphql.astMod.DefinitionNode
import typings.graphql.astMod.NamedTypeNode
import typings.graphql.astMod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def extractType(`type`: TypeNode): NamedTypeNode = js.native
  def isGraphQLDirective(definition: DefinitionNode): /* is graphql.graphql/language/ast.DirectiveDefinitionNode */ Boolean = js.native
  def isGraphQLEnum(definition: DefinitionNode): /* is graphql.graphql/language/ast.EnumTypeDefinitionNode */ Boolean = js.native
  def isGraphQLEnumExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.EnumTypeExtensionNode */ Boolean = js.native
  def isGraphQLInputType(definition: DefinitionNode): /* is graphql.graphql/language/ast.InputObjectTypeDefinitionNode */ Boolean = js.native
  def isGraphQLInputTypeExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.InputObjectTypeExtensionNode */ Boolean = js.native
  def isGraphQLInterface(definition: DefinitionNode): /* is graphql.graphql/language/ast.InterfaceTypeDefinitionNode */ Boolean = js.native
  def isGraphQLInterfaceExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.InterfaceTypeExtensionNode */ Boolean = js.native
  def isGraphQLScalar(definition: DefinitionNode): /* is graphql.graphql/language/ast.ScalarTypeDefinitionNode */ Boolean = js.native
  def isGraphQLScalarExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.ScalarTypeExtensionNode */ Boolean = js.native
  def isGraphQLType(definition: DefinitionNode): /* is graphql.graphql/language/ast.ObjectTypeDefinitionNode */ Boolean = js.native
  def isGraphQLTypeExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.ObjectTypeExtensionNode */ Boolean = js.native
  def isGraphQLUnion(definition: DefinitionNode): /* is graphql.graphql/language/ast.UnionTypeDefinitionNode */ Boolean = js.native
  def isGraphQLUnionExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.UnionTypeExtensionNode */ Boolean = js.native
  def isListTypeNode(`type`: TypeNode): /* is graphql.graphql/language/ast.ListTypeNode */ Boolean = js.native
  def isNonNullTypeNode(`type`: TypeNode): /* is graphql.graphql/language/ast.NonNullTypeNode */ Boolean = js.native
  def isSchemaDefinition(node: DefinitionNode): /* is graphql.graphql/language/ast.SchemaDefinitionNode */ Boolean = js.native
  def isSourceTypes(types: js.Any): /* is graphql.graphql.Source */ Boolean = js.native
  def isStringTypes(types: js.Any): /* is string */ Boolean = js.native
  def isWrappingTypeNode(`type`: TypeNode): Boolean = js.native
  def printTypeNode(`type`: TypeNode): String = js.native
}

