package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.ContainerIterator
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
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
  open class LinkListIterator[T] () extends ContainerIterator[T] {
    
    @JSName("container")
    val container_LinkListIterator: LinkList[T] = js.native
    
    def equals(iter: LinkListIterator[T]): Boolean = js.native
  }
  
  @js.native
  trait LinkList[T]
    extends typings.jsSdsl.distEsmContainerSequentialContainerBaseMod.default[T] {
    
    def eraseElementByIterator(iter: LinkListIterator[T]): LinkListIterator[T] = js.native
    
    /**
      * @description Merges two sorted lists.
      * @param list - The other list you want to merge (must be sorted).
      * @returns The size of list after merging.
      * @example
      * const linkA = new LinkList([1, 3, 5]);
      * const linkB = new LinkList([2, 4, 6]);
      * linkA.merge(linkB);  // [1, 2, 3, 4, 5];
      */
    def merge(list: LinkList[T]): Double = js.native
    
    /**
      * @description Removes the first element.
      * @returns The element you popped.
      */
    def popFront(): js.UndefOr[T] = js.native
    
    /**
      * @description Push an element to the front.
      * @param element - The element you want to push.
      * @returns The size of queue after pushing.
      */
    def pushFront(element: T): Double = js.native
  }
}
