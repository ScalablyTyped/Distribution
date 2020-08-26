package typings.graphql.astMod

import typings.graphql.graphqlStrings.EnumTypeExtension
import typings.graphql.graphqlStrings.InputObjectTypeExtension
import typings.graphql.graphqlStrings.InterfaceTypeExtension
import typings.graphql.graphqlStrings.ObjectTypeExtension
import typings.graphql.graphqlStrings.ScalarTypeExtension
import typings.graphql.graphqlStrings.SchemaExtension
import typings.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.SchemaExtensionNode
  - typings.graphql.astMod.TypeExtensionNode
*/
trait TypeSystemExtensionNode extends DefinitionNode

object TypeSystemExtensionNode {
  @scala.inline
  def EnumTypeExtensionNode(kind: EnumTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def ScalarTypeExtensionNode(kind: ScalarTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def ObjectTypeExtensionNode(kind: ObjectTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def InterfaceTypeExtensionNode(kind: InterfaceTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def InputObjectTypeExtensionNode(kind: InputObjectTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def UnionTypeExtensionNode(kind: UnionTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def SchemaExtensionNode(kind: SchemaExtension): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
}

