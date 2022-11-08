package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Base
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerOtherContainerPriorityQueueMod {
  
  @JSImport("js-sdsl/dist/esm/container/OtherContainer/PriorityQueue", JSImport.Default)
  @js.native
  /**
    * @description PriorityQueue's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param cmp Compare function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    * @example
    * new PriorityQueue();
    * new PriorityQueue([1, 2, 3]);
    * new PriorityQueue([1, 2, 3], (x, y) => x - y);
    * new PriorityQueue([1, 2, 3], (x, y) => x - y, false);
    */
  open class default[T] () extends PriorityQueue[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: Unit, cmp: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: initContainer[T], cmp: Unit, copy: Boolean) = this()
  }
  
  @js.native
  trait PriorityQueue[T] extends Base {
    
    /**
      * @description Check if element is in heap.
      * @param item The item want to find.
      * @return Boolean about if element is in heap.
      * @example
      * const que = new PriorityQueue([], (x, y) => x.id - y.id);
      * const obj = { id: 1 };
      * que.push(obj);
      * console.log(que.find(obj));  // true
      */
    def find(item: T): Boolean = js.native
    
    /**
      * @description Removes the top element.
      * @example queue.pop();
      */
    def pop(): Unit = js.native
    
    /**
      * @description Push element into a container in order.
      * @param item The element you want to push.
      * @example queue.push(1);
      */
    def push(item: T): Unit = js.native
    
    /**
      * @description Remove specified item from heap.
      * @param item The item want to remove.
      * @return Boolean about if remove success.
      * @example
      * const que = new PriorityQueue([], (x, y) => x.id - y.id);
      * const obj = { id: 1 };
      * que.push(obj);
      * que.remove(obj);
      */
    def remove(item: T): Boolean = js.native
    
    /**
      * @return Return a copy array of heap.
      * @example const arr = queue.toArray();
      */
    def toArray(): js.Array[T] = js.native
    
    /**
      * @description Accesses the top element.
      * @example const top = queue.top();
      */
    def top(): js.UndefOr[T] = js.native
    
    /**
      * @description Update item and it's pos in the heap.
      * @param item The item want to update.
      * @return Boolean about if update success.
      * @example
      * const que = new PriorityQueue([], (x, y) => x.id - y.id);
      * const obj = { id: 1 };
      * que.push(obj);
      * obj.id = 2;
      * que.updateItem(obj);
      */
    def updateItem(item: T): Boolean = js.native
  }
}
