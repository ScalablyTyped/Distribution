package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.DirectiveDefinition
import typings.graphql.graphqlStrings.EnumTypeDefinition
import typings.graphql.graphqlStrings.InputObjectTypeDefinition
import typings.graphql.graphqlStrings.InterfaceTypeDefinition
import typings.graphql.graphqlStrings.ObjectTypeDefinition
import typings.graphql.graphqlStrings.ScalarTypeDefinition
import typings.graphql.graphqlStrings.SchemaDefinition
import typings.graphql.graphqlStrings.UnionTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.languageAstMod.SchemaDefinitionNode
  - typings.graphql.languageAstMod.TypeDefinitionNode
  - typings.graphql.languageAstMod.DirectiveDefinitionNode
*/
trait TypeSystemDefinitionNode extends DefinitionNode

object TypeSystemDefinitionNode {
  @scala.inline
  def ObjectTypeDefinitionNode(
    kind: ObjectTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    interfaces: js.Array[NamedTypeNode] = null,
    loc: Location = null
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def UnionTypeDefinitionNode(
    kind: UnionTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    types: js.Array[NamedTypeNode] = null
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def InputObjectTypeDefinitionNode(
    kind: InputObjectTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[InputValueDefinitionNode] = null,
    loc: Location = null
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def SchemaDefinitionNode(
    kind: SchemaDefinition,
    operationTypes: js.Array[OperationTypeDefinitionNode],
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def ScalarTypeDefinitionNode(
    kind: ScalarTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
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
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def InterfaceTypeDefinitionNode(
    kind: InterfaceTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    loc: Location = null
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def EnumTypeDefinitionNode(
    kind: EnumTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    values: js.Array[EnumValueDefinitionNode] = null
  ): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
}

