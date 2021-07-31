package typings.lodash.mod

import typings.lodash.lodashBooleans.`true`
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[T]
  extends StObject
     with LoDashImplicitWrapper[js.Array[T]] {
  
  /**
    * @see _.at
    */
  def at(props: PropertyPath*): Collection[T] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): Collection[T] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): CollectionChain[T] = js.native
  
  /**
    * @see _.chunk
    */
  def chunk(): Collection[js.Array[T]] = js.native
  def chunk(size: Double): Collection[js.Array[T]] = js.native
  
  /**
    * @see _.compact
    */
  def compact(): Collection[Truthy[T]] = js.native
  
  /**
    * @see _.concat
    */
  def concat(values: Many[T]*): Collection[T] = js.native
  
  /**
    * @see _.countBy
    */
  def countBy(): Object[Dictionary[Double]] = js.native
  def countBy(iteratee: ValueIteratee[T]): Object[Dictionary[Double]] = js.native
  
  /**
    * @see _.difference
    */
  def difference(values: List[T]*): Collection[T] = js.native
  
  /**
    * @see _.differenceBy
    */
  def differenceBy(values: (List[js.Any] | ValueIteratee[T])*): Collection[T] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T2](values1: List[T2]): Collection[T] = js.native
  def differenceBy[T2](values1: List[T2], iteratee: ValueIteratee[T | T2]): Collection[T] = js.native
  
  /**
    * @see _.differenceWith
    */
  def differenceWith[T2](values: List[T2], comparator: Comparator2[T, T2]): Collection[T] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T2, T3, T4](values: (List[js.Any] | (Comparator2[T, scala.Nothing]))*): Collection[T] = js.native
  
  /**
    * @see _.drop
    */
  def drop(): Collection[T] = js.native
  def drop(n: Double): Collection[T] = js.native
  
  /**
    * @see _.dropRight
    */
  def dropRight(): Collection[T] = js.native
  def dropRight(n: Double): Collection[T] = js.native
  
  /**
    * @see _.dropRightWhile
    */
  def dropRightWhile(): Collection[T] = js.native
  def dropRightWhile(predicate: ListIteratee[T]): Collection[T] = js.native
  
  /**
    * @see _.dropWhile
    */
  def dropWhile(): Collection[T] = js.native
  def dropWhile(predicate: ListIteratee[T]): Collection[T] = js.native
  
  /**
    * @see _.each
    */
  def each(): Collection[T] = js.native
  def each(iteratee: ListIterator[T, js.Any]): Collection[T] = js.native
  
  /**
    * @see _.eachRight
    */
  def eachRight(): Collection[T] = js.native
  def eachRight(iteratee: ListIterator[T, js.Any]): Collection[T] = js.native
  /**
    * @see _.eachRight
    */
  @JSName("eachRight")
  var eachRight_Original: js.Function1[/* iteratee */ js.UndefOr[ListIterator[T, js.Any]], Collection[T]] = js.native
  
  /**
    * @see _.each
    */
  @JSName("each")
  var each_Original: js.Function1[/* iteratee */ js.UndefOr[ListIterator[T, js.Any]], Collection[T]] = js.native
  
  /**
    * @see _.every
    */
  def every(): Boolean = js.native
  def every(predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  
  /**
    * @see _.fill
    */
  def fill[U](value: U): Collection[T | U] = js.native
  def fill[U](value: U, start: Double): Collection[T | U] = js.native
  def fill[U](value: U, start: Double, end: Double): Collection[T | U] = js.native
  def fill[U](value: U, start: Unit, end: Double): Collection[T | U] = js.native
  
  /**
    * @see _.filter
    */
  def filter(): Collection[T] = js.native
  def filter(predicate: ListIterateeCustom[T, Boolean]): Collection[T] = js.native
  /**
    * @see _.filter
    */
  def filter[S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): Collection[S] = js.native
  
  /**
    * @see _.find
    */
  def find(): js.UndefOr[T] = js.native
  def find(predicate: Unit, fromIndex: Double): js.UndefOr[T] = js.native
  def find(predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def find(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  /**
    * @see _.find
    */
  def find[S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def find[S /* <: T */](predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  
  /**
    * @see _.findIndex
    */
  def findIndex(): Double = js.native
  def findIndex(predicate: Unit, fromIndex: Double): Double = js.native
  def findIndex(predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  def findIndex(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): Double = js.native
  
  /**
    * @see _.findLast
    */
  def findLast(): js.UndefOr[T] = js.native
  def findLast(predicate: Unit, fromIndex: Double): js.UndefOr[T] = js.native
  def findLast(predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def findLast(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  /**
    * @see _.findLast
    */
  def findLast[S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def findLast[S /* <: T */](predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  
  /**
    * @see _.findLastIndex
    */
  def findLastIndex(): Double = js.native
  def findLastIndex(predicate: Unit, fromIndex: Double): Double = js.native
  def findLastIndex(predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  def findLastIndex(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): Double = js.native
  
  /**
    * @see _.first
    */
  def first(): js.UndefOr[T] = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): Collection[js.Any | T] = js.native
  def flatMap(iteratee: js.Object): Collection[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Tuple2[PropertyName, js.Any]): Collection[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[TResult](iteratee: ListIterator[T, Many[TResult]]): Collection[TResult] = js.native
  def flatMap[TResult](iteratee: PropertyName): Collection[TResult] = js.native
  
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(): Collection[T] = js.native
  def flatMapDeep(iteratee: js.Object): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(iteratee: js.Tuple2[PropertyName, js.Any]): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): Collection[TResult] = js.native
  def flatMapDeep[TResult](iteratee: PropertyName): Collection[TResult] = js.native
  
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(): Collection[T] = js.native
  def flatMapDepth(depth: Double): Collection[T] = js.native
  def flatMapDepth(iteratee: js.Object): Collection[Boolean] = js.native
  def flatMapDepth(iteratee: js.Object, depth: Double): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, js.Any]): Collection[Boolean] = js.native
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, js.Any], depth: Double): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): Collection[TResult] = js.native
  def flatMapDepth[TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): Collection[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName): Collection[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName, depth: Double): Collection[TResult] = js.native
  
  /**
    * @see _.flatten
    */
  def flatten(): Collection[js.Any | T] = js.native
  
  /**
    * @see _.flattenDeep
    */
  def flattenDeep(): Collection[Flat[js.Any] | T] = js.native
  
  /**
    * @see _.flattenDepth
    */
  def flattenDepth(): Collection[T] = js.native
  def flattenDepth(depth: Double): Collection[T] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(): Collection[T] = js.native
  def forEach(iteratee: ListIterator[T, js.Any]): Collection[T] = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(): Collection[T] = js.native
  def forEachRight(iteratee: ListIterator[T, js.Any]): Collection[T] = js.native
  
  /**
    * @see _.fromPairs
    */
  def fromPairs(): Object[Dictionary[js.Any]] = js.native
  
  /**
    * @see _.get
    */
  def get(path: Double): T = js.native
  /**
    * @see _.get
    */
  def get[TDefault](path: Double, defaultValue: TDefault): T | TDefault = js.native
  
  /**
    * @see _.groupBy
    */
  def groupBy(): Object[Dictionary[js.Array[T]]] = js.native
  def groupBy(iteratee: ValueIteratee[T]): Object[Dictionary[js.Array[T]]] = js.native
  
  /**
    * @see _.head
    */
  def head(): js.UndefOr[T] = js.native
  
  /**
    * @see _.includes
    */
  def includes(target: T): Boolean = js.native
  def includes(target: T, fromIndex: Double): Boolean = js.native
  
  /**
    * @see _.indexOf
    */
  def indexOf(value: T): Double = js.native
  def indexOf(value: T, fromIndex: Double): Double = js.native
  
  /**
    * @see _.initial
    */
  def initial(): Collection[T] = js.native
  
  /**
    * @see _.intersection
    */
  def intersection(arrays: (js.UndefOr[List[T] | Null])*): Collection[T] = js.native
  
  /**
    * @see _.intersectionBy
    */
  def intersectionBy(values: (List[js.Any] | ValueIteratee[T])*): Collection[T] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T2](values: List[T2], iteratee: ValueIteratee[T | T2]): Collection[T] = js.native
  
  /**
    * @see _.intersectionWith
    */
  def intersectionWith(values: (List[js.Any] | (Comparator2[T, scala.Nothing]))*): Collection[T] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T2](values: List[T2], comparator: Comparator2[T, T2]): Collection[T] = js.native
  
  /**
    * @see _.invertBy
    */
  def invertBy(): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy(iteratee: ValueIteratee[T]): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): Function[js.Function1[/* o */ js.Object, Boolean]] = js.native
  
  /**
    * @see _.join
    */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.keyBy
    */
  def keyBy(): Object[Dictionary[T]] = js.native
  def keyBy(iteratee: ValueIterateeCustom[T, PropertyName]): Object[Dictionary[T]] = js.native
  
  /**
    * @see _.last
    */
  def last(): js.UndefOr[T] = js.native
  
  /**
    * @see _.lastIndexOf
    */
  def lastIndexOf(value: T): Double = js.native
  def lastIndexOf(value: T, fromIndex: Double): Double = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true(value: T, fromIndex: `true`): Double = js.native
  
  /**
    * @see _.map
    */
  def map(): Collection[T] = js.native
  def map(iteratee: js.Object): Collection[Boolean] = js.native
  /**
    * @see _.map
    */
  def map(iteratee: js.Tuple2[PropertyName, js.Any]): Collection[Boolean] = js.native
  /**
    * @see _.map
    */
  def map(iteratee: PropertyName): Collection[js.Any] = js.native
  /**
    * @see _.map
    */
  def map[TResult](iteratee: ListIterator[T, TResult]): Collection[TResult] = js.native
  
  /**
    * @see _.mapKeys
    */
  def mapKeys(): Object[Dictionary[T]] = js.native
  def mapKeys(iteratee: ListIteratee[T]): Object[Dictionary[T]] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): Object[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: java.lang.String): Object[Dictionary[js.Any]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: js.Object): Object[Dictionary[Boolean]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](callback: DictionaryIterator[T, TResult]): Object[Dictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey): Object[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.map
    */
  @JSName("map")
  def map_K_String[K /* <: /* keyof T */ java.lang.String */](key: K): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  /**
    * @see _.max
    */
  def max(): js.UndefOr[T] = js.native
  
  /**
    * @see _.maxBy
    */
  def maxBy(): js.UndefOr[T] = js.native
  def maxBy(iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  
  /**
    * @see _.meanBy
    */
  def meanBy(): Double = js.native
  def meanBy(iteratee: ValueIteratee[T]): Double = js.native
  
  /**
    * @see _.min
    */
  def min(): js.UndefOr[T] = js.native
  
  /**
    * @see _.minBy
    */
  def minBy(): js.UndefOr[T] = js.native
  def minBy(iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  
  /**
    * @see _.nth
    */
  def nth(): js.UndefOr[T] = js.native
  def nth(n: Double): js.UndefOr[T] = js.native
  
  /**
    * @see _.omit
    */
  def omit(paths: Many[PropertyName]*): Collection[T] = js.native
  
  /**
    * @see _.omitBy
    */
  def omitBy(): Object[Dictionary[T]] = js.native
  def omitBy(predicate: ValueKeyIteratee[T]): Object[Dictionary[T]] = js.native
  
  /**
    * @see _.orderBy
    */
  def orderBy(): Collection[T] = js.native
  def orderBy(iteratees: Unit, orders: Many[Boolean | asc | desc]): Collection[T] = js.native
  def orderBy(iteratees: Many[(ListIterator[T, NotVoid]) | PropertyName | PartialShallow[T]]): Collection[T] = js.native
  def orderBy(
    iteratees: Many[(ListIterator[T, NotVoid]) | PropertyName | PartialShallow[T]],
    orders: Many[Boolean | asc | desc]
  ): Collection[T] = js.native
  
  /**
    * @see _.over
    */
  def over[TResult](iteratees: (Many[js.Function1[/* repeated */ js.Any, TResult]])*): Function[js.Function1[/* repeated */ js.Any, js.Array[TResult]]] = js.native
  
  /**
    * @see _.overEvery
    */
  def overEvery[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): Function[js.Function1[/* repeated */ TArgs, Boolean]] = js.native
  
  /**
    * @see _.overSome
    */
  def overSome[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): Function[js.Function1[/* repeated */ TArgs, Boolean]] = js.native
  
  /**
    * @see _.partition
    */
  def partition(callback: ValueIteratee[T]): LoDashImplicitWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  /**
    * @see _.partition
    */
  def partition[U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): LoDashImplicitWrapper[js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]] = js.native
  
  /**
    * @see _.pickBy
    */
  def pickBy(): Object[Dictionary[T]] = js.native
  def pickBy(predicate: ValueKeyIteratee[T]): Object[Dictionary[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): Object[Dictionary[S]] = js.native
  
  def pop(): js.UndefOr[T] = js.native
  
  /**
    * @see _.pull
    */
  def pull(values: T*): Collection[T] = js.native
  
  /**
    * @see _.pullAll
    */
  def pullAll(): Collection[T] = js.native
  def pullAll(values: List[T]): Collection[T] = js.native
  
  /**
    * @see _.pullAllBy
    */
  def pullAllBy[T2](): Collection[T] = js.native
  def pullAllBy[T2](values: Unit, iteratee: ValueIteratee[T | T2]): Collection[T] = js.native
  def pullAllBy[T2](values: List[T2]): Collection[T] = js.native
  def pullAllBy[T2](values: List[T2], iteratee: ValueIteratee[T | T2]): Collection[T] = js.native
  
  /**
    * @see _.pullAllWith
    */
  def pullAllWith[T2](): Collection[T] = js.native
  def pullAllWith[T2](values: Unit, comparator: Comparator2[T, T2]): Collection[T] = js.native
  def pullAllWith[T2](values: List[T2]): Collection[T] = js.native
  def pullAllWith[T2](values: List[T2], comparator: Comparator2[T, T2]): Collection[T] = js.native
  
  /**
    * @see _.pullAt
    */
  def pullAt(indexes: Many[Double]*): Collection[T] = js.native
  
  def push(items: T*): this.type = js.native
  
  /**
    * @see _.reduce
    */
  def reduce(callback: MemoListIterator[T, T, List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduce
    */
  def reduce[TResult](callback: MemoListIterator[T, TResult, List[T]], accumulator: TResult): TResult = js.native
  
  /**
    * @see _.reduceRight
    */
  def reduceRight(callback: MemoListIterator[T, T, List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduceRight
    */
  def reduceRight[TResult](callback: MemoListIterator[T, TResult, List[T]], accumulator: TResult): TResult = js.native
  
  /**
    * @see _.reject
    */
  def reject(): Collection[T] = js.native
  def reject(predicate: ListIterateeCustom[T, Boolean]): Collection[T] = js.native
  
  /**
    * @see _.remove
    */
  def remove(): Collection[T] = js.native
  def remove(predicate: ListIteratee[T]): Collection[T] = js.native
  
  /**
    * @see _.sample
    */
  def sample(): js.UndefOr[T] = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize(): Collection[T] = js.native
  def sampleSize(n: Double): Collection[T] = js.native
  
  def shift(): js.UndefOr[T] = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle(): Collection[T] = js.native
  
  /**
    * @see _.slice
    */
  def slice(): Collection[T] = js.native
  def slice(start: Double): Collection[T] = js.native
  def slice(start: Double, end: Double): Collection[T] = js.native
  def slice(start: Unit, end: Double): Collection[T] = js.native
  
  /**
    * @see _.some
    */
  def some(): Boolean = js.native
  def some(predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): this.type = js.native
  
  /**
    * @see _.sortBy
    */
  def sortBy(iteratees: Many[ListIteratee[T]]*): Collection[T] = js.native
  
  /**
    * @see _.sortedIndex
    */
  def sortedIndex(value: T): Double = js.native
  
  /**
    * @see _.sortedIndexBy
    */
  def sortedIndexBy(value: T): Double = js.native
  def sortedIndexBy(value: T, iteratee: ValueIteratee[T]): Double = js.native
  
  /**
    * @see _.sortedIndexOf
    */
  def sortedIndexOf(value: T): Double = js.native
  
  /**
    * @see _.sortedLastIndex
    */
  def sortedLastIndex(value: T): Double = js.native
  
  /**
    * @see _.sortedLastIndexBy
    */
  def sortedLastIndexBy(value: T, iteratee: ValueIteratee[T]): Double = js.native
  
  /**
    * @see _.sortedLastIndexOf
    */
  def sortedLastIndexOf(value: T): Double = js.native
  
  /**
    * @see _.sortedUniq
    */
  def sortedUniq(): Collection[T] = js.native
  
  /**
    * @see _.sortedUniqBy
    */
  def sortedUniqBy(iteratee: ValueIteratee[T]): Collection[T] = js.native
  
  def splice(start: Double, deleteCount: Double, items: T*): this.type = js.native
  def splice(start: Double, deleteCount: Unit, items: T*): this.type = js.native
  
  /**
    * @see _.sumBy
    */
  def sumBy(): Double = js.native
  def sumBy(iteratee: java.lang.String): Double = js.native
  def sumBy(iteratee: js.Function1[/* value */ T, Double]): Double = js.native
  
  /**
    * @see _.tail
    */
  def tail(): Collection[T] = js.native
  
  /**
    * @see _.take
    */
  def take(): Collection[T] = js.native
  def take(n: Double): Collection[T] = js.native
  
  /**
    * @see _.takeRight
    */
  def takeRight(): Collection[T] = js.native
  def takeRight(n: Double): Collection[T] = js.native
  
  /**
    * @see _.takeRightWhile
    */
  def takeRightWhile(): Collection[T] = js.native
  def takeRightWhile(predicate: ListIteratee[T]): Collection[T] = js.native
  
  /**
    * @see _.takeWhile
    */
  def takeWhile(): Collection[T] = js.native
  def takeWhile(predicate: ListIteratee[T]): Collection[T] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): Collection[T] = js.native
  
  /**
    * @see _.transform
    */
  def transform(): Collection[js.Any] = js.native
  /**
    * @see _.transform
    */
  def transform[TResult](iteratee: MemoVoidArrayIterator[T, TResult]): ImpChain[TResult] = js.native
  def transform[TResult](iteratee: MemoVoidArrayIterator[T, TResult], accumulator: TResult): ImpChain[TResult] = js.native
  
  /**
    * @see _.union
    */
  def union(arrays: (js.UndefOr[List[T] | Null])*): Collection[T] = js.native
  
  /**
    * @see _.unionBy
    */
  def unionBy(): Collection[T] = js.native
  def unionBy(arrays2: Null, iteratee: ValueIteratee[T]): Collection[T] = js.native
  def unionBy(arrays2: Unit, iteratee: ValueIteratee[T]): Collection[T] = js.native
  def unionBy(arrays2: List[T]): Collection[T] = js.native
  def unionBy(arrays2: List[T], iteratee: ValueIteratee[T]): Collection[T] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy(iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*): Collection[T] = js.native
  
  /**
    * @see _.unionWith
    */
  def unionWith(): Collection[T] = js.native
  def unionWith(arrays2: Null, comparator: Comparator[T]): Collection[T] = js.native
  def unionWith(arrays2: Unit, comparator: Comparator[T]): Collection[T] = js.native
  def unionWith(arrays2: List[T]): Collection[T] = js.native
  def unionWith(arrays2: List[T], comparator: Comparator[T]): Collection[T] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith(comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): Collection[T] = js.native
  
  /**
    * @see _.uniq
    */
  def uniq(): Collection[T] = js.native
  
  /**
    * @see _.uniqBy
    */
  def uniqBy(iteratee: ValueIteratee[T]): Collection[T] = js.native
  
  /**
    * @see _.uniqWith
    */
  def uniqWith(): Collection[T] = js.native
  def uniqWith(comparator: Comparator[T]): Collection[T] = js.native
  
  def unshift(items: T*): this.type = js.native
  
  /**
    * @see _.unzip
    */
  def unzip(): js.Any | Collection[js.Array[js.Any]] = js.native
  
  /**
    * @see _.unzipWith
    */
  def unzipWith(): js.Any | Collection[js.Array[js.Any]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[TResult](iteratee: js.Function1[/* repeated */ js.Any, TResult]): Collection[TResult] = js.native
  
  /**
    * @see _.without
    */
  def without(values: T*): Collection[T] = js.native
  
  /**
    * @see _.xor
    */
  def xor(arrays: (js.UndefOr[List[T] | Null])*): Collection[T] = js.native
  
  /**
    * @see _.xorBy
    */
  def xorBy(): Collection[T] = js.native
  def xorBy(arrays2: Null, iteratee: ValueIteratee[T]): Collection[T] = js.native
  def xorBy(arrays2: Unit, iteratee: ValueIteratee[T]): Collection[T] = js.native
  def xorBy(arrays2: List[T]): Collection[T] = js.native
  def xorBy(arrays2: List[T], iteratee: ValueIteratee[T]): Collection[T] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy(iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*): Collection[T] = js.native
  
  /**
    * @see _.xorWith
    */
  def xorWith(): Collection[T] = js.native
  def xorWith(arrays2: Null, comparator: Comparator[T]): Collection[T] = js.native
  def xorWith(arrays2: Unit, comparator: Comparator[T]): Collection[T] = js.native
  def xorWith(arrays2: List[T]): Collection[T] = js.native
  def xorWith(arrays2: List[T], comparator: Comparator[T]): Collection[T] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith(comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): Collection[T] = js.native
  
  /**
    * @see _.zip
    */
  def zip(arrays: (js.UndefOr[List[T] | Null])*): Collection[js.Array[js.UndefOr[T]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T2](arrays2: List[T2]): Collection[js.Tuple2[js.UndefOr[T], js.UndefOr[T2]]] = js.native
  
  /**
    * @see _.zipObject
    */
  def zipObject(): Object[Dictionary[Unit]] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject[U](values: List[U]): Object[Dictionary[U]] = js.native
  
  /**
    * @see _.zipObjectDeep
    */
  def zipObjectDeep(): Object[js.Object] = js.native
  def zipObjectDeep(values: List[js.Any]): Object[js.Object] = js.native
  
  /**
    * @see _.zipWith
    */
  def zipWith[TResult](iteratee: (js.UndefOr[(js.Function1[/* repeated */ T, TResult]) | List[T] | Null])*): Collection[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T2, TResult](arrays2: List[T2], iteratee: js.Function2[/* value1 */ T, /* value2 */ T2, TResult]): Collection[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T2, T3, TResult](
    arrays2: List[T2],
    arrays3: List[T3],
    iteratee: js.Function3[/* value1 */ T, /* value2 */ T2, /* value3 */ T3, TResult]
  ): Collection[TResult] = js.native
}
