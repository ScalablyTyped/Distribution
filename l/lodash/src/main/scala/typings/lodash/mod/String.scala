package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String
  extends StObject
     with LoDashImplicitWrapper[java.lang.String] {
  
  /**
    * @see _.castArray
    */
  def castArray(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): StringChain = js.native
  
  /**
    * @see _.countBy
    */
  def countBy(): Object[Dictionary[Double]] = js.native
  def countBy(iteratee: ValueIteratee[java.lang.String]): Object[Dictionary[Double]] = js.native
  
  /**
    * @see _.each
    */
  def each(): String = js.native
  def each(iteratee: StringIterator[Any]): String = js.native
  
  /**
    * @see _.eachRight
    */
  def eachRight(): String = js.native
  def eachRight(iteratee: StringIterator[Any]): String = js.native
  /**
    * @see _.eachRight
    */
  @JSName("eachRight")
  var eachRight_Original: js.Function1[/* iteratee */ js.UndefOr[StringIterator[Any]], String] = js.native
  
  /**
    * @see _.each
    */
  @JSName("each")
  var each_Original: js.Function1[/* iteratee */ js.UndefOr[StringIterator[Any]], String] = js.native
  
  /**
    * @see _.filter
    */
  def filter(): Collection[java.lang.String] = js.native
  def filter(predicate: StringIterator[Boolean]): Collection[java.lang.String] = js.native
  
  /**
    * @see _.first
    */
  def first(): js.UndefOr[java.lang.String] = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): Collection[java.lang.String] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[TResult](iteratee: StringIterator[Many[TResult]]): Collection[TResult] = js.native
  
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(): Collection[java.lang.String] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[TResult](iteratee: StringIterator[ListOfRecursiveArraysOrValues[TResult] | TResult]): Collection[TResult] = js.native
  
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(): Collection[java.lang.String] = js.native
  def flatMapDepth(depth: Double): Collection[java.lang.String] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[TResult](iteratee: StringIterator[ListOfRecursiveArraysOrValues[TResult] | TResult]): Collection[TResult] = js.native
  def flatMapDepth[TResult](iteratee: StringIterator[ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): Collection[TResult] = js.native
  
  /**
    * @see _.flatten
    */
  def flatten(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(): String = js.native
  def forEach(iteratee: StringIterator[Any]): String = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(): String = js.native
  def forEachRight(iteratee: StringIterator[Any]): String = js.native
  
  def get(path: js.Array[Double]): java.lang.String = js.native
  def get(path: js.Array[Double], defaultValue: java.lang.String): java.lang.String = js.native
  /**
    * @see _.get
    */
  def get(path: Double): java.lang.String = js.native
  /**
    * @see _.get
    */
  def get(path: Double, defaultValue: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.groupBy
    */
  def groupBy(): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  def groupBy(iteratee: ValueIteratee[java.lang.String]): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.head
    */
  def head(): js.UndefOr[java.lang.String] = js.native
  
  /**
    * @see _.includes
    */
  def includes(target: java.lang.String): Boolean = js.native
  def includes(target: java.lang.String, fromIndex: Double): Boolean = js.native
  
  /**
    * @see _.invertBy
    */
  def invertBy(): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy(iteratee: ValueIteratee[java.lang.String]): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): Function[js.Function1[/* o */ js.Object, Any]] = js.native
  
  /**
    * @see _.join
    */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.keyBy
    */
  def keyBy(): Object[Dictionary[java.lang.String]] = js.native
  def keyBy(iteratee: ValueIterateeCustom[java.lang.String, PropertyName]): Object[Dictionary[java.lang.String]] = js.native
  
  /**
    * @see _.last
    */
  def last(): js.UndefOr[java.lang.String] = js.native
  
  /**
    * @see _.map
    */
  def map(): Collection[java.lang.String] = js.native
  /**
    * @see _.map
    */
  def map[TResult](iteratee: StringIterator[TResult]): Collection[TResult] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): Object[NumericDictionary[java.lang.String]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](callback: StringIterator[TResult]): Object[NumericDictionary[TResult]] = js.native
  
  /**
    * @see _.partition
    */
  def partition(callback: StringIterator[NotVoid]): LoDashImplicitWrapper[js.Tuple2[js.Array[java.lang.String], js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.reject
    */
  def reject(): Collection[java.lang.String] = js.native
  def reject(predicate: StringIterator[Boolean]): Collection[java.lang.String] = js.native
  
  /**
    * @see _.sample
    */
  def sample(): js.UndefOr[java.lang.String] = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize(): Collection[java.lang.String] = js.native
  def sampleSize(n: Double): Collection[java.lang.String] = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.values
    */
  def values(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.valuesIn
    */
  def valuesIn(): Collection[java.lang.String] = js.native
}
