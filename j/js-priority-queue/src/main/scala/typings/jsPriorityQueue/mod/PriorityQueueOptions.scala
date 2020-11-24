package typings.jsPriorityQueue.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriorityQueueOptions[T] extends js.Object {
  
  /**
    * This is the argument we would pass to Array.prototype.sort
    */
  var comparator: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.native
  
  /**
    * You can also pass initial values, in any order.
    * With lots of values, it's faster to load them all at once than one at a time.
    */
  var initialValues: js.UndefOr[js.Array[T]] = js.native
  
  /**
    * According to JsPerf, the fastest strategy for most cases is BinaryHeapStrategy.
    * Only use ArrayStrategy only if you're queuing items in a very particular order.
    * Don't use BHeapStrategy, except as a lesson in how sometimes miracles in one programming language aren't great in other languages.
    */
  var strategy: js.UndefOr[
    Instantiable1[
      /* options */ js.UndefOr[
        PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
      ], 
      AbstractPriorityQueue[js.Object]
    ]
  ] = js.native
}
object PriorityQueueOptions {
  
  @scala.inline
  def apply[T](): PriorityQueueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityQueueOptions[T]]
  }
  
  @scala.inline
  implicit class PriorityQueueOptionsOps[Self <: PriorityQueueOptions[_], T] (val x: Self with PriorityQueueOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparator(value: (/* a */ T, /* b */ T) => Double): Self = this.set("comparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setInitialValuesVarargs(value: T*): Self = this.set("initialValues", js.Array(value :_*))
    
    @scala.inline
    def setInitialValues(value: js.Array[T]): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    
    @scala.inline
    def setStrategy(
      value: Instantiable1[
          /* options */ js.UndefOr[
            PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
          ], 
          AbstractPriorityQueue[js.Object]
        ]
    ): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
