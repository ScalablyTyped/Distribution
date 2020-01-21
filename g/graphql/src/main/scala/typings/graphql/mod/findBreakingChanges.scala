package typings.graphql.mod

import typings.graphql.findBreakingChangesMod.BreakingChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findBreakingChanges")
@js.native
object findBreakingChanges extends js.Object {
  def apply(
    oldSchema: typings.graphql.schemaMod.GraphQLSchema,
    newSchema: typings.graphql.schemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
}

