package typings.lodash.mod

import org.scalablytyped.runtime.TopLevel
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object[T]
  extends StObject
     with LoDashImplicitWrapper[T]
     with _ImpChain[T] {
  
  /**
    * @see _.assign
    */
  def assign(): Object[T] = js.native
  /**
    * @see _.assign
    */
  def assign(otherArgs: Any*): Object[Any] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource](source: TSource): Object[T & TSource] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.assignIn
    */
  def assignIn(): Object[T] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TResult](otherArgs: Any*): Object[TResult] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource](source: TSource): Object[T & TSource] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.assignInWith
    */
  def assignInWith(): Object[T] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TResult](otherArgs: Any*): Object[TResult] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource](source: TSource, customizer: AssignCustomizer): Object[T & TSource] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.assignWith
    */
  def assignWith(): Object[T] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TResult](otherArgs: Any*): Object[TResult] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource](source: TSource, customizer: AssignCustomizer): Object[T & TSource] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.at
    */
  def at(props: (Many[/* keyof T */ java.lang.String])*): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): Collection[T] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): ObjectChain[T] = js.native
  
  /**
    * @see _.concat
    */
  def concat(values: Many[T]*): Collection[T] = js.native
  
  /**
    * @see _.countBy
    */
  def countBy(): Object[Dictionary[Double]] = js.native
  def countBy(
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Object[Dictionary[Double]] = js.native
  
  /**
    * @see _.create
    */
  def create[U /* <: js.Object */](): Object[T & U] = js.native
  def create[U /* <: js.Object */](properties: U): Object[T & U] = js.native
  
  /**
    * @see _.defaults
    */
  def defaults(): Object[NonNullable[T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults(sources: Any*): Object[Any] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource](source: TSource): Object[NonNullable[TSource & T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): Object[NonNullable[TSource2 & TSource1 & T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): Object[NonNullable[TSource3 & TSource2 & TSource1 & T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): Object[NonNullable[TSource4 & TSource3 & TSource2 & TSource1 & T]] = js.native
  
  /**
    * @see _.defaultsDeep
    */
  def defaultsDeep(sources: Any*): Object[Any] = js.native
  
  /**
    * @see _.each
    */
  def each(): Object[T] = js.native
  def each(iteratee: ObjectIterator[T, Any]): Object[T] = js.native
  
  /**
    * @see _.eachRight
    */
  def eachRight(): Object[T] = js.native
  def eachRight(iteratee: ObjectIterator[T, Any]): Object[T] = js.native
  /**
    * @see _.eachRight
    */
  @JSName("eachRight")
  var eachRight_Original: js.Function1[/* iteratee */ js.UndefOr[ObjectIterator[T, Any]], Object[T]] = js.native
  
  /**
    * @see _.each
    */
  @JSName("each")
  var each_Original: js.Function1[/* iteratee */ js.UndefOr[ObjectIterator[T, Any]], Object[T]] = js.native
  
  /**
    * @see _.every
    */
  def every(): Boolean = js.native
  def every(predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  
  /**
    * @see _.extend
    */
  def extend(): Object[T] = js.native
  /**
    * @see _.extend
    */
  def extend(otherArgs: Any*): Object[Any] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource](source: TSource): Object[T & TSource] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.extendWith
    */
  def extendWith(): Object[T] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(otherArgs: Any*): Object[Any] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource](source: TSource, customizer: AssignCustomizer): Object[T & TSource] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.filter
    */
  def filter(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter(predicate: ObjectIterateeCustom[T, Boolean]): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.filter
    */
  def filter[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): Collection[S] = js.native
  
  /**
    * @see _.find
    */
  def find(): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find(predicate: Unit, fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find(predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find(predicate: ObjectIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.find
    */
  def find[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def find[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  
  /**
    * @see _.findLast
    */
  def findLast(): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast(predicate: Unit, fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast(predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast(predicate: ObjectIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.findLast
    */
  def findLast[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def findLast[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def flatMap(iteratee: js.Object): Collection[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Tuple2[PropertyName, Any]): Collection[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[TResult](iteratee: ObjectIterator[T, Many[TResult]]): Collection[TResult] = js.native
  def flatMap[TResult](iteratee: PropertyName): Collection[TResult] = js.native
  
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def flatMapDeep(iteratee: js.Object): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(iteratee: js.Tuple2[PropertyName, Any]): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): Collection[TResult] = js.native
  def flatMapDeep[TResult](iteratee: PropertyName): Collection[TResult] = js.native
  
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def flatMapDepth(depth: Double): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def flatMapDepth(iteratee: js.Object): Collection[Boolean] = js.native
  def flatMapDepth(iteratee: js.Object, depth: Double): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, Any]): Collection[Boolean] = js.native
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, Any], depth: Double): Collection[Boolean] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): Collection[TResult] = js.native
  def flatMapDepth[TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): Collection[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName): Collection[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName, depth: Double): Collection[TResult] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(): Object[T] = js.native
  def forEach(iteratee: ObjectIterator[T, Any]): Object[T] = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(): Object[T] = js.native
  def forEachRight(iteratee: ObjectIterator[T, Any]): Object[T] = js.native
  
  /**
    * @see _.get
    */
  def get(path: PropertyPath): Any = js.native
  def get(path: PropertyPath, defaultValue: Any): Any = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: js.Array[TKey]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */, TDefault](path: js.Array[TKey], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2] */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TDefault](path: js.Tuple2[TKey1, TKey2], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3] */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TDefault](path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3][TKey4] */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2][TKey3] */ js.Any */, TDefault](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TKeyTDefault_Union[TKey /* <: /* keyof T */ java.lang.String */, TDefault](path: TKey, defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TKey_Any[TKey /* <: /* keyof T */ java.lang.String */](path: TKey): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any = js.native
  
  /**
    * @see _.groupBy
    */
  def groupBy(): Object[
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  def groupBy(
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Object[
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  
  /**
    * @see _.includes
    */
  def includes(target: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Boolean = js.native
  def includes(
    target: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    fromIndex: Double
  ): Boolean = js.native
  
  /**
    * @see _.invertBy
    */
  def invertBy(): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy(
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Object[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): Function[js.Function1[/* o */ T, Boolean]] = js.native
  
  /**
    * @see _.keyBy
    */
  def keyBy(): Object[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def keyBy(
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): Object[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.map
    */
  def map(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def map(iteratee: js.Object): Collection[Boolean] = js.native
  /**
    * @see _.map
    */
  def map(iteratee: js.Tuple2[PropertyName, Any]): Collection[Boolean] = js.native
  /**
    * @see _.map
    */
  def map(iteratee: PropertyName): Collection[Any] = js.native
  /**
    * @see _.map
    */
  def map[TResult](iteratee: ObjectIterator[T, TResult]): Collection[TResult] = js.native
  
  /**
    * @see _.mapKeys
    */
  def mapKeys(): Object[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def mapKeys(iteratee: ObjectIteratee[T]): Object[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): Object[T] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: java.lang.String): Object[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typings.lodash.lodashStrings.Object & TopLevel[Any]
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: js.Object): Object[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typings.lodash.lodashStrings.Object & TopLevel[Any]
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](
    callback: (DictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]) | (ObjectIterator[T, TResult])
  ): Object[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typings.lodash.lodashStrings.Object & TopLevel[Any]
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[keyof T] */ js.Any */](iteratee: TKey): Object[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T][TKey] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.map
    */
  @JSName("map")
  def map_K[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[keyof T] */ js.Any */](key: K): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T][K] */ js.Any
  ] = js.native
  
  /**
    * @see _.merge
    */
  def merge(otherArgs: Any*): Object[Any] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource](source: TSource): Object[T & TSource] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.mergeWith
    */
  def mergeWith(otherArgs: Any*): Object[Any] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource](source: TSource, customizer: MergeWithCustomizer): Object[T & TSource] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): Object[T & TSource1 & TSource2] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: MergeWithCustomizer): Object[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): Object[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.omit
    */
  def omit(paths: (Many[PropertyName | IterateeShorthand[T]])*): Object[PartialObject[T]] = js.native
  
  /**
    * @see _.omitBy
    */
  def omitBy(
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Object[PartialObject[T]] = js.native
  
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_K[K /* <: /* keyof T */ java.lang.String */](paths: Many[K]*): Object[Omit[T, K]] = js.native
  
  /**
    * @see _.orderBy
    */
  def orderBy(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: Unit, orders: Many[Boolean | asc | desc]): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: Many[ObjectIterator[T, NotVoid]]): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: Many[ObjectIterator[T, NotVoid]], orders: Many[Boolean | asc | desc]): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.partition
    */
  def partition(
    callback: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashImplicitWrapper[
    js.Tuple2[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ], 
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  
  /**
    * @see _.pick
    */
  def pick(props: Many[PropertyPath]*): Object[PartialObject[T]] = js.native
  
  /**
    * @see _.pickBy
    */
  def pickBy(): Object[
    PartialObject[T] | (NumericDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]) | (Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ])
  ] = js.native
  def pickBy(
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Object[
    PartialObject[T] | (NumericDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]) | (Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ])
  ] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueKeyIterateeTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): Object[Dictionary[S] | NumericDictionary[S]] = js.native
  
  /**
    * @see _.pick
    */
  @JSName("pick")
  def pick_U[U /* <: /* keyof T */ java.lang.String */](props: Many[U]*): Object[Pick[T, U]] = js.native
  
  /**
    * @see _.reduce
    */
  def reduce(
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.reduce
    */
  def reduce[TResult](
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  
  /**
    * @see _.reduceRight
    */
  def reduceRight(
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.reduceRight
    */
  def reduceRight[TResult](
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  
  /**
    * @see _.reject
    */
  def reject(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reject(predicate: ObjectIterateeCustom[T, Boolean]): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.sample
    */
  def sample(): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize(n: Double): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.some
    */
  def some(): Boolean = js.native
  def some(predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  
  /**
    * @see _.sortBy
    */
  def sortBy(iteratees: Many[ObjectIteratee[T]]*): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.transform
    */
  def transform(): ImpChain[T | Dictionary[Any]] = js.native
  /**
    * @see _.transform
    */
  def transform[TResult](
    iteratee: MemoVoidDictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      java.lang.String, 
      TResult
    ]
  ): ImpChain[TResult] = js.native
  def transform[TResult](
    iteratee: MemoVoidDictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      java.lang.String, 
      TResult
    ],
    accumulator: TResult
  ): ImpChain[TResult] = js.native
  
  /**
    * @see _.updateWith
    */
  def updateWith(path: PropertyPath, updater: js.Function1[/* oldValue */ Any, Any]): this.type = js.native
  def updateWith(
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ Any, Any],
    customizer: SetWithCustomizer[T]
  ): this.type = js.native
  /**
    * @see _.updateWith
    */
  @JSName("updateWith")
  def updateWith_TResult_Object[TResult](path: PropertyPath, updater: js.Function1[/* oldValue */ Any, Any]): Object[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResult_Object[TResult](
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ Any, Any],
    customizer: SetWithCustomizer[T]
  ): Object[TResult] = js.native
  
  /**
    * @see _.values
    */
  def values(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.valuesIn
    */
  def valuesIn(): Collection[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
}
