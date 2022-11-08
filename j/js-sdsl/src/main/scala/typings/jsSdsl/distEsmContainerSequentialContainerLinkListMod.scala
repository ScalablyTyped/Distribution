package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.ContainerIterator
import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerSequentialContainerLinkListMod {
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/LinkList", JSImport.Default)
  @js.native
  open class default[T] () extends LinkList[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/LinkList", "LinkListIterator")
  @js.native
  /* protected */ open class LinkListIterator[T] () extends ContainerIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
    
    def equals(obj: LinkListIterator[T]): Boolean = js.native
  }
  
  @js.native
  trait LinkList[T]
    extends typings.jsSdsl.distEsmContainerSequentialContainerBaseMod.default[T] {
    
    def eraseElementByIterator(iter: LinkListIterator[T]): LinkListIterator[T] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_LinkList: js.Function0[Generator[T, Unit, Any]] = js.native
    
    /**
      * @description Merges two sorted lists.
      * @param list The other list you want to merge (must be sorted).
      * @example
      * const linkA = new LinkList([1, 3, 5]);
      * const linkB = new LinkList([2, 4, 6]);
      * linkA.merge(linkB);  // [1, 2, 3, 4, 5];
      */
    def merge(list: LinkList[T]): Unit = js.native
    
    /**
      * @description Removes the first element.
      */
    def popFront(): Unit = js.native
    
    /**
      * @description Push an element to the front.
      * @param element The element you want to push.
      */
    def pushFront(element: T): Unit = js.native
  }
}
