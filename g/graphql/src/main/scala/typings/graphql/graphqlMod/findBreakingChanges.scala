package typings.graphql.graphqlMod

import typings.graphql.utilitiesFindBreakingChangesMod.BreakingChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findBreakingChanges")
@js.native
object findBreakingChanges extends js.Object {
  def apply(
    oldSchema: typings.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typings.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
}

