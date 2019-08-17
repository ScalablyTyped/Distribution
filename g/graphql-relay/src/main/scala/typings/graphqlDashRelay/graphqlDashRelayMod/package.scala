package typings.graphqlDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashRelayMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.graphqlMod.GraphQLEnumType
  import typings.graphql.graphqlMod.GraphQLInterfaceType
  import typings.graphql.graphqlMod.GraphQLObjectType
  import typings.graphql.graphqlMod.GraphQLScalarType
  import typings.graphql.graphqlMod.GraphQLUnionType
  import typings.graphql.typeDefinitionMod.GraphQLNonNull
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo

  type ConnectionConfigNodeType = ConnectionConfigNodeTypeNullable | GraphQLNonNull[ConnectionConfigNodeTypeNullable]
  type ConnectionConfigNodeTypeNullable = GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType
  type ConnectionCursor = String
  type mutationFn = js.Function3[
    /* object */ js.Any, 
    /* ctx */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    js.Promise[js.Any] | js.Any
  ]
  type typeResolverFn = js.Function1[
    /* any */ js.Any, 
    (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | (js.Promise[GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]])
  ]
}
