package typings.graphqlCompose.graphqlMod

import typings.graphql.anon.ReadonlyGraphQLEnumTypeCo
import typings.graphqlCompose.enumTypeComposerMod._EnumTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLEnumType")
@js.native
class GraphQLEnumType protected ()
  extends typings.graphql.mod.GraphQLEnumType
     with _EnumTypeComposeDefinition {
  def this(config: ReadonlyGraphQLEnumTypeCo) = this()
}

