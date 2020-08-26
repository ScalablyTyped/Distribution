package typings.graphqlRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConnectionConfigNodeType = typings.graphqlRelay.mod.ConnectionConfigNodeTypeNullable | typings.graphql.definitionMod.GraphQLNonNull[typings.graphqlRelay.mod.ConnectionConfigNodeTypeNullable]
  type ConnectionConfigNodeTypeNullable = typings.graphql.mod.GraphQLScalarType | (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType | typings.graphql.mod.GraphQLEnumType
  type ConnectionCursor = java.lang.String
  type mutationFn = js.Function3[
    /* object */ js.Any, 
    /* ctx */ js.Any, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    js.Promise[js.Any] | js.Any
  ]
  type typeResolverFn = js.Function1[
    /* any */ js.Any, 
    (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | (js.Promise[typings.graphql.mod.GraphQLObjectType[js.Any, js.Any]])
  ]
}
