package typings
package graphqlDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashRelayMod {
  type ConnectionConfigNodeType = ConnectionConfigNodeTypeNullable | graphqlLib.typeDefinitionMod.GraphQLNonNull[ConnectionConfigNodeTypeNullable]
  type ConnectionConfigNodeTypeNullable = graphqlLib.graphqlMod.GraphQLScalarType | (graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | graphqlLib.graphqlMod.GraphQLInterfaceType | graphqlLib.graphqlMod.GraphQLUnionType | graphqlLib.graphqlMod.GraphQLEnumType
  type ConnectionCursor = java.lang.String
  type mutationFn = js.Function3[
    /* object */ js.Any, 
    /* ctx */ js.Any, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    js.Promise[js.Any] | js.Any
  ]
  type typeResolverFn = js.Function1[
    /* any */ js.Any, 
    (graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | (js.Promise[
      graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ])
  ]
}
