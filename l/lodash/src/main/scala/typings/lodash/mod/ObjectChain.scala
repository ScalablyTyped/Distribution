package typings.lodash.mod

import org.scalablytyped.runtime.TopLevel
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectChain[T]
  extends LoDashExplicitWrapper[T]
     with _ExpChain[T] {
  
  /**
    * @see _.assign
    */
  def assign(): ObjectChain[T] = js.native
  /**
    * @see _.assign
    */
  def assign(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource](source: TSource): ObjectChain[T with TSource] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.assignIn
    */
  def assignIn(): ObjectChain[T] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource](source: TSource): ObjectChain[T with TSource] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.assignInWith
    */
  def assignInWith(): ObjectChain[T] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource](source: TSource, customizer: AssignCustomizer): ObjectChain[T with TSource] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.assignWith
    */
  def assignWith(): ObjectChain[T] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource](source: TSource, customizer: AssignCustomizer): ObjectChain[T with TSource] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
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
  def create[U /* <: js.Object */](): ObjectChain[T with U] = js.native
  def create[U /* <: js.Object */](properties: U): ObjectChain[T with U] = js.native
  
  /**
    * @see _.defaults
    */
  def defaults(): ObjectChain[NonNullable[T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults(sources: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource](source: TSource): ObjectChain[NonNullable[TSource with T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[NonNullable[TSource2 with TSource1 with T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[NonNullable[TSource3 with TSource2 with TSource1 with T]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[NonNullable[TSource4 with TSource3 with TSource2 with TSource1 with T]] = js.native
  
  /**
    * @see _.defaultsDeep
    */
  def defaultsDeep(sources: js.Any*): ObjectChain[_] = js.native
  
  /**
    * @see _.each
    */
  def each(): ObjectChain[T] = js.native
  def each(iteratee: ObjectIterator[T, _]): ObjectChain[T] = js.native
  
  /**
    * @see _.eachRight
    */
  def eachRight(): ObjectChain[T] = js.native
  def eachRight(iteratee: ObjectIterator[T, _]): ObjectChain[T] = js.native
  /**
    * @see _.eachRight
    */
  @JSName("eachRight")
  var eachRight_Original: js.Function1[/* iteratee */ js.UndefOr[ObjectIterator[T, _]], ObjectChain[T]] = js.native
  
  /**
    * @see _.each
    */
  @JSName("each")
  var each_Original: js.Function1[/* iteratee */ js.UndefOr[ObjectIterator[T, _]], ObjectChain[T]] = js.native
  
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
  def extend(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource](source: TSource): ObjectChain[T with TSource] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.extendWith
    */
  def extendWith(): ObjectChain[T] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource](source: TSource, customizer: AssignCustomizer): ObjectChain[T with TSource] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
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
  def find(predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def find(predicate: ObjectIterateeCustom[T, Boolean]): ExpChain[
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
  def findLast(predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): ExpChain[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def findLast(predicate: ObjectIterateeCustom[T, Boolean]): ExpChain[
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
  def flatMap(iteratee: js.Tuple2[PropertyName, _]): CollectionChain[Boolean] = js.native
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
  def flatMapDeep(iteratee: js.Tuple2[PropertyName, _]): CollectionChain[Boolean] = js.native
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
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, _]): CollectionChain[Boolean] = js.native
  def flatMapDepth(iteratee: js.Tuple2[PropertyName, _], depth: Double): CollectionChain[Boolean] = js.native
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
  def forEach(iteratee: ObjectIterator[T, _]): ObjectChain[T] = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(): ObjectChain[T] = js.native
  def forEachRight(iteratee: ObjectIterator[T, _]): ObjectChain[T] = js.native
  
  /**
    * @see _.get
    */
  def get(path: PropertyPath): LoDashExplicitWrapper[_] = js.native
  def get(path: PropertyPath, defaultValue: js.Any): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: TKey): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: TKey, defaultValue: js.Array[scala.Nothing]): ExpChain[
    js.Array[scala.Nothing] | (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ] = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: js.Array[TKey]): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */](path: js.Array[TKey], defaultValue: js.Array[scala.Nothing]): ExpChain[
    js.Array[scala.Nothing] | (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: /* keyof T */ java.lang.String */, TDefault](path: TKey, defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  def get[TKey /* <: /* keyof T */ java.lang.String */, TDefault](path: js.Array[TKey], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
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
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], defaultValue: js.Array[scala.Nothing]): ExpChain[
    js.Array[scala.Nothing] | (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TDefault](path: js.Tuple2[TKey1, TKey2], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
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
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: js.Array[scala.Nothing]): ExpChain[
    js.Array[scala.Nothing] | (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TDefault](path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
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
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: js.Array[scala.Nothing]): ExpChain[
    js.Array[scala.Nothing] | (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof T */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[TKey1][TKey2][TKey3] */ js.Any */, TDefault](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: TDefault): ExpChain[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  
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
  def map(iteratee: js.Tuple2[PropertyName, _]): CollectionChain[Boolean] = js.native
  /**
    * @see _.map
    */
  def map(iteratee: PropertyName): CollectionChain[_] = js.native
  /**
    * @see _.map
    */
  def map[TResult](iteratee: ObjectIterator[T, TResult]): CollectionChain[TResult] = js.native
  /**
    * @see _.map
    */
  def map[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[keyof T] */ js.Any */](key: K): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T][K] */ js.Any
  ] = js.native
  
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typings.lodash.lodashStrings.ObjectChain with TopLevel[js.Any]
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(iteratee: js.Object): ObjectChain[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typings.lodash.lodashStrings.ObjectChain with TopLevel[js.Any]
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typings.lodash.lodashStrings.ObjectChain with TopLevel[js.Any]
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
    * @see _.merge
    */
  def merge(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource](source: TSource): ObjectChain[T with TSource] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.mergeWith
    */
  def mergeWith(otherArgs: js.Any*): ObjectChain[_] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource](source: TSource, customizer: MergeWithCustomizer): ObjectChain[T with TSource] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): ObjectChain[T with TSource1 with TSource2] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: MergeWithCustomizer): ObjectChain[T with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): ObjectChain[T with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
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
  def omit_K_String[K /* <: /* keyof T */ java.lang.String */](paths: Many[K]*): ObjectChain[Omit[T, K]] = js.native
  
  /**
    * @see _.orderBy
    */
  def orderBy(): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: js.UndefOr[Many[ObjectIterator[T, NotVoid]]], orders: Many[Boolean | asc | desc]): CollectionChain[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy(iteratees: Many[ObjectIterator[T, NotVoid]]): CollectionChain[
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
  def pick(props: PropertyPath*): ObjectChain[PartialObject[T]] = js.native
  
  /**
    * @see _.pickBy
    */
  def pickBy(): ObjectChain[PartialObject[T]] = js.native
  def pickBy(
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): ObjectChain[PartialObject[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueKeyIterateeTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): ObjectChain[Dictionary[S] | NumericDictionary[S]] = js.native
  
  /**
    * @see _.pick
    */
  @JSName("pick")
  def pick_U_String[U /* <: /* keyof T */ java.lang.String */](props: Many[U]*): ObjectChain[Pick[T, U]] = js.native
  
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
  def transform(): ExpChain[T | Dictionary[_]] = js.native
  /**
    * @see _.transform
    */
  def transform[TResult](
    iteratee: MemoVoidDictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): ExpChain[TResult] = js.native
  def transform[TResult](
    iteratee: MemoVoidDictionaryIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): ExpChain[TResult] = js.native
  
  /**
    * @see _.updateWith
    */
  def updateWith(path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): this.type = js.native
  def updateWith(
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[T]
  ): this.type = js.native
  /**
    * @see _.updateWith
    */
  @JSName("updateWith")
  def updateWith_TResult_ObjectChain[TResult](path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): ObjectChain[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResult_ObjectChain[TResult](
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
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
