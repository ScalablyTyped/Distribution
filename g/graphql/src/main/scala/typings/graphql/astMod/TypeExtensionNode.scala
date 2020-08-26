package typings.graphql.astMod

import typings.graphql.graphqlStrings.EnumTypeExtension
import typings.graphql.graphqlStrings.InputObjectTypeExtension
import typings.graphql.graphqlStrings.InterfaceTypeExtension
import typings.graphql.graphqlStrings.ObjectTypeExtension
import typings.graphql.graphqlStrings.ScalarTypeExtension
import typings.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.ScalarTypeExtensionNode
  - typings.graphql.astMod.ObjectTypeExtensionNode
  - typings.graphql.astMod.InterfaceTypeExtensionNode
  - typings.graphql.astMod.UnionTypeExtensionNode
  - typings.graphql.astMod.EnumTypeExtensionNode
  - typings.graphql.astMod.InputObjectTypeExtensionNode
*/
trait TypeExtensionNode extends TypeSystemExtensionNode

object TypeExtensionNode {
  @scala.inline
  def EnumTypeExtensionNode(kind: EnumTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def ScalarTypeExtensionNode(kind: ScalarTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def ObjectTypeExtensionNode(kind: ObjectTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def InterfaceTypeExtensionNode(kind: InterfaceTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def InputObjectTypeExtensionNode(kind: InputObjectTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def UnionTypeExtensionNode(kind: UnionTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
}

