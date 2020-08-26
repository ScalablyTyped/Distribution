package typings.graphql.astMod

import typings.graphql.graphqlStrings.BooleanValue
import typings.graphql.graphqlStrings.EnumValue
import typings.graphql.graphqlStrings.FloatValue
import typings.graphql.graphqlStrings.IntValue
import typings.graphql.graphqlStrings.ListValue
import typings.graphql.graphqlStrings.NullValue
import typings.graphql.graphqlStrings.ObjectValue
import typings.graphql.graphqlStrings.StringValue
import typings.graphql.graphqlStrings.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.VariableNode
  - typings.graphql.astMod.IntValueNode
  - typings.graphql.astMod.FloatValueNode
  - typings.graphql.astMod.StringValueNode
  - typings.graphql.astMod.BooleanValueNode
  - typings.graphql.astMod.NullValueNode
  - typings.graphql.astMod.EnumValueNode
  - typings.graphql.astMod.ListValueNode
  - typings.graphql.astMod.ObjectValueNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  def ObjectValueNode(fields: js.Array[ObjectFieldNode], kind: ObjectValue): ValueNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def BooleanValueNode(kind: BooleanValue, value: Boolean): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def IntValueNode(kind: IntValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def EnumValueNode(kind: EnumValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def VariableNode(kind: Variable, name: NameNode): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def NullValueNode(kind: NullValue): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ListValueNode(kind: ListValue, values: js.Array[ValueNode]): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def FloatValueNode(kind: FloatValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def StringValueNode(kind: StringValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

