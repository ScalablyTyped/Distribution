package typings.graphqlDashRelay.graphqlDashRelayMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeDefinitionMod.Thunk
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
    connectionFields: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]] = null,
    edgeFields: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]] = null,
    name: String = null,
    resolveCursor: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any = null,
    resolveNode: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
    if (connectionFields != null) __obj.updateDynamic("connectionFields")(connectionFields.asInstanceOf[js.Any])
    if (edgeFields != null) __obj.updateDynamic("edgeFields")(edgeFields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolveCursor != null) __obj.updateDynamic("resolveCursor")(js.Any.fromFunction4(resolveCursor))
    if (resolveNode != null) __obj.updateDynamic("resolveNode")(js.Any.fromFunction4(resolveNode))
    __obj.asInstanceOf[ConnectionConfig]
  }
}

