package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.InputObjectTypeDefinitionNode
import typings.graphql.languageAstMod.InputObjectTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInputObjectTypeConfig extends js.Object {
  var astNode: js.UndefOr[Maybe[InputObjectTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[InputObjectTypeExtensionNode]]] = js.undefined
  var fields: Thunk[GraphQLInputFieldConfigMap]
  var name: String
}

object GraphQLInputObjectTypeConfig {
  @scala.inline
  def apply(
    fields: Thunk[GraphQLInputFieldConfigMap],
    name: String,
    astNode: Maybe[InputObjectTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = null
  ): GraphQLInputObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputObjectTypeConfig]
  }
}

