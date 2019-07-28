package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.EnumTypeDefinitionNode
import typings.graphql.languageAstMod.EnumTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumTypeConfig extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[EnumTypeExtensionNode]]] = js.undefined
  var name: String
  var values: GraphQLEnumValueConfigMap
}

object GraphQLEnumTypeConfig {
  @scala.inline
  def apply(
    name: String,
    values: GraphQLEnumValueConfigMap,
    astNode: Maybe[EnumTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]] = null
  ): GraphQLEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name, values = values)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeConfig]
  }
}

