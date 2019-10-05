package typings.graphql.utilitiesFindBreakingChangesMod

import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/findBreakingChanges", "findBreakingChanges")
@js.native
object findBreakingChanges extends js.Object {
  def apply(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
}

