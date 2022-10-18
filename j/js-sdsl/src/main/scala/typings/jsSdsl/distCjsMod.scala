package typings.jsSdsl

import typings.jsSdsl.distCjsContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distCjsContainerContainerBaseMod.initContainer
import typings.jsSdsl.distCjsContainerSequentialContainerDequeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/cjs", "Container")
  @js.native
  open class Container[T] ()
    extends typings.jsSdsl.distCjsContainerContainerBaseMod.Container[T]
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/cjs", "ContainerIterator")
  @js.native
  /* protected */ open class ContainerIterator[T] ()
    extends typings.jsSdsl.distCjsContainerContainerBaseMod.ContainerIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "Deque")
  @js.native
  open class Deque[T] () extends default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, _bucketSize: Double) = this()
    def this(container: initContainer[T], _bucketSize: Double) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "DequeIterator")
  @js.native
  /* protected */ open class DequeIterator[T] ()
    extends typings.jsSdsl.distCjsContainerSequentialContainerDequeMod.DequeIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/cjs", "HashContainer")
  @js.native
  /* protected */ open class HashContainer[K] ()
    extends typings.jsSdsl.distCjsContainerHashContainerBaseMod.default[K] {
    /* protected */ def this(initBucketNum: Double) = this()
    /* protected */ def this(initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    /* protected */ def this(initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "HashMap")
  @js.native
  open class HashMap[K, V] ()
    extends typings.jsSdsl.distCjsContainerHashContainerHashMapMod.default[K, V] {
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
    extends typings.jsSdsl.distCjsContainerHashContainerHashSetMod.default[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, initBucketNum: Double) = this()
    def this(container: initContainer[K], initBucketNum: Double) = this()
    def this(container: Unit, initBucketNum: Double, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: Unit, initBucketNum: Unit, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Double, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Unit, _hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "LinkList")
  @js.native
  open class LinkList[T] ()
    extends typings.jsSdsl.distCjsContainerSequentialContainerLinkListMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "LinkListIterator")
  @js.native
  /* protected */ open class LinkListIterator[T] ()
    extends typings.jsSdsl.distCjsContainerSequentialContainerLinkListMod.LinkListIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "OrderedMap")
  @js.native
  /**
    * @param container The initialization container.
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
    */
  open class OrderedMap[K, V] ()
    extends typings.jsSdsl.distCjsContainerTreeContainerOrderedMapMod.default[K, V] {
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
  
  @JSImport("js-sdsl/dist/cjs", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] ()
    extends typings.jsSdsl.distCjsContainerTreeContainerOrderedMapMod.OrderedMapIterator[K, V]
  
  @JSImport("js-sdsl/dist/cjs", "OrderedSet")
  @js.native
  /**
    * @param container The initialization container.
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
    */
  open class OrderedSet[K] ()
    extends typings.jsSdsl.distCjsContainerTreeContainerOrderedSetMod.default[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] ()
    extends typings.jsSdsl.distCjsContainerTreeContainerOrderedSetMod.OrderedSetIterator[K]
  
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
    extends typings.jsSdsl.distCjsContainerOtherContainerPriorityQueueMod.default[T] {
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
    extends typings.jsSdsl.distCjsContainerOtherContainerQueueMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/cjs", "SequentialContainer")
  @js.native
  open class SequentialContainer[T] ()
    extends typings.jsSdsl.distCjsContainerSequentialContainerBaseMod.default[T]
  
  @JSImport("js-sdsl/dist/cjs", "Stack")
  @js.native
  open class Stack[T] ()
    extends typings.jsSdsl.distCjsContainerOtherContainerStackMod.default[T] {
    def this(container: initContainer[T]) = this()
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/cjs", "TreeContainer")
  @js.native
  /**
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
    */
  /* protected */ open class TreeContainer[K, V] ()
    extends typings.jsSdsl.distCjsContainerTreeContainerBaseMod.default[K, V] {
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    /* protected */ def this(cmp: Unit, enableIndex: Boolean) = this()
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
    extends typings.jsSdsl.distCjsContainerSequentialContainerVectorMod.default[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs", "VectorIterator")
  @js.native
  /* protected */ open class VectorIterator[T] ()
    extends typings.jsSdsl.distCjsContainerSequentialContainerVectorMod.VectorIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
}
