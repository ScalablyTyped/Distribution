package typings
package graphqlLib.utilitiesBuildASTSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", "ASTDefinitionBuilder")
@js.native
class ASTDefinitionBuilder protected () extends js.Object {
  def this(typeDefinitionsMap: TypeDefinitionsMap, options: graphqlLib.tsutilsMaybeMod.Maybe[BuildSchemaOptions], resolveType: TypeResolver) = this()
  def buildDirective(directiveNode: graphqlLib.languageAstMod.DirectiveDefinitionNode): graphqlLib.typeDirectivesMod.GraphQLDirective = js.native
  def buildEnumValue(value: graphqlLib.languageAstMod.EnumValueDefinitionNode): graphqlLib.typeDefinitionMod.GraphQLEnumValueConfig = js.native
  def buildField(field: graphqlLib.languageAstMod.FieldDefinitionNode): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def buildInputField(value: graphqlLib.languageAstMod.InputValueDefinitionNode): graphqlLib.typeDefinitionMod.GraphQLInputField = js.native
  def buildType(node: graphqlLib.languageAstMod.NamedTypeNode): graphqlLib.typeDefinitionMod.GraphQLNamedType = js.native
  def buildType(node: graphqlLib.languageAstMod.TypeDefinitionNode): graphqlLib.typeDefinitionMod.GraphQLNamedType = js.native
  def buildTypes(
    nodes: js.Array[
      graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.TypeDefinitionNode
    ]
  ): js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
}

