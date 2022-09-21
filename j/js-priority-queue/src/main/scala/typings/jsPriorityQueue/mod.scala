package typings.jsPriorityQueue

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-priority-queue", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with AbstractPriorityQueue[T] {
    
    /**
      * Removes all values from the queue
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Returns the smallest item in the queue and removes it from the queue
      */
    /* CompleteClass */
    override def dequeue(): T = js.native
    
    /**
      * Returns the number of elements in the queue
      */
    /* CompleteClass */
    var length: Double = js.native
    
    /**
      * Returns the smallest item in the queue and leaves the queue unchanged
      */
    /* CompleteClass */
    override def peek(): T = js.native
    
    /**
      * Inserts a new value in the queue
      */
    /* CompleteClass */
    override def queue(value: T): Unit = js.native
  }
  
  @JSImport("js-priority-queue", "ArrayStrategy")
  @js.native
  open class ArrayStrategy[T] ()
    extends StObject
       with AbstractPriorityQueue[T] {
    
    /**
      * Removes all values from the queue
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Returns the smallest item in the queue and removes it from the queue
      */
    /* CompleteClass */
    override def dequeue(): T = js.native
    
    /**
      * Returns the number of elements in the queue
      */
    /* CompleteClass */
    var length: Double = js.native
    
    /**
      * Returns the smallest item in the queue and leaves the queue unchanged
      */
    /* CompleteClass */
    override def peek(): T = js.native
    
    /**
      * Inserts a new value in the queue
      */
    /* CompleteClass */
    override def queue(value: T): Unit = js.native
  }
  
  @JSImport("js-priority-queue", "BHeapStrategy")
  @js.native
  open class BHeapStrategy[T] ()
    extends StObject
       with AbstractPriorityQueue[T] {
    
    /**
      * Removes all values from the queue
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Returns the smallest item in the queue and removes it from the queue
      */
    /* CompleteClass */
    override def dequeue(): T = js.native
    
    /**
      * Returns the number of elements in the queue
      */
    /* CompleteClass */
    var length: Double = js.native
    
    /**
      * Returns the smallest item in the queue and leaves the queue unchanged
      */
    /* CompleteClass */
    override def peek(): T = js.native
    
    /**
      * Inserts a new value in the queue
      */
    /* CompleteClass */
    override def queue(value: T): Unit = js.native
  }
  
  @JSImport("js-priority-queue", "BinaryHeapStrategy")
  @js.native
  open class BinaryHeapStrategy[T] ()
    extends StObject
       with AbstractPriorityQueue[T] {
    
    /**
      * Removes all values from the queue
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Returns the smallest item in the queue and removes it from the queue
      */
    /* CompleteClass */
    override def dequeue(): T = js.native
    
    /**
      * Returns the number of elements in the queue
      */
    /* CompleteClass */
    var length: Double = js.native
    
    /**
      * Returns the smallest item in the queue and leaves the queue unchanged
      */
    /* CompleteClass */
    override def peek(): T = js.native
    
    /**
      * Inserts a new value in the queue
      */
    /* CompleteClass */
    override def queue(value: T): Unit = js.native
  }
  
  trait AbstractPriorityQueue[T] extends StObject {
    
    /**
      * Removes all values from the queue
      */
    def clear(): Unit
    
    /**
      * Returns the smallest item in the queue and removes it from the queue
      */
    def dequeue(): T
    
    /**
      * Returns the number of elements in the queue
      */
    var length: Double
    
    /**
      * Returns the smallest item in the queue and leaves the queue unchanged
      */
    def peek(): T
    
    /**
      * Inserts a new value in the queue
      */
    def queue(value: T): Unit
  }
  object AbstractPriorityQueue {
    
    inline def apply[T](clear: () => Unit, dequeue: () => T, length: Double, peek: () => T, queue: T => Unit): AbstractPriorityQueue[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), queue = js.Any.fromFunction1(queue))
      __obj.asInstanceOf[AbstractPriorityQueue[T]]
    }
    
    extension [Self <: AbstractPriorityQueue[?], T](x: Self & AbstractPriorityQueue[T]) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDequeue(value: () => T): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setQueue(value: T => Unit): Self = StObject.set(x, "queue", js.Any.fromFunction1(value))
    }
  }
  
  type PriorityQueue[T] = AbstractPriorityQueue[T]
  
  trait PriorityQueueOptions[T] extends StObject {
    
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
          /* options */ js.UndefOr[
            PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]
          ], 
          AbstractPriorityQueue[js.Object]
        ]
      ] = js.undefined
  }
  object PriorityQueueOptions {
    
    inline def apply[T](): PriorityQueueOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PriorityQueueOptions[T]]
    }
    
    extension [Self <: PriorityQueueOptions[?], T](x: Self & PriorityQueueOptions[T]) {
      
      inline def setComparator(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setInitialValues(value: js.Array[T]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      inline def setInitialValuesVarargs(value: T*): Self = StObject.set(x, "initialValues", js.Array(value*))
      
      inline def setStrategy(
        value: Instantiable1[
              /* options */ js.UndefOr[
                PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]
              ], 
              AbstractPriorityQueue[js.Object]
            ]
      ): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
