package typings.jsPriorityQueue

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-priority-queue", JSImport.Namespace)
  @js.native
  class ^[T] () extends AbstractPriorityQueue[T]
  
  @JSImport("js-priority-queue", "ArrayStrategy")
  @js.native
  class ArrayStrategy[T] () extends AbstractPriorityQueue[T]
  
  @JSImport("js-priority-queue", "BHeapStrategy")
  @js.native
  class BHeapStrategy[T] () extends AbstractPriorityQueue[T]
  
  @JSImport("js-priority-queue", "BinaryHeapStrategy")
  @js.native
  class BinaryHeapStrategy[T] () extends AbstractPriorityQueue[T]
  
  @js.native
  trait AbstractPriorityQueue[T] extends StObject {
    
    /**
      * Removes all values from the queue
      */
    def clear(): Unit = js.native
    
    /**
      * Returns the smallest item in the queue and removes it from the queue
      */
    def dequeue(): T = js.native
    
    /**
      * Returns the number of elements in the queue
      */
    var length: Double = js.native
    
    /**
      * Returns the smallest item in the queue and leaves the queue unchanged
      */
    def peek(): T = js.native
    
    /**
      * Inserts a new value in the queue
      */
    def queue(value: T): Unit = js.native
  }
  object AbstractPriorityQueue {
    
    @scala.inline
    def apply[T](clear: () => Unit, dequeue: () => T, length: Double, peek: () => T, queue: T => Unit): AbstractPriorityQueue[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), queue = js.Any.fromFunction1(queue))
      __obj.asInstanceOf[AbstractPriorityQueue[T]]
    }
    
    @scala.inline
    implicit class AbstractPriorityQueueMutableBuilder[Self <: AbstractPriorityQueue[_], T] (val x: Self with AbstractPriorityQueue[T]) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDequeue(value: () => T): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQueue(value: T => Unit): Self = StObject.set(x, "queue", js.Any.fromFunction1(value))
    }
  }
  
  type PriorityQueue[T] = AbstractPriorityQueue[T]
  
  @js.native
  trait PriorityQueueOptions[T] extends StObject {
    
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
    implicit class PriorityQueueOptionsMutableBuilder[Self <: PriorityQueueOptions[_], T] (val x: Self with PriorityQueueOptions[T]) extends AnyVal {
      
      @scala.inline
      def setComparator(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setInitialValues(value: js.Array[T]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      @scala.inline
      def setInitialValuesVarargs(value: T*): Self = StObject.set(x, "initialValues", js.Array(value :_*))
      
      @scala.inline
      def setStrategy(
        value: Instantiable1[
              /* options */ js.UndefOr[
                PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
              ], 
              AbstractPriorityQueue[js.Object]
            ]
      ): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
