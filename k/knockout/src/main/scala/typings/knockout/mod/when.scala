package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "when")
@js.native
object when extends js.Object {
  def apply[T](predicate: ComputedReadFunction[T, Unit]): js.Promise[T] = js.native
  def apply[T, TTarget](predicate: ComputedReadFunction[T, TTarget], callback: SubscriptionCallback[T, TTarget]): Subscription = js.native
  def apply[T, TTarget](
    predicate: ComputedReadFunction[T, TTarget],
    callback: SubscriptionCallback[T, TTarget],
    context: TTarget
  ): Subscription = js.native
}

