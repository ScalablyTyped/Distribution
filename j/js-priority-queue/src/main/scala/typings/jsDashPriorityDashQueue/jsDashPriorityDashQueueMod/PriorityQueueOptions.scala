package typings.jsDashPriorityDashQueue.jsDashPriorityDashQueueMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueueOptions[T] extends js.Object {
  /**
    * This is the argument we would pass to Array.prototype.sort
    */
  var comparator: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.undefined
  /**
    * You can also pass initial values, in any order.
    * With lots of values, it's faster to load them all at once than one at a time.
    */
  var initialValues: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * According to JsPerf, the fastest strategy for most cases is BinaryHeapStrategy.
    * Only use ArrayStrategy only if you're queuing items in a very particular order.
    * Don't use BHeapStrategy, except as a lesson in how sometimes miracles in one programming language aren't great in other languages.
    */
  var strategy: js.UndefOr[
    Instantiable1[
      js.UndefOr[
        /* options */ PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
      ], 
      AbstractPriorityQueue[js.Object]
    ]
  ] = js.undefined
}

object PriorityQueueOptions {
  @scala.inline
  def apply[T](
    comparator: (/* a */ T, /* b */ T) => Double = null,
    initialValues: js.Array[T] = null,
    strategy: Instantiable1[
      js.UndefOr[
        /* options */ PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
      ], 
      AbstractPriorityQueue[js.Object]
    ] = null
  ): PriorityQueueOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityQueueOptions[T]]
  }
}

