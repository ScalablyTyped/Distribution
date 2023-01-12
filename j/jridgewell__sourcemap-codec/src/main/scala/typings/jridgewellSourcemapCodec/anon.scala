package typings.jridgewellSourcemapCodec

import typings.jridgewellSourcemapCodec.mod.SourceMapLine
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<@jridgewell/sourcemap-codec.@jridgewell/sourcemap-codec.SourceMapMappings> */
  trait ReadonlySourceMapMappings extends StObject {
    
    def at(index: Double): js.UndefOr[SourceMapLine]
    
    def concat(items: js.Array[SourceMapLine]*): js.Array[SourceMapLine]
    
    def copyWithin(target: Double, start: Double): this.type
    
    def entries(): IterableIterator[js.Tuple2[Double, SourceMapLine]]
    
    def every[S /* <: SourceMapLine */](
      predicate: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean
    
    def fill(value: SourceMapLine): this.type
    
    def filter[S /* <: SourceMapLine */](
      predicate: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          /* is S */ Boolean
        ]
    ): js.Array[S]
    
    def find[S /* <: SourceMapLine */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* obj */ js.Array[SourceMapLine], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findIndex(
      predicate: js.Function3[/* value */ SourceMapLine, /* index */ Double, /* obj */ js.Array[SourceMapLine], Any]
    ): Double
    
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]]
    
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          U | js.Array[U]
        ]
    ): js.Array[U]
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          Unit
        ]
    ): Unit
    
    def includes(searchElement: SourceMapLine): Boolean
    
    def indexOf(searchElement: SourceMapLine): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: SourceMapLine): Double
    
    val length: Double
    
    def map[U](
      callbackfn: js.Function3[/* value */ SourceMapLine, /* index */ Double, /* array */ js.Array[SourceMapLine], U]
    ): js.Array[U]
    
    def pop(): js.UndefOr[SourceMapLine]
    
    def push(items: SourceMapLine*): Double
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ SourceMapLine, 
          /* currentValue */ SourceMapLine, 
          /* currentIndex */ Double, 
          /* array */ js.Array[SourceMapLine], 
          SourceMapLine
        ]
    ): SourceMapLine
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ SourceMapLine, 
          /* currentValue */ SourceMapLine, 
          /* currentIndex */ Double, 
          /* array */ js.Array[SourceMapLine], 
          SourceMapLine
        ]
    ): SourceMapLine
    
    def reverse(): js.Array[SourceMapLine]
    
    def shift(): js.UndefOr[SourceMapLine]
    
    def slice(): js.Array[SourceMapLine]
    
    def some(
      predicate: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          Any
        ]
    ): Boolean
    
    def sort(): this.type
    
    def splice(start: Double): js.Array[SourceMapLine]
    
    def unshift(items: SourceMapLine*): Double
    
    def values(): IterableIterator[SourceMapLine]
  }
  object ReadonlySourceMapMappings {
    
    inline def apply(
      at: Double => js.UndefOr[SourceMapLine],
      concat: /* repeated */ js.Array[SourceMapLine] => js.Array[SourceMapLine],
      copyWithin: (Double, Double) => ReadonlySourceMapMappings,
      entries: () => IterableIterator[js.Tuple2[Double, SourceMapLine]],
      every: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          /* is S */ Boolean
        ] => /* is std.Array<S> */ Boolean,
      fill: SourceMapLine => ReadonlySourceMapMappings,
      filter: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          /* is S */ Boolean
        ] => js.Array[Any],
      find: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* obj */ js.Array[SourceMapLine], 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findIndex: js.Function3[/* value */ SourceMapLine, /* index */ Double, /* obj */ js.Array[SourceMapLine], Any] => Double,
      flat: () => js.Array[FlatArray[Any, Any]],
      flatMap: js.ThisFunction3[
          Any, 
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          Any | js.Array[Any]
        ] => js.Array[Any],
      forEach: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          Unit
        ] => Unit,
      includes: SourceMapLine => Boolean,
      indexOf: SourceMapLine => Double,
      join: () => String,
      keys: () => IterableIterator[Double],
      lastIndexOf: SourceMapLine => Double,
      length: Double,
      map: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          Any
        ] => js.Array[Any],
      pop: () => js.UndefOr[SourceMapLine],
      push: /* repeated */ SourceMapLine => Double,
      reduce: js.Function4[
          /* previousValue */ SourceMapLine, 
          /* currentValue */ SourceMapLine, 
          /* currentIndex */ Double, 
          /* array */ js.Array[SourceMapLine], 
          SourceMapLine
        ] => SourceMapLine,
      reduceRight: js.Function4[
          /* previousValue */ SourceMapLine, 
          /* currentValue */ SourceMapLine, 
          /* currentIndex */ Double, 
          /* array */ js.Array[SourceMapLine], 
          SourceMapLine
        ] => SourceMapLine,
      reverse: () => js.Array[SourceMapLine],
      shift: () => js.UndefOr[SourceMapLine],
      slice: () => js.Array[SourceMapLine],
      some: js.Function3[
          /* value */ SourceMapLine, 
          /* index */ Double, 
          /* array */ js.Array[SourceMapLine], 
          Any
        ] => Boolean,
      sort: () => ReadonlySourceMapMappings,
      splice: Double => js.Array[SourceMapLine],
      unshift: /* repeated */ SourceMapLine => Double,
      values: () => IterableIterator[SourceMapLine]
    ): ReadonlySourceMapMappings = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = js.Any.fromFunction0(flat), flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlySourceMapMappings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlySourceMapMappings] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double => js.UndefOr[SourceMapLine]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setConcat(value: /* repeated */ js.Array[SourceMapLine] => js.Array[SourceMapLine]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setCopyWithin(value: (Double, Double) => ReadonlySourceMapMappings): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, SourceMapLine]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEvery(
        value: js.Function3[
              /* value */ SourceMapLine, 
              /* index */ Double, 
              /* array */ js.Array[SourceMapLine], 
              /* is S */ Boolean
            ] => /* is std.Array<S> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: SourceMapLine => ReadonlySourceMapMappings): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[
              /* value */ SourceMapLine, 
              /* index */ Double, 
              /* array */ js.Array[SourceMapLine], 
              /* is S */ Boolean
            ] => js.Array[Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* value */ SourceMapLine, 
              /* index */ Double, 
              /* obj */ js.Array[SourceMapLine], 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: js.Function3[/* value */ SourceMapLine, /* index */ Double, /* obj */ js.Array[SourceMapLine], Any] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFlat(value: () => js.Array[FlatArray[Any, Any]]): Self = StObject.set(x, "flat", js.Any.fromFunction0(value))
      
      inline def setFlatMap(
        value: js.ThisFunction3[
              Any, 
              /* value */ SourceMapLine, 
              /* index */ Double, 
              /* array */ js.Array[SourceMapLine], 
              Any | js.Array[Any]
            ] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: js.Function3[
              /* value */ SourceMapLine, 
              /* index */ Double, 
              /* array */ js.Array[SourceMapLine], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setIncludes(value: SourceMapLine => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: SourceMapLine => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setLastIndexOf(value: SourceMapLine => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[
              /* value */ SourceMapLine, 
              /* index */ Double, 
              /* array */ js.Array[SourceMapLine], 
              Any
            ] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setPop(value: () => js.UndefOr[SourceMapLine]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: /* repeated */ SourceMapLine => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ SourceMapLine, 
              /* currentValue */ SourceMapLine, 
              /* currentIndex */ Double, 
              /* array */ js.Array[SourceMapLine], 
              SourceMapLine
            ] => SourceMapLine
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ SourceMapLine, 
              /* currentValue */ SourceMapLine, 
              /* currentIndex */ Double, 
              /* array */ js.Array[SourceMapLine], 
              SourceMapLine
            ] => SourceMapLine
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(value: () => js.Array[SourceMapLine]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setShift(value: () => js.UndefOr[SourceMapLine]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setSlice(value: () => js.Array[SourceMapLine]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSome(
        value: js.Function3[
              /* value */ SourceMapLine, 
              /* index */ Double, 
              /* array */ js.Array[SourceMapLine], 
              Any
            ] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: () => ReadonlySourceMapMappings): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSplice(value: Double => js.Array[SourceMapLine]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setUnshift(value: /* repeated */ SourceMapLine => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setValues(value: () => IterableIterator[SourceMapLine]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
