package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.ContainerIterator
import typings.jsSdsl.containerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkListMod {
  
  @JSImport("js-sdsl/dist/cjs/container/SequentialContainer/LinkList", JSImport.Default)
  @js.native
  open class default[T] () extends LinkList[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs/container/SequentialContainer/LinkList", "LinkListIterator")
  @js.native
  open class LinkListIterator[T] protected () extends ContainerIterator[T] {
    def this(node: LinkNode[T], header: LinkNode[T]) = this()
    def this(node: LinkNode[T], header: LinkNode[T], iteratorType: Boolean) = this()
    
    def equals(obj: LinkListIterator[T]): Boolean = js.native
    
    /* private */ val header: Any = js.native
    
    /* protected */ @JSName("node")
    var node_LinkListIterator: LinkNode[T] = js.native
  }
  
  @JSImport("js-sdsl/dist/cjs/container/SequentialContainer/LinkList", "LinkNode")
  @js.native
  open class LinkNode[T] () extends StObject {
    def this(element: T) = this()
    
    var next: js.UndefOr[LinkNode[T]] = js.native
    
    var pre: js.UndefOr[LinkNode[T]] = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  
  @js.native
  trait LinkList[T]
    extends typings.jsSdsl.sequentialContainerBaseMod.default[T] {
    
    def eraseElementByIterator(iter: LinkListIterator[T]): LinkListIterator[T] = js.native
    
    /* private */ var head: Any = js.native
    
    /* private */ var header: Any = js.native
    
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
    
    /* private */ var tail: Any = js.native
  }
}
