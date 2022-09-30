package typings.jsSdsl

import typings.jsSdsl.containerContainerBaseMod.ContainerIterator
import typings.jsSdsl.containerContainerBaseMod.IteratorType
import typings.jsSdsl.containerContainerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequentialContainerLinkListMod {
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/LinkList", JSImport.Default)
  @js.native
  open class default[T] () extends LinkList[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/LinkList", "LinkListIterator")
  @js.native
  open class LinkListIterator[T] protected () extends ContainerIterator[T] {
    def this(_node: LinkNode[T], _header: LinkNode[T]) = this()
    def this(_node: LinkNode[T], _header: LinkNode[T], iteratorType: IteratorType) = this()
    
    def equals(obj: LinkListIterator[T]): Boolean = js.native
  }
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/LinkList", "LinkNode")
  @js.native
  open class LinkNode[T] () extends StObject {
    def this(element: T) = this()
    
    var next: js.UndefOr[LinkNode[T]] = js.native
    
    var pre: js.UndefOr[LinkNode[T]] = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  
  @js.native
  trait LinkList[T]
    extends typings.jsSdsl.containerSequentialContainerBaseMod.default[T] {
    
    def eraseElementByIterator(iter: LinkListIterator[T]): LinkListIterator[T] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_LinkList: js.Function0[Generator[T, Unit, Any]] = js.native
    
    /**
      * @description Merges two sorted lists.
      * @param list The other list you want to merge (must be sorted).
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
