package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.initContainer
import typings.jsSdsl.dequeMod.default
import typings.jsSdsl.linkListMod.LinkNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-sdsl/dist/cjs", "Container")
  @js.native
  abstract class Container[T] ()
    extends typings.jsSdsl.containerBaseMod.Container[T]
  
  @JSImport("js-sdsl/dist/cjs", "ContainerIterator")
  @js.native
  /* protected */ abstract class ContainerIterator[T] ()
    extends typings.jsSdsl.containerBaseMod.ContainerIterator[T] {
    /* protected */ def this(iteratorType: Boolean) = this()
  }
  /* static members */
  object ContainerIterator {
    
    @JSImport("js-sdsl/dist/cjs", "ContainerIterator.NORMAL")
    @js.native
    val NORMAL: /* false */ Boolean = js.native
    
    @JSImport("js-sdsl/dist/cjs", "ContainerIterator.REVERSE")
    @js.native
    val REVERSE: /* true */ Boolean = js.native
  }
  
  @JSImport("js-sdsl/dist/cjs", "Deque")
  @js.native
  open class Deque[T] () extends default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, bucketSize: Double) = this()
    def this(container: initContainer[T], bucketSize: Double) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "DequeIterator")
  @js.native
  open class DequeIterator[T] protected ()
    extends typings.jsSdsl.dequeMod.DequeIterator[T] {
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
      iteratorType: Boolean
    ) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "HashContainer")
  @js.native
  /* protected */ abstract class HashContainer[K] ()
    extends typings.jsSdsl.baseMod.default[K] {
    /* protected */ def this(initBucketNum: Double) = this()
    /* protected */ def this(initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    /* protected */ def this(initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  object HashContainer {
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs", "HashContainer.maxBucketNum")
    @js.native
    val maxBucketNum: Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs", "HashContainer.minTreeifySize")
    @js.native
    val minTreeifySize: /* 64 */ Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs", "HashContainer.sigma")
    @js.native
    val sigma: /* 0.75 */ Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs", "HashContainer.treeifyThreshold")
    @js.native
    val treeifyThreshold: /* 8 */ Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs", "HashContainer.untreeifyThreshold")
    @js.native
    val untreeifyThreshold: /* 6 */ Double = js.native
  }
  
  @JSImport("js-sdsl/dist/cjs", "HashMap")
  @js.native
  open class HashMap[K, V] ()
    extends typings.jsSdsl.hashMapMod.default[K, V] {
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
  
  @JSImport("js-sdsl/dist/cjs", "HashSet")
  @js.native
  open class HashSet[K] ()
    extends typings.jsSdsl.hashSetMod.default[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, initBucketNum: Double) = this()
    def this(container: initContainer[K], initBucketNum: Double) = this()
    def this(container: Unit, initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: Unit, initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "LinkList")
  @js.native
  open class LinkList[T] ()
    extends typings.jsSdsl.linkListMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "LinkListIterator")
  @js.native
  open class LinkListIterator[T] protected ()
    extends typings.jsSdsl.linkListMod.LinkListIterator[T] {
    def this(node: LinkNode[T], header: LinkNode[T]) = this()
    def this(node: LinkNode[T], header: LinkNode[T], iteratorType: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "OrderedMap")
  @js.native
  open class OrderedMap[K, V] ()
    extends typings.jsSdsl.orderedMapMod.default[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[js.Tuple2[K, V]], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] protected ()
    extends typings.jsSdsl.orderedMapMod.OrderedMapIterator[K, V] {
    def this(node: typings.jsSdsl.treeNodeMod.default[K, V], header: typings.jsSdsl.treeNodeMod.default[K, V]) = this()
    def this(
      node: typings.jsSdsl.treeNodeMod.default[K, V],
      header: typings.jsSdsl.treeNodeMod.default[K, V],
      iteratorType: Boolean
    ) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "OrderedSet")
  @js.native
  open class OrderedSet[K] ()
    extends typings.jsSdsl.orderedSetMod.default[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] protected ()
    extends typings.jsSdsl.orderedSetMod.OrderedSetIterator[K] {
    def this(
      node: typings.jsSdsl.treeNodeMod.default[K, Unit],
      header: typings.jsSdsl.treeNodeMod.default[K, Unit]
    ) = this()
    def this(
      node: typings.jsSdsl.treeNodeMod.default[K, Unit],
      header: typings.jsSdsl.treeNodeMod.default[K, Unit],
      iteratorType: Boolean
    ) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "PriorityQueue")
  @js.native
  /**
    * @description PriorityQueue's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param cmp Compare function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    */
  open class PriorityQueue[T] ()
    extends typings.jsSdsl.priorityQueueMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: Unit, cmp: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: initContainer[T], cmp: Unit, copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "Queue")
  @js.native
  open class Queue[T] ()
    extends typings.jsSdsl.queueMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "SequentialContainer")
  @js.native
  abstract class SequentialContainer[T] ()
    extends typings.jsSdsl.sequentialContainerBaseMod.default[T]
  
  @JSImport("js-sdsl/dist/cjs", "Stack")
  @js.native
  open class Stack[T] ()
    extends typings.jsSdsl.stackMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "TreeContainer")
  @js.native
  /* protected */ abstract class TreeContainer[K, V] ()
    extends typings.jsSdsl.treeContainerBaseMod.default[K, V] {
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "Vector")
  @js.native
  /**
    * @description Vector's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    */
  open class Vector[T] ()
    extends typings.jsSdsl.vectorMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "VectorIterator")
  @js.native
  open class VectorIterator[T] protected ()
    extends typings.jsSdsl.vectorMod.VectorIterator[T] {
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
      iteratorType: Boolean
    ) = this()
  }
}
