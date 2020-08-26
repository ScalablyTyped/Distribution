package typings.graphqlRelay.mod

import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-relay", "nodeDefinitions")
@js.native
object nodeDefinitions extends js.Object {
  def apply[TContext](idFetcher: js.Function3[/* id */ String, /* context */ TContext, /* info */ GraphQLResolveInfo, _]): GraphQLNodeDefinitions = js.native
  def apply[TContext](
    idFetcher: js.Function3[/* id */ String, /* context */ TContext, /* info */ GraphQLResolveInfo, _],
    typeResolver: GraphQLTypeResolver[_, TContext]
  ): GraphQLNodeDefinitions = js.native
}

