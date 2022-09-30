package typings.heapJs

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heap-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("heap-js", JSImport.Default)
  @js.native
  /**
    * Heap instance constructor.
    * @param  {Function} compare Optional comparison function, defaults to Heap.minComparator<number>
    */
  open class default[T] () extends Heap[T] {
    def this(compare: Comparator[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("heap-js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default equality function.
      * @param  {any} a    First element
      * @param  {any} b    Second element
      * @return {Boolean}  True if equal, false otherwise
      */
    inline def defaultIsEqual[N](a: N, b: N): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Gets children indices for given index.
      * @param  {Number} idx     Parent index
      * @return {Array(Number)}  Array of children indices
      */
    inline def getChildrenIndexOf(idx: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildrenIndexOf")(idx.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    /**
      * Gets parent index for given index.
      * @param  {Number} idx  Children index
      * @return {Number | undefined}      Parent index, -1 if idx is 0
      */
    inline def getParentIndexOf(idx: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentIndexOf")(idx.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Gets sibling index for given index.
      * @param  {Number} idx  Children index
      * @return {Number | undefined}      Sibling index, -1 if idx is 0
      */
    inline def getSiblingIndexOf(idx: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingIndexOf")(idx.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Return the `n` least valuable elements of a heap-like Array
      * @param  {Array}    heapArr  Array, should be an array-heap
      * @param  {number}   n        Max number of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def heapbottom[N](heapArr: js.Array[N]): js.Array[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any]).asInstanceOf[js.Array[N]]
    inline def heapbottom[N](heapArr: js.Array[N], n: Double): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heapbottom[N](heapArr: js.Array[N], n: Double, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heapbottom[N](heapArr: js.Array[N], n: Unit, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Converts an array into an array-heap, in place
      * @param  {Array}    arr      Array to be modified
      * @param  {Function} compare  Optional compare function
      * @return {Heap}              For convenience, it returns a Heap instance
      */
    inline def heapify[N](arr: js.Array[N]): Heap[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(arr.asInstanceOf[js.Any]).asInstanceOf[Heap[N]]
    inline def heapify[N](arr: js.Array[N], compare: Comparator[N]): Heap[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(arr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Heap[N]]
    
    /**
      * Extract the peek of an array-heap
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {Function} compare  Optional compare function
      * @return {any}               Returns the extracted peek
      */
    inline def heappop[N](heapArr: js.Array[N]): js.UndefOr[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heappop")(heapArr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[N]]
    inline def heappop[N](heapArr: js.Array[N], compare: Comparator[N]): js.UndefOr[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heappop")(heapArr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[N]]
    
    /**
      * Pushes a item into an array-heap
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {any}      item     Item to push
      * @param  {Function} compare  Optional compare function
      */
    inline def heappush[N](heapArr: js.Array[N], item: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("heappush")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def heappush[N](heapArr: js.Array[N], item: N, compare: Comparator[N]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("heappush")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Push followed by pop, faster
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {any}      item     Item to push
      * @param  {Function} compare  Optional compare function
      * @return {any}               Returns the extracted peek
      */
    inline def heappushpop[N](heapArr: js.Array[N], item: N): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heappushpop")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[N]
    inline def heappushpop[N](heapArr: js.Array[N], item: N, compare: Comparator[N]): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heappushpop")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[N]
    
    /**
      * Replace peek with item
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {any}      item     Item as replacement
      * @param  {Function} compare  Optional compare function
      * @return {any}               Returns the extracted peek
      */
    inline def heapreplace[N](heapArr: js.Array[N], item: N): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heapreplace")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[N]
    inline def heapreplace[N](heapArr: js.Array[N], item: N, compare: Comparator[N]): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heapreplace")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[N]
    
    /**
      * Return the `n` most valuable elements of a heap-like Array
      * @param  {Array}    heapArr  Array, should be an array-heap
      * @param  {number}   n        Max number of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def heaptop[N](heapArr: js.Array[N]): js.Array[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any]).asInstanceOf[js.Array[N]]
    inline def heaptop[N](heapArr: js.Array[N], n: Double): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heaptop[N](heapArr: js.Array[N], n: Double, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heaptop[N](heapArr: js.Array[N], n: Unit, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Max heap comparison function.
      * @param  {any} a     First element
      * @param  {any} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def maxComparator[N](a: N, b: N): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxComparator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Max number heap comparison function.
      * @param  {Number} a     First element
      * @param  {Number} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def maxComparatorNumber(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxComparatorNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Min heap comparison function, default.
      * @param  {any} a     First element
      * @param  {any} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def minComparator[N](a: N, b: N): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minComparator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Min number heap comparison function, default.
      * @param  {Number} a     First element
      * @param  {Number} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def minComparatorNumber(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minComparatorNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Return the `n` most valuable elements of an iterable
      * @param  {number}   n        Max number of elements
      * @param  {Iterable} Iterable Iterable list of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def nlargest[N](n: Double, iterable: js.Iterable[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def nlargest[N](n: Double, iterable: js.Iterable[N], compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Return the `n` least valuable elements of an iterable
      * @param  {number}   n        Max number of elements
      * @param  {Iterable} Iterable Iterable list of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def nsmallest[N](n: Double, iterable: js.Iterable[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def nsmallest[N](n: Double, iterable: js.Iterable[N], compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Prints a heap.
      * @param  {Heap} heap Heap to be printed
      * @returns {String}
      */
    inline def print[N](heap: Heap[N]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(heap.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("heap-js", "Heap")
  @js.native
  /**
    * Heap instance constructor.
    * @param  {Function} compare Optional comparison function, defaults to Heap.minComparator<number>
    */
  open class Heap[T] ()
    extends StObject
       with Iterable[T] {
    def this(compare: Comparator[T]) = this()
    
    /**
      * Limit heap size if needed
      */
    def _applyLimit(): Unit = js.native
    
    /**
      * Return the bottom (lowest value) N elements of the heap, without corner cases, unsorted
      *
      * @param  {Number} n  Number of elements.
      * @return {Array}     Array of length <= N.
      */
    def _bottomN_push(n: Double): js.Array[T] = js.native
    
    /**
      * Returns the inverse to the comparison function.
      * @return {Function}
      */
    def _invertedCompare(a: T, b: T): Double = js.native
    
    var _limit: Double = js.native
    
    /**
      * Move a node to a new index, switching places
      * @param  {Number} j First node index
      * @param  {Number} k Another node index
      */
    def _moveNode(j: Double, k: Double): Unit = js.native
    
    /**
      * Move a node down the tree (to the leaves) to find a place where the heap is sorted.
      * @param  {Number} i Index of the node
      */
    def _sortNodeDown(i: Double): Unit = js.native
    
    /**
      * Move a node up the tree (to the root) to find a place where the heap is sorted.
      * @param  {Number} i Index of the node
      */
    def _sortNodeUp(i: Double): Unit = js.native
    
    /**
      * Return index of the top element
      * @param list
      */
    def _topIdxOf(list: js.Array[T]): Double = js.native
    
    /**
      * Return the top (highest value) N elements of the heap, without corner cases, unsorted
      * Implementation: init + push.
      *
      * @param  {Number} n  Number of elements.
      * @return {Array}     Array of length <= N.
      */
    def _topN_fill(n: Double): js.Array[T] = js.native
    
    /**
      * Return the top (highest value) N elements of the heap, without corner cases, unsorted
      * Implementation: heap.
      *
      * @param  {Number} n  Number of elements.
      * @return {Array}     Array of length <= N.
      */
    def _topN_heap(n: Double): js.Array[T] = js.native
    
    /**
      * Return the top (highest value) N elements of the heap, without corner cases, unsorted
      * Implementation: push.
      *
      * @param  {Number} n  Number of elements.
      * @return {Array}     Array of length <= N.
      */
    def _topN_push(n: Double): js.Array[T] = js.native
    
    /**
      * Return the top element
      * @param list
      */
    def _topOf(list: T*): js.UndefOr[T] = js.native
    
    /**
      * Adds an element to the heap. Aliases: `offer`.
      * Same as: push(element)
      * @param {any} element Element to be added
      * @return {Boolean} true
      */
    def add(element: T): Boolean = js.native
    
    /**
      * Adds an array of elements to the heap.
      * Similar as: push(element, element, ...).
      * @param {Array} elements Elements to be added
      * @return {Boolean} true
      */
    def addAll(elements: js.Array[T]): Boolean = js.native
    
    /**
      * Return the bottom (lowest value) N elements of the heap.
      *
      * @param  {Number} n  Number of elements.
      * @return {Array}     Array of length <= N.
      */
    def bottom(): js.Array[T] = js.native
    def bottom(n: Double): js.Array[T] = js.native
    
    /**
      * Check if the heap is sorted, useful for testing purposes.
      * @return {Undefined | Element}  Returns an element if something wrong is found, otherwise it's undefined
      */
    def check(): js.UndefOr[T] = js.native
    
    /**
      * Remove all of the elements from this heap.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns the comparison function.
      * @return {Function}
      */
    def comparator(): Comparator[T] = js.native
    
    def compare(a: T, b: T): Double = js.native
    @JSName("compare")
    var compare_Original: Comparator[T] = js.native
    
    /**
      * Returns true if this queue contains the specified element.
      * @param  {any}      o   Element to be found
      * @param  {Function} fn  Optional comparison function, receives (element, needle)
      * @return {Boolean}
      */
    def contains(o: T): Boolean = js.native
    def contains(o: T, fn: IsEqual[T]): Boolean = js.native
    
    /**
      * Alias of peek
      */
    def element(): js.UndefOr[T] = js.native
    
    /**
      * Get the element at the given index.
      * @param  {Number} i Index to get
      * @return {any}       Element at that index
      */
    def get(i: Double): T = js.native
    
    /**
      * Get the elements of these node's children
      * @param  {Number} idx Node index
      * @return {Array(any)}  Children elements
      */
    def getChildrenOf(idx: Double): js.Array[T] = js.native
    
    /**
      * Get the element of this node's parent
      * @param  {Number} idx Node index
      * @return {any}     Parent element
      */
    def getParentOf(idx: Double): js.UndefOr[T] = js.native
    
    var heapArray: js.Array[T] = js.native
    
    /**
      * Initialise a heap, sorting nodes
      * @param  {Array} array Optional initial state array
      */
    def init(): Unit = js.native
    def init(array: js.Array[T]): Unit = js.native
    
    /**
      * Test if the heap has no elements.
      * @return {Boolean} True if no elements on the heap
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Iterator interface
      */
    @JSName(js.Symbol.iterator)
    var iterator_FHeap: js.Function0[js.Iterator[T]] = js.native
    
    /**
      * Returns an iterator. To comply with Java interface.
      */
    @JSName("iterator")
    def iterator_MHeap(): js.Iterable[T] = js.native
    
    /**
      * Get the leafs of the tree (no children nodes)
      */
    def leafs(): js.Array[T] = js.native
    
    /**
      * Length of the heap.
      * @return {Number}
      */
    def length: Double = js.native
    
    /**
      * Get length limit of the heap.
      * @return {Number}
      */
    def limit: Double = js.native
    /**
      * Set length limit of the heap.
      * @return {Number}
      */
    def limit_=(_l: Double): Unit = js.native
    
    /**
      * Alias of add
      */
    def offer(element: T): Boolean = js.native
    
    /**
      * Top node. Aliases: `element`.
      * Same as: `top(1)[0]`
      * @return {any} Top node
      */
    def peek(): js.UndefOr[T] = js.native
    
    /**
      * Alias of pop
      */
    def poll(): js.UndefOr[T] = js.native
    
    /**
      * Extract the top node (root). Aliases: `poll`.
      * @return {any} Extracted top node, undefined if empty
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Pushes element(s) to the heap.
      * @param  {...any} elements Elements to insert
      * @return {Boolean} True if elements are present
      */
    def push(elements: T*): Boolean = js.native
    
    /**
      * Same as push & pop in sequence, but faster
      * @param  {any} element Element to insert
      * @return {any}  Extracted top node
      */
    def pushpop(element: T): T = js.native
    
    /**
      * Remove an element from the heap.
      * @param  {any}   o      Element to be found
      * @param  {Function} fn  Optional function to compare
      * @return {Boolean}      True if the heap was modified
      */
    def remove(): Boolean = js.native
    def remove(o: T): Boolean = js.native
    def remove(o: T, fn: IsEqual[T]): Boolean = js.native
    def remove(o: Unit, fn: IsEqual[T]): Boolean = js.native
    
    /**
      * Pop the current peek value, and add the new item.
      * @param  {any} element  Element to replace peek
      * @return {any}         Old peek
      */
    def replace(element: T): T = js.native
    
    /**
      * Size of the heap
      * @return {Number}
      */
    def size(): Double = js.native
    
    /**
      * Clone the heap's internal array
      * @return {Array}
      */
    def toArray(): js.Array[T] = js.native
    
    /**
      * Return the top (highest value) N elements of the heap.
      *
      * @param  {Number} n  Number of elements.
      * @return {Array}    Array of length <= N.
      */
    def top(): js.Array[T] = js.native
    def top(n: Double): js.Array[T] = js.native
  }
  /* static members */
  object Heap {
    
    @JSImport("heap-js", "Heap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default equality function.
      * @param  {any} a    First element
      * @param  {any} b    Second element
      * @return {Boolean}  True if equal, false otherwise
      */
    inline def defaultIsEqual[N](a: N, b: N): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Gets children indices for given index.
      * @param  {Number} idx     Parent index
      * @return {Array(Number)}  Array of children indices
      */
    inline def getChildrenIndexOf(idx: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildrenIndexOf")(idx.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    /**
      * Gets parent index for given index.
      * @param  {Number} idx  Children index
      * @return {Number | undefined}      Parent index, -1 if idx is 0
      */
    inline def getParentIndexOf(idx: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentIndexOf")(idx.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Gets sibling index for given index.
      * @param  {Number} idx  Children index
      * @return {Number | undefined}      Sibling index, -1 if idx is 0
      */
    inline def getSiblingIndexOf(idx: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingIndexOf")(idx.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Return the `n` least valuable elements of a heap-like Array
      * @param  {Array}    heapArr  Array, should be an array-heap
      * @param  {number}   n        Max number of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def heapbottom[N](heapArr: js.Array[N]): js.Array[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any]).asInstanceOf[js.Array[N]]
    inline def heapbottom[N](heapArr: js.Array[N], n: Double): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heapbottom[N](heapArr: js.Array[N], n: Double, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heapbottom[N](heapArr: js.Array[N], n: Unit, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapbottom")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Converts an array into an array-heap, in place
      * @param  {Array}    arr      Array to be modified
      * @param  {Function} compare  Optional compare function
      * @return {Heap}              For convenience, it returns a Heap instance
      */
    inline def heapify[N](arr: js.Array[N]): Heap[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(arr.asInstanceOf[js.Any]).asInstanceOf[Heap[N]]
    inline def heapify[N](arr: js.Array[N], compare: Comparator[N]): Heap[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(arr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Heap[N]]
    
    /**
      * Extract the peek of an array-heap
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {Function} compare  Optional compare function
      * @return {any}               Returns the extracted peek
      */
    inline def heappop[N](heapArr: js.Array[N]): js.UndefOr[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heappop")(heapArr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[N]]
    inline def heappop[N](heapArr: js.Array[N], compare: Comparator[N]): js.UndefOr[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heappop")(heapArr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[N]]
    
    /**
      * Pushes a item into an array-heap
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {any}      item     Item to push
      * @param  {Function} compare  Optional compare function
      */
    inline def heappush[N](heapArr: js.Array[N], item: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("heappush")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def heappush[N](heapArr: js.Array[N], item: N, compare: Comparator[N]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("heappush")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Push followed by pop, faster
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {any}      item     Item to push
      * @param  {Function} compare  Optional compare function
      * @return {any}               Returns the extracted peek
      */
    inline def heappushpop[N](heapArr: js.Array[N], item: N): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heappushpop")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[N]
    inline def heappushpop[N](heapArr: js.Array[N], item: N, compare: Comparator[N]): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heappushpop")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[N]
    
    /**
      * Replace peek with item
      * @param  {Array}    heapArr  Array to be modified, should be a heap
      * @param  {any}      item     Item as replacement
      * @param  {Function} compare  Optional compare function
      * @return {any}               Returns the extracted peek
      */
    inline def heapreplace[N](heapArr: js.Array[N], item: N): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heapreplace")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[N]
    inline def heapreplace[N](heapArr: js.Array[N], item: N, compare: Comparator[N]): N = (^.asInstanceOf[js.Dynamic].applyDynamic("heapreplace")(heapArr.asInstanceOf[js.Any], item.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[N]
    
    /**
      * Return the `n` most valuable elements of a heap-like Array
      * @param  {Array}    heapArr  Array, should be an array-heap
      * @param  {number}   n        Max number of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def heaptop[N](heapArr: js.Array[N]): js.Array[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any]).asInstanceOf[js.Array[N]]
    inline def heaptop[N](heapArr: js.Array[N], n: Double): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heaptop[N](heapArr: js.Array[N], n: Double, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def heaptop[N](heapArr: js.Array[N], n: Unit, compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("heaptop")(heapArr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Max heap comparison function.
      * @param  {any} a     First element
      * @param  {any} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def maxComparator[N](a: N, b: N): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxComparator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Max number heap comparison function.
      * @param  {Number} a     First element
      * @param  {Number} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def maxComparatorNumber(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxComparatorNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Min heap comparison function, default.
      * @param  {any} a     First element
      * @param  {any} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def minComparator[N](a: N, b: N): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minComparator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Min number heap comparison function, default.
      * @param  {Number} a     First element
      * @param  {Number} b     Second element
      * @return {Number}    0 if they're equal, positive if `a` goes up, negative if `b` goes up
      */
    inline def minComparatorNumber(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minComparatorNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Return the `n` most valuable elements of an iterable
      * @param  {number}   n        Max number of elements
      * @param  {Iterable} Iterable Iterable list of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def nlargest[N](n: Double, iterable: js.Iterable[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def nlargest[N](n: Double, iterable: js.Iterable[N], compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Return the `n` least valuable elements of an iterable
      * @param  {number}   n        Max number of elements
      * @param  {Iterable} Iterable Iterable list of elements
      * @param  {Function} compare  Optional compare function
      * @return {any}               Elements
      */
    inline def nsmallest[N](n: Double, iterable: js.Iterable[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    inline def nsmallest[N](n: Double, iterable: js.Iterable[N], compare: Comparator[N]): js.Array[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(n.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[N]]
    
    /**
      * Prints a heap.
      * @param  {Heap} heap Heap to be printed
      * @returns {String}
      */
    inline def print[N](heap: Heap[N]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(heap.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def toInt(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toInt")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type IsEqual[T] = js.Function2[/* e */ T, /* o */ T, Boolean]
}
