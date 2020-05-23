package typings.graphql.anon

import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.graphql.definitionMod.GraphQLEnumValueConfigMap
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLEnumTypeConfig & {  extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.EnumTypeExtensionNode>} */
trait GraphQLEnumTypeConfigexte extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[EnumTypeExtensionNode]] with js.Array[EnumTypeExtensionNode]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var name: String
  var values: GraphQLEnumValueConfigMap
}

object GraphQLEnumTypeConfigexte {
  @scala.inline
  def apply(
    name: String,
    values: GraphQLEnumValueConfigMap,
    astNode: js.UndefOr[Null | Maybe[EnumTypeDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]] with js.Array[EnumTypeExtensionNode] = null,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined
  ): GraphQLEnumTypeConfigexte = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeConfigexte]
  }
}

