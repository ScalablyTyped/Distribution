package typings
package graphqlLib.validationValidationContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableUsage extends js.Object {
  val defaultValue: graphqlLib.tsutilsMaybeMod.Maybe[_]
  val node: graphqlLib.languageAstMod.VariableNode
  val `type`: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLInputType]
}

object VariableUsage {
  @scala.inline
  def apply(
    defaultValue: graphqlLib.tsutilsMaybeMod.Maybe[_],
    node: graphqlLib.languageAstMod.VariableNode,
    `type`: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLInputType]
  ): VariableUsage = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[VariableUsage]
  }
}

