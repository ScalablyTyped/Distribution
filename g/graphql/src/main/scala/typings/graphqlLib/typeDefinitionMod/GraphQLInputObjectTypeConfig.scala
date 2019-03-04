package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInputObjectTypeConfig extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InputObjectTypeDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.InputObjectTypeExtensionNode]]
  ] = js.undefined
  var fields: Thunk[GraphQLInputFieldConfigMap]
  var name: java.lang.String
}

object GraphQLInputObjectTypeConfig {
  @scala.inline
  def apply(
    fields: Thunk[GraphQLInputFieldConfigMap],
    name: java.lang.String,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InputObjectTypeDefinitionNode] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.InputObjectTypeExtensionNode]] = null
  ): GraphQLInputObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputObjectTypeConfig]
  }
}

