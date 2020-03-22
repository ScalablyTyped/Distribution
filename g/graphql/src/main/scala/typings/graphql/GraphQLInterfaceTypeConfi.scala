package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.definitionMod.Thunk
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLInterfaceTypeConfig<any, any, {[key: string] : any}> & {  fields  :graphql.graphql/type/definition.GraphQLFieldConfigMap<any, any, {[key: string] : any}>,   extensions  :graphql.graphql/tsutils/Maybe.default<std.Readonly<std.Record<string, any>>>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.InterfaceTypeExtensionNode>} */
trait GraphQLInterfaceTypeConfi extends js.Object {
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    Maybe[js.Array[InterfaceTypeExtensionNode]] with js.Array[InterfaceTypeExtensionNode]
  ] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]])
  var name: String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]] = js.undefined
}

object GraphQLInterfaceTypeConfi {
  @scala.inline
  def apply(
    fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]]),
    name: String,
    astNode: Maybe[InterfaceTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] with js.Array[InterfaceTypeExtensionNode] = null,
    extensions: Maybe[Record[String, _]] = null,
    resolveType: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]] = null
  ): GraphQLInterfaceTypeConfi = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4(resolveType))
    __obj.asInstanceOf[GraphQLInterfaceTypeConfi]
  }
}

