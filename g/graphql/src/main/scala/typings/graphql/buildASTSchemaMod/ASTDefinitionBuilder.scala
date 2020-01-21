package typings.graphql.buildASTSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.astMod.NamedTypeNode
import typings.graphql.astMod.TypeDefinitionNode
import typings.graphql.astMod.TypeNode
import typings.graphql.definitionMod.GraphQLArgumentConfig
import typings.graphql.definitionMod.GraphQLEnumValueConfig
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLInputFieldConfig
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", "ASTDefinitionBuilder")
@js.native
class ASTDefinitionBuilder protected () extends js.Object {
  def this(options: Maybe[BuildSchemaOptions], resolveType: TypeResolver) = this()
  def buildArg(value: InputValueDefinitionNode): GraphQLArgumentConfig = js.native
  def buildDirective(directive: DirectiveDefinitionNode): GraphQLDirective = js.native
  def buildEnumValue(value: EnumValueDefinitionNode): GraphQLEnumValueConfig = js.native
  def buildField(field: FieldDefinitionNode): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def buildInputField(value: InputValueDefinitionNode): GraphQLInputFieldConfig = js.native
  def buildType(node: NamedTypeNode): GraphQLNamedType = js.native
  def buildType(node: TypeDefinitionNode): GraphQLNamedType = js.native
  def getNamedType(node: NamedTypeNode): GraphQLNamedType = js.native
  def getWrappedType(node: TypeNode): GraphQLType = js.native
}

