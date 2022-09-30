package typings.jsSdsl

import typings.jsSdsl.baseTreeNodeMod.TreeNode
import typings.jsSdsl.containerContainerBaseMod.IteratorType
import typings.jsSdsl.containerContainerBaseMod.initContainer
import typings.jsSdsl.sequentialContainerDequeMod.default
import typings.jsSdsl.sequentialContainerLinkListMod.LinkNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("js-sdsl/dist/esm", "Container")
  @js.native
  abstract class Container[T] ()
    extends typings.jsSdsl.containerContainerBaseMod.Container[T]
  
  @JSImport("js-sdsl/dist/esm", "ContainerIterator")
  @js.native
  /* protected */ abstract class ContainerIterator[T] ()
    extends typings.jsSdsl.containerContainerBaseMod.ContainerIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "Deque")
  @js.native
  open class Deque[T] () extends default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, _bucketSize: Double) = this()
    def this(container: initContainer[T], _bucketSize: Double) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "DequeIterator")
  @js.native
  open class DequeIterator[T] protected ()
    extends typings.jsSdsl.sequentialContainerDequeMod.DequeIterator[T] {
    def this(
      index: Double,
      size: js.Function0[Double],
      getElementByPos: js.Function1[/* pos */ Double, T],
      setElementByPos: js.Function2[/* pos */ Double, /* element */ T, Unit]
    ) = this()
    def this(
      index: Double,
      size: js.Function0[Double],
      getElementByPos: js.Function1[/* pos */ Double, T],
      setElementByPos: js.Function2[/* pos */ Double, /* element */ T, Unit],
      iteratorType: IteratorType
    ) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "HashContainer")
  @js.native
  /* protected */ abstract class HashContainer[K] ()
    extends typings.jsSdsl.hashContainerBaseMod.default[K] {
    /* protected */ def this(initBucketNum: Double) = this()
    /* protected */ def this(initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    /* protected */ def this(initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "HashMap")
  @js.native
  open class HashMap[K, V] ()
    extends typings.jsSdsl.hashContainerHashMapMod.default[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
    def this(container: Unit, initBucketNum: Double) = this()
    def this(container: initContainer[js.Tuple2[K, V]], initBucketNum: Double) = this()
    def this(container: Unit, initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: Unit, initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(
      container: initContainer[js.Tuple2[K, V]],
      initBucketNum: Double,
      hashFunc: js.Function1[/* x */ K, Double]
    ) = this()
    def this(
      container: initContainer[js.Tuple2[K, V]],
      initBucketNum: Unit,
      hashFunc: js.Function1[/* x */ K, Double]
    ) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "HashSet")
  @js.native
  open class HashSet[K] ()
    extends typings.jsSdsl.hashContainerHashSetMod.default[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, initBucketNum: Double) = this()
    def this(container: initContainer[K], initBucketNum: Double) = this()
    def this(container: Unit, initBucketNum: Double, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: Unit, initBucketNum: Unit, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Double, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Unit, _hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "LinkList")
  @js.native
  open class LinkList[T] ()
    extends typings.jsSdsl.sequentialContainerLinkListMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "LinkListIterator")
  @js.native
  open class LinkListIterator[T] protected ()
    extends typings.jsSdsl.sequentialContainerLinkListMod.LinkListIterator[T] {
    def this(_node: LinkNode[T], _header: LinkNode[T]) = this()
    def this(_node: LinkNode[T], _header: LinkNode[T], iteratorType: IteratorType) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "OrderedMap")
  @js.native
  open class OrderedMap[K, V] ()
    extends typings.jsSdsl.treeContainerOrderedMapMod.default[K, V] {
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
  
  @JSImport("js-sdsl/dist/esm", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] protected ()
    extends typings.jsSdsl.treeContainerOrderedMapMod.OrderedMapIterator[K, V] {
    def this(_node: TreeNode[K, V], _header: TreeNode[K, V]) = this()
    def this(_node: TreeNode[K, V], _header: TreeNode[K, V], iteratorType: IteratorType) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "OrderedSet")
  @js.native
  open class OrderedSet[K] ()
    extends typings.jsSdsl.treeContainerOrderedSetMod.default[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] protected ()
    extends typings.jsSdsl.treeContainerOrderedSetMod.OrderedSetIterator[K] {
    def this(_node: TreeNode[K, Unit], _header: TreeNode[K, Unit]) = this()
    def this(_node: TreeNode[K, Unit], _header: TreeNode[K, Unit], iteratorType: IteratorType) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "PriorityQueue")
  @js.native
  /**
    * @description PriorityQueue's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param _cmp Compare function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    */
  open class PriorityQueue[T] ()
    extends typings.jsSdsl.otherContainerPriorityQueueMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, _cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: initContainer[T], _cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: Unit, _cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: Unit, _cmp: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], _cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: initContainer[T], _cmp: Unit, copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "Queue")
  @js.native
  open class Queue[T] ()
    extends typings.jsSdsl.otherContainerQueueMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "SequentialContainer")
  @js.native
  abstract class SequentialContainer[T] ()
    extends typings.jsSdsl.containerSequentialContainerBaseMod.default[T]
  
  @JSImport("js-sdsl/dist/esm", "Stack")
  @js.native
  open class Stack[T] ()
    extends typings.jsSdsl.otherContainerStackMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "TreeContainer")
  @js.native
  /* protected */ abstract class TreeContainer[K, V] ()
    extends typings.jsSdsl.containerTreeContainerBaseMod.default[K, V] {
    /* protected */ def this(_cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    /* protected */ def this(_cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    /* protected */ def this(_cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "Vector")
  @js.native
  /**
    * @description Vector's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    */
  open class Vector[T] ()
    extends typings.jsSdsl.sequentialContainerVectorMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "VectorIterator")
  @js.native
  open class VectorIterator[T] protected ()
    extends typings.jsSdsl.sequentialContainerVectorMod.VectorIterator[T] {
    def this(
      index: Double,
      size: js.Function0[Double],
      getElementByPos: js.Function1[/* pos */ Double, T],
      setElementByPos: js.Function2[/* pos */ Double, /* element */ T, Unit]
    ) = this()
    def this(
      index: Double,
      size: js.Function0[Double],
      getElementByPos: js.Function1[/* pos */ Double, T],
      setElementByPos: js.Function2[/* pos */ Double, /* element */ T, Unit],
      iteratorType: IteratorType
    ) = this()
  }
}
