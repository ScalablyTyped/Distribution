package typings.graphql.graphqlMod

import typings.graphql.utilitiesFindBreakingChangesMod.DangerousChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findDangerousChanges")
@js.native
object findDangerousChanges extends js.Object {
  def apply(
    oldSchema: typings.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typings.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
}

