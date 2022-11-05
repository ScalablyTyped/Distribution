package typings.lodash.mod

import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectChain[T]
  extends StObject
     with LoDashExplicitWrapper[T] {
  
  /**
    * @see _.assign
    */
  def assign(): ObjectChain[T] = js.native
  /**
    * @see _.assign
    */
  def assign(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource](source: TSource): ObjectChain[T & TSource] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.assignIn
    */
  def assignIn(): ObjectChain[T] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource](source: TSource): ObjectChain[T & TSource] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.assignInWith
    */
  def assignInWith(): ObjectChain[T] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource](source: TSource, customizer: AssignCustomizer): ObjectChain[T & TSource] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.assignWith
    */
  def assignWith(): ObjectChain[T] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource](source: TSource, customizer: AssignCustomizer): ObjectChain[T & TSource] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.at
    */
  def at(props: (Many[/* keyof T */ java.lang.String])*): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): CollectionChain[T] = js.native
  
  /**
    * @see _.concat
    */
  def concat(values: Many[T]*): CollectionChain[T] = js.native
  
  /**
    * @see _.countBy
    */
  def countBy(): ObjectChain[Dictionary[Double]] = js.native
  def countBy(
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): ObjectChain[Dictionary[Double]] = js.native
  
  /**
    * @see _.create
    */
  def create[U /* <: js.Object */](): ObjectChain[T & U] = js.native
  def create[U /* <: js.Object */](properties: U): ObjectChain[T & U] = js.native
  
  /**
    * @see _.defaults
    */
  def defaults(): ObjectChain[NonNullable[T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults(sources: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource](source: TSource): ObjectChain[NonNullable[TSource & T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[NonNullable[TSource2 & TSource1 & T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[NonNullable[TSource3 & TSource2 & TSource1 & T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[NonNullable[TSource4 & TSource3 & TSource2 & TSource1 & T]] = js.native
  
  /**
    * @see _.defaultsDeep
    */
  def defaultsDeep(sources: Any*): ObjectChain[Any] = js.native
  
  /**
    * @see _.each
    */
  def each(): ObjectChain[T] = js.native
  def each(iteratee: ObjectIterator[T, Any]): ObjectChain[T] = js.native
  
  /**
    * @see _.eachRight
    */
  def eachRight(): ObjectChain[T] = js.native
  def eachRight(iteratee: ObjectIterator[T, Any]): ObjectChain[T] = js.native
  /**
    * @see _.eachRight
    */
  @JSName("eachRight")
  var eachRight_Original: js.Function1[/* iteratee */ js.UndefOr[ObjectIterator[T, Any]], ObjectChain[T]] = js.native
  
  /**
    * @see _.each
    */
  @JSName("each")
  var each_Original: js.Function1[/* iteratee */ js.UndefOr[ObjectIterator[T, Any]], ObjectChain[T]] = js.native
  
  /**
    * @see _.every
    */
  def every(): PrimitiveChain[Boolean] = js.native
  def every(predicate: ObjectIterateeCustom[T, Boolean]): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.extend
    */
  def extend(): ObjectChain[T] = js.native
  /**
    * @see _.extend
    */
  def extend(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource](source: TSource): ObjectChain[T & TSource] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.extendWith
    */
  def extendWith(): ObjectChain[T] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource](source: TSource, customizer: AssignCustomizer): ObjectChain[T & TSource] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.filter
    */
  def filter(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter(predicate: ObjectIterateeCustom[T, Boolean]): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.filter
    */
  def filter[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): CollectionChain[S] = js.native
  
  /**
    * @see _.find
    */
  def find(): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def find(predicate: Unit, fromIndex: Double): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def find(predicate: ObjectIterateeCustom[T, Boolean]): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def find(predicate: ObjectIterateeCustom[T, Boolean], fromIndex: Double): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.find
    */
  def find[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): ExpChain[js.UndefOr[S]] = js.native
  def find[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): ExpChain[js.UndefOr[S]] = js.native
  
  /**
    * @see _.findLast
    */
  def findLast(): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def findLast(predicate: Unit, fromIndex: Double): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def findLast(predicate: ObjectIterateeCustom[T, Boolean]): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def findLast(predicate: ObjectIterateeCustom[T, Boolean], fromIndex: Double): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.findLast
    */
  def findLast[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): ExpChain[js.UndefOr[S]] = js.native
  def findLast[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): ExpChain[js.UndefOr[S]] = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def flatMap(iteratee: js.Object): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Tuple2[PropertyName, Any]): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[TResult](iteratee: ObjectIterator[T, Many[TResult]]): CollectionChain[TResult] = js.native
  def flatMap[TResult](iteratee: PropertyName): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def flatMapDeep(iteratee: js.Object): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(iteratee: js.Tuple2[PropertyName, Any]): CollectionChain[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): CollectionChain[TResult] = js.native
  def flatMapDeep[TResult](iteratee: PropertyName): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def flatMapDepth(depth: Double): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
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
  def flatMapDepth[TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): CollectionChain[TResult] = js.native
  def flatMapDepth[TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): CollectionChain[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName): CollectionChain[TResult] = js.native
  def flatMapDepth[TResult](iteratee: PropertyName, depth: Double): CollectionChain[TResult] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(): ObjectChain[T] = js.native
  def forEach(iteratee: ObjectIterator[T, Any]): ObjectChain[T] = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(): ObjectChain[T] = js.native
  def forEachRight(iteratee: ObjectIterator[T, Any]): ObjectChain[T] = js.native
  
  /**
    * @see _.get
    */
  def get(path: PropertyPath): LoDashExplicitWrapper[Any] = js.native
  def get(path: PropertyPath, defaultValue: Any): LoDashExplicitWrapper[Any] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: TKey, defaultValue: js.Array[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] extends std.Array<any> ? lodash.lodash.ExpChain<std.Exclude<T[TKey], undefined>> : lodash.lodash.ExpChain<std.Exclude<T[TKey], undefined> | std.Array<never>> */ js.Any = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: js.Array[TKey]): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: js.Array[TKey], defaultValue: js.Array[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] extends std.Array<any> ? lodash.lodash.ExpChain<std.Exclude<T[TKey], undefined>> : lodash.lodash.ExpChain<std.Exclude<T[TKey], undefined> | std.Array<never>> */ js.Any = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */, TDefault](path: js.Array[TKey], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
      Unit
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], defaultValue: js.Array[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2] extends std.Array<any> ? lodash.lodash.ExpChain<std.Exclude<T[TKey1][TKey2], undefined>> : lodash.lodash.ExpChain<std.Exclude<T[TKey1][TKey2], undefined> | std.Array<never>> */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TDefault](path: js.Tuple2[TKey1, TKey2], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2] */ js.Any, 
      Unit
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: js.Array[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3] extends std.Array<any> ? lodash.lodash.ExpChain<std.Exclude<T[TKey1][TKey2][TKey3], undefined>> : lodash.lodash.ExpChain<std.Exclude<T[TKey1][TKey2][TKey3], undefined> | std.Array<never>> */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TDefault](path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3] */ js.Any, 
      Unit
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: js.Array[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3][TKey4] extends std.Array<any> ? lodash.lodash.ExpChain<std.Exclude<T[TKey1][TKey2][TKey3][TKey4], undefined>> : lodash.lodash.ExpChain<std.Exclude<T[TKey1][TKey2][TKey3][TKey4], undefined> | std.Array<never>> */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2][TKey3] */ js.Any */, TDefault](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      Unit
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TKeyTDefault_ExpChain[TKey /* <: /* keyof T */ java.lang.String */, TDefault](path: TKey, defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
      Unit
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TKey_ExpChain[TKey /* <: /* keyof T */ java.lang.String */](path: TKey): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TPathTDefault_ExpChain[TPath /* <: java.lang.String */, TDefault](path: TPath, defaultValue: TDefault): ExpChain[(Exclude[GetFieldType[T, TPath], js.UndefOr[Null]]) | TDefault] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TPath_Any[TPath /* <: java.lang.String */](path: TPath): /* import warning: importer.ImportType#apply Failed type conversion: string extends TPath ? lodash.lodash.LoDashExplicitWrapper<any> : lodash.lodash.ExpChain<lodash.lodash.GetFieldType<T, TPath>> */ js.Any = js.native
  
  /**
    * @see _.groupBy
    */
  def groupBy(): ObjectChain[
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
  ): ObjectChain[
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  
  /**
    * @see _.includes
    */
  def includes(target: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): PrimitiveChain[Boolean] = js.native
  def includes(
    target: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    fromIndex: Double
  ): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.invertBy
    */
  def invertBy(): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy(
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): FunctionChain[js.Function1[/* o */ T, Boolean]] = js.native
  
  /**
    * @see _.keyBy
    */
  def keyBy(): ObjectChain[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def keyBy(
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): ObjectChain[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.map
    */
  def map(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
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
  def map[TResult](iteratee: ObjectIterator[T, TResult]): CollectionChain[TResult] = js.native
  
  /**
    * @see _.mapKeys
    */
  def mapKeys(): ObjectChain[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def mapKeys(iteratee: ObjectIteratee[T]): ObjectChain[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): ObjectChain[T] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: java.lang.String): ObjectChain[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: any} */ js.Any
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: js.Object): ObjectChain[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: boolean} */ js.Any
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](
    callback: (DictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]) | (ObjectIterator[T, TResult])
  ): ObjectChain[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: TResult} */ js.Any
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[keyof T] */ js.Any */](iteratee: TKey): ObjectChain[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T][TKey] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.map
    */
  @JSName("map")
  def map_K[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[keyof T] */ js.Any */](key: K): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T][K] */ js.Any
  ] = js.native
  
  /**
    * @see _.merge
    */
  def merge(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource](source: TSource): ObjectChain[T & TSource] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.mergeWith
    */
  def mergeWith(otherArgs: Any*): ObjectChain[Any] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource](source: TSource, customizer: MergeWithCustomizer): ObjectChain[T & TSource] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): ObjectChain[T & TSource1 & TSource2] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: MergeWithCustomizer): ObjectChain[T & TSource1 & TSource2 & TSource3] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): ObjectChain[T & TSource1 & TSource2 & TSource3 & TSource4] = js.native
  
  /**
    * @see _.omit
    */
  def omit(paths: Many[PropertyName]*): ObjectChain[PartialObject[T]] = js.native
  
  /**
    * @see _.omitBy
    */
  def omitBy(
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): ObjectChain[PartialObject[T]] = js.native
  
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_K[K /* <: /* keyof T */ java.lang.String */](paths: Many[K]*): ObjectChain[Omit[T, K]] = js.native
  
  /**
    * @see _.orderBy
    */
  def orderBy(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: Unit, orders: Many[Boolean | asc | desc]): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: Many[ObjectIterator[T, NotVoid]]): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: Many[ObjectIterator[T, NotVoid]], orders: Many[Boolean | asc | desc]): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.partition
    */
  def partition(
    callback: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashExplicitWrapper[
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
  def pick(props: Many[PropertyPath]*): ObjectChain[PartialObject[T]] = js.native
  
  /**
    * @see _.pickBy
    */
  def pickBy(): ObjectChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.Dictionary<unknown> ? lodash.lodash.Dictionary<T[keyof T]> : T extends lodash.lodash.NumericDictionary<unknown> ? lodash.lodash.NumericDictionary<T[keyof T]> : lodash.lodash.PartialObject<T> */ js.Any
  ] = js.native
  def pickBy(
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): ObjectChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.Dictionary<unknown> ? lodash.lodash.Dictionary<T[keyof T]> : T extends lodash.lodash.NumericDictionary<unknown> ? lodash.lodash.NumericDictionary<T[keyof T]> : lodash.lodash.PartialObject<T> */ js.Any
  ] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueKeyIterateeTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): ObjectChain[
    /* import warning: importer.ImportType#apply Failed type conversion: lodash.lodash.NumericDictionary<unknown> extends T ? lodash.lodash.NumericDictionary<S> : lodash.lodash.Dictionary<S> */ js.Any
  ] = js.native
  
  /**
    * @see _.pick
    */
  @JSName("pick")
  def pick_U[U /* <: /* keyof T */ java.lang.String */](props: Many[U]*): ObjectChain[Pick[T, U]] = js.native
  
  /**
    * @see _.reduce
    */
  def reduce(
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
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
  ): ExpChain[TResult] = js.native
  
  /**
    * @see _.reduceRight
    */
  def reduceRight(
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
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
  ): ExpChain[TResult] = js.native
  
  /**
    * @see _.reject
    */
  def reject(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reject(predicate: ObjectIterateeCustom[T, Boolean]): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.sample
    */
  def sample(): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize(n: Double): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.some
    */
  def some(): PrimitiveChain[Boolean] = js.native
  def some(predicate: ObjectIterateeCustom[T, Boolean]): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.sortBy
    */
  def sortBy(iteratees: Many[ObjectIteratee[T]]*): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.transform
    */
  def transform(): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends lodash.lodash.Dictionary<unknown> ? lodash.lodash.Dictionary<any> : T */ js.Any
  ] = js.native
  /**
    * @see _.transform
    */
  def transform[TResult](
    iteratee: MemoVoidDictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      java.lang.String, 
      TResult
    ]
  ): ExpChain[TResult] = js.native
  def transform[TResult](
    iteratee: MemoVoidDictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      java.lang.String, 
      TResult
    ],
    accumulator: TResult
  ): ExpChain[TResult] = js.native
  
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
  def updateWith_TResult_ObjectChain[TResult](path: PropertyPath, updater: js.Function1[/* oldValue */ Any, Any]): ObjectChain[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResult_ObjectChain[TResult](
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ Any, Any],
    customizer: SetWithCustomizer[T]
  ): ObjectChain[TResult] = js.native
  
  /**
    * @see _.values
    */
  def values(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.valuesIn
    */
  def valuesIn(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
}
