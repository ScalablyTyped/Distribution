package typings.graphqlDashCompose.libGraphqlMod

import typings.graphql.typeDefinitionMod.GraphQLEnumTypeConfig
import typings.graphqlDashCompose.libEnumTypeComposerMod._EnumTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLEnumType")
@js.native
class GraphQLEnumType protected ()
  extends typings.graphql.graphqlMod.GraphQLEnumType
     with _EnumTypeComposeDefinition {
  def this(config: GraphQLEnumTypeConfig) = this()
}

