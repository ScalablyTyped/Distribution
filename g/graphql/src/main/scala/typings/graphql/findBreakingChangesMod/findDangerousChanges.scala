package typings.graphql.findBreakingChangesMod

import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/findBreakingChanges", "findDangerousChanges")
@js.native
object findDangerousChanges extends js.Object {
  def apply(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
}

