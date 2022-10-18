package typings.lodash.mod

import typings.lodash.anon.Typeoflodash
import typings.lodash.lodashBooleans.`false`
import typings.lodash.lodashBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoDashExplicitWrapper[TValue] extends StObject {
  
  /**
    * @see _.add
    */
  def add(addend: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.attempt
    */
  def attempt[TResult](args: Any*): ExpChain[TResult | js.Error] = js.native
  
  /**
    * @see _.bind
    */
  def bind(thisArg: Any, partials: Any*): FunctionChain[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.bindAll
    */
  def bindAll(methodNames: Many[java.lang.String]*): this.type = js.native
  
  /**
    * @see _.bindKey
    */
  def bindKey(key: java.lang.String, partials: Any*): FunctionChain[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.camelCase
    */
  def camelCase(): StringChain = js.native
  
  /**
    * @see _.capitalize
    */
  def capitalize(): StringChain = js.native
  
  /**
    * @see _.ceil
    */
  def ceil(): PrimitiveChain[Double] = js.native
  def ceil(precision: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): this.type = js.native
  
  /**
    * @see _.clamp
    */
  def clamp(lower: Double, upper: Double): PrimitiveChain[Double] = js.native
  /**
    * @see _.clamp
    */
  def clamp(upper: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.cloneDeep
    */
  def cloneDeep(): this.type = js.native
  
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(): this.type = js.native
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(customizer: CloneDeepWithCustomizer[TValue]): LoDashExplicitWrapper[Any] = js.native
  
  /**
    * @see _.cloneWith
    */
  def cloneWith(): this.type = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith[TResult /* <: js.Object | java.lang.String | Double | Boolean | Null */](customizer: CloneWithCustomizer[TValue, js.UndefOr[TResult]]): ExpChain[TResult] = js.native
  
  /**
    * @see _.commit
    */
  def commit(): this.type = js.native
  
  /**
    * @see _.conforms
    */
  def conforms(): FunctionChain[js.Function1[/* value */ ConformsPredicateObject[TValue], Boolean]] = js.native
  
  /**
    * @see _.conformsTo
    */
  def conformsTo(source: ConformsPredicateObject[TValue]): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.constant
    */
  def constant(): FunctionChain[js.Function0[TValue]] = js.native
  
  /**
    * @see _.deburr
    */
  def deburr(): StringChain = js.native
  
  /**
    * @see _.defaultTo
    */
  def defaultTo(defaultValue: TValue): ExpChain[TValue] = js.native
  /**
    * @see _.defaultTo
    */
  @JSName("defaultTo")
  def defaultTo_TDefault[TDefault](defaultValue: TDefault): ExpChain[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue extends null | undefined ? TDefault : TValue | TDefault */ js.Any
  ] = js.native
  
  /**
    * @see _.defer
    */
  def defer(args: Any*): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.delay
    */
  def delay(wait: Double, args: Any*): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.divide
    */
  def divide(divisor: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.endsWith
    */
  def endsWith(): PrimitiveChain[Boolean] = js.native
  def endsWith(target: java.lang.String): PrimitiveChain[Boolean] = js.native
  def endsWith(target: java.lang.String, position: Double): PrimitiveChain[Boolean] = js.native
  def endsWith(target: Unit, position: Double): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.entries
    */
  def entries(): CollectionChain[js.Tuple2[java.lang.String, Any]] = js.native
  
  /**
    * @see _.entriesIn
    */
  def entriesIn(): CollectionChain[js.Tuple2[java.lang.String, Any]] = js.native
  
  /**
    * @see _.escape
    */
  def escape(): StringChain = js.native
  
  /**
    * @see _.escapeRegExp
    */
  def escapeRegExp(): StringChain = js.native
  
  /**
    * @see _.findKey
    */
  def findKey(): StringNullableChain = js.native
  def findKey(predicate: ObjectIteratee[TValue]): StringNullableChain = js.native
  
  /**
    * @see _.findLastKey
    */
  def findLastKey(): StringNullableChain = js.native
  def findLastKey(predicate: ObjectIteratee[TValue]): StringNullableChain = js.native
  
  /**
    * @see _.floor
    */
  def floor(): PrimitiveChain[Double] = js.native
  def floor(precision: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.forIn
    */
  def forIn(): this.type = js.native
  def forIn(iteratee: ObjectIterator[TValue, Any]): this.type = js.native
  
  /**
    * @see _.forInRight
    */
  def forInRight(): this.type = js.native
  def forInRight(iteratee: ObjectIterator[TValue, Any]): this.type = js.native
  
  /**
    * @see _.forOwn
    */
  def forOwn(): this.type = js.native
  def forOwn(iteratee: ObjectIterator[TValue, Any]): this.type = js.native
  
  /**
    * @see _.forOwnRight
    */
  def forOwnRight(): this.type = js.native
  def forOwnRight(iteratee: ObjectIterator[TValue, Any]): this.type = js.native
  
  /**
    * @see _.functions
    */
  def functions(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.functionsIn
    */
  def functionsIn(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.gt
    */
  def gt(other: Any): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.gte
    */
  def gte(other: Any): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.has
    */
  def has(path: PropertyPath): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.hasIn
    */
  def hasIn(path: PropertyPath): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.identity
    */
  def identity(): this.type = js.native
  
  /**
    * @see _.inRange
    */
  def inRange(start: Double): PrimitiveChain[Boolean] = js.native
  def inRange(start: Double, end: Double): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.invert
    */
  def invert(): ObjectChain[Dictionary[java.lang.String]] = js.native
  
  /**
    * @see _.invoke
    */
  def invoke(path: PropertyPath, args: Any*): LoDashExplicitWrapper[Any] = js.native
  
  /**
    * @see _.invokeMap
    */
  def invokeMap(methodName: java.lang.String, args: Any*): CollectionChain[Any] = js.native
  /**
    * @see _.invokeMap
    */
  def invokeMap[TResult](method: js.Function1[/* repeated */ Any, TResult], args: Any*): CollectionChain[TResult] = js.native
  
  /**
    * @see _.isArguments
    */
  def isArguments(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isArray
    */
  def isArray(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isArrayBuffer
    */
  def isArrayBuffer(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isArrayLikeObject
    */
  def isArrayLikeObject(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isBoolean
    */
  def isBoolean(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isBuffer
    */
  def isBuffer(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isDate
    */
  def isDate(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isElement
    */
  def isElement(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isEmpty
    */
  def isEmpty(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isEqual
    */
  def isEqual(other: Any): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isEqualWith
    */
  def isEqualWith(other: Any): PrimitiveChain[Boolean] = js.native
  def isEqualWith(other: Any, customizer: IsEqualCustomizer): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isError
    */
  def isError(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isFinite
    */
  def isFinite(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isFunction
    */
  def isFunction(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isInteger
    */
  def isInteger(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isLength
    */
  def isLength(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isMap
    */
  def isMap(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isMatch
    */
  def isMatch(source: js.Object): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isMatchWith
    */
  def isMatchWith(source: js.Object, customizer: isMatchWithCustomizer): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isNaN
    */
  def isNaN(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isNative
    */
  def isNative(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isNil
    */
  def isNil(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isNull
    */
  def isNull(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isNumber
    */
  def isNumber(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isObject
    */
  def isObject(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isObjectLike
    */
  def isObjectLike(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isPlainObject
    */
  def isPlainObject(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isRegExp
    */
  def isRegExp(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isSafeInteger
    */
  def isSafeInteger(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isSet
    */
  def isSet(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isString
    */
  def isString(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isSymbol
    */
  def isSymbol(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isTypedArray
    */
  def isTypedArray(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isUndefined
    */
  def isUndefined(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isWeakMap
    */
  def isWeakMap(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.isWeakSet
    */
  def isWeakSet(): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.kebabCase
    */
  def kebabCase(): StringChain = js.native
  
  /**
    * @see _.keys
    */
  def keys(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.keysIn
    */
  def keysIn(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.lowerCase
    */
  def lowerCase(): StringChain = js.native
  
  /**
    * @see _.lowerFirst
    */
  def lowerFirst(): StringChain = js.native
  
  /**
    * @see _.lt
    */
  def lt(other: Any): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.lte
    */
  def lte(other: Any): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.matches
    */
  def matches[V](): FunctionChain[js.Function1[/* value */ V, Boolean]] = js.native
  
  /**
    * @see _.matchesProperty
    */
  def matchesProperty[SrcValue](srcValue: SrcValue): FunctionChain[js.Function1[/* value */ Any, Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): FunctionChain[js.Function1[/* value */ Value, Boolean]] = js.native
  
  /**
    * @see _.mean
    */
  def mean(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.method
    */
  def method(args: Any*): FunctionChain[js.Function1[/* object */ Any, Any]] = js.native
  
  /**
    * @see _.methodOf
    */
  def methodOf(args: Any*): LoDashExplicitWrapper[js.Function1[/* path */ PropertyPath, Any]] = js.native
  
  /**
    * @see _.mixin
    */
  def mixin(): LoDashExplicitWrapper[LoDashStatic] = js.native
  def mixin(options: MixinOptions): LoDashExplicitWrapper[LoDashStatic] = js.native
  /**
    * @see _.mixin
    */
  def mixin(source: Dictionary[js.Function1[/* repeated */ Any, Any]]): this.type = js.native
  def mixin(source: Dictionary[js.Function1[/* repeated */ Any, Any]], options: MixinOptions): this.type = js.native
  
  /**
    * @see _.multiply
    */
  def multiply(multiplicand: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.noConflict
    */
  def noConflict(): LoDashExplicitWrapper[Typeoflodash] = js.native
  
  /**
    * @see _.noop
    */
  def noop(args: Any*): PrimitiveChain[Unit] = js.native
  
  /**
    * @see _.now
    */
  def now(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.nthArg
    */
  def nthArg(): FunctionChain[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.pad
    */
  def pad(): StringChain = js.native
  def pad(length: Double): StringChain = js.native
  def pad(length: Double, chars: java.lang.String): StringChain = js.native
  def pad(length: Unit, chars: java.lang.String): StringChain = js.native
  
  /**
    * @see _.padEnd
    */
  def padEnd(): StringChain = js.native
  def padEnd(length: Double): StringChain = js.native
  def padEnd(length: Double, chars: java.lang.String): StringChain = js.native
  def padEnd(length: Unit, chars: java.lang.String): StringChain = js.native
  
  /**
    * @see _.padStart
    */
  def padStart(): StringChain = js.native
  def padStart(length: Double): StringChain = js.native
  def padStart(length: Double, chars: java.lang.String): StringChain = js.native
  def padStart(length: Unit, chars: java.lang.String): StringChain = js.native
  
  /**
    * @see _.parseInt
    */
  def parseInt(): PrimitiveChain[Double] = js.native
  def parseInt(radix: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.plant
    */
  def plant(value: Any): this.type = js.native
  
  /**
    * @see _.property
    */
  def property[TObj, TResult](): FunctionChain[js.Function1[/* obj */ TObj, TResult]] = js.native
  
  /**
    * @see _.propertyOf
    */
  def propertyOf(): LoDashExplicitWrapper[js.Function1[/* path */ PropertyPath, Any]] = js.native
  
  /**
    * @see _.random
    */
  def random(): PrimitiveChain[Double] = js.native
  def random(floating: Boolean): PrimitiveChain[Double] = js.native
  /**
    * @see _.random
    */
  def random(max: Double): PrimitiveChain[Double] = js.native
  def random(max: Double, floating: Boolean): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.range
    */
  def range(): CollectionChain[Double] = js.native
  def range(end: Double): CollectionChain[Double] = js.native
  def range(end: Double, step: Double): CollectionChain[Double] = js.native
  def range(end: Unit, step: Double): CollectionChain[Double] = js.native
  
  /**
    * @see _.rangeRight
    */
  def rangeRight(): CollectionChain[Double] = js.native
  def rangeRight(end: Double): CollectionChain[Double] = js.native
  def rangeRight(end: Double, step: Double): CollectionChain[Double] = js.native
  def rangeRight(end: Unit, step: Double): CollectionChain[Double] = js.native
  
  /**
    * @see _.repeat
    */
  def repeat(): StringChain = js.native
  def repeat(n: Double): StringChain = js.native
  
  def replace(pattern: java.lang.String, replacement: java.lang.String): StringChain = js.native
  def replace(pattern: java.lang.String, replacement: ReplaceFunction): StringChain = js.native
  def replace(pattern: js.RegExp, replacement: java.lang.String): StringChain = js.native
  /**
    * @see _.replace
    */
  def replace(pattern: js.RegExp, replacement: ReplaceFunction): StringChain = js.native
  def replace(replacement: java.lang.String): StringChain = js.native
  /**
    * @see _.replace
    */
  def replace(replacement: ReplaceFunction): StringChain = js.native
  
  /**
    * @see _.result
    */
  def result[TResult](path: PropertyPath): ExpChain[TResult] = js.native
  def result[TResult](path: PropertyPath, defaultValue: TResult): ExpChain[TResult] = js.native
  def result[TResult](path: PropertyPath, defaultValue: js.Function1[/* repeated */ Any, TResult]): ExpChain[TResult] = js.native
  
  /**
    * @see _.reverse
    */
  def reverse(): this.type = js.native
  
  /**
    * @see _.round
    */
  def round(): PrimitiveChain[Double] = js.native
  def round(precision: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.set
    */
  def set(path: PropertyPath, value: Any): this.type = js.native
  
  /**
    * @see _.setWith
    */
  def setWith(path: PropertyPath, value: Any): this.type = js.native
  def setWith(path: PropertyPath, value: Any, customizer: SetWithCustomizer[TValue]): this.type = js.native
  /**
    * @see _.setWith
    */
  @JSName("setWith")
  def setWith_TResult_ExpChain[TResult](path: PropertyPath, value: Any): ExpChain[TResult] = js.native
  @JSName("setWith")
  def setWith_TResult_ExpChain[TResult](path: PropertyPath, value: Any, customizer: SetWithCustomizer[TValue]): ExpChain[TResult] = js.native
  
  /**
    * @see _.set
    */
  @JSName("set")
  def set_TResult_ExpChain[TResult](path: PropertyPath, value: Any): ExpChain[TResult] = js.native
  
  /**
    * @see _.size
    */
  def size(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.snakeCase
    */
  def snakeCase(): StringChain = js.native
  
  /**
    * @see _.split
    */
  def split(): CollectionChain[java.lang.String] = js.native
  def split(separator: java.lang.String): CollectionChain[java.lang.String] = js.native
  def split(separator: java.lang.String, limit: Double): CollectionChain[java.lang.String] = js.native
  def split(separator: js.RegExp): CollectionChain[java.lang.String] = js.native
  def split(separator: js.RegExp, limit: Double): CollectionChain[java.lang.String] = js.native
  def split(separator: Unit, limit: Double): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.startCase
    */
  def startCase(): StringChain = js.native
  
  /**
    * @see _.startsWith
    */
  def startsWith(): PrimitiveChain[Boolean] = js.native
  def startsWith(target: java.lang.String): PrimitiveChain[Boolean] = js.native
  def startsWith(target: java.lang.String, position: Double): PrimitiveChain[Boolean] = js.native
  def startsWith(target: Unit, position: Double): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.stubArray
    */
  def stubArray(): CollectionChain[Any] = js.native
  
  /**
    * @see _.stubFalse
    */
  def stubFalse(): PrimitiveChain[`false`] = js.native
  /**
    * @see _.stubFalse
    */
  @JSName("stubFalse")
  def stubFalse_LoDashExplicitWrapper(): LoDashExplicitWrapper[`false`] = js.native
  
  /**
    * @see _.stubObject
    */
  def stubObject(): LoDashExplicitWrapper[Any] = js.native
  
  /**
    * @see _.stubString
    */
  def stubString(): StringChain = js.native
  
  /**
    * @see _.stubTrue
    */
  def stubTrue(): PrimitiveChain[`true`] = js.native
  /**
    * @see _.stubTrue
    */
  @JSName("stubTrue")
  def stubTrue_LoDashExplicitWrapper(): LoDashExplicitWrapper[`true`] = js.native
  
  /**
    * @see _.subtract
    */
  def subtract(subtrahend: Double): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.sum
    */
  def sum(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.tap
    */
  def tap(interceptor: js.Function1[/* value */ TValue, Unit]): this.type = js.native
  
  /**
    * @see _.template
    */
  def template(): FunctionChain[TemplateExecutor] = js.native
  def template(options: TemplateOptions): FunctionChain[TemplateExecutor] = js.native
  
  /**
    * @see _.thru
    */
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): ExpChain[TResult] = js.native
  
  /**
    * @see _.times
    */
  def times(): CollectionChain[Double] = js.native
  /**
    * @see _.times
    */
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult]): CollectionChain[TResult] = js.native
  
  /**
    * @see _.toFinite
    */
  def toFinite(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.toInteger
    */
  def toInteger(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.toJSON
    */
  def toJSON(): TValue = js.native
  
  /**
    * @see _.toLength
    */
  def toLength(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.toLower
    */
  def toLower(): StringChain = js.native
  
  /**
    * @see _.toNumber
    */
  def toNumber(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.toPairs
    */
  def toPairs(): CollectionChain[
    js.Tuple2[
      java.lang.String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TValue extends lodash.lodash.Dictionary<infer U> ? U : TValue extends lodash.lodash.NumericDictionary<infer V> ? V : any */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.toPairsIn
    */
  def toPairsIn(): CollectionChain[
    js.Tuple2[
      java.lang.String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TValue extends lodash.lodash.Dictionary<infer U> ? U : TValue extends lodash.lodash.NumericDictionary<infer V> ? V : any */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.toPath
    */
  def toPath(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.toPlainObject
    */
  def toPlainObject(): ObjectChain[Any] = js.native
  
  /**
    * @see _.toSafeInteger
    */
  def toSafeInteger(): PrimitiveChain[Double] = js.native
  
  /**
    * @see _.toUpper
    */
  def toUpper(): StringChain = js.native
  
  /**
    * @see _.trim
    */
  def trim(): StringChain = js.native
  def trim(chars: java.lang.String): StringChain = js.native
  
  /**
    * @see _.trimEnd
    */
  def trimEnd(): StringChain = js.native
  def trimEnd(chars: java.lang.String): StringChain = js.native
  
  /**
    * @see _.trimStart
    */
  def trimStart(): StringChain = js.native
  def trimStart(chars: java.lang.String): StringChain = js.native
  
  /**
    * @see _.truncate
    */
  def truncate(): StringChain = js.native
  def truncate(options: TruncateOptions): StringChain = js.native
  
  /**
    * @see _.unescape
    */
  def unescape(): StringChain = js.native
  
  /**
    * @see _.uniqueId
    */
  def uniqueId(): StringChain = js.native
  
  /**
    * @see _.unset
    */
  def unset(path: PropertyPath): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.update
    */
  def update(path: PropertyPath, updater: js.Function1[/* value */ Any, Any]): ObjectChain[Any] = js.native
  
  /**
    * @see _.upperCase
    */
  def upperCase(): StringChain = js.native
  
  /**
    * @see _.upperFirst
    */
  def upperFirst(): StringChain = js.native
  
  /**
    * @see _.value
    */
  def value(): TValue = js.native
  
  /**
    * @see _.words
    */
  def words(): CollectionChain[java.lang.String] = js.native
  def words(pattern: java.lang.String): CollectionChain[java.lang.String] = js.native
  def words(pattern: js.RegExp): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.wrap
    */
  def wrap[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ TArgs, TResult]): FunctionChain[js.Function1[/* repeated */ TArgs, TResult]] = js.native
}
