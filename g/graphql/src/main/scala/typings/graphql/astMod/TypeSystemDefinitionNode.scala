package typings.graphql.astMod

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
  - typings.graphql.astMod.SchemaDefinitionNode
  - typings.graphql.astMod.TypeDefinitionNode
  - typings.graphql.astMod.DirectiveDefinitionNode
*/
trait TypeSystemDefinitionNode extends DefinitionNode

object TypeSystemDefinitionNode {
  @scala.inline
  def InputObjectTypeDefinitionNode(kind: InputObjectTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def ScalarTypeDefinitionNode(kind: ScalarTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def SchemaDefinitionNode(kind: SchemaDefinition, operationTypes: js.Array[OperationTypeDefinitionNode]): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def ObjectTypeDefinitionNode(kind: ObjectTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def UnionTypeDefinitionNode(kind: UnionTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def EnumTypeDefinitionNode(kind: EnumTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def InterfaceTypeDefinitionNode(kind: InterfaceTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  @scala.inline
  def DirectiveDefinitionNode(kind: DirectiveDefinition, locations: js.Array[NameNode], name: NameNode, repeatable: Boolean): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
}

