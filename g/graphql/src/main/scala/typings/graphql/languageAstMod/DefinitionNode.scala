package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.DirectiveDefinition
import typings.graphql.graphqlStrings.EnumTypeDefinition
import typings.graphql.graphqlStrings.EnumTypeExtension
import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.graphqlStrings.InputObjectTypeDefinition
import typings.graphql.graphqlStrings.InputObjectTypeExtension
import typings.graphql.graphqlStrings.InterfaceTypeDefinition
import typings.graphql.graphqlStrings.InterfaceTypeExtension
import typings.graphql.graphqlStrings.ObjectTypeDefinition
import typings.graphql.graphqlStrings.ObjectTypeExtension
import typings.graphql.graphqlStrings.OperationDefinition
import typings.graphql.graphqlStrings.ScalarTypeDefinition
import typings.graphql.graphqlStrings.ScalarTypeExtension
import typings.graphql.graphqlStrings.SchemaDefinition
import typings.graphql.graphqlStrings.SchemaExtension
import typings.graphql.graphqlStrings.UnionTypeDefinition
import typings.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.languageAstMod.ExecutableDefinitionNode
  - typings.graphql.languageAstMod.TypeSystemDefinitionNode
  - typings.graphql.languageAstMod.TypeSystemExtensionNode
*/
trait DefinitionNode extends js.Object

object DefinitionNode {
  @scala.inline
  def ObjectTypeDefinitionNode(
    kind: ObjectTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    interfaces: js.Array[NamedTypeNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def UnionTypeExtensionNode(
    kind: UnionTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    types: js.Array[NamedTypeNode] = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def UnionTypeDefinitionNode(
    kind: UnionTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    types: js.Array[NamedTypeNode] = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def InputObjectTypeDefinitionNode(
    kind: InputObjectTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[InputValueDefinitionNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def SchemaDefinitionNode(
    kind: SchemaDefinition,
    operationTypes: js.Array[OperationTypeDefinitionNode],
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    variableDefinitions: js.Array[VariableDefinitionNode] = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def ObjectTypeExtensionNode(
    kind: ObjectTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    interfaces: js.Array[NamedTypeNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def InputObjectTypeExtensionNode(
    kind: InputObjectTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[InputValueDefinitionNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def ScalarTypeDefinitionNode(
    kind: ScalarTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def DirectiveDefinitionNode(
    kind: DirectiveDefinition,
    locations: js.Array[NameNode],
    name: NameNode,
    repeatable: Boolean,
    arguments: js.Array[InputValueDefinitionNode] = null,
    description: StringValueNode = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def InterfaceTypeExtensionNode(
    kind: InterfaceTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def SchemaExtensionNode(
    kind: SchemaExtension,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    operationTypes: js.Array[OperationTypeDefinitionNode] = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (operationTypes != null) __obj.updateDynamic("operationTypes")(operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def InterfaceTypeDefinitionNode(
    kind: InterfaceTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def EnumTypeDefinitionNode(
    kind: EnumTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    values: js.Array[EnumValueDefinitionNode] = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def ScalarTypeExtensionNode(
    kind: ScalarTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def EnumTypeExtensionNode(
    kind: EnumTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    values: js.Array[EnumValueDefinitionNode] = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def OperationDefinitionNode(
    kind: OperationDefinition,
    operation: OperationTypeNode,
    selectionSet: SelectionSetNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    name: NameNode = null,
    variableDefinitions: js.Array[VariableDefinitionNode] = null
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
}

