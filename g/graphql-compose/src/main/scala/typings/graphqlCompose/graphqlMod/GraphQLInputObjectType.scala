package typings.graphqlCompose.graphqlMod

import typings.graphql.anon.ReadonlyGraphQLInputObjec
import typings.graphqlCompose.inputTypeComposerMod._InputTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLInputObjectType")
@js.native
class GraphQLInputObjectType protected ()
  extends typings.graphql.mod.GraphQLInputObjectType
     with _InputTypeComposeDefinition {
  def this(config: ReadonlyGraphQLInputObjec) = this()
}

