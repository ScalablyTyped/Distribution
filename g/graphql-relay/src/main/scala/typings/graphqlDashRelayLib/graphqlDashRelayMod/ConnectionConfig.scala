package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionConfig extends js.Object {
  var connectionFields: js.UndefOr[
    (graphqlLib.typeDefinitionMod.Thunk[graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _]]) | scala.Null
  ] = js.undefined
  var edgeFields: js.UndefOr[
    (graphqlLib.typeDefinitionMod.Thunk[graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _]]) | scala.Null
  ] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var nodeType: ConnectionConfigNodeType
  var resolveCursor: js.UndefOr[
    (graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
  var resolveNode: js.UndefOr[
    (graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
}

