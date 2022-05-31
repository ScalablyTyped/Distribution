package typings.lazyJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.NumberDictionary
import typings.lazyJs.anon.Property
import typings.lazyJs.lazyJsBooleans.`false`
import typings.lazyJs.lazyJsBooleans.`true`
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyJS {
  
  trait ArrayLike[T]
    extends StObject
       with /* index */ NumberDictionary[T] {
    
    var length: Double
  }
  object ArrayLike {
    
    inline def apply[T](length: Double): ArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLike[T]]
    }
    
    extension [Self <: ArrayLike[?], T](x: Self & ArrayLike[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ArrayLikeSequence[T]
    extends StObject
       with Sequence[T] {
    
    @JSName("first")
    def first_ArrayLikeSequence(): ArrayLikeSequence[T] = js.native
    
    def get(index: Double): T = js.native
    
    def length(): Double = js.native
    
    def pop(): ArrayLikeSequence[T] = js.native
    
    def push(value: T): ArrayLikeSequence[T] = js.native
    
    def shift(): ArrayLikeSequence[T] = js.native
    
    def slice(begin: Double): ArrayLikeSequence[T] = js.native
    def slice(begin: Double, end: Double): ArrayLikeSequence[T] = js.native
    
    def unshift(value: T): ArrayLikeSequence[T] = js.native
  }
  
  trait AsyncHandle[T] extends StObject {
    
    def cancel(): Unit
    
    def onComplete(callback: Callback): Unit
    
    def onError(callback: ErrorCallback): Unit
  }
  object AsyncHandle {
    
    inline def apply[T](cancel: () => Unit, onComplete: Callback => Unit, onError: ErrorCallback => Unit): AsyncHandle[T] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[AsyncHandle[T]]
    }
    
    extension [Self <: AsyncHandle[?], T](x: Self & AsyncHandle[T]) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setOnComplete(value: Callback => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnError(value: ErrorCallback => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AsyncSequence[T]
    extends StObject
       with SequenceBase[T] {
    
    def each(callback: ValueCallback[T]): AsyncHandle[T] = js.native
  }
  
  type Callback = js.Function0[Unit]
  
  type CompareCallback = js.Function2[/* x */ js.Any, /* y */ js.Any, Double]
  
  type ErrorCallback = js.Function1[/* error */ js.Any, Unit]
  
  type Flatten[T, Shallow /* <: Boolean */] = (/* import warning: importer.ImportType#apply Failed type conversion: lazy.js.anon.0<T>[T extends lazy.js.LazyJS.Sequence<any> ? 0 : T extends std.Array<any> ? 0 : T extends std.ReadonlyArray<any> ? 0 : 1] */ js.Any) | T
  
  @js.native
  trait GeneratedSequence[T]
    extends StObject
       with Sequence[T]
       with Instantiable2[/* generatorFn */ GeneratorCallback[T], /* length */ Double, GeneratedSequence[T]] {
    
    def length(): Double = js.native
  }
  
  type GeneratorCallback[T] = js.Function1[/* index */ Double, T]
  
  type GetKeyCallback[T] = js.Function1[/* value */ T, String]
  
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  @js.native
  trait Iterator[T]
    extends StObject
       with Instantiable1[/* sequence */ Sequence[T], Iterator[T]] {
    
    def current(): T = js.native
    
    def moveNext(): Boolean = js.native
  }
  
  @js.native
  trait LazyStatic extends StObject {
    
    def apply(value: String): StringLikeSequence = js.native
    def apply(value: js.Any): ObjectLikeSequence[js.Any] = js.native
    def apply(value: js.Array[js.Any]): ArrayLikeSequence[js.Any] = js.native
    
    def generate[T](generatorFn: GeneratorCallback[T]): GeneratedSequence[T] = js.native
    def generate[T](generatorFn: GeneratorCallback[T], length: Double): GeneratedSequence[T] = js.native
    
    def makeHttpRequest(path: String): StringLikeSequence = js.native
    
    def on[T](eventType: String): Sequence[T] = js.native
    
    def range(from: Double, to: Double): GeneratedSequence[Double] = js.native
    def range(from: Double, to: Double, step: Double): GeneratedSequence[Double] = js.native
    def range(to: Double): GeneratedSequence[Double] = js.native
    
    def readFile(path: String): StringLikeSequence = js.native
    
    def repeat[T](value: T): GeneratedSequence[T] = js.native
    def repeat[T](value: T, count: Double): GeneratedSequence[T] = js.native
    
    def strict(): LazyStatic = js.native
  }
  
  type MapCallback[T, U] = js.Function1[/* value */ T, U]
  
  type MapStringCallback = js.Function1[/* value */ String, String]
  
  type MemoCallback[T, U] = js.Function2[/* memo */ U, /* value */ T, U]
  
  type NumberCallback[T] = js.Function1[/* value */ T, Double]
  
  @js.native
  trait ObjectLikeSequence[T]
    extends StObject
       with Sequence[T] {
    
    def assign(other: js.Any): ObjectLikeSequence[T] = js.native
    
    // throws error
    //async(): X;
    def defaults(defaults: js.Any): ObjectLikeSequence[T] = js.native
    
    def functions(): Sequence[T] = js.native
    
    def get(property: String): js.Any = js.native
    
    def invert(): ObjectLikeSequence[T] = js.native
    
    def keys(): Sequence[String] = js.native
    
    def merge(others: js.Any): ObjectLikeSequence[T] = js.native
    def merge(others: js.Any, mergeFn: js.Function): ObjectLikeSequence[T] = js.native
    def merge(others: ObjectLikeSequence[T]): ObjectLikeSequence[T] = js.native
    def merge(others: ObjectLikeSequence[T], mergeFn: js.Function): ObjectLikeSequence[T] = js.native
    
    def omit(properties: js.Array[String]): ObjectLikeSequence[T] = js.native
    
    def pairs(): Sequence[T] = js.native
    
    def pick(properties: js.Array[String]): ObjectLikeSequence[T] = js.native
    
    def values(): Sequence[T] = js.native
    
    def watch(propertyNames: String): Sequence[Property] = js.native
    def watch(propertyNames: js.Array[String]): Sequence[Property] = js.native
  }
  
  type PushFront[TailT /* <: js.Array[js.Any] */, FrontT] = js.Any
  
  @js.native
  trait Sequence[T]
    extends StObject
       with SequenceBase[T] {
    
    def each(eachFn: ValueCallback[T]): Sequence[T] = js.native
  }
  
  @js.native
  trait SequenceBase[T]
    extends StObject
       with SequenceBaser[T] {
    
    def first(): js.Any = js.native
    def first(count: Double): Sequence[T] = js.native
    
    def indexOf(value: js.Any): Double = js.native
    def indexOf(value: js.Any, startIndex: Double): Double = js.native
    
    def last(): js.Any = js.native
    def last(count: Double): Sequence[T] = js.native
    
    def lastIndexOf(value: js.Any): Double = js.native
    
    def reverse(): Sequence[T] = js.native
  }
  
  @js.native
  trait SequenceBaser[T] extends StObject {
    
    // TODO improve define() (needs ugly overload)
    def async(interval: Double): AsyncSequence[T] = js.native
    
    def chunk[N /* <: Double */](size: N): Sequence[Tuple[T, N, js.Array[js.Any]]] = js.native
    
    def compact(): Sequence[T] = js.native
    
    def concat(var_args: js.Array[T]): Sequence[T] = js.native
    
    def consecutive(length: Double): Sequence[T] = js.native
    
    def contains(value: T): Boolean = js.native
    
    def countBy(keyFn: GetKeyCallback[T]): ObjectLikeSequence[T] = js.native
    def countBy(propertyName: String): ObjectLikeSequence[T] = js.native
    
    def dropWhile(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
    
    def every(predicateFn: TestCallback[T, String | Double]): Boolean = js.native
    
    def filter(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
    
    def find(predicateFn: TestCallback[T, String | Double]): T = js.native
    
    def findWhere(properties: js.Any): T = js.native
    
    def flatten(): Sequence[Flatten[T, `false`]] = js.native
    @JSName("flatten")
    def flatten_false(shallow: `false`): Sequence[Flatten[T, `false`]] = js.native
    @JSName("flatten")
    def flatten_true(shallow: `true`): Sequence[Flatten[T, `true`]] = js.native
    
    def groupBy(keyFn: GetKeyCallback[T]): ObjectLikeSequence[T] = js.native
    
    def initial(): Sequence[T] = js.native
    def initial(count: Double): Sequence[T] = js.native
    
    def intersection(var_args: js.Array[T]): Sequence[T] = js.native
    
    def invoke(methodName: String): Sequence[T] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def join(): String = js.native
    def join(delimiter: String): String = js.native
    
    def map[U](mapFn: MapCallback[T, U]): Sequence[U] = js.native
    
    def max(): T = js.native
    def max(valueFn: NumberCallback[T]): T = js.native
    
    def min(): T = js.native
    def min(valueFn: NumberCallback[T]): T = js.native
    
    def none(): Boolean = js.native
    def none(valueFn: TestCallback[T, String | Double]): Boolean = js.native
    
    def pluck(propertyName: String): Sequence[js.Any] = js.native
    
    def reduce[U](aggregatorFn: MemoCallback[T, U]): U = js.native
    def reduce[U](aggregatorFn: MemoCallback[T, U], memo: U): U = js.native
    
    def reduceRight[U](aggregatorFn: MemoCallback[T, U], memo: U): U = js.native
    
    def reject(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
    
    def rest(): Sequence[T] = js.native
    def rest(count: Double): Sequence[T] = js.native
    
    def shuffle(): Sequence[T] = js.native
    
    def size(): Double = js.native
    
    def some(): Boolean = js.native
    def some(predicateFn: TestCallback[T, String | Double]): Boolean = js.native
    
    def sort(): Sequence[T] = js.native
    def sort(sortFn: Unit, descending: Boolean): Sequence[T] = js.native
    def sort(sortFn: CompareCallback): Sequence[T] = js.native
    def sort(sortFn: CompareCallback, descending: Boolean): Sequence[T] = js.native
    
    def sortBy(sortFn: String): Sequence[T] = js.native
    def sortBy(sortFn: String, descending: Boolean): Sequence[T] = js.native
    def sortBy(sortFn: NumberCallback[T]): Sequence[T] = js.native
    def sortBy(sortFn: NumberCallback[T], descending: Boolean): Sequence[T] = js.native
    
    def sortedIndex(value: T): Double = js.native
    
    def sum(): Double = js.native
    def sum(valueFn: NumberCallback[T]): Double = js.native
    
    def takeWhile(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toObject(): js.Any = js.native
    
    def union(var_args: js.Array[T]): Sequence[T] = js.native
    
    def uniq(): Sequence[T] = js.native
    def uniq(key: /* keyof T */ String): Sequence[T] = js.native
    
    def where(properties: js.Any): Sequence[T] = js.native
    
    def without(var_args: T*): Sequence[T] = js.native
    def without(var_args: js.Array[T]): Sequence[T] = js.native
    
    def zip(var_args: js.Array[T]): Sequence[T] = js.native
  }
  
  @js.native
  trait StringLikeSequence
    extends StObject
       with SequenceBaser[String] {
    
    def charAt(index: Double): String = js.native
    
    def charCodeAt(index: Double): Double = js.native
    
    def endsWith(suffix: String): Boolean = js.native
    
    def first(): String = js.native
    def first(count: Double): StringLikeSequence = js.native
    
    def indexOf(substring: String): Double = js.native
    def indexOf(substring: String, startIndex: Double): Double = js.native
    
    def last(): String = js.native
    def last(count: Double): StringLikeSequence = js.native
    
    def lastIndexOf(substring: String): Double = js.native
    def lastIndexOf(substring: String, startIndex: Double): Double = js.native
    
    def mapString(mapFn: MapStringCallback): StringLikeSequence = js.native
    
    def `match`(pattern: RegExp): StringLikeSequence = js.native
    
    def reverse(): StringLikeSequence = js.native
    
    def split(delimiter: String): StringLikeSequence = js.native
    def split(delimiter: RegExp): StringLikeSequence = js.native
    
    def startsWith(prefix: String): Boolean = js.native
    
    def substring(start: Double): StringLikeSequence = js.native
    def substring(start: Double, stop: Double): StringLikeSequence = js.native
    
    def toLowerCase(): StringLikeSequence = js.native
    
    def toUpperCase(): StringLikeSequence = js.native
  }
  
  type TestCallback[T, U] = js.Function2[/* value */ T, /* index */ U, Boolean]
  
  type Tuple[ElementT, LengthT /* <: Double */, OutputT /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: lazy.js.anon.1<ElementT, OutputT>[// LengthT is not compile-time constant
  number extends LengthT ? 0 : LengthT extends 0 ? 1 : OutputT['length'] extends LengthT ? 2 : 3] */ js.Any
  
  type ValueCallback[T] = js.Function1[/* value */ T, Unit]
}
