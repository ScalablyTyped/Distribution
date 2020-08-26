package typings.graphql.astMod

import typings.graphql.graphqlStrings.EnumTypeDefinition
import typings.graphql.graphqlStrings.InputObjectTypeDefinition
import typings.graphql.graphqlStrings.InterfaceTypeDefinition
import typings.graphql.graphqlStrings.ObjectTypeDefinition
import typings.graphql.graphqlStrings.ScalarTypeDefinition
import typings.graphql.graphqlStrings.UnionTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.ScalarTypeDefinitionNode
  - typings.graphql.astMod.ObjectTypeDefinitionNode
  - typings.graphql.astMod.InterfaceTypeDefinitionNode
  - typings.graphql.astMod.UnionTypeDefinitionNode
  - typings.graphql.astMod.EnumTypeDefinitionNode
  - typings.graphql.astMod.InputObjectTypeDefinitionNode
*/
trait TypeDefinitionNode extends TypeSystemDefinitionNode

object TypeDefinitionNode {
  @scala.inline
  def InputObjectTypeDefinitionNode(kind: InputObjectTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def ScalarTypeDefinitionNode(kind: ScalarTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def ObjectTypeDefinitionNode(kind: ObjectTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def UnionTypeDefinitionNode(kind: UnionTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def EnumTypeDefinitionNode(kind: EnumTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def InterfaceTypeDefinitionNode(kind: InterfaceTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
}

