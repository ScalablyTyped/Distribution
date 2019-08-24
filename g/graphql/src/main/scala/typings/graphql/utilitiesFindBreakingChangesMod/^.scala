package typings.graphql.utilitiesFindBreakingChangesMod

import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/findBreakingChanges", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BreakingChangeType: _BreakingChangeType = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  def findBreakingChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findDangerousChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
}

