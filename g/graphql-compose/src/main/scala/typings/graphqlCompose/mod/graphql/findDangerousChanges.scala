package typings.graphqlCompose.mod.graphql

import typings.graphql.findBreakingChangesMod.DangerousChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.findDangerousChanges")
@js.native
object findDangerousChanges extends js.Object {
  def apply(
    oldSchema: typings.graphql.schemaMod.GraphQLSchema,
    newSchema: typings.graphql.schemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
}

