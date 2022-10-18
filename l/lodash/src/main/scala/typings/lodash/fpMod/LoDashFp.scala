package typings.lodash.fpMod

import typings.lodash.anon.LodashAnyHack
import typings.lodash.anon.TrapAny
import typings.lodash.anon.Typeoflodash
import typings.lodash.lodashBooleans.`false`
import typings.lodash.lodashBooleans.`true`
import typings.lodash.lodashInts.`0`
import typings.lodash.lodashStrings._empty
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.lodash.mod.AssignCustomizer
import typings.lodash.mod.CloneDeepWithCustomizer
import typings.lodash.mod.CloneWithCustomizer
import typings.lodash.mod.Collection
import typings.lodash.mod.Comparator
import typings.lodash.mod.Comparator2
import typings.lodash.mod.CondPairNullary
import typings.lodash.mod.CondPairUnary
import typings.lodash.mod.ConformsPredicateObject
import typings.lodash.mod.CurriedFunction1
import typings.lodash.mod.CurriedFunction2
import typings.lodash.mod.CurriedFunction3
import typings.lodash.mod.CurriedFunction4
import typings.lodash.mod.CurriedFunction5
import typings.lodash.mod.DebouncedFunc
import typings.lodash.mod.Dictionary
import typings.lodash.mod.Function
import typings.lodash.mod.Function0
import typings.lodash.mod.Function1
import typings.lodash.mod.Function2
import typings.lodash.mod.Function3
import typings.lodash.mod.Function4
import typings.lodash.mod.FunctionBase
import typings.lodash.mod.IsEqualCustomizer
import typings.lodash.mod.ListOfRecursiveArraysOrValues
import typings.lodash.mod.LoDashStatic
import typings.lodash.mod.Many
import typings.lodash.mod.MemoIteratorCapped
import typings.lodash.mod.MemoIteratorCappedRight
import typings.lodash.mod.MemoVoidIteratorCapped
import typings.lodash.mod.MemoizedFunction
import typings.lodash.mod.MergeWithCustomizer
import typings.lodash.mod.NotVoid
import typings.lodash.mod.NumericDictionary
import typings.lodash.mod.Object
import typings.lodash.mod.Omit
import typings.lodash.mod.PartialObject
import typings.lodash.mod.Primitive
import typings.lodash.mod.PropertyName
import typings.lodash.mod.PropertyPath
import typings.lodash.mod.ReplaceFunction
import typings.lodash.mod.RightCurriedFunction1
import typings.lodash.mod.RightCurriedFunction2
import typings.lodash.mod.RightCurriedFunction3
import typings.lodash.mod.RightCurriedFunction4
import typings.lodash.mod.RightCurriedFunction5
import typings.lodash.mod.SetWithCustomizer
import typings.lodash.mod.String
import typings.lodash.mod.TemplateExecutor
import typings.lodash.mod.TruncateOptions
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.ValueIterateeCustom
import typings.lodash.mod.ValueIteratorTypeGuard
import typings.lodash.mod.ValueKeyIteratee
import typings.lodash.mod.ValueKeyIterateeTypeGuard
import typings.lodash.mod.__
import typings.lodash.mod.isMatchWithCustomizer
import typings.std.Exclude
import typings.std.Map
import typings.std.Pick
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoDashFp extends StObject {
  
  def F(): `false`
  @JSName("F")
  var F_Original: LodashStubFalse
  
  def T(): `true`
  @JSName("T")
  var T_Original: LodashStubTrue
  
  def __(): String
  def __(value: java.lang.String): String
  def __[T /* <: js.Function1[/* args */ Any, Any] */](value: T): Function[T]
  def __[T](value: typings.lodash.mod.List[T]): Collection[T]
  @JSName("__")
  var ___Original: __
  @JSName("__")
  def ___T_Collection[T](): Collection[T]
  @JSName("__")
  def ___T_Object[T /* <: js.Object */](): Object[T]
  @JSName("__")
  def ___T_Object[T /* <: js.Object */](value: T): Object[T]
  @JSName("__")
  def ___T_Primitive[T /* <: js.UndefOr[Null] */](value: T): Primitive[T]
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  @JSName("__")
  def ___TrapAny_Intersection[TrapAny /* <: typings.lodash.anon.TrapAny */](value: TrapAny): Collection[Any] & Function[Any] & Object[Any] & Primitive[Any] & String
  
  def add(augend: Double): LodashAdd1x1
  def add(augend: Double, addend: Double): Double
  def add(augend: __, addend: Double): LodashAdd1x2
  @JSName("add")
  var add_Original: LodashAdd
  
  def after(func: __, n: Double): LodashAfter1x2
  def after[TFunc /* <: js.Function1[/* repeated */ Any, Any] */](func: TFunc): LodashAfter1x1[TFunc]
  def after[TFunc /* <: js.Function1[/* repeated */ Any, Any] */](func: TFunc, n: Double): TFunc
  @JSName("after")
  var after_Original: LodashAfter
  
  def all[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): Boolean
  def all[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean
  def all[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): Boolean
  def all[T /* <: js.Object */](predicate: __): LodashEvery2x2[T]
  def all[T /* <: js.Object */](predicate: __, collection: T): LodashEvery2x2[T]
  def all[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashEvery1x2[T]
  
  def allPass[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean]
  @JSName("allPass")
  var allPass_Original: LodashOverEvery
  
  @JSName("all")
  var all_Original: LodashEvery
  @JSName("all")
  def all_T_LodashEvery1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashEvery1x1[T]
  @JSName("all")
  def all_T_LodashEvery1x2[T](predicate: __): LodashEvery1x2[T]
  
  def always[T](value: T): js.Function0[T]
  @JSName("always")
  var always_Original: LodashConstant
  
  def any[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): Boolean
  def any[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean
  def any[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): Boolean
  def any[T](predicate: __): LodashSome1x2[T]
  def any[T /* <: js.Object */](predicate: __, collection: T): LodashSome2x2[T]
  def any[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashSome1x2[T]
  
  def anyPass[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean]
  @JSName("anyPass")
  var anyPass_Original: LodashOverSome
  
  @JSName("any")
  var any_Original: LodashSome
  @JSName("any")
  def any_T_LodashSome1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashSome1x1[T]
  @JSName("any")
  def any_T_LodashSome2x2[T /* <: js.Object */](predicate: __): LodashSome2x2[T]
  
  @JSName("apply")
  def apply[TResult](func: js.Function1[/* repeated */ Any, TResult]): js.Function1[/* repeated */ Any, TResult]
  @JSName("apply")
  var apply_Original: LodashApply
  
  def ary(n: Double): LodashAry1x1
  def ary(n: Double, func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def ary(n: __, func: js.Function1[/* repeated */ Any, Any]): LodashAry1x2
  @JSName("ary")
  var ary_Original: LodashAry
  
  def assign[TObject](`object`: TObject): LodashAssign1x1[TObject]
  def assign[TSource](`object`: __, source: TSource): LodashAssign1x2[TSource]
  def assign[TObject, TSource](`object`: TObject, source: TSource): TObject & TSource
  
  def assignAll(`object`: js.Array[Any]): Any
  def assignAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject & TSource
  def assignAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject & TSource1 & TSource2
  def assignAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject & TSource1 & TSource2 & TSource3
  def assignAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject & TSource1 & TSource2 & TSource3 & TSource4
  
  def assignAllWith(customizer: AssignCustomizer): LodashAssignAllWith1x1
  def assignAllWith(customizer: AssignCustomizer, args: js.Array[Any]): Any
  def assignAllWith(customizer: __, args: js.Array[Any]): LodashAssignAllWith1x2
  @JSName("assignAllWith")
  var assignAllWith_Original: LodashAssignAllWith
  
  @JSName("assignAll")
  var assignAll_Original: LodashAssignAll
  @JSName("assignAll")
  def assignAll_TObject_TObject[TObject](`object`: js.Array[TObject]): TObject
  
  def assignIn[TObject](`object`: TObject): LodashAssignIn1x1[TObject]
  def assignIn[TSource](`object`: __, source: TSource): LodashAssignIn1x2[TSource]
  def assignIn[TObject, TSource](`object`: TObject, source: TSource): TObject & TSource
  
  def assignInAll[TObject](`object`: js.Array[TObject]): TObject
  def assignInAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject & TSource
  def assignInAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject & TSource1 & TSource2
  def assignInAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject & TSource1 & TSource2 & TSource3
  def assignInAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject & TSource1 & TSource2 & TSource3 & TSource4
  
  def assignInAllWith(customizer: AssignCustomizer): LodashAssignInAllWith1x1
  def assignInAllWith(customizer: AssignCustomizer, args: js.Array[Any]): Any
  def assignInAllWith(customizer: __, args: js.Array[Any]): LodashAssignInAllWith1x2
  @JSName("assignInAllWith")
  var assignInAllWith_Original: LodashAssignInAllWith
  
  @JSName("assignInAll")
  var assignInAll_Original: LodashAssignInAll
  @JSName("assignInAll")
  def assignInAll_TResult_TResult[TResult](`object`: js.Array[Any]): TResult
  
  def assignInWith(customizer: AssignCustomizer): LodashAssignInWith1x1
  def assignInWith[TObject](customizer: AssignCustomizer, `object`: TObject): LodashAssignInWith1x3[TObject]
  def assignInWith[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashAssignInWith1x5[TSource]
  def assignInWith[TObject](customizer: __, `object`: TObject): LodashAssignInWith1x2[TObject]
  def assignInWith[TSource](customizer: __, `object`: __, source: TSource): LodashAssignInWith1x4[TSource]
  def assignInWith[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject & TSource
  def assignInWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashAssignInWith1x6[TObject, TSource]
  @JSName("assignInWith")
  var assignInWith_Original: LodashAssignInWith
  
  @JSName("assignIn")
  var assignIn_Original: LodashAssignIn
  
  def assignWith(customizer: AssignCustomizer): LodashAssignWith1x1
  def assignWith[TObject](customizer: AssignCustomizer, `object`: TObject): LodashAssignWith1x3[TObject]
  def assignWith[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashAssignWith1x5[TSource]
  def assignWith[TObject](customizer: __, `object`: TObject): LodashAssignWith1x2[TObject]
  def assignWith[TSource](customizer: __, `object`: __, source: TSource): LodashAssignWith1x4[TSource]
  def assignWith[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject & TSource
  def assignWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashAssignWith1x6[TObject, TSource]
  @JSName("assignWith")
  var assignWith_Original: LodashAssignWith
  
  @JSName("assign")
  var assign_Original: LodashAssign
  
  def assoc(path: PropertyPath): LodashSet1x1
  def assoc(path: PropertyPath, value: Any): LodashSet1x3
  def assoc(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5
  def assoc(path: __, value: Any): LodashSet1x2
  def assoc(path: __, value: Any, `object`: js.Object): LodashSet2x6
  def assoc(path: __, value: __, `object`: js.Object): LodashSet2x4
  def assoc[T /* <: js.Object */](path: PropertyPath, value: Any, `object`: T): T
  def assoc[TResult](path: PropertyPath, value: Any, `object`: js.Object): TResult
  def assoc[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T]
  def assoc[T /* <: js.Object */](path: __, value: Any, `object`: T): LodashSet1x6[T]
  def assoc[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T]
  
  def assocPath(path: PropertyPath): LodashSet1x1
  def assocPath(path: PropertyPath, value: Any): LodashSet1x3
  def assocPath(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5
  def assocPath(path: __, value: Any): LodashSet1x2
  def assocPath(path: __, value: Any, `object`: js.Object): LodashSet2x6
  def assocPath(path: __, value: __, `object`: js.Object): LodashSet2x4
  def assocPath[T /* <: js.Object */](path: PropertyPath, value: Any, `object`: T): T
  def assocPath[TResult](path: PropertyPath, value: Any, `object`: js.Object): TResult
  def assocPath[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T]
  def assocPath[T /* <: js.Object */](path: __, value: Any, `object`: T): LodashSet1x6[T]
  def assocPath[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T]
  @JSName("assocPath")
  var assocPath_Original: LodashSet
  
  @JSName("assoc")
  var assoc_Original: LodashSet
  
  def at(props: PropertyPath): LodashAt1x1
  def at[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String], `object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def at[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T]
  def at[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T]
  def at[T](props: __): LodashAt1x2[T]
  def at[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T]
  def at[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T]
  def at[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T]
  @JSName("at")
  var at_Original: LodashAt
  @JSName("at")
  def at_T_Array[T](props: (Many[/* keyof T */ java.lang.String]) | PropertyPath): js.Array[T]
  @JSName("at")
  def at_T_LodashAt2x1[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): LodashAt2x1[T]
  @JSName("at")
  def at_T_LodashAt2x2[T /* <: js.Object */](props: __): LodashAt2x2[T]
  
  def attempt[TResult](func: js.Function1[/* repeated */ Any, TResult]): TResult | js.Error
  @JSName("attempt")
  var attempt_Original: LodashAttempt
  
  def before(func: __, n: Double): LodashBefore1x2
  def before[TFunc /* <: js.Function1[/* repeated */ Any, Any] */](func: TFunc): LodashBefore1x1[TFunc]
  def before[TFunc /* <: js.Function1[/* repeated */ Any, Any] */](func: TFunc, n: Double): TFunc
  @JSName("before")
  var before_Original: LodashBefore
  
  def bind(func: js.Function1[/* repeated */ Any, Any]): LodashBind1x1
  def bind(func: js.Function1[/* repeated */ Any, Any], thisArg: Any): js.Function1[/* repeated */ Any, Any]
  def bind(func: __, thisArg: Any): LodashBind1x2
  
  def bindAll(methodNames: Many[java.lang.String]): LodashBindAll1x1
  def bindAll[T](methodNames: Many[java.lang.String], `object`: T): T
  def bindAll[T](methodNames: __, `object`: T): LodashBindAll1x2[T]
  @JSName("bindAll")
  var bindAll_Original: LodashBindAll
  
  def bindKey(`object`: js.Object): LodashBindKey1x1
  def bindKey(`object`: js.Object, key: java.lang.String): js.Function1[/* repeated */ Any, Any]
  def bindKey(`object`: __, key: java.lang.String): LodashBindKey1x2
  @JSName("bindKey")
  var bindKey_Original: LodashBindKey
  
  @JSName("bind")
  var bind_Original: LodashBind
  
  def camelCase(string: java.lang.String): java.lang.String
  @JSName("camelCase")
  var camelCase_Original: LodashCamelCase
  
  def capitalize(string: java.lang.String): java.lang.String
  @JSName("capitalize")
  var capitalize_Original: LodashCapitalize
  
  def castArray[T](value: Many[T]): js.Array[T]
  @JSName("castArray")
  var castArray_Original: LodashCastArray
  
  def ceil(n: Double): Double
  @JSName("ceil")
  var ceil_Original: LodashCeil
  
  def chunk(size: Double): LodashChunk1x1
  def chunk[T](size: Double, array: typings.lodash.mod.List[T]): js.Array[js.Array[T]]
  def chunk[T](size: __): LodashChunk1x2[T]
  def chunk[T](size: __, array: typings.lodash.mod.List[T]): LodashChunk1x2[T]
  @JSName("chunk")
  var chunk_Original: LodashChunk
  @JSName("chunk")
  def chunk_T_Array[T](size: Double): js.Array[js.Array[T]]
  
  def clamp(lower: Double): LodashClamp1x1
  def clamp(lower: Double, upper: Double): LodashClamp1x3
  def clamp(lower: Double, upper: Double, number: Double): Double
  def clamp(lower: Double, upper: __, number: Double): LodashClamp1x5
  def clamp(lower: __, upper: Double): LodashClamp1x2
  def clamp(lower: __, upper: Double, number: Double): LodashClamp1x6
  def clamp(lower: __, upper: __, number: Double): LodashClamp1x4
  @JSName("clamp")
  var clamp_Original: LodashClamp
  
  def clone[T](value: T): T
  
  def cloneDeep[T](value: T): T
  
  def cloneDeepWith[T](customizer: CloneDeepWithCustomizer[T]): LodashCloneDeepWith1x1[T]
  def cloneDeepWith[T](customizer: CloneDeepWithCustomizer[T], value: T): Any
  def cloneDeepWith[T](customizer: __, value: T): LodashCloneDeepWith1x2[T]
  @JSName("cloneDeepWith")
  var cloneDeepWith_Original: LodashCloneDeepWith
  
  @JSName("cloneDeep")
  var cloneDeep_Original: LodashCloneDeep
  
  def cloneWith[T](customizer: __, value: T): LodashCloneWith1x2[T]
  def cloneWith[T, TResult /* <: js.Object | java.lang.String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult]): LodashCloneWith1x1[T, TResult]
  def cloneWith[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]], value: T): TResult | T
  @JSName("cloneWith")
  var cloneWith_Original: LodashCloneWith
  @JSName("cloneWith")
  def cloneWith_TTResult_LodashCloneWith2x1[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]]): LodashCloneWith2x1[T, TResult]
  @JSName("cloneWith")
  def cloneWith_TTResult_TResult[T, TResult /* <: js.Object | java.lang.String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult], value: T): TResult
  
  @JSName("clone")
  var clone_Original: LodashClone
  
  def compact[T](): js.Array[Exclude[T, js.UndefOr[Null | `false` | _empty | `0`]]]
  def compact[T](array: typings.lodash.mod.List[T]): js.Array[Exclude[T, js.UndefOr[Null | `false` | _empty | `0`]]]
  @JSName("compact")
  var compact_Original: LodashCompact
  
  def complement[T /* <: js.Array[Any] */](predicate: js.Function1[/* args */ T, Any]): js.Function1[/* args */ T, Boolean]
  @JSName("complement")
  var complement_Original: LodashNegate
  
  def compose(func: (Many[js.Function1[/* repeated */ Any, Any]])*): js.Function1[/* repeated */ Any, Any]
  def compose[A /* <: js.Array[Any] */, R1, R2](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* args */ A, R1]): js.Function1[/* args */ A, R2]
  def compose[A /* <: js.Array[Any] */, R1, R2, R3](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R3]
  def compose[A /* <: js.Array[Any] */, R1, R2, R3, R4](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R4]
  def compose[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R5]
  def compose[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R6]
  def compose[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6, R7](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R7]
  @JSName("compose")
  var compose_Original: LodashFlowRight
  
  def concat[T](array: Many[T]): LodashConcat1x1[T]
  def concat[T](array: Many[T], values: Many[T]): js.Array[T]
  def concat[T](array: __, values: Many[T]): LodashConcat1x2[T]
  @JSName("concat")
  var concat_Original: LodashConcat
  
  def cond[R](pairs: js.Array[CondPairNullary[R]]): js.Function0[R]
  @JSName("cond")
  var cond_Original: LodashCond
  @JSName("cond")
  def cond_TR_Function1[T, R](pairs: js.Array[CondPairUnary[T, R]]): js.Function1[/* Target */ T, R]
  
  def conforms[T](source: ConformsPredicateObject[T]): LodashConformsTo1x1[T]
  def conforms[T](source: ConformsPredicateObject[T], `object`: T): Boolean
  def conforms[T](source: __, `object`: T): LodashConformsTo1x2[T]
  
  def conformsTo[T](source: ConformsPredicateObject[T]): LodashConformsTo1x1[T]
  def conformsTo[T](source: ConformsPredicateObject[T], `object`: T): Boolean
  def conformsTo[T](source: __, `object`: T): LodashConformsTo1x2[T]
  @JSName("conformsTo")
  var conformsTo_Original: LodashConformsTo
  
  @JSName("conforms")
  var conforms_Original: LodashConformsTo
  
  def constant[T](value: T): js.Function0[T]
  @JSName("constant")
  var constant_Original: LodashConstant
  
  def contains[T](target: T): LodashContains1x1[T]
  def contains[T](target: T, collection: Dictionary[T]): Boolean
  def contains[T](target: T, collection: NumericDictionary[T]): Boolean
  def contains[T](target: __): LodashContains1x2[T]
  def contains[T](target: __, collection: Dictionary[T]): LodashContains1x2[T]
  def contains[T](target: __, collection: NumericDictionary[T]): LodashContains1x2[T]
  @JSName("contains")
  var contains_Original: LodashContains
  @JSName("contains")
  def contains_T_Boolean[T](target: T): Boolean
  
  def countBy[T](iteratee: ValueIteratee[T]): LodashCountBy1x1[T]
  def countBy[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[Double]
  def countBy[T](iteratee: ValueIteratee[T], collection: typings.lodash.mod.List[T]): Dictionary[Double]
  def countBy[T /* <: js.Object */](iteratee: __): LodashCountBy2x2[T]
  def countBy[T /* <: js.Object */](iteratee: __, collection: T): LodashCountBy2x2[T]
  def countBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashCountBy1x2[T]
  @JSName("countBy")
  var countBy_Original: LodashCountBy
  @JSName("countBy")
  def countBy_T_Dictionary[T](
    iteratee: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): Dictionary[Double]
  @JSName("countBy")
  def countBy_T_LodashCountBy1x2[T](iteratee: __): LodashCountBy1x2[T]
  
  def create[T /* <: js.Object */, U /* <: js.Object */](prototype: T): T & U
  @JSName("create")
  var create_Original: LodashCreate
  
  def curry(func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def curry[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): CurriedFunction2[T1, T2, R]
  def curry[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): CurriedFunction3[T1, T2, T3, R]
  def curry[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): CurriedFunction4[T1, T2, T3, T4, R]
  def curry[T1, T2, T3, T4, T5, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): CurriedFunction5[T1, T2, T3, T4, T5, R]
  
  def curryN(arity: Double): LodashCurryN1x1
  def curryN(arity: Double, func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def curryN(arity: __, func: js.Function1[/* repeated */ Any, Any]): LodashCurryN6x2
  def curryN[T1, T2, R](arity: Double, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): CurriedFunction2[T1, T2, R]
  def curryN[T1, T2, R](arity: __, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): LodashCurryN2x2[T1, T2, R]
  def curryN[T1, T2, T3, R](arity: Double, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): CurriedFunction3[T1, T2, T3, R]
  def curryN[T1, T2, T3, R](arity: __, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): LodashCurryN3x2[T1, T2, T3, R]
  def curryN[T1, T2, T3, T4, R](arity: Double, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): CurriedFunction4[T1, T2, T3, T4, R]
  def curryN[T1, T2, T3, T4, R](arity: __, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): LodashCurryN4x2[T1, T2, T3, T4, R]
  def curryN[T1, T2, T3, T4, T5, R](
    arity: Double,
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]
  ): CurriedFunction5[T1, T2, T3, T4, T5, R]
  def curryN[T1, T2, T3, T4, T5, R](arity: __, func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): LodashCurryN5x2[T1, T2, T3, T4, T5, R]
  @JSName("curryN")
  var curryN_Original: LodashCurryN
  @JSName("curryN")
  def curryN_T1R_CurriedFunction1[T1, R](arity: Double, func: js.Function1[/* t1 */ T1, R]): CurriedFunction1[T1, R]
  @JSName("curryN")
  def curryN_T1R_LodashCurryN1x2[T1, R](arity: __, func: js.Function1[/* t1 */ T1, R]): LodashCurryN1x2[T1, R]
  
  def curryRight(func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def curryRight[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): RightCurriedFunction2[T1, T2, R]
  def curryRight[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): RightCurriedFunction3[T1, T2, T3, R]
  def curryRight[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): RightCurriedFunction4[T1, T2, T3, T4, R]
  def curryRight[T1, T2, T3, T4, T5, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): RightCurriedFunction5[T1, T2, T3, T4, T5, R]
  
  def curryRightN(arity: Double): LodashCurryRightN1x1
  def curryRightN(arity: Double, func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def curryRightN(arity: __, func: js.Function1[/* repeated */ Any, Any]): LodashCurryRightN6x2
  def curryRightN[T1, T2, R](arity: Double, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): RightCurriedFunction2[T1, T2, R]
  def curryRightN[T1, T2, R](arity: __, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): LodashCurryRightN2x2[T1, T2, R]
  def curryRightN[T1, T2, T3, R](arity: Double, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): RightCurriedFunction3[T1, T2, T3, R]
  def curryRightN[T1, T2, T3, R](arity: __, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): LodashCurryRightN3x2[T1, T2, T3, R]
  def curryRightN[T1, T2, T3, T4, R](arity: Double, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): RightCurriedFunction4[T1, T2, T3, T4, R]
  def curryRightN[T1, T2, T3, T4, R](arity: __, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): LodashCurryRightN4x2[T1, T2, T3, T4, R]
  def curryRightN[T1, T2, T3, T4, T5, R](
    arity: Double,
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]
  ): RightCurriedFunction5[T1, T2, T3, T4, T5, R]
  def curryRightN[T1, T2, T3, T4, T5, R](arity: __, func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): LodashCurryRightN5x2[T1, T2, T3, T4, T5, R]
  @JSName("curryRightN")
  var curryRightN_Original: LodashCurryRightN
  @JSName("curryRightN")
  def curryRightN_T1R_LodashCurryRightN1x2[T1, R](arity: __, func: js.Function1[/* t1 */ T1, R]): LodashCurryRightN1x2[T1, R]
  @JSName("curryRightN")
  def curryRightN_T1R_RightCurriedFunction1[T1, R](arity: Double, func: js.Function1[/* t1 */ T1, R]): RightCurriedFunction1[T1, R]
  
  @JSName("curryRight")
  var curryRight_Original: LodashCurryRight
  @JSName("curryRight")
  def curryRight_T1R_RightCurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R]): RightCurriedFunction1[T1, R]
  
  @JSName("curry")
  var curry_Original: LodashCurry
  @JSName("curry")
  def curry_T1R_CurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R]): CurriedFunction1[T1, R]
  
  def debounce(wait: Double): LodashDebounce1x1
  def debounce[T /* <: js.Function1[/* args */ Any, Any] */](wait: Double, func: T): DebouncedFunc[T]
  def debounce[T /* <: js.Function1[/* args */ Any, Any] */](wait: __, func: T): LodashDebounce1x2[T]
  @JSName("debounce")
  var debounce_Original: LodashDebounce
  
  def deburr(string: java.lang.String): java.lang.String
  @JSName("deburr")
  var deburr_Original: LodashDeburr
  
  def defaultTo[T](defaultValue: T): LodashDefaultTo1x1[T]
  def defaultTo[T](defaultValue: T, value: T): T
  def defaultTo[T](defaultValue: __): LodashDefaultTo1x2[T]
  def defaultTo[T](defaultValue: __, value: T): LodashDefaultTo1x2[T]
  @JSName("defaultTo")
  var defaultTo_Original: LodashDefaultTo
  @JSName("defaultTo")
  def defaultTo_TDefault_LodashDefaultTo2x1[TDefault](defaultValue: TDefault): LodashDefaultTo2x1[TDefault]
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](defaultValue: TDefault): T | TDefault
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](defaultValue: TDefault, value: T): T | TDefault
  @JSName("defaultTo")
  def defaultTo_T_T[T](defaultValue: T): T
  
  def defaults[TSource](source: TSource): LodashDefaults1x1[TSource]
  def defaults[TObject](source: __, `object`: TObject): LodashDefaults1x2[TObject]
  def defaults[TObject, TSource](source: TSource, `object`: TObject): TSource & TObject
  
  def defaultsAll(`object`: js.Array[Any]): Any
  def defaultsAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TSource & TObject
  def defaultsAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TSource2 & TSource1 & TObject
  def defaultsAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TSource3 & TSource2 & TSource1 & TObject
  def defaultsAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TSource4 & TSource3 & TSource2 & TSource1 & TObject
  @JSName("defaultsAll")
  var defaultsAll_Original: LodashDefaultsAll
  @JSName("defaultsAll")
  def defaultsAll_TObject_TObject[TObject](`object`: js.Array[TObject]): TObject
  
  def defaultsDeep(sources: Any): LodashDefaultsDeep1x1
  def defaultsDeep(sources: Any, `object`: Any): Any
  def defaultsDeep(sources: __, `object`: Any): LodashDefaultsDeep1x2
  
  def defaultsDeepAll(`object`: js.Array[Any]): Any
  @JSName("defaultsDeepAll")
  var defaultsDeepAll_Original: LodashDefaultsDeepAll
  
  @JSName("defaultsDeep")
  var defaultsDeep_Original: LodashDefaultsDeep
  
  @JSName("defaults")
  var defaults_Original: LodashDefaults
  
  def defer(func: js.Function1[/* repeated */ Any, Any], args: Any*): Double
  @JSName("defer")
  var defer_Original: LodashDefer
  
  def delay(wait: Double): LodashDelay1x1
  def delay(wait: Double, func: js.Function1[/* repeated */ Any, Any]): Double
  def delay(wait: __, func: js.Function1[/* repeated */ Any, Any]): LodashDelay1x2
  @JSName("delay")
  var delay_Original: LodashDelay
  
  def difference[T](): LodashDifference1x1[T]
  def difference[T](array: Null, values: typings.lodash.mod.List[T]): js.Array[T]
  def difference[T](array: Unit, values: typings.lodash.mod.List[T]): js.Array[T]
  def difference[T](array: typings.lodash.mod.List[T]): LodashDifference1x1[T]
  def difference[T](array: typings.lodash.mod.List[T], values: typings.lodash.mod.List[T]): js.Array[T]
  def difference[T](array: __, values: typings.lodash.mod.List[T]): LodashDifference1x2[T]
  
  def differenceBy[T1](iteratee: __): LodashDifferenceBy1x2[T1]
  def differenceBy[T1](iteratee: __, array: typings.lodash.mod.List[T1]): LodashDifferenceBy1x2[T1]
  def differenceBy[T2](iteratee: __, array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x4[T2]
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashDifferenceBy1x3[T1, T2]
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Null, values: typings.lodash.mod.List[T2]): js.Array[T1]
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Unit, values: typings.lodash.mod.List[T2]): js.Array[T1]
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: typings.lodash.mod.List[T1]): LodashDifferenceBy1x3[T1, T2]
  def differenceBy[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: typings.lodash.mod.List[T1],
    values: typings.lodash.mod.List[T2]
  ): js.Array[T1]
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x5[T1]
  def differenceBy[T1, T2](iteratee: __, array: Null, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x6[T1, T2]
  def differenceBy[T1, T2](iteratee: __, array: Unit, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x6[T1, T2]
  def differenceBy[T1, T2](iteratee: __, array: typings.lodash.mod.List[T1], values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x6[T1, T2]
  @JSName("differenceBy")
  var differenceBy_Original: LodashDifferenceBy
  @JSName("differenceBy")
  def differenceBy_T1T2_LodashDifferenceBy1x1[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashDifferenceBy1x1[T1, T2]
  
  def differenceWith[T1](comparator: __): LodashDifferenceWith1x2[T1]
  def differenceWith[T1](comparator: __, array: typings.lodash.mod.List[T1]): LodashDifferenceWith1x2[T1]
  def differenceWith[T2](comparator: __, array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x4[T2]
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2]): LodashDifferenceWith1x1[T1, T2]
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: Null, values: typings.lodash.mod.List[T2]): js.Array[T1]
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: Unit, values: typings.lodash.mod.List[T2]): js.Array[T1]
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: typings.lodash.mod.List[T1]): LodashDifferenceWith1x3[T1, T2]
  def differenceWith[T1, T2](
    comparator: Comparator2[T1, T2],
    array: typings.lodash.mod.List[T1],
    values: typings.lodash.mod.List[T2]
  ): js.Array[T1]
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x5[T1]
  def differenceWith[T1, T2](comparator: __, array: Null, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x6[T1, T2]
  def differenceWith[T1, T2](comparator: __, array: Unit, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x6[T1, T2]
  def differenceWith[T1, T2](comparator: __, array: typings.lodash.mod.List[T1], values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x6[T1, T2]
  @JSName("differenceWith")
  var differenceWith_Original: LodashDifferenceWith
  @JSName("differenceWith")
  def differenceWith_T1T2_LodashDifferenceWith1x3[T1, T2](comparator: Comparator2[T1, T2]): LodashDifferenceWith1x3[T1, T2]
  
  @JSName("difference")
  var difference_Original: LodashDifference
  
  def dissoc(path: PropertyPath): LodashUnset1x1
  def dissoc[T](path: PropertyPath, `object`: T): T
  def dissoc[T](path: __, `object`: T): LodashUnset1x2[T]
  
  def dissocPath(path: PropertyPath): LodashUnset1x1
  def dissocPath[T](path: PropertyPath, `object`: T): T
  def dissocPath[T](path: __, `object`: T): LodashUnset1x2[T]
  @JSName("dissocPath")
  var dissocPath_Original: LodashUnset
  
  @JSName("dissoc")
  var dissoc_Original: LodashUnset
  
  def divide(dividend: Double): LodashDivide1x1
  def divide(dividend: Double, divisor: Double): Double
  def divide(dividend: __, divisor: Double): LodashDivide1x2
  @JSName("divide")
  var divide_Original: LodashDivide
  
  def drop(n: Double): LodashDrop1x1
  def drop[T](n: Double, array: typings.lodash.mod.List[T]): js.Array[T]
  def drop[T](n: __): LodashDrop1x2[T]
  def drop[T](n: __, array: typings.lodash.mod.List[T]): LodashDrop1x2[T]
  
  def dropLast(n: Double): LodashDropRight1x1
  def dropLast[T](n: Double, array: typings.lodash.mod.List[T]): js.Array[T]
  def dropLast[T](n: __): LodashDropRight1x2[T]
  def dropLast[T](n: __, array: typings.lodash.mod.List[T]): LodashDropRight1x2[T]
  
  def dropLastWhile[T](predicate: ValueIteratee[T]): LodashDropRightWhile1x1[T]
  def dropLastWhile[T](predicate: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def dropLastWhile[T](predicate: __): LodashDropRightWhile1x2[T]
  def dropLastWhile[T](predicate: __, array: typings.lodash.mod.List[T]): LodashDropRightWhile1x2[T]
  @JSName("dropLastWhile")
  var dropLastWhile_Original: LodashDropRightWhile
  @JSName("dropLastWhile")
  def dropLastWhile_T_Array[T](predicate: ValueIteratee[T]): js.Array[T]
  
  @JSName("dropLast")
  var dropLast_Original: LodashDropRight
  @JSName("dropLast")
  def dropLast_T_Array[T](n: Double): js.Array[T]
  
  def dropRight(n: Double): LodashDropRight1x1
  def dropRight[T](n: Double, array: typings.lodash.mod.List[T]): js.Array[T]
  def dropRight[T](n: __): LodashDropRight1x2[T]
  def dropRight[T](n: __, array: typings.lodash.mod.List[T]): LodashDropRight1x2[T]
  
  def dropRightWhile[T](predicate: ValueIteratee[T]): LodashDropRightWhile1x1[T]
  def dropRightWhile[T](predicate: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def dropRightWhile[T](predicate: __): LodashDropRightWhile1x2[T]
  def dropRightWhile[T](predicate: __, array: typings.lodash.mod.List[T]): LodashDropRightWhile1x2[T]
  @JSName("dropRightWhile")
  var dropRightWhile_Original: LodashDropRightWhile
  @JSName("dropRightWhile")
  def dropRightWhile_T_Array[T](predicate: ValueIteratee[T]): js.Array[T]
  
  @JSName("dropRight")
  var dropRight_Original: LodashDropRight
  @JSName("dropRight")
  def dropRight_T_Array[T](n: Double): js.Array[T]
  
  def dropWhile[T](predicate: ValueIteratee[T]): js.Array[T]
  def dropWhile[T](predicate: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def dropWhile[T](predicate: __): LodashDropWhile1x2[T]
  def dropWhile[T](predicate: __, array: typings.lodash.mod.List[T]): LodashDropWhile1x2[T]
  @JSName("dropWhile")
  var dropWhile_Original: LodashDropWhile
  @JSName("dropWhile")
  def dropWhile_T_LodashDropWhile1x1[T](predicate: ValueIteratee[T]): LodashDropWhile1x1[T]
  
  @JSName("drop")
  var drop_Original: LodashDrop
  @JSName("drop")
  def drop_T_Array[T](n: Double): js.Array[T]
  
  def each[T](iteratee: js.Function1[/* value */ T, Any]): LodashForEach1x1[T]
  def each[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): js.UndefOr[T | Null]
  def each[T](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T]): js.Array[T]
  def each[T](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def each[T /* <: js.Object */](iteratee: __): LodashForEach6x2[T]
  def each[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach6x2[T]
  def each[T](iteratee: __, collection: js.Array[T]): LodashForEach1x2[T]
  def each[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashForEach2x2[T]
  def each[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TArray): TArray
  def each[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TArray): TArray
  def each[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Null & TArray): LodashForEach4x2[T, TArray]
  def each[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Unit & TArray): LodashForEach4x2[T, TArray]
  
  def eachRight[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  def eachRight[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): js.UndefOr[T | Null]
  def eachRight[T](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T]): js.Array[T]
  def eachRight[T](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def eachRight[T /* <: js.Object */](iteratee: __): LodashForEachRight6x2[T]
  def eachRight[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight6x2[T]
  def eachRight[T](iteratee: __, collection: js.Array[T]): LodashForEachRight1x2[T]
  def eachRight[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashForEachRight2x2[T]
  def eachRight[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TArray): TArray
  def eachRight[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TArray): TArray
  def eachRight[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Unit & TList): LodashForEachRight5x2[T, TList]
  def eachRight[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Null & TList): LodashForEachRight5x2[T, TList]
  @JSName("eachRight")
  var eachRight_Original: LodashForEachRight
  @JSName("eachRight")
  def eachRight_TTArray_LodashForEachRight4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Null & TArray): LodashForEachRight4x2[T, TArray]
  @JSName("eachRight")
  def eachRight_TTArray_LodashForEachRight4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Unit & TArray): LodashForEachRight4x2[T, TArray]
  @JSName("eachRight")
  def eachRight_TTArray_LodashForEachRight4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: js.Array[T] & TArray): LodashForEachRight4x2[T, TArray]
  @JSName("eachRight")
  def eachRight_TTArray_TArray[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T] & TArray): TArray
  @JSName("eachRight")
  def eachRight_TTList_LodashForEachRight5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: typings.lodash.mod.List[T] & TList): LodashForEachRight5x2[T, TList]
  @JSName("eachRight")
  def eachRight_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TList): TList
  @JSName("eachRight")
  def eachRight_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T] & TList): TList
  @JSName("eachRight")
  def eachRight_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TList): TList
  @JSName("eachRight")
  def eachRight_T_LodashForEachRight1x1[T](iteratee: js.Function1[/* value */ T, Any]): LodashForEachRight1x1[T]
  @JSName("eachRight")
  def eachRight_T_LodashForEachRight3x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight3x2[T]
  @JSName("eachRight")
  def eachRight_T_T[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): T
  
  @JSName("each")
  var each_Original: LodashForEach
  @JSName("each")
  def each_TTArray_LodashForEach4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: js.Array[T] & TArray): LodashForEach4x2[T, TArray]
  @JSName("each")
  def each_TTArray_TArray[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T] & TArray): TArray
  @JSName("each")
  def each_TTList_LodashForEach5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Null & TList): LodashForEach5x2[T, TList]
  @JSName("each")
  def each_TTList_LodashForEach5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: typings.lodash.mod.List[T] & TList): LodashForEach5x2[T, TList]
  @JSName("each")
  def each_TTList_LodashForEach5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Unit & TList): LodashForEach5x2[T, TList]
  @JSName("each")
  def each_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TList): TList
  @JSName("each")
  def each_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T] & TList): TList
  @JSName("each")
  def each_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TList): TList
  @JSName("each")
  def each_T_LodashForEach3x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach3x2[T]
  @JSName("each")
  def each_T_T[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): T
  @JSName("each")
  def each_T_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  
  def endsWith(target: java.lang.String): LodashEndsWith1x1
  def endsWith(target: java.lang.String, string: java.lang.String): Boolean
  def endsWith(target: __, string: java.lang.String): LodashEndsWith1x2
  @JSName("endsWith")
  var endsWith_Original: LodashEndsWith
  
  def entries(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, Any]]
  def entries[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  def entries[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  
  def entriesIn(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, Any]]
  def entriesIn[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  def entriesIn[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  @JSName("entriesIn")
  var entriesIn_Original: LodashToPairsIn
  
  @JSName("entries")
  var entries_Original: LodashToPairs
  
  def eq(value: Any, other: Any): Boolean
  def eq(value: __, other: Any): LodashEq1x2
  @JSName("eq")
  var eq_Original: LodashEq
  
  def equals(value: Any, other: Any): Boolean
  def equals(value: __, other: Any): LodashIsEqual1x2
  @JSName("equals")
  var equals_Original: LodashIsEqual
  
  def escape(string: java.lang.String): java.lang.String
  
  def escapeRegExp(string: java.lang.String): java.lang.String
  @JSName("escapeRegExp")
  var escapeRegExp_Original: LodashEscapeRegExp
  
  @JSName("escape")
  var escape_Original: LodashEscape
  
  def every[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): Boolean
  def every[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean
  def every[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): Boolean
  def every[T /* <: js.Object */](predicate: __): LodashEvery2x2[T]
  def every[T /* <: js.Object */](predicate: __, collection: T): LodashEvery2x2[T]
  def every[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashEvery1x2[T]
  @JSName("every")
  var every_Original: LodashEvery
  @JSName("every")
  def every_T_LodashEvery1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashEvery1x1[T]
  @JSName("every")
  def every_T_LodashEvery1x2[T](predicate: __): LodashEvery1x2[T]
  
  def extend[TObject](`object`: TObject): LodashExtend1x1[TObject]
  def extend[TSource](`object`: __, source: TSource): LodashExtend1x2[TSource]
  def extend[TObject, TSource](`object`: TObject, source: TSource): TObject & TSource
  
  def extendAll[TObject](`object`: js.Array[TObject]): TObject
  def extendAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject & TSource
  def extendAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject & TSource1 & TSource2
  def extendAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject & TSource1 & TSource2 & TSource3
  def extendAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject & TSource1 & TSource2 & TSource3 & TSource4
  
  def extendAllWith(customizer: AssignCustomizer): LodashExtendAllWith1x1
  def extendAllWith(customizer: AssignCustomizer, args: js.Array[Any]): Any
  def extendAllWith(customizer: __, args: js.Array[Any]): LodashExtendAllWith1x2
  @JSName("extendAllWith")
  var extendAllWith_Original: LodashExtendAllWith
  
  @JSName("extendAll")
  var extendAll_Original: LodashExtendAll
  @JSName("extendAll")
  def extendAll_TResult_TResult[TResult](`object`: js.Array[Any]): TResult
  
  def extendWith(customizer: AssignCustomizer): LodashExtendWith1x1
  def extendWith[TObject](customizer: AssignCustomizer, `object`: TObject): LodashExtendWith1x3[TObject]
  def extendWith[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashExtendWith1x5[TSource]
  def extendWith[TObject](customizer: __, `object`: TObject): LodashExtendWith1x2[TObject]
  def extendWith[TSource](customizer: __, `object`: __, source: TSource): LodashExtendWith1x4[TSource]
  def extendWith[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject & TSource
  def extendWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashExtendWith1x6[TObject, TSource]
  @JSName("extendWith")
  var extendWith_Original: LodashExtendWith
  
  @JSName("extend")
  var extend_Original: LodashExtend
  
  def fill(start: Double): LodashFill1x1
  def fill(start: Double, end: Double): LodashFill1x3
  def fill(start: __, end: Double): LodashFill1x2
  def fill[T](start: Double, end: Double, value: T): LodashFill1x7[T]
  def fill[U](start: Double, end: Double, value: __): LodashFill2x11[U]
  def fill[U](start: Double, end: Double, value: __, array: js.Array[U]): LodashFill1x11[U]
  def fill[U](start: Double, end: Double, value: __, array: typings.lodash.mod.List[U]): LodashFill2x11[U]
  def fill[T](start: Double, end: __, value: T): LodashFill1x5[T]
  def fill[U](start: Double, end: __, value: __): LodashFill2x9[U]
  def fill[U](start: Double, end: __, value: __, array: js.Array[U]): LodashFill1x9[U]
  def fill[U](start: Double, end: __, value: __, array: typings.lodash.mod.List[U]): LodashFill2x9[U]
  def fill[T](start: __, end: Double, value: T): LodashFill1x6[T]
  def fill[U](start: __, end: Double, value: __): LodashFill2x10[U]
  def fill[U](start: __, end: Double, value: __, array: js.Array[U]): LodashFill1x10[U]
  def fill[U](start: __, end: Double, value: __, array: typings.lodash.mod.List[U]): LodashFill2x10[U]
  def fill[T](start: __, end: __, value: T): LodashFill1x4[T]
  def fill[U](start: __, end: __, value: __): LodashFill1x8[U]
  def fill[U](start: __, end: __, value: __, array: js.Array[U]): LodashFill1x8[U]
  def fill[U](start: __, end: __, value: __, array: typings.lodash.mod.List[U]): LodashFill2x8[U]
  def fill[T, U](start: Double, end: Double, value: T, array: js.Array[U]): js.Array[T | U]
  def fill[T, U](start: Double, end: Double, value: T, array: typings.lodash.mod.List[U]): typings.lodash.mod.List[T | U]
  def fill[T, U](start: Double, end: __, value: T, array: js.Array[U]): LodashFill1x13[T, U]
  def fill[T, U](start: Double, end: __, value: T, array: typings.lodash.mod.List[U]): LodashFill2x13[T, U]
  def fill[T, U](start: __, end: Double, value: T, array: js.Array[U]): LodashFill1x14[T, U]
  def fill[T, U](start: __, end: Double, value: T, array: typings.lodash.mod.List[U]): LodashFill2x14[T, U]
  def fill[T, U](start: __, end: __, value: T, array: js.Array[U]): LodashFill1x12[T, U]
  def fill[T, U](start: __, end: __, value: T, array: typings.lodash.mod.List[U]): LodashFill2x12[T, U]
  @JSName("fill")
  var fill_Original: LodashFill
  @JSName("fill")
  def fill_TU_Array[T, U](start: Double, end: Double, value: T): js.Array[T | U]
  @JSName("fill")
  def fill_TU_List[T, U](start: Double, end: Double, value: T): typings.lodash.mod.List[T | U]
  @JSName("fill")
  def fill_TU_LodashFill1x12[T, U](start: __, end: __, value: T): LodashFill1x12[T, U]
  @JSName("fill")
  def fill_TU_LodashFill1x13[T, U](start: Double, end: __, value: T): LodashFill1x13[T, U]
  @JSName("fill")
  def fill_TU_LodashFill1x14[T, U](start: __, end: Double, value: T): LodashFill1x14[T, U]
  @JSName("fill")
  def fill_TU_LodashFill2x12[T, U](start: __, end: __, value: T): LodashFill2x12[T, U]
  @JSName("fill")
  def fill_TU_LodashFill2x13[T, U](start: Double, end: __, value: T): LodashFill2x13[T, U]
  @JSName("fill")
  def fill_TU_LodashFill2x14[T, U](start: __, end: Double, value: T): LodashFill2x14[T, U]
  @JSName("fill")
  def fill_U_LodashFill1x10[U](start: __, end: Double, value: __): LodashFill1x10[U]
  @JSName("fill")
  def fill_U_LodashFill1x11[U](start: Double, end: Double, value: __): LodashFill1x11[U]
  @JSName("fill")
  def fill_U_LodashFill1x9[U](start: Double, end: __, value: __): LodashFill1x9[U]
  @JSName("fill")
  def fill_U_LodashFill2x8[U](start: __, end: __, value: __): LodashFill2x8[U]
  
  def filter[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): js.Array[T]
  def filter[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def filter[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): js.Array[T]
  def filter[T](predicate: __): LodashFilter1x2[T]
  def filter[T /* <: js.Object */](predicate: __, collection: T): LodashFilter3x2[T]
  def filter[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashFilter1x2[T]
  def filter[T, S /* <: T */](
    predicate: ValueIteratorTypeGuard[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      S
    ]
  ): js.Array[S]
  def filter[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.Array[S]
  def filter[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: typings.lodash.mod.List[T]): js.Array[S]
  @JSName("filter")
  var filter_Original: LodashFilter
  @JSName("filter")
  def filter_TS_LodashFilter1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFilter1x1[T, S]
  @JSName("filter")
  def filter_TS_LodashFilter3x1[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFilter3x1[T, S]
  @JSName("filter")
  def filter_T_LodashFilter2x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFilter2x1[T]
  @JSName("filter")
  def filter_T_LodashFilter3x2[T /* <: js.Object */](predicate: __): LodashFilter3x2[T]
  
  def find[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): js.UndefOr[T]
  def find[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def find[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): js.UndefOr[T]
  def find[T /* <: js.Object */](predicate: __): LodashFind3x2[T]
  def find[T /* <: js.Object */](predicate: __, collection: T): LodashFind3x2[T]
  def find[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashFind1x2[T]
  def find[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFind1x1[T, S]
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S]
  def find[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: typings.lodash.mod.List[T]): js.UndefOr[S]
  
  def findFrom(predicate: __, fromIndex: Double): LodashFindFrom1x2
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindFrom2x1[T]
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindFrom2x3[T]
  def findFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def findFrom[T](
    predicate: ValueIterateeCustom[T, Boolean],
    fromIndex: Double,
    collection: typings.lodash.mod.List[T]
  ): js.UndefOr[T]
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindFrom2x5[T]
  def findFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __,
    collection: T
  ): LodashFindFrom4x5[T]
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, collection: typings.lodash.mod.List[T]): LodashFindFrom2x5[T]
  def findFrom[T /* <: js.Object */](predicate: __, fromIndex: Double, collection: T): LodashFindFrom3x6[T]
  def findFrom[T](predicate: __, fromIndex: Double, collection: typings.lodash.mod.List[T]): LodashFindFrom1x6[T]
  def findFrom[T /* <: js.Object */](predicate: __, fromIndex: __): LodashFindFrom3x4[T]
  def findFrom[T /* <: js.Object */](predicate: __, fromIndex: __, collection: T): LodashFindFrom3x4[T]
  def findFrom[T](predicate: __, fromIndex: __, collection: typings.lodash.mod.List[T]): LodashFindFrom1x4[T]
  def findFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindFrom3x1[T, S]
  def findFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): LodashFindFrom1x3[T, S]
  def findFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[S]
  def findFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double, collection: typings.lodash.mod.List[T]): js.UndefOr[S]
  def findFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __
  ): LodashFindFrom3x5[S]
  def findFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __,
    collection: T
  ): LodashFindFrom3x5[S]
  def findFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __, collection: typings.lodash.mod.List[T]): LodashFindFrom1x5[S]
  @JSName("findFrom")
  var findFrom_Original: LodashFindFrom
  @JSName("findFrom")
  def findFrom_TS_LodashFindFrom1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindFrom1x1[T, S]
  @JSName("findFrom")
  def findFrom_TS_LodashFindFrom1x5[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __): LodashFindFrom1x5[S]
  @JSName("findFrom")
  def findFrom_TS_LodashFindFrom3x3[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): LodashFindFrom3x3[T, S]
  @JSName("findFrom")
  def findFrom_TS_Union[T, S /* <: T */](
    predicate: ValueIteratorTypeGuard[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      S
    ],
    fromIndex: Double
  ): js.UndefOr[S]
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom1x4[T](predicate: __, fromIndex: __): LodashFindFrom1x4[T]
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom1x6[T](predicate: __, fromIndex: Double): LodashFindFrom1x6[T]
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom3x6[T /* <: js.Object */](predicate: __, fromIndex: Double): LodashFindFrom3x6[T]
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom4x5[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __
  ): LodashFindFrom4x5[T]
  @JSName("findFrom")
  def findFrom_T_Union[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ],
    fromIndex: Double
  ): js.UndefOr[T]
  
  def findIndex[T](predicate: ValueIterateeCustom[T, Boolean]): Double
  def findIndex[T](predicate: ValueIterateeCustom[T, Boolean], array: typings.lodash.mod.List[T]): Double
  def findIndex[T](predicate: __): LodashFindIndex1x2[T]
  def findIndex[T](predicate: __, array: typings.lodash.mod.List[T]): LodashFindIndex1x2[T]
  
  def findIndexFrom(predicate: __, fromIndex: Double): LodashFindIndexFrom1x2
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindIndexFrom1x1[T]
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): Double
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, array: typings.lodash.mod.List[T]): Double
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindIndexFrom1x5
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, array: typings.lodash.mod.List[T]): LodashFindIndexFrom1x5
  def findIndexFrom[T](predicate: __, fromIndex: Double, array: typings.lodash.mod.List[T]): LodashFindIndexFrom1x6[T]
  def findIndexFrom[T](predicate: __, fromIndex: __): LodashFindIndexFrom1x4[T]
  def findIndexFrom[T](predicate: __, fromIndex: __, array: typings.lodash.mod.List[T]): LodashFindIndexFrom1x4[T]
  @JSName("findIndexFrom")
  var findIndexFrom_Original: LodashFindIndexFrom
  @JSName("findIndexFrom")
  def findIndexFrom_T_LodashFindIndexFrom1x3[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindIndexFrom1x3[T]
  @JSName("findIndexFrom")
  def findIndexFrom_T_LodashFindIndexFrom1x6[T](predicate: __, fromIndex: Double): LodashFindIndexFrom1x6[T]
  
  @JSName("findIndex")
  var findIndex_Original: LodashFindIndex
  @JSName("findIndex")
  def findIndex_T_LodashFindIndex1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindIndex1x1[T]
  
  def findKey[T](predicate: ValueIteratee[T]): LodashFindKey1x1[T]
  def findKey[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): js.UndefOr[java.lang.String]
  def findKey[T](predicate: __): LodashFindKey1x2[T]
  def findKey[T](predicate: __, `object`: T): LodashFindKey1x2[T]
  @JSName("findKey")
  var findKey_Original: LodashFindKey
  @JSName("findKey")
  def findKey_T_Union[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): js.UndefOr[java.lang.String]
  
  def findLast[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): js.UndefOr[T]
  def findLast[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def findLast[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): js.UndefOr[T]
  def findLast[T](predicate: __): LodashFindLast1x2[T]
  def findLast[T /* <: js.Object */](predicate: __, collection: T): LodashFindLast3x2[T]
  def findLast[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashFindLast1x2[T]
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindLast3x1[T, S]
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S]
  def findLast[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: typings.lodash.mod.List[T]): js.UndefOr[S]
  
  def findLastFrom(predicate: __, fromIndex: Double): LodashFindLastFrom1x2
  def findLastFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastFrom2x1[T]
  def findLastFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindLastFrom2x3[T]
  def findLastFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def findLastFrom[T](
    predicate: ValueIterateeCustom[T, Boolean],
    fromIndex: Double,
    collection: typings.lodash.mod.List[T]
  ): js.UndefOr[T]
  def findLastFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __
  ): LodashFindLastFrom4x5[T]
  def findLastFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __,
    collection: T
  ): LodashFindLastFrom4x5[T]
  def findLastFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, collection: typings.lodash.mod.List[T]): LodashFindLastFrom2x5[T]
  def findLastFrom[T /* <: js.Object */](predicate: __, fromIndex: Double, collection: T): LodashFindLastFrom3x6[T]
  def findLastFrom[T](predicate: __, fromIndex: Double, collection: typings.lodash.mod.List[T]): LodashFindLastFrom1x6[T]
  def findLastFrom[T /* <: js.Object */](predicate: __, fromIndex: __): LodashFindLastFrom3x4[T]
  def findLastFrom[T /* <: js.Object */](predicate: __, fromIndex: __, collection: T): LodashFindLastFrom3x4[T]
  def findLastFrom[T](predicate: __, fromIndex: __, collection: typings.lodash.mod.List[T]): LodashFindLastFrom1x4[T]
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindLastFrom3x1[T, S]
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): LodashFindLastFrom3x3[T, S]
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[S]
  def findLastFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double, collection: typings.lodash.mod.List[T]): js.UndefOr[S]
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __
  ): LodashFindLastFrom3x5[S]
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __,
    collection: T
  ): LodashFindLastFrom3x5[S]
  def findLastFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __, collection: typings.lodash.mod.List[T]): LodashFindLastFrom1x5[S]
  @JSName("findLastFrom")
  var findLastFrom_Original: LodashFindLastFrom
  @JSName("findLastFrom")
  def findLastFrom_TS_LodashFindLastFrom1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindLastFrom1x1[T, S]
  @JSName("findLastFrom")
  def findLastFrom_TS_LodashFindLastFrom1x3[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): LodashFindLastFrom1x3[T, S]
  @JSName("findLastFrom")
  def findLastFrom_TS_LodashFindLastFrom1x5[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __): LodashFindLastFrom1x5[S]
  @JSName("findLastFrom")
  def findLastFrom_TS_Union[T, S /* <: T */](
    predicate: ValueIteratorTypeGuard[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      S
    ],
    fromIndex: Double
  ): js.UndefOr[S]
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom1x4[T](predicate: __, fromIndex: __): LodashFindLastFrom1x4[T]
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom1x6[T](predicate: __, fromIndex: Double): LodashFindLastFrom1x6[T]
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom2x5[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindLastFrom2x5[T]
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom3x6[T /* <: js.Object */](predicate: __, fromIndex: Double): LodashFindLastFrom3x6[T]
  @JSName("findLastFrom")
  def findLastFrom_T_Union[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ],
    fromIndex: Double
  ): js.UndefOr[T]
  
  def findLastIndex[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastIndex1x1[T]
  def findLastIndex[T](predicate: ValueIterateeCustom[T, Boolean], array: typings.lodash.mod.List[T]): Double
  def findLastIndex[T](predicate: __): LodashFindLastIndex1x2[T]
  def findLastIndex[T](predicate: __, array: typings.lodash.mod.List[T]): LodashFindLastIndex1x2[T]
  
  def findLastIndexFrom(predicate: __, fromIndex: Double): LodashFindLastIndexFrom1x2
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastIndexFrom1x1[T]
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindLastIndexFrom1x3[T]
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, array: typings.lodash.mod.List[T]): Double
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindLastIndexFrom1x5
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, array: typings.lodash.mod.List[T]): LodashFindLastIndexFrom1x5
  def findLastIndexFrom[T](predicate: __, fromIndex: Double, array: typings.lodash.mod.List[T]): LodashFindLastIndexFrom1x6[T]
  def findLastIndexFrom[T](predicate: __, fromIndex: __): LodashFindLastIndexFrom1x4[T]
  def findLastIndexFrom[T](predicate: __, fromIndex: __, array: typings.lodash.mod.List[T]): LodashFindLastIndexFrom1x4[T]
  @JSName("findLastIndexFrom")
  var findLastIndexFrom_Original: LodashFindLastIndexFrom
  @JSName("findLastIndexFrom")
  def findLastIndexFrom_T_Double[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): Double
  @JSName("findLastIndexFrom")
  def findLastIndexFrom_T_LodashFindLastIndexFrom1x6[T](predicate: __, fromIndex: Double): LodashFindLastIndexFrom1x6[T]
  
  @JSName("findLastIndex")
  var findLastIndex_Original: LodashFindLastIndex
  @JSName("findLastIndex")
  def findLastIndex_T_Double[T](predicate: ValueIterateeCustom[T, Boolean]): Double
  
  def findLastKey[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): js.UndefOr[java.lang.String]
  def findLastKey[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): js.UndefOr[java.lang.String]
  def findLastKey[T](predicate: __): LodashFindLastKey1x2[T]
  def findLastKey[T](predicate: __, `object`: T): LodashFindLastKey1x2[T]
  @JSName("findLastKey")
  var findLastKey_Original: LodashFindLastKey
  @JSName("findLastKey")
  def findLastKey_T_LodashFindLastKey1x1[T](predicate: ValueIteratee[T]): LodashFindLastKey1x1[T]
  
  @JSName("findLast")
  var findLast_Original: LodashFindLast
  @JSName("findLast")
  def findLast_TS_LodashFindLast1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindLast1x1[T, S]
  @JSName("findLast")
  def findLast_TS_Union[T, S /* <: T */](
    predicate: ValueIteratorTypeGuard[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      S
    ]
  ): js.UndefOr[S]
  @JSName("findLast")
  def findLast_T_LodashFindLast2x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLast2x1[T]
  @JSName("findLast")
  def findLast_T_LodashFindLast3x2[T /* <: js.Object */](predicate: __): LodashFindLast3x2[T]
  
  @JSName("find")
  var find_Original: LodashFind
  @JSName("find")
  def find_TS_LodashFind3x1[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFind3x1[T, S]
  @JSName("find")
  def find_TS_Union[T, S /* <: T */](
    predicate: ValueIteratorTypeGuard[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      S
    ]
  ): js.UndefOr[S]
  @JSName("find")
  def find_T_LodashFind1x2[T](predicate: __): LodashFind1x2[T]
  @JSName("find")
  def find_T_LodashFind2x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFind2x1[T]
  
  def first[T](): js.UndefOr[T]
  def first[T](array: typings.lodash.mod.List[T]): js.UndefOr[T]
  @JSName("first")
  var first_Original: LodashHead
  
  def flatMap(iteratee: java.lang.String): js.Array[Any]
  def flatMap(iteratee: java.lang.String, collection: js.Object): js.Array[Any]
  def flatMap(iteratee: js.Object): js.Array[Boolean]
  def flatMap(iteratee: js.Object, collection: js.Object): js.Array[Boolean]
  def flatMap(iteratee: __): LodashFlatMap3x2
  def flatMap(iteratee: __, collection: js.Object): LodashFlatMap3x2
  def flatMap[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMap2x2[T]
  def flatMap[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashFlatMap1x2[T]
  def flatMap[T, TResult](iteratee: js.Function1[/* value */ T, Many[TResult]]): LodashFlatMap1x1[T, TResult]
  def flatMap[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ],
    collection: T
  ): js.Array[TResult]
  def flatMap[T, TResult](iteratee: js.Function1[/* value */ T, Many[TResult]], collection: typings.lodash.mod.List[T]): js.Array[TResult]
  
  def flatMapDeep(iteratee: java.lang.String): js.Array[Any]
  def flatMapDeep(iteratee: java.lang.String, collection: js.Object): js.Array[Any]
  def flatMapDeep(iteratee: js.Object): LodashFlatMapDeep4x1
  def flatMapDeep(iteratee: js.Object, collection: js.Object): js.Array[Boolean]
  def flatMapDeep(iteratee: __): LodashFlatMapDeep3x2
  def flatMapDeep(iteratee: __, collection: js.Object): LodashFlatMapDeep3x2
  def flatMapDeep[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMapDeep2x2[T]
  def flatMapDeep[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashFlatMapDeep1x2[T]
  def flatMapDeep[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDeep2x1[T, TResult]
  def flatMapDeep[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: T
  ): js.Array[TResult]
  def flatMapDeep[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    collection: typings.lodash.mod.List[T]
  ): js.Array[TResult]
  @JSName("flatMapDeep")
  def flatMapDeep_Array(iteratee: js.Object): js.Array[Boolean]
  @JSName("flatMapDeep")
  def flatMapDeep_LodashFlatMapDeep3x1(iteratee: java.lang.String): LodashFlatMapDeep3x1
  @JSName("flatMapDeep")
  var flatMapDeep_Original: LodashFlatMapDeep
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult_Array[T, TResult](
    iteratee: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any) | (/* value */ T), 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): js.Array[TResult]
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult_LodashFlatMapDeep1x1[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LodashFlatMapDeep1x1[T, TResult]
  @JSName("flatMapDeep")
  def flatMapDeep_T_LodashFlatMapDeep1x2[T](iteratee: __): LodashFlatMapDeep1x2[T]
  @JSName("flatMapDeep")
  def flatMapDeep_T_LodashFlatMapDeep2x2[T /* <: js.Object */](iteratee: __): LodashFlatMapDeep2x2[T]
  
  def flatMapDepth(iteratee: java.lang.String): LodashFlatMapDepth3x1
  def flatMapDepth(iteratee: java.lang.String, depth: Double): LodashFlatMapDepth3x3
  def flatMapDepth(iteratee: java.lang.String, depth: Double, collection: js.Object): js.Array[Any]
  def flatMapDepth(iteratee: java.lang.String, depth: __): LodashFlatMapDepth3x5
  def flatMapDepth(iteratee: java.lang.String, depth: __, collection: js.Object): LodashFlatMapDepth3x5
  def flatMapDepth(iteratee: js.Object): LodashFlatMapDepth4x1
  def flatMapDepth(iteratee: js.Object, depth: Double): LodashFlatMapDepth4x3
  def flatMapDepth(iteratee: js.Object, depth: Double, collection: js.Object): js.Array[Boolean]
  def flatMapDepth(iteratee: js.Object, depth: __): LodashFlatMapDepth4x5
  def flatMapDepth(iteratee: js.Object, depth: __, collection: js.Object): LodashFlatMapDepth4x5
  def flatMapDepth(iteratee: __, depth: Double): LodashFlatMapDepth3x6
  def flatMapDepth(iteratee: __, depth: Double, collection: js.Object): LodashFlatMapDepth3x6
  def flatMapDepth(iteratee: __, depth: __): LodashFlatMapDepth3x4
  def flatMapDepth(iteratee: __, depth: __, collection: js.Object): LodashFlatMapDepth3x4
  def flatMapDepth[T /* <: js.Object */](iteratee: __, depth: Double, collection: T): LodashFlatMapDepth2x6[T]
  def flatMapDepth[T](iteratee: __, depth: Double, collection: typings.lodash.mod.List[T]): LodashFlatMapDepth1x6[T]
  def flatMapDepth[T /* <: js.Object */](iteratee: __, depth: __, collection: T): LodashFlatMapDepth2x4[T]
  def flatMapDepth[T](iteratee: __, depth: __, collection: typings.lodash.mod.List[T]): LodashFlatMapDepth1x4[T]
  def flatMapDepth[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth2x1[T, TResult]
  def flatMapDepth[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): LodashFlatMapDepth1x3[T, TResult]
  def flatMapDepth[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double,
    collection: T
  ): js.Array[TResult]
  def flatMapDepth[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double,
    collection: typings.lodash.mod.List[T]
  ): js.Array[TResult]
  def flatMapDepth[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: __): LodashFlatMapDepth1x5[TResult]
  def flatMapDepth[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: __,
    collection: T
  ): LodashFlatMapDepth2x5[TResult]
  def flatMapDepth[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: __,
    collection: typings.lodash.mod.List[T]
  ): LodashFlatMapDepth1x5[TResult]
  @JSName("flatMapDepth")
  def flatMapDepth_Array(iteratee: java.lang.String, depth: Double): js.Array[Any]
  @JSName("flatMapDepth")
  def flatMapDepth_Array(iteratee: js.Object, depth: Double): js.Array[Boolean]
  @JSName("flatMapDepth")
  def flatMapDepth_LodashFlatMapDepth1x2(iteratee: __, depth: Double): LodashFlatMapDepth1x2
  @JSName("flatMapDepth")
  var flatMapDepth_Original: LodashFlatMapDepth
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult_Array[T, TResult](
    iteratee: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any) | (/* value */ T), 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double
  ): js.Array[TResult]
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult_LodashFlatMapDepth1x1[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LodashFlatMapDepth1x1[T, TResult]
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult_LodashFlatMapDepth2x3[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double
  ): LodashFlatMapDepth2x3[T, TResult]
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult_LodashFlatMapDepth2x5[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: __
  ): LodashFlatMapDepth2x5[TResult]
  @JSName("flatMapDepth")
  def flatMapDepth_T_LodashFlatMapDepth1x4[T](iteratee: __, depth: __): LodashFlatMapDepth1x4[T]
  @JSName("flatMapDepth")
  def flatMapDepth_T_LodashFlatMapDepth1x6[T](iteratee: __, depth: Double): LodashFlatMapDepth1x6[T]
  @JSName("flatMapDepth")
  def flatMapDepth_T_LodashFlatMapDepth2x4[T /* <: js.Object */](iteratee: __, depth: __): LodashFlatMapDepth2x4[T]
  @JSName("flatMapDepth")
  def flatMapDepth_T_LodashFlatMapDepth2x6[T /* <: js.Object */](iteratee: __, depth: Double): LodashFlatMapDepth2x6[T]
  
  @JSName("flatMap")
  def flatMap_LodashFlatMap3x1(iteratee: java.lang.String): LodashFlatMap3x1
  @JSName("flatMap")
  def flatMap_LodashFlatMap4x1(iteratee: js.Object): LodashFlatMap4x1
  @JSName("flatMap")
  var flatMap_Original: LodashFlatMap
  @JSName("flatMap")
  def flatMap_TTResult_Array[T, TResult](
    iteratee: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any) | (/* value */ T), 
      Many[TResult]
    ]
  ): js.Array[TResult]
  @JSName("flatMap")
  def flatMap_TTResult_LodashFlatMap2x1[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ]
  ): LodashFlatMap2x1[T, TResult]
  @JSName("flatMap")
  def flatMap_T_LodashFlatMap1x2[T](iteratee: __): LodashFlatMap1x2[T]
  @JSName("flatMap")
  def flatMap_T_LodashFlatMap2x2[T /* <: js.Object */](iteratee: __): LodashFlatMap2x2[T]
  
  def flatten[T](): js.Array[T]
  def flatten[T](array: typings.lodash.mod.List[Many[T]]): js.Array[T]
  
  def flattenDeep[T](): js.Array[T]
  def flattenDeep[T](array: ListOfRecursiveArraysOrValues[T]): js.Array[T]
  @JSName("flattenDeep")
  var flattenDeep_Original: LodashFlattenDeep
  
  def flattenDepth(depth: Double): LodashFlattenDepth1x1
  def flattenDepth[T](depth: Double, array: ListOfRecursiveArraysOrValues[T]): js.Array[T]
  def flattenDepth[T](depth: __): LodashFlattenDepth1x2[T]
  def flattenDepth[T](depth: __, array: ListOfRecursiveArraysOrValues[T]): LodashFlattenDepth1x2[T]
  @JSName("flattenDepth")
  var flattenDepth_Original: LodashFlattenDepth
  @JSName("flattenDepth")
  def flattenDepth_T_Array[T](depth: Double): js.Array[T]
  
  @JSName("flatten")
  var flatten_Original: LodashFlatten
  
  def flip[T /* <: js.Function1[/* args */ Any, Any] */](func: T): T
  @JSName("flip")
  var flip_Original: LodashFlip
  
  def floor(n: Double): Double
  @JSName("floor")
  var floor_Original: LodashFloor
  
  def flow(func: (Many[js.Function1[/* repeated */ Any, Any]])*): js.Function1[/* repeated */ Any, Any]
  def flow[A /* <: js.Array[Any] */, R1, R2](f1: js.Function1[/* args */ A, R1], f2: js.Function1[/* a */ R1, R2]): js.Function1[/* args */ A, R2]
  def flow[A /* <: js.Array[Any] */, R1, R2, R3](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function1[/* args */ A, R3]
  def flow[A /* <: js.Array[Any] */, R1, R2, R3, R4](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function1[/* args */ A, R4]
  def flow[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function1[/* args */ A, R5]
  def flow[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function1[/* args */ A, R6]
  def flow[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function1[/* args */ A, R7]
  def flow[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    func: (Many[js.Function1[/* a */ Any, Any]])*
  ): js.Function1[/* args */ A, Any]
  
  def flowRight(func: (Many[js.Function1[/* repeated */ Any, Any]])*): js.Function1[/* repeated */ Any, Any]
  def flowRight[A /* <: js.Array[Any] */, R1, R2](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* args */ A, R1]): js.Function1[/* args */ A, R2]
  def flowRight[A /* <: js.Array[Any] */, R1, R2, R3](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R3]
  def flowRight[A /* <: js.Array[Any] */, R1, R2, R3, R4](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R4]
  def flowRight[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R5]
  def flowRight[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R6]
  def flowRight[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6, R7](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R7]
  @JSName("flowRight")
  var flowRight_Original: LodashFlowRight
  
  @JSName("flow")
  var flow_Original: LodashFlow
  
  def forEach[T](iteratee: js.Function1[/* value */ T, Any]): LodashForEach1x1[T]
  def forEach[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): js.UndefOr[T | Null]
  def forEach[T](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T]): js.Array[T]
  def forEach[T](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def forEach[T /* <: js.Object */](iteratee: __): LodashForEach6x2[T]
  def forEach[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach6x2[T]
  def forEach[T](iteratee: __, collection: js.Array[T]): LodashForEach1x2[T]
  def forEach[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashForEach2x2[T]
  def forEach[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TArray): TArray
  def forEach[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TArray): TArray
  def forEach[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Unit & TArray): LodashForEach4x2[T, TArray]
  def forEach[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Null & TArray): LodashForEach4x2[T, TArray]
  
  def forEachRight[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  def forEachRight[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): js.UndefOr[T | Null]
  def forEachRight[T](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T]): js.Array[T]
  def forEachRight[T](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def forEachRight[T /* <: js.Object */](iteratee: __): LodashForEachRight6x2[T]
  def forEachRight[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight6x2[T]
  def forEachRight[T](iteratee: __, collection: js.Array[T]): LodashForEachRight1x2[T]
  def forEachRight[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashForEachRight2x2[T]
  def forEachRight[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TArray): TArray
  def forEachRight[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TArray): TArray
  def forEachRight[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Null & TList): LodashForEachRight5x2[T, TList]
  def forEachRight[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Unit & TList): LodashForEachRight5x2[T, TList]
  @JSName("forEachRight")
  var forEachRight_Original: LodashForEachRight
  @JSName("forEachRight")
  def forEachRight_TTArray_LodashForEachRight4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Null & TArray): LodashForEachRight4x2[T, TArray]
  @JSName("forEachRight")
  def forEachRight_TTArray_LodashForEachRight4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Unit & TArray): LodashForEachRight4x2[T, TArray]
  @JSName("forEachRight")
  def forEachRight_TTArray_LodashForEachRight4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: js.Array[T] & TArray): LodashForEachRight4x2[T, TArray]
  @JSName("forEachRight")
  def forEachRight_TTArray_TArray[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T] & TArray): TArray
  @JSName("forEachRight")
  def forEachRight_TTList_LodashForEachRight5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: typings.lodash.mod.List[T] & TList): LodashForEachRight5x2[T, TList]
  @JSName("forEachRight")
  def forEachRight_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T] & TList): TList
  @JSName("forEachRight")
  def forEachRight_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TList): TList
  @JSName("forEachRight")
  def forEachRight_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TList): TList
  @JSName("forEachRight")
  def forEachRight_T_LodashForEachRight1x1[T](iteratee: js.Function1[/* value */ T, Any]): LodashForEachRight1x1[T]
  @JSName("forEachRight")
  def forEachRight_T_LodashForEachRight3x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight3x2[T]
  @JSName("forEachRight")
  def forEachRight_T_T[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): T
  
  @JSName("forEach")
  var forEach_Original: LodashForEach
  @JSName("forEach")
  def forEach_TTArray_LodashForEach4x2[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: js.Array[T] & TArray): LodashForEach4x2[T, TArray]
  @JSName("forEach")
  def forEach_TTArray_TArray[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T] & TArray): TArray
  @JSName("forEach")
  def forEach_TTList_LodashForEach5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Unit & TList): LodashForEach5x2[T, TList]
  @JSName("forEach")
  def forEach_TTList_LodashForEach5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: typings.lodash.mod.List[T] & TList): LodashForEach5x2[T, TList]
  @JSName("forEach")
  def forEach_TTList_LodashForEach5x2[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: __, collection: Null & TList): LodashForEach5x2[T, TList]
  @JSName("forEach")
  def forEach_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TList): TList
  @JSName("forEach")
  def forEach_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TList): TList
  @JSName("forEach")
  def forEach_TTList_TList[T, TList /* <: js.UndefOr[typings.lodash.mod.List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: typings.lodash.mod.List[T] & TList): TList
  @JSName("forEach")
  def forEach_T_LodashForEach3x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach3x2[T]
  @JSName("forEach")
  def forEach_T_T[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): T
  @JSName("forEach")
  def forEach_T_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  
  def forIn[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  def forIn[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): js.UndefOr[T | Null]
  def forIn[T](iteratee: __): LodashForIn2x2[T]
  def forIn[T](iteratee: __, `object`: T): LodashForIn2x2[T]
  
  def forInRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  def forInRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): js.UndefOr[T | Null]
  def forInRight[T](iteratee: __): LodashForInRight2x2[T]
  def forInRight[T](iteratee: __, `object`: T): LodashForInRight1x2[T]
  @JSName("forInRight")
  var forInRight_Original: LodashForInRight
  @JSName("forInRight")
  def forInRight_T_LodashForInRight1x1[T](iteratee: js.Function1[/* value */ T, Any]): LodashForInRight1x1[T]
  @JSName("forInRight")
  def forInRight_T_LodashForInRight2x2[T](iteratee: __, `object`: T): LodashForInRight2x2[T]
  @JSName("forInRight")
  def forInRight_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): T
  
  @JSName("forIn")
  var forIn_Original: LodashForIn
  @JSName("forIn")
  def forIn_T_LodashForIn1x1[T](iteratee: js.Function1[/* value */ T, Any]): LodashForIn1x1[T]
  @JSName("forIn")
  def forIn_T_LodashForIn1x2[T](iteratee: __, `object`: T): LodashForIn1x2[T]
  @JSName("forIn")
  def forIn_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): T
  
  def forOwn[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  def forOwn[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): js.UndefOr[T | Null]
  def forOwn[T](iteratee: __): LodashForOwn2x2[T]
  def forOwn[T](iteratee: __, `object`: T): LodashForOwn1x2[T]
  
  def forOwnRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ]
  ): js.UndefOr[T | Null]
  def forOwnRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): js.UndefOr[T | Null]
  def forOwnRight[T](iteratee: __): LodashForOwnRight2x2[T]
  def forOwnRight[T](iteratee: __, `object`: T): LodashForOwnRight1x2[T]
  @JSName("forOwnRight")
  var forOwnRight_Original: LodashForOwnRight
  @JSName("forOwnRight")
  def forOwnRight_T_LodashForOwnRight1x1[T](iteratee: js.Function1[/* value */ T, Any]): LodashForOwnRight1x1[T]
  @JSName("forOwnRight")
  def forOwnRight_T_LodashForOwnRight2x2[T](iteratee: __, `object`: T): LodashForOwnRight2x2[T]
  @JSName("forOwnRight")
  def forOwnRight_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): T
  
  @JSName("forOwn")
  var forOwn_Original: LodashForOwn
  @JSName("forOwn")
  def forOwn_T_LodashForOwn1x1[T](iteratee: js.Function1[/* value */ T, Any]): LodashForOwn1x1[T]
  @JSName("forOwn")
  def forOwn_T_LodashForOwn2x2[T](iteratee: __, `object`: T): LodashForOwn2x2[T]
  @JSName("forOwn")
  def forOwn_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): T
  
  def fromPairs(): Dictionary[Any]
  def fromPairs(pairs: typings.lodash.mod.List[js.Array[Any]]): Dictionary[Any]
  @JSName("fromPairs")
  var fromPairs_Original: LodashFromPairs
  @JSName("fromPairs")
  def fromPairs_T[T](): Dictionary[T]
  @JSName("fromPairs")
  def fromPairs_T[T](pairs: typings.lodash.mod.List[js.Tuple2[PropertyName, T]]): Dictionary[T]
  
  def functions(`object`: Any): js.Array[java.lang.String]
  
  def functionsIn(`object`: Any): js.Array[java.lang.String]
  @JSName("functionsIn")
  var functionsIn_Original: LodashFunctionsIn
  
  @JSName("functions")
  var functions_Original: LodashFunctions
  
  def get(path: Double): LodashGet9x1
  def get(path: PropertyPath): LodashGet11x1
  def get(path: PropertyPath, `object`: Any): Any
  def get(path: __): LodashGet11x2
  def get(path: __, `object`: Any): LodashGet12x2
  def get[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T]
  def get[T](path: __, `object`: NumericDictionary[T]): LodashGet10x2[T]
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashGet1x1[TObject, TKey]
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashGet3x1[TObject, TKey1, TKey2]
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGet5x1[TObject, TKey1, TKey2, TKey3]
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGet7x1[TObject, TKey1, TKey2, TKey3, TKey4]
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  
  def getOr(defaultValue: Any): LodashGetOr7x1
  def getOr(defaultValue: Any, path: PropertyPath): LodashGetOr7x3
  def getOr(defaultValue: Any, path: PropertyPath, `object`: Any): Any
  def getOr(defaultValue: Any, path: __, `object`: Any): LodashGetOr7x5
  def getOr(defaultValue: __, path: Double): LodashGetOr5x2
  def getOr(defaultValue: __, path: PropertyPath): LodashGetOr6x6
  def getOr(defaultValue: __, path: PropertyPath, `object`: Any): LodashGetOr7x6
  def getOr(defaultValue: __, path: __): LodashGetOr6x4
  def getOr(defaultValue: __, path: __, `object`: Any): LodashGetOr7x4
  def getOr[TDefault](defaultValue: TDefault, path: Double): LodashGetOr5x3[TDefault]
  def getOr[TDefault](defaultValue: TDefault, path: __): LodashGetOr6x5[TDefault]
  def getOr[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashGetOr5x6[T]
  def getOr[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashGetOr5x4[T]
  def getOr[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault
  def getOr[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashGetOr5x5[T, TDefault]
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashGetOr1x2[TObject, TKey]
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashGetOr1x6[TObject, TKey]
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x2[TObject, TKey1, TKey2]
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashGetOr2x6[TObject, TKey1, TKey2]
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3]
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3]
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x2[TObject, TKey1, TKey2, TKey3, TKey4]
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4]
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault]
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("getOr")
  def getOr_LodashGetOr6x2(defaultValue: __, path: PropertyPath): LodashGetOr6x2
  @JSName("getOr")
  var getOr_Original: LodashGetOr
  @JSName("getOr")
  def getOr_TDefault_LodashGetOr1x1[TDefault](defaultValue: TDefault): LodashGetOr1x1[TDefault]
  @JSName("getOr")
  def getOr_TDefault_LodashGetOr6x3[TDefault](defaultValue: TDefault, path: PropertyPath): LodashGetOr6x3[TDefault]
  @JSName("getOr")
  def getOr_TDefault_TDefault[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault
  @JSName("getOr")
  def getOr_TObjectTDefault_LodashGetOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __): LodashGetOr1x5[TObject, TDefault]
  @JSName("getOr")
  def getOr_TObjectTDefault_LodashGetOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashGetOr1x5[TObject, TDefault]
  @JSName("getOr")
  def getOr_TObjectTKey1TKey2TDefault_LodashGetOr2x3[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x3[TObject, TKey1, TKey2, TDefault]
  @JSName("getOr")
  def getOr_TObjectTKey1TKey2TKey3TDefault_LodashGetOr3x3[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x3[TObject, TKey1, TKey2, TKey3, TDefault]
  @JSName("getOr")
  def getOr_TObjectTKey1TKey2TKey3TKey4TDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("getOr")
  def getOr_TObjectTKey1TKey2TKey3TKey4_LodashGetOr4x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4]
  @JSName("getOr")
  def getOr_TObjectTKey1TKey2TKey3_LodashGetOr3x2[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x2[TObject, TKey1, TKey2, TKey3]
  @JSName("getOr")
  def getOr_TObjectTKey1TKey2_LodashGetOr2x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x6[TObject, TKey1, TKey2]
  @JSName("getOr")
  def getOr_TObjectTKeyTDefault_LodashGetOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashGetOr1x3[TObject, TKey, TDefault]
  @JSName("getOr")
  def getOr_TObjectTKeyTDefault_LodashGetOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashGetOr1x3[TObject, TKey, TDefault]
  @JSName("getOr")
  def getOr_TObjectTKeyTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("getOr")
  def getOr_TObjectTKeyTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("getOr")
  def getOr_TObjectTKey_LodashGetOr1x2[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashGetOr1x2[TObject, TKey]
  @JSName("getOr")
  def getOr_TObjectTKey_LodashGetOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashGetOr1x6[TObject, TKey]
  @JSName("getOr")
  def getOr_TObjectTKey_LodashGetOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey, `object`: TObject): LodashGetOr1x6[TObject, TKey]
  @JSName("getOr")
  def getOr_TObjectTKey_LodashGetOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashGetOr1x6[TObject, TKey]
  @JSName("getOr")
  def getOr_TObject_LodashGetOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __): LodashGetOr1x4[TObject]
  @JSName("getOr")
  def getOr_TObject_LodashGetOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashGetOr1x4[TObject]
  @JSName("getOr")
  def getOr_TTDefault_LodashGetOr5x5[T, TDefault](defaultValue: TDefault, path: __): LodashGetOr5x5[T, TDefault]
  @JSName("getOr")
  def getOr_TTDefault_Union[T, TDefault](defaultValue: TDefault, path: Double): T | TDefault
  @JSName("getOr")
  def getOr_T_LodashGetOr5x4[T](defaultValue: __, path: __): LodashGetOr5x4[T]
  @JSName("getOr")
  def getOr_T_LodashGetOr5x6[T](defaultValue: __, path: Double): LodashGetOr5x6[T]
  
  @JSName("get")
  var get_Original: LodashGet
  @JSName("get")
  def get_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("get")
  def get_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("get")
  def get_TObjectTKey1TKey2TKey3_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  @JSName("get")
  def get_TObjectTKey1TKey2TKey3_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  @JSName("get")
  def get_TObjectTKey1TKey2_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  @JSName("get")
  def get_TObjectTKey1TKey2_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  @JSName("get")
  def get_TObjectTKey_Any[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  @JSName("get")
  def get_TObjectTKey_LodashGet1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashGet1x1[TObject, TKey]
  @JSName("get")
  def get_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("get")
  def get_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("get")
  def get_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("get")
  def get_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("get")
  def get_TObject_LodashGet1x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashGet1x2[TObject]
  @JSName("get")
  def get_TObject_LodashGet2x2[TObject /* <: js.Object */](path: __): LodashGet2x2[TObject]
  @JSName("get")
  def get_TObject_LodashGet2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashGet2x2[TObject]
  @JSName("get")
  def get_T_LodashGet10x2[T](path: __): LodashGet10x2[T]
  @JSName("get")
  def get_T_LodashGet9x2[T](path: __, `object`: NumericDictionary[T]): LodashGet9x2[T]
  @JSName("get")
  def get_T_T[T](path: Double, `object`: NumericDictionary[T]): T
  @JSName("get")
  def get_T_Union[T](path: Double): js.UndefOr[T]
  @JSName("get")
  def get_Unit(path: PropertyPath): Unit
  
  def groupBy[T](iteratee: ValueIteratee[T]): LodashGroupBy1x1[T]
  def groupBy[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  def groupBy[T](iteratee: ValueIteratee[T], collection: typings.lodash.mod.List[T]): Dictionary[js.Array[T]]
  def groupBy[T /* <: js.Object */](iteratee: __): LodashGroupBy2x2[T]
  def groupBy[T /* <: js.Object */](iteratee: __, collection: T): LodashGroupBy2x2[T]
  def groupBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashGroupBy1x2[T]
  @JSName("groupBy")
  var groupBy_Original: LodashGroupBy
  @JSName("groupBy")
  def groupBy_T_Dictionary[T](
    iteratee: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): Dictionary[js.Array[T]]
  @JSName("groupBy")
  def groupBy_T_LodashGroupBy1x2[T](iteratee: __): LodashGroupBy1x2[T]
  
  def gt(value: Any): LodashGt1x1
  def gt(value: Any, other: Any): Boolean
  def gt(value: __, other: Any): LodashGt1x2
  @JSName("gt")
  var gt_Original: LodashGt
  
  def gte(value: Any): LodashGte1x1
  def gte(value: Any, other: Any): Boolean
  def gte(value: __, other: Any): LodashGte1x2
  @JSName("gte")
  var gte_Original: LodashGte
  
  def has(path: PropertyPath): LodashHas1x1
  def has[T](path: PropertyPath, `object`: T): Boolean
  def has[T](path: __, `object`: T): LodashHas1x2
  
  def hasIn(path: PropertyPath): LodashHasIn1x1
  def hasIn[T](path: PropertyPath, `object`: T): Boolean
  def hasIn[T](path: __, `object`: T): LodashHasIn1x2
  @JSName("hasIn")
  var hasIn_Original: LodashHasIn
  
  @JSName("has")
  var has_Original: LodashHas
  
  def head[T](): js.UndefOr[T]
  def head[T](array: typings.lodash.mod.List[T]): js.UndefOr[T]
  @JSName("head")
  var head_Original: LodashHead
  
  def identical(value: Any): LodashEq1x1
  def identical(value: Any, other: Any): Boolean
  def identical(value: __, other: Any): LodashEq1x2
  @JSName("identical")
  var identical_Original: LodashEq
  
  def identity(): Unit
  def identity[T](value: T): T
  @JSName("identity")
  var identity_Original: LodashIdentity
  
  def inRange(start: Double): LodashInRange1x1
  def inRange(start: Double, end: Double): LodashInRange1x3
  def inRange(start: Double, end: Double, n: Double): Boolean
  def inRange(start: Double, end: __, n: Double): LodashInRange1x5
  def inRange(start: __, end: Double): LodashInRange1x2
  def inRange(start: __, end: Double, n: Double): LodashInRange1x6
  def inRange(start: __, end: __, n: Double): LodashInRange1x4
  @JSName("inRange")
  var inRange_Original: LodashInRange
  
  def includes[T](target: T): LodashIncludes1x1[T]
  def includes[T](target: T, collection: Dictionary[T]): Boolean
  def includes[T](target: T, collection: NumericDictionary[T]): Boolean
  def includes[T](target: __): LodashIncludes1x2[T]
  def includes[T](target: __, collection: Dictionary[T]): LodashIncludes1x2[T]
  def includes[T](target: __, collection: NumericDictionary[T]): LodashIncludes1x2[T]
  
  def includesFrom(target: __, fromIndex: Double): LodashIncludesFrom1x2
  def includesFrom[T](target: T): LodashIncludesFrom1x1[T]
  def includesFrom[T](target: T, fromIndex: Double): Boolean
  def includesFrom[T](target: T, fromIndex: Double, collection: Dictionary[T]): Boolean
  def includesFrom[T](target: T, fromIndex: Double, collection: NumericDictionary[T]): Boolean
  def includesFrom[T](target: T, fromIndex: __): LodashIncludesFrom1x5
  def includesFrom[T](target: T, fromIndex: __, collection: Dictionary[T]): LodashIncludesFrom1x5
  def includesFrom[T](target: T, fromIndex: __, collection: NumericDictionary[T]): LodashIncludesFrom1x5
  def includesFrom[T](target: __, fromIndex: Double, collection: Dictionary[T]): LodashIncludesFrom1x6[T]
  def includesFrom[T](target: __, fromIndex: Double, collection: NumericDictionary[T]): LodashIncludesFrom1x6[T]
  def includesFrom[T](target: __, fromIndex: __): LodashIncludesFrom1x4[T]
  def includesFrom[T](target: __, fromIndex: __, collection: Dictionary[T]): LodashIncludesFrom1x4[T]
  def includesFrom[T](target: __, fromIndex: __, collection: NumericDictionary[T]): LodashIncludesFrom1x4[T]
  @JSName("includesFrom")
  var includesFrom_Original: LodashIncludesFrom
  @JSName("includesFrom")
  def includesFrom_T_LodashIncludesFrom1x3[T](target: T, fromIndex: Double): LodashIncludesFrom1x3[T]
  @JSName("includesFrom")
  def includesFrom_T_LodashIncludesFrom1x6[T](target: __, fromIndex: Double): LodashIncludesFrom1x6[T]
  
  @JSName("includes")
  var includes_Original: LodashIncludes
  @JSName("includes")
  def includes_T_Boolean[T](target: T): Boolean
  
  def indexBy[T](iteratee: ValueIterateeCustom[T, PropertyName]): LodashKeyBy1x1[T]
  def indexBy[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def indexBy[T](iteratee: ValueIterateeCustom[T, PropertyName], collection: typings.lodash.mod.List[T]): Dictionary[T]
  def indexBy[T /* <: js.Object */](iteratee: __): LodashKeyBy2x2[T]
  def indexBy[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T]
  def indexBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashKeyBy1x2[T]
  @JSName("indexBy")
  var indexBy_Original: LodashKeyBy
  @JSName("indexBy")
  def indexBy_T_Dictionary[T](
    iteratee: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      PropertyName
    ]
  ): Dictionary[T]
  @JSName("indexBy")
  def indexBy_T_LodashKeyBy1x2[T](iteratee: __): LodashKeyBy1x2[T]
  
  def indexOf[T](value: T): Double
  def indexOf[T](value: T, array: typings.lodash.mod.List[T]): Double
  def indexOf[T](value: __): LodashIndexOf1x2[T]
  def indexOf[T](value: __, array: typings.lodash.mod.List[T]): LodashIndexOf1x2[T]
  
  def indexOfFrom(value: __, fromIndex: Double): LodashIndexOfFrom1x2
  def indexOfFrom[T](value: T): LodashIndexOfFrom1x1[T]
  def indexOfFrom[T](value: T, fromIndex: Double): Double
  def indexOfFrom[T](value: T, fromIndex: Double, array: typings.lodash.mod.List[T]): Double
  def indexOfFrom[T](value: T, fromIndex: __): LodashIndexOfFrom1x5
  def indexOfFrom[T](value: T, fromIndex: __, array: typings.lodash.mod.List[T]): LodashIndexOfFrom1x5
  def indexOfFrom[T](value: __, fromIndex: Double, array: typings.lodash.mod.List[T]): LodashIndexOfFrom1x6[T]
  def indexOfFrom[T](value: __, fromIndex: __): LodashIndexOfFrom1x4[T]
  def indexOfFrom[T](value: __, fromIndex: __, array: typings.lodash.mod.List[T]): LodashIndexOfFrom1x4[T]
  @JSName("indexOfFrom")
  var indexOfFrom_Original: LodashIndexOfFrom
  @JSName("indexOfFrom")
  def indexOfFrom_T_LodashIndexOfFrom1x3[T](value: T, fromIndex: Double): LodashIndexOfFrom1x3[T]
  @JSName("indexOfFrom")
  def indexOfFrom_T_LodashIndexOfFrom1x6[T](value: __, fromIndex: Double): LodashIndexOfFrom1x6[T]
  
  @JSName("indexOf")
  var indexOf_Original: LodashIndexOf
  @JSName("indexOf")
  def indexOf_T_LodashIndexOf1x1[T](value: T): LodashIndexOf1x1[T]
  
  def init[T](): js.Array[T]
  def init[T](array: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("init")
  var init_Original: LodashInitial
  
  def initial[T](): js.Array[T]
  def initial[T](array: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("initial")
  var initial_Original: LodashInitial
  
  def intersection[T](): js.Array[T]
  def intersection[T](arrays2: Null, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def intersection[T](arrays2: Unit, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def intersection[T](arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def intersection[T](arrays2: typings.lodash.mod.List[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  def intersection[T](arrays2: __): LodashIntersection1x2[T]
  def intersection[T](arrays2: __, arrays: typings.lodash.mod.List[T]): LodashIntersection1x2[T]
  
  def intersectionBy[T1](iteratee: __): LodashIntersectionBy1x2[T1]
  def intersectionBy[T1](iteratee: __, array: typings.lodash.mod.List[T1]): LodashIntersectionBy1x2[T1]
  def intersectionBy[T2](iteratee: __, array: __, values: typings.lodash.mod.List[T2]): LodashIntersectionBy1x4[T2]
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashIntersectionBy1x1[T1, T2]
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Null, values: typings.lodash.mod.List[T2]): js.Array[T1]
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: typings.lodash.mod.List[T1]): LodashIntersectionBy1x3[T1, T2]
  def intersectionBy[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: typings.lodash.mod.List[T1],
    values: typings.lodash.mod.List[T2]
  ): js.Array[T1]
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: typings.lodash.mod.List[T2]): LodashIntersectionBy1x5[T1]
  def intersectionBy[T1, T2](iteratee: __, array: Null, values: typings.lodash.mod.List[T2]): LodashIntersectionBy1x6[T1, T2]
  def intersectionBy[T1, T2](iteratee: __, array: typings.lodash.mod.List[T1], values: typings.lodash.mod.List[T2]): LodashIntersectionBy1x6[T1, T2]
  @JSName("intersectionBy")
  var intersectionBy_Original: LodashIntersectionBy
  @JSName("intersectionBy")
  def intersectionBy_T1T2_LodashIntersectionBy1x3[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashIntersectionBy1x3[T1, T2]
  
  def intersectionWith[T1](comparator: __): LodashIntersectionWith1x2[T1]
  def intersectionWith[T1](comparator: __, array: typings.lodash.mod.List[T1]): LodashIntersectionWith1x2[T1]
  def intersectionWith[T2](comparator: __, array: __, values: typings.lodash.mod.List[T2]): LodashIntersectionWith1x4[T2]
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2]): LodashIntersectionWith1x3[T1, T2]
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: Null, values: typings.lodash.mod.List[T2]): js.Array[T1]
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: Unit, values: typings.lodash.mod.List[T2]): js.Array[T1]
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: typings.lodash.mod.List[T1]): LodashIntersectionWith1x3[T1, T2]
  def intersectionWith[T1, T2](
    comparator: Comparator2[T1, T2],
    array: typings.lodash.mod.List[T1],
    values: typings.lodash.mod.List[T2]
  ): js.Array[T1]
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: __, values: typings.lodash.mod.List[T2]): LodashIntersectionWith1x5[T1]
  def intersectionWith[T1, T2](comparator: __, array: Null, values: typings.lodash.mod.List[T2]): LodashIntersectionWith1x6[T1, T2]
  def intersectionWith[T1, T2](comparator: __, array: Unit, values: typings.lodash.mod.List[T2]): LodashIntersectionWith1x6[T1, T2]
  def intersectionWith[T1, T2](comparator: __, array: typings.lodash.mod.List[T1], values: typings.lodash.mod.List[T2]): LodashIntersectionWith1x6[T1, T2]
  @JSName("intersectionWith")
  var intersectionWith_Original: LodashIntersectionWith
  @JSName("intersectionWith")
  def intersectionWith_T1T2_LodashIntersectionWith1x1[T1, T2](comparator: Comparator2[T1, T2]): LodashIntersectionWith1x1[T1, T2]
  
  @JSName("intersection")
  var intersection_Original: LodashIntersection
  @JSName("intersection")
  def intersection_T_LodashIntersection1x1[T](): LodashIntersection1x1[T]
  @JSName("intersection")
  def intersection_T_LodashIntersection1x1[T](arrays2: typings.lodash.mod.List[T]): LodashIntersection1x1[T]
  
  def invert(`object`: js.Object): Dictionary[java.lang.String]
  
  def invertBy[T](interatee: ValueIteratee[T]): LodashInvertBy1x1[T]
  def invertBy[T /* <: js.Object */](
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): Dictionary[js.Array[java.lang.String]]
  def invertBy[T](interatee: ValueIteratee[T], `object`: Dictionary[T]): Dictionary[js.Array[java.lang.String]]
  def invertBy[T](interatee: ValueIteratee[T], `object`: NumericDictionary[T]): Dictionary[js.Array[java.lang.String]]
  def invertBy[T /* <: js.Object */](interatee: __): LodashInvertBy2x2[T]
  def invertBy[T /* <: js.Object */](interatee: __, `object`: T): LodashInvertBy2x2[T]
  def invertBy[T](interatee: __, `object`: Dictionary[T]): LodashInvertBy1x2[T]
  def invertBy[T](interatee: __, `object`: NumericDictionary[T]): LodashInvertBy1x2[T]
  @JSName("invertBy")
  var invertBy_Original: LodashInvertBy
  @JSName("invertBy")
  def invertBy_T_Dictionary[T](
    interatee: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): Dictionary[js.Array[java.lang.String]]
  @JSName("invertBy")
  def invertBy_T_LodashInvertBy1x2[T](interatee: __): LodashInvertBy1x2[T]
  
  def invertObj(`object`: js.Object): Dictionary[java.lang.String]
  @JSName("invertObj")
  var invertObj_Original: LodashInvert
  
  @JSName("invert")
  var invert_Original: LodashInvert
  
  def invoke(path: PropertyPath): LodashInvoke1x1
  def invoke(path: PropertyPath, `object`: Any): Any
  def invoke(path: __, `object`: Any): LodashInvoke1x2
  
  def invokeArgs(path: PropertyPath): LodashInvokeArgs1x1
  def invokeArgs(path: PropertyPath, args: js.Array[Any]): LodashInvokeArgs1x3
  def invokeArgs(path: PropertyPath, args: js.Array[Any], `object`: Any): Any
  def invokeArgs(path: PropertyPath, args: __, `object`: Any): LodashInvokeArgs1x5
  def invokeArgs(path: __, args: js.Array[Any]): LodashInvokeArgs1x2
  def invokeArgs(path: __, args: js.Array[Any], `object`: Any): LodashInvokeArgs1x6
  def invokeArgs(path: __, args: __, `object`: Any): LodashInvokeArgs1x4
  
  def invokeArgsMap(methodNameOrMethod: __, args: js.Array[Any]): LodashInvokeArgsMap1x6
  def invokeArgsMap(methodNameOrMethod: __, args: js.Array[Any], collection: js.Object): LodashInvokeArgsMap1x6
  def invokeArgsMap(methodNameOrMethod: __, args: __): LodashInvokeArgsMap1x4
  def invokeArgsMap(methodNameOrMethod: __, args: __, collection: js.Object): LodashInvokeArgsMap1x4
  def invokeArgsMap(methodName: java.lang.String): LodashInvokeArgsMap1x1
  def invokeArgsMap(methodName: java.lang.String, args: js.Array[Any]): LodashInvokeArgsMap1x3
  def invokeArgsMap(methodName: java.lang.String, args: js.Array[Any], collection: js.Object): js.Array[Any]
  def invokeArgsMap(methodName: java.lang.String, args: __): LodashInvokeArgsMap1x5
  def invokeArgsMap(methodName: java.lang.String, args: __, collection: js.Object): LodashInvokeArgsMap1x5
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ Any, TResult]): LodashInvokeArgsMap2x1[TResult]
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ Any, TResult], args: js.Array[Any]): js.Array[TResult]
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ Any, TResult], args: js.Array[Any], collection: js.Object): js.Array[TResult]
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ Any, TResult], args: __): LodashInvokeArgsMap2x5[TResult]
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ Any, TResult], args: __, collection: js.Object): LodashInvokeArgsMap2x5[TResult]
  @JSName("invokeArgsMap")
  def invokeArgsMap_Array(methodName: java.lang.String, args: js.Array[Any]): js.Array[Any]
  @JSName("invokeArgsMap")
  def invokeArgsMap_LodashInvokeArgsMap1x2(methodNameOrMethod: __, args: js.Array[Any]): LodashInvokeArgsMap1x2
  @JSName("invokeArgsMap")
  var invokeArgsMap_Original: LodashInvokeArgsMap
  @JSName("invokeArgsMap")
  def invokeArgsMap_TResult_LodashInvokeArgsMap2x3[TResult](method: js.Function1[/* repeated */ Any, TResult], args: js.Array[Any]): LodashInvokeArgsMap2x3[TResult]
  
  @JSName("invokeArgs")
  var invokeArgs_Original: LodashInvokeArgs
  
  def invokeMap(methodNameOrMethod: __): LodashInvokeMap1x2
  def invokeMap(methodNameOrMethod: __, collection: js.Object): LodashInvokeMap1x2
  def invokeMap(methodName: java.lang.String): js.Array[Any]
  def invokeMap(methodName: java.lang.String, collection: js.Object): js.Array[Any]
  def invokeMap[TResult](method: js.Function1[/* repeated */ Any, TResult]): js.Array[TResult]
  def invokeMap[TResult](method: js.Function1[/* repeated */ Any, TResult], collection: js.Object): js.Array[TResult]
  @JSName("invokeMap")
  def invokeMap_LodashInvokeMap1x1(methodName: java.lang.String): LodashInvokeMap1x1
  @JSName("invokeMap")
  var invokeMap_Original: LodashInvokeMap
  @JSName("invokeMap")
  def invokeMap_TResult_LodashInvokeMap2x1[TResult](method: js.Function1[/* repeated */ Any, TResult]): LodashInvokeMap2x1[TResult]
  
  @JSName("invoke")
  var invoke_Original: LodashInvoke
  
  def isArguments(value: Any): /* is std.IArguments */ Boolean
  @JSName("isArguments")
  var isArguments_Original: LodashIsArguments
  
  def isArray(value: Any): /* is std.Array<any> */ Boolean
  
  def isArrayBuffer(value: Any): /* is std.ArrayBuffer */ Boolean
  @JSName("isArrayBuffer")
  var isArrayBuffer_Original: LodashIsArrayBuffer
  
  def isArrayLike(): /* is never */ Boolean
  def isArrayLike(value: js.Function1[/* repeated */ Any, Any]): /* is never */ Boolean
  def isArrayLike(value: Any): /* is lodash.anon.Length */ Boolean
  
  def isArrayLikeObject(): /* is never */ Boolean
  def isArrayLikeObject(value: java.lang.String): /* is never */ Boolean
  def isArrayLikeObject(value: js.Function1[/* repeated */ Any, Any]): /* is never */ Boolean
  def isArrayLikeObject(value: Any): Boolean
  def isArrayLikeObject(value: Boolean): /* is never */ Boolean
  def isArrayLikeObject(value: Double): /* is never */ Boolean
  def isArrayLikeObject(value: FunctionBase): /* is never */ Boolean
  @JSName("isArrayLikeObject")
  var isArrayLikeObject_Original: LodashIsArrayLikeObject
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T[T /* <: LodashAnyHack */](value: T): Boolean
  
  @JSName("isArrayLike")
  var isArrayLike_Original: LodashIsArrayLike
  @JSName("isArrayLike")
  def isArrayLike_T[T /* <: LodashAnyHack */](t: T): Boolean
  
  @JSName("isArray")
  var isArray_Original: LodashIsArray
  
  def isBoolean(value: Any): /* is boolean */ Boolean
  @JSName("isBoolean")
  var isBoolean_Original: LodashIsBoolean
  
  def isBuffer(value: Any): Boolean
  @JSName("isBuffer")
  var isBuffer_Original: LodashIsBuffer
  
  def isDate(value: Any): /* is std.Date */ Boolean
  @JSName("isDate")
  var isDate_Original: LodashIsDate
  
  def isElement(value: Any): Boolean
  @JSName("isElement")
  var isElement_Original: LodashIsElement
  
  def isEmpty(): Boolean
  def isEmpty(value: java.lang.String): Boolean
  def isEmpty(value: js.Array[Any]): Boolean
  def isEmpty(value: Any): Boolean
  def isEmpty(value: typings.lodash.mod.List[Any]): Boolean
  def isEmpty(value: Map[Any, Any]): Boolean
  def isEmpty(value: Set[Any]): Boolean
  @JSName("isEmpty")
  var isEmpty_Original: LodashIsEmpty
  @JSName("isEmpty")
  def isEmpty_T[T /* <: js.Object */](): Boolean
  @JSName("isEmpty")
  def isEmpty_T[T /* <: TrapAny */](value: T): Boolean
  
  def isEqual(value: Any): LodashIsEqual1x1
  def isEqual(value: Any, other: Any): Boolean
  def isEqual(value: __, other: Any): LodashIsEqual1x2
  
  def isEqualWith(customizer: IsEqualCustomizer): LodashIsEqualWith1x1
  def isEqualWith(customizer: IsEqualCustomizer, value: Any): LodashIsEqualWith1x3
  def isEqualWith(customizer: IsEqualCustomizer, value: Any, other: Any): Boolean
  def isEqualWith(customizer: IsEqualCustomizer, value: __, other: Any): LodashIsEqualWith1x5
  def isEqualWith(customizer: __, value: Any): LodashIsEqualWith1x2
  def isEqualWith(customizer: __, value: Any, other: Any): LodashIsEqualWith1x6
  def isEqualWith(customizer: __, value: __, other: Any): LodashIsEqualWith1x4
  @JSName("isEqualWith")
  var isEqualWith_Original: LodashIsEqualWith
  
  @JSName("isEqual")
  var isEqual_Original: LodashIsEqual
  
  def isError(value: Any): /* is std.Error */ Boolean
  @JSName("isError")
  var isError_Original: LodashIsError
  
  def isFinite(value: Any): Boolean
  @JSName("isFinite")
  var isFinite_Original: LodashIsFinite
  
  def isFunction(value: Any): Boolean
  @JSName("isFunction")
  var isFunction_Original: LodashIsFunction
  
  def isInteger(value: Any): Boolean
  @JSName("isInteger")
  var isInteger_Original: LodashIsInteger
  
  def isLength(value: Any): Boolean
  @JSName("isLength")
  var isLength_Original: LodashIsLength
  
  def isMap(value: Any): /* is std.Map<any, any> */ Boolean
  @JSName("isMap")
  var isMap_Original: LodashIsMap
  
  def isMatch(source: js.Object): LodashIsMatch1x1
  def isMatch(source: js.Object, `object`: js.Object): Boolean
  def isMatch(source: __, `object`: js.Object): LodashIsMatch1x2
  
  def isMatchWith(customizer: __, source: js.Object): LodashIsMatchWith1x2
  def isMatchWith(customizer: __, source: js.Object, `object`: js.Object): LodashIsMatchWith1x6
  def isMatchWith(customizer: __, source: __, `object`: js.Object): LodashIsMatchWith1x4
  def isMatchWith(customizer: isMatchWithCustomizer): LodashIsMatchWith1x1
  def isMatchWith(customizer: isMatchWithCustomizer, source: js.Object): LodashIsMatchWith1x3
  def isMatchWith(customizer: isMatchWithCustomizer, source: js.Object, `object`: js.Object): Boolean
  def isMatchWith(customizer: isMatchWithCustomizer, source: __, `object`: js.Object): LodashIsMatchWith1x5
  @JSName("isMatchWith")
  var isMatchWith_Original: LodashIsMatchWith
  
  @JSName("isMatch")
  var isMatch_Original: LodashIsMatch
  
  def isNaN(value: Any): Boolean
  @JSName("isNaN")
  var isNaN_Original: LodashIsNaN
  
  def isNative(value: Any): Boolean
  @JSName("isNative")
  var isNative_Original: LodashIsNative
  
  def isNil(value: Any): Boolean
  @JSName("isNil")
  var isNil_Original: LodashIsNil
  
  def isNull(value: Any): /* is null */ Boolean
  @JSName("isNull")
  var isNull_Original: LodashIsNull
  
  def isNumber(value: Any): /* is number */ Boolean
  @JSName("isNumber")
  var isNumber_Original: LodashIsNumber
  
  def isObject(value: Any): /* is object */ Boolean
  
  def isObjectLike(value: Any): Boolean
  @JSName("isObjectLike")
  var isObjectLike_Original: LodashIsObjectLike
  
  @JSName("isObject")
  var isObject_Original: LodashIsObject
  
  def isPlainObject(value: Any): Boolean
  @JSName("isPlainObject")
  var isPlainObject_Original: LodashIsPlainObject
  
  def isRegExp(value: Any): /* is std.RegExp */ Boolean
  @JSName("isRegExp")
  var isRegExp_Original: LodashIsRegExp
  
  def isSafeInteger(value: Any): Boolean
  @JSName("isSafeInteger")
  var isSafeInteger_Original: LodashIsSafeInteger
  
  def isSet(value: Any): /* is std.Set<any> */ Boolean
  @JSName("isSet")
  var isSet_Original: LodashIsSet
  
  def isString(value: Any): /* is string */ Boolean
  @JSName("isString")
  var isString_Original: LodashIsString
  
  def isSymbol(value: Any): /* is symbol */ Boolean
  @JSName("isSymbol")
  var isSymbol_Original: LodashIsSymbol
  
  def isTypedArray(value: Any): Boolean
  @JSName("isTypedArray")
  var isTypedArray_Original: LodashIsTypedArray
  
  def isUndefined(value: Any): /* is undefined */ Boolean
  @JSName("isUndefined")
  var isUndefined_Original: LodashIsUndefined
  
  def isWeakMap(value: Any): /* is std.WeakMap<object, any> */ Boolean
  @JSName("isWeakMap")
  var isWeakMap_Original: LodashIsWeakMap
  
  def isWeakSet(value: Any): /* is std.WeakSet<object> */ Boolean
  @JSName("isWeakSet")
  var isWeakSet_Original: LodashIsWeakSet
  
  def iteratee(func: java.lang.String): js.Function1[/* repeated */ Any, Any]
  def iteratee(func: js.Object): js.Function1[/* repeated */ Any, Any]
  def iteratee[TFunction /* <: js.Function1[/* repeated */ Any, Any] */](func: TFunction): TFunction
  @JSName("iteratee")
  var iteratee_Original: LodashIteratee
  
  def join(separator: java.lang.String): LodashJoin1x1
  def join(separator: java.lang.String, array: typings.lodash.mod.List[Any]): java.lang.String
  def join(separator: __): LodashJoin1x2
  def join(separator: __, array: typings.lodash.mod.List[Any]): LodashJoin1x2
  @JSName("join")
  var join_Original: LodashJoin
  @JSName("join")
  def join_String(separator: java.lang.String): java.lang.String
  
  def juxt[TResult](iteratees: Many[js.Function1[/* repeated */ Any, TResult]]): js.Function1[/* repeated */ Any, js.Array[TResult]]
  @JSName("juxt")
  var juxt_Original: LodashOver
  
  def kebabCase(string: java.lang.String): java.lang.String
  @JSName("kebabCase")
  var kebabCase_Original: LodashKebabCase
  
  def keyBy[T](iteratee: ValueIterateeCustom[T, PropertyName]): LodashKeyBy1x1[T]
  def keyBy[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def keyBy[T](iteratee: ValueIterateeCustom[T, PropertyName], collection: typings.lodash.mod.List[T]): Dictionary[T]
  def keyBy[T /* <: js.Object */](iteratee: __): LodashKeyBy2x2[T]
  def keyBy[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T]
  def keyBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashKeyBy1x2[T]
  @JSName("keyBy")
  var keyBy_Original: LodashKeyBy
  @JSName("keyBy")
  def keyBy_T_Dictionary[T](
    iteratee: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      PropertyName
    ]
  ): Dictionary[T]
  @JSName("keyBy")
  def keyBy_T_LodashKeyBy1x2[T](iteratee: __): LodashKeyBy1x2[T]
  
  def keys(`object`: Any): js.Array[java.lang.String]
  
  def keysIn(`object`: Any): js.Array[java.lang.String]
  @JSName("keysIn")
  var keysIn_Original: LodashKeysIn
  
  @JSName("keys")
  var keys_Original: LodashKeys
  
  def last[T](): js.UndefOr[T]
  def last[T](array: typings.lodash.mod.List[T]): js.UndefOr[T]
  
  def lastIndexOf[T](value: T): Double
  def lastIndexOf[T](value: T, array: typings.lodash.mod.List[T]): Double
  def lastIndexOf[T](value: __): LodashLastIndexOf1x2[T]
  def lastIndexOf[T](value: __, array: typings.lodash.mod.List[T]): LodashLastIndexOf1x2[T]
  
  def lastIndexOfFrom(value: __, fromIndex: Double): LodashLastIndexOfFrom1x2
  def lastIndexOfFrom[T](value: T): LodashLastIndexOfFrom1x1[T]
  def lastIndexOfFrom[T](value: T, fromIndex: Double): Double
  def lastIndexOfFrom[T](value: T, fromIndex: Double, array: typings.lodash.mod.List[T]): Double
  def lastIndexOfFrom[T](value: T, fromIndex: __): LodashLastIndexOfFrom1x5
  def lastIndexOfFrom[T](value: T, fromIndex: __, array: typings.lodash.mod.List[T]): LodashLastIndexOfFrom1x5
  def lastIndexOfFrom[T](value: __, fromIndex: Double, array: typings.lodash.mod.List[T]): LodashLastIndexOfFrom1x6[T]
  def lastIndexOfFrom[T](value: __, fromIndex: __): LodashLastIndexOfFrom1x4[T]
  def lastIndexOfFrom[T](value: __, fromIndex: __, array: typings.lodash.mod.List[T]): LodashLastIndexOfFrom1x4[T]
  @JSName("lastIndexOfFrom")
  var lastIndexOfFrom_Original: LodashLastIndexOfFrom
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_T_LodashLastIndexOfFrom1x3[T](value: T, fromIndex: Double): LodashLastIndexOfFrom1x3[T]
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_T_LodashLastIndexOfFrom1x6[T](value: __, fromIndex: Double): LodashLastIndexOfFrom1x6[T]
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true(value: __, fromIndex: `true`): LodashLastIndexOfFrom1x2
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true[T](value: T, fromIndex: `true`): Double
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true[T](value: T, fromIndex: `true`, array: typings.lodash.mod.List[T]): Double
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true[T](value: __, fromIndex: `true`, array: typings.lodash.mod.List[T]): LodashLastIndexOfFrom1x6[T]
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true_T_LodashLastIndexOfFrom1x3[T](value: T, fromIndex: `true`): LodashLastIndexOfFrom1x3[T]
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true_T_LodashLastIndexOfFrom1x6[T](value: __, fromIndex: `true`): LodashLastIndexOfFrom1x6[T]
  
  @JSName("lastIndexOf")
  var lastIndexOf_Original: LodashLastIndexOf
  @JSName("lastIndexOf")
  def lastIndexOf_T_LodashLastIndexOf1x1[T](value: T): LodashLastIndexOf1x1[T]
  
  @JSName("last")
  var last_Original: LodashLast
  
  def lowerCase(string: java.lang.String): java.lang.String
  @JSName("lowerCase")
  var lowerCase_Original: LodashLowerCase
  
  def lowerFirst(string: java.lang.String): java.lang.String
  @JSName("lowerFirst")
  var lowerFirst_Original: LodashLowerFirst
  
  def lt(value: Any): LodashLt1x1
  def lt(value: Any, other: Any): Boolean
  def lt(value: __, other: Any): LodashLt1x2
  @JSName("lt")
  var lt_Original: LodashLt
  
  def lte(value: Any): LodashLte1x1
  def lte(value: Any, other: Any): Boolean
  def lte(value: __, other: Any): LodashLte1x2
  @JSName("lte")
  var lte_Original: LodashLte
  
  def map(iteratee: java.lang.String): LodashMap5x1
  def map(iteratee: js.Object): LodashMap6x1
  def map[T](iteratee: java.lang.String, collection: Dictionary[T]): js.Array[Any]
  def map[T](iteratee: java.lang.String, collection: NumericDictionary[T]): js.Array[Any]
  def map[T](iteratee: js.Object, collection: Dictionary[T]): js.Array[Boolean]
  def map[T](iteratee: js.Object, collection: NumericDictionary[T]): js.Array[Boolean]
  def map[T](iteratee: __): LodashMap2x2[T]
  def map[T /* <: js.Object */](iteratee: __, collection: T): LodashMap3x2[T]
  def map[T](iteratee: __, collection: js.Array[T]): LodashMap1x2[T]
  def map[T](iteratee: __, collection: Dictionary[T]): LodashMap4x2[T]
  def map[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashMap2x2[T]
  def map[T](iteratee: __, collection: NumericDictionary[T]): LodashMap4x2[T]
  def map[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): LodashMap4x1[T, K]
  def map[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: Dictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  def map[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: NumericDictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  def map[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): LodashMap1x1[T, TResult]
  def map[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    collection: T
  ): js.Array[TResult]
  def map[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: js.Array[T]): js.Array[TResult]
  def map[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: typings.lodash.mod.List[T]): js.Array[TResult]
  
  def mapKeys(iteratee: ValueIteratee[java.lang.String]): LodashMapKeys2x1
  def mapKeys[T /* <: js.Object */](iteratee: ValueIteratee[java.lang.String], `object`: T): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def mapKeys[T](iteratee: ValueIteratee[Double], `object`: typings.lodash.mod.List[T]): Dictionary[T]
  def mapKeys[T](iteratee: __): LodashMapKeys1x2[T]
  def mapKeys[T /* <: js.Object */](iteratee: __, `object`: T): LodashMapKeys2x2[T]
  def mapKeys[T](iteratee: __, `object`: typings.lodash.mod.List[T]): LodashMapKeys1x2[T]
  @JSName("mapKeys")
  def mapKeys_LodashMapKeys1x1(iteratee: ValueIteratee[Double]): LodashMapKeys1x1
  @JSName("mapKeys")
  var mapKeys_Original: LodashMapKeys
  @JSName("mapKeys")
  def mapKeys_T_Dictionary[T](iteratee: ValueIteratee[Double | java.lang.String]): Dictionary[T]
  @JSName("mapKeys")
  def mapKeys_T_LodashMapKeys2x2[T /* <: js.Object */](iteratee: __): LodashMapKeys2x2[T]
  
  def mapValues(iteratee: java.lang.String): LodashMapValues6x1
  def mapValues(iteratee: js.Object): LodashMapValues3x1
  def mapValues[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: Dictionary[T]): LodashMapValues1x2[T]
  def mapValues[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: NumericDictionary[T]): LodashMapValues1x2[T]
  def mapValues[T /* <: js.Object */](callbackOrIterateeOrIteratee: __): LodashMapValues2x2[T]
  def mapValues[T /* <: js.Object */](callbackOrIterateeOrIteratee: __, obj: T): LodashMapValues2x2[T]
  def mapValues[T /* <: js.Object */](iteratee: java.lang.String, obj: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: any} */ js.Any
  def mapValues[T](iteratee: java.lang.String, obj: Dictionary[T]): Dictionary[Any]
  def mapValues[T](iteratee: java.lang.String, obj: NumericDictionary[T]): Dictionary[Any]
  def mapValues[T /* <: js.Object */](iteratee: js.Object, obj: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: boolean} */ js.Any
  def mapValues[T](iteratee: js.Object, obj: Dictionary[T]): Dictionary[Boolean]
  def mapValues[T](iteratee: js.Object, obj: NumericDictionary[T]): Dictionary[Boolean]
  def mapValues[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: TResult} */ js.Any
  def mapValues[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    obj: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: TResult} */ js.Any
  def mapValues[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: Dictionary[T]): Dictionary[TResult]
  def mapValues[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: NumericDictionary[T]): Dictionary[TResult]
  def mapValues[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey): LodashMapValues5x1[T, TKey]
  def mapValues[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey, obj: Dictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ]
  def mapValues[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey, obj: NumericDictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ]
  @JSName("mapValues")
  var mapValues_Original: LodashMapValues
  @JSName("mapValues")
  def mapValues_TTKey_Dictionary[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ]
  @JSName("mapValues")
  def mapValues_TTResult_Dictionary[T, TResult](callback: js.Function1[/* value */ T, TResult]): Dictionary[TResult]
  @JSName("mapValues")
  def mapValues_TTResult_LodashMapValues1x1[T, TResult](callback: js.Function1[/* value */ T, TResult]): LodashMapValues1x1[T, TResult]
  @JSName("mapValues")
  def mapValues_TTResult_LodashMapValues2x1[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): LodashMapValues2x1[T, TResult]
  @JSName("mapValues")
  def mapValues_T_Any[T /* <: js.Object */](iteratee: java.lang.String): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: any} */ js.Any
  @JSName("mapValues")
  def mapValues_T_Any[T /* <: js.Object */](iteratee: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: boolean} */ js.Any
  @JSName("mapValues")
  def mapValues_T_Dictionary[T](iteratee: java.lang.String): Dictionary[Any]
  @JSName("mapValues")
  def mapValues_T_Dictionary[T](iteratee: js.Object): Dictionary[Boolean]
  @JSName("mapValues")
  def mapValues_T_LodashMapValues1x2[T](callbackOrIterateeOrIterateeOrIteratee: __): LodashMapValues1x2[T]
  
  @JSName("map")
  var map_Original: LodashMap
  @JSName("map")
  def map_TK_Array[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  @JSName("map")
  def map_TTResult_Array[T, TResult](
    iteratee: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any) | (/* value */ T), 
      TResult
    ]
  ): js.Array[TResult]
  @JSName("map")
  def map_TTResult_LodashMap3x1[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): LodashMap3x1[T, TResult]
  @JSName("map")
  def map_T_Array[T](iteratee: java.lang.String): js.Array[Any]
  @JSName("map")
  def map_T_Array[T](iteratee: js.Object): js.Array[Boolean]
  @JSName("map")
  def map_T_LodashMap1x2[T](iteratee: __): LodashMap1x2[T]
  @JSName("map")
  def map_T_LodashMap3x2[T /* <: js.Object */](iteratee: __): LodashMap3x2[T]
  @JSName("map")
  def map_T_LodashMap4x2[T](iteratee: __): LodashMap4x2[T]
  
  def matches(source: js.Object): LodashIsMatch1x1
  def matches(source: js.Object, `object`: js.Object): Boolean
  def matches(source: __, `object`: js.Object): LodashIsMatch1x2
  
  def matchesProperty(path: PropertyPath): LodashMatchesProperty1x1
  def matchesProperty[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ Any, Boolean]
  def matchesProperty[T](path: __, srcValue: T): LodashMatchesProperty1x2
  @JSName("matchesProperty")
  var matchesProperty_Original: LodashMatchesProperty
  
  @JSName("matches")
  var matches_Original: LodashIsMatch
  
  def max[T](): js.UndefOr[T]
  def max[T](collection: typings.lodash.mod.List[T]): js.UndefOr[T]
  
  def maxBy[T](iteratee: ValueIteratee[T]): LodashMaxBy1x1[T]
  def maxBy[T](iteratee: ValueIteratee[T], collection: typings.lodash.mod.List[T]): js.UndefOr[T]
  def maxBy[T](iteratee: __): LodashMaxBy1x2[T]
  def maxBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashMaxBy1x2[T]
  @JSName("maxBy")
  var maxBy_Original: LodashMaxBy
  @JSName("maxBy")
  def maxBy_T_Union[T](iteratee: ValueIteratee[T]): js.UndefOr[T]
  
  @JSName("max")
  var max_Original: LodashMax
  
  def mean(): Double
  def mean(collection: typings.lodash.mod.List[Any]): Double
  
  def meanBy[T](iteratee: ValueIteratee[T]): Double
  def meanBy[T](iteratee: ValueIteratee[T], collection: typings.lodash.mod.List[T]): Double
  def meanBy[T](iteratee: __): LodashMeanBy1x2[T]
  def meanBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashMeanBy1x2[T]
  @JSName("meanBy")
  var meanBy_Original: LodashMeanBy
  @JSName("meanBy")
  def meanBy_T_LodashMeanBy1x1[T](iteratee: ValueIteratee[T]): LodashMeanBy1x1[T]
  
  @JSName("mean")
  var mean_Original: LodashMean
  
  def memoize[T /* <: js.Function1[/* args */ Any, Any] */](func: T): T & MemoizedFunction
  @JSName("memoize")
  var memoize_Original: LodashMemoize
  
  def merge[TObject](`object`: TObject): LodashMerge1x1[TObject]
  def merge[TSource](`object`: __, source: TSource): LodashMerge1x2[TSource]
  def merge[TObject, TSource](`object`: TObject, source: TSource): TObject & TSource
  
  def mergeAll(`object`: js.Array[Any]): Any
  def mergeAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject & TSource
  def mergeAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject & TSource1 & TSource2
  def mergeAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject & TSource1 & TSource2 & TSource3
  def mergeAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject & TSource1 & TSource2 & TSource3 & TSource4
  
  def mergeAllWith(customizer: MergeWithCustomizer): LodashMergeAllWith1x1
  def mergeAllWith(customizer: MergeWithCustomizer, args: js.Array[Any]): Any
  def mergeAllWith(customizer: __, args: js.Array[Any]): LodashMergeAllWith1x2
  @JSName("mergeAllWith")
  var mergeAllWith_Original: LodashMergeAllWith
  
  @JSName("mergeAll")
  var mergeAll_Original: LodashMergeAll
  
  def mergeWith(customizer: MergeWithCustomizer): LodashMergeWith1x1
  def mergeWith[TObject](customizer: MergeWithCustomizer, `object`: TObject): LodashMergeWith1x3[TObject]
  def mergeWith[TSource](customizer: MergeWithCustomizer, `object`: __, source: TSource): LodashMergeWith1x5[TSource]
  def mergeWith[TObject](customizer: __, `object`: TObject): LodashMergeWith1x2[TObject]
  def mergeWith[TSource](customizer: __, `object`: __, source: TSource): LodashMergeWith1x4[TSource]
  def mergeWith[TObject, TSource](customizer: MergeWithCustomizer, `object`: TObject, source: TSource): TObject & TSource
  def mergeWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashMergeWith1x6[TObject, TSource]
  @JSName("mergeWith")
  var mergeWith_Original: LodashMergeWith
  
  @JSName("merge")
  var merge_Original: LodashMerge
  
  def method(path: PropertyPath): js.Function1[/* object */ Any, Any]
  
  def methodOf(`object`: js.Object): js.Function1[/* path */ PropertyPath, Any]
  @JSName("methodOf")
  var methodOf_Original: LodashMethodOf
  
  @JSName("method")
  var method_Original: LodashMethod
  
  def min[T](): js.UndefOr[T]
  def min[T](collection: typings.lodash.mod.List[T]): js.UndefOr[T]
  
  def minBy[T](iteratee: ValueIteratee[T]): js.UndefOr[T]
  def minBy[T](iteratee: ValueIteratee[T], collection: typings.lodash.mod.List[T]): js.UndefOr[T]
  def minBy[T](iteratee: __): LodashMinBy1x2[T]
  def minBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashMinBy1x2[T]
  @JSName("minBy")
  var minBy_Original: LodashMinBy
  @JSName("minBy")
  def minBy_T_LodashMinBy1x1[T](iteratee: ValueIteratee[T]): LodashMinBy1x1[T]
  
  @JSName("min")
  var min_Original: LodashMin
  
  def multiply(multiplier: Double): LodashMultiply1x1
  def multiply(multiplier: Double, multiplicand: Double): Double
  def multiply(multiplier: __, multiplicand: Double): LodashMultiply1x2
  @JSName("multiply")
  var multiply_Original: LodashMultiply
  
  def nAry(n: Double): LodashAry1x1
  def nAry(n: Double, func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def nAry(n: __, func: js.Function1[/* repeated */ Any, Any]): LodashAry1x2
  @JSName("nAry")
  var nAry_Original: LodashAry
  
  def negate[T /* <: js.Array[Any] */](predicate: js.Function1[/* args */ T, Any]): js.Function1[/* args */ T, Boolean]
  @JSName("negate")
  var negate_Original: LodashNegate
  
  def noConflict(): Typeoflodash
  @JSName("noConflict")
  var noConflict_Original: LodashNoConflict
  
  def noop(args: Any*): Unit
  @JSName("noop")
  var noop_Original: LodashNoop
  
  def now(): Double
  @JSName("now")
  var now_Original: LodashNow
  
  def nth(n: Double): LodashNth1x1
  def nth[T](n: Double, array: typings.lodash.mod.List[T]): js.UndefOr[T]
  def nth[T](n: __): LodashNth1x2[T]
  def nth[T](n: __, array: typings.lodash.mod.List[T]): LodashNth1x2[T]
  
  def nthArg(n: Double): js.Function1[/* repeated */ Any, Any]
  @JSName("nthArg")
  var nthArg_Original: LodashNthArg
  
  @JSName("nth")
  var nth_Original: LodashNth
  @JSName("nth")
  def nth_T_Union[T](n: Double): js.UndefOr[T]
  
  def omit(paths: Many[PropertyName]): LodashOmit2x1
  def omit[T /* <: js.Object */](paths: Many[PropertyName], `object`: T): PartialObject[T]
  def omit[T /* <: js.Object */](paths: __): LodashOmit1x2[T]
  def omit[T /* <: js.Object */](paths: __, `object`: T): LodashOmit1x2[T]
  
  def omitAll(paths: Many[PropertyName]): LodashOmit2x1
  def omitAll[T /* <: js.Object */](paths: Many[PropertyName], `object`: T): PartialObject[T]
  def omitAll[T /* <: js.Object */](paths: __): LodashOmit1x2[T]
  def omitAll[T /* <: js.Object */](paths: __, `object`: T): LodashOmit1x2[T]
  @JSName("omitAll")
  var omitAll_Original: LodashOmit
  @JSName("omitAll")
  def omitAll_TK_LodashOmit1x1[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): LodashOmit1x1[T, K]
  @JSName("omitAll")
  def omitAll_TK_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): Omit[T, K]
  @JSName("omitAll")
  def omitAll_TK_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K], `object`: T): Omit[T, K]
  @JSName("omitAll")
  def omitAll_T_PartialObject[T /* <: js.Object */](paths: Many[PropertyName]): PartialObject[T]
  
  def omitBy[T](predicate: ValueKeyIteratee[T]): NumericDictionary[T]
  def omitBy[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T]
  def omitBy[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T]
  def omitBy[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T]
  def omitBy[T](predicate: __): LodashOmitBy2x2[T]
  def omitBy[T /* <: js.Object */](predicate: __, `object`: T): LodashOmitBy3x2[T]
  def omitBy[T](predicate: __, `object`: Dictionary[T]): LodashOmitBy1x2[T]
  def omitBy[T](predicate: __, `object`: NumericDictionary[T]): LodashOmitBy2x2[T]
  @JSName("omitBy")
  var omitBy_Original: LodashOmitBy
  @JSName("omitBy")
  def omitBy_T_Dictionary[T](predicate: ValueKeyIteratee[T]): Dictionary[T]
  @JSName("omitBy")
  def omitBy_T_LodashOmitBy1x1[T](predicate: ValueKeyIteratee[T]): LodashOmitBy1x1[T]
  @JSName("omitBy")
  def omitBy_T_LodashOmitBy1x2[T](predicate: __): LodashOmitBy1x2[T]
  @JSName("omitBy")
  def omitBy_T_LodashOmitBy3x2[T /* <: js.Object */](predicate: __): LodashOmitBy3x2[T]
  @JSName("omitBy")
  def omitBy_T_PartialObject[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T]
  
  @JSName("omit")
  var omit_Original: LodashOmit
  @JSName("omit")
  def omit_TK_LodashOmit1x1[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): LodashOmit1x1[T, K]
  @JSName("omit")
  def omit_TK_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): Omit[T, K]
  @JSName("omit")
  def omit_TK_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K], `object`: T): Omit[T, K]
  @JSName("omit")
  def omit_T_PartialObject[T /* <: js.Object */](paths: Many[PropertyName]): PartialObject[T]
  
  def once[T /* <: js.Function1[/* args */ Any, Any] */](func: T): T
  @JSName("once")
  var once_Original: LodashOnce
  
  def orderBy(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x2
  def orderBy[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]]): LodashOrderBy1x1[T]
  def orderBy[T](iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x1[T]
  def orderBy[T](
    iteratees: Many[
      js.Function1[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any) | (/* value */ T), 
        NotVoid
      ]
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T]
  def orderBy[T](
    iteratees: Many[
      ValueIteratee[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
      ]
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T]
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: Many[Boolean | asc | desc],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: Many[Boolean | asc | desc],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def orderBy[T](
    iteratees: Many[js.Function1[/* value */ T, NotVoid]],
    orders: Many[Boolean | asc | desc],
    collection: typings.lodash.mod.List[T]
  ): js.Array[T]
  def orderBy[T](
    iteratees: Many[ValueIteratee[T]],
    orders: Many[Boolean | asc | desc],
    collection: typings.lodash.mod.List[T]
  ): js.Array[T]
  def orderBy[T](iteratees: Many[ValueIteratee[T]], orders: __): LodashOrderBy2x5[T]
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: __
  ): LodashOrderBy3x5[T]
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy3x5[T]
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy4x5[T]
  def orderBy[T](
    iteratees: Many[js.Function1[/* value */ T, NotVoid]],
    orders: __,
    collection: typings.lodash.mod.List[T]
  ): LodashOrderBy1x5[T]
  def orderBy[T](iteratees: Many[ValueIteratee[T]], orders: __, collection: typings.lodash.mod.List[T]): LodashOrderBy2x5[T]
  def orderBy[T /* <: js.Object */](iteratees: __, orders: Many[Boolean | asc | desc], collection: T): LodashOrderBy3x6[T]
  def orderBy[T](iteratees: __, orders: Many[Boolean | asc | desc], collection: typings.lodash.mod.List[T]): LodashOrderBy1x6[T]
  def orderBy[T /* <: js.Object */](iteratees: __, orders: __): LodashOrderBy3x4[T]
  def orderBy[T /* <: js.Object */](iteratees: __, orders: __, collection: T): LodashOrderBy3x4[T]
  def orderBy[T](iteratees: __, orders: __, collection: typings.lodash.mod.List[T]): LodashOrderBy1x4[T]
  @JSName("orderBy")
  var orderBy_Original: LodashOrderBy
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x3[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: Many[Boolean | asc | desc]): LodashOrderBy1x3[T]
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x4[T](iteratees: __, orders: __): LodashOrderBy1x4[T]
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x5[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: __): LodashOrderBy1x5[T]
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x6[T](iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T]
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy2x3[T](iteratees: Many[ValueIteratee[T]], orders: Many[Boolean | asc | desc]): LodashOrderBy2x3[T]
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy3x6[T /* <: js.Object */](iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy3x6[T]
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy4x5[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: __
  ): LodashOrderBy4x5[T]
  
  def over[TResult](iteratees: Many[js.Function1[/* repeated */ Any, TResult]]): js.Function1[/* repeated */ Any, js.Array[TResult]]
  
  def overArgs(func: js.Function1[/* repeated */ Any, Any]): LodashOverArgs1x1
  def overArgs(
    func: js.Function1[/* repeated */ Any, Any],
    transforms: Many[js.Function1[/* repeated */ Any, Any]]
  ): js.Function1[/* repeated */ Any, Any]
  def overArgs(func: __, transforms: Many[js.Function1[/* repeated */ Any, Any]]): LodashOverArgs1x2
  @JSName("overArgs")
  var overArgs_Original: LodashOverArgs
  
  def overEvery[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean]
  @JSName("overEvery")
  var overEvery_Original: LodashOverEvery
  
  def overSome[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean]
  @JSName("overSome")
  var overSome_Original: LodashOverSome
  
  @JSName("over")
  var over_Original: LodashOver
  
  def pad(length: Double): LodashPad1x1
  def pad(length: Double, string: java.lang.String): java.lang.String
  def pad(length: __, string: java.lang.String): LodashPad1x2
  
  def padChars(chars: java.lang.String): LodashPadChars1x1
  def padChars(chars: java.lang.String, length: Double): LodashPadChars1x3
  def padChars(chars: java.lang.String, length: Double, string: java.lang.String): java.lang.String
  def padChars(chars: java.lang.String, length: __, string: java.lang.String): LodashPadChars1x5
  def padChars(chars: __, length: Double): LodashPadChars1x2
  def padChars(chars: __, length: Double, string: java.lang.String): LodashPadChars1x6
  def padChars(chars: __, length: __, string: java.lang.String): LodashPadChars1x4
  
  def padCharsEnd(chars: java.lang.String): LodashPadCharsEnd1x1
  def padCharsEnd(chars: java.lang.String, length: Double): LodashPadCharsEnd1x3
  def padCharsEnd(chars: java.lang.String, length: Double, string: java.lang.String): java.lang.String
  def padCharsEnd(chars: java.lang.String, length: __, string: java.lang.String): LodashPadCharsEnd1x5
  def padCharsEnd(chars: __, length: Double): LodashPadCharsEnd1x2
  def padCharsEnd(chars: __, length: Double, string: java.lang.String): LodashPadCharsEnd1x6
  def padCharsEnd(chars: __, length: __, string: java.lang.String): LodashPadCharsEnd1x4
  @JSName("padCharsEnd")
  var padCharsEnd_Original: LodashPadCharsEnd
  
  def padCharsStart(chars: java.lang.String): LodashPadCharsStart1x1
  def padCharsStart(chars: java.lang.String, length: Double): LodashPadCharsStart1x3
  def padCharsStart(chars: java.lang.String, length: Double, string: java.lang.String): java.lang.String
  def padCharsStart(chars: java.lang.String, length: __, string: java.lang.String): LodashPadCharsStart1x5
  def padCharsStart(chars: __, length: Double): LodashPadCharsStart1x2
  def padCharsStart(chars: __, length: Double, string: java.lang.String): LodashPadCharsStart1x6
  def padCharsStart(chars: __, length: __, string: java.lang.String): LodashPadCharsStart1x4
  @JSName("padCharsStart")
  var padCharsStart_Original: LodashPadCharsStart
  
  @JSName("padChars")
  var padChars_Original: LodashPadChars
  
  def padEnd(length: Double): LodashPadEnd1x1
  def padEnd(length: Double, string: java.lang.String): java.lang.String
  def padEnd(length: __, string: java.lang.String): LodashPadEnd1x2
  @JSName("padEnd")
  var padEnd_Original: LodashPadEnd
  
  def padStart(length: Double): LodashPadStart1x1
  def padStart(length: Double, string: java.lang.String): java.lang.String
  def padStart(length: __, string: java.lang.String): LodashPadStart1x2
  @JSName("padStart")
  var padStart_Original: LodashPadStart
  
  @JSName("pad")
  var pad_Original: LodashPad
  
  def parseInt(radix: Double): LodashParseInt1x1
  def parseInt(radix: Double, string: java.lang.String): Double
  def parseInt(radix: __, string: java.lang.String): LodashParseInt1x2
  @JSName("parseInt")
  var parseInt_Original: LodashParseInt
  
  def partial[T1](func: __, arg1: js.Array[T1]): LodashPartial18x2[T1]
  def partial[T2](func: __, plc1: js.Tuple2[__, T2]): LodashPartial1x2[T2]
  def partial[T3](func: __, plc1: js.Tuple3[__, __, T3]): LodashPartial3x2[T3]
  def partial[T4](func: __, plc1: js.Tuple4[__, __, __, T4]): LodashPartial11x2[T4]
  def partial[TS /* <: js.Array[Any] */, T1, R](func: js.Function2[/* t1 */ T1, /* ts */ TS, R]): LodashPartial18x1[TS, T1, R]
  def partial[TS /* <: js.Array[Any] */, T1, R](func: js.Function2[/* t1 */ T1, /* ts */ TS, R], arg1: js.Array[T1]): js.Function1[/* ts */ TS, R]
  def partial[T1, T2, R](func: Function2[T1, T2, R], plc1: js.Tuple2[__, T2]): Function1[T1, R]
  def partial[TS /* <: js.Array[Any] */, T1, T2, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* ts */ TS, R]): LodashPartial19x1[TS, T1, T2, R]
  def partial[TS /* <: js.Array[Any] */, T1, T2, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* ts */ TS, R], t1: js.Tuple2[T1, T2]): js.Function1[/* ts */ TS, R]
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], plc1: js.Tuple3[__, __, T3]): Function2[T1, T2, R]
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): LodashPartial6x1[T1, T2, T3, T4, R]
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple3[T1 | __, T2 | __, T3]): Function2[T2, T4, R]
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1 | __, T2 | __, T3 | __, T4]): Function2[T2, T3, R]
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: js.Tuple2[__, T2]): Function3[T1, T3, T4, R]
  def partial[TS /* <: js.Array[Any] */, T1, T2, T3, T4, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* ts */ TS, R]): LodashPartial21x1[TS, T1, T2, T3, T4, R]
  def partial[TS /* <: js.Array[Any] */, T1, T2, T3, T4, R](
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* ts */ TS, R],
    t1: js.Tuple4[T1, T2, T3, T4]
  ): js.Function1[/* ts */ TS, R]
  
  def partialRight(func: js.Function1[/* repeated */ Any, Any]): LodashPartialRight27x1
  def partialRight(func: js.Function1[/* repeated */ Any, Any], args: js.Array[Any]): js.Function1[/* repeated */ Any, Any]
  def partialRight(func: __, args: js.Array[Any]): LodashPartialRight27x2
  def partialRight[T1](func: __, arg1: js.Tuple2[T1, __]): LodashPartialRight2x2[T1]
  def partialRight[T1](func: __, arg1: js.Tuple4[T1, __, __, __]): LodashPartialRight12x2[T1]
  def partialRight[T2](func: __, arg2: js.Tuple3[T2, __, __]): LodashPartialRight13x2[T2]
  def partialRight[T1, T2, R](func: Function2[T1, T2, R]): LodashPartialRight2x1[T1, T2, R]
  def partialRight[T1, T2, R](func: Function2[T1, T2, R], arg1: js.Tuple2[T1, __]): Function1[T2, R]
  def partialRight[T1, T2, R](func: Function2[T1, T2, R], arg2: js.Array[T2]): Function1[T1, R]
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R]): LodashPartialRight5x1[T1, T2, T3, R]
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1, T2, T3]): Function0[R]
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg2: js.Tuple2[T2, __]): Function2[T1, T3, R]
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg3: js.Array[T3]): Function2[T1, T2, R]
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): LodashPartialRight12x1[T1, T2, T3, T4, R]
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, T2 | __, T3 | __, T4 | __]): Function2[T3, T4, R]
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: js.Tuple3[T2, T3 | __, T4 | __]): Function2[T1, T4, R]
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg3: js.Tuple2[T3, T4]): Function2[T1, T2, R]
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg4: js.Array[T4]): Function3[T1, T2, T3, R]
  @JSName("partialRight")
  var partialRight_Original: LodashPartialRight
  @JSName("partialRight")
  def partialRight_T1R_Function0[T1, R](func: Function1[T1, R], arg1: js.Array[T1]): Function0[R]
  @JSName("partialRight")
  def partialRight_T1R_LodashPartialRight1x1[T1, R](func: Function1[T1, R]): LodashPartialRight1x1[T1, R]
  @JSName("partialRight")
  def partialRight_T1T2R_Function0[T1, T2, R](func: Function2[T1, T2, R], arg1: js.Tuple2[T1, T2]): Function0[R]
  @JSName("partialRight")
  def partialRight_T1T2T3R_Function1[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1, T2 | __, T3 | __]): Function1[T3, R]
  @JSName("partialRight")
  def partialRight_T1T2T3R_Function1[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg2: js.Tuple2[T2, T3]): Function1[T1, R]
  @JSName("partialRight")
  def partialRight_T1T2T3R_Function2[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1, __, __]): Function2[T2, T3, R]
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function0[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, T2, T3, T4]): Function0[R]
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function1[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, T2 | __, T3 | __, T4 | __]): Function1[T4, R]
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function1[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: js.Tuple3[T2, T3, T4]): Function1[T1, R]
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, __, __, __]): Function3[T2, T3, T4, R]
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: js.Tuple3[T2, __, __]): Function3[T1, T3, T4, R]
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg3: js.Tuple2[T3, __]): Function3[T1, T2, T4, R]
  @JSName("partialRight")
  def partialRight_T1T2T3T4_LodashPartialRight26x2[T1, T2, T3, T4](func: __, arg1: js.Tuple4[T1, T2, T3, T4]): LodashPartialRight26x2[T1, T2, T3, T4]
  @JSName("partialRight")
  def partialRight_T1T2T3_LodashPartialRight11x2[T1, T2, T3](func: __, arg1: js.Tuple3[T1, T2, T3]): LodashPartialRight11x2[T1, T2, T3]
  @JSName("partialRight")
  def partialRight_T1T2T3_LodashPartialRight18x2[T1, T2, T3](func: __, arg1: js.Tuple4[T1, T2, T3, __]): LodashPartialRight18x2[T1, T2, T3]
  @JSName("partialRight")
  def partialRight_T1T2T4_LodashPartialRight22x2[T1, T2, T4](func: __, arg1: js.Tuple4[T1, T2, __, T4]): LodashPartialRight22x2[T1, T2, T4]
  @JSName("partialRight")
  def partialRight_T1T2_LodashPartialRight14x2[T1, T2](func: __, arg1: js.Tuple4[T1, T2, __, __]): LodashPartialRight14x2[T1, T2]
  @JSName("partialRight")
  def partialRight_T1T2_LodashPartialRight4x2[T1, T2](func: __, arg1: js.Tuple2[T1, T2]): LodashPartialRight4x2[T1, T2]
  @JSName("partialRight")
  def partialRight_T1T2_LodashPartialRight7x2[T1, T2](func: __, arg1: js.Tuple3[T1, T2, __]): LodashPartialRight7x2[T1, T2]
  @JSName("partialRight")
  def partialRight_T1T3T4_LodashPartialRight24x2[T1, T3, T4](func: __, arg1: js.Tuple4[T1, __, T3, T4]): LodashPartialRight24x2[T1, T3, T4]
  @JSName("partialRight")
  def partialRight_T1T3_LodashPartialRight16x2[T1, T3](func: __, arg1: js.Tuple4[T1, __, T3, __]): LodashPartialRight16x2[T1, T3]
  @JSName("partialRight")
  def partialRight_T1T3_LodashPartialRight9x2[T1, T3](func: __, arg1: js.Tuple3[T1, __, T3]): LodashPartialRight9x2[T1, T3]
  @JSName("partialRight")
  def partialRight_T1T4_LodashPartialRight20x2[T1, T4](func: __, arg1: js.Tuple4[T1, __, __, T4]): LodashPartialRight20x2[T1, T4]
  @JSName("partialRight")
  def partialRight_T1_LodashPartialRight1x2[T1](func: __, arg1: js.Array[T1]): LodashPartialRight1x2[T1]
  @JSName("partialRight")
  def partialRight_T1_LodashPartialRight5x2[T1](func: __, arg1: js.Tuple3[T1, __, __]): LodashPartialRight5x2[T1]
  @JSName("partialRight")
  def partialRight_T2T3T4_LodashPartialRight25x2[T2, T3, T4](func: __, arg2: js.Tuple3[T2, T3, T4]): LodashPartialRight25x2[T2, T3, T4]
  @JSName("partialRight")
  def partialRight_T2T3_LodashPartialRight10x2[T2, T3](func: __, arg2: js.Tuple2[T2, T3]): LodashPartialRight10x2[T2, T3]
  @JSName("partialRight")
  def partialRight_T2T3_LodashPartialRight17x2[T2, T3](func: __, arg2: js.Tuple3[T2, T3, __]): LodashPartialRight17x2[T2, T3]
  @JSName("partialRight")
  def partialRight_T2T4_LodashPartialRight21x2[T2, T4](func: __, arg2: js.Tuple3[T2, __, T4]): LodashPartialRight21x2[T2, T4]
  @JSName("partialRight")
  def partialRight_T2_LodashPartialRight3x2[T2](func: __, arg2: js.Array[T2]): LodashPartialRight3x2[T2]
  @JSName("partialRight")
  def partialRight_T2_LodashPartialRight6x2[T2](func: __, arg2: js.Tuple2[T2, __]): LodashPartialRight6x2[T2]
  @JSName("partialRight")
  def partialRight_T3T4_LodashPartialRight23x2[T3, T4](func: __, arg3: js.Tuple2[T3, T4]): LodashPartialRight23x2[T3, T4]
  @JSName("partialRight")
  def partialRight_T3_LodashPartialRight15x2[T3](func: __, arg3: js.Tuple2[T3, __]): LodashPartialRight15x2[T3]
  @JSName("partialRight")
  def partialRight_T3_LodashPartialRight8x2[T3](func: __, arg3: js.Array[T3]): LodashPartialRight8x2[T3]
  @JSName("partialRight")
  def partialRight_T4_LodashPartialRight19x2[T4](func: __, arg4: js.Array[T4]): LodashPartialRight19x2[T4]
  
  @JSName("partial")
  var partial_Original: LodashPartial
  @JSName("partial")
  def partial_T1T2R_LodashPartial1x1[T1, T2, R](func: Function2[T1, T2, R]): LodashPartial1x1[T1, T2, R]
  @JSName("partial")
  def partial_T1T2T3R_Function1[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1 | __, T2 | __, T3]): Function1[T2, R]
  @JSName("partial")
  def partial_T1T2T3R_Function2[T1, T2, T3, R](func: Function3[T1, T2, T3, R], plc1: js.Tuple2[__, T2]): Function2[T1, T3, R]
  @JSName("partial")
  def partial_T1T2T3R_LodashPartial2x1[T1, T2, T3, R](func: Function3[T1, T2, T3, R]): LodashPartial2x1[T1, T2, T3, R]
  @JSName("partial")
  def partial_T1T2T3T4R_Function1[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple3[T1, T2, T3]): Function1[T4, R]
  @JSName("partial")
  def partial_T1T2T3T4R_Function1[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1 | __, T2 | __, T3 | __, T4]): Function1[T3, R]
  @JSName("partial")
  def partial_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: js.Tuple3[__, __, T3]): Function3[T1, T2, T4, R]
  @JSName("partial")
  def partial_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: js.Tuple4[__, __, __, T4]): Function3[T1, T2, T3, R]
  @JSName("partial")
  def partial_T1T2T3T4_LodashPartial21x2[T1, T2, T3, T4](func: __, t1: js.Tuple4[T1, T2, T3, T4]): LodashPartial21x2[T1, T2, T3, T4]
  @JSName("partial")
  def partial_T1T2T3_LodashPartial10x2[T1, T2, T3](func: __, arg1OrT1: js.Tuple3[T1, T2, T3]): LodashPartial10x2[T1, T2, T3]
  @JSName("partial")
  def partial_T1T2T4_LodashPartial14x2[T1, T2, T4](func: __, arg1: js.Tuple4[T1, T2, __, T4]): LodashPartial14x2[T1, T2, T4]
  @JSName("partial")
  def partial_T1T2_LodashPartial19x2[T1, T2](func: __, t1: js.Tuple2[T1, T2]): LodashPartial19x2[T1, T2]
  @JSName("partial")
  def partial_T1T3T4_LodashPartial16x2[T1, T3, T4](func: __, arg1: js.Tuple4[T1, __, T3, T4]): LodashPartial16x2[T1, T3, T4]
  @JSName("partial")
  def partial_T1T3_LodashPartial4x2[T1, T3](func: __, arg1: js.Tuple3[T1, __, T3]): LodashPartial4x2[T1, T3]
  @JSName("partial")
  def partial_T1T4_LodashPartial12x2[T1, T4](func: __, arg1: js.Tuple4[T1, __, __, T4]): LodashPartial12x2[T1, T4]
  @JSName("partial")
  def partial_T2T3T4_LodashPartial17x2[T2, T3, T4](func: __, plc1: js.Tuple4[__, T2, T3, T4]): LodashPartial17x2[T2, T3, T4]
  @JSName("partial")
  def partial_T2T3_LodashPartial5x2[T2, T3](func: __, plc1: js.Tuple3[__, T2, T3]): LodashPartial5x2[T2, T3]
  @JSName("partial")
  def partial_T2T4_LodashPartial13x2[T2, T4](func: __, plc1: js.Tuple4[__, T2, __, T4]): LodashPartial13x2[T2, T4]
  @JSName("partial")
  def partial_T3T4_LodashPartial15x2[T3, T4](func: __, plc1: js.Tuple4[__, __, T3, T4]): LodashPartial15x2[T3, T4]
  @JSName("partial")
  def partial_TST1T2T3R_Function1[TS /* <: js.Array[Any] */, T1, T2, T3, R](
    func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* ts */ TS, R],
    t1: js.Tuple3[T1, T2, T3]
  ): js.Function1[/* ts */ TS, R]
  @JSName("partial")
  def partial_TST1T2T3R_LodashPartial20x1[TS /* <: js.Array[Any] */, T1, T2, T3, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* ts */ TS, R]): LodashPartial20x1[TS, T1, T2, T3, R]
  
  def partition[T](callback: ValueIteratee[T]): LodashPartition2x1[T]
  def partition[T /* <: js.Object */](
    callback: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): js.Tuple2[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  def partition[T](callback: ValueIteratee[T], collection: typings.lodash.mod.List[T]): js.Tuple2[js.Array[T], js.Array[T]]
  def partition[T /* <: js.Object */](callback: __): LodashPartition3x2[T]
  def partition[T /* <: js.Object */](callback: __, collection: T): LodashPartition3x2[T]
  def partition[T](callback: __, collection: typings.lodash.mod.List[T]): LodashPartition1x2[T]
  def partition[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]
  def partition[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U], collection: typings.lodash.mod.List[T]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]
  @JSName("partition")
  var partition_Original: LodashPartition
  @JSName("partition")
  def partition_TU_LodashPartition1x1[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): LodashPartition1x1[T, U]
  @JSName("partition")
  def partition_T_LodashPartition1x2[T](callback: __): LodashPartition1x2[T]
  @JSName("partition")
  def partition_T_Tuple2[T](
    callback: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): js.Tuple2[js.Array[T], js.Array[T]]
  
  def path(path: Double): LodashPath9x1
  def path(path: PropertyPath): Unit
  def path(path: PropertyPath, `object`: Any): Any
  def path(path: __): LodashPath11x2
  def path(path: __, `object`: Any): LodashPath12x2
  def path[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T]
  def path[T](path: __, `object`: NumericDictionary[T]): LodashPath10x2[T]
  def path[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashPath1x1[TObject, TKey]
  def path[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashPath3x1[TObject, TKey1, TKey2]
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPath7x1[TObject, TKey1, TKey2, TKey3, TKey4]
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  
  def pathEq(path: PropertyPath): LodashMatchesProperty1x1
  def pathEq[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ Any, Boolean]
  def pathEq[T](path: __, srcValue: T): LodashMatchesProperty1x2
  @JSName("pathEq")
  var pathEq_Original: LodashMatchesProperty
  
  def pathOr(defaultValue: Any): LodashPathOr7x1
  def pathOr(defaultValue: Any, path: PropertyPath): LodashPathOr7x3
  def pathOr(defaultValue: Any, path: PropertyPath, `object`: Any): Any
  def pathOr(defaultValue: Any, path: __, `object`: Any): LodashPathOr7x5
  def pathOr(defaultValue: __, path: Double): LodashPathOr5x2
  def pathOr(defaultValue: __, path: PropertyPath): LodashPathOr6x6
  def pathOr(defaultValue: __, path: PropertyPath, `object`: Any): LodashPathOr7x6
  def pathOr(defaultValue: __, path: __): LodashPathOr6x4
  def pathOr(defaultValue: __, path: __, `object`: Any): LodashPathOr7x4
  def pathOr[TDefault](defaultValue: TDefault, path: Double): LodashPathOr5x3[TDefault]
  def pathOr[TDefault](defaultValue: TDefault, path: __): LodashPathOr6x5[TDefault]
  def pathOr[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashPathOr5x6[T]
  def pathOr[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashPathOr5x4[T]
  def pathOr[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault
  def pathOr[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashPathOr5x5[T, TDefault]
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPathOr1x2[TObject, TKey]
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashPathOr1x6[TObject, TKey]
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x2[TObject, TKey1, TKey2]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashPathOr2x6[TObject, TKey1, TKey2]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x6[TObject, TKey1, TKey2, TKey3]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashPathOr3x6[TObject, TKey1, TKey2, TKey3]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x3[TObject, TKey1, TKey2, TKey3, TDefault]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x2[TObject, TKey1, TKey2, TKey3, TKey4]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashPathOr4x6[TObject, TKey1, TKey2, TKey3, TKey4]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault]
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("pathOr")
  def pathOr_LodashPathOr6x2(defaultValue: __, path: PropertyPath): LodashPathOr6x2
  @JSName("pathOr")
  var pathOr_Original: LodashPathOr
  @JSName("pathOr")
  def pathOr_TDefault_LodashPathOr1x1[TDefault](defaultValue: TDefault): LodashPathOr1x1[TDefault]
  @JSName("pathOr")
  def pathOr_TDefault_LodashPathOr6x3[TDefault](defaultValue: TDefault, path: PropertyPath): LodashPathOr6x3[TDefault]
  @JSName("pathOr")
  def pathOr_TDefault_TDefault[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault
  @JSName("pathOr")
  def pathOr_TObjectTDefault_LodashPathOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __): LodashPathOr1x5[TObject, TDefault]
  @JSName("pathOr")
  def pathOr_TObjectTDefault_LodashPathOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashPathOr1x5[TObject, TDefault]
  @JSName("pathOr")
  def pathOr_TObjectTKey1TKey2TDefault_LodashPathOr2x3[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x3[TObject, TKey1, TKey2, TDefault]
  @JSName("pathOr")
  def pathOr_TObjectTKey1TKey2TKey3TDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("pathOr")
  def pathOr_TObjectTKey1TKey2TKey3TKey4TDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("pathOr")
  def pathOr_TObjectTKey1TKey2TKey3TKey4_LodashPathOr4x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x6[TObject, TKey1, TKey2, TKey3, TKey4]
  @JSName("pathOr")
  def pathOr_TObjectTKey1TKey2TKey3_LodashPathOr3x2[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x2[TObject, TKey1, TKey2, TKey3]
  @JSName("pathOr")
  def pathOr_TObjectTKey1TKey2_LodashPathOr2x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x6[TObject, TKey1, TKey2]
  @JSName("pathOr")
  def pathOr_TObjectTKeyTDefault_LodashPathOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashPathOr1x3[TObject, TKey, TDefault]
  @JSName("pathOr")
  def pathOr_TObjectTKeyTDefault_LodashPathOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashPathOr1x3[TObject, TKey, TDefault]
  @JSName("pathOr")
  def pathOr_TObjectTKeyTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("pathOr")
  def pathOr_TObjectTKeyTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("pathOr")
  def pathOr_TObjectTKey_LodashPathOr1x2[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPathOr1x2[TObject, TKey]
  @JSName("pathOr")
  def pathOr_TObjectTKey_LodashPathOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPathOr1x6[TObject, TKey]
  @JSName("pathOr")
  def pathOr_TObjectTKey_LodashPathOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey, `object`: TObject): LodashPathOr1x6[TObject, TKey]
  @JSName("pathOr")
  def pathOr_TObjectTKey_LodashPathOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPathOr1x6[TObject, TKey]
  @JSName("pathOr")
  def pathOr_TObject_LodashPathOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __): LodashPathOr1x4[TObject]
  @JSName("pathOr")
  def pathOr_TObject_LodashPathOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashPathOr1x4[TObject]
  @JSName("pathOr")
  def pathOr_TTDefault_LodashPathOr5x5[T, TDefault](defaultValue: TDefault, path: __): LodashPathOr5x5[T, TDefault]
  @JSName("pathOr")
  def pathOr_TTDefault_Union[T, TDefault](defaultValue: TDefault, path: Double): T | TDefault
  @JSName("pathOr")
  def pathOr_T_LodashPathOr5x4[T](defaultValue: __, path: __): LodashPathOr5x4[T]
  @JSName("pathOr")
  def pathOr_T_LodashPathOr5x6[T](defaultValue: __, path: Double): LodashPathOr5x6[T]
  
  @JSName("path")
  def path_LodashPath11x1(path: PropertyPath): LodashPath11x1
  @JSName("path")
  var path_Original: LodashPath
  @JSName("path")
  def path_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("path")
  def path_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("path")
  def path_TObjectTKey1TKey2TKey3_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  @JSName("path")
  def path_TObjectTKey1TKey2TKey3_LodashPath5x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPath5x1[TObject, TKey1, TKey2, TKey3]
  @JSName("path")
  def path_TObjectTKey1TKey2_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  @JSName("path")
  def path_TObjectTKey1TKey2_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  @JSName("path")
  def path_TObjectTKey_Any[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  @JSName("path")
  def path_TObjectTKey_LodashPath1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashPath1x1[TObject, TKey]
  @JSName("path")
  def path_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("path")
  def path_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("path")
  def path_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("path")
  def path_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("path")
  def path_TObject_LodashPath1x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPath1x2[TObject]
  @JSName("path")
  def path_TObject_LodashPath2x2[TObject /* <: js.Object */](path: __): LodashPath2x2[TObject]
  @JSName("path")
  def path_TObject_LodashPath2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPath2x2[TObject]
  @JSName("path")
  def path_T_LodashPath10x2[T](path: __): LodashPath10x2[T]
  @JSName("path")
  def path_T_LodashPath9x2[T](path: __, `object`: NumericDictionary[T]): LodashPath9x2[T]
  @JSName("path")
  def path_T_T[T](path: Double, `object`: NumericDictionary[T]): T
  @JSName("path")
  def path_T_Union[T](path: Double): js.UndefOr[T]
  
  def paths(props: PropertyPath): LodashAt1x1
  def paths[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String], `object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def paths[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T]
  def paths[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T]
  def paths[T](props: __): LodashAt1x2[T]
  def paths[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T]
  def paths[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T]
  def paths[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T]
  @JSName("paths")
  var paths_Original: LodashAt
  @JSName("paths")
  def paths_T_Array[T](props: (Many[/* keyof T */ java.lang.String]) | PropertyPath): js.Array[T]
  @JSName("paths")
  def paths_T_LodashAt2x1[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): LodashAt2x1[T]
  @JSName("paths")
  def paths_T_LodashAt2x2[T /* <: js.Object */](props: __): LodashAt2x2[T]
  
  def pick(props: PropertyPath): LodashPick2x1
  def pick[T](props: PropertyPath, `object`: T): PartialObject[T]
  def pick[T](props: __): LodashPick2x2[T]
  def pick[T](props: __, `object`: T): LodashPick2x2[T]
  
  def pickAll(props: PropertyPath): LodashPick2x1
  def pickAll[T](props: PropertyPath, `object`: T): PartialObject[T]
  def pickAll[T](props: __): LodashPick2x2[T]
  def pickAll[T](props: __, `object`: T): LodashPick2x2[T]
  @JSName("pickAll")
  var pickAll_Original: LodashPick
  @JSName("pickAll")
  def pickAll_TU_LodashPick1x1[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U]): LodashPick1x1[T, U]
  @JSName("pickAll")
  def pickAll_TU_Pick[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U], `object`: T): Pick[T, U]
  @JSName("pickAll")
  def pickAll_T_LodashPick1x2[T /* <: js.Object */](props: __, `object`: T): LodashPick1x2[T]
  @JSName("pickAll")
  def pickAll_T_PartialObject[T](props: PropertyPath): PartialObject[T]
  
  def pickBy[T](predicate: ValueKeyIteratee[T]): NumericDictionary[T]
  def pickBy[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T]
  def pickBy[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T]
  def pickBy[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T]
  def pickBy[T /* <: js.Object */](predicate: __): LodashPickBy5x2[T]
  def pickBy[T /* <: js.Object */](predicate: __, `object`: T): LodashPickBy5x2[T]
  def pickBy[T](predicate: __, `object`: Dictionary[T]): LodashPickBy1x2[T]
  def pickBy[T](predicate: __, `object`: NumericDictionary[T]): LodashPickBy2x2[T]
  def pickBy[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): LodashPickBy1x1[T, S]
  def pickBy[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: Dictionary[T]): Dictionary[S]
  def pickBy[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: NumericDictionary[T]): NumericDictionary[S]
  @JSName("pickBy")
  var pickBy_Original: LodashPickBy
  @JSName("pickBy")
  def pickBy_TS_Dictionary[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S]
  @JSName("pickBy")
  def pickBy_TS_NumericDictionary[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S]
  @JSName("pickBy")
  def pickBy_T_Dictionary[T](predicate: ValueKeyIteratee[T]): Dictionary[T]
  @JSName("pickBy")
  def pickBy_T_LodashPickBy1x2[T](predicate: __): LodashPickBy1x2[T]
  @JSName("pickBy")
  def pickBy_T_LodashPickBy2x2[T](predicate: __): LodashPickBy2x2[T]
  @JSName("pickBy")
  def pickBy_T_LodashPickBy3x1[T](predicate: ValueKeyIteratee[T]): LodashPickBy3x1[T]
  @JSName("pickBy")
  def pickBy_T_PartialObject[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T]
  
  @JSName("pick")
  var pick_Original: LodashPick
  @JSName("pick")
  def pick_TU_LodashPick1x1[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U]): LodashPick1x1[T, U]
  @JSName("pick")
  def pick_TU_Pick[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U], `object`: T): Pick[T, U]
  @JSName("pick")
  def pick_T_LodashPick1x2[T /* <: js.Object */](props: __, `object`: T): LodashPick1x2[T]
  @JSName("pick")
  def pick_T_PartialObject[T](props: PropertyPath): PartialObject[T]
  
  def pipe(func: (Many[js.Function1[/* repeated */ Any, Any]])*): js.Function1[/* repeated */ Any, Any]
  def pipe[A /* <: js.Array[Any] */, R1, R2](f1: js.Function1[/* args */ A, R1], f2: js.Function1[/* a */ R1, R2]): js.Function1[/* args */ A, R2]
  def pipe[A /* <: js.Array[Any] */, R1, R2, R3](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function1[/* args */ A, R3]
  def pipe[A /* <: js.Array[Any] */, R1, R2, R3, R4](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function1[/* args */ A, R4]
  def pipe[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function1[/* args */ A, R5]
  def pipe[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function1[/* args */ A, R6]
  def pipe[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function1[/* args */ A, R7]
  def pipe[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    func: (Many[js.Function1[/* a */ Any, Any]])*
  ): js.Function1[/* args */ A, Any]
  @JSName("pipe")
  var pipe_Original: LodashFlow
  
  def placeholder(): String
  def placeholder(value: java.lang.String): String
  def placeholder[T /* <: js.Function1[/* args */ Any, Any] */](value: T): Function[T]
  def placeholder[T](value: typings.lodash.mod.List[T]): Collection[T]
  @JSName("placeholder")
  var placeholder_Original: __
  @JSName("placeholder")
  def placeholder_T_Collection[T](): Collection[T]
  @JSName("placeholder")
  def placeholder_T_Object[T /* <: js.Object */](): Object[T]
  @JSName("placeholder")
  def placeholder_T_Object[T /* <: js.Object */](value: T): Object[T]
  @JSName("placeholder")
  def placeholder_T_Primitive[T /* <: js.UndefOr[Null] */](value: T): Primitive[T]
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  @JSName("placeholder")
  def placeholder_TrapAny_Intersection[TrapAny /* <: typings.lodash.anon.TrapAny */](value: TrapAny): Collection[Any] & Function[Any] & Object[Any] & Primitive[Any] & String
  
  def pluck(iteratee: java.lang.String): LodashMap5x1
  def pluck(iteratee: js.Object): LodashMap6x1
  def pluck[T](iteratee: java.lang.String, collection: Dictionary[T]): js.Array[Any]
  def pluck[T](iteratee: java.lang.String, collection: NumericDictionary[T]): js.Array[Any]
  def pluck[T](iteratee: js.Object, collection: Dictionary[T]): js.Array[Boolean]
  def pluck[T](iteratee: js.Object, collection: NumericDictionary[T]): js.Array[Boolean]
  def pluck[T](iteratee: __): LodashMap2x2[T]
  def pluck[T /* <: js.Object */](iteratee: __, collection: T): LodashMap3x2[T]
  def pluck[T](iteratee: __, collection: js.Array[T]): LodashMap1x2[T]
  def pluck[T](iteratee: __, collection: Dictionary[T]): LodashMap4x2[T]
  def pluck[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashMap2x2[T]
  def pluck[T](iteratee: __, collection: NumericDictionary[T]): LodashMap4x2[T]
  def pluck[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): LodashMap4x1[T, K]
  def pluck[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: Dictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  def pluck[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: NumericDictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  def pluck[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): LodashMap1x1[T, TResult]
  def pluck[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    collection: T
  ): js.Array[TResult]
  def pluck[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: js.Array[T]): js.Array[TResult]
  def pluck[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: typings.lodash.mod.List[T]): js.Array[TResult]
  @JSName("pluck")
  var pluck_Original: LodashMap
  @JSName("pluck")
  def pluck_TK_Array[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  @JSName("pluck")
  def pluck_TTResult_Array[T, TResult](
    iteratee: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any) | (/* value */ T), 
      TResult
    ]
  ): js.Array[TResult]
  @JSName("pluck")
  def pluck_TTResult_LodashMap3x1[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): LodashMap3x1[T, TResult]
  @JSName("pluck")
  def pluck_T_Array[T](iteratee: java.lang.String): js.Array[Any]
  @JSName("pluck")
  def pluck_T_Array[T](iteratee: js.Object): js.Array[Boolean]
  @JSName("pluck")
  def pluck_T_LodashMap1x2[T](iteratee: __): LodashMap1x2[T]
  @JSName("pluck")
  def pluck_T_LodashMap3x2[T /* <: js.Object */](iteratee: __): LodashMap3x2[T]
  @JSName("pluck")
  def pluck_T_LodashMap4x2[T](iteratee: __): LodashMap4x2[T]
  
  def prop(path: Double): LodashProp9x1
  def prop(path: PropertyPath): Unit
  def prop(path: PropertyPath, `object`: Any): Any
  def prop(path: __): LodashProp11x2
  def prop(path: __, `object`: Any): LodashProp12x2
  def prop[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T]
  def prop[T](path: __, `object`: NumericDictionary[T]): LodashProp10x2[T]
  def prop[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashProp1x1[TObject, TKey]
  def prop[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashProp7x1[TObject, TKey1, TKey2, TKey3, TKey4]
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  
  def propEq(path: PropertyPath): LodashMatchesProperty1x1
  def propEq[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ Any, Boolean]
  def propEq[T](path: __, srcValue: T): LodashMatchesProperty1x2
  @JSName("propEq")
  var propEq_Original: LodashMatchesProperty
  
  def propOr(defaultValue: Any): LodashPropOr7x1
  def propOr(defaultValue: Any, path: PropertyPath): LodashPropOr7x3
  def propOr(defaultValue: Any, path: PropertyPath, `object`: Any): Any
  def propOr(defaultValue: Any, path: __, `object`: Any): LodashPropOr7x5
  def propOr(defaultValue: __, path: Double): LodashPropOr5x2
  def propOr(defaultValue: __, path: PropertyPath): LodashPropOr6x2
  def propOr(defaultValue: __, path: PropertyPath, `object`: Any): LodashPropOr7x6
  def propOr(defaultValue: __, path: __): LodashPropOr6x4
  def propOr(defaultValue: __, path: __, `object`: Any): LodashPropOr7x4
  def propOr[TDefault](defaultValue: TDefault, path: Double): LodashPropOr5x3[TDefault]
  def propOr[TDefault](defaultValue: TDefault, path: __): LodashPropOr6x5[TDefault]
  def propOr[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashPropOr5x6[T]
  def propOr[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashPropOr5x4[T]
  def propOr[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault
  def propOr[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashPropOr5x5[T, TDefault]
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPropOr1x2[TObject, TKey]
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashPropOr1x6[TObject, TKey]
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashPropOr1x3[TObject, TKey, TDefault]
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPropOr2x2[TObject, TKey1, TKey2]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashPropOr2x6[TObject, TKey1, TKey2]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x6[TObject, TKey1, TKey2, TKey3]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashPropOr3x6[TObject, TKey1, TKey2, TKey3]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x3[TObject, TKey1, TKey2, TKey3, TDefault]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x2[TObject, TKey1, TKey2, TKey3, TKey4]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault]
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("propOr")
  def propOr_LodashPropOr6x6(defaultValue: __, path: PropertyPath): LodashPropOr6x6
  @JSName("propOr")
  var propOr_Original: LodashPropOr
  @JSName("propOr")
  def propOr_TDefault_LodashPropOr1x1[TDefault](defaultValue: TDefault): LodashPropOr1x1[TDefault]
  @JSName("propOr")
  def propOr_TDefault_LodashPropOr6x3[TDefault](defaultValue: TDefault, path: PropertyPath): LodashPropOr6x3[TDefault]
  @JSName("propOr")
  def propOr_TDefault_TDefault[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault
  @JSName("propOr")
  def propOr_TObjectTDefault_LodashPropOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __): LodashPropOr1x5[TObject, TDefault]
  @JSName("propOr")
  def propOr_TObjectTDefault_LodashPropOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashPropOr1x5[TObject, TDefault]
  @JSName("propOr")
  def propOr_TObjectTKey1TKey2TDefault_LodashPropOr2x3[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): LodashPropOr2x3[TObject, TKey1, TKey2, TDefault]
  @JSName("propOr")
  def propOr_TObjectTKey1TKey2TKey3TDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("propOr")
  def propOr_TObjectTKey1TKey2TKey3TKey4TDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("propOr")
  def propOr_TObjectTKey1TKey2TKey3TKey4_LodashPropOr4x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4]
  @JSName("propOr")
  def propOr_TObjectTKey1TKey2TKey3_LodashPropOr3x2[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x2[TObject, TKey1, TKey2, TKey3]
  @JSName("propOr")
  def propOr_TObjectTKey1TKey2_LodashPropOr2x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPropOr2x6[TObject, TKey1, TKey2]
  @JSName("propOr")
  def propOr_TObjectTKeyTDefault_LodashPropOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashPropOr1x3[TObject, TKey, TDefault]
  @JSName("propOr")
  def propOr_TObjectTKeyTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("propOr")
  def propOr_TObjectTKeyTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("propOr")
  def propOr_TObjectTKeyTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault
  @JSName("propOr")
  def propOr_TObjectTKey_LodashPropOr1x2[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPropOr1x2[TObject, TKey]
  @JSName("propOr")
  def propOr_TObjectTKey_LodashPropOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPropOr1x6[TObject, TKey]
  @JSName("propOr")
  def propOr_TObjectTKey_LodashPropOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey, `object`: TObject): LodashPropOr1x6[TObject, TKey]
  @JSName("propOr")
  def propOr_TObjectTKey_LodashPropOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPropOr1x6[TObject, TKey]
  @JSName("propOr")
  def propOr_TObject_LodashPropOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __): LodashPropOr1x4[TObject]
  @JSName("propOr")
  def propOr_TObject_LodashPropOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashPropOr1x4[TObject]
  @JSName("propOr")
  def propOr_TTDefault_LodashPropOr5x5[T, TDefault](defaultValue: TDefault, path: __): LodashPropOr5x5[T, TDefault]
  @JSName("propOr")
  def propOr_TTDefault_Union[T, TDefault](defaultValue: TDefault, path: Double): T | TDefault
  @JSName("propOr")
  def propOr_T_LodashPropOr5x4[T](defaultValue: __, path: __): LodashPropOr5x4[T]
  @JSName("propOr")
  def propOr_T_LodashPropOr5x6[T](defaultValue: __, path: Double): LodashPropOr5x6[T]
  
  @JSName("prop")
  def prop_LodashProp11x1(path: PropertyPath): LodashProp11x1
  @JSName("prop")
  var prop_Original: LodashProp
  @JSName("prop")
  def prop_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("prop")
  def prop_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("prop")
  def prop_TObjectTKey1TKey2TKey3_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  @JSName("prop")
  def prop_TObjectTKey1TKey2TKey3_LodashProp5x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashProp5x1[TObject, TKey1, TKey2, TKey3]
  @JSName("prop")
  def prop_TObjectTKey1TKey2_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  @JSName("prop")
  def prop_TObjectTKey1TKey2_LodashProp3x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashProp3x1[TObject, TKey1, TKey2]
  @JSName("prop")
  def prop_TObjectTKey_Any[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  @JSName("prop")
  def prop_TObjectTKey_LodashProp1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashProp1x1[TObject, TKey]
  @JSName("prop")
  def prop_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("prop")
  def prop_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("prop")
  def prop_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("prop")
  def prop_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("prop")
  def prop_TObject_LodashProp1x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProp1x2[TObject]
  @JSName("prop")
  def prop_TObject_LodashProp2x2[TObject /* <: js.Object */](path: __): LodashProp2x2[TObject]
  @JSName("prop")
  def prop_TObject_LodashProp2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProp2x2[TObject]
  @JSName("prop")
  def prop_T_LodashProp10x2[T](path: __): LodashProp10x2[T]
  @JSName("prop")
  def prop_T_LodashProp9x2[T](path: __, `object`: NumericDictionary[T]): LodashProp9x2[T]
  @JSName("prop")
  def prop_T_T[T](path: Double, `object`: NumericDictionary[T]): T
  @JSName("prop")
  def prop_T_Union[T](path: Double): js.UndefOr[T]
  
  def property(path: Double): LodashProperty9x1
  def property(path: PropertyPath): Unit
  def property(path: PropertyPath, `object`: Any): Any
  def property(path: __): LodashProperty11x2
  def property(path: __, `object`: Any): LodashProperty12x2
  def property[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T]
  def property[T](path: __, `object`: NumericDictionary[T]): LodashProperty9x2[T]
  def property[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashProperty1x1[TObject, TKey]
  def property[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashProperty3x1[TObject, TKey1, TKey2]
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  
  def propertyOf(path: Double): LodashPropertyOf9x1
  def propertyOf(path: PropertyPath): LodashPropertyOf11x1
  def propertyOf(path: PropertyPath, `object`: Any): Any
  def propertyOf(path: __): LodashPropertyOf11x2
  def propertyOf(path: __, `object`: Any): LodashPropertyOf12x2
  def propertyOf[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T]
  def propertyOf[T](path: __, `object`: NumericDictionary[T]): LodashPropertyOf9x2[T]
  def propertyOf[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashPropertyOf1x1[TObject, TKey]
  def propertyOf[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashPropertyOf3x1[TObject, TKey1, TKey2]
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ]
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropertyOf7x1[TObject, TKey1, TKey2, TKey3, TKey4]
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  @JSName("propertyOf")
  var propertyOf_Original: LodashPropertyOf
  @JSName("propertyOf")
  def propertyOf_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey1TKey2TKey3_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  @JSName("propertyOf")
  def propertyOf_TObjectTKey1TKey2TKey3_LodashPropertyOf5x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropertyOf5x1[TObject, TKey1, TKey2, TKey3]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey1TKey2_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  @JSName("propertyOf")
  def propertyOf_TObjectTKey1TKey2_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey_Any[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  @JSName("propertyOf")
  def propertyOf_TObjectTKey_LodashPropertyOf1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashPropertyOf1x1[TObject, TKey]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("propertyOf")
  def propertyOf_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("propertyOf")
  def propertyOf_TObject_LodashPropertyOf1x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPropertyOf1x2[TObject]
  @JSName("propertyOf")
  def propertyOf_TObject_LodashPropertyOf2x2[TObject /* <: js.Object */](path: __): LodashPropertyOf2x2[TObject]
  @JSName("propertyOf")
  def propertyOf_TObject_LodashPropertyOf2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPropertyOf2x2[TObject]
  @JSName("propertyOf")
  def propertyOf_T_LodashPropertyOf10x2[T](path: __): LodashPropertyOf10x2[T]
  @JSName("propertyOf")
  def propertyOf_T_LodashPropertyOf10x2[T](path: __, `object`: NumericDictionary[T]): LodashPropertyOf10x2[T]
  @JSName("propertyOf")
  def propertyOf_T_T[T](path: Double, `object`: NumericDictionary[T]): T
  @JSName("propertyOf")
  def propertyOf_T_Union[T](path: Double): js.UndefOr[T]
  @JSName("propertyOf")
  def propertyOf_Unit(path: PropertyPath): Unit
  
  @JSName("property")
  def property_LodashProperty11x1(path: PropertyPath): LodashProperty11x1
  @JSName("property")
  var property_Original: LodashProperty
  @JSName("property")
  def property_TObjectTKey1TKey2TKey3TKey4_LodashProperty7x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashProperty7x1[TObject, TKey1, TKey2, TKey3, TKey4]
  @JSName("property")
  def property_TObjectTKey1TKey2TKey3TKey4_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ]
  @JSName("property")
  def property_TObjectTKey1TKey2TKey3_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  @JSName("property")
  def property_TObjectTKey1TKey2TKey3_LodashProperty5x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashProperty5x1[TObject, TKey1, TKey2, TKey3]
  @JSName("property")
  def property_TObjectTKey1TKey2_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  @JSName("property")
  def property_TObjectTKey1TKey2_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ]
  @JSName("property")
  def property_TObjectTKey_Any[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  @JSName("property")
  def property_TObjectTKey_LodashProperty1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashProperty1x1[TObject, TKey]
  @JSName("property")
  def property_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("property")
  def property_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("property")
  def property_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("property")
  def property_TObjectTKey_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ]
  @JSName("property")
  def property_TObject_LodashProperty1x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProperty1x2[TObject]
  @JSName("property")
  def property_TObject_LodashProperty2x2[TObject /* <: js.Object */](path: __): LodashProperty2x2[TObject]
  @JSName("property")
  def property_TObject_LodashProperty2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProperty2x2[TObject]
  @JSName("property")
  def property_T_LodashProperty10x2[T](path: __): LodashProperty10x2[T]
  @JSName("property")
  def property_T_LodashProperty10x2[T](path: __, `object`: NumericDictionary[T]): LodashProperty10x2[T]
  @JSName("property")
  def property_T_T[T](path: Double, `object`: NumericDictionary[T]): T
  @JSName("property")
  def property_T_Union[T](path: Double): js.UndefOr[T]
  
  def props(props: PropertyPath): LodashAt1x1
  def props[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String], `object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def props[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T]
  def props[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T]
  def props[T](props: __): LodashAt1x2[T]
  def props[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T]
  def props[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T]
  def props[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T]
  @JSName("props")
  var props_Original: LodashAt
  @JSName("props")
  def props_T_Array[T](props: (Many[/* keyof T */ java.lang.String]) | PropertyPath): js.Array[T]
  @JSName("props")
  def props_T_LodashAt2x1[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): LodashAt2x1[T]
  @JSName("props")
  def props_T_LodashAt2x2[T /* <: js.Object */](props: __): LodashAt2x2[T]
  
  def pull[T](values: T): LodashPull1x1[T]
  def pull[T](values: T, array: js.Array[T]): js.Array[T]
  def pull[T](values: T, array: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def pull[T](values: __, array: js.Array[T]): LodashPull1x2[T]
  def pull[T](values: __, array: typings.lodash.mod.List[T]): LodashPull2x2[T]
  
  def pullAll[T](values: typings.lodash.mod.List[T]): LodashPullAll1x1[T]
  def pullAll[T](values: typings.lodash.mod.List[T], array: js.Array[T]): js.Array[T]
  def pullAll[T](values: typings.lodash.mod.List[T], array: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def pullAll[T](values: __, array: js.Array[T]): LodashPullAll1x2[T]
  def pullAll[T](values: __, array: typings.lodash.mod.List[T]): LodashPullAll2x2[T]
  
  def pullAllBy[T](iteratee: ValueIteratee[T]): LodashPullAllBy1x1[T]
  def pullAllBy[T](iteratee: ValueIteratee[T], values: typings.lodash.mod.List[T]): LodashPullAllBy1x3[T]
  def pullAllBy[T](iteratee: ValueIteratee[T], values: typings.lodash.mod.List[T], array: js.Array[T]): js.Array[T]
  def pullAllBy[T](iteratee: ValueIteratee[T], values: typings.lodash.mod.List[T], array: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def pullAllBy[T](iteratee: ValueIteratee[T], values: __, array: js.Array[T]): LodashPullAllBy1x5[T]
  def pullAllBy[T](iteratee: ValueIteratee[T], values: __, array: typings.lodash.mod.List[T]): LodashPullAllBy2x5[T]
  def pullAllBy[T](iteratee: __, values: typings.lodash.mod.List[T]): LodashPullAllBy1x2[T]
  def pullAllBy[T](iteratee: __, values: typings.lodash.mod.List[T], array: js.Array[T]): LodashPullAllBy1x6[T]
  def pullAllBy[T](iteratee: __, values: typings.lodash.mod.List[T], array: typings.lodash.mod.List[T]): LodashPullAllBy2x6[T]
  def pullAllBy[T](iteratee: __, values: __, array: js.Array[T]): LodashPullAllBy1x4[T]
  def pullAllBy[T](iteratee: __, values: __, array: typings.lodash.mod.List[T]): LodashPullAllBy2x4[T]
  @JSName("pullAllBy")
  var pullAllBy_Original: LodashPullAllBy
  @JSName("pullAllBy")
  def pullAllBy_T1T2[T1, T2](iteratee: ValueIteratee[T1 | T2], values: typings.lodash.mod.List[T2], array: js.Array[T1]): js.Array[T1]
  @JSName("pullAllBy")
  def pullAllBy_T1T2[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    values: typings.lodash.mod.List[T2],
    array: typings.lodash.mod.List[T1]
  ): typings.lodash.mod.List[T1]
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x1[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashPullAllBy3x1[T1, T2]
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x3[T1, T2](iteratee: ValueIteratee[T1 | T2], values: typings.lodash.mod.List[T2]): LodashPullAllBy3x3[T1]
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x5[T1, T2](iteratee: ValueIteratee[T1 | T2], values: __, array: js.Array[T1]): LodashPullAllBy3x5[T1, T2]
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x6[T1, T2](iteratee: __, values: typings.lodash.mod.List[T2], array: js.Array[T1]): LodashPullAllBy3x6[T1, T2]
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy4x5[T1, T2](iteratee: ValueIteratee[T1 | T2], values: __, array: typings.lodash.mod.List[T1]): LodashPullAllBy4x5[T1, T2]
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy4x6[T1, T2](iteratee: __, values: typings.lodash.mod.List[T2], array: typings.lodash.mod.List[T1]): LodashPullAllBy4x6[T1, T2]
  @JSName("pullAllBy")
  def pullAllBy_T1_LodashPullAllBy3x4[T1](iteratee: __, values: __, array: js.Array[T1]): LodashPullAllBy3x4[T1]
  @JSName("pullAllBy")
  def pullAllBy_T1_LodashPullAllBy4x4[T1](iteratee: __, values: __, array: typings.lodash.mod.List[T1]): LodashPullAllBy4x4[T1]
  @JSName("pullAllBy")
  def pullAllBy_T2_LodashPullAllBy3x2[T2](iteratee: __, values: typings.lodash.mod.List[T2]): LodashPullAllBy3x2[T2]
  
  def pullAllWith[T](comparator: Comparator[T]): LodashPullAllWith1x1[T]
  def pullAllWith[T](comparator: Comparator[T], values: typings.lodash.mod.List[T]): LodashPullAllWith1x3[T]
  def pullAllWith[T](comparator: Comparator[T], values: typings.lodash.mod.List[T], array: js.Array[T]): js.Array[T]
  def pullAllWith[T](comparator: Comparator[T], values: typings.lodash.mod.List[T], array: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def pullAllWith[T](comparator: Comparator[T], values: __, array: js.Array[T]): LodashPullAllWith1x5[T]
  def pullAllWith[T](comparator: Comparator[T], values: __, array: typings.lodash.mod.List[T]): LodashPullAllWith2x5[T]
  def pullAllWith[T2](comparator: __, values: typings.lodash.mod.List[T2]): LodashPullAllWith3x2[T2]
  def pullAllWith[T](comparator: __, values: typings.lodash.mod.List[T], array: js.Array[T]): LodashPullAllWith1x6[T]
  def pullAllWith[T](comparator: __, values: typings.lodash.mod.List[T], array: typings.lodash.mod.List[T]): LodashPullAllWith2x6[T]
  def pullAllWith[T](comparator: __, values: __, array: js.Array[T]): LodashPullAllWith1x4[T]
  def pullAllWith[T1](comparator: __, values: __, array: typings.lodash.mod.List[T1]): LodashPullAllWith4x4[T1]
  @JSName("pullAllWith")
  var pullAllWith_Original: LodashPullAllWith
  @JSName("pullAllWith")
  def pullAllWith_T1T2[T1, T2](comparator: Comparator2[T1, T2], values: typings.lodash.mod.List[T2], array: js.Array[T1]): js.Array[T1]
  @JSName("pullAllWith")
  def pullAllWith_T1T2[T1, T2](
    comparator: Comparator2[T1, T2],
    values: typings.lodash.mod.List[T2],
    array: typings.lodash.mod.List[T1]
  ): typings.lodash.mod.List[T1]
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x1[T1, T2](comparator: Comparator2[T1, T2]): LodashPullAllWith3x1[T1, T2]
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x3[T1, T2](comparator: Comparator2[T1, T2], values: typings.lodash.mod.List[T2]): LodashPullAllWith3x3[T1]
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x5[T1, T2](comparator: Comparator2[T1, T2], values: __, array: js.Array[T1]): LodashPullAllWith3x5[T1, T2]
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x6[T1, T2](comparator: __, values: typings.lodash.mod.List[T2], array: js.Array[T1]): LodashPullAllWith3x6[T1, T2]
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith4x5[T1, T2](comparator: Comparator2[T1, T2], values: __, array: typings.lodash.mod.List[T1]): LodashPullAllWith4x5[T1, T2]
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith4x6[T1, T2](comparator: __, values: typings.lodash.mod.List[T2], array: typings.lodash.mod.List[T1]): LodashPullAllWith4x6[T1, T2]
  @JSName("pullAllWith")
  def pullAllWith_T1_LodashPullAllWith3x4[T1](comparator: __, values: __, array: js.Array[T1]): LodashPullAllWith3x4[T1]
  @JSName("pullAllWith")
  def pullAllWith_T_LodashPullAllWith1x2[T](comparator: __, values: typings.lodash.mod.List[T]): LodashPullAllWith1x2[T]
  @JSName("pullAllWith")
  def pullAllWith_T_LodashPullAllWith2x4[T](comparator: __, values: __, array: typings.lodash.mod.List[T]): LodashPullAllWith2x4[T]
  
  @JSName("pullAll")
  var pullAll_Original: LodashPullAll
  
  def pullAt(indexes: Many[Double]): LodashPullAt1x1
  def pullAt[T](indexes: Many[Double], array: js.Array[T]): js.Array[T]
  def pullAt[T](indexes: Many[Double], array: typings.lodash.mod.List[T]): typings.lodash.mod.List[T]
  def pullAt[T](indexes: __, array: js.Array[T]): LodashPullAt1x2[T]
  def pullAt[T](indexes: __, array: typings.lodash.mod.List[T]): LodashPullAt2x2[T]
  @JSName("pullAt")
  var pullAt_Original: LodashPullAt
  
  @JSName("pull")
  var pull_Original: LodashPull
  
  def random(maxOrMin: Double): LodashRandom1x1
  def random(maxOrMin: Double, floatingOrMax: Boolean): Double
  def random(maxOrMin: Double, floatingOrMax: Double): Double
  def random(max: __, floating: Boolean): LodashRandom1x2
  def random(min: __, max: Double): LodashRandom2x2
  @JSName("random")
  var random_Original: LodashRandom
  
  def range(start: Double): LodashRange1x1
  def range(start: Double, end: Double): js.Array[Double]
  def range(start: __, end: Double): LodashRange1x2
  
  def rangeRight(start: Double): LodashRangeRight1x1
  def rangeRight(start: Double, end: Double): js.Array[Double]
  def rangeRight(start: __, end: Double): LodashRangeRight1x2
  @JSName("rangeRight")
  var rangeRight_Original: LodashRangeRight
  
  def rangeStep(start: Double): LodashRangeStep1x1
  def rangeStep(start: Double, end: Double): LodashRangeStep1x3
  def rangeStep(start: Double, end: Double, step: Double): js.Array[Double]
  def rangeStep(start: Double, end: __, step: Double): LodashRangeStep1x5
  def rangeStep(start: __, end: Double): LodashRangeStep1x2
  def rangeStep(start: __, end: Double, step: Double): LodashRangeStep1x6
  def rangeStep(start: __, end: __, step: Double): LodashRangeStep1x4
  
  def rangeStepRight(start: Double): LodashRangeStepRight1x1
  def rangeStepRight(start: Double, end: Double): LodashRangeStepRight1x3
  def rangeStepRight(start: Double, end: Double, step: Double): js.Array[Double]
  def rangeStepRight(start: Double, end: __, step: Double): LodashRangeStepRight1x5
  def rangeStepRight(start: __, end: Double): LodashRangeStepRight1x2
  def rangeStepRight(start: __, end: Double, step: Double): LodashRangeStepRight1x6
  def rangeStepRight(start: __, end: __, step: Double): LodashRangeStepRight1x4
  @JSName("rangeStepRight")
  var rangeStepRight_Original: LodashRangeStepRight
  
  @JSName("rangeStep")
  var rangeStep_Original: LodashRangeStep
  
  @JSName("range")
  var range_Original: LodashRange
  
  def rearg(indexes: Many[Double]): LodashRearg1x1
  def rearg(indexes: Many[Double], func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def rearg(indexes: __, func: js.Function1[/* repeated */ Any, Any]): LodashRearg1x2
  @JSName("rearg")
  var rearg_Original: LodashRearg
  
  def reduce[TResult](callback: __, accumulator: TResult): LodashReduce1x2[TResult]
  def reduce[T](callback: __, accumulator: __): LodashReduce2x4[T]
  def reduce[T /* <: js.Object */](callback: __, accumulator: __, collection: T): LodashReduce3x4[T]
  def reduce[T](callback: __, accumulator: __, collection: js.Array[T]): LodashReduce1x4[T]
  def reduce[T](callback: __, accumulator: __, collection: typings.lodash.mod.List[T]): LodashReduce2x4[T]
  def reduce[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduce3x1[T, TResult]
  def reduce[T, TResult](
    callback: MemoIteratorCapped[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      TResult
    ],
    accumulator: TResult
  ): TResult
  def reduce[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult, collection: js.Array[T]): TResult
  def reduce[T, TResult](
    callback: MemoIteratorCapped[T, TResult],
    accumulator: TResult,
    collection: typings.lodash.mod.List[T]
  ): TResult
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __): LodashReduce1x5[TResult]
  def reduce[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __,
    collection: T
  ): LodashReduce3x5[TResult]
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __, collection: js.Array[T]): LodashReduce1x5[TResult]
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __, collection: typings.lodash.mod.List[T]): LodashReduce2x5[TResult]
  def reduce[T /* <: js.Object */, TResult](callback: __, accumulator: TResult, collection: T): LodashReduce3x6[T, TResult]
  def reduce[T, TResult](callback: __, accumulator: TResult, collection: js.Array[T]): LodashReduce1x6[T, TResult]
  def reduce[T, TResult](callback: __, accumulator: TResult, collection: typings.lodash.mod.List[T]): LodashReduce2x6[T, TResult]
  
  def reduceRight[TResult](callback: __, accumulator: TResult): LodashReduceRight1x2[TResult]
  def reduceRight[T /* <: js.Object */](callback: __, accumulator: __): LodashReduceRight3x4[T]
  def reduceRight[T /* <: js.Object */](callback: __, accumulator: __, collection: T): LodashReduceRight3x4[T]
  def reduceRight[T](callback: __, accumulator: __, collection: js.Array[T]): LodashReduceRight1x4[T]
  def reduceRight[T](callback: __, accumulator: __, collection: typings.lodash.mod.List[T]): LodashReduceRight2x4[T]
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduceRight3x1[T, TResult]
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): LodashReduceRight3x3[T, TResult]
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult, collection: js.Array[T]): TResult
  def reduceRight[T, TResult](
    callback: MemoIteratorCappedRight[T, TResult],
    accumulator: TResult,
    collection: typings.lodash.mod.List[T]
  ): TResult
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __): LodashReduceRight2x5[TResult]
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __,
    collection: T
  ): LodashReduceRight3x5[TResult]
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __, collection: js.Array[T]): LodashReduceRight1x5[TResult]
  def reduceRight[T, TResult](
    callback: MemoIteratorCappedRight[T, TResult],
    accumulator: __,
    collection: typings.lodash.mod.List[T]
  ): LodashReduceRight2x5[TResult]
  def reduceRight[T /* <: js.Object */, TResult](callback: __, accumulator: TResult, collection: T): LodashReduceRight3x6[T, TResult]
  def reduceRight[T, TResult](callback: __, accumulator: TResult, collection: js.Array[T]): LodashReduceRight1x6[T, TResult]
  def reduceRight[T, TResult](callback: __, accumulator: TResult, collection: typings.lodash.mod.List[T]): LodashReduceRight2x6[T, TResult]
  @JSName("reduceRight")
  var reduceRight_Original: LodashReduceRight
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight1x1[T, TResult](callback: MemoIteratorCappedRight[T, TResult]): LodashReduceRight1x1[T, TResult]
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight1x3[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult): LodashReduceRight1x3[T, TResult]
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight1x5[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __): LodashReduceRight1x5[TResult]
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight1x6[T, TResult](callback: __, accumulator: TResult): LodashReduceRight1x6[T, TResult]
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight2x6[T, TResult](callback: __, accumulator: TResult): LodashReduceRight2x6[T, TResult]
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight3x5[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __
  ): LodashReduceRight3x5[TResult]
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight3x6[T /* <: js.Object */, TResult](callback: __, accumulator: TResult): LodashReduceRight3x6[T, TResult]
  @JSName("reduceRight")
  def reduceRight_TTResult_TResult[T, TResult](
    callback: MemoIteratorCappedRight[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      TResult
    ],
    accumulator: TResult
  ): TResult
  @JSName("reduceRight")
  def reduceRight_T_LodashReduceRight1x4[T](callback: __, accumulator: __): LodashReduceRight1x4[T]
  @JSName("reduceRight")
  def reduceRight_T_LodashReduceRight2x4[T](callback: __, accumulator: __): LodashReduceRight2x4[T]
  
  @JSName("reduce")
  var reduce_Original: LodashReduce
  @JSName("reduce")
  def reduce_TTResult_LodashReduce1x1[T, TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce1x1[T, TResult]
  @JSName("reduce")
  def reduce_TTResult_LodashReduce1x3[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): LodashReduce1x3[T, TResult]
  @JSName("reduce")
  def reduce_TTResult_LodashReduce1x6[T, TResult](callback: __, accumulator: TResult): LodashReduce1x6[T, TResult]
  @JSName("reduce")
  def reduce_TTResult_LodashReduce2x5[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __): LodashReduce2x5[TResult]
  @JSName("reduce")
  def reduce_TTResult_LodashReduce2x6[T, TResult](callback: __, accumulator: TResult): LodashReduce2x6[T, TResult]
  @JSName("reduce")
  def reduce_TTResult_LodashReduce3x3[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): LodashReduce3x3[T, TResult]
  @JSName("reduce")
  def reduce_TTResult_LodashReduce3x5[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __
  ): LodashReduce3x5[TResult]
  @JSName("reduce")
  def reduce_TTResult_LodashReduce3x6[T /* <: js.Object */, TResult](callback: __, accumulator: TResult): LodashReduce3x6[T, TResult]
  @JSName("reduce")
  def reduce_T_LodashReduce1x4[T](callback: __, accumulator: __): LodashReduce1x4[T]
  @JSName("reduce")
  def reduce_T_LodashReduce3x4[T /* <: js.Object */](callback: __, accumulator: __): LodashReduce3x4[T]
  
  def reject[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): js.Array[T]
  def reject[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def reject[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): js.Array[T]
  def reject[T /* <: js.Object */](predicate: __): LodashReject2x2[T]
  def reject[T /* <: js.Object */](predicate: __, collection: T): LodashReject2x2[T]
  def reject[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashReject1x2[T]
  @JSName("reject")
  var reject_Original: LodashReject
  @JSName("reject")
  def reject_T_LodashReject1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashReject1x1[T]
  @JSName("reject")
  def reject_T_LodashReject1x2[T](predicate: __): LodashReject1x2[T]
  
  def remove[T](predicate: ValueIteratee[T]): LodashRemove1x1[T]
  def remove[T](predicate: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def remove[T](predicate: __, array: typings.lodash.mod.List[T]): LodashRemove1x2[T]
  @JSName("remove")
  var remove_Original: LodashRemove
  
  def repeat(n: Double): LodashRepeat1x1
  def repeat(n: Double, string: java.lang.String): java.lang.String
  def repeat(n: __, string: java.lang.String): LodashRepeat1x2
  @JSName("repeat")
  var repeat_Original: LodashRepeat
  
  def replace(pattern: java.lang.String): LodashReplace1x1
  def replace(pattern: java.lang.String, replacement: java.lang.String): LodashReplace1x3
  def replace(pattern: java.lang.String, replacement: java.lang.String, string: java.lang.String): java.lang.String
  def replace(pattern: java.lang.String, replacement: ReplaceFunction): LodashReplace1x3
  def replace(pattern: java.lang.String, replacement: ReplaceFunction, string: java.lang.String): java.lang.String
  def replace(pattern: java.lang.String, replacement: __, string: java.lang.String): LodashReplace1x5
  def replace(pattern: js.RegExp): LodashReplace1x1
  def replace(pattern: js.RegExp, replacement: java.lang.String): LodashReplace1x3
  def replace(pattern: js.RegExp, replacement: java.lang.String, string: java.lang.String): java.lang.String
  def replace(pattern: js.RegExp, replacement: ReplaceFunction): LodashReplace1x3
  def replace(pattern: js.RegExp, replacement: ReplaceFunction, string: java.lang.String): java.lang.String
  def replace(pattern: js.RegExp, replacement: __, string: java.lang.String): LodashReplace1x5
  def replace(pattern: __, replacement: java.lang.String): LodashReplace1x2
  def replace(pattern: __, replacement: java.lang.String, string: java.lang.String): LodashReplace1x6
  def replace(pattern: __, replacement: ReplaceFunction): LodashReplace1x2
  def replace(pattern: __, replacement: ReplaceFunction, string: java.lang.String): LodashReplace1x6
  def replace(pattern: __, replacement: __, string: java.lang.String): LodashReplace1x4
  @JSName("replace")
  var replace_Original: LodashReplace
  
  def rest(func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  
  def restFrom(start: Double): LodashRestFrom1x1
  def restFrom(start: Double, func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  def restFrom(start: __, func: js.Function1[/* repeated */ Any, Any]): LodashRestFrom1x2
  @JSName("restFrom")
  var restFrom_Original: LodashRestFrom
  
  @JSName("rest")
  var rest_Original: LodashRest
  
  def result(path: PropertyPath): LodashResult1x1
  def result(path: __, `object`: Any): LodashResult1x2
  def result[TResult](path: PropertyPath, `object`: Any): TResult
  @JSName("result")
  var result_Original: LodashResult
  
  def reverse[TList /* <: typings.lodash.mod.List[Any] */](array: TList): TList
  @JSName("reverse")
  var reverse_Original: LodashReverse
  
  def round(n: Double): Double
  @JSName("round")
  var round_Original: LodashRound
  
  def runInContext(context: js.Object): LoDashStatic
  @JSName("runInContext")
  var runInContext_Original: LodashRunInContext
  
  def sample[T](): js.UndefOr[T]
  def sample[T /* <: js.Object */](collection: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def sample[T](collection: Dictionary[T]): js.UndefOr[T]
  def sample[T](collection: NumericDictionary[T]): js.UndefOr[T]
  
  def sampleSize(n: Double): LodashSampleSize1x1
  def sampleSize[T /* <: js.Object */](n: Double, collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def sampleSize[T](n: Double, collection: Dictionary[T]): js.Array[T]
  def sampleSize[T](n: Double, collection: NumericDictionary[T]): js.Array[T]
  def sampleSize[T](n: __): LodashSampleSize1x2[T]
  def sampleSize[T /* <: js.Object */](n: __, collection: T): LodashSampleSize2x2[T]
  def sampleSize[T](n: __, collection: Dictionary[T]): LodashSampleSize1x2[T]
  def sampleSize[T](n: __, collection: NumericDictionary[T]): LodashSampleSize1x2[T]
  @JSName("sampleSize")
  var sampleSize_Original: LodashSampleSize
  @JSName("sampleSize")
  def sampleSize_T_Array[T](n: Double): js.Array[T]
  @JSName("sampleSize")
  def sampleSize_T_LodashSampleSize2x2[T /* <: js.Object */](n: __): LodashSampleSize2x2[T]
  
  @JSName("sample")
  var sample_Original: LodashSample
  
  def set(path: PropertyPath): LodashSet1x1
  def set(path: PropertyPath, value: Any): LodashSet1x3
  def set(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5
  def set(path: __, value: Any): LodashSet1x2
  def set(path: __, value: Any, `object`: js.Object): LodashSet2x6
  def set(path: __, value: __, `object`: js.Object): LodashSet2x4
  def set[T /* <: js.Object */](path: PropertyPath, value: Any, `object`: T): T
  def set[TResult](path: PropertyPath, value: Any, `object`: js.Object): TResult
  def set[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T]
  def set[T /* <: js.Object */](path: __, value: Any, `object`: T): LodashSet1x6[T]
  def set[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T]
  
  def setWith(customizer: __, path: PropertyPath): LodashSetWith1x2
  def setWith(customizer: __, path: PropertyPath, value: Any): LodashSetWith1x6
  def setWith(customizer: __, path: __, value: Any): LodashSetWith1x4
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashSetWith1x1[T]
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath): LodashSetWith1x3[T]
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: Any): LodashSetWith1x7[T]
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: Any, `object`: T): T
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: __, `object`: T): LodashSetWith1x11[T]
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: Any): LodashSetWith1x5[T]
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: Any, `object`: T): LodashSetWith1x13[T]
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: __, `object`: T): LodashSetWith1x9[T]
  def setWith[T /* <: js.Object */](customizer: __, path: PropertyPath, value: Any, `object`: T): LodashSetWith1x14[T]
  def setWith[T /* <: js.Object */](customizer: __, path: PropertyPath, value: __, `object`: T): LodashSetWith1x10[T]
  def setWith[T /* <: js.Object */](customizer: __, path: __, value: Any, `object`: T): LodashSetWith1x12[T]
  def setWith[T /* <: js.Object */](customizer: __, path: __, value: __, `object`: T): LodashSetWith1x8[T]
  @JSName("setWith")
  var setWith_Original: LodashSetWith
  
  @JSName("set")
  var set_Original: LodashSet
  
  def shuffle[T](): js.Array[T]
  def shuffle[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def shuffle[T](collection: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("shuffle")
  var shuffle_Original: LodashShuffle
  
  def size(): Double
  def size(collection: java.lang.String): Double
  def size(collection: js.Object): Double
  @JSName("size")
  var size_Original: LodashSize
  
  def slice(start: Double): LodashSlice1x1
  def slice(start: Double, end: Double): LodashSlice1x3
  def slice(start: __, end: Double): LodashSlice1x2
  def slice[T](start: Double, end: Double, array: typings.lodash.mod.List[T]): js.Array[T]
  def slice[T](start: Double, end: __): LodashSlice1x5[T]
  def slice[T](start: Double, end: __, array: typings.lodash.mod.List[T]): LodashSlice1x5[T]
  def slice[T](start: __, end: Double, array: typings.lodash.mod.List[T]): LodashSlice1x6[T]
  def slice[T](start: __, end: __): LodashSlice1x4[T]
  def slice[T](start: __, end: __, array: typings.lodash.mod.List[T]): LodashSlice1x4[T]
  @JSName("slice")
  var slice_Original: LodashSlice
  @JSName("slice")
  def slice_T_Array[T](start: Double, end: Double): js.Array[T]
  @JSName("slice")
  def slice_T_LodashSlice1x6[T](start: __, end: Double): LodashSlice1x6[T]
  
  def snakeCase(string: java.lang.String): java.lang.String
  @JSName("snakeCase")
  var snakeCase_Original: LodashSnakeCase
  
  def some[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): Boolean
  def some[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean
  def some[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.lodash.mod.List[T]): Boolean
  def some[T](predicate: __): LodashSome1x2[T]
  def some[T /* <: js.Object */](predicate: __, collection: T): LodashSome2x2[T]
  def some[T](predicate: __, collection: typings.lodash.mod.List[T]): LodashSome1x2[T]
  @JSName("some")
  var some_Original: LodashSome
  @JSName("some")
  def some_T_LodashSome1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashSome1x1[T]
  @JSName("some")
  def some_T_LodashSome2x2[T /* <: js.Object */](predicate: __): LodashSome2x2[T]
  
  def sortBy[T](
    iteratees: Many[
      ValueIteratee[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
      ]
    ]
  ): js.Array[T]
  def sortBy[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def sortBy[T](iteratees: Many[ValueIteratee[T]], collection: typings.lodash.mod.List[T]): js.Array[T]
  def sortBy[T /* <: js.Object */](iteratees: __): LodashSortBy2x2[T]
  def sortBy[T /* <: js.Object */](iteratees: __, collection: T): LodashSortBy2x2[T]
  def sortBy[T](iteratees: __, collection: typings.lodash.mod.List[T]): LodashSortBy1x2[T]
  @JSName("sortBy")
  var sortBy_Original: LodashSortBy
  @JSName("sortBy")
  def sortBy_T_LodashSortBy1x1[T](iteratees: Many[ValueIteratee[T]]): LodashSortBy1x1[T]
  @JSName("sortBy")
  def sortBy_T_LodashSortBy1x2[T](iteratees: __): LodashSortBy1x2[T]
  
  def sortedIndex[T](value: T): Double
  def sortedIndex[T](value: T, array: typings.lodash.mod.List[T]): Double
  def sortedIndex[T](value: __): LodashSortedIndex1x2[T]
  def sortedIndex[T](value: __, array: typings.lodash.mod.List[T]): LodashSortedIndex1x2[T]
  
  def sortedIndexBy[T](iteratee: ValueIteratee[T]): LodashSortedIndexBy1x1[T]
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: T): Double
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: T, array: typings.lodash.mod.List[T]): Double
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: __): LodashSortedIndexBy1x5[T]
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: __, array: typings.lodash.mod.List[T]): LodashSortedIndexBy1x5[T]
  def sortedIndexBy[T](iteratee: __, value: T): LodashSortedIndexBy1x2[T]
  def sortedIndexBy[T](iteratee: __, value: T, array: typings.lodash.mod.List[T]): LodashSortedIndexBy1x6[T]
  def sortedIndexBy[T](iteratee: __, value: __): LodashSortedIndexBy1x4[T]
  def sortedIndexBy[T](iteratee: __, value: __, array: typings.lodash.mod.List[T]): LodashSortedIndexBy1x4[T]
  @JSName("sortedIndexBy")
  var sortedIndexBy_Original: LodashSortedIndexBy
  @JSName("sortedIndexBy")
  def sortedIndexBy_T_LodashSortedIndexBy1x3[T](iteratee: ValueIteratee[T], value: T): LodashSortedIndexBy1x3[T]
  @JSName("sortedIndexBy")
  def sortedIndexBy_T_LodashSortedIndexBy1x6[T](iteratee: __, value: T): LodashSortedIndexBy1x6[T]
  
  def sortedIndexOf[T](value: T): LodashSortedIndexOf1x1[T]
  def sortedIndexOf[T](value: T, array: typings.lodash.mod.List[T]): Double
  def sortedIndexOf[T](value: __): LodashSortedIndexOf1x2[T]
  def sortedIndexOf[T](value: __, array: typings.lodash.mod.List[T]): LodashSortedIndexOf1x2[T]
  @JSName("sortedIndexOf")
  var sortedIndexOf_Original: LodashSortedIndexOf
  @JSName("sortedIndexOf")
  def sortedIndexOf_T_Double[T](value: T): Double
  
  @JSName("sortedIndex")
  var sortedIndex_Original: LodashSortedIndex
  @JSName("sortedIndex")
  def sortedIndex_T_LodashSortedIndex1x1[T](value: T): LodashSortedIndex1x1[T]
  
  def sortedLastIndex[T](value: T): LodashSortedLastIndex1x1[T]
  def sortedLastIndex[T](value: T, array: typings.lodash.mod.List[T]): Double
  def sortedLastIndex[T](value: __): LodashSortedLastIndex1x2[T]
  def sortedLastIndex[T](value: __, array: typings.lodash.mod.List[T]): LodashSortedLastIndex1x2[T]
  
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T]): LodashSortedLastIndexBy1x1[T]
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: T): LodashSortedLastIndexBy1x3[T]
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: T, array: typings.lodash.mod.List[T]): Double
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: __): LodashSortedLastIndexBy1x5[T]
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: __, array: typings.lodash.mod.List[T]): LodashSortedLastIndexBy1x5[T]
  def sortedLastIndexBy[T](iteratee: __, value: T): LodashSortedLastIndexBy1x2[T]
  def sortedLastIndexBy[T](iteratee: __, value: T, array: typings.lodash.mod.List[T]): LodashSortedLastIndexBy1x6[T]
  def sortedLastIndexBy[T](iteratee: __, value: __): LodashSortedLastIndexBy1x4[T]
  def sortedLastIndexBy[T](iteratee: __, value: __, array: typings.lodash.mod.List[T]): LodashSortedLastIndexBy1x4[T]
  @JSName("sortedLastIndexBy")
  var sortedLastIndexBy_Original: LodashSortedLastIndexBy
  @JSName("sortedLastIndexBy")
  def sortedLastIndexBy_T_Double[T](iteratee: ValueIteratee[T], value: T): Double
  @JSName("sortedLastIndexBy")
  def sortedLastIndexBy_T_LodashSortedLastIndexBy1x6[T](iteratee: __, value: T): LodashSortedLastIndexBy1x6[T]
  
  def sortedLastIndexOf[T](value: T): Double
  def sortedLastIndexOf[T](value: T, array: typings.lodash.mod.List[T]): Double
  def sortedLastIndexOf[T](value: __): LodashSortedLastIndexOf1x2[T]
  def sortedLastIndexOf[T](value: __, array: typings.lodash.mod.List[T]): LodashSortedLastIndexOf1x2[T]
  @JSName("sortedLastIndexOf")
  var sortedLastIndexOf_Original: LodashSortedLastIndexOf
  @JSName("sortedLastIndexOf")
  def sortedLastIndexOf_T_LodashSortedLastIndexOf1x1[T](value: T): LodashSortedLastIndexOf1x1[T]
  
  @JSName("sortedLastIndex")
  var sortedLastIndex_Original: LodashSortedLastIndex
  @JSName("sortedLastIndex")
  def sortedLastIndex_T_Double[T](value: T): Double
  
  def sortedUniq[T](): js.Array[T]
  def sortedUniq[T](array: typings.lodash.mod.List[T]): js.Array[T]
  
  def sortedUniqBy[T](iteratee: ValueIteratee[T]): js.Array[T]
  def sortedUniqBy[T](iteratee: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def sortedUniqBy[T](iteratee: __): LodashSortedUniqBy1x2[T]
  def sortedUniqBy[T](iteratee: __, array: typings.lodash.mod.List[T]): LodashSortedUniqBy1x2[T]
  @JSName("sortedUniqBy")
  var sortedUniqBy_Original: LodashSortedUniqBy
  @JSName("sortedUniqBy")
  def sortedUniqBy_T_LodashSortedUniqBy1x1[T](iteratee: ValueIteratee[T]): LodashSortedUniqBy1x1[T]
  
  @JSName("sortedUniq")
  var sortedUniq_Original: LodashSortedUniq
  
  def split(separator: java.lang.String): LodashSplit1x1
  def split(separator: java.lang.String, string: java.lang.String): js.Array[java.lang.String]
  def split(separator: js.RegExp): LodashSplit1x1
  def split(separator: js.RegExp, string: java.lang.String): js.Array[java.lang.String]
  def split(separator: __): LodashSplit1x2
  def split(separator: __, string: java.lang.String): LodashSplit1x2
  @JSName("split")
  def split_Array(separator: java.lang.String): js.Array[java.lang.String]
  @JSName("split")
  def split_Array(separator: js.RegExp): js.Array[java.lang.String]
  @JSName("split")
  var split_Original: LodashSplit
  
  def spread[TResult](func: js.Function1[/* repeated */ Any, TResult]): js.Function1[/* repeated */ Any, TResult]
  
  def spreadFrom(start: Double): LodashSpreadFrom1x1
  def spreadFrom[TResult](start: Double, func: js.Function1[/* repeated */ Any, TResult]): js.Function1[/* repeated */ Any, TResult]
  def spreadFrom[TResult](start: __, func: js.Function1[/* repeated */ Any, TResult]): LodashSpreadFrom1x2[TResult]
  @JSName("spreadFrom")
  var spreadFrom_Original: LodashSpreadFrom
  
  @JSName("spread")
  var spread_Original: LodashSpread
  
  def startCase(string: java.lang.String): java.lang.String
  @JSName("startCase")
  var startCase_Original: LodashStartCase
  
  def startsWith(target: java.lang.String): LodashStartsWith1x1
  def startsWith(target: java.lang.String, string: java.lang.String): Boolean
  def startsWith(target: __, string: java.lang.String): LodashStartsWith1x2
  @JSName("startsWith")
  var startsWith_Original: LodashStartsWith
  
  def stubArray(): js.Array[Any]
  @JSName("stubArray")
  var stubArray_Original: LodashStubArray
  
  def stubFalse(): `false`
  @JSName("stubFalse")
  var stubFalse_Original: LodashStubFalse
  
  def stubObject(): Any
  @JSName("stubObject")
  var stubObject_Original: LodashStubObject
  
  def stubString(): java.lang.String
  @JSName("stubString")
  var stubString_Original: LodashStubString
  
  def stubTrue(): `true`
  @JSName("stubTrue")
  var stubTrue_Original: LodashStubTrue
  
  def subtract(minuend: Double): LodashSubtract1x1
  def subtract(minuend: Double, subtrahend: Double): Double
  def subtract(minuend: __, subtrahend: Double): LodashSubtract1x2
  @JSName("subtract")
  var subtract_Original: LodashSubtract
  
  def sum(): Double
  def sum(collection: typings.lodash.mod.List[Any]): Double
  
  def sumBy[T](iteratee: java.lang.String): LodashSumBy1x1[T]
  def sumBy[T](iteratee: java.lang.String, collection: typings.lodash.mod.List[T]): Double
  def sumBy[T](iteratee: js.Function1[/* value */ T, Double]): LodashSumBy1x1[T]
  def sumBy[T](iteratee: js.Function1[/* value */ T, Double], collection: typings.lodash.mod.List[T]): Double
  def sumBy[T](iteratee: __): LodashSumBy1x2[T]
  def sumBy[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashSumBy1x2[T]
  @JSName("sumBy")
  var sumBy_Original: LodashSumBy
  @JSName("sumBy")
  def sumBy_T_Double[T](iteratee: java.lang.String): Double
  @JSName("sumBy")
  def sumBy_T_Double[T](iteratee: js.Function1[/* value */ T, Double]): Double
  
  @JSName("sum")
  var sum_Original: LodashSum
  
  def symmetricDifference[T](): js.Array[T]
  def symmetricDifference[T](arrays2: Null, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifference[T](arrays2: Unit, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifference[T](arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifference[T](arrays2: typings.lodash.mod.List[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifference[T](arrays2: __): LodashXor1x2[T]
  def symmetricDifference[T](arrays2: __, arrays: typings.lodash.mod.List[T]): LodashXor1x2[T]
  
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T]): LodashXorBy1x3[T]
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: Null, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: Unit, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: typings.lodash.mod.List[T]): LodashXorBy1x3[T]
  def symmetricDifferenceBy[T](
    iteratee: ValueIteratee[T],
    arrays: typings.lodash.mod.List[T],
    arrays2: typings.lodash.mod.List[T]
  ): js.Array[T]
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: __): LodashXorBy1x5[T]
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x5[T]
  def symmetricDifferenceBy[T](iteratee: __): LodashXorBy1x2[T]
  def symmetricDifferenceBy[T](iteratee: __, arrays: Null, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  def symmetricDifferenceBy[T](iteratee: __, arrays: Unit, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  def symmetricDifferenceBy[T](iteratee: __, arrays: typings.lodash.mod.List[T]): LodashXorBy1x2[T]
  def symmetricDifferenceBy[T](iteratee: __, arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  def symmetricDifferenceBy[T](iteratee: __, arrays: __): LodashXorBy1x4[T]
  def symmetricDifferenceBy[T](iteratee: __, arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x4[T]
  @JSName("symmetricDifferenceBy")
  var symmetricDifferenceBy_Original: LodashXorBy
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_Array[T](iteratee: ValueIteratee[T]): js.Array[T]
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_Array[T](iteratee: ValueIteratee[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_LodashXorBy1x1[T](iteratee: ValueIteratee[T]): LodashXorBy1x1[T]
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_LodashXorBy1x6[T](iteratee: __): LodashXorBy1x6[T]
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_LodashXorBy1x6[T](iteratee: __, arrays: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  
  def symmetricDifferenceWith[T](comparator: Comparator[T]): LodashXorWith1x3[T]
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: Null, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: Unit, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T]): LodashXorWith1x3[T]
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: __): LodashXorWith1x5[T]
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x5[T]
  def symmetricDifferenceWith[T](comparator: __): LodashXorWith1x6[T]
  def symmetricDifferenceWith[T](comparator: __, arrays: Null, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def symmetricDifferenceWith[T](comparator: __, arrays: Unit, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def symmetricDifferenceWith[T](comparator: __, arrays: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def symmetricDifferenceWith[T](comparator: __, arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def symmetricDifferenceWith[T](comparator: __, arrays: __): LodashXorWith1x4[T]
  def symmetricDifferenceWith[T](comparator: __, arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x4[T]
  @JSName("symmetricDifferenceWith")
  var symmetricDifferenceWith_Original: LodashXorWith
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_Array[T](comparator: Comparator[T]): js.Array[T]
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_Array[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x1[T](comparator: Comparator[T]): LodashXorWith1x1[T]
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x2[T](comparator: __): LodashXorWith1x2[T]
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x2[T](comparator: __, arrays: typings.lodash.mod.List[T]): LodashXorWith1x2[T]
  
  @JSName("symmetricDifference")
  var symmetricDifference_Original: LodashXor
  @JSName("symmetricDifference")
  def symmetricDifference_T_LodashXor1x1[T](): LodashXor1x1[T]
  @JSName("symmetricDifference")
  def symmetricDifference_T_LodashXor1x1[T](arrays2: typings.lodash.mod.List[T]): LodashXor1x1[T]
  
  def tail[T](): js.Array[T]
  def tail[T](array: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("tail")
  var tail_Original: LodashTail
  
  def take(n: Double): LodashTake1x1
  def take[T](n: Double, array: typings.lodash.mod.List[T]): js.Array[T]
  def take[T](n: __): LodashTake1x2[T]
  def take[T](n: __, array: typings.lodash.mod.List[T]): LodashTake1x2[T]
  
  def takeLast(n: Double): LodashTakeRight1x1
  def takeLast[T](n: Double, array: typings.lodash.mod.List[T]): js.Array[T]
  def takeLast[T](n: __): LodashTakeRight1x2[T]
  def takeLast[T](n: __, array: typings.lodash.mod.List[T]): LodashTakeRight1x2[T]
  
  def takeLastWhile[T](predicate: ValueIteratee[T]): js.Array[T]
  def takeLastWhile[T](predicate: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def takeLastWhile[T](predicate: __): LodashTakeRightWhile1x2[T]
  def takeLastWhile[T](predicate: __, array: typings.lodash.mod.List[T]): LodashTakeRightWhile1x2[T]
  @JSName("takeLastWhile")
  var takeLastWhile_Original: LodashTakeRightWhile
  @JSName("takeLastWhile")
  def takeLastWhile_T_LodashTakeRightWhile1x1[T](predicate: ValueIteratee[T]): LodashTakeRightWhile1x1[T]
  
  @JSName("takeLast")
  var takeLast_Original: LodashTakeRight
  @JSName("takeLast")
  def takeLast_T_Array[T](n: Double): js.Array[T]
  
  def takeRight(n: Double): LodashTakeRight1x1
  def takeRight[T](n: Double, array: typings.lodash.mod.List[T]): js.Array[T]
  def takeRight[T](n: __): LodashTakeRight1x2[T]
  def takeRight[T](n: __, array: typings.lodash.mod.List[T]): LodashTakeRight1x2[T]
  
  def takeRightWhile[T](predicate: ValueIteratee[T]): js.Array[T]
  def takeRightWhile[T](predicate: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def takeRightWhile[T](predicate: __): LodashTakeRightWhile1x2[T]
  def takeRightWhile[T](predicate: __, array: typings.lodash.mod.List[T]): LodashTakeRightWhile1x2[T]
  @JSName("takeRightWhile")
  var takeRightWhile_Original: LodashTakeRightWhile
  @JSName("takeRightWhile")
  def takeRightWhile_T_LodashTakeRightWhile1x1[T](predicate: ValueIteratee[T]): LodashTakeRightWhile1x1[T]
  
  @JSName("takeRight")
  var takeRight_Original: LodashTakeRight
  @JSName("takeRight")
  def takeRight_T_Array[T](n: Double): js.Array[T]
  
  def takeWhile[T](predicate: ValueIteratee[T]): js.Array[T]
  def takeWhile[T](predicate: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def takeWhile[T](predicate: __): LodashTakeWhile1x2[T]
  def takeWhile[T](predicate: __, array: typings.lodash.mod.List[T]): LodashTakeWhile1x2[T]
  @JSName("takeWhile")
  var takeWhile_Original: LodashTakeWhile
  @JSName("takeWhile")
  def takeWhile_T_LodashTakeWhile1x1[T](predicate: ValueIteratee[T]): LodashTakeWhile1x1[T]
  
  @JSName("take")
  var take_Original: LodashTake
  @JSName("take")
  def take_T_Array[T](n: Double): js.Array[T]
  
  def tap[T](interceptor: js.Function1[/* value */ T, Unit]): LodashTap1x1[T]
  def tap[T](interceptor: js.Function1[/* value */ T, Unit], value: T): T
  def tap[T](interceptor: __, value: T): LodashTap1x2[T]
  @JSName("tap")
  var tap_Original: LodashTap
  
  def template(string: java.lang.String): TemplateExecutor
  @JSName("template")
  var template_Original: LodashTemplate
  
  def throttle(wait: Double): LodashThrottle1x1
  def throttle[T /* <: js.Function1[/* args */ Any, Any] */](wait: Double, func: T): DebouncedFunc[T]
  def throttle[T /* <: js.Function1[/* args */ Any, Any] */](wait: __, func: T): LodashThrottle1x2[T]
  @JSName("throttle")
  var throttle_Original: LodashThrottle
  
  def thru[T](interceptor: __, value: T): LodashThru1x2[T]
  def thru[T, TResult](interceptor: js.Function1[/* value */ T, TResult]): LodashThru1x1[T, TResult]
  def thru[T, TResult](interceptor: js.Function1[/* value */ T, TResult], value: T): TResult
  @JSName("thru")
  var thru_Original: LodashThru
  
  def times(iteratee: __, n: Double): LodashTimes1x2
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult]): LodashTimes1x1[TResult]
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult], n: Double): js.Array[TResult]
  @JSName("times")
  var times_Original: LodashTimes
  
  def toArray(): js.Array[Any]
  def toArray[T](value: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def toArray[T](value: Dictionary[T]): js.Array[T]
  def toArray[T](value: NumericDictionary[T]): js.Array[T]
  @JSName("toArray")
  var toArray_Original: LodashToArray
  @JSName("toArray")
  def toArray_T[T](): js.Array[T]
  
  def toFinite(value: Any): Double
  @JSName("toFinite")
  var toFinite_Original: LodashToFinite
  
  def toInteger(value: Any): Double
  @JSName("toInteger")
  var toInteger_Original: LodashToInteger
  
  def toLength(value: Any): Double
  @JSName("toLength")
  var toLength_Original: LodashToLength
  
  def toLower(string: java.lang.String): java.lang.String
  @JSName("toLower")
  var toLower_Original: LodashToLower
  
  def toNumber(value: Any): Double
  @JSName("toNumber")
  var toNumber_Original: LodashToNumber
  
  def toPairs(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, Any]]
  def toPairs[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  def toPairs[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  
  def toPairsIn(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, Any]]
  def toPairsIn[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  def toPairsIn[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]]
  @JSName("toPairsIn")
  var toPairsIn_Original: LodashToPairsIn
  
  @JSName("toPairs")
  var toPairs_Original: LodashToPairs
  
  def toPath(value: Any): js.Array[java.lang.String]
  @JSName("toPath")
  var toPath_Original: LodashToPath
  
  def toPlainObject(value: Any): Any
  @JSName("toPlainObject")
  var toPlainObject_Original: LodashToPlainObject
  
  def toSafeInteger(value: Any): Double
  @JSName("toSafeInteger")
  var toSafeInteger_Original: LodashToSafeInteger
  
  def toString(value: Any): java.lang.String
  @JSName("toString")
  var toString_Original: LodashToString
  
  def toUpper(string: java.lang.String): java.lang.String
  @JSName("toUpper")
  var toUpper_Original: LodashToUpper
  
  def transform[TResult](iteratee: __, accumulator: TResult): LodashTransform1x2[TResult]
  def transform[T](iteratee: __, accumulator: __, `object`: js.Array[T]): LodashTransform1x4[T]
  def transform[T](iteratee: __, accumulator: __, `object`: Dictionary[T]): LodashTransform2x4[T]
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult]): LodashTransform1x1[T, TResult]
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult): LodashTransform1x3[T, TResult]
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: js.Array[T]): TResult
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: Dictionary[T]): TResult
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult]
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: Dictionary[T]): LodashTransform2x5[TResult]
  def transform[T, TResult](iteratee: __, accumulator: TResult, `object`: js.Array[T]): LodashTransform1x6[T, TResult]
  def transform[T, TResult](iteratee: __, accumulator: TResult, `object`: Dictionary[T]): LodashTransform2x6[T, TResult]
  @JSName("transform")
  var transform_Original: LodashTransform
  
  def trim(string: java.lang.String): java.lang.String
  
  def trimChars(chars: java.lang.String): LodashTrimChars1x1
  def trimChars(chars: java.lang.String, string: java.lang.String): java.lang.String
  def trimChars(chars: __, string: java.lang.String): LodashTrimChars1x2
  
  def trimCharsEnd(chars: java.lang.String): LodashTrimCharsEnd1x1
  def trimCharsEnd(chars: java.lang.String, string: java.lang.String): java.lang.String
  def trimCharsEnd(chars: __, string: java.lang.String): LodashTrimCharsEnd1x2
  @JSName("trimCharsEnd")
  var trimCharsEnd_Original: LodashTrimCharsEnd
  
  def trimCharsStart(chars: java.lang.String): LodashTrimCharsStart1x1
  def trimCharsStart(chars: java.lang.String, string: java.lang.String): java.lang.String
  def trimCharsStart(chars: __, string: java.lang.String): LodashTrimCharsStart1x2
  @JSName("trimCharsStart")
  var trimCharsStart_Original: LodashTrimCharsStart
  
  @JSName("trimChars")
  var trimChars_Original: LodashTrimChars
  
  def trimEnd(string: java.lang.String): java.lang.String
  @JSName("trimEnd")
  var trimEnd_Original: LodashTrimEnd
  
  def trimStart(string: java.lang.String): java.lang.String
  @JSName("trimStart")
  var trimStart_Original: LodashTrimStart
  
  @JSName("trim")
  var trim_Original: LodashTrim
  
  def truncate(options: TruncateOptions): LodashTruncate1x1
  def truncate(options: TruncateOptions, string: java.lang.String): java.lang.String
  def truncate(options: __, string: java.lang.String): LodashTruncate1x2
  @JSName("truncate")
  var truncate_Original: LodashTruncate
  
  def unapply(func: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any]
  @JSName("unapply")
  var unapply_Original: LodashUnapply
  
  def unary[T, TResult](func: js.Function2[/* arg1 */ T, /* repeated */ Any, TResult]): js.Function1[/* arg1 */ T, TResult]
  @JSName("unary")
  var unary_Original: LodashUnary
  
  def unescape(string: java.lang.String): java.lang.String
  @JSName("unescape")
  var unescape_Original: LodashUnescape
  
  def union[T](): LodashUnion1x1[T]
  def union[T](arrays2: Null, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def union[T](arrays2: Unit, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def union[T](arrays2: typings.lodash.mod.List[T]): LodashUnion1x1[T]
  def union[T](arrays2: typings.lodash.mod.List[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  def union[T](arrays2: __): LodashUnion1x2[T]
  def union[T](arrays2: __, arrays: typings.lodash.mod.List[T]): LodashUnion1x2[T]
  
  def unionBy[T](iteratee: ValueIteratee[T]): js.Array[T]
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: Null, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: Unit, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: typings.lodash.mod.List[T]): js.Array[T]
  def unionBy[T](
    iteratee: ValueIteratee[T],
    arrays1: typings.lodash.mod.List[T],
    arrays2: typings.lodash.mod.List[T]
  ): js.Array[T]
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: __): LodashUnionBy1x5[T]
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: __, arrays2: typings.lodash.mod.List[T]): LodashUnionBy1x5[T]
  def unionBy[T](iteratee: __): LodashUnionBy1x6[T]
  def unionBy[T](iteratee: __, arrays1: Null, arrays2: typings.lodash.mod.List[T]): LodashUnionBy1x6[T]
  def unionBy[T](iteratee: __, arrays1: Unit, arrays2: typings.lodash.mod.List[T]): LodashUnionBy1x6[T]
  def unionBy[T](iteratee: __, arrays1: typings.lodash.mod.List[T]): LodashUnionBy1x6[T]
  def unionBy[T](iteratee: __, arrays1: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): LodashUnionBy1x6[T]
  def unionBy[T](iteratee: __, arrays1: __): LodashUnionBy1x4[T]
  def unionBy[T](iteratee: __, arrays1: __, arrays2: typings.lodash.mod.List[T]): LodashUnionBy1x4[T]
  @JSName("unionBy")
  var unionBy_Original: LodashUnionBy
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x1[T](iteratee: ValueIteratee[T]): LodashUnionBy1x1[T]
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x2[T](iteratee: __): LodashUnionBy1x2[T]
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x2[T](iteratee: __, arrays1: typings.lodash.mod.List[T]): LodashUnionBy1x2[T]
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x3[T](iteratee: ValueIteratee[T]): LodashUnionBy1x3[T]
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x3[T](iteratee: ValueIteratee[T], arrays1: typings.lodash.mod.List[T]): LodashUnionBy1x3[T]
  
  def unionWith[T](comparator: Comparator[T]): js.Array[T]
  def unionWith[T](comparator: Comparator[T], arrays: Null, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def unionWith[T](comparator: Comparator[T], arrays: Unit, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def unionWith[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  def unionWith[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def unionWith[T](comparator: Comparator[T], arrays: __): LodashUnionWith1x5[T]
  def unionWith[T](comparator: Comparator[T], arrays: __, arrays2: typings.lodash.mod.List[T]): LodashUnionWith1x5[T]
  def unionWith[T](comparator: __): LodashUnionWith1x6[T]
  def unionWith[T](comparator: __, arrays: Null, arrays2: typings.lodash.mod.List[T]): LodashUnionWith1x6[T]
  def unionWith[T](comparator: __, arrays: Unit, arrays2: typings.lodash.mod.List[T]): LodashUnionWith1x6[T]
  def unionWith[T](comparator: __, arrays: typings.lodash.mod.List[T]): LodashUnionWith1x6[T]
  def unionWith[T](comparator: __, arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): LodashUnionWith1x6[T]
  def unionWith[T](comparator: __, arrays: __): LodashUnionWith1x4[T]
  def unionWith[T](comparator: __, arrays: __, arrays2: typings.lodash.mod.List[T]): LodashUnionWith1x4[T]
  @JSName("unionWith")
  var unionWith_Original: LodashUnionWith
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x1[T](comparator: Comparator[T]): LodashUnionWith1x1[T]
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x2[T](comparator: __): LodashUnionWith1x2[T]
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x2[T](comparator: __, arrays: typings.lodash.mod.List[T]): LodashUnionWith1x2[T]
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x3[T](comparator: Comparator[T]): LodashUnionWith1x3[T]
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x3[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T]): LodashUnionWith1x3[T]
  
  @JSName("union")
  var union_Original: LodashUnion
  @JSName("union")
  def union_T_Array[T](): js.Array[T]
  @JSName("union")
  def union_T_Array[T](arrays2: typings.lodash.mod.List[T]): js.Array[T]
  
  def uniq[T](): js.Array[T]
  def uniq[T](array: typings.lodash.mod.List[T]): js.Array[T]
  
  def uniqBy[T](iteratee: ValueIteratee[T]): js.Array[T]
  def uniqBy[T](iteratee: ValueIteratee[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def uniqBy[T](iteratee: __): LodashUniqBy1x2[T]
  def uniqBy[T](iteratee: __, array: typings.lodash.mod.List[T]): LodashUniqBy1x2[T]
  @JSName("uniqBy")
  var uniqBy_Original: LodashUniqBy
  @JSName("uniqBy")
  def uniqBy_T_LodashUniqBy1x1[T](iteratee: ValueIteratee[T]): LodashUniqBy1x1[T]
  
  def uniqWith[T](comparator: Comparator[T]): js.Array[T]
  def uniqWith[T](comparator: Comparator[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def uniqWith[T](comparator: __): LodashUniqWith1x2[T]
  def uniqWith[T](comparator: __, array: typings.lodash.mod.List[T]): LodashUniqWith1x2[T]
  @JSName("uniqWith")
  var uniqWith_Original: LodashUniqWith
  @JSName("uniqWith")
  def uniqWith_T_LodashUniqWith1x1[T](comparator: Comparator[T]): LodashUniqWith1x1[T]
  
  @JSName("uniq")
  var uniq_Original: LodashUniq
  
  def uniqueId(prefix: java.lang.String): java.lang.String
  @JSName("uniqueId")
  var uniqueId_Original: LodashUniqueId
  
  def unnest[T](): js.Array[T]
  def unnest[T](array: typings.lodash.mod.List[Many[T]]): js.Array[T]
  @JSName("unnest")
  var unnest_Original: LodashFlatten
  
  def unset(path: PropertyPath): LodashUnset1x1
  def unset[T](path: PropertyPath, `object`: T): T
  def unset[T](path: __, `object`: T): LodashUnset1x2[T]
  @JSName("unset")
  var unset_Original: LodashUnset
  
  def unzip[T](): js.Array[js.Array[T]]
  def unzip[T](array: js.Array[js.Array[T]]): js.Array[js.Array[T]]
  def unzip[T](array: typings.lodash.mod.List[typings.lodash.mod.List[T]]): js.Array[js.Array[T]]
  
  def unzipWith[T](iteratee: __): LodashUnzipWith1x2[T]
  def unzipWith[T](iteratee: __, array: typings.lodash.mod.List[typings.lodash.mod.List[T]]): LodashUnzipWith1x2[T]
  def unzipWith[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): LodashUnzipWith1x1[T, TResult]
  def unzipWith[T, TResult](
    iteratee: js.Function1[/* repeated */ T, TResult],
    array: typings.lodash.mod.List[typings.lodash.mod.List[T]]
  ): js.Array[TResult]
  @JSName("unzipWith")
  var unzipWith_Original: LodashUnzipWith
  @JSName("unzipWith")
  def unzipWith_TTResult_Array[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult]
  
  @JSName("unzip")
  var unzip_Original: LodashUnzip
  
  def update(path: PropertyPath): LodashUpdate1x1
  def update(path: PropertyPath, updater: js.Function1[/* value */ Any, Any]): LodashUpdate1x3
  def update(path: PropertyPath, updater: js.Function1[/* value */ Any, Any], `object`: js.Object): Any
  def update(path: PropertyPath, updater: __, `object`: js.Object): LodashUpdate1x5
  def update(path: __, updater: js.Function1[/* value */ Any, Any]): LodashUpdate1x2
  def update(path: __, updater: js.Function1[/* value */ Any, Any], `object`: js.Object): LodashUpdate1x6
  def update(path: __, updater: __, `object`: js.Object): LodashUpdate1x4
  
  def updateWith(customizer: __, path: PropertyPath): LodashUpdateWith1x2
  def updateWith(customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ Any, Any]): LodashUpdateWith1x6
  def updateWith(customizer: __, path: __, updater: js.Function1[/* oldValue */ Any, Any]): LodashUpdateWith1x4
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashUpdateWith1x1[T]
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath): LodashUpdateWith1x3[T]
  def updateWith[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ Any, Any]
  ): LodashUpdateWith1x7[T]
  def updateWith[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ Any, Any],
    `object`: T
  ): T
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, updater: __, `object`: T): LodashUpdateWith1x11[T]
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, updater: js.Function1[/* oldValue */ Any, Any]): LodashUpdateWith1x5[T]
  def updateWith[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: __,
    updater: js.Function1[/* oldValue */ Any, Any],
    `object`: T
  ): LodashUpdateWith1x13[T]
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, updater: __, `object`: T): LodashUpdateWith1x9[T]
  def updateWith[T /* <: js.Object */](customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ Any, Any], `object`: T): LodashUpdateWith1x14[T]
  def updateWith[T /* <: js.Object */](customizer: __, path: PropertyPath, updater: __, `object`: T): LodashUpdateWith1x10[T]
  def updateWith[T /* <: js.Object */](customizer: __, path: __, updater: js.Function1[/* oldValue */ Any, Any], `object`: T): LodashUpdateWith1x12[T]
  def updateWith[T /* <: js.Object */](customizer: __, path: __, updater: __, `object`: T): LodashUpdateWith1x8[T]
  @JSName("updateWith")
  var updateWith_Original: LodashUpdateWith
  
  @JSName("update")
  var update_Original: LodashUpdate
  
  def upperCase(string: java.lang.String): java.lang.String
  @JSName("upperCase")
  var upperCase_Original: LodashUpperCase
  
  def upperFirst(string: java.lang.String): java.lang.String
  @JSName("upperFirst")
  var upperFirst_Original: LodashUpperFirst
  
  def useWith(func: js.Function1[/* repeated */ Any, Any]): LodashOverArgs1x1
  def useWith(
    func: js.Function1[/* repeated */ Any, Any],
    transforms: Many[js.Function1[/* repeated */ Any, Any]]
  ): js.Function1[/* repeated */ Any, Any]
  def useWith(func: __, transforms: Many[js.Function1[/* repeated */ Any, Any]]): LodashOverArgs1x2
  @JSName("useWith")
  var useWith_Original: LodashOverArgs
  
  def values(`object`: Any): js.Array[Any]
  def values[T](): js.Array[T]
  def values[T](`object`: Dictionary[T]): js.Array[T]
  def values[T](`object`: typings.lodash.mod.List[T]): js.Array[T]
  def values[T](`object`: NumericDictionary[T]): js.Array[T]
  
  def valuesIn[T](): js.Array[T]
  def valuesIn[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  def valuesIn[T](`object`: Dictionary[T]): js.Array[T]
  def valuesIn[T](`object`: typings.lodash.mod.List[T]): js.Array[T]
  def valuesIn[T](`object`: NumericDictionary[T]): js.Array[T]
  @JSName("valuesIn")
  var valuesIn_Original: LodashValuesIn
  
  @JSName("values")
  var values_Original: LodashValues
  @JSName("values")
  def values_T[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
  
  def where[T](source: ConformsPredicateObject[T]): LodashConformsTo1x1[T]
  def where[T](source: ConformsPredicateObject[T], `object`: T): Boolean
  def where[T](source: __, `object`: T): LodashConformsTo1x2[T]
  
  def whereEq(source: js.Object): LodashIsMatch1x1
  def whereEq(source: js.Object, `object`: js.Object): Boolean
  def whereEq(source: __, `object`: js.Object): LodashIsMatch1x2
  @JSName("whereEq")
  var whereEq_Original: LodashIsMatch
  
  @JSName("where")
  var where_Original: LodashConformsTo
  
  def without[T](values: js.Array[T]): js.Array[T]
  def without[T](values: js.Array[T], array: typings.lodash.mod.List[T]): js.Array[T]
  def without[T](values: __): LodashWithout1x2[T]
  def without[T](values: __, array: typings.lodash.mod.List[T]): LodashWithout1x2[T]
  @JSName("without")
  var without_Original: LodashWithout
  @JSName("without")
  def without_T_LodashWithout1x1[T](values: js.Array[T]): LodashWithout1x1[T]
  
  def words(string: java.lang.String): js.Array[java.lang.String]
  @JSName("words")
  var words_Original: LodashWords
  
  def wrap[T](wrapper: __, value: T): LodashWrap1x2[T]
  def wrap[T, TArgs, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ TArgs, TResult]): LodashWrap1x1[T, TArgs, TResult]
  def wrap[T, TArgs, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ TArgs, TResult], value: T): js.Function1[/* repeated */ TArgs, TResult]
  @JSName("wrap")
  var wrap_Original: LodashWrap
  
  def xor[T](): js.Array[T]
  def xor[T](arrays2: Null, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def xor[T](arrays2: Unit, arrays: typings.lodash.mod.List[T]): js.Array[T]
  def xor[T](arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def xor[T](arrays2: typings.lodash.mod.List[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  def xor[T](arrays2: __): LodashXor1x2[T]
  def xor[T](arrays2: __, arrays: typings.lodash.mod.List[T]): LodashXor1x2[T]
  
  def xorBy[T](iteratee: ValueIteratee[T]): LodashXorBy1x3[T]
  def xorBy[T](iteratee: ValueIteratee[T], arrays: Null, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def xorBy[T](iteratee: ValueIteratee[T], arrays: Unit, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def xorBy[T](iteratee: ValueIteratee[T], arrays: typings.lodash.mod.List[T]): LodashXorBy1x3[T]
  def xorBy[T](
    iteratee: ValueIteratee[T],
    arrays: typings.lodash.mod.List[T],
    arrays2: typings.lodash.mod.List[T]
  ): js.Array[T]
  def xorBy[T](iteratee: ValueIteratee[T], arrays: __): LodashXorBy1x5[T]
  def xorBy[T](iteratee: ValueIteratee[T], arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x5[T]
  def xorBy[T](iteratee: __): LodashXorBy1x2[T]
  def xorBy[T](iteratee: __, arrays: Null, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  def xorBy[T](iteratee: __, arrays: Unit, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  def xorBy[T](iteratee: __, arrays: typings.lodash.mod.List[T]): LodashXorBy1x2[T]
  def xorBy[T](iteratee: __, arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  def xorBy[T](iteratee: __, arrays: __): LodashXorBy1x4[T]
  def xorBy[T](iteratee: __, arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorBy1x4[T]
  @JSName("xorBy")
  var xorBy_Original: LodashXorBy
  @JSName("xorBy")
  def xorBy_T_Array[T](iteratee: ValueIteratee[T]): js.Array[T]
  @JSName("xorBy")
  def xorBy_T_Array[T](iteratee: ValueIteratee[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("xorBy")
  def xorBy_T_LodashXorBy1x1[T](iteratee: ValueIteratee[T]): LodashXorBy1x1[T]
  @JSName("xorBy")
  def xorBy_T_LodashXorBy1x6[T](iteratee: __): LodashXorBy1x6[T]
  @JSName("xorBy")
  def xorBy_T_LodashXorBy1x6[T](iteratee: __, arrays: typings.lodash.mod.List[T]): LodashXorBy1x6[T]
  
  def xorWith[T](comparator: Comparator[T]): LodashXorWith1x3[T]
  def xorWith[T](comparator: Comparator[T], arrays: Null, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def xorWith[T](comparator: Comparator[T], arrays: Unit, arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def xorWith[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T]): LodashXorWith1x3[T]
  def xorWith[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): js.Array[T]
  def xorWith[T](comparator: Comparator[T], arrays: __): LodashXorWith1x5[T]
  def xorWith[T](comparator: Comparator[T], arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x5[T]
  def xorWith[T](comparator: __): LodashXorWith1x6[T]
  def xorWith[T](comparator: __, arrays: Null, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def xorWith[T](comparator: __, arrays: Unit, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def xorWith[T](comparator: __, arrays: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def xorWith[T](comparator: __, arrays: typings.lodash.mod.List[T], arrays2: typings.lodash.mod.List[T]): LodashXorWith1x6[T]
  def xorWith[T](comparator: __, arrays: __): LodashXorWith1x4[T]
  def xorWith[T](comparator: __, arrays: __, arrays2: typings.lodash.mod.List[T]): LodashXorWith1x4[T]
  @JSName("xorWith")
  var xorWith_Original: LodashXorWith
  @JSName("xorWith")
  def xorWith_T_Array[T](comparator: Comparator[T]): js.Array[T]
  @JSName("xorWith")
  def xorWith_T_Array[T](comparator: Comparator[T], arrays: typings.lodash.mod.List[T]): js.Array[T]
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x1[T](comparator: Comparator[T]): LodashXorWith1x1[T]
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x2[T](comparator: __): LodashXorWith1x2[T]
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x2[T](comparator: __, arrays: typings.lodash.mod.List[T]): LodashXorWith1x2[T]
  
  @JSName("xor")
  var xor_Original: LodashXor
  @JSName("xor")
  def xor_T_LodashXor1x1[T](): LodashXor1x1[T]
  @JSName("xor")
  def xor_T_LodashXor1x1[T](arrays2: typings.lodash.mod.List[T]): LodashXor1x1[T]
  
  def zip[T1](arrays1: typings.lodash.mod.List[T1]): LodashZip1x1[T1]
  def zip[T2](arrays1: __, arrays2: typings.lodash.mod.List[T2]): LodashZip1x2[T2]
  def zip[T1, T2](arrays1: typings.lodash.mod.List[T1], arrays2: typings.lodash.mod.List[T2]): js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]
  
  def zipAll[T](arrays: js.Array[js.UndefOr[typings.lodash.mod.List[T] | Null]]): js.Array[js.Array[js.UndefOr[T]]]
  def zipAll[T1, T2](arrays1: js.Tuple2[typings.lodash.mod.List[T1], typings.lodash.mod.List[T2]]): js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]
  def zipAll[T1, T2, T3](
    arrays1: js.Tuple3[
      typings.lodash.mod.List[T1], 
      typings.lodash.mod.List[T2], 
      typings.lodash.mod.List[T3]
    ]
  ): js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]]
  def zipAll[T1, T2, T3, T4](
    arrays1: js.Tuple4[
      typings.lodash.mod.List[T1], 
      typings.lodash.mod.List[T2], 
      typings.lodash.mod.List[T3], 
      typings.lodash.mod.List[T4]
    ]
  ): js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]]
  def zipAll[T1, T2, T3, T4, T5](
    arrays1: js.Tuple5[
      typings.lodash.mod.List[T1], 
      typings.lodash.mod.List[T2], 
      typings.lodash.mod.List[T3], 
      typings.lodash.mod.List[T4], 
      typings.lodash.mod.List[T5]
    ]
  ): js.Array[
    js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
  ]
  @JSName("zipAll")
  var zipAll_Original: LodashZipAll
  
  def zipObj(props: typings.lodash.mod.List[PropertyName]): LodashZipObject1x1
  def zipObj[T](props: typings.lodash.mod.List[PropertyName], values: typings.lodash.mod.List[T]): Dictionary[T]
  def zipObj[T](props: __, values: typings.lodash.mod.List[T]): LodashZipObject1x2[T]
  @JSName("zipObj")
  var zipObj_Original: LodashZipObject
  
  def zipObject(props: typings.lodash.mod.List[PropertyName]): LodashZipObject1x1
  def zipObject[T](props: typings.lodash.mod.List[PropertyName], values: typings.lodash.mod.List[T]): Dictionary[T]
  def zipObject[T](props: __, values: typings.lodash.mod.List[T]): LodashZipObject1x2[T]
  
  def zipObjectDeep(paths: typings.lodash.mod.List[PropertyPath]): LodashZipObjectDeep1x1
  def zipObjectDeep(paths: typings.lodash.mod.List[PropertyPath], values: typings.lodash.mod.List[Any]): js.Object
  def zipObjectDeep(paths: __, values: typings.lodash.mod.List[Any]): LodashZipObjectDeep1x2
  @JSName("zipObjectDeep")
  var zipObjectDeep_Original: LodashZipObjectDeep
  
  @JSName("zipObject")
  var zipObject_Original: LodashZipObject
  
  def zipWith[T1](iteratee: __, arrays1: typings.lodash.mod.List[T1]): LodashZipWith1x2[T1]
  def zipWith[T2](iteratee: __, arrays1: __, arrays2: typings.lodash.mod.List[T2]): LodashZipWith1x4[T2]
  def zipWith[T1, T2](iteratee: __, arrays1: typings.lodash.mod.List[T1], arrays2: typings.lodash.mod.List[T2]): LodashZipWith1x6[T1, T2]
  def zipWith[T1, T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]): LodashZipWith1x1[T1, T2, TResult]
  def zipWith[T1, T2, TResult](
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult],
    arrays1: typings.lodash.mod.List[T1]
  ): LodashZipWith1x3[T2, TResult]
  def zipWith[T1, T2, TResult](
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult],
    arrays1: typings.lodash.mod.List[T1],
    arrays2: typings.lodash.mod.List[T2]
  ): js.Array[TResult]
  def zipWith[T1, T2, TResult](
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult],
    arrays1: __,
    arrays2: typings.lodash.mod.List[T2]
  ): LodashZipWith1x5[T1, TResult]
  @JSName("zipWith")
  var zipWith_Original: LodashZipWith
  
  @JSName("zip")
  var zip_Original: LodashZip
}
object LoDashFp {
  
  inline def apply(
    F: () => `false`,
    T: () => `true`,
    __ : __,
    add: LodashAdd,
    after: LodashAfter,
    all: LodashEvery,
    allPass: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean],
    always: /* value */ Any => js.Function0[Any],
    any: LodashSome,
    anyPass: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean],
    apply: /* func */ js.Function1[/* repeated */ Any, Any] => js.Function1[/* repeated */ Any, Any],
    ary: LodashAry,
    assign: LodashAssign,
    assignAll: LodashAssignAll,
    assignAllWith: LodashAssignAllWith,
    assignIn: LodashAssignIn,
    assignInAll: LodashAssignInAll,
    assignInAllWith: LodashAssignInAllWith,
    assignInWith: LodashAssignInWith,
    assignWith: LodashAssignWith,
    assoc: LodashSet,
    assocPath: LodashSet,
    at: LodashAt,
    attempt: /* func */ js.Function1[/* repeated */ Any, Any] => Any | js.Error,
    before: LodashBefore,
    bind: LodashBind,
    bindAll: LodashBindAll,
    bindKey: LodashBindKey,
    camelCase: /* string */ java.lang.String => java.lang.String,
    capitalize: /* string */ java.lang.String => java.lang.String,
    castArray: /* value */ Many[Any] => js.Array[Any],
    ceil: /* n */ Double => Double,
    chunk: LodashChunk,
    clamp: LodashClamp,
    cloneDeep: /* value */ Any => Any,
    cloneDeepWith: LodashCloneDeepWith,
    cloneWith: LodashCloneWith,
    clone_ : /* value */ Any => Any,
    compact: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Exclude[Any, js.UndefOr[Null | `false` | _empty | `0`]]],
    complement: /* predicate */ js.Function1[/* args */ js.Array[Any], Any] => js.Function1[/* args */ js.Array[Any], Boolean],
    compose: LodashFlowRight,
    concat: LodashConcat,
    cond: LodashCond,
    conforms: LodashConformsTo,
    conformsTo: LodashConformsTo,
    constant: /* value */ Any => js.Function0[Any],
    contains: LodashContains,
    countBy: LodashCountBy,
    create: /* prototype */ js.Object => js.Object,
    curry: LodashCurry,
    curryN: LodashCurryN,
    curryRight: LodashCurryRight,
    curryRightN: LodashCurryRightN,
    debounce: LodashDebounce,
    deburr: /* string */ java.lang.String => java.lang.String,
    defaultTo: LodashDefaultTo,
    defaults: LodashDefaults,
    defaultsAll: LodashDefaultsAll,
    defaultsDeep: LodashDefaultsDeep,
    defaultsDeepAll: /* object */ js.Array[Any] => Any,
    defer: LodashDefer,
    delay: LodashDelay,
    difference: LodashDifference,
    differenceBy: LodashDifferenceBy,
    differenceWith: LodashDifferenceWith,
    dissoc: LodashUnset,
    dissocPath: LodashUnset,
    divide: LodashDivide,
    drop: LodashDrop,
    dropLast: LodashDropRight,
    dropLastWhile: LodashDropRightWhile,
    dropRight: LodashDropRight,
    dropRightWhile: LodashDropRightWhile,
    dropWhile: LodashDropWhile,
    each: LodashForEach,
    eachRight: LodashForEachRight,
    endsWith: LodashEndsWith,
    entries: LodashToPairs,
    entriesIn: LodashToPairsIn,
    eq_ : LodashEq,
    equals_ : LodashIsEqual,
    escape: /* string */ java.lang.String => java.lang.String,
    escapeRegExp: /* string */ java.lang.String => java.lang.String,
    every: LodashEvery,
    extend: LodashExtend,
    extendAll: LodashExtendAll,
    extendAllWith: LodashExtendAllWith,
    extendWith: LodashExtendWith,
    fill: LodashFill,
    filter: LodashFilter,
    find: LodashFind,
    findFrom: LodashFindFrom,
    findIndex: LodashFindIndex,
    findIndexFrom: LodashFindIndexFrom,
    findKey: LodashFindKey,
    findLast: LodashFindLast,
    findLastFrom: LodashFindLastFrom,
    findLastIndex: LodashFindLastIndex,
    findLastIndexFrom: LodashFindLastIndexFrom,
    findLastKey: LodashFindLastKey,
    first: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any],
    flatMap: LodashFlatMap,
    flatMapDeep: LodashFlatMapDeep,
    flatMapDepth: LodashFlatMapDepth,
    flatten: /* array */ js.UndefOr[typings.lodash.mod.List[Many[Any]] | Null] => js.Array[Any],
    flattenDeep: LodashFlattenDeep,
    flattenDepth: LodashFlattenDepth,
    flip: /* func */ js.Function1[/* args */ Any, Any] => js.Function1[/* args */ Any, Any],
    floor: /* n */ Double => Double,
    flow: LodashFlow,
    flowRight: LodashFlowRight,
    forEach: LodashForEach,
    forEachRight: LodashForEachRight,
    forIn: LodashForIn,
    forInRight: LodashForInRight,
    forOwn: LodashForOwn,
    forOwnRight: LodashForOwnRight,
    fromPairs: LodashFromPairs,
    functions: /* object */ Any => js.Array[java.lang.String],
    functionsIn: /* object */ Any => js.Array[java.lang.String],
    get: LodashGet,
    getOr: LodashGetOr,
    groupBy: LodashGroupBy,
    gt: LodashGt,
    gte: LodashGte,
    has: LodashHas,
    hasIn: LodashHasIn,
    head: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any],
    identical: LodashEq,
    identity: LodashIdentity,
    inRange: LodashInRange,
    includes: LodashIncludes,
    includesFrom: LodashIncludesFrom,
    indexBy: LodashKeyBy,
    indexOf: LodashIndexOf,
    indexOfFrom: LodashIndexOfFrom,
    init: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Any],
    initial: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Any],
    intersection: LodashIntersection,
    intersectionBy: LodashIntersectionBy,
    intersectionWith: LodashIntersectionWith,
    invert: /* object */ js.Object => Dictionary[java.lang.String],
    invertBy: LodashInvertBy,
    invertObj: /* object */ js.Object => Dictionary[java.lang.String],
    invoke: LodashInvoke,
    invokeArgs: LodashInvokeArgs,
    invokeArgsMap: LodashInvokeArgsMap,
    invokeMap: LodashInvokeMap,
    isArguments: /* value */ Any => /* is std.IArguments */ Boolean,
    isArray: /* value */ Any => /* is std.Array<any> */ Boolean,
    isArrayBuffer: /* value */ Any => /* is std.ArrayBuffer */ Boolean,
    isArrayLike: LodashIsArrayLike,
    isArrayLikeObject: LodashIsArrayLikeObject,
    isBoolean: /* value */ Any => /* is boolean */ Boolean,
    isBuffer: /* value */ Any => Boolean,
    isDate: /* value */ Any => /* is std.Date */ Boolean,
    isElement: /* value */ Any => Boolean,
    isEmpty: LodashIsEmpty,
    isEqual: LodashIsEqual,
    isEqualWith: LodashIsEqualWith,
    isError: /* value */ Any => /* is std.Error */ Boolean,
    isFinite: /* value */ Any => Boolean,
    isFunction: /* value */ Any => Boolean,
    isInteger: /* value */ Any => Boolean,
    isLength: /* value */ Any => Boolean,
    isMap: /* value */ Any => /* is std.Map<any, any> */ Boolean,
    isMatch: LodashIsMatch,
    isMatchWith: LodashIsMatchWith,
    isNaN: /* value */ Any => Boolean,
    isNative: /* value */ Any => Boolean,
    isNil: /* value */ Any => Boolean,
    isNull: /* value */ Any => /* is null */ Boolean,
    isNumber: /* value */ Any => /* is number */ Boolean,
    isObject: /* value */ Any => /* is object */ Boolean,
    isObjectLike: /* value */ Any => Boolean,
    isPlainObject: /* value */ Any => Boolean,
    isRegExp: /* value */ Any => /* is std.RegExp */ Boolean,
    isSafeInteger: /* value */ Any => Boolean,
    isSet: /* value */ Any => /* is std.Set<any> */ Boolean,
    isString: /* value */ Any => /* is string */ Boolean,
    isSymbol: /* value */ Any => /* is symbol */ Boolean,
    isTypedArray: /* value */ Any => Boolean,
    isUndefined: /* value */ Any => /* is undefined */ Boolean,
    isWeakMap: /* value */ Any => /* is std.WeakMap<object, any> */ Boolean,
    isWeakSet: /* value */ Any => /* is std.WeakSet<object> */ Boolean,
    iteratee: LodashIteratee,
    join: LodashJoin,
    juxt: /* iteratees */ Many[js.Function1[/* repeated */ Any, Any]] => js.Function1[/* repeated */ Any, js.Array[Any]],
    kebabCase: /* string */ java.lang.String => java.lang.String,
    keyBy: LodashKeyBy,
    keys: /* object */ Any => js.Array[java.lang.String],
    keysIn: /* object */ Any => js.Array[java.lang.String],
    last: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any],
    lastIndexOf: LodashLastIndexOf,
    lastIndexOfFrom: LodashLastIndexOfFrom,
    lowerCase: /* string */ java.lang.String => java.lang.String,
    lowerFirst: /* string */ java.lang.String => java.lang.String,
    lt: LodashLt,
    lte: LodashLte,
    map: LodashMap,
    mapKeys: LodashMapKeys,
    mapValues: LodashMapValues,
    matches: LodashIsMatch,
    matchesProperty: LodashMatchesProperty,
    max: /* collection */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any],
    maxBy: LodashMaxBy,
    mean: /* collection */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => Double,
    meanBy: LodashMeanBy,
    memoize: /* func */ js.Function1[/* args */ Any, Any] => (js.Function1[/* args */ Any, Any]) & MemoizedFunction,
    merge: LodashMerge,
    mergeAll: LodashMergeAll,
    mergeAllWith: LodashMergeAllWith,
    mergeWith: LodashMergeWith,
    method: /* path */ PropertyPath => js.Function1[/* object */ Any, Any],
    methodOf: /* object */ js.Object => js.Function1[/* path */ PropertyPath, Any],
    min: /* collection */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any],
    minBy: LodashMinBy,
    multiply: LodashMultiply,
    nAry: LodashAry,
    negate: /* predicate */ js.Function1[/* args */ js.Array[Any], Any] => js.Function1[/* args */ js.Array[Any], Boolean],
    noConflict: () => Typeoflodash,
    noop: LodashNoop,
    now: () => Double,
    nth: LodashNth,
    nthArg: /* n */ Double => js.Function1[/* repeated */ Any, Any],
    omit: LodashOmit,
    omitAll: LodashOmit,
    omitBy: LodashOmitBy,
    once: /* func */ js.Function1[/* args */ Any, Any] => js.Function1[/* args */ Any, Any],
    orderBy: LodashOrderBy,
    over: /* iteratees */ Many[js.Function1[/* repeated */ Any, Any]] => js.Function1[/* repeated */ Any, js.Array[Any]],
    overArgs: LodashOverArgs,
    overEvery: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean],
    overSome: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean],
    pad: LodashPad,
    padChars: LodashPadChars,
    padCharsEnd: LodashPadCharsEnd,
    padCharsStart: LodashPadCharsStart,
    padEnd: LodashPadEnd,
    padStart: LodashPadStart,
    parseInt: LodashParseInt,
    partial: LodashPartial,
    partialRight: LodashPartialRight,
    partition: LodashPartition,
    path: LodashPath,
    pathEq: LodashMatchesProperty,
    pathOr: LodashPathOr,
    paths: LodashAt,
    pick: LodashPick,
    pickAll: LodashPick,
    pickBy: LodashPickBy,
    pipe: LodashFlow,
    placeholder: __,
    pluck: LodashMap
  ): LoDashFp = {
    val __obj = js.Dynamic.literal(F = js.Any.fromFunction0(F), T = js.Any.fromFunction0(T), __ = __.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], after = after.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], allPass = js.Any.fromFunction1(allPass), always = js.Any.fromFunction1(always), any = any.asInstanceOf[js.Any], anyPass = js.Any.fromFunction1(anyPass), apply = js.Any.fromFunction1(apply), ary = ary.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], assignAll = assignAll.asInstanceOf[js.Any], assignAllWith = assignAllWith.asInstanceOf[js.Any], assignIn = assignIn.asInstanceOf[js.Any], assignInAll = assignInAll.asInstanceOf[js.Any], assignInAllWith = assignInAllWith.asInstanceOf[js.Any], assignInWith = assignInWith.asInstanceOf[js.Any], assignWith = assignWith.asInstanceOf[js.Any], assoc = assoc.asInstanceOf[js.Any], assocPath = assocPath.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], attempt = js.Any.fromFunction1(attempt), before = before.asInstanceOf[js.Any], bind = bind.asInstanceOf[js.Any], bindAll = bindAll.asInstanceOf[js.Any], bindKey = bindKey.asInstanceOf[js.Any], camelCase = js.Any.fromFunction1(camelCase), capitalize = js.Any.fromFunction1(capitalize), castArray = js.Any.fromFunction1(castArray), ceil = js.Any.fromFunction1(ceil), chunk = chunk.asInstanceOf[js.Any], clamp = clamp.asInstanceOf[js.Any], cloneDeep = js.Any.fromFunction1(cloneDeep), cloneDeepWith = cloneDeepWith.asInstanceOf[js.Any], cloneWith = cloneWith.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), complement = js.Any.fromFunction1(complement), compose = compose.asInstanceOf[js.Any], concat = concat.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], conforms = conforms.asInstanceOf[js.Any], conformsTo = conformsTo.asInstanceOf[js.Any], constant = js.Any.fromFunction1(constant), contains = contains.asInstanceOf[js.Any], countBy = countBy.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), curry = curry.asInstanceOf[js.Any], curryN = curryN.asInstanceOf[js.Any], curryRight = curryRight.asInstanceOf[js.Any], curryRightN = curryRightN.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], deburr = js.Any.fromFunction1(deburr), defaultTo = defaultTo.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], defaultsAll = defaultsAll.asInstanceOf[js.Any], defaultsDeep = defaultsDeep.asInstanceOf[js.Any], defaultsDeepAll = js.Any.fromFunction1(defaultsDeepAll), defer = defer.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], differenceBy = differenceBy.asInstanceOf[js.Any], differenceWith = differenceWith.asInstanceOf[js.Any], dissoc = dissoc.asInstanceOf[js.Any], dissocPath = dissocPath.asInstanceOf[js.Any], divide = divide.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], dropLast = dropLast.asInstanceOf[js.Any], dropLastWhile = dropLastWhile.asInstanceOf[js.Any], dropRight = dropRight.asInstanceOf[js.Any], dropRightWhile = dropRightWhile.asInstanceOf[js.Any], dropWhile = dropWhile.asInstanceOf[js.Any], each = each.asInstanceOf[js.Any], eachRight = eachRight.asInstanceOf[js.Any], endsWith = endsWith.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], entriesIn = entriesIn.asInstanceOf[js.Any], escape = js.Any.fromFunction1(escape), escapeRegExp = js.Any.fromFunction1(escapeRegExp), every = every.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any], extendAll = extendAll.asInstanceOf[js.Any], extendAllWith = extendAllWith.asInstanceOf[js.Any], extendWith = extendWith.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findFrom = findFrom.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], findIndexFrom = findIndexFrom.asInstanceOf[js.Any], findKey = findKey.asInstanceOf[js.Any], findLast = findLast.asInstanceOf[js.Any], findLastFrom = findLastFrom.asInstanceOf[js.Any], findLastIndex = findLastIndex.asInstanceOf[js.Any], findLastIndexFrom = findLastIndexFrom.asInstanceOf[js.Any], findLastKey = findLastKey.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), flatMap = flatMap.asInstanceOf[js.Any], flatMapDeep = flatMapDeep.asInstanceOf[js.Any], flatMapDepth = flatMapDepth.asInstanceOf[js.Any], flatten = js.Any.fromFunction1(flatten), flattenDeep = flattenDeep.asInstanceOf[js.Any], flattenDepth = flattenDepth.asInstanceOf[js.Any], flip = js.Any.fromFunction1(flip), floor = js.Any.fromFunction1(floor), flow = flow.asInstanceOf[js.Any], flowRight = flowRight.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], forEachRight = forEachRight.asInstanceOf[js.Any], forIn = forIn.asInstanceOf[js.Any], forInRight = forInRight.asInstanceOf[js.Any], forOwn = forOwn.asInstanceOf[js.Any], forOwnRight = forOwnRight.asInstanceOf[js.Any], fromPairs = fromPairs.asInstanceOf[js.Any], functions = js.Any.fromFunction1(functions), functionsIn = js.Any.fromFunction1(functionsIn), get = get.asInstanceOf[js.Any], getOr = getOr.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], hasIn = hasIn.asInstanceOf[js.Any], head = js.Any.fromFunction1(head), identical = identical.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], inRange = inRange.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], includesFrom = includesFrom.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], indexOf = indexOf.asInstanceOf[js.Any], indexOfFrom = indexOfFrom.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), initial = js.Any.fromFunction1(initial), intersection = intersection.asInstanceOf[js.Any], intersectionBy = intersectionBy.asInstanceOf[js.Any], intersectionWith = intersectionWith.asInstanceOf[js.Any], invert = js.Any.fromFunction1(invert), invertBy = invertBy.asInstanceOf[js.Any], invertObj = js.Any.fromFunction1(invertObj), invoke = invoke.asInstanceOf[js.Any], invokeArgs = invokeArgs.asInstanceOf[js.Any], invokeArgsMap = invokeArgsMap.asInstanceOf[js.Any], invokeMap = invokeMap.asInstanceOf[js.Any], isArguments = js.Any.fromFunction1(isArguments), isArray = js.Any.fromFunction1(isArray), isArrayBuffer = js.Any.fromFunction1(isArrayBuffer), isArrayLike = isArrayLike.asInstanceOf[js.Any], isArrayLikeObject = isArrayLikeObject.asInstanceOf[js.Any], isBoolean = js.Any.fromFunction1(isBoolean), isBuffer = js.Any.fromFunction1(isBuffer), isDate = js.Any.fromFunction1(isDate), isElement = js.Any.fromFunction1(isElement), isEmpty = isEmpty.asInstanceOf[js.Any], isEqual = isEqual.asInstanceOf[js.Any], isEqualWith = isEqualWith.asInstanceOf[js.Any], isError = js.Any.fromFunction1(isError), isFinite = js.Any.fromFunction1(isFinite), isFunction = js.Any.fromFunction1(isFunction), isInteger = js.Any.fromFunction1(isInteger), isLength = js.Any.fromFunction1(isLength), isMap = js.Any.fromFunction1(isMap), isMatch = isMatch.asInstanceOf[js.Any], isMatchWith = isMatchWith.asInstanceOf[js.Any], isNaN = js.Any.fromFunction1(isNaN), isNative = js.Any.fromFunction1(isNative), isNil = js.Any.fromFunction1(isNil), isNull = js.Any.fromFunction1(isNull), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isObjectLike = js.Any.fromFunction1(isObjectLike), isPlainObject = js.Any.fromFunction1(isPlainObject), isRegExp = js.Any.fromFunction1(isRegExp), isSafeInteger = js.Any.fromFunction1(isSafeInteger), isSet = js.Any.fromFunction1(isSet), isString = js.Any.fromFunction1(isString), isSymbol = js.Any.fromFunction1(isSymbol), isTypedArray = js.Any.fromFunction1(isTypedArray), isUndefined = js.Any.fromFunction1(isUndefined), isWeakMap = js.Any.fromFunction1(isWeakMap), isWeakSet = js.Any.fromFunction1(isWeakSet), iteratee = iteratee.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], juxt = js.Any.fromFunction1(juxt), kebabCase = js.Any.fromFunction1(kebabCase), keyBy = keyBy.asInstanceOf[js.Any], keys = js.Any.fromFunction1(keys), keysIn = js.Any.fromFunction1(keysIn), last = js.Any.fromFunction1(last), lastIndexOf = lastIndexOf.asInstanceOf[js.Any], lastIndexOfFrom = lastIndexOfFrom.asInstanceOf[js.Any], lowerCase = js.Any.fromFunction1(lowerCase), lowerFirst = js.Any.fromFunction1(lowerFirst), lt = lt.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mapKeys = mapKeys.asInstanceOf[js.Any], mapValues = mapValues.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], matchesProperty = matchesProperty.asInstanceOf[js.Any], max = js.Any.fromFunction1(max), maxBy = maxBy.asInstanceOf[js.Any], mean = js.Any.fromFunction1(mean), meanBy = meanBy.asInstanceOf[js.Any], memoize = js.Any.fromFunction1(memoize), merge = merge.asInstanceOf[js.Any], mergeAll = mergeAll.asInstanceOf[js.Any], mergeAllWith = mergeAllWith.asInstanceOf[js.Any], mergeWith = mergeWith.asInstanceOf[js.Any], method = js.Any.fromFunction1(method), methodOf = js.Any.fromFunction1(methodOf), min = js.Any.fromFunction1(min), minBy = minBy.asInstanceOf[js.Any], multiply = multiply.asInstanceOf[js.Any], nAry = nAry.asInstanceOf[js.Any], negate = js.Any.fromFunction1(negate), noConflict = js.Any.fromFunction0(noConflict), noop = noop.asInstanceOf[js.Any], now = js.Any.fromFunction0(now), nth = nth.asInstanceOf[js.Any], nthArg = js.Any.fromFunction1(nthArg), omit = omit.asInstanceOf[js.Any], omitAll = omitAll.asInstanceOf[js.Any], omitBy = omitBy.asInstanceOf[js.Any], once = js.Any.fromFunction1(once), orderBy = orderBy.asInstanceOf[js.Any], over = js.Any.fromFunction1(over), overArgs = overArgs.asInstanceOf[js.Any], overEvery = js.Any.fromFunction1(overEvery), overSome = js.Any.fromFunction1(overSome), pad = pad.asInstanceOf[js.Any], padChars = padChars.asInstanceOf[js.Any], padCharsEnd = padCharsEnd.asInstanceOf[js.Any], padCharsStart = padCharsStart.asInstanceOf[js.Any], padEnd = padEnd.asInstanceOf[js.Any], padStart = padStart.asInstanceOf[js.Any], parseInt = parseInt.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any], partialRight = partialRight.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathEq = pathEq.asInstanceOf[js.Any], pathOr = pathOr.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any], pickAll = pickAll.asInstanceOf[js.Any], pickBy = pickBy.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pluck = pluck.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("eq")(eq_.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoDashFp]
  }
  
  extension [Self <: LoDashFp](x: Self) {
    
    inline def setAdd(value: LodashAdd): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAfter(value: LodashAfter): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAll(value: LodashEvery): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllPass(
      value: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean]
    ): Self = StObject.set(x, "allPass", js.Any.fromFunction1(value))
    
    inline def setAlways(value: /* value */ Any => js.Function0[Any]): Self = StObject.set(x, "always", js.Any.fromFunction1(value))
    
    inline def setAny(value: LodashSome): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setAnyPass(
      value: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean]
    ): Self = StObject.set(x, "anyPass", js.Any.fromFunction1(value))
    
    inline def setApply(value: /* func */ js.Function1[/* repeated */ Any, Any] => js.Function1[/* repeated */ Any, Any]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setAry(value: LodashAry): Self = StObject.set(x, "ary", value.asInstanceOf[js.Any])
    
    inline def setAssign(value: LodashAssign): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setAssignAll(value: LodashAssignAll): Self = StObject.set(x, "assignAll", value.asInstanceOf[js.Any])
    
    inline def setAssignAllWith(value: LodashAssignAllWith): Self = StObject.set(x, "assignAllWith", value.asInstanceOf[js.Any])
    
    inline def setAssignIn(value: LodashAssignIn): Self = StObject.set(x, "assignIn", value.asInstanceOf[js.Any])
    
    inline def setAssignInAll(value: LodashAssignInAll): Self = StObject.set(x, "assignInAll", value.asInstanceOf[js.Any])
    
    inline def setAssignInAllWith(value: LodashAssignInAllWith): Self = StObject.set(x, "assignInAllWith", value.asInstanceOf[js.Any])
    
    inline def setAssignInWith(value: LodashAssignInWith): Self = StObject.set(x, "assignInWith", value.asInstanceOf[js.Any])
    
    inline def setAssignWith(value: LodashAssignWith): Self = StObject.set(x, "assignWith", value.asInstanceOf[js.Any])
    
    inline def setAssoc(value: LodashSet): Self = StObject.set(x, "assoc", value.asInstanceOf[js.Any])
    
    inline def setAssocPath(value: LodashSet): Self = StObject.set(x, "assocPath", value.asInstanceOf[js.Any])
    
    inline def setAt(value: LodashAt): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAttempt(value: /* func */ js.Function1[/* repeated */ Any, Any] => Any | js.Error): Self = StObject.set(x, "attempt", js.Any.fromFunction1(value))
    
    inline def setBefore(value: LodashBefore): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBind(value: LodashBind): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindAll(value: LodashBindAll): Self = StObject.set(x, "bindAll", value.asInstanceOf[js.Any])
    
    inline def setBindKey(value: LodashBindKey): Self = StObject.set(x, "bindKey", value.asInstanceOf[js.Any])
    
    inline def setCamelCase(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "camelCase", js.Any.fromFunction1(value))
    
    inline def setCapitalize(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "capitalize", js.Any.fromFunction1(value))
    
    inline def setCastArray(value: /* value */ Many[Any] => js.Array[Any]): Self = StObject.set(x, "castArray", js.Any.fromFunction1(value))
    
    inline def setCeil(value: /* n */ Double => Double): Self = StObject.set(x, "ceil", js.Any.fromFunction1(value))
    
    inline def setChunk(value: LodashChunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setClamp(value: LodashClamp): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setCloneDeep(value: /* value */ Any => Any): Self = StObject.set(x, "cloneDeep", js.Any.fromFunction1(value))
    
    inline def setCloneDeepWith(value: LodashCloneDeepWith): Self = StObject.set(x, "cloneDeepWith", value.asInstanceOf[js.Any])
    
    inline def setCloneWith(value: LodashCloneWith): Self = StObject.set(x, "cloneWith", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: /* value */ Any => Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setCompact(
      value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Exclude[Any, js.UndefOr[Null | `false` | _empty | `0`]]]
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    inline def setComplement(
      value: /* predicate */ js.Function1[/* args */ js.Array[Any], Any] => js.Function1[/* args */ js.Array[Any], Boolean]
    ): Self = StObject.set(x, "complement", js.Any.fromFunction1(value))
    
    inline def setCompose(value: LodashFlowRight): Self = StObject.set(x, "compose", value.asInstanceOf[js.Any])
    
    inline def setConcat(value: LodashConcat): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    inline def setCond(value: LodashCond): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setConforms(value: LodashConformsTo): Self = StObject.set(x, "conforms", value.asInstanceOf[js.Any])
    
    inline def setConformsTo(value: LodashConformsTo): Self = StObject.set(x, "conformsTo", value.asInstanceOf[js.Any])
    
    inline def setConstant(value: /* value */ Any => js.Function0[Any]): Self = StObject.set(x, "constant", js.Any.fromFunction1(value))
    
    inline def setContains(value: LodashContains): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setCountBy(value: LodashCountBy): Self = StObject.set(x, "countBy", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: /* prototype */ js.Object => js.Object): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCurry(value: LodashCurry): Self = StObject.set(x, "curry", value.asInstanceOf[js.Any])
    
    inline def setCurryN(value: LodashCurryN): Self = StObject.set(x, "curryN", value.asInstanceOf[js.Any])
    
    inline def setCurryRight(value: LodashCurryRight): Self = StObject.set(x, "curryRight", value.asInstanceOf[js.Any])
    
    inline def setCurryRightN(value: LodashCurryRightN): Self = StObject.set(x, "curryRightN", value.asInstanceOf[js.Any])
    
    inline def setDebounce(value: LodashDebounce): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDeburr(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "deburr", js.Any.fromFunction1(value))
    
    inline def setDefaultTo(value: LodashDefaultTo): Self = StObject.set(x, "defaultTo", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: LodashDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsAll(value: LodashDefaultsAll): Self = StObject.set(x, "defaultsAll", value.asInstanceOf[js.Any])
    
    inline def setDefaultsDeep(value: LodashDefaultsDeep): Self = StObject.set(x, "defaultsDeep", value.asInstanceOf[js.Any])
    
    inline def setDefaultsDeepAll(value: /* object */ js.Array[Any] => Any): Self = StObject.set(x, "defaultsDeepAll", js.Any.fromFunction1(value))
    
    inline def setDefer(value: LodashDefer): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: LodashDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: LodashDifference): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setDifferenceBy(value: LodashDifferenceBy): Self = StObject.set(x, "differenceBy", value.asInstanceOf[js.Any])
    
    inline def setDifferenceWith(value: LodashDifferenceWith): Self = StObject.set(x, "differenceWith", value.asInstanceOf[js.Any])
    
    inline def setDissoc(value: LodashUnset): Self = StObject.set(x, "dissoc", value.asInstanceOf[js.Any])
    
    inline def setDissocPath(value: LodashUnset): Self = StObject.set(x, "dissocPath", value.asInstanceOf[js.Any])
    
    inline def setDivide(value: LodashDivide): Self = StObject.set(x, "divide", value.asInstanceOf[js.Any])
    
    inline def setDrop(value: LodashDrop): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropLast(value: LodashDropRight): Self = StObject.set(x, "dropLast", value.asInstanceOf[js.Any])
    
    inline def setDropLastWhile(value: LodashDropRightWhile): Self = StObject.set(x, "dropLastWhile", value.asInstanceOf[js.Any])
    
    inline def setDropRight(value: LodashDropRight): Self = StObject.set(x, "dropRight", value.asInstanceOf[js.Any])
    
    inline def setDropRightWhile(value: LodashDropRightWhile): Self = StObject.set(x, "dropRightWhile", value.asInstanceOf[js.Any])
    
    inline def setDropWhile(value: LodashDropWhile): Self = StObject.set(x, "dropWhile", value.asInstanceOf[js.Any])
    
    inline def setEach(value: LodashForEach): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
    
    inline def setEachRight(value: LodashForEachRight): Self = StObject.set(x, "eachRight", value.asInstanceOf[js.Any])
    
    inline def setEndsWith(value: LodashEndsWith): Self = StObject.set(x, "endsWith", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: LodashToPairs): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesIn(value: LodashToPairsIn): Self = StObject.set(x, "entriesIn", value.asInstanceOf[js.Any])
    
    inline def setEq_(value: LodashEq): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: LodashIsEqual): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
    
    inline def setEscapeRegExp(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "escapeRegExp", js.Any.fromFunction1(value))
    
    inline def setEvery(value: LodashEvery): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: LodashExtend): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendAll(value: LodashExtendAll): Self = StObject.set(x, "extendAll", value.asInstanceOf[js.Any])
    
    inline def setExtendAllWith(value: LodashExtendAllWith): Self = StObject.set(x, "extendAllWith", value.asInstanceOf[js.Any])
    
    inline def setExtendWith(value: LodashExtendWith): Self = StObject.set(x, "extendWith", value.asInstanceOf[js.Any])
    
    inline def setF(value: () => `false`): Self = StObject.set(x, "F", js.Any.fromFunction0(value))
    
    inline def setFill(value: LodashFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: LodashFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFind(value: LodashFind): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setFindFrom(value: LodashFindFrom): Self = StObject.set(x, "findFrom", value.asInstanceOf[js.Any])
    
    inline def setFindIndex(value: LodashFindIndex): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
    
    inline def setFindIndexFrom(value: LodashFindIndexFrom): Self = StObject.set(x, "findIndexFrom", value.asInstanceOf[js.Any])
    
    inline def setFindKey(value: LodashFindKey): Self = StObject.set(x, "findKey", value.asInstanceOf[js.Any])
    
    inline def setFindLast(value: LodashFindLast): Self = StObject.set(x, "findLast", value.asInstanceOf[js.Any])
    
    inline def setFindLastFrom(value: LodashFindLastFrom): Self = StObject.set(x, "findLastFrom", value.asInstanceOf[js.Any])
    
    inline def setFindLastIndex(value: LodashFindLastIndex): Self = StObject.set(x, "findLastIndex", value.asInstanceOf[js.Any])
    
    inline def setFindLastIndexFrom(value: LodashFindLastIndexFrom): Self = StObject.set(x, "findLastIndexFrom", value.asInstanceOf[js.Any])
    
    inline def setFindLastKey(value: LodashFindLastKey): Self = StObject.set(x, "findLastKey", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any]): Self = StObject.set(x, "first", js.Any.fromFunction1(value))
    
    inline def setFlatMap(value: LodashFlatMap): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
    
    inline def setFlatMapDeep(value: LodashFlatMapDeep): Self = StObject.set(x, "flatMapDeep", value.asInstanceOf[js.Any])
    
    inline def setFlatMapDepth(value: LodashFlatMapDepth): Self = StObject.set(x, "flatMapDepth", value.asInstanceOf[js.Any])
    
    inline def setFlatten(value: /* array */ js.UndefOr[typings.lodash.mod.List[Many[Any]] | Null] => js.Array[Any]): Self = StObject.set(x, "flatten", js.Any.fromFunction1(value))
    
    inline def setFlattenDeep(value: LodashFlattenDeep): Self = StObject.set(x, "flattenDeep", value.asInstanceOf[js.Any])
    
    inline def setFlattenDepth(value: LodashFlattenDepth): Self = StObject.set(x, "flattenDepth", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: /* func */ js.Function1[/* args */ Any, Any] => js.Function1[/* args */ Any, Any]): Self = StObject.set(x, "flip", js.Any.fromFunction1(value))
    
    inline def setFloor(value: /* n */ Double => Double): Self = StObject.set(x, "floor", js.Any.fromFunction1(value))
    
    inline def setFlow(value: LodashFlow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowRight(value: LodashFlowRight): Self = StObject.set(x, "flowRight", value.asInstanceOf[js.Any])
    
    inline def setForEach(value: LodashForEach): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
    
    inline def setForEachRight(value: LodashForEachRight): Self = StObject.set(x, "forEachRight", value.asInstanceOf[js.Any])
    
    inline def setForIn(value: LodashForIn): Self = StObject.set(x, "forIn", value.asInstanceOf[js.Any])
    
    inline def setForInRight(value: LodashForInRight): Self = StObject.set(x, "forInRight", value.asInstanceOf[js.Any])
    
    inline def setForOwn(value: LodashForOwn): Self = StObject.set(x, "forOwn", value.asInstanceOf[js.Any])
    
    inline def setForOwnRight(value: LodashForOwnRight): Self = StObject.set(x, "forOwnRight", value.asInstanceOf[js.Any])
    
    inline def setFromPairs(value: LodashFromPairs): Self = StObject.set(x, "fromPairs", value.asInstanceOf[js.Any])
    
    inline def setFunctions(value: /* object */ Any => js.Array[java.lang.String]): Self = StObject.set(x, "functions", js.Any.fromFunction1(value))
    
    inline def setFunctionsIn(value: /* object */ Any => js.Array[java.lang.String]): Self = StObject.set(x, "functionsIn", js.Any.fromFunction1(value))
    
    inline def setGet(value: LodashGet): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetOr(value: LodashGetOr): Self = StObject.set(x, "getOr", value.asInstanceOf[js.Any])
    
    inline def setGroupBy(value: LodashGroupBy): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGt(value: LodashGt): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGte(value: LodashGte): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setHas(value: LodashHas): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    inline def setHasIn(value: LodashHasIn): Self = StObject.set(x, "hasIn", value.asInstanceOf[js.Any])
    
    inline def setHead(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any]): Self = StObject.set(x, "head", js.Any.fromFunction1(value))
    
    inline def setIdentical(value: LodashEq): Self = StObject.set(x, "identical", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: LodashIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setInRange(value: LodashInRange): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
    
    inline def setIncludes(value: LodashIncludes): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesFrom(value: LodashIncludesFrom): Self = StObject.set(x, "includesFrom", value.asInstanceOf[js.Any])
    
    inline def setIndexBy(value: LodashKeyBy): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
    
    inline def setIndexOf(value: LodashIndexOf): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
    
    inline def setIndexOfFrom(value: LodashIndexOfFrom): Self = StObject.set(x, "indexOfFrom", value.asInstanceOf[js.Any])
    
    inline def setInit(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Any]): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitial(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Any]): Self = StObject.set(x, "initial", js.Any.fromFunction1(value))
    
    inline def setIntersection(value: LodashIntersection): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
    
    inline def setIntersectionBy(value: LodashIntersectionBy): Self = StObject.set(x, "intersectionBy", value.asInstanceOf[js.Any])
    
    inline def setIntersectionWith(value: LodashIntersectionWith): Self = StObject.set(x, "intersectionWith", value.asInstanceOf[js.Any])
    
    inline def setInvert(value: /* object */ js.Object => Dictionary[java.lang.String]): Self = StObject.set(x, "invert", js.Any.fromFunction1(value))
    
    inline def setInvertBy(value: LodashInvertBy): Self = StObject.set(x, "invertBy", value.asInstanceOf[js.Any])
    
    inline def setInvertObj(value: /* object */ js.Object => Dictionary[java.lang.String]): Self = StObject.set(x, "invertObj", js.Any.fromFunction1(value))
    
    inline def setInvoke(value: LodashInvoke): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    inline def setInvokeArgs(value: LodashInvokeArgs): Self = StObject.set(x, "invokeArgs", value.asInstanceOf[js.Any])
    
    inline def setInvokeArgsMap(value: LodashInvokeArgsMap): Self = StObject.set(x, "invokeArgsMap", value.asInstanceOf[js.Any])
    
    inline def setInvokeMap(value: LodashInvokeMap): Self = StObject.set(x, "invokeMap", value.asInstanceOf[js.Any])
    
    inline def setIsArguments(value: /* value */ Any => /* is std.IArguments */ Boolean): Self = StObject.set(x, "isArguments", js.Any.fromFunction1(value))
    
    inline def setIsArray(value: /* value */ Any => /* is std.Array<any> */ Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
    
    inline def setIsArrayBuffer(value: /* value */ Any => /* is std.ArrayBuffer */ Boolean): Self = StObject.set(x, "isArrayBuffer", js.Any.fromFunction1(value))
    
    inline def setIsArrayLike(value: LodashIsArrayLike): Self = StObject.set(x, "isArrayLike", value.asInstanceOf[js.Any])
    
    inline def setIsArrayLikeObject(value: LodashIsArrayLikeObject): Self = StObject.set(x, "isArrayLikeObject", value.asInstanceOf[js.Any])
    
    inline def setIsBoolean(value: /* value */ Any => /* is boolean */ Boolean): Self = StObject.set(x, "isBoolean", js.Any.fromFunction1(value))
    
    inline def setIsBuffer(value: /* value */ Any => Boolean): Self = StObject.set(x, "isBuffer", js.Any.fromFunction1(value))
    
    inline def setIsDate(value: /* value */ Any => /* is std.Date */ Boolean): Self = StObject.set(x, "isDate", js.Any.fromFunction1(value))
    
    inline def setIsElement(value: /* value */ Any => Boolean): Self = StObject.set(x, "isElement", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: LodashIsEmpty): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: LodashIsEqual): Self = StObject.set(x, "isEqual", value.asInstanceOf[js.Any])
    
    inline def setIsEqualWith(value: LodashIsEqualWith): Self = StObject.set(x, "isEqualWith", value.asInstanceOf[js.Any])
    
    inline def setIsError(value: /* value */ Any => /* is std.Error */ Boolean): Self = StObject.set(x, "isError", js.Any.fromFunction1(value))
    
    inline def setIsFinite(value: /* value */ Any => Boolean): Self = StObject.set(x, "isFinite", js.Any.fromFunction1(value))
    
    inline def setIsFunction(value: /* value */ Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
    
    inline def setIsInteger(value: /* value */ Any => Boolean): Self = StObject.set(x, "isInteger", js.Any.fromFunction1(value))
    
    inline def setIsLength(value: /* value */ Any => Boolean): Self = StObject.set(x, "isLength", js.Any.fromFunction1(value))
    
    inline def setIsMap(value: /* value */ Any => /* is std.Map<any, any> */ Boolean): Self = StObject.set(x, "isMap", js.Any.fromFunction1(value))
    
    inline def setIsMatch(value: LodashIsMatch): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
    
    inline def setIsMatchWith(value: LodashIsMatchWith): Self = StObject.set(x, "isMatchWith", value.asInstanceOf[js.Any])
    
    inline def setIsNaN(value: /* value */ Any => Boolean): Self = StObject.set(x, "isNaN", js.Any.fromFunction1(value))
    
    inline def setIsNative(value: /* value */ Any => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction1(value))
    
    inline def setIsNil(value: /* value */ Any => Boolean): Self = StObject.set(x, "isNil", js.Any.fromFunction1(value))
    
    inline def setIsNull(value: /* value */ Any => /* is null */ Boolean): Self = StObject.set(x, "isNull", js.Any.fromFunction1(value))
    
    inline def setIsNumber(value: /* value */ Any => /* is number */ Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
    
    inline def setIsObject(value: /* value */ Any => /* is object */ Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
    
    inline def setIsObjectLike(value: /* value */ Any => Boolean): Self = StObject.set(x, "isObjectLike", js.Any.fromFunction1(value))
    
    inline def setIsPlainObject(value: /* value */ Any => Boolean): Self = StObject.set(x, "isPlainObject", js.Any.fromFunction1(value))
    
    inline def setIsRegExp(value: /* value */ Any => /* is std.RegExp */ Boolean): Self = StObject.set(x, "isRegExp", js.Any.fromFunction1(value))
    
    inline def setIsSafeInteger(value: /* value */ Any => Boolean): Self = StObject.set(x, "isSafeInteger", js.Any.fromFunction1(value))
    
    inline def setIsSet(value: /* value */ Any => /* is std.Set<any> */ Boolean): Self = StObject.set(x, "isSet", js.Any.fromFunction1(value))
    
    inline def setIsString(value: /* value */ Any => /* is string */ Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
    
    inline def setIsSymbol(value: /* value */ Any => /* is symbol */ Boolean): Self = StObject.set(x, "isSymbol", js.Any.fromFunction1(value))
    
    inline def setIsTypedArray(value: /* value */ Any => Boolean): Self = StObject.set(x, "isTypedArray", js.Any.fromFunction1(value))
    
    inline def setIsUndefined(value: /* value */ Any => /* is undefined */ Boolean): Self = StObject.set(x, "isUndefined", js.Any.fromFunction1(value))
    
    inline def setIsWeakMap(value: /* value */ Any => /* is std.WeakMap<object, any> */ Boolean): Self = StObject.set(x, "isWeakMap", js.Any.fromFunction1(value))
    
    inline def setIsWeakSet(value: /* value */ Any => /* is std.WeakSet<object> */ Boolean): Self = StObject.set(x, "isWeakSet", js.Any.fromFunction1(value))
    
    inline def setIteratee(value: LodashIteratee): Self = StObject.set(x, "iteratee", value.asInstanceOf[js.Any])
    
    inline def setJoin(value: LodashJoin): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJuxt(
      value: /* iteratees */ Many[js.Function1[/* repeated */ Any, Any]] => js.Function1[/* repeated */ Any, js.Array[Any]]
    ): Self = StObject.set(x, "juxt", js.Any.fromFunction1(value))
    
    inline def setKebabCase(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "kebabCase", js.Any.fromFunction1(value))
    
    inline def setKeyBy(value: LodashKeyBy): Self = StObject.set(x, "keyBy", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: /* object */ Any => js.Array[java.lang.String]): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
    
    inline def setKeysIn(value: /* object */ Any => js.Array[java.lang.String]): Self = StObject.set(x, "keysIn", js.Any.fromFunction1(value))
    
    inline def setLast(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any]): Self = StObject.set(x, "last", js.Any.fromFunction1(value))
    
    inline def setLastIndexOf(value: LodashLastIndexOf): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
    
    inline def setLastIndexOfFrom(value: LodashLastIndexOfFrom): Self = StObject.set(x, "lastIndexOfFrom", value.asInstanceOf[js.Any])
    
    inline def setLowerCase(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "lowerCase", js.Any.fromFunction1(value))
    
    inline def setLowerFirst(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "lowerFirst", js.Any.fromFunction1(value))
    
    inline def setLt(value: LodashLt): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLte(value: LodashLte): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setMap(value: LodashMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapKeys(value: LodashMapKeys): Self = StObject.set(x, "mapKeys", value.asInstanceOf[js.Any])
    
    inline def setMapValues(value: LodashMapValues): Self = StObject.set(x, "mapValues", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: LodashIsMatch): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesProperty(value: LodashMatchesProperty): Self = StObject.set(x, "matchesProperty", value.asInstanceOf[js.Any])
    
    inline def setMax(value: /* collection */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any]): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxBy(value: LodashMaxBy): Self = StObject.set(x, "maxBy", value.asInstanceOf[js.Any])
    
    inline def setMean(value: /* collection */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => Double): Self = StObject.set(x, "mean", js.Any.fromFunction1(value))
    
    inline def setMeanBy(value: LodashMeanBy): Self = StObject.set(x, "meanBy", value.asInstanceOf[js.Any])
    
    inline def setMemoize(
      value: /* func */ js.Function1[/* args */ Any, Any] => (js.Function1[/* args */ Any, Any]) & MemoizedFunction
    ): Self = StObject.set(x, "memoize", js.Any.fromFunction1(value))
    
    inline def setMerge(value: LodashMerge): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeAll(value: LodashMergeAll): Self = StObject.set(x, "mergeAll", value.asInstanceOf[js.Any])
    
    inline def setMergeAllWith(value: LodashMergeAllWith): Self = StObject.set(x, "mergeAllWith", value.asInstanceOf[js.Any])
    
    inline def setMergeWith(value: LodashMergeWith): Self = StObject.set(x, "mergeWith", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: /* path */ PropertyPath => js.Function1[/* object */ Any, Any]): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    
    inline def setMethodOf(value: /* object */ js.Object => js.Function1[/* path */ PropertyPath, Any]): Self = StObject.set(x, "methodOf", js.Any.fromFunction1(value))
    
    inline def setMin(value: /* collection */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.UndefOr[Any]): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinBy(value: LodashMinBy): Self = StObject.set(x, "minBy", value.asInstanceOf[js.Any])
    
    inline def setMultiply(value: LodashMultiply): Self = StObject.set(x, "multiply", value.asInstanceOf[js.Any])
    
    inline def setNAry(value: LodashAry): Self = StObject.set(x, "nAry", value.asInstanceOf[js.Any])
    
    inline def setNegate(
      value: /* predicate */ js.Function1[/* args */ js.Array[Any], Any] => js.Function1[/* args */ js.Array[Any], Boolean]
    ): Self = StObject.set(x, "negate", js.Any.fromFunction1(value))
    
    inline def setNoConflict(value: () => Typeoflodash): Self = StObject.set(x, "noConflict", js.Any.fromFunction0(value))
    
    inline def setNoop(value: LodashNoop): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
    
    inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    
    inline def setNth(value: LodashNth): Self = StObject.set(x, "nth", value.asInstanceOf[js.Any])
    
    inline def setNthArg(value: /* n */ Double => js.Function1[/* repeated */ Any, Any]): Self = StObject.set(x, "nthArg", js.Any.fromFunction1(value))
    
    inline def setOmit(value: LodashOmit): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
    
    inline def setOmitAll(value: LodashOmit): Self = StObject.set(x, "omitAll", value.asInstanceOf[js.Any])
    
    inline def setOmitBy(value: LodashOmitBy): Self = StObject.set(x, "omitBy", value.asInstanceOf[js.Any])
    
    inline def setOnce(value: /* func */ js.Function1[/* args */ Any, Any] => js.Function1[/* args */ Any, Any]): Self = StObject.set(x, "once", js.Any.fromFunction1(value))
    
    inline def setOrderBy(value: LodashOrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOver(
      value: /* iteratees */ Many[js.Function1[/* repeated */ Any, Any]] => js.Function1[/* repeated */ Any, js.Array[Any]]
    ): Self = StObject.set(x, "over", js.Any.fromFunction1(value))
    
    inline def setOverArgs(value: LodashOverArgs): Self = StObject.set(x, "overArgs", value.asInstanceOf[js.Any])
    
    inline def setOverEvery(
      value: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean]
    ): Self = StObject.set(x, "overEvery", js.Any.fromFunction1(value))
    
    inline def setOverSome(
      value: /* predicates */ Many[js.Function1[/* repeated */ Any, Boolean]] => js.Function1[/* repeated */ Any, Boolean]
    ): Self = StObject.set(x, "overSome", js.Any.fromFunction1(value))
    
    inline def setPad(value: LodashPad): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadChars(value: LodashPadChars): Self = StObject.set(x, "padChars", value.asInstanceOf[js.Any])
    
    inline def setPadCharsEnd(value: LodashPadCharsEnd): Self = StObject.set(x, "padCharsEnd", value.asInstanceOf[js.Any])
    
    inline def setPadCharsStart(value: LodashPadCharsStart): Self = StObject.set(x, "padCharsStart", value.asInstanceOf[js.Any])
    
    inline def setPadEnd(value: LodashPadEnd): Self = StObject.set(x, "padEnd", value.asInstanceOf[js.Any])
    
    inline def setPadStart(value: LodashPadStart): Self = StObject.set(x, "padStart", value.asInstanceOf[js.Any])
    
    inline def setParseInt(value: LodashParseInt): Self = StObject.set(x, "parseInt", value.asInstanceOf[js.Any])
    
    inline def setPartial(value: LodashPartial): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialRight(value: LodashPartialRight): Self = StObject.set(x, "partialRight", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: LodashPartition): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPath(value: LodashPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathEq(value: LodashMatchesProperty): Self = StObject.set(x, "pathEq", value.asInstanceOf[js.Any])
    
    inline def setPathOr(value: LodashPathOr): Self = StObject.set(x, "pathOr", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: LodashAt): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPick(value: LodashPick): Self = StObject.set(x, "pick", value.asInstanceOf[js.Any])
    
    inline def setPickAll(value: LodashPick): Self = StObject.set(x, "pickAll", value.asInstanceOf[js.Any])
    
    inline def setPickBy(value: LodashPickBy): Self = StObject.set(x, "pickBy", value.asInstanceOf[js.Any])
    
    inline def setPipe(value: LodashFlow): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: __): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPluck(value: LodashMap): Self = StObject.set(x, "pluck", value.asInstanceOf[js.Any])
    
    inline def setProp(value: LodashProp): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setPropEq(value: LodashMatchesProperty): Self = StObject.set(x, "propEq", value.asInstanceOf[js.Any])
    
    inline def setPropOr(value: LodashPropOr): Self = StObject.set(x, "propOr", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: LodashProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyOf(value: LodashPropertyOf): Self = StObject.set(x, "propertyOf", value.asInstanceOf[js.Any])
    
    inline def setProps(value: LodashAt): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPull(value: LodashPull): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    inline def setPullAll(value: LodashPullAll): Self = StObject.set(x, "pullAll", value.asInstanceOf[js.Any])
    
    inline def setPullAllBy(value: LodashPullAllBy): Self = StObject.set(x, "pullAllBy", value.asInstanceOf[js.Any])
    
    inline def setPullAllWith(value: LodashPullAllWith): Self = StObject.set(x, "pullAllWith", value.asInstanceOf[js.Any])
    
    inline def setPullAt(value: LodashPullAt): Self = StObject.set(x, "pullAt", value.asInstanceOf[js.Any])
    
    inline def setRandom(value: LodashRandom): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRange(value: LodashRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeRight(value: LodashRangeRight): Self = StObject.set(x, "rangeRight", value.asInstanceOf[js.Any])
    
    inline def setRangeStep(value: LodashRangeStep): Self = StObject.set(x, "rangeStep", value.asInstanceOf[js.Any])
    
    inline def setRangeStepRight(value: LodashRangeStepRight): Self = StObject.set(x, "rangeStepRight", value.asInstanceOf[js.Any])
    
    inline def setRearg(value: LodashRearg): Self = StObject.set(x, "rearg", value.asInstanceOf[js.Any])
    
    inline def setReduce(value: LodashReduce): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    inline def setReduceRight(value: LodashReduceRight): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
    
    inline def setReject(value: LodashReject): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: LodashRemove): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: LodashRepeat): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: LodashReplace): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setRest(value: /* func */ js.Function1[/* repeated */ Any, Any] => js.Function1[/* repeated */ Any, Any]): Self = StObject.set(x, "rest", js.Any.fromFunction1(value))
    
    inline def setRestFrom(value: LodashRestFrom): Self = StObject.set(x, "restFrom", value.asInstanceOf[js.Any])
    
    inline def setResult(value: LodashResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: /* array */ typings.lodash.mod.List[Any] => typings.lodash.mod.List[Any]): Self = StObject.set(x, "reverse", js.Any.fromFunction1(value))
    
    inline def setRound(value: /* n */ Double => Double): Self = StObject.set(x, "round", js.Any.fromFunction1(value))
    
    inline def setRunInContext(value: /* context */ js.Object => LoDashStatic): Self = StObject.set(x, "runInContext", js.Any.fromFunction1(value))
    
    inline def setSample(value: LodashSample): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    inline def setSampleSize(value: LodashSampleSize): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSet(value: LodashSet): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetWith(value: LodashSetWith): Self = StObject.set(x, "setWith", value.asInstanceOf[js.Any])
    
    inline def setShuffle(value: LodashShuffle): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setSize(value: /* collection */ js.UndefOr[js.Object | java.lang.String | Null] => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    inline def setSlice(value: LodashSlice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSnakeCase(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "snakeCase", js.Any.fromFunction1(value))
    
    inline def setSome(value: LodashSome): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: LodashSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortedIndex(value: LodashSortedIndex): Self = StObject.set(x, "sortedIndex", value.asInstanceOf[js.Any])
    
    inline def setSortedIndexBy(value: LodashSortedIndexBy): Self = StObject.set(x, "sortedIndexBy", value.asInstanceOf[js.Any])
    
    inline def setSortedIndexOf(value: LodashSortedIndexOf): Self = StObject.set(x, "sortedIndexOf", value.asInstanceOf[js.Any])
    
    inline def setSortedLastIndex(value: LodashSortedLastIndex): Self = StObject.set(x, "sortedLastIndex", value.asInstanceOf[js.Any])
    
    inline def setSortedLastIndexBy(value: LodashSortedLastIndexBy): Self = StObject.set(x, "sortedLastIndexBy", value.asInstanceOf[js.Any])
    
    inline def setSortedLastIndexOf(value: LodashSortedLastIndexOf): Self = StObject.set(x, "sortedLastIndexOf", value.asInstanceOf[js.Any])
    
    inline def setSortedUniq(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Any]): Self = StObject.set(x, "sortedUniq", js.Any.fromFunction1(value))
    
    inline def setSortedUniqBy(value: LodashSortedUniqBy): Self = StObject.set(x, "sortedUniqBy", value.asInstanceOf[js.Any])
    
    inline def setSplit(value: LodashSplit): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: /* func */ js.Function1[/* repeated */ Any, Any] => js.Function1[/* repeated */ Any, Any]): Self = StObject.set(x, "spread", js.Any.fromFunction1(value))
    
    inline def setSpreadFrom(value: LodashSpreadFrom): Self = StObject.set(x, "spreadFrom", value.asInstanceOf[js.Any])
    
    inline def setStartCase(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "startCase", js.Any.fromFunction1(value))
    
    inline def setStartsWith(value: LodashStartsWith): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    
    inline def setStubArray(value: () => js.Array[Any]): Self = StObject.set(x, "stubArray", js.Any.fromFunction0(value))
    
    inline def setStubFalse(value: () => `false`): Self = StObject.set(x, "stubFalse", js.Any.fromFunction0(value))
    
    inline def setStubObject(value: () => Any): Self = StObject.set(x, "stubObject", js.Any.fromFunction0(value))
    
    inline def setStubString(value: () => java.lang.String): Self = StObject.set(x, "stubString", js.Any.fromFunction0(value))
    
    inline def setStubTrue(value: () => `true`): Self = StObject.set(x, "stubTrue", js.Any.fromFunction0(value))
    
    inline def setSubtract(value: LodashSubtract): Self = StObject.set(x, "subtract", value.asInstanceOf[js.Any])
    
    inline def setSum(value: /* collection */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => Double): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
    
    inline def setSumBy(value: LodashSumBy): Self = StObject.set(x, "sumBy", value.asInstanceOf[js.Any])
    
    inline def setSymmetricDifference(value: LodashXor): Self = StObject.set(x, "symmetricDifference", value.asInstanceOf[js.Any])
    
    inline def setSymmetricDifferenceBy(value: LodashXorBy): Self = StObject.set(x, "symmetricDifferenceBy", value.asInstanceOf[js.Any])
    
    inline def setSymmetricDifferenceWith(value: LodashXorWith): Self = StObject.set(x, "symmetricDifferenceWith", value.asInstanceOf[js.Any])
    
    inline def setT(value: () => `true`): Self = StObject.set(x, "T", js.Any.fromFunction0(value))
    
    inline def setTail(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Any]): Self = StObject.set(x, "tail", js.Any.fromFunction1(value))
    
    inline def setTake(value: LodashTake): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeLast(value: LodashTakeRight): Self = StObject.set(x, "takeLast", value.asInstanceOf[js.Any])
    
    inline def setTakeLastWhile(value: LodashTakeRightWhile): Self = StObject.set(x, "takeLastWhile", value.asInstanceOf[js.Any])
    
    inline def setTakeRight(value: LodashTakeRight): Self = StObject.set(x, "takeRight", value.asInstanceOf[js.Any])
    
    inline def setTakeRightWhile(value: LodashTakeRightWhile): Self = StObject.set(x, "takeRightWhile", value.asInstanceOf[js.Any])
    
    inline def setTakeWhile(value: LodashTakeWhile): Self = StObject.set(x, "takeWhile", value.asInstanceOf[js.Any])
    
    inline def setTap(value: LodashTap): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: /* string */ java.lang.String => TemplateExecutor): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setThrottle(value: LodashThrottle): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThru(value: LodashThru): Self = StObject.set(x, "thru", value.asInstanceOf[js.Any])
    
    inline def setTimes(value: LodashTimes): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setToArray(value: LodashToArray): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
    
    inline def setToFinite(value: /* value */ Any => Double): Self = StObject.set(x, "toFinite", js.Any.fromFunction1(value))
    
    inline def setToInteger(value: /* value */ Any => Double): Self = StObject.set(x, "toInteger", js.Any.fromFunction1(value))
    
    inline def setToLength(value: /* value */ Any => Double): Self = StObject.set(x, "toLength", js.Any.fromFunction1(value))
    
    inline def setToLower(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "toLower", js.Any.fromFunction1(value))
    
    inline def setToNumber(value: /* value */ Any => Double): Self = StObject.set(x, "toNumber", js.Any.fromFunction1(value))
    
    inline def setToPairs(value: LodashToPairs): Self = StObject.set(x, "toPairs", value.asInstanceOf[js.Any])
    
    inline def setToPairsIn(value: LodashToPairsIn): Self = StObject.set(x, "toPairsIn", value.asInstanceOf[js.Any])
    
    inline def setToPath(value: /* value */ Any => js.Array[java.lang.String]): Self = StObject.set(x, "toPath", js.Any.fromFunction1(value))
    
    inline def setToPlainObject(value: /* value */ Any => Any): Self = StObject.set(x, "toPlainObject", js.Any.fromFunction1(value))
    
    inline def setToSafeInteger(value: /* value */ Any => Double): Self = StObject.set(x, "toSafeInteger", js.Any.fromFunction1(value))
    
    inline def setToString_(value: /* value */ Any => java.lang.String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    
    inline def setToUpper(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "toUpper", js.Any.fromFunction1(value))
    
    inline def setTransform(value: LodashTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTrim(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
    
    inline def setTrimChars(value: LodashTrimChars): Self = StObject.set(x, "trimChars", value.asInstanceOf[js.Any])
    
    inline def setTrimCharsEnd(value: LodashTrimCharsEnd): Self = StObject.set(x, "trimCharsEnd", value.asInstanceOf[js.Any])
    
    inline def setTrimCharsStart(value: LodashTrimCharsStart): Self = StObject.set(x, "trimCharsStart", value.asInstanceOf[js.Any])
    
    inline def setTrimEnd(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "trimEnd", js.Any.fromFunction1(value))
    
    inline def setTrimStart(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "trimStart", js.Any.fromFunction1(value))
    
    inline def setTruncate(value: LodashTruncate): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    inline def setUnapply(value: /* func */ js.Function1[/* repeated */ Any, Any] => js.Function1[/* repeated */ Any, Any]): Self = StObject.set(x, "unapply", js.Any.fromFunction1(value))
    
    inline def setUnary(
      value: /* func */ js.Function2[/* arg1 */ Any, /* repeated */ Any, Any] => js.Function1[/* arg1 */ Any, Any]
    ): Self = StObject.set(x, "unary", js.Any.fromFunction1(value))
    
    inline def setUnescape(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "unescape", js.Any.fromFunction1(value))
    
    inline def setUnion(value: LodashUnion): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
    
    inline def setUnionBy(value: LodashUnionBy): Self = StObject.set(x, "unionBy", value.asInstanceOf[js.Any])
    
    inline def setUnionWith(value: LodashUnionWith): Self = StObject.set(x, "unionWith", value.asInstanceOf[js.Any])
    
    inline def setUniq(value: /* array */ js.UndefOr[typings.lodash.mod.List[Any] | Null] => js.Array[Any]): Self = StObject.set(x, "uniq", js.Any.fromFunction1(value))
    
    inline def setUniqBy(value: LodashUniqBy): Self = StObject.set(x, "uniqBy", value.asInstanceOf[js.Any])
    
    inline def setUniqWith(value: LodashUniqWith): Self = StObject.set(x, "uniqWith", value.asInstanceOf[js.Any])
    
    inline def setUniqueId(value: /* prefix */ java.lang.String => java.lang.String): Self = StObject.set(x, "uniqueId", js.Any.fromFunction1(value))
    
    inline def setUnnest(value: /* array */ js.UndefOr[typings.lodash.mod.List[Many[Any]] | Null] => js.Array[Any]): Self = StObject.set(x, "unnest", js.Any.fromFunction1(value))
    
    inline def setUnset(value: LodashUnset): Self = StObject.set(x, "unset", value.asInstanceOf[js.Any])
    
    inline def setUnzip(
      value: /* array */ js.UndefOr[
          js.Array[js.Array[Any]] | typings.lodash.mod.List[typings.lodash.mod.List[Any]] | Null
        ] => js.Array[js.Array[Any]]
    ): Self = StObject.set(x, "unzip", js.Any.fromFunction1(value))
    
    inline def setUnzipWith(value: LodashUnzipWith): Self = StObject.set(x, "unzipWith", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: LodashUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateWith(value: LodashUpdateWith): Self = StObject.set(x, "updateWith", value.asInstanceOf[js.Any])
    
    inline def setUpperCase(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "upperCase", js.Any.fromFunction1(value))
    
    inline def setUpperFirst(value: /* string */ java.lang.String => java.lang.String): Self = StObject.set(x, "upperFirst", js.Any.fromFunction1(value))
    
    inline def setUseWith(value: LodashOverArgs): Self = StObject.set(x, "useWith", value.asInstanceOf[js.Any])
    
    inline def setValues(value: LodashValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesIn(value: LodashValuesIn): Self = StObject.set(x, "valuesIn", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: LodashConformsTo): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereEq(value: LodashIsMatch): Self = StObject.set(x, "whereEq", value.asInstanceOf[js.Any])
    
    inline def setWithout(value: LodashWithout): Self = StObject.set(x, "without", value.asInstanceOf[js.Any])
    
    inline def setWords(value: /* string */ java.lang.String => js.Array[java.lang.String]): Self = StObject.set(x, "words", js.Any.fromFunction1(value))
    
    inline def setWrap(value: LodashWrap): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setXor(value: LodashXor): Self = StObject.set(x, "xor", value.asInstanceOf[js.Any])
    
    inline def setXorBy(value: LodashXorBy): Self = StObject.set(x, "xorBy", value.asInstanceOf[js.Any])
    
    inline def setXorWith(value: LodashXorWith): Self = StObject.set(x, "xorWith", value.asInstanceOf[js.Any])
    
    inline def setZip(value: LodashZip): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipAll(value: LodashZipAll): Self = StObject.set(x, "zipAll", value.asInstanceOf[js.Any])
    
    inline def setZipObj(value: LodashZipObject): Self = StObject.set(x, "zipObj", value.asInstanceOf[js.Any])
    
    inline def setZipObject(value: LodashZipObject): Self = StObject.set(x, "zipObject", value.asInstanceOf[js.Any])
    
    inline def setZipObjectDeep(value: LodashZipObjectDeep): Self = StObject.set(x, "zipObjectDeep", value.asInstanceOf[js.Any])
    
    inline def setZipWith(value: LodashZipWith): Self = StObject.set(x, "zipWith", value.asInstanceOf[js.Any])
    
    inline def set__(value: __): Self = StObject.set(x, "__", value.asInstanceOf[js.Any])
  }
}
