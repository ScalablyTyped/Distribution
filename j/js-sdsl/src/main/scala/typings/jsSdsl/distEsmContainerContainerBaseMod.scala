package typings.jsSdsl

import typings.jsSdsl.anon.ForEach
import typings.jsSdsl.anon.Length
import typings.jsSdsl.anon.Size
import typings.jsSdsl.jsSdslInts.`0`
import typings.jsSdsl.jsSdslInts.`1`
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/ContainerBase", "Base")
  @js.native
  open class Base () extends StObject {
    
    /**
      * @description Clear the container.
      * @example
      * container.clear();
      * console.log(container.empty());  // true
      */
    def clear(): Unit = js.native
    
    /**
      * @return Boolean about if the container is empty.
      * @example
      * container.clear();
      * console.log(container.empty());  // true
      */
    def empty(): Boolean = js.native
    
    /**
      * @return The size of the container.
      * @example
      * const container = new Vector([1, 2]);
      * console.log(container.size()); // 2
      */
    def size(): Double = js.native
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/ContainerBase", "Container")
  @js.native
  open class Container[T] () extends Base {
    
    /**
      * @description Using for `for...of` syntax like Array.
      * @example
      * for (const element of container) {
      *   console.log(element);
      * }
      */
    var `abstract`: Any = js.native
    
    /**
      * @return The last element of the container.
      */
    def back(): js.UndefOr[T] = js.native
    
    /**
      * @return Iterator pointing to the beginning element.
      * @example
      * const begin = container.begin();
      * const end = container.end();
      * for (const it = begin; !it.equals(end); it.next()) {
      *   doSomething(it.pointer);
      * }
      */
    def begin(): ContainerIterator[T] = js.native
    
    /**
      * @return Iterator pointing to the super end like c++.
      * @example
      * const begin = container.begin();
      * const end = container.end();
      * for (const it = begin; !it.equals(end); it.next()) {
      *   doSomething(it.pointer);
      * }
      */
    def end(): ContainerIterator[T] = js.native
    
    /**
      * @description Removes element by iterator and move `iter` to next.
      * @param iter The iterator you want to erase.
      * @example
      * container.eraseElementByIterator(container.begin());
      * container.eraseElementByIterator(container.end()); // throw a RangeError
      */
    def eraseElementByIterator(iter: ContainerIterator[T]): ContainerIterator[T] = js.native
    
    /**
      * @description Removes the element at the specified position.
      * @param pos The element's position you want to remove.
      * container.eraseElementByPos(-1); // throw a RangeError
      */
    def eraseElementByPos(pos: Double): Unit = js.native
    
    /**
      * @param element The element you want to find.
      * @return An iterator pointing to the element if found, or super end if not found.
      * @example container.find(1).equals(container.end());
      */
    def find(element: T): ContainerIterator[T] = js.native
    
    /**
      * @description Iterate over all elements in the container.
      * @param callback Callback function like Array.forEach.
      * @example container.forEach((element, index) => console.log(element, index));
      */
    def forEach(callback: js.Function3[/* element */ T, /* index */ Double, /* container */ Container[T], Unit]): Unit = js.native
    
    /**
      * @return The first element of the container.
      */
    def front(): js.UndefOr[T] = js.native
    
    /**
      * @description Gets the value of the element at the specified position.
      * @example
      * const val = container.getElementByPos(-1); // throw a RangeError
      */
    def getElementByPos(pos: Double): T = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[T, Unit, Unit]] = js.native
    
    /**
      * @return Iterator pointing to the end element.
      * @example
      * const rBegin = container.rBegin();
      * const rEnd = container.rEnd();
      * for (const it = rBegin; !it.equals(rEnd); it.next()) {
      *   doSomething(it.pointer);
      * }
      */
    def rBegin(): ContainerIterator[T] = js.native
    
    /**
      * @return Iterator pointing to the super begin like c++.
      * @example
      * const rBegin = container.rBegin();
      * const rEnd = container.rEnd();
      * for (const it = rBegin; !it.equals(rEnd); it.next()) {
      *   doSomething(it.pointer);
      * }
      */
    def rEnd(): ContainerIterator[T] = js.native
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/ContainerBase", "ContainerIterator")
  @js.native
  /* protected */ open class ContainerIterator[T] () extends StObject {
    /* protected */ def this(iteratorType: IteratorType) = this()
    
    /**
      * @description Get a copy of itself.
      * @return The copy of self.
      * @example
      * const iter = container.find(1);  // container = [1, 2]
      * const next = iter.copy().next();
      * console.log(next === iter);  // false
      * console.log(next.equals(iter));  // false
      * console.log(next.pointer, iter.pointer); // 2, 1
      */
    def copy(): ContainerIterator[T] = js.native
    
    /**
      * @param obj The other iterator you want to compare.
      * @return Boolean about if this equals to obj.
      * @example container.find(1).equals(container.end());
      */
    def equals(obj: ContainerIterator[T]): Boolean = js.native
    
    /**
      * @description Iterator's type.
      * @example console.log(container.end().iteratorType === IteratorType.NORMAL);  // true
      */
    val iteratorType: IteratorType = js.native
    
    /**
      * @description Move `this` iterator to next.
      * @example
      * const iter = container.find(1);  // container = [1, 2]
      * const next = iter.next();
      * console.log(next === iter);  // true
      * console.log(next.equals(iter));  // true
      * console.log(next.pointer, iter.pointer); // 2, 2
      */
    def next(): this.type = js.native
    
    /**
      * @description Pointers to element.
      * @return The value of the pointer's element.
      * @example const val = container.begin().pointer;
      */
    def pointer: T = js.native
    /**
      * @description Set pointer's value (some containers are unavailable).
      * @param newValue The new value you want to set.
      * @example (<LinkList<number>>container).begin().pointer = 1;
      */
    def pointer_=(newValue: T): Unit = js.native
    
    /**
      * @description Move `this` iterator to pre.
      * @example
      * const iter = container.find(1);  // container = [0, 1]
      * const pre = iter.pre();
      * console.log(pre === iter);  // true
      * console.log(pre.equals(iter));  // true
      * console.log(pre.pointer, iter.pointer); // 0, 0
      */
    def pre(): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsSdsl.jsSdslInts.`0`
    - typings.jsSdsl.jsSdslInts.`1`
  */
  trait IteratorType extends StObject
  object IteratorType {
    
    inline def NORMAL: `0` = 0.asInstanceOf[`0`]
    
    inline def REVERSE: `1` = 1.asInstanceOf[`1`]
  }
  
  type initContainer[T] = (Size & ForEach[T]) | (Length & ForEach[T]) | (typings.jsSdsl.anon.`0` & ForEach[T])
}
