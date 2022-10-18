package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.jsSdsl.distEsmContainerSequentialContainerDequeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm", "Container")
  @js.native
  open class Container[T] ()
    extends typings.jsSdsl.distEsmContainerContainerBaseMod.Container[T]
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm", "ContainerIterator")
  @js.native
  /* protected */ open class ContainerIterator[T] ()
    extends typings.jsSdsl.distEsmContainerContainerBaseMod.ContainerIterator[T] {
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
  /* protected */ open class DequeIterator[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerDequeMod.DequeIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm", "HashContainer")
  @js.native
  /* protected */ open class HashContainer[K] ()
    extends typings.jsSdsl.distEsmContainerHashContainerBaseMod.default[K] {
    /* protected */ def this(initBucketNum: Double) = this()
    /* protected */ def this(initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    /* protected */ def this(initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "HashMap")
  @js.native
  open class HashMap[K, V] ()
    extends typings.jsSdsl.distEsmContainerHashContainerHashMapMod.default[K, V] {
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
    extends typings.jsSdsl.distEsmContainerHashContainerHashSetMod.default[K] {
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
    extends typings.jsSdsl.distEsmContainerSequentialContainerLinkListMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "LinkListIterator")
  @js.native
  /* protected */ open class LinkListIterator[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerLinkListMod.LinkListIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "OrderedMap")
  @js.native
  /**
    * @param container The initialization container.
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
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
  
  @JSImport("js-sdsl/dist/esm", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] ()
    extends typings.jsSdsl.distEsmContainerTreeContainerOrderedMapMod.OrderedMapIterator[K, V]
  
  @JSImport("js-sdsl/dist/esm", "OrderedSet")
  @js.native
  /**
    * @param container The initialization container.
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
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
  
  @JSImport("js-sdsl/dist/esm", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] ()
    extends typings.jsSdsl.distEsmContainerTreeContainerOrderedSetMod.OrderedSetIterator[K]
  
  @JSImport("js-sdsl/dist/esm", "PriorityQueue")
  @js.native
  /**
    * @description PriorityQueue's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param cmp Compare function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
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
  
  @JSImport("js-sdsl/dist/esm", "Queue")
  @js.native
  open class Queue[T] ()
    extends typings.jsSdsl.distEsmContainerOtherContainerQueueMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm", "SequentialContainer")
  @js.native
  open class SequentialContainer[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerBaseMod.default[T]
  
  @JSImport("js-sdsl/dist/esm", "Stack")
  @js.native
  open class Stack[T] ()
    extends typings.jsSdsl.distEsmContainerOtherContainerStackMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm", "TreeContainer")
  @js.native
  /**
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
    */
  /* protected */ open class TreeContainer[K, V] ()
    extends typings.jsSdsl.distEsmContainerTreeContainerBaseMod.default[K, V] {
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    /* protected */ def this(cmp: Unit, enableIndex: Boolean) = this()
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
    extends typings.jsSdsl.distEsmContainerSequentialContainerVectorMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm", "VectorIterator")
  @js.native
  /* protected */ open class VectorIterator[T] ()
    extends typings.jsSdsl.distEsmContainerSequentialContainerVectorMod.VectorIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
}
