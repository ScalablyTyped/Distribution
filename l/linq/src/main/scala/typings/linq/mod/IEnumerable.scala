package typings.linq.mod

import typings.linq.AnonDictx
import typings.linq.AnonDictxLength
import typings.linq.AnonDictxNumberTInner
import typings.linq.AnonDictxNumberTResult
import typings.linq.AnonDictxNumberU
import typings.linq.AnonLength
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnumerable[T] extends Iterable[T] {
  def aggregate(func: js.Function2[/* prev */ T, /* current */ T, T]): T = js.native
  def aggregate[TAccumulate](seed: TAccumulate, func: js.Function2[/* prev */ TAccumulate, /* current */ T, TAccumulate]): TAccumulate = js.native
  def aggregate[TAccumulate, TResult](
    seed: TAccumulate,
    func: js.Function2[/* prev */ TAccumulate, /* current */ T, TAccumulate],
    resultSelector: js.Function1[/* last */ TAccumulate, TResult]
  ): TResult = js.native
  def all(predicate: js.Function1[/* element */ T, Boolean]): Boolean = js.native
  def alternate(alternateSequence: js.Array[T]): IEnumerable[T] = js.native
  def alternate(alternateSequence: AnonDictx[T]): IEnumerable[T] = js.native
  def alternate(alternateSequence: IEnumerable[T]): IEnumerable[T] = js.native
  def alternate(alternateValue: T): IEnumerable[T] = js.native
  def any(): Boolean = js.native
  def any(predicate: js.Function1[/* element */ T, Boolean]): Boolean = js.native
  def asEnumerable(): IEnumerable[T] = js.native
  def average(): Double = js.native
  def average(selector: js.Function1[/* element */ T, Double]): Double = js.native
  def buffer(count: Double): IEnumerable[js.Array[T]] = js.native
  def cast[TResult](): IEnumerable[TResult] = js.native
  def catchError(handler: js.Function1[/* exception */ js.Any, Unit]): IEnumerable[T] = js.native
  def choose(selector: js.Function2[/* element */ T, /* index */ Double, T]): IEnumerable[T] = js.native
  def concat(sequences: (AnonDictx[T] | IEnumerable[T] | T)*): IEnumerable[T] = js.native
  def contains(value: T): Boolean = js.native
  def contains[TCompare](value: T, compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
  @JSName("contains")
  def contains_TCompare[TCompare](value: T): Boolean = js.native
  def count(): Double = js.native
  def count(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): Double = js.native
  def defaultIfEmpty(): IEnumerable[T] = js.native
  def defaultIfEmpty(defaultValue: T): IEnumerable[T] = js.native
  def distinct(): IEnumerable[T] = js.native
  def distinct[TCompare](compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def distinctUntilChanged(): IEnumerable[T] = js.native
  def distinctUntilChanged[TCompare](compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def doAction(action: js.Function2[/* element */ T, /* index */ Double, Boolean | Unit]): IEnumerable[T] = js.native
  def elementAt(index: Double): T = js.native
  def elementAtOrDefault(index: Double): T = js.native
  def elementAtOrDefault(index: Double, defaultValue: T): T = js.native
  def except(second: js.Array[T]): IEnumerable[T] = js.native
  def except(second: AnonDictx[T]): IEnumerable[T] = js.native
  def except(second: IEnumerable[T]): IEnumerable[T] = js.native
  def except[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def except[TCompare](second: AnonDictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def except[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def finallyAction(finallyAction: js.Function0[Unit]): IEnumerable[T] = js.native
  def first(): T = js.native
  def first(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
  def firstOrDefault(): T = js.native
  def firstOrDefault(defaultValue: T): T = js.native
  def firstOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
  def firstOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean], defaultValue: T): T = js.native
  def flatten(): IEnumerable[_] = js.native
  def forEach(action: js.Function2[/* element */ T, /* index */ Double, Boolean | Unit]): Unit = js.native
  def force(): Unit = js.native
  def getEnumerator(): IEnumerator[T] = js.native
  def groupBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IEnumerable[IGrouping[TKey, T]] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement]
  ): IEnumerable[IGrouping[TKey, TElement]] = js.native
  def groupBy[TKey, TElement, TResult](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement],
    resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult]
  ): IEnumerable[TResult] = js.native
  def groupBy[TKey, TElement, TResult, TCompare](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement],
    resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult],
    compareSelector: js.Function1[/* element */ TKey, TCompare]
  ): IEnumerable[TResult] = js.native
  def groupJoin[TInner, TKey, TResult](
    inner: js.Array[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult]
  ): IEnumerable[TResult] = js.native
  def groupJoin[TInner, TKey, TResult](
    inner: js.Array[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult],
    compareSelector: js.Function1[/* obj */ T, TKey]
  ): IEnumerable[TResult] = js.native
  def groupJoin[TInner, TKey, TResult](
    inner: AnonDictxNumberTInner[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult]
  ): IEnumerable[TResult] = js.native
  def groupJoin[TInner, TKey, TResult](
    inner: AnonDictxNumberTInner[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult],
    compareSelector: js.Function1[/* obj */ T, TKey]
  ): IEnumerable[TResult] = js.native
  def groupJoin[TInner, TKey, TResult](
    inner: IEnumerable[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult]
  ): IEnumerable[TResult] = js.native
  def groupJoin[TInner, TKey, TResult](
    inner: IEnumerable[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult],
    compareSelector: js.Function1[/* obj */ T, TKey]
  ): IEnumerable[TResult] = js.native
  def indexOf(item: T): Double = js.native
  def indexOf(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): Double = js.native
  def insert(index: Double, second: AnonDictx[T]): IEnumerable[T] = js.native
  def insert(index: Double, second: IEnumerable[T]): IEnumerable[T] = js.native
  def intersect(second: js.Array[T]): IEnumerable[T] = js.native
  def intersect(second: AnonDictx[T]): IEnumerable[T] = js.native
  def intersect(second: IEnumerable[T]): IEnumerable[T] = js.native
  def intersect[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def intersect[TCompare](second: AnonDictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def intersect[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def isEmpty(): Boolean = js.native
  def join[TInner, TKey, TResult](
    inner: js.Array[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
  ): IEnumerable[TResult] = js.native
  def join[TInner, TKey, TResult](
    inner: js.Array[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
    compareSelector: js.Function1[/* obj */ T, TKey]
  ): IEnumerable[TResult] = js.native
  def join[TInner, TKey, TResult](
    inner: AnonDictxNumberTInner[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
  ): IEnumerable[TResult] = js.native
  def join[TInner, TKey, TResult](
    inner: AnonDictxNumberTInner[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
    compareSelector: js.Function1[/* obj */ T, TKey]
  ): IEnumerable[TResult] = js.native
  def join[TInner, TKey, TResult](
    inner: IEnumerable[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
  ): IEnumerable[TResult] = js.native
  def join[TInner, TKey, TResult](
    inner: IEnumerable[TInner],
    outerKeySelector: js.Function1[/* outer */ T, TKey],
    innerKeySelector: js.Function1[/* inner */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
    compareSelector: js.Function1[/* obj */ T, TKey]
  ): IEnumerable[TResult] = js.native
  def last(): T = js.native
  def last(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
  def lastIndexOf(item: T): Double = js.native
  def lastIndexOf(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): Double = js.native
  def lastOrDefault(): T = js.native
  def lastOrDefault(defaultValue: T): T = js.native
  def lastOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
  def lastOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean], defaultValue: T): T = js.native
  def letBind[TResult](
    func: js.Function1[
      /* source */ IEnumerable[T], 
      AnonDictxNumberTResult[TResult] | js.Array[TResult] | IEnumerable[TResult]
    ]
  ): IEnumerable[TResult] = js.native
  def log(): IEnumerable[T] = js.native
  def log[TValue](selector: js.Function1[/* element */ T, TValue]): IEnumerable[T] = js.native
  def max(): Double = js.native
  def max(selector: js.Function1[/* element */ T, Double]): Double = js.native
  def maxBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): T = js.native
  def memoize(): IDisposableEnumerable[T] = js.native
   // last one is selector
  def merge[TResult](params: (AnonDictx[T] | js.Array[T] | IEnumerable[T])*): IEnumerable[T] = js.native
  def min(): Double = js.native
  def min(selector: js.Function1[/* element */ T, Double]): Double = js.native
  def minBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): T = js.native
  def ofType[TResult](`type`: js.Any): IEnumerable[TResult] = js.native
  def orderBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
  def orderByDescending[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
  def pairwise[TResult](selector: js.Function2[/* prev */ T, /* current */ T, TResult]): IEnumerable[TResult] = js.native
  // :IEnumerable<IGrouping<TKey, T>>
  def partitionBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IEnumerable[IGrouping[TKey, _]] = js.native
  // :IEnumerable<IGrouping<TKey, TElement>>
  def partitionBy[TKey, TElement](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement]
  ): IEnumerable[IGrouping[TKey, TElement]] = js.native
  def partitionBy[TKey, TElement, TResult](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement],
    resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult]
  ): IEnumerable[TResult] = js.native
  def partitionBy[TKey, TElement, TResult, TCompare](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement],
    resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult],
    compareSelector: js.Function1[/* element */ TKey, TCompare]
  ): IEnumerable[TResult] = js.native
  def reverse(): IEnumerable[T] = js.native
  def scan(func: js.Function2[/* prev */ T, /* current */ T, T]): IEnumerable[T] = js.native
  def scan[TAccumulate](seed: TAccumulate, func: js.Function2[/* prev */ TAccumulate, /* current */ T, TAccumulate]): IEnumerable[TAccumulate] = js.native
  def select[TResult](selector: js.Function2[/* element */ T, /* index */ Double, TResult]): IEnumerable[TResult] = js.native
  def selectMany[TOther](
    collectionSelector: js.Function2[
      /* element */ T, 
      /* index */ Double, 
      AnonLength[TOther] | js.Array[TOther] | IEnumerable[TOther]
    ]
  ): IEnumerable[TOther] = js.native
  def selectMany[TCollection, TResult](
    collectionSelector: js.Function2[
      /* element */ T, 
      /* index */ Double, 
      AnonDictxLength[TCollection] | js.Array[TCollection] | IEnumerable[TCollection]
    ],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TCollection, TResult]
  ): IEnumerable[TResult] = js.native
  def sequenceEqual(second: js.Array[T]): Boolean = js.native
  def sequenceEqual(second: AnonDictx[T]): Boolean = js.native
  def sequenceEqual(second: IEnumerable[T]): Boolean = js.native
  def sequenceEqual[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
  def sequenceEqual[TCompare](second: AnonDictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
  def sequenceEqual[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
  def share(): IDisposableEnumerable[T] = js.native
  def shuffle(): IEnumerable[T] = js.native
  def single(): T = js.native
  def single(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
  def singleOrDefault(): T = js.native
  def singleOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
  def singleOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean], defaultValue: T): T = js.native
  def skip(count: Double): IEnumerable[T] = js.native
  def skipWhile(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): IEnumerable[T] = js.native
  def sum(): Double = js.native
  def sum(selector: js.Function1[/* element */ T, Double]): Double = js.native
  def take(count: Double): IEnumerable[T] = js.native
  def takeExceptLast(): IEnumerable[T] = js.native
  def takeExceptLast(count: Double): IEnumerable[T] = js.native
  def takeFromLast(count: Double): IEnumerable[T] = js.native
  def takeWhile(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): IEnumerable[T] = js.native
  def toArray(): js.Array[T] = js.native
  // :IDictionary<TKey, T>
  def toDictionary[TKey](keySelector: js.Function1[/* element */ T, TKey]): IDictionary[TKey, _] = js.native
  def toDictionary[TKey, TValue](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TValue]
  ): IDictionary[TKey, TValue] = js.native
  def toDictionary[TKey, TValue, TCompare](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TValue],
    compareSelector: js.Function1[/* key */ TKey, TCompare]
  ): IDictionary[TKey, TValue] = js.native
  def toJSONString(replacer: js.Array[_]): String = js.native
  def toJSONString(replacer: js.Array[_], space: js.Any): String = js.native
  def toJSONString(replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def toJSONString(replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: js.Any): String = js.native
  def toJoinedString(): String = js.native
  def toJoinedString(separator: String): String = js.native
  def toJoinedString[TResult](separator: String, selector: js.Function2[/* element */ T, /* index */ Double, TResult]): String = js.native
  def toLookup[TKey](keySelector: js.Function1[/* element */ T, TKey]): ILookup[TKey, T] = js.native
  def toLookup[TKey, TElement](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement]
  ): ILookup[TKey, TElement] = js.native
  def toLookup[TKey, TElement, TCompare](
    keySelector: js.Function1[/* element */ T, TKey],
    elementSelector: js.Function1[/* element */ T, TElement],
    compareSelector: js.Function1[/* key */ TKey, TCompare]
  ): ILookup[TKey, TElement] = js.native
  def toObject(keySelector: js.Function1[/* element */ T, _]): js.Object = js.native
  def toObject(keySelector: js.Function1[/* element */ T, _], elementSelector: js.Function1[/* element */ T, _]): js.Object = js.native
  def trace(): IEnumerable[T] = js.native
  def trace(message: String): IEnumerable[T] = js.native
  def trace[TValue](message: String, selector: js.Function1[/* element */ T, TValue]): IEnumerable[T] = js.native
  // Extension Methods
  def traverseBreadthFirst(childrenSelector: js.Function1[/* element */ T, IEnumerable[T]]): IEnumerable[T] = js.native
  def traverseBreadthFirst[TResult](
    childrenSelector: js.Function1[/* element */ T, IEnumerable[T]],
    resultSelector: js.Function2[/* element */ T, /* nestLevel */ Double, TResult]
  ): IEnumerable[TResult] = js.native
  def traverseDepthFirst[TResult](childrenSelector: js.Function1[/* element */ T, IEnumerable[T]]): IEnumerable[T] = js.native
  def traverseDepthFirst[TResult](
    childrenSelector: js.Function1[/* element */ T, IEnumerable[T]],
    resultSelector: js.Function2[/* element */ T, /* nestLevel */ Double, TResult]
  ): IEnumerable[TResult] = js.native
  def union(second: js.Array[T]): IEnumerable[T] = js.native
  def union(second: AnonDictx[T]): IEnumerable[T] = js.native
  def union(second: IEnumerable[T]): IEnumerable[T] = js.native
  def union[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def union[TCompare](second: AnonDictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def union[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
  def weightedSample(weightSelector: js.Function1[/* element */ T, Double]): IEnumerable[T] = js.native
  def where(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): IEnumerable[T] = js.native
  def write(): Unit = js.native
  def write(separator: String): Unit = js.native
  def write[TResult](separator: String, selector: js.Function1[/* element */ T, TResult]): Unit = js.native
  def writeLine(): Unit = js.native
  def writeLine[TResult](selector: js.Function1[/* element */ T, TResult]): Unit = js.native
  def zip[TResult](params: js.Any*): IEnumerable[TResult] = js.native
  def zip[U, TResult](
    second: js.Array[U],
    resultSelector: js.Function3[/* first */ T, /* second */ U, /* index */ Double, TResult]
  ): IEnumerable[TResult] = js.native
  def zip[U, TResult](
    second: AnonDictxNumberU[U],
    resultSelector: js.Function3[/* first */ T, /* second */ U, /* index */ Double, TResult]
  ): IEnumerable[TResult] = js.native
  def zip[U, TResult](
    second: IEnumerable[U],
    resultSelector: js.Function3[/* first */ T, /* second */ U, /* index */ Double, TResult]
  ): IEnumerable[TResult] = js.native
}

