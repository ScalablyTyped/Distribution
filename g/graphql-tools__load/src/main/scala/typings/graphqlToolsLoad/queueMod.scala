package typings.graphqlToolsLoad

import typings.graphqlToolsLoad.anon.Add
import typings.graphqlToolsLoad.anon.Concurrency
import typings.graphqlToolsLoad.anon.RunAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/utils/queue", JSImport.Namespace)
@js.native
object queueMod extends js.Object {
  def useQueue[T](): Add[T] = js.native
  def useQueue[T](options: Concurrency): Add[T] = js.native
  def useSyncQueue[T](): RunAll[T] = js.native
}

