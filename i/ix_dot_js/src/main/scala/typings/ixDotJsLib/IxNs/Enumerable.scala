package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enumerable[T] extends js.Object {
  def aggregate(
    func: js.Function4[
      /* accumulate */ T, 
      /* current */ T, 
      /* index */ scala.Double, 
      /* self */ Enumerable[T], 
      T
    ]
  ): T = js.native
  def aggregate[TAccumulate](
    seed: TAccumulate,
    func: js.Function4[
      /* accumulate */ TAccumulate, 
      /* current */ T, 
      /* index */ scala.Double, 
      /* self */ Enumerable[T], 
      TAccumulate
    ]
  ): TAccumulate = js.native
  // "extension" functions
  def aggregate[TAccumulate, TResult](
    seed: TAccumulate,
    func: js.Function4[
      /* accumulate */ TAccumulate, 
      /* current */ T, 
      /* index */ scala.Double, 
      /* self */ Enumerable[T], 
      TAccumulate
    ],
    resultSelector: js.Function1[/* accumulate */ TAccumulate, TResult]
  ): TResult = js.native
  def all(predicate: EnumerablePredicate[T]): scala.Boolean = js.native
  def all(predicate: EnumerablePredicate[T], thisArg: js.Any): scala.Boolean = js.native
   // alias
  def any(): scala.Boolean = js.native
  def any(predicate: EnumerablePredicate[T]): scala.Boolean = js.native
  def any(predicate: EnumerablePredicate[T], thisArg: js.Any): scala.Boolean = js.native
   // alias
  def average(): scala.Double = js.native
  def average(selector: EnumerableFunc[T, scala.Double]): scala.Double = js.native
  def bufferWithCount(count: scala.Double): Enumerable[T] = js.native
  def bufferWithCount(count: scala.Double, skip: scala.Double): Enumerable[T] = js.native
  def `catch`(handler: js.Function1[/* error */ stdLib.Error, Enumerable[T]]): Enumerable[T] = js.native
  def `catch`(second: Enumerable[T], other: Enumerable[T]*): Enumerable[T] = js.native
  def catchException(handler: js.Function1[/* error */ stdLib.Error, Enumerable[T]]): Enumerable[T] = js.native
  def catchException(second: Enumerable[T], other: Enumerable[T]*): Enumerable[T] = js.native
  def concat[T](sources: Enumerable[T]*): Enumerable[T] = js.native
  def contains(value: T): scala.Boolean = js.native
  def contains[TValue](value: TValue, comparer: EqualityComparer[T, TValue]): scala.Boolean = js.native
  def count(): scala.Double = js.native
  def count(predicate: EnumerablePredicate[T]): scala.Double = js.native
  def count(predicate: EnumerablePredicate[T], thisArg: js.Any): scala.Double = js.native
  def defaultIfEmpty(): Enumerable[T] = js.native
  def defaultIfEmpty(defaultValue: T): Enumerable[T] = js.native
  def distinct(): Enumerable[T] = js.native
  def distinct(comparer: EqualityComparer[T, T]): Enumerable[T] = js.native
  def distinctBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): Enumerable[T] = js.native
  def distinctBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: EqualityComparer[TKey, TKey]): Enumerable[T] = js.native
  def distinctUntilChanged(): Enumerable[T] = js.native
  // if need to set comparer without keySelector
  def distinctUntilChanged(`_`: scala.Boolean, comparer: EqualityComparer[T, T]): Enumerable[T] = js.native
  def distinctUntilChanged[TKey](keySelector: js.Function1[/* item */ T, TKey]): Enumerable[T] = js.native
  def distinctUntilChanged[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: EqualityComparer[TKey, TKey]): Enumerable[T] = js.native
  def `do`(onNext: js.Function1[/* value */ T, scala.Unit]): Enumerable[T] = js.native
  def `do`(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): Enumerable[T] = js.native
  def `do`(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): Enumerable[T] = js.native
  def `do`(onbserver: Observer[T]): Enumerable[T] = js.native
  def doAction(onNext: js.Function1[/* value */ T, scala.Unit]): Enumerable[T] = js.native
  def doAction(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): Enumerable[T] = js.native
  def doAction(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): Enumerable[T] = js.native
  def doAction(onbserver: Observer[T]): Enumerable[T] = js.native
  def elementAt(index: scala.Double): T = js.native
  def elementAtOrDefault(index: scala.Double): T = js.native
  def every(predicate: EnumerablePredicate[T]): scala.Boolean = js.native
  def every(predicate: EnumerablePredicate[T], thisArg: js.Any): scala.Boolean = js.native
  def except(second: Enumerable[T]): Enumerable[T] = js.native
  def except[TOther](second: Enumerable[TOther], comparer: EqualityComparer[T, TOther]): Enumerable[T] = js.native
  def expand(selector: js.Function1[/* item */ T, Enumerable[T]]): Enumerable[T] = js.native
  def filter(selector: EnumerablePredicate[T]): Enumerable[T] = js.native
  def filter(selector: EnumerablePredicate[T], thisArg: js.Any): Enumerable[T] = js.native
  // todo: Enumerable<Enumerable<T>>.catch(): Enumerable<T>
  //catch<TInner, T extends Enumerable<TInner>>(): Enumerable<TInner>;
  def `finally`(finallyAction: js.Function0[scala.Unit]): Enumerable[T] = js.native
  def finallyDo(finallyAction: js.Function0[scala.Unit]): Enumerable[T] = js.native
  def first(): T = js.native
  def first(predicate: Predicate[T]): T = js.native
  def firstOrDefault(): T = js.native
  def firstOrDefault(predicate: Predicate[T]): T = js.native
  def forEach(action: EnumerableFunc[T, scala.Unit]): scala.Unit = js.native
  def forEach(action: EnumerableFunc[T, scala.Unit], thisArg: js.Any): scala.Unit = js.native
  // base functions
  def getEnumerator(): Enumerator[T] = js.native
  def groupBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): Enumerable[Grouping[TKey, T]] = js.native
  // if need to set comparer without elementSelector and resultSelector
  def groupBy[TKey](
    keySelector: js.Function1[/* item */ T, TKey],
    `_`: scala.Boolean,
    __ : scala.Boolean,
    comparer: EqualityComparer[TKey, TKey]
  ): Enumerable[Grouping[TKey, T]] = js.native
  // if need to set resultSelector without elementSelector
  def groupBy[TKey, TResult](
    keySelector: js.Function1[/* item */ T, TKey],
    `_`: scala.Boolean,
    resultSelector: js.Function2[/* key */ TKey, /* values */ Enumerable[T], TResult]
  ): Enumerable[TResult] = js.native
  def groupBy[TKey, TResult](
    keySelector: js.Function1[/* item */ T, TKey],
    `_`: scala.Boolean,
    resultSelector: js.Function2[/* key */ TKey, /* values */ Enumerable[T], TResult],
    comparer: EqualityComparer[TKey, TKey]
  ): Enumerable[TResult] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* item */ T, TKey],
    elementSelector: js.Function1[/* item */ T, TElement]
  ): Enumerable[Grouping[TKey, TElement]] = js.native
  // if need to set comparer without resultSelector
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* item */ T, TKey],
    elementSelector: js.Function1[/* item */ T, TElement],
    `_`: scala.Boolean,
    comparer: EqualityComparer[TKey, TKey]
  ): Enumerable[Grouping[TKey, TElement]] = js.native
  def groupBy[TKey, TElement, TResult](
    keySelector: js.Function1[/* item */ T, TKey],
    elementSelector: js.Function1[/* item */ T, TElement],
    resultSelector: js.Function2[/* key */ TKey, /* values */ Enumerable[TElement], TResult]
  ): Enumerable[TResult] = js.native
  def groupBy[TKey, TElement, TResult](
    keySelector: js.Function1[/* item */ T, TKey],
    elementSelector: js.Function1[/* item */ T, TElement],
    resultSelector: js.Function2[/* key */ TKey, /* values */ Enumerable[TElement], TResult],
    comparer: EqualityComparer[TKey, TKey]
  ): Enumerable[TResult] = js.native
  def groupJoin[TInner, TKey, TResult](
    inner: Enumerable[TInner],
    outerKeySelector: js.Function1[/* item */ T, TKey],
    innerKeySelector: js.Function1[/* item */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* innerSequence */ Enumerable[TInner], TResult]
  ): Enumerable[TResult] = js.native
  def groupJoin[TInner, TOuterKey, TInnerKey, TResult](
    inner: Enumerable[TInner],
    outerKeySelector: js.Function1[/* item */ T, TOuterKey],
    innerKeySelector: js.Function1[/* item */ TInner, TInnerKey],
    resultSelector: js.Function2[/* outer */ T, /* innerSequence */ Enumerable[TInner], TResult],
    comparer: EqualityComparer[TOuterKey, TInnerKey]
  ): Enumerable[TResult] = js.native
  def ignoreElements(): Enumerable[T] = js.native
  def intersect(second: Enumerable[T]): Enumerable[T] = js.native
  def intersect[TSecond](second: Enumerable[TSecond], comparer: EqualityComparer[T, TSecond]): Enumerable[T] = js.native
  def isEmpty(): scala.Boolean = js.native
  def join[TInner, TKey, TResult](
    inner: Enumerable[TInner],
    outerKeySelector: js.Function1[/* item */ T, TKey],
    innerKeySelector: js.Function1[/* item */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
  ): Enumerable[TResult] = js.native
  def join[TInner, TOuterKey, TInnerKey, TResult](
    inner: Enumerable[TInner],
    outerKeySelector: js.Function1[/* item */ T, TOuterKey],
    innerKeySelector: js.Function1[/* item */ TInner, TInnerKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
    comparer: EqualityComparer[TOuterKey, TInnerKey]
  ): Enumerable[TResult] = js.native
  def last(): T = js.native
  def last(predicate: Predicate[T]): T = js.native
  def lastOrDefault(): T = js.native
  def lastOrDefault(predicate: Predicate[T]): T = js.native
  def map[TResult](selector: EnumerableFunc[T, TResult]): Enumerable[TResult] = js.native
  def map[TResult](selector: EnumerableFunc[T, TResult], thisArg: js.Any): Enumerable[TResult] = js.native
  def max(): T = js.native
  def max[TResult](selector: EnumerableFunc[T, TResult]): TResult = js.native
  def maxBy(keySelector: js.Function1[/* item */ T, scala.Double]): Enumerable[T] = js.native
  def maxBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): Enumerable[T] = js.native
  def memoize(): Enumerable[T] = js.native
  def min(): T = js.native
  def min[TResult](selector: EnumerableFunc[T, TResult]): TResult = js.native
  def minBy(keySelector: js.Function1[/* item */ T, scala.Double]): Enumerable[T] = js.native
  def minBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): Enumerable[T] = js.native
  def onErrorResumeNext(second: Enumerable[T]): Enumerable[T] = js.native
  def orderBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
  def orderBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
  def orderByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
  def orderByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
  def publish(): Enumerable[T] = js.native
  def publish[TResult](selector: js.Function1[/* source */ Enumerable[T], Enumerable[TResult]]): Enumerable[TResult] = js.native
  def reduce(
    func: js.Function4[
      /* accumulate */ T, 
      /* current */ T, 
      /* index */ scala.Double, 
      /* self */ Enumerable[T], 
      T
    ]
  ): T = js.native
  def reduce[TAccumulate](
    func: js.Function4[
      /* accumulate */ TAccumulate, 
      /* current */ T, 
      /* index */ scala.Double, 
      /* self */ Enumerable[T], 
      TAccumulate
    ],
    seed: TAccumulate
  ): TAccumulate = js.native
  def repeat(): Enumerable[T] = js.native
  def repeat(count: scala.Double): Enumerable[T] = js.native
  def retry(): Enumerable[T] = js.native
  def retry(retryCount: scala.Double): Enumerable[T] = js.native
  def reverse(): Enumerable[T] = js.native
  def scan(accumulate: js.Function2[/* acc */ T, /* item */ T, T]): Enumerable[T] = js.native
  def scan[TAccumulate](seed: TAccumulate, accumulate: js.Function2[/* acc */ TAccumulate, /* item */ T, TAccumulate]): Enumerable[TAccumulate] = js.native
  def select[TResult](selector: EnumerableFunc[T, TResult]): Enumerable[TResult] = js.native
  def select[TResult](selector: EnumerableFunc[T, TResult], thisArg: js.Any): Enumerable[TResult] = js.native
  def selectMany[TCollection](collectionSelector: js.Function2[/* item */ T, /* index */ scala.Double, Enumerable[TCollection]]): Enumerable[TCollection] = js.native
  def selectMany[TCollection, TResult](
    collectionSelector: js.Function2[/* item */ T, /* index */ scala.Double, Enumerable[TCollection]],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TCollection, TResult]
  ): Enumerable[TResult] = js.native
  def sequenceEqual(second: Enumerable[T]): scala.Boolean = js.native
  def sequenceEqual[TSecond](second: Enumerable[TSecond], comparer: EqualityComparer[T, TSecond]): scala.Boolean = js.native
  def share(): Enumerable[T] = js.native
  def share[TResult](selector: js.Function1[/* source */ Enumerable[T], Enumerable[TResult]]): Enumerable[TResult] = js.native
  def single(): T = js.native
  def single(predicate: Predicate[T]): T = js.native
  def singleOrDefault(): T = js.native
  def singleOrDefault(predicate: Predicate[T]): T = js.native
  def skip(count: scala.Double): Enumerable[T] = js.native
  def skipLast(count: scala.Double): Enumerable[T] = js.native
  def skipWhile(selector: EnumerablePredicate[T]): Enumerable[T] = js.native
  def skipWhile(selector: EnumerablePredicate[T], thisArg: js.Any): Enumerable[T] = js.native
  def some(): scala.Boolean = js.native
  def some(predicate: EnumerablePredicate[T]): scala.Boolean = js.native
  def some(predicate: EnumerablePredicate[T], thisArg: js.Any): scala.Boolean = js.native
  def startWith(values: T*): Enumerable[T] = js.native
  def sum(): scala.Double = js.native
  def sum(selector: EnumerableFunc[T, scala.Double]): scala.Double = js.native
  def take(count: scala.Double): Enumerable[T] = js.native
  def takeLast(count: scala.Double): Enumerable[T] = js.native
  def takeWhile(selector: EnumerablePredicate[T]): Enumerable[T] = js.native
  def takeWhile(selector: EnumerablePredicate[T], thisArg: js.Any): Enumerable[T] = js.native
  def toArray(): js.Array[T] = js.native
  def toDictionary[TKey](keySelector: js.Function1[/* item */ T, TKey]): Dictionary[TKey, T] = js.native
  // if need to set comparer without elementSelector
  def toDictionary[TKey](
    keySelector: js.Function1[/* item */ T, TKey],
    `_`: scala.Boolean,
    comparer: EqualityComparer[TKey, TKey]
  ): Dictionary[TKey, T] = js.native
  def toDictionary[TKey, TValue](keySelector: js.Function1[/* item */ T, TKey], elementSelector: js.Function1[/* item */ T, TValue]): Dictionary[TKey, TValue] = js.native
  def toDictionary[TKey, TValue](
    keySelector: js.Function1[/* item */ T, TKey],
    elementSelector: js.Function1[/* item */ T, TValue],
    comparer: EqualityComparer[TKey, TKey]
  ): Dictionary[TKey, TValue] = js.native
  def toLookup[TKey](keySelector: js.Function1[/* item */ T, TKey]): Lookup[TKey, T] = js.native
  // if need to set comparer without elementSelector
  def toLookup[TKey](
    keySelector: js.Function1[/* item */ T, TKey],
    `_`: scala.Boolean,
    comparer: EqualityComparer[TKey, TKey]
  ): Lookup[TKey, T] = js.native
  def toLookup[TKey, TValue](keySelector: js.Function1[/* item */ T, TKey], elementSelector: js.Function1[/* item */ T, TValue]): Lookup[TKey, TValue] = js.native
  def toLookup[TKey, TValue](
    keySelector: js.Function1[/* item */ T, TKey],
    elementSelector: js.Function1[/* item */ T, TValue],
    comparer: EqualityComparer[TKey, TKey]
  ): Lookup[TKey, TValue] = js.native
  def union(second: Enumerable[T]): Enumerable[T] = js.native
  def union(second: Enumerable[T], comparer: EqualityComparer[T, T]): Enumerable[T] = js.native
  def where(selector: EnumerablePredicate[T]): Enumerable[T] = js.native
  def where(selector: EnumerablePredicate[T], thisArg: js.Any): Enumerable[T] = js.native
  def zip[TRight, TResult](right: Enumerable[TRight], selector: js.Function2[/* left */ T, /* right */ TRight, TResult]): Enumerable[TResult] = js.native
}

@JSGlobal("Ix.Enumerable")
@js.native
class EnumerableCls[T] protected () extends Enumerable[T] {
  def this(getEnumerator: js.Function0[Enumerator[T]]) = this()
}

