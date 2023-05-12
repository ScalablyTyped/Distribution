package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.jsSdsl.distEsmContainerHashContainerBaseMod.HashLinkNode
import typings.jsSdsl.distEsmContainerSequentialContainerDequeMod.default
import typings.jsSdsl.distEsmContainerTreeContainerBaseTreeNodeMod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("js-sdsl", "Container")
  @js.native
  open class Container[T] ()
    extends typings.jsSdsl.distEsmContainerContainerBaseMod.Container[T]
  
  /* note: abstract class */ @JSImport("js-sdsl", "ContainerIterator")
  @js.native
  open class ContainerIterator[T] ()
    extends typings.jsSdsl.distEsmContainerContainerBaseMod.ContainerIterator[T]
  
  @JSImport("js-sdsl", "Deque")
  @js.native
  open class Deque[T] () extends default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, _bucketSize: Double) = this()
    def this(container: initContainer[T], _bucketSize: Double) = this()
  }
  
  @JSImport("js-sdsl", "DequeIterator")
  @js.native
  open class DequeIterator[T] protected ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerDequeMod.DequeIterator[T] {
    def this(node: Double, container: typings.jsSdsl.distEsmContainerSequentialContainerDequeMod.Deque[T]) = this()
    def this(
      node: Double,
      container: typings.jsSdsl.distEsmContainerSequentialContainerDequeMod.Deque[T],
      iteratorType: IteratorType
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl", "HashContainer")
  @js.native
  open class HashContainer[K, V] ()
    extends typings.jsSdsl.distEsmContainerHashContainerBaseMod.HashContainer[K, V]
  
  @JSImport("js-sdsl", "HashMap")
  @js.native
  open class HashMap[K, V] ()
    extends typings.jsSdsl.distEsmContainerHashContainerHashMapMod.default[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
  }
  
  @JSImport("js-sdsl", "HashMapIterator")
  @js.native
  open class HashMapIterator[K, V] protected ()
    extends typings.jsSdsl.distEsmContainerHashContainerHashMapMod.HashMapIterator[K, V] {
    def this(
      node: HashLinkNode[K, V],
      header: HashLinkNode[K, V],
      container: typings.jsSdsl.distEsmContainerHashContainerHashMapMod.HashMap[K, V]
    ) = this()
    def this(
      node: HashLinkNode[K, V],
      header: HashLinkNode[K, V],
      container: typings.jsSdsl.distEsmContainerHashContainerHashMapMod.HashMap[K, V],
      iteratorType: IteratorType
    ) = this()
  }
  
  @JSImport("js-sdsl", "HashSet")
  @js.native
  open class HashSet[K] ()
    extends typings.jsSdsl.distEsmContainerHashContainerHashSetMod.default[K] {
    def this(container: initContainer[K]) = this()
  }
  
  @JSImport("js-sdsl", "HashSetIterator")
  @js.native
  open class HashSetIterator[K] protected ()
    extends typings.jsSdsl.distEsmContainerHashContainerHashSetMod.HashSetIterator[K] {
    def this(
      node: HashLinkNode[K, Unit],
      header: HashLinkNode[K, Unit],
      container: typings.jsSdsl.distEsmContainerHashContainerHashSetMod.HashSet[K]
    ) = this()
    def this(
      node: HashLinkNode[K, Unit],
      header: HashLinkNode[K, Unit],
      container: typings.jsSdsl.distEsmContainerHashContainerHashSetMod.HashSet[K],
      iteratorType: IteratorType
    ) = this()
  }
  
  @JSImport("js-sdsl", "LinkList")
  @js.native
  open class LinkList[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerLinkListMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl", "LinkListIterator")
  @js.native
  open class LinkListIterator[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerLinkListMod.LinkListIterator[T]
  
  @JSImport("js-sdsl", "OrderedMap")
  @js.native
  /**
    * @param container - The initialization container.
    * @param cmp - The compare function.
    * @param enableIndex - Whether to enable iterator indexing function.
    * @example
    * new OrderedMap();
    * new OrderedMap([[0, 1], [2, 1]]);
    * new OrderedMap([[0, 1], [2, 1]], (x, y) => x - y);
    * new OrderedMap([[0, 1], [2, 1]], (x, y) => x - y, true);
    */
  open class OrderedMap[K, V] ()
    extends typings.jsSdsl.distEsmContainerTreeContainerOrderedMapMod.default[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[js.Tuple2[K, V]], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(
      container: initContainer[js.Tuple2[K, V]],
      cmp: js.Function2[/* x */ K, /* y */ K, Double],
      enableIndex: Boolean
    ) = this()
    def this(container: initContainer[js.Tuple2[K, V]], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] protected ()
    extends typings.jsSdsl.distEsmContainerTreeContainerOrderedMapMod.OrderedMapIterator[K, V] {
    def this(
      node: TreeNode[K, V],
      header: TreeNode[K, V],
      container: typings.jsSdsl.distEsmContainerTreeContainerOrderedMapMod.OrderedMap[K, V]
    ) = this()
    def this(
      node: TreeNode[K, V],
      header: TreeNode[K, V],
      container: typings.jsSdsl.distEsmContainerTreeContainerOrderedMapMod.OrderedMap[K, V],
      iteratorType: IteratorType
    ) = this()
  }
  
  @JSImport("js-sdsl", "OrderedSet")
  @js.native
  /**
    * @param container - The initialization container.
    * @param cmp - The compare function.
    * @param enableIndex - Whether to enable iterator indexing function.
    * @example
    * new OrderedSet();
    * new OrderedSet([0, 1, 2]);
    * new OrderedSet([0, 1, 2], (x, y) => x - y);
    * new OrderedSet([0, 1, 2], (x, y) => x - y, true);
    */
  open class OrderedSet[K] ()
    extends typings.jsSdsl.distEsmContainerTreeContainerOrderedSetMod.default[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] protected ()
    extends typings.jsSdsl.distEsmContainerTreeContainerOrderedSetMod.OrderedSetIterator[K] {
    def this(
      node: TreeNode[K, Unit],
      header: TreeNode[K, Unit],
      container: typings.jsSdsl.distEsmContainerTreeContainerOrderedSetMod.OrderedSet[K]
    ) = this()
    def this(
      node: TreeNode[K, Unit],
      header: TreeNode[K, Unit],
      container: typings.jsSdsl.distEsmContainerTreeContainerOrderedSetMod.OrderedSet[K],
      iteratorType: IteratorType
    ) = this()
  }
  
  @JSImport("js-sdsl", "PriorityQueue")
  @js.native
  /**
    * @description PriorityQueue's constructor.
    * @param container - Initialize container, must have a forEach function.
    * @param cmp - Compare function.
    * @param copy - When the container is an array, you can choose to directly operate on the original object of
    *               the array or perform a shallow copy. The default is shallow copy.
    * @example
    * new PriorityQueue();
    * new PriorityQueue([1, 2, 3]);
    * new PriorityQueue([1, 2, 3], (x, y) => x - y);
    * new PriorityQueue([1, 2, 3], (x, y) => x - y, false);
    */
  open class PriorityQueue[T] ()
    extends typings.jsSdsl.distEsmContainerOtherContainerPriorityQueueMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: Unit, cmp: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: initContainer[T], cmp: Unit, copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl", "Queue")
  @js.native
  open class Queue[T] ()
    extends typings.jsSdsl.distEsmContainerOtherContainerQueueMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl", "SequentialContainer")
  @js.native
  open class SequentialContainer[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerBaseMod.default[T]
  
  @JSImport("js-sdsl", "Stack")
  @js.native
  open class Stack[T] ()
    extends typings.jsSdsl.distEsmContainerOtherContainerStackMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl", "TreeContainer")
  @js.native
  open class TreeContainer[K, V] ()
    extends typings.jsSdsl.distEsmContainerTreeContainerBaseMod.default[K, V]
  
  @JSImport("js-sdsl", "Vector")
  @js.native
  /**
    * @param container - Initialize container, must have a forEach function.
    * @param copy - When the container is an array, you can choose to directly operate on the original object of
    *               the array or perform a shallow copy. The default is shallow copy.
    */
  open class Vector[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerVectorMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl", "VectorIterator")
  @js.native
  open class VectorIterator[T] protected ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerVectorMod.VectorIterator[T] {
    def this(node: Double, container: typings.jsSdsl.distEsmContainerSequentialContainerVectorMod.Vector[T]) = this()
    def this(
      node: Double,
      container: typings.jsSdsl.distEsmContainerSequentialContainerVectorMod.Vector[T],
      iteratorType: IteratorType
    ) = this()
  }
}
