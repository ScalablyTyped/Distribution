package typings.ixJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ix {
  
  type Comparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, Double]
  
  trait Dictionary[TKey, TValue] extends StObject {
    
    def add(key: TKey, value: TValue): Unit
    
    def clear(): Unit
    
    def get(key: TKey): TValue
    
    def getValues(): js.Array[TValue]
    
    def has(key: TKey): Boolean
    
    def length(): Double
    
    def remove(key: TKey): Boolean
    
    def set(key: TKey, value: TValue): Unit
    
    def toEnumerable(): Enumerable[KeyValuePair[TKey, TValue]]
    
    def tryGetValue(key: TKey): TValue
  }
  object Dictionary {
    
    @scala.inline
    def apply[TKey, TValue](
      add: (TKey, TValue) => Unit,
      clear: () => Unit,
      get: TKey => TValue,
      getValues: () => js.Array[TValue],
      has: TKey => Boolean,
      length: () => Double,
      remove: TKey => Boolean,
      set: (TKey, TValue) => Unit,
      toEnumerable: () => Enumerable[KeyValuePair[TKey, TValue]],
      tryGetValue: TKey => TValue
    ): Dictionary[TKey, TValue] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), getValues = js.Any.fromFunction0(getValues), has = js.Any.fromFunction1(has), length = js.Any.fromFunction0(length), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable), tryGetValue = js.Any.fromFunction1(tryGetValue))
      __obj.asInstanceOf[Dictionary[TKey, TValue]]
    }
    
    @scala.inline
    implicit class DictionaryMutableBuilder[Self <: Dictionary[?, ?], TKey, TValue] (val x: Self & (Dictionary[TKey, TValue])) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (TKey, TValue) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: TKey => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValues(value: () => js.Array[TValue]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHas(value: TKey => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: TKey => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (TKey, TValue) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToEnumerable(value: () => Enumerable[KeyValuePair[TKey, TValue]]): Self = StObject.set(x, "toEnumerable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTryGetValue(value: TKey => TValue): Self = StObject.set(x, "tryGetValue", js.Any.fromFunction1(value))
    }
  }
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
  }
  object Disposable {
    
    @scala.inline
    def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Enumerable[T] extends StObject {
    
    def aggregate(
      func: js.Function4[/* accumulate */ T, /* current */ T, /* index */ Double, /* self */ Enumerable[T], T]
    ): T = js.native
    def aggregate[TAccumulate](
      seed: TAccumulate,
      func: js.Function4[
          /* accumulate */ TAccumulate, 
          /* current */ T, 
          /* index */ Double, 
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
          /* index */ Double, 
          /* self */ Enumerable[T], 
          TAccumulate
        ],
      resultSelector: js.Function1[/* accumulate */ TAccumulate, TResult]
    ): TResult = js.native
    
    def all(predicate: EnumerablePredicate[T]): Boolean = js.native
    def all(predicate: EnumerablePredicate[T], thisArg: js.Any): Boolean = js.native
    
    // alias
    def any(): Boolean = js.native
    def any(predicate: Unit, thisArg: js.Any): Boolean = js.native
    def any(predicate: EnumerablePredicate[T]): Boolean = js.native
    def any(predicate: EnumerablePredicate[T], thisArg: js.Any): Boolean = js.native
    
    // alias
    def average(): Double = js.native
    def average(selector: EnumerableFunc[T, Double]): Double = js.native
    
    def bufferWithCount(count: Double): Enumerable[T] = js.native
    def bufferWithCount(count: Double, skip: Double): Enumerable[T] = js.native
    
    def `catch`(handler: js.Function1[/* error */ Error, Enumerable[T]]): Enumerable[T] = js.native
    def `catch`(second: Enumerable[T], other: Enumerable[T]*): Enumerable[T] = js.native
    
    def catchException(handler: js.Function1[/* error */ Error, Enumerable[T]]): Enumerable[T] = js.native
    def catchException(second: Enumerable[T], other: Enumerable[T]*): Enumerable[T] = js.native
    
    def concat[T](sources: Enumerable[T]*): Enumerable[T] = js.native
    
    def contains(value: T): Boolean = js.native
    def contains[TValue](value: TValue, comparer: EqualityComparer[T, TValue]): Boolean = js.native
    
    def count(): Double = js.native
    def count(predicate: Unit, thisArg: js.Any): Double = js.native
    def count(predicate: EnumerablePredicate[T]): Double = js.native
    def count(predicate: EnumerablePredicate[T], thisArg: js.Any): Double = js.native
    
    def defaultIfEmpty(): Enumerable[T] = js.native
    def defaultIfEmpty(defaultValue: T): Enumerable[T] = js.native
    
    def distinct(): Enumerable[T] = js.native
    def distinct(comparer: EqualityComparer[T, T]): Enumerable[T] = js.native
    
    def distinctBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): Enumerable[T] = js.native
    def distinctBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: EqualityComparer[TKey, TKey]): Enumerable[T] = js.native
    
    def distinctUntilChanged(): Enumerable[T] = js.native
    // if need to set comparer without keySelector
    def distinctUntilChanged(_underscore: Boolean, comparer: EqualityComparer[T, T]): Enumerable[T] = js.native
    def distinctUntilChanged[TKey](keySelector: js.Function1[/* item */ T, TKey]): Enumerable[T] = js.native
    def distinctUntilChanged[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: EqualityComparer[TKey, TKey]): Enumerable[T] = js.native
    
    def `do`(onNext: js.Function1[/* value */ T, Unit]): Enumerable[T] = js.native
    def `do`(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* error */ Error, Unit]): Enumerable[T] = js.native
    def `do`(
      onNext: js.Function1[/* value */ T, Unit],
      onError: js.Function1[/* error */ Error, Unit],
      onCompleted: js.Function0[Unit]
    ): Enumerable[T] = js.native
    def `do`(onNext: js.Function1[/* value */ T, Unit], onError: Unit, onCompleted: js.Function0[Unit]): Enumerable[T] = js.native
    def `do`(onbserver: Observer[T]): Enumerable[T] = js.native
    
    def doAction(onNext: js.Function1[/* value */ T, Unit]): Enumerable[T] = js.native
    def doAction(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* error */ Error, Unit]): Enumerable[T] = js.native
    def doAction(
      onNext: js.Function1[/* value */ T, Unit],
      onError: js.Function1[/* error */ Error, Unit],
      onCompleted: js.Function0[Unit]
    ): Enumerable[T] = js.native
    def doAction(onNext: js.Function1[/* value */ T, Unit], onError: Unit, onCompleted: js.Function0[Unit]): Enumerable[T] = js.native
    def doAction(onbserver: Observer[T]): Enumerable[T] = js.native
    
    def elementAt(index: Double): T = js.native
    
    def elementAtOrDefault(index: Double): T = js.native
    
    def every(predicate: EnumerablePredicate[T]): Boolean = js.native
    def every(predicate: EnumerablePredicate[T], thisArg: js.Any): Boolean = js.native
    
    def except(second: Enumerable[T]): Enumerable[T] = js.native
    def except[TOther](second: Enumerable[TOther], comparer: EqualityComparer[T, TOther]): Enumerable[T] = js.native
    
    def expand(selector: js.Function1[/* item */ T, Enumerable[T]]): Enumerable[T] = js.native
    
    def filter(selector: EnumerablePredicate[T]): Enumerable[T] = js.native
    def filter(selector: EnumerablePredicate[T], thisArg: js.Any): Enumerable[T] = js.native
    
    // todo: Enumerable<Enumerable<T>>.catch(): Enumerable<T>
    //catch<TInner, T extends Enumerable<TInner>>(): Enumerable<TInner>;
    def `finally`(finallyAction: js.Function0[Unit]): Enumerable[T] = js.native
    
    def finallyDo(finallyAction: js.Function0[Unit]): Enumerable[T] = js.native
    
    def first(): T = js.native
    def first(predicate: Predicate[T]): T = js.native
    
    def firstOrDefault(): T = js.native
    def firstOrDefault(predicate: Predicate[T]): T = js.native
    
    def forEach(action: EnumerableFunc[T, Unit]): Unit = js.native
    def forEach(action: EnumerableFunc[T, Unit], thisArg: js.Any): Unit = js.native
    
    // base functions
    def getEnumerator(): Enumerator[T] = js.native
    
    def groupBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): Enumerable[Grouping[TKey, T]] = js.native
    // if need to set comparer without elementSelector and resultSelector
    def groupBy[TKey](
      keySelector: js.Function1[/* item */ T, TKey],
      _underscore: Boolean,
      __ : Boolean,
      comparer: EqualityComparer[TKey, TKey]
    ): Enumerable[Grouping[TKey, T]] = js.native
    // if need to set resultSelector without elementSelector
    def groupBy[TKey, TResult](
      keySelector: js.Function1[/* item */ T, TKey],
      _underscore: Boolean,
      resultSelector: js.Function2[/* key */ TKey, /* values */ Enumerable[T], TResult]
    ): Enumerable[TResult] = js.native
    def groupBy[TKey, TResult](
      keySelector: js.Function1[/* item */ T, TKey],
      _underscore: Boolean,
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
      _underscore: Boolean,
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
    
    def isEmpty(): Boolean = js.native
    
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
    
    def maxBy(keySelector: js.Function1[/* item */ T, Double]): Enumerable[T] = js.native
    def maxBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): Enumerable[T] = js.native
    
    def memoize(): Enumerable[T] = js.native
    
    def min(): T = js.native
    def min[TResult](selector: EnumerableFunc[T, TResult]): TResult = js.native
    
    def minBy(keySelector: js.Function1[/* item */ T, Double]): Enumerable[T] = js.native
    def minBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): Enumerable[T] = js.native
    
    def onErrorResumeNext(second: Enumerable[T]): Enumerable[T] = js.native
    
    def orderBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
    def orderBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
    
    def orderByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
    def orderByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
    
    def publish(): Enumerable[T] = js.native
    def publish[TResult](selector: js.Function1[/* source */ Enumerable[T], Enumerable[TResult]]): Enumerable[TResult] = js.native
    
    def reduce(
      func: js.Function4[/* accumulate */ T, /* current */ T, /* index */ Double, /* self */ Enumerable[T], T]
    ): T = js.native
    def reduce[TAccumulate](
      func: js.Function4[
          /* accumulate */ TAccumulate, 
          /* current */ T, 
          /* index */ Double, 
          /* self */ Enumerable[T], 
          TAccumulate
        ],
      seed: TAccumulate
    ): TAccumulate = js.native
    
    def repeat(): Enumerable[T] = js.native
    def repeat(count: Double): Enumerable[T] = js.native
    
    def retry(): Enumerable[T] = js.native
    def retry(retryCount: Double): Enumerable[T] = js.native
    
    def reverse(): Enumerable[T] = js.native
    
    def scan(accumulate: js.Function2[/* acc */ T, /* item */ T, T]): Enumerable[T] = js.native
    def scan[TAccumulate](seed: TAccumulate, accumulate: js.Function2[/* acc */ TAccumulate, /* item */ T, TAccumulate]): Enumerable[TAccumulate] = js.native
    
    def select[TResult](selector: EnumerableFunc[T, TResult]): Enumerable[TResult] = js.native
    def select[TResult](selector: EnumerableFunc[T, TResult], thisArg: js.Any): Enumerable[TResult] = js.native
    
    def selectMany[TCollection](collectionSelector: js.Function2[/* item */ T, /* index */ Double, Enumerable[TCollection]]): Enumerable[TCollection] = js.native
    def selectMany[TCollection, TResult](
      collectionSelector: js.Function2[/* item */ T, /* index */ Double, Enumerable[TCollection]],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TCollection, TResult]
    ): Enumerable[TResult] = js.native
    
    def sequenceEqual(second: Enumerable[T]): Boolean = js.native
    def sequenceEqual[TSecond](second: Enumerable[TSecond], comparer: EqualityComparer[T, TSecond]): Boolean = js.native
    
    def share(): Enumerable[T] = js.native
    def share[TResult](selector: js.Function1[/* source */ Enumerable[T], Enumerable[TResult]]): Enumerable[TResult] = js.native
    
    def single(): T = js.native
    def single(predicate: Predicate[T]): T = js.native
    
    def singleOrDefault(): T = js.native
    def singleOrDefault(predicate: Predicate[T]): T = js.native
    
    def skip(count: Double): Enumerable[T] = js.native
    
    def skipLast(count: Double): Enumerable[T] = js.native
    
    def skipWhile(selector: EnumerablePredicate[T]): Enumerable[T] = js.native
    def skipWhile(selector: EnumerablePredicate[T], thisArg: js.Any): Enumerable[T] = js.native
    
    def some(): Boolean = js.native
    def some(predicate: Unit, thisArg: js.Any): Boolean = js.native
    def some(predicate: EnumerablePredicate[T]): Boolean = js.native
    def some(predicate: EnumerablePredicate[T], thisArg: js.Any): Boolean = js.native
    
    def startWith(values: T*): Enumerable[T] = js.native
    
    def sum(): Double = js.native
    def sum(selector: EnumerableFunc[T, Double]): Double = js.native
    
    def take(count: Double): Enumerable[T] = js.native
    
    def takeLast(count: Double): Enumerable[T] = js.native
    
    def takeWhile(selector: EnumerablePredicate[T]): Enumerable[T] = js.native
    def takeWhile(selector: EnumerablePredicate[T], thisArg: js.Any): Enumerable[T] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toDictionary[TKey](keySelector: js.Function1[/* item */ T, TKey]): Dictionary[TKey, T] = js.native
    // if need to set comparer without elementSelector
    def toDictionary[TKey](
      keySelector: js.Function1[/* item */ T, TKey],
      _underscore: Boolean,
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
      _underscore: Boolean,
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
  
  type EnumerableFunc[T, TResult] = js.Function3[/* item */ T, /* index */ Double, /* self */ Enumerable[T], TResult]
  
  type EnumerablePredicate[T] = EnumerableFunc[T, Boolean]
  
  @js.native
  trait EnumerableStatic
    extends StObject
       with Instantiable1[/* getEnumerator */ js.Function0[Enumerator[js.Object]], Enumerable[js.Object]] {
    
    def `case`[T](selector: js.Function0[Double], sources: NumberDictionary[Enumerable[T]]): Enumerable[T] = js.native
    def `case`[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[Enumerable[T]],
      defaultSource: Enumerable[T]
    ): Enumerable[T] = js.native
    def `case`[T](selector: js.Function0[String], sources: StringDictionary[Enumerable[T]]): Enumerable[T] = js.native
    def `case`[T](
      selector: js.Function0[String],
      sources: StringDictionary[Enumerable[T]],
      defaultSource: Enumerable[T]
    ): Enumerable[T] = js.native
    
    def `catch`[T](sources: Enumerable[T]*): Enumerable[T] = js.native
    
    def catchException[T](sources: Enumerable[T]*): Enumerable[T] = js.native
    
    def concat[T](sources: Enumerable[T]*): Enumerable[T] = js.native
    
    def create[T](getEnumerator: js.Function0[Enumerator[T]]): Enumerable[T] = js.native
    
    def defer[T](enumerableFactory: js.Function0[Enumerable[T]]): Enumerable[T] = js.native
    
    def doWhile[T](source: Enumerable[T], condition: EnumerablePredicate[Enumerable[T]]): Enumerable[T] = js.native
    
    def empty[T](): Enumerable[T] = js.native
    
    def `for`[T, TResult](source: Enumerable[T], resultSelector: EnumerableFunc[T, TResult]): Enumerable[TResult] = js.native
    
    def forIn[T, TResult](source: Enumerable[T], resultSelector: EnumerableFunc[T, TResult]): Enumerable[TResult] = js.native
    
    def fromArray[T](array: js.Array[T]): Enumerable[T] = js.native
    
    def generate[TState, TResult](
      initialState: TState,
      condition: Predicate[TState],
      iterate: js.Function1[/* state */ TState, TState],
      resultSelector: js.Function1[/* state */ TState, TResult]
    ): Enumerable[TResult] = js.native
    
    def `if`[T](condition: js.Function0[Boolean], thenSource: Enumerable[T]): Enumerable[T] = js.native
    def `if`[T](condition: js.Function0[Boolean], thenSource: Enumerable[T], elseSource: Enumerable[T]): Enumerable[T] = js.native
    
    def ifThen[T](condition: js.Function0[Boolean], thenSource: Enumerable[T]): Enumerable[T] = js.native
    def ifThen[T](condition: js.Function0[Boolean], thenSource: Enumerable[T], elseSource: Enumerable[T]): Enumerable[T] = js.native
    
    def onErrorResumeNext[T](sources: Enumerable[T]*): Enumerable[T] = js.native
    
    // alias for <IE9
    def range(start: Double, count: Double): Enumerable[Double] = js.native
    
    def repeat[T](value: T): Enumerable[T] = js.native
    def repeat[T](value: T, repeatCount: Double): Enumerable[T] = js.native
    
    def `return`[T](value: T): Enumerable[T] = js.native
    
    def returnValue[T](value: T): Enumerable[T] = js.native
    
    def sequenceEqual[T](first: Enumerable[T], second: Enumerable[T]): Boolean = js.native
    def sequenceEqual[TFirst, TSecond](
      first: Enumerable[TFirst],
      second: Enumerable[TSecond],
      comparer: EqualityComparer[TFirst, TSecond]
    ): Boolean = js.native
    
    def switchCase[T](selector: js.Function0[Double], sources: NumberDictionary[Enumerable[T]]): Enumerable[T] = js.native
    def switchCase[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[Enumerable[T]],
      defaultSource: Enumerable[T]
    ): Enumerable[T] = js.native
    def switchCase[T](selector: js.Function0[String], sources: StringDictionary[Enumerable[T]]): Enumerable[T] = js.native
    def switchCase[T](
      selector: js.Function0[String],
      sources: StringDictionary[Enumerable[T]],
      defaultSource: Enumerable[T]
    ): Enumerable[T] = js.native
    
    def `throw`[T](error: Error): Enumerable[T] = js.native
    
    def throwException[T](error: Error): Enumerable[T] = js.native
    
    def `using`[TResource /* <: Disposable */, T](
      resourceFactory: js.Function0[TResource],
      enumerableFactory: js.Function1[/* resource */ TResource, Enumerable[T]]
    ): Enumerable[T] = js.native
    
    def `while`[T](condition: EnumerablePredicate[Enumerable[T]], source: Enumerable[T]): Enumerable[T] = js.native
    
    def whileDo[T](condition: EnumerablePredicate[Enumerable[T]], source: Enumerable[T]): Enumerable[T] = js.native
  }
  
  trait Enumerator[T]
    extends StObject
       with Disposable {
    
    def getCurrent(): T
    
    def moveNext(): Boolean
  }
  object Enumerator {
    
    @scala.inline
    def apply[T](dispose: () => Unit, getCurrent: () => T, moveNext: () => Boolean): Enumerator[T] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getCurrent = js.Any.fromFunction0(getCurrent), moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[Enumerator[T]]
    }
    
    @scala.inline
    implicit class EnumeratorMutableBuilder[Self <: Enumerator[?], T] (val x: Self & Enumerator[T]) extends AnyVal {
      
      @scala.inline
      def setGetCurrent(value: () => T): Self = StObject.set(x, "getCurrent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait EnumeratorStatic
    extends StObject
       with Instantiable3[
          /* moveNext */ js.Function0[Boolean], 
          /* getCurrent */ js.Function0[js.Object], 
          /* dispose */ js.Function0[Unit], 
          Enumerator[js.Object]
        ] {
    
    def create[T](moveNext: js.Function0[Boolean], getCurrent: js.Function0[T]): Enumerator[T] = js.native
    def create[T](moveNext: js.Function0[Boolean], getCurrent: js.Function0[T], dispose: js.Function0[Unit]): Enumerator[T] = js.native
  }
  
  type EqualityComparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, Boolean]
  
  @js.native
  trait Grouping[TKey, T]
    extends StObject
       with Enumerable[T] {
    
    var key: TKey = js.native
  }
  
  trait KeyValuePair[TKey, TValue] extends StObject {
    
    var key: TKey
    
    var value: TValue
  }
  object KeyValuePair {
    
    @scala.inline
    def apply[TKey, TValue](key: TKey, value: TValue): KeyValuePair[TKey, TValue] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyValuePair[TKey, TValue]]
    }
    
    @scala.inline
    implicit class KeyValuePairMutableBuilder[Self <: KeyValuePair[?, ?], TKey, TValue] (val x: Self & (KeyValuePair[TKey, TValue])) extends AnyVal {
      
      @scala.inline
      def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lookup[TKey, TValue] extends StObject {
    
    def get(key: TKey): Enumerable[TValue]
    
    def has(key: TKey): Boolean
    
    def length(): Double
    
    def toEnumerable(): Enumerable[Grouping[TKey, TValue]]
  }
  object Lookup {
    
    @scala.inline
    def apply[TKey, TValue](
      get: TKey => Enumerable[TValue],
      has: TKey => Boolean,
      length: () => Double,
      toEnumerable: () => Enumerable[Grouping[TKey, TValue]]
    ): Lookup[TKey, TValue] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), length = js.Any.fromFunction0(length), toEnumerable = js.Any.fromFunction0(toEnumerable))
      __obj.asInstanceOf[Lookup[TKey, TValue]]
    }
    
    @scala.inline
    implicit class LookupMutableBuilder[Self <: Lookup[?, ?], TKey, TValue] (val x: Self & (Lookup[TKey, TValue])) extends AnyVal {
      
      @scala.inline
      def setGet(value: TKey => Enumerable[TValue]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: TKey => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToEnumerable(value: () => Enumerable[Grouping[TKey, TValue]]): Self = StObject.set(x, "toEnumerable", js.Any.fromFunction0(value))
    }
  }
  
  trait Observer[T] extends StObject {
    
    var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    var onNext: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object Observer {
    
    @scala.inline
    def apply[T](): Observer[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
      
      @scala.inline
      def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnNext(value: /* value */ T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    }
  }
  
  @js.native
  trait OrderedEnumerable[T]
    extends StObject
       with Enumerable[T] {
    
    def thenBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
    def thenBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
    
    def thenByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
    def thenByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
  }
  
  type Predicate[T] = js.Function1[/* item */ T, Boolean]
}
