package typings.graphqlToolsLoad

import typings.pLimit.mod.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/utils/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def stringToHash(str: String): Double = js.native
  def useLimit(concurrency: Double): Limit = js.native
  def useStack[T](fns: StackFn[T]*): js.Function1[/* input */ T, Unit] = js.native
  type StackFn[T] = js.Function2[/* input */ T, /* next */ StackNext, Unit]
  type StackNext = js.Function0[Unit]
}

