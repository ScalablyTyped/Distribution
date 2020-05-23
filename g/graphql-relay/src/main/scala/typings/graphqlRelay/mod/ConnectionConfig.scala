package typings.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var connectionFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) | Null] = js.undefined
  var edgeFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var nodeType: ConnectionConfigNodeType
  var resolveCursor: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
  var resolveNode: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    nodeType: ConnectionConfigNodeType,
    connectionFields: js.UndefOr[Null | (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]])] = js.undefined,
    edgeFields: js.UndefOr[Null | (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]])] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    resolveCursor: js.UndefOr[Null | ((_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any)] = js.undefined,
    resolveNode: js.UndefOr[Null | ((_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any)] = js.undefined
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionFields)) __obj.updateDynamic("connectionFields")(connectionFields.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeFields)) __obj.updateDynamic("edgeFields")(edgeFields.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveCursor)) __obj.updateDynamic("resolveCursor")(if (resolveCursor != null) js.Any.fromFunction4(resolveCursor.asInstanceOf[(_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any]) else null)
    if (!js.isUndefined(resolveNode)) __obj.updateDynamic("resolveNode")(if (resolveNode != null) js.Any.fromFunction4(resolveNode.asInstanceOf[(_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any]) else null)
    __obj.asInstanceOf[ConnectionConfig]
  }
}

