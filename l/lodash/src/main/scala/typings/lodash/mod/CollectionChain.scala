package typings.lodash.mod

import typings.lodash.lodashBooleans.`true`
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionChain[T]
  extends StObject
     with LoDashExplicitWrapper[js.Array[T]] {
  
  /**
    * @see _.at
    */
  def at(props: PropertyPath*): CollectionChain[T] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): CollectionChain[T] = js.native
  
  /**
    * @see _.chunk
    */
  def chunk(): CollectionChain[js.Array[T]] = js.native
  def chunk(size: Double): CollectionChain[js.Array[T]] = js.native
  
  /**
    * @see _.compact
    */
  def compact(): CollectionChain[Truthy[T]] = js.native
  
  /**
    * @see _.concat
    */
  def concat(values: Many[T]*): CollectionChain[T] = js.native
  
  /**
    * @see _.countBy
    */
  def countBy(): ObjectChain[Dictionary[Double]] = js.native
  def countBy(iteratee: ValueIteratee[T]): ObjectChain[Dictionary[Double]] = js.native
  
  /**
    * @see _.difference
    */
  def difference(values: typings.lodash.mod.List[T]*): CollectionChain[T] = js.native
  
  /**
    * @see _.differenceBy
    */
  def differenceBy(values: (typings.lodash.mod.List[Any] | ValueIteratee[T])*): CollectionChain[T] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T2](values1: typings.lodash.mod.List[T2]): CollectionChain[T] = js.native
  def differenceBy[T2](values1: typings.lodash.mod.List[T2], iteratee: ValueIteratee[T | T2]): CollectionChain[T] = js.native
  
  /**
    * @see _.differenceWith
    */
  def differenceWith[T2](values: typings.lodash.mod.List[T2], comparator: Comparator2[T, T2]): CollectionChain[T] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T2, T3, T4](values: (typings.lodash.mod.List[Any] | (Comparator2[T, scala.Nothing]))*): CollectionChain[T] = js.native
  
  /**
    * @see _.drop
    */
  def drop(): CollectionChain[T] = js.native
  def drop(n: Double): CollectionChain[T] = js.native
  
  /**
    * @see _.dropRight
    */
  def dropRight(): CollectionChain[T] = js.native
  def dropRight(n: Double): CollectionChain[T] = js.native
  
  /**
    * @see _.dropRightWhile
    */
  def dropRightWhile(): CollectionChain[T] = js.native
  def dropRightWhile(predicate: ListIteratee[T]): CollectionChain[T] = js.native
  
  /**
    * @see _.dropWhile
    */
  def dropWhile(): CollectionChain[T] = js.native
  def dropWhile(predicate: ListIteratee[T]): CollectionChain[T] = js.native
  
  /**
    * @see _.each
    */
  def each(): CollectionChain[T] = js.native
  def each(iteratee: ListIterator[T, Any]): CollectionChain[T] = js.native
  
  /**
    * @see _.eachRight
    */
  def eachRight(): CollectionChain[T] = js.native
  def eachRight(iteratee: ListIterator[T, Any]): CollectionChain[T] = js.native
  /**
    * @see _.eachRight
    */
  @JSName("eachRight")
  var eachRight_Original: js.Function1[/* iteratee */ js.UndefOr[ListIterator[T, Any]], CollectionChain[T]] = js.native
  
  /**
    * @see _.each
    */
  @JSName("each")
  var each_Original: js.Function1[/* iteratee */ js.UndefOr[ListIterator[T, Any]], CollectionChain[T]] = js.native
  
  /**
    * @see _.every
    */
  def every(): PrimitiveChain[Boolean] = js.native
  def every(predicate: ListIterateeCustom[T, Boolean]): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.fill
    */
  def fill[U](value: U): CollectionChain[T | U] = js.native
  def fill[U](value: U, start: Double): CollectionChain[T | U] = js.native
  def fill[U](value: U, start: Double, end: Double): CollectionChain[T | U] = js.native
  def fill[U](value: U, start: Unit, end: Double): CollectionChain[T | U] = js.native
  
  /**
    * @see _.filter
    */
  def filter(): CollectionChain[T] = js.native
  def filter(predicate: ListIterateeCustom[T, Boolean]): CollectionChain[T] = js.native
  /**
    * @see _.filter
    */
  def filter[S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): CollectionChain[S] = js.native
  
  /**
    * @see _.find
    */
  def find(): ExpChain[js.UndefOr[T]] = js.native
  def find(predicate: Unit, fromIndex: Double): ExpChain[js.UndefOr[T]] = js.native
  def find(predicate: ListIterateeCustom[T, Boolean]): ExpChain[js.UndefOr[T]] = js.native
  def find(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): ExpChain[js.UndefOr[T]] = js.native
  /**
    * @see _.find
    */
  def find[S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): ExpChain[js.UndefOr[S]] = js.native
  def find[S /* <: T */](predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): ExpChain[js.UndefOr[S]] = js.native
  
  /**
    * @see _.findIndex
    */
  def findIndex(): PrimitiveChain[Double] = js.native
  def findIndex(predicate: Unit, fromIndex: Double): PrimitiveChain[Double] = js.native
  def findIndex(predicate: ListIterateeCustom[T, Boolean]): PrimitiveChain[Double] = js.native
  def findIndex(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.findLast
    */
  def findLast(): ExpChain[js.UndefOr[T]] = js.native
  def findLast(predicate: Unit, fromIndex: Double): ExpChain[js.UndefOr[T]] = js.native
  def findLast(predicate: ListIterateeCustom[T, Boolean]): ExpChain[js.UndefOr[T]] = js.native
  def findLast(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): ExpChain[js.UndefOr[T]] = js.native
  /**
    * @see _.findLast
    */
  def findLast[S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): ExpChain[js.UndefOr[S]] = js.native
  def findLast[S /* <: T */](predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): ExpChain[js.UndefOr[S]] = js.native
  
  /**
    * @see _.findLastIndex
    */
  def findLastIndex(): PrimitiveChain[Double] = js.native
  def findLastIndex(predicate: Unit, fromIndex: Double): PrimitiveChain[Double] = js.native
  def findLastIndex(predicate: ListIterateeCustom[T, Boolean]): PrimitiveChain[Double] = js.native
  def findLastIndex(predicate: ListIterateeCustom[T, Boolean], fromIndex: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.first
    */
  def first(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.Many<infer U> ? lodash.lodash.CollectionChain<U> : lodash.lodash.CollectionChain<T> */ js.Any = js.native
  def flatMap(iteratee: js.Object): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Tuple2[PropertyName, Any]): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[TResult](iteratee: ListIterator[T, Many[TResult]]): CollectionChain[TResult] = js.native
  def flatMap[TResult](iteratee: PropertyName): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(): CollectionChain[T] = js.native
  def flatMapDeep(iteratee: js.Object): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(iteratee: js.Tuple2[PropertyName, Any]): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): CollectionChain[TResult] = js.native
  def flatMapDeep[TResult](iteratee: PropertyName): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(): CollectionChain[T] = js.native
  def flatMapDepth(depth: Double): CollectionChain[T] = js.native
  def flatMapDepth(iteratee: js.Object): CollectionChain[Boolean] = js.native
  def flatMapDepth(iteratee: js.Object, depth: Double): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, Any]): CollectionChain[Boolean] = js.native
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, Any], depth: Double): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): CollectionChain[TResult] = js.native
  def flatMapDepth[TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): CollectionChain[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName): CollectionChain[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName, depth: Double): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatten
    */
  def flatten(): /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.Many<infer U> ? lodash.lodash.CollectionChain<U> : lodash.lodash.CollectionChain<T> */ js.Any = js.native
  
  /**
    * @see _.flattenDeep
    */
  def flattenDeep(): /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.ListOfRecursiveArraysOrValues<infer U> ? lodash.lodash.CollectionChain<lodash.lodash.Flat<U>> : lodash.lodash.CollectionChain<T> */ js.Any = js.native
  
  /**
    * @see _.flattenDepth
    */
  def flattenDepth(): CollectionChain[T] = js.native
  def flattenDepth(depth: Double): CollectionChain[T] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(): CollectionChain[T] = js.native
  def forEach(iteratee: ListIterator[T, Any]): CollectionChain[T] = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(): CollectionChain[T] = js.native
  def forEachRight(iteratee: ListIterator[T, Any]): CollectionChain[T] = js.native
  
  /**
    * @see _.fromPairs
    */
  def fromPairs(): ObjectChain[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends [lodash.lodash.PropertyName, infer U] ? U : any */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.get
    */
  def get(path: Double): ExpChain[T] = js.native
  /**
    * @see _.get
    */
  def get[TDefault](path: Double, defaultValue: TDefault): ExpChain[T | TDefault] = js.native
  
  /**
    * @see _.groupBy
    */
  def groupBy(): ObjectChain[Dictionary[js.Array[T]]] = js.native
  def groupBy(iteratee: ValueIteratee[T]): ObjectChain[Dictionary[js.Array[T]]] = js.native
  
  /**
    * @see _.head
    */
  def head(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.includes
    */
  def includes(target: T): PrimitiveChain[Boolean] = js.native
  def includes(target: T, fromIndex: Double): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.indexOf
    */
  def indexOf(value: T): PrimitiveChain[Double] = js.native
  def indexOf(value: T, fromIndex: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.initial
    */
  def initial(): CollectionChain[T] = js.native
  
  /**
    * @see _.intersection
    */
  def intersection(arrays: (js.UndefOr[typings.lodash.mod.List[T] | Null])*): CollectionChain[T] = js.native
  
  /**
    * @see _.intersectionBy
    */
  def intersectionBy(values: (typings.lodash.mod.List[Any] | ValueIteratee[T])*): CollectionChain[T] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T2](values: typings.lodash.mod.List[T2], iteratee: ValueIteratee[T | T2]): CollectionChain[T] = js.native
  
  /**
    * @see _.intersectionWith
    */
  def intersectionWith(values: (typings.lodash.mod.List[Any] | (Comparator2[T, scala.Nothing]))*): CollectionChain[T] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T2](values: typings.lodash.mod.List[T2], comparator: Comparator2[T, T2]): CollectionChain[T] = js.native
  
  /**
    * @see _.invertBy
    */
  def invertBy(): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy(iteratee: ValueIteratee[T]): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): FunctionChain[js.Function1[/* o */ js.Object, Boolean]] = js.native
  
  /**
    * @see _.join
    */
  def join(): StringChain = js.native
  def join(separator: java.lang.String): StringChain = js.native
  
  /**
    * @see _.keyBy
    */
  def keyBy(): ObjectChain[Dictionary[T]] = js.native
  def keyBy(iteratee: ValueIterateeCustom[T, PropertyName]): ObjectChain[Dictionary[T]] = js.native
  
  /**
    * @see _.last
    */
  def last(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.lastIndexOf
    */
  def lastIndexOf(value: T): PrimitiveChain[Double] = js.native
  def lastIndexOf(value: T, fromIndex: Double): PrimitiveChain[Double] = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true(value: T, fromIndex: `true`): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.map
    */
  def map(): CollectionChain[T] = js.native
  def map(iteratee: js.Object): CollectionChain[Boolean] = js.native
  /**
    * @see _.map
    */
  def map(iteratee: js.Tuple2[PropertyName, Any]): CollectionChain[Boolean] = js.native
  /**
    * @see _.map
    */
  def map(iteratee: PropertyName): CollectionChain[Any] = js.native
  /**
    * @see _.map
    */
  def map[TResult](iteratee: ListIterator[T, TResult]): CollectionChain[TResult] = js.native
  
  /**
    * @see _.mapKeys
    */
  def mapKeys(): ObjectChain[Dictionary[T]] = js.native
  def mapKeys(iteratee: ListIteratee[T]): ObjectChain[Dictionary[T]] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): ObjectChain[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: java.lang.String): ObjectChain[Dictionary[Any]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: js.Object): ObjectChain[Dictionary[Boolean]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](callback: DictionaryIterator[T, TResult]): ObjectChain[Dictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey): ObjectChain[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.map
    */
  @JSName("map")
  def map_K[K /* <: /* keyof T */ java.lang.String */](key: K): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  /**
    * @see _.max
    */
  def max(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.maxBy
    */
  def maxBy(): ExpChain[js.UndefOr[T]] = js.native
  def maxBy(iteratee: ValueIteratee[T]): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.meanBy
    */
  def meanBy(): PrimitiveChain[Double] = js.native
  def meanBy(iteratee: ValueIteratee[T]): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.min
    */
  def min(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.minBy
    */
  def minBy(): ExpChain[js.UndefOr[T]] = js.native
  def minBy(iteratee: ValueIteratee[T]): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.nth
    */
  def nth(): ExpChain[js.UndefOr[T]] = js.native
  def nth(n: Double): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.omit
    */
  def omit(paths: Many[PropertyName]*): CollectionChain[T] = js.native
  
  /**
    * @see _.omitBy
    */
  def omitBy(): ObjectChain[Dictionary[T]] = js.native
  def omitBy(predicate: ValueKeyIteratee[T]): ObjectChain[Dictionary[T]] = js.native
  
  /**
    * @see _.orderBy
    */
  def orderBy(): CollectionChain[T] = js.native
  def orderBy(iteratees: Unit, orders: Many[Boolean | asc | desc]): CollectionChain[T] = js.native
  def orderBy(iteratees: Many[(ListIterator[T, NotVoid]) | PropertyName | PartialShallow[T]]): CollectionChain[T] = js.native
  def orderBy(
    iteratees: Many[(ListIterator[T, NotVoid]) | PropertyName | PartialShallow[T]],
    orders: Many[Boolean | asc | desc]
  ): CollectionChain[T] = js.native
  
  /**
    * @see _.over
    */
  def over[TResult](iteratees: (Many[js.Function1[/* repeated */ Any, TResult]])*): FunctionChain[js.Function1[/* repeated */ Any, js.Array[TResult]]] = js.native
  
  /**
    * @see _.overEvery
    */
  def overEvery[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): FunctionChain[js.Function1[/* repeated */ TArgs, Boolean]] = js.native
  
  /**
    * @see _.overSome
    */
  def overSome[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): FunctionChain[js.Function1[/* repeated */ TArgs, Boolean]] = js.native
  
  /**
    * @see _.partition
    */
  def partition(callback: ValueIteratee[T]): LoDashExplicitWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  /**
    * @see _.partition
    */
  def partition[U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): LoDashExplicitWrapper[js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]] = js.native
  
  /**
    * @see _.pickBy
    */
  def pickBy(): ObjectChain[Dictionary[T]] = js.native
  def pickBy(predicate: ValueKeyIteratee[T]): ObjectChain[Dictionary[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): ObjectChain[Dictionary[S]] = js.native
  
  def pop(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.pull
    */
  def pull(values: T*): CollectionChain[T] = js.native
  
  /**
    * @see _.pullAll
    */
  def pullAll(): CollectionChain[T] = js.native
  def pullAll(values: typings.lodash.mod.List[T]): CollectionChain[T] = js.native
  
  /**
    * @see _.pullAllBy
    */
  def pullAllBy[T2](): CollectionChain[T] = js.native
  def pullAllBy[T2](values: Unit, iteratee: ValueIteratee[T | T2]): CollectionChain[T] = js.native
  def pullAllBy[T2](values: typings.lodash.mod.List[T2]): CollectionChain[T] = js.native
  def pullAllBy[T2](values: typings.lodash.mod.List[T2], iteratee: ValueIteratee[T | T2]): CollectionChain[T] = js.native
  
  /**
    * @see _.pullAllWith
    */
  def pullAllWith[T2](): CollectionChain[T] = js.native
  def pullAllWith[T2](values: Unit, comparator: Comparator2[T, T2]): CollectionChain[T] = js.native
  def pullAllWith[T2](values: typings.lodash.mod.List[T2]): CollectionChain[T] = js.native
  def pullAllWith[T2](values: typings.lodash.mod.List[T2], comparator: Comparator2[T, T2]): CollectionChain[T] = js.native
  
  /**
    * @see _.pullAt
    */
  def pullAt(indexes: Many[Double]*): CollectionChain[T] = js.native
  
  def push(items: T*): this.type = js.native
  
  /**
    * @see _.reduce
    */
  def reduce(callback: MemoListIterator[T, T, typings.lodash.mod.List[T]]): ExpChain[js.UndefOr[T]] = js.native
  /**
    * @see _.reduce
    */
  def reduce[TResult](callback: MemoListIterator[T, TResult, typings.lodash.mod.List[T]], accumulator: TResult): ExpChain[TResult] = js.native
  
  /**
    * @see _.reduceRight
    */
  def reduceRight(callback: MemoListIterator[T, T, typings.lodash.mod.List[T]]): ExpChain[js.UndefOr[T]] = js.native
  /**
    * @see _.reduceRight
    */
  def reduceRight[TResult](callback: MemoListIterator[T, TResult, typings.lodash.mod.List[T]], accumulator: TResult): ExpChain[TResult] = js.native
  
  /**
    * @see _.reject
    */
  def reject(): CollectionChain[T] = js.native
  def reject(predicate: ListIterateeCustom[T, Boolean]): CollectionChain[T] = js.native
  
  /**
    * @see _.remove
    */
  def remove(): CollectionChain[T] = js.native
  def remove(predicate: ListIteratee[T]): CollectionChain[T] = js.native
  
  /**
    * @see _.sample
    */
  def sample(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize(): CollectionChain[T] = js.native
  def sampleSize(n: Double): CollectionChain[T] = js.native
  
  def shift(): ExpChain[js.UndefOr[T]] = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle(): CollectionChain[T] = js.native
  
  /**
    * @see _.slice
    */
  def slice(): CollectionChain[T] = js.native
  def slice(start: Double): CollectionChain[T] = js.native
  def slice(start: Double, end: Double): CollectionChain[T] = js.native
  def slice(start: Unit, end: Double): CollectionChain[T] = js.native
  
  /**
    * @see _.some
    */
  def some(): PrimitiveChain[Boolean] = js.native
  def some(predicate: ListIterateeCustom[T, Boolean]): PrimitiveChain[Boolean] = js.native
  
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): this.type = js.native
  
  /**
    * @see _.sortBy
    */
  def sortBy(iteratees: Many[ListIteratee[T]]*): CollectionChain[T] = js.native
  
  /**
    * @see _.sortedIndex
    */
  def sortedIndex(value: T): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.sortedIndexBy
    */
  def sortedIndexBy(value: T): PrimitiveChain[Double] = js.native
  def sortedIndexBy(value: T, iteratee: ValueIteratee[T]): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.sortedIndexOf
    */
  def sortedIndexOf(value: T): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.sortedLastIndex
    */
  def sortedLastIndex(value: T): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.sortedLastIndexBy
    */
  def sortedLastIndexBy(value: T, iteratee: ValueIteratee[T]): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.sortedLastIndexOf
    */
  def sortedLastIndexOf(value: T): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.sortedUniq
    */
  def sortedUniq(): CollectionChain[T] = js.native
  
  /**
    * @see _.sortedUniqBy
    */
  def sortedUniqBy(iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  
  def splice(start: Double, deleteCount: Double, items: T*): this.type = js.native
  def splice(start: Double, deleteCount: Unit, items: T*): this.type = js.native
  
  /**
    * @see _.sumBy
    */
  def sumBy(): PrimitiveChain[Double] = js.native
  def sumBy(iteratee: java.lang.String): PrimitiveChain[Double] = js.native
  def sumBy(iteratee: js.Function1[/* value */ T, Double]): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.tail
    */
  def tail(): CollectionChain[T] = js.native
  
  /**
    * @see _.take
    */
  def take(): CollectionChain[T] = js.native
  def take(n: Double): CollectionChain[T] = js.native
  
  /**
    * @see _.takeRight
    */
  def takeRight(): CollectionChain[T] = js.native
  def takeRight(n: Double): CollectionChain[T] = js.native
  
  /**
    * @see _.takeRightWhile
    */
  def takeRightWhile(): CollectionChain[T] = js.native
  def takeRightWhile(predicate: ListIteratee[T]): CollectionChain[T] = js.native
  
  /**
    * @see _.takeWhile
    */
  def takeWhile(): CollectionChain[T] = js.native
  def takeWhile(predicate: ListIteratee[T]): CollectionChain[T] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): CollectionChain[T] = js.native
  
  /**
    * @see _.transform
    */
  def transform(): CollectionChain[Any] = js.native
  /**
    * @see _.transform
    */
  def transform[TResult](iteratee: MemoVoidArrayIterator[T, TResult]): ExpChain[TResult] = js.native
  def transform[TResult](iteratee: MemoVoidArrayIterator[T, TResult], accumulator: TResult): ExpChain[TResult] = js.native
  
  /**
    * @see _.union
    */
  def union(arrays: (js.UndefOr[typings.lodash.mod.List[T] | Null])*): CollectionChain[T] = js.native
  
  /**
    * @see _.unionBy
    */
  def unionBy(): CollectionChain[T] = js.native
  def unionBy(arrays2: Null, iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  def unionBy(arrays2: Unit, iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  def unionBy(arrays2: typings.lodash.mod.List[T]): CollectionChain[T] = js.native
  def unionBy(arrays2: typings.lodash.mod.List[T], iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy(iteratee: (js.UndefOr[ValueIteratee[T] | typings.lodash.mod.List[T] | Null])*): CollectionChain[T] = js.native
  
  /**
    * @see _.unionWith
    */
  def unionWith(): CollectionChain[T] = js.native
  def unionWith(arrays2: Null, comparator: Comparator[T]): CollectionChain[T] = js.native
  def unionWith(arrays2: Unit, comparator: Comparator[T]): CollectionChain[T] = js.native
  def unionWith(arrays2: typings.lodash.mod.List[T]): CollectionChain[T] = js.native
  def unionWith(arrays2: typings.lodash.mod.List[T], comparator: Comparator[T]): CollectionChain[T] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith(comparator: (js.UndefOr[Comparator[T] | typings.lodash.mod.List[T] | Null])*): CollectionChain[T] = js.native
  
  /**
    * @see _.uniq
    */
  def uniq(): CollectionChain[T] = js.native
  
  /**
    * @see _.uniqBy
    */
  def uniqBy(iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  
  /**
    * @see _.uniqWith
    */
  def uniqWith(): CollectionChain[T] = js.native
  def uniqWith(comparator: Comparator[T]): CollectionChain[T] = js.native
  
  def unshift(items: T*): this.type = js.native
  
  /**
    * @see _.unzip
    */
  def unzip(): /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.List<infer U> ? lodash.lodash.CollectionChain<std.Array<U>> : unknown */ js.Any = js.native
  
  /**
    * @see _.unzipWith
    */
  def unzipWith(): /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.List<infer U> ? lodash.lodash.CollectionChain<std.Array<U>> : unknown */ js.Any = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.List<infer U> ? U : unknown */ /* repeated */ js.Any, 
      TResult
    ]
  ): CollectionChain[TResult] = js.native
  
  /**
    * @see _.without
    */
  def without(values: T*): CollectionChain[T] = js.native
  
  /**
    * @see _.xor
    */
  def xor(arrays: (js.UndefOr[typings.lodash.mod.List[T] | Null])*): CollectionChain[T] = js.native
  
  /**
    * @see _.xorBy
    */
  def xorBy(): CollectionChain[T] = js.native
  def xorBy(arrays2: Null, iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  def xorBy(arrays2: Unit, iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  def xorBy(arrays2: typings.lodash.mod.List[T]): CollectionChain[T] = js.native
  def xorBy(arrays2: typings.lodash.mod.List[T], iteratee: ValueIteratee[T]): CollectionChain[T] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy(iteratee: (js.UndefOr[ValueIteratee[T] | typings.lodash.mod.List[T] | Null])*): CollectionChain[T] = js.native
  
  /**
    * @see _.xorWith
    */
  def xorWith(): CollectionChain[T] = js.native
  def xorWith(arrays2: Null, comparator: Comparator[T]): CollectionChain[T] = js.native
  def xorWith(arrays2: Unit, comparator: Comparator[T]): CollectionChain[T] = js.native
  def xorWith(arrays2: typings.lodash.mod.List[T]): CollectionChain[T] = js.native
  def xorWith(arrays2: typings.lodash.mod.List[T], comparator: Comparator[T]): CollectionChain[T] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith(comparator: (js.UndefOr[Comparator[T] | typings.lodash.mod.List[T] | Null])*): CollectionChain[T] = js.native
  
  /**
    * @see _.zip
    */
  def zip(arrays: (js.UndefOr[typings.lodash.mod.List[T] | Null])*): CollectionChain[js.Array[js.UndefOr[T]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T2](arrays2: typings.lodash.mod.List[T2]): CollectionChain[js.Tuple2[js.UndefOr[T], js.UndefOr[T2]]] = js.native
  
  /**
    * @see _.zipObject
    */
  def zipObject(): ObjectChain[Dictionary[Unit]] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject[U](values: typings.lodash.mod.List[U]): ObjectChain[Dictionary[U]] = js.native
  
  /**
    * @see _.zipObjectDeep
    */
  def zipObjectDeep(): ObjectChain[js.Object] = js.native
  def zipObjectDeep(values: typings.lodash.mod.List[Any]): ObjectChain[js.Object] = js.native
  
  /**
    * @see _.zipWith
    */
  def zipWith[TResult](
    iteratee: (js.UndefOr[(js.Function1[/* repeated */ T, TResult]) | typings.lodash.mod.List[T] | Null])*
  ): CollectionChain[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T2, TResult](
    arrays2: typings.lodash.mod.List[T2],
    iteratee: js.Function2[/* value1 */ T, /* value2 */ T2, TResult]
  ): CollectionChain[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T2, T3, TResult](
    arrays2: typings.lodash.mod.List[T2],
    arrays3: typings.lodash.mod.List[T3],
    iteratee: js.Function3[/* value1 */ T, /* value2 */ T2, /* value3 */ T3, TResult]
  ): CollectionChain[TResult] = js.native
}
