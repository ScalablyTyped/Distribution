package typings.graphqlDashCompose.libGraphqlMod

import typings.graphql.typeDefinitionMod.GraphQLInputObjectTypeConfig
import typings.graphqlDashCompose.libInputTypeComposerMod._InputTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLInputObjectType")
@js.native
class GraphQLInputObjectType protected ()
  extends typings.graphql.graphqlMod.GraphQLInputObjectType
     with _InputTypeComposeDefinition {
  def this(config: GraphQLInputObjectTypeConfig) = this()
}

