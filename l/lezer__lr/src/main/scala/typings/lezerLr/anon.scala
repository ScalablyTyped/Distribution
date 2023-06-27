package typings.lezerLr

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.lezerCommon.mod.Tree
import typings.lezerLr.distStackMod.Stack
import typings.lezerLr.distTokenMod.ExternalTokenizer
import typings.lezerLr.distTokenMod.InputStream
import typings.lezerLr.mod.LocalTokenGroup
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object From {
    
    inline def apply(from: Double, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromTo extends StObject {
    
    def from(value: String, stack: Stack): Double
    
    def to(value: String, stack: Stack): Double
  }
  object FromTo {
    
    inline def apply(from: (String, Stack) => Double, to: (String, Stack) => Double): FromTo = {
      val __obj = js.Dynamic.literal(from = js.Any.fromFunction2(from), to = js.Any.fromFunction2(to))
      __obj.asInstanceOf[FromTo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromTo] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: (String, Stack) => Double): Self = StObject.set(x, "from", js.Any.fromFunction2(value))
      
      inline def setTo(value: (String, Stack) => Double): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    }
  }
  
  trait Hash[T] extends StObject {
    
    var hash: js.UndefOr[js.Function1[/* context */ T, Double]] = js.undefined
    
    var reduce: js.UndefOr[
        js.Function4[/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream, T]
      ] = js.undefined
    
    var reuse: js.UndefOr[
        js.Function4[/* context */ T, /* node */ Tree, /* stack */ Stack, /* input */ InputStream, T]
      ] = js.undefined
    
    var shift: js.UndefOr[
        js.Function4[/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream, T]
      ] = js.undefined
    
    var start: T
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Hash {
    
    inline def apply[T](start: T): Hash[T] = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hash[?], T] (val x: Self & Hash[T]) extends AnyVal {
      
      inline def setHash(value: /* context */ T => Double): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setReduce(value: (/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream) => T): Self = StObject.set(x, "reduce", js.Any.fromFunction4(value))
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReuse(value: (/* context */ T, /* node */ Tree, /* stack */ Stack, /* input */ InputStream) => T): Self = StObject.set(x, "reuse", js.Any.fromFunction4(value))
      
      inline def setReuseUndefined: Self = StObject.set(x, "reuse", js.undefined)
      
      inline def setShift(value: (/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream) => T): Self = StObject.set(x, "shift", js.Any.fromFunction4(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setStart(value: T): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable[T /* <: NumberDictionary[Double] */]
    extends StObject
       with Instantiable1[/* n */ Double, T]
  
  /* Inlined std.Readonly<std.Uint16Array> */
  trait ReadonlyUint16Array extends StObject {
    
    val BYTES_PER_ELEMENT: Double
    
    def at(index: Double): js.UndefOr[Double]
    
    val buffer: ArrayBufferLike
    
    val byteLength: Double
    
    val byteOffset: Double
    
    def copyWithin(target: Double): LocalTokenGroup
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]]
    
    def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any]): Boolean
    
    def fill(value: Double): LocalTokenGroup
    
    def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any]): js.typedarray.Uint16Array
    
    def find(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ LocalTokenGroup, Boolean]
    ): js.UndefOr[Double]
    
    def findIndex(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ LocalTokenGroup, Boolean]
    ): Double
    
    def findLast[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ LocalTokenGroup, 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findLastIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any]): Double
    
    def forEach(
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Unit]
    ): Unit
    
    def includes(searchElement: Double): Boolean
    
    def indexOf(searchElement: Double): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: Double): Double
    
    val length: Double
    
    def map(
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Double]
    ): js.typedarray.Uint16Array
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ LocalTokenGroup, 
          Double
        ]
    ): Double
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ LocalTokenGroup, 
          Double
        ]
    ): Double
    
    def reverse(): js.typedarray.Uint16Array
    
    def set(array: ArrayLike[Double]): Unit
    
    def slice(): js.typedarray.Uint16Array
    
    def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any]): Boolean
    
    def sort(): LocalTokenGroup
    
    def subarray(): js.typedarray.Uint16Array
    
    def values(): IterableIterator[Double]
  }
  object ReadonlyUint16Array {
    
    inline def apply(
      BYTES_PER_ELEMENT: Double,
      at: Double => js.UndefOr[Double],
      buffer: ArrayBufferLike,
      byteLength: Double,
      byteOffset: Double,
      copyWithin: Double => LocalTokenGroup,
      entries: () => IterableIterator[js.Tuple2[Double, Double]],
      every: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => Boolean,
      fill: Double => LocalTokenGroup,
      filter: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => js.typedarray.Uint16Array,
      find: js.Function3[/* value */ Double, /* index */ Double, /* obj */ LocalTokenGroup, Boolean] => js.UndefOr[Double],
      findIndex: js.Function3[/* value */ Double, /* index */ Double, /* obj */ LocalTokenGroup, Boolean] => Double,
      findLast: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ LocalTokenGroup, 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findLastIndex: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => Double,
      forEach: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Unit] => Unit,
      includes: Double => Boolean,
      indexOf: Double => Double,
      join: () => String,
      keys: () => IterableIterator[Double],
      lastIndexOf: Double => Double,
      length: Double,
      map: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Double] => js.typedarray.Uint16Array,
      reduce: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ LocalTokenGroup, 
          Double
        ] => Double,
      reduceRight: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ LocalTokenGroup, 
          Double
        ] => Double,
      reverse: () => js.typedarray.Uint16Array,
      set: ArrayLike[Double] => Unit,
      slice: () => js.typedarray.Uint16Array,
      some: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => Boolean,
      sort: () => LocalTokenGroup,
      subarray: () => js.typedarray.Uint16Array,
      values: () => IterableIterator[Double]
    ): ReadonlyUint16Array = {
      val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], at = js.Any.fromFunction1(at), buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], copyWithin = js.Any.fromFunction1(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), findLast = js.Any.fromFunction1(findLast), findLastIndex = js.Any.fromFunction1(findLastIndex), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), subarray = js.Any.fromFunction0(subarray), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyUint16Array]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyUint16Array] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      inline def setCopyWithin(value: Double => LocalTokenGroup): Self = StObject.set(x, "copyWithin", js.Any.fromFunction1(value))
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, Double]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEvery(
        value: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: Double => LocalTokenGroup): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => js.typedarray.Uint16Array
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.Function3[/* value */ Double, /* index */ Double, /* obj */ LocalTokenGroup, Boolean] => js.UndefOr[Double]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: js.Function3[/* value */ Double, /* index */ Double, /* obj */ LocalTokenGroup, Boolean] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFindLast(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ LocalTokenGroup, 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "findLast", js.Any.fromFunction1(value))
      
      inline def setFindLastIndex(
        value: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => Double
      ): Self = StObject.set(x, "findLastIndex", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Unit] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setIncludes(value: Double => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: Double => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setLastIndexOf(value: Double => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Double] => js.typedarray.Uint16Array
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              /* array */ LocalTokenGroup, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              /* array */ LocalTokenGroup, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setSet(value: ArrayLike[Double] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSlice(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSome(
        value: js.Function3[/* value */ Double, /* index */ Double, /* array */ LocalTokenGroup, Any] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: () => LocalTokenGroup): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSubarray(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "subarray", js.Any.fromFunction0(value))
      
      inline def setValues(value: () => IterableIterator[Double]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Uint16Array> */
  trait ReadonlyUint16ArrayAt extends StObject {
    
    val BYTES_PER_ELEMENT: Double
    
    def at(index: Double): js.UndefOr[Double]
    
    val buffer: ArrayBufferLike
    
    val byteLength: Double
    
    val byteOffset: Double
    
    def copyWithin(target: Double): this.type
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]]
    
    def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean
    
    def fill(value: Double): this.type
    
    def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): js.typedarray.Uint16Array
    
    def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double]
    
    def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double
    
    def findLast[S /* <: Double */](
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, /* is S */ Boolean]
    ): js.UndefOr[S]
    
    def findLastIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Double
    
    def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit
    
    def includes(searchElement: Double): Boolean
    
    def indexOf(searchElement: Double): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: Double): Double
    
    val length: Double
    
    def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): js.typedarray.Uint16Array
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ this.type, 
          Double
        ]
    ): Double
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ this.type, 
          Double
        ]
    ): Double
    
    def reverse(): js.typedarray.Uint16Array
    
    def set(array: ArrayLike[Double]): Unit
    
    def slice(): js.typedarray.Uint16Array
    
    def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean
    
    def sort(): this.type
    
    def subarray(): js.typedarray.Uint16Array
    
    def values(): IterableIterator[Double]
  }
  object ReadonlyUint16ArrayAt {
    
    inline def apply(
      BYTES_PER_ELEMENT: Double,
      at: Double => js.UndefOr[Double],
      buffer: ArrayBufferLike,
      byteLength: Double,
      byteOffset: Double,
      copyWithin: Double => ReadonlyUint16ArrayAt,
      entries: () => IterableIterator[js.Tuple2[Double, Double]],
      every: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => Boolean,
      fill: Double => ReadonlyUint16ArrayAt,
      filter: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => js.typedarray.Uint16Array,
      find: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Boolean] => js.UndefOr[Double],
      findIndex: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Boolean] => Double,
      findLast: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, /* is S */ Boolean] => js.UndefOr[Any],
      findLastIndex: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => Double,
      forEach: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Unit] => Unit,
      includes: Double => Boolean,
      indexOf: Double => Double,
      join: () => String,
      keys: () => IterableIterator[Double],
      lastIndexOf: Double => Double,
      length: Double,
      map: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Double] => js.typedarray.Uint16Array,
      reduce: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyUint16ArrayAt, 
          Double
        ] => Double,
      reduceRight: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyUint16ArrayAt, 
          Double
        ] => Double,
      reverse: () => js.typedarray.Uint16Array,
      set: ArrayLike[Double] => Unit,
      slice: () => js.typedarray.Uint16Array,
      some: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => Boolean,
      sort: () => ReadonlyUint16ArrayAt,
      subarray: () => js.typedarray.Uint16Array,
      values: () => IterableIterator[Double]
    ): ReadonlyUint16ArrayAt = {
      val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], at = js.Any.fromFunction1(at), buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], copyWithin = js.Any.fromFunction1(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), findLast = js.Any.fromFunction1(findLast), findLastIndex = js.Any.fromFunction1(findLastIndex), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), subarray = js.Any.fromFunction0(subarray), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyUint16ArrayAt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyUint16ArrayAt] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      inline def setCopyWithin(value: Double => ReadonlyUint16ArrayAt): Self = StObject.set(x, "copyWithin", js.Any.fromFunction1(value))
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, Double]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEvery(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => Boolean): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: Double => ReadonlyUint16ArrayAt): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => js.typedarray.Uint16Array
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Boolean] => js.UndefOr[Double]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Boolean] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFindLast(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, /* is S */ Boolean] => js.UndefOr[Any]
      ): Self = StObject.set(x, "findLast", js.Any.fromFunction1(value))
      
      inline def setFindLastIndex(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => Double): Self = StObject.set(x, "findLastIndex", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setIncludes(value: Double => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: Double => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setLastIndexOf(value: Double => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Double] => js.typedarray.Uint16Array
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              ReadonlyUint16ArrayAt, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              ReadonlyUint16ArrayAt, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setSet(value: ArrayLike[Double] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSlice(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSome(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint16ArrayAt, Any] => Boolean): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: () => ReadonlyUint16ArrayAt): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSubarray(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "subarray", js.Any.fromFunction0(value))
      
      inline def setValues(value: () => IterableIterator[Double]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Uint16Array> */
  trait ReadonlyUint16ArrayBYTESPERELEMENT extends StObject {
    
    val BYTES_PER_ELEMENT: Double
    
    def at(index: Double): js.UndefOr[Double]
    
    val buffer: ArrayBufferLike
    
    val byteLength: Double
    
    val byteOffset: Double
    
    def copyWithin(target: Double): typings.lezerLr.distTokenMod.LocalTokenGroup
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]]
    
    def every(
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ]
    ): Boolean
    
    def fill(value: Double): typings.lezerLr.distTokenMod.LocalTokenGroup
    
    def filter(
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ]
    ): js.typedarray.Uint16Array
    
    def find(
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* obj */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Boolean
        ]
    ): js.UndefOr[Double]
    
    def findIndex(
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* obj */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Boolean
        ]
    ): Double
    
    def findLast[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findLastIndex(
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ]
    ): Double
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Unit
        ]
    ): Unit
    
    def includes(searchElement: Double): Boolean
    
    def indexOf(searchElement: Double): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: Double): Double
    
    val length: Double
    
    def map(
      callbackfn: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Double
        ]
    ): js.typedarray.Uint16Array
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Double
        ]
    ): Double
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Double
        ]
    ): Double
    
    def reverse(): js.typedarray.Uint16Array
    
    def set(array: ArrayLike[Double]): Unit
    
    def slice(): js.typedarray.Uint16Array
    
    def some(
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ]
    ): Boolean
    
    def sort(): typings.lezerLr.distTokenMod.LocalTokenGroup
    
    def subarray(): js.typedarray.Uint16Array
    
    def values(): IterableIterator[Double]
  }
  object ReadonlyUint16ArrayBYTESPERELEMENT {
    
    inline def apply(
      BYTES_PER_ELEMENT: Double,
      at: Double => js.UndefOr[Double],
      buffer: ArrayBufferLike,
      byteLength: Double,
      byteOffset: Double,
      copyWithin: Double => typings.lezerLr.distTokenMod.LocalTokenGroup,
      entries: () => IterableIterator[js.Tuple2[Double, Double]],
      every: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ] => Boolean,
      fill: Double => typings.lezerLr.distTokenMod.LocalTokenGroup,
      filter: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ] => js.typedarray.Uint16Array,
      find: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* obj */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Boolean
        ] => js.UndefOr[Double],
      findIndex: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* obj */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Boolean
        ] => Double,
      findLast: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findLastIndex: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ] => Double,
      forEach: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Unit
        ] => Unit,
      includes: Double => Boolean,
      indexOf: Double => Double,
      join: () => String,
      keys: () => IterableIterator[Double],
      lastIndexOf: Double => Double,
      length: Double,
      map: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Double
        ] => js.typedarray.Uint16Array,
      reduce: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Double
        ] => Double,
      reduceRight: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Double
        ] => Double,
      reverse: () => js.typedarray.Uint16Array,
      set: ArrayLike[Double] => Unit,
      slice: () => js.typedarray.Uint16Array,
      some: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
          Any
        ] => Boolean,
      sort: () => typings.lezerLr.distTokenMod.LocalTokenGroup,
      subarray: () => js.typedarray.Uint16Array,
      values: () => IterableIterator[Double]
    ): ReadonlyUint16ArrayBYTESPERELEMENT = {
      val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], at = js.Any.fromFunction1(at), buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], copyWithin = js.Any.fromFunction1(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), findLast = js.Any.fromFunction1(findLast), findLastIndex = js.Any.fromFunction1(findLastIndex), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), subarray = js.Any.fromFunction0(subarray), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyUint16ArrayBYTESPERELEMENT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyUint16ArrayBYTESPERELEMENT] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      inline def setCopyWithin(value: Double => typings.lezerLr.distTokenMod.LocalTokenGroup): Self = StObject.set(x, "copyWithin", js.Any.fromFunction1(value))
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, Double]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEvery(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Any
            ] => Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: Double => typings.lezerLr.distTokenMod.LocalTokenGroup): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Any
            ] => js.typedarray.Uint16Array
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* obj */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Boolean
            ] => js.UndefOr[Double]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* obj */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Boolean
            ] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFindLast(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "findLast", js.Any.fromFunction1(value))
      
      inline def setFindLastIndex(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Any
            ] => Double
      ): Self = StObject.set(x, "findLastIndex", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setIncludes(value: Double => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: Double => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setLastIndexOf(value: Double => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Double
            ] => js.typedarray.Uint16Array
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setSet(value: ArrayLike[Double] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSlice(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSome(
        value: js.Function3[
              /* value */ Double, 
              /* index */ Double, 
              /* array */ typings.lezerLr.distTokenMod.LocalTokenGroup, 
              Any
            ] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: () => typings.lezerLr.distTokenMod.LocalTokenGroup): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSubarray(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "subarray", js.Any.fromFunction0(value))
      
      inline def setValues(value: () => IterableIterator[Double]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  trait To extends StObject {
    
    var from: ExternalTokenizer
    
    var to: ExternalTokenizer
  }
  object To {
    
    inline def apply(from: ExternalTokenizer, to: ExternalTokenizer): To = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[To]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: To] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: ExternalTokenizer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: ExternalTokenizer): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
