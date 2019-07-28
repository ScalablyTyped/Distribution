package typings.graphql.utilitiesBuildASTSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DirectiveDefinitionNode
import typings.graphql.languageAstMod.EnumValueDefinitionNode
import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.languageAstMod.NamedTypeNode
import typings.graphql.languageAstMod.TypeDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLEnumValueConfig
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLInputField
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDirectivesMod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", "ASTDefinitionBuilder")
@js.native
class ASTDefinitionBuilder protected () extends js.Object {
  def this(
    typeDefinitionsMap: TypeDefinitionsMap,
    options: Maybe[BuildSchemaOptions],
    resolveType: TypeResolver
  ) = this()
  def buildDirective(directiveNode: DirectiveDefinitionNode): GraphQLDirective = js.native
  def buildEnumValue(value: EnumValueDefinitionNode): GraphQLEnumValueConfig = js.native
  def buildField(field: FieldDefinitionNode): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def buildInputField(value: InputValueDefinitionNode): GraphQLInputField = js.native
  def buildType(node: NamedTypeNode): GraphQLNamedType = js.native
  def buildType(node: TypeDefinitionNode): GraphQLNamedType = js.native
  def buildTypes(nodes: js.Array[NamedTypeNode | TypeDefinitionNode]): js.Array[GraphQLNamedType] = js.native
}

