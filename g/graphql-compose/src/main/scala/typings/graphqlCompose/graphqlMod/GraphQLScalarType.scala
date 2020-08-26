package typings.graphqlCompose.graphqlMod

import typings.graphql.anon.ReadonlyGraphQLScalarType
import typings.graphqlCompose.scalarTypeComposerMod._ScalarTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLScalarType")
@js.native
class GraphQLScalarType protected ()
  extends typings.graphql.mod.GraphQLScalarType
     with _ScalarTypeComposeDefinition {
  def this(config: ReadonlyGraphQLScalarType) = this()
}

