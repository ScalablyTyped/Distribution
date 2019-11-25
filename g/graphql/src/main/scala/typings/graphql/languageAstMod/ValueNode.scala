package typings.graphql.languageAstMod

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
  - typings.graphql.languageAstMod.VariableNode
  - typings.graphql.languageAstMod.IntValueNode
  - typings.graphql.languageAstMod.FloatValueNode
  - typings.graphql.languageAstMod.StringValueNode
  - typings.graphql.languageAstMod.BooleanValueNode
  - typings.graphql.languageAstMod.NullValueNode
  - typings.graphql.languageAstMod.EnumValueNode
  - typings.graphql.languageAstMod.ListValueNode
  - typings.graphql.languageAstMod.ObjectValueNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  def BooleanValueNode(kind: BooleanValue, value: Boolean, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def FloatValueNode(kind: FloatValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ObjectValueNode(fields: js.Array[ObjectFieldNode], kind: ObjectValue, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def NullValueNode(kind: NullValue, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ListValueNode(kind: ListValue, values: js.Array[ValueNode], loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def EnumValueNode(kind: EnumValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def IntValueNode(kind: IntValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def StringValueNode(kind: StringValue, value: String, block: js.UndefOr[Boolean] = js.undefined, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def VariableNode(kind: Variable, name: NameNode, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

