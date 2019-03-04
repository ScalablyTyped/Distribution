package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumTypeConfig extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumTypeDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.EnumTypeExtensionNode]]
  ] = js.undefined
  var name: java.lang.String
  var values: GraphQLEnumValueConfigMap
}

object GraphQLEnumTypeConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    values: GraphQLEnumValueConfigMap,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumTypeDefinitionNode] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.EnumTypeExtensionNode]] = null
  ): GraphQLEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name, values = values)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeConfig]
  }
}

