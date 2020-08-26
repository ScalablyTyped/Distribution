package typings.graphql.validationContextMod

import typings.graphql.astMod.VariableNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableUsage extends js.Object {
  val defaultValue: Maybe[_] = js.native
  val node: VariableNode = js.native
  val `type`: Maybe[GraphQLInputType] = js.native
}

object VariableUsage {
  @scala.inline
  def apply(node: VariableNode): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUsage]
  }
  @scala.inline
  implicit class VariableUsageOps[Self <: VariableUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNode(value: VariableNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Maybe[_]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    @scala.inline
    def setType(value: Maybe[GraphQLInputType]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

