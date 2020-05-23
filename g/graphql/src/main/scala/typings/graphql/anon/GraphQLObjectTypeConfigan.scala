package typings.graphql.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.Thunk
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLObjectTypeConfig<any, any, {[key: string] : any}> & {  interfaces  :std.Array<graphql.graphql/type/definition.GraphQLInterfaceType>,   fields  :graphql.graphql/type/definition.GraphQLFieldConfigMap<any, any, {[key: string] : any}>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.ObjectTypeExtensionNode>} */
trait GraphQLObjectTypeConfigan extends js.Object {
  var astNode: js.UndefOr[Maybe[ObjectTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ObjectTypeExtensionNode]] with js.Array[ObjectTypeExtensionNode]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]])
  var interfaces: js.UndefOr[Thunk[Maybe[js.Array[GraphQLInterfaceType]]] with js.Array[GraphQLInterfaceType]] = js.undefined
  var isTypeOf: js.UndefOr[Maybe[GraphQLIsTypeOfFn[_, _]]] = js.undefined
  var name: String
}

object GraphQLObjectTypeConfigan {
  @scala.inline
  def apply(
    fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]]),
    name: String,
    astNode: js.UndefOr[Null | Maybe[ObjectTypeDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] with js.Array[ObjectTypeExtensionNode] = null,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    interfaces: Thunk[Maybe[js.Array[GraphQLInterfaceType]]] with js.Array[GraphQLInterfaceType] = null,
    isTypeOf: js.UndefOr[Null | ((_, _, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean])] = js.undefined
  ): GraphQLObjectTypeConfigan = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(isTypeOf)) __obj.updateDynamic("isTypeOf")(if (isTypeOf != null) js.Any.fromFunction3(isTypeOf.asInstanceOf[(_, _, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]]) else null)
    __obj.asInstanceOf[GraphQLObjectTypeConfigan]
  }
}

