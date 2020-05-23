package typings.graphql.anon

import typings.graphql.astMod.InputObjectTypeDefinitionNode
import typings.graphql.astMod.InputObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLInputFieldConfigMap
import typings.graphql.definitionMod.Thunk
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLInputObjectTypeConfig & {  fields  :graphql.graphql/type/definition.GraphQLInputFieldConfigMap,   extensions  :graphql.graphql/tsutils/Maybe.default<std.Readonly<std.Record<string, any>>>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.InputObjectTypeExtensionNode>} */
trait GraphQLInputObjectTypeCon extends js.Object {
  var astNode: js.UndefOr[Maybe[InputObjectTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    Maybe[js.Array[InputObjectTypeExtensionNode]] with js.Array[InputObjectTypeExtensionNode]
  ] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var fields: Thunk[GraphQLInputFieldConfigMap] with GraphQLInputFieldConfigMap
  var name: String
}

object GraphQLInputObjectTypeCon {
  @scala.inline
  def apply(
    fields: Thunk[GraphQLInputFieldConfigMap] with GraphQLInputFieldConfigMap,
    name: String,
    astNode: js.UndefOr[Null | Maybe[InputObjectTypeDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] with js.Array[InputObjectTypeExtensionNode] = null,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined
  ): GraphQLInputObjectTypeCon = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputObjectTypeCon]
  }
}

