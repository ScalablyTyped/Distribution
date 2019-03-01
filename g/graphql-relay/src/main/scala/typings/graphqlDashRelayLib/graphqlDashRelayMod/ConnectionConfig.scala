package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var connectionFields: js.UndefOr[
    (graphqlLib.typeDefinitionMod.Thunk[
      graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]) | scala.Null
  ] = js.undefined
  var edgeFields: js.UndefOr[
    (graphqlLib.typeDefinitionMod.Thunk[
      graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]) | scala.Null
  ] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var nodeType: ConnectionConfigNodeType
  var resolveCursor: js.UndefOr[
    (graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
  var resolveNode: js.UndefOr[
    (graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    nodeType: ConnectionConfigNodeType,
    connectionFields: graphqlLib.typeDefinitionMod.Thunk[
      graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    edgeFields: graphqlLib.typeDefinitionMod.Thunk[
      graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    name: java.lang.String = null,
    resolveCursor: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = null,
    resolveNode: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (connectionFields != null) __obj.updateDynamic("connectionFields")(connectionFields.asInstanceOf[js.Any])
    if (edgeFields != null) __obj.updateDynamic("edgeFields")(edgeFields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resolveCursor != null) __obj.updateDynamic("resolveCursor")(resolveCursor)
    if (resolveNode != null) __obj.updateDynamic("resolveNode")(resolveNode)
    __obj.asInstanceOf[ConnectionConfig]
  }
}

