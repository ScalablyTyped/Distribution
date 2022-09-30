package typings.lodash.mod

import typings.lodash.anon.Typeoflodash
import typings.lodash.lodashBooleans.`false`
import typings.lodash.lodashBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prototype.commit
// prototype.plant
// prototype.reverse
// prototype.toJSON
// prototype.value
// prototype.valueOf
@js.native
trait LoDashImplicitWrapper[TValue] extends StObject {
  
  /**
    * @see _.add
    */
  def add(addend: Double): Double = js.native
  
  /**
    * @see _.attempt
    */
  def attempt[TResult](args: Any*): TResult | js.Error = js.native
  
  /**
    * @see _.bind
    */
  def bind(thisArg: Any, partials: Any*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.bindAll
    */
  def bindAll(methodNames: Many[java.lang.String]*): this.type = js.native
  
  /**
    * @see _.bindKey
    */
  def bindKey(key: java.lang.String, partials: Any*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.camelCase
    */
  def camelCase(): java.lang.String = js.native
  
  /**
    * @see _.capitalize
    */
  def capitalize(): java.lang.String = js.native
  
  /**
    * @see _.ceil
    */
  def ceil(): Double = js.native
  def ceil(precision: Double): Double = js.native
  
  /**
    * @see _.clamp
    */
  def clamp(lower: Double, upper: Double): Double = js.native
  /**
    * @see _.clamp
    */
  def clamp(upper: Double): Double = js.native
  
  /**
    * @see _.cloneDeep
    */
  def cloneDeep(): TValue = js.native
  
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(): TValue = js.native
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(customizer: CloneDeepWithCustomizer[TValue]): Any = js.native
  
  /**
    * @see _.cloneWith
    */
  def cloneWith(): TValue = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith[TResult /* <: js.Object | java.lang.String | Double | Boolean | Null */](customizer: CloneWithCustomizer[TValue, TResult]): TResult = js.native
  /**
    * @see _.cloneWith
    */
  @JSName("cloneWith")
  def cloneWith_TResult_Union[TResult](customizer: CloneWithCustomizer[TValue, js.UndefOr[TResult]]): TResult | TValue = js.native
  
  /**
    * @see _.commit
    */
  def commit(): this.type = js.native
  
  /**
    * @see _.conforms
    */
  def conforms(): Function[js.Function1[/* value */ ConformsPredicateObject[TValue], Boolean]] = js.native
  
  /**
    * @see _.conformsTo
    */
  def conformsTo(source: ConformsPredicateObject[TValue]): Boolean = js.native
  
  /**
    * @see _.constant
    */
  def constant(): Function[js.Function0[TValue]] = js.native
  
  /**
    * @see _.deburr
    */
  def deburr(): java.lang.String = js.native
  
  /**
    * @see _.defaultTo
    */
  def defaultTo(defaultValue: TValue): TValue = js.native
  /**
    * @see _.defaultTo
    */
  @JSName("defaultTo")
  def defaultTo_TDefault_Union[TDefault](defaultValue: TDefault): TValue | TDefault = js.native
  
  /**
    * @see _.defer
    */
  def defer(args: Any*): Primitive[Double] = js.native
  
  /**
    * @see _.delay
    */
  def delay(wait: Double, args: Any*): Primitive[Double] = js.native
  
  /**
    * @see _.divide
    */
  def divide(divisor: Double): Double = js.native
  
  /**
    * @see _.endsWith
    */
  def endsWith(): Boolean = js.native
  def endsWith(target: java.lang.String): Boolean = js.native
  def endsWith(target: java.lang.String, position: Double): Boolean = js.native
  def endsWith(target: Unit, position: Double): Boolean = js.native
  
  /**
    * @see _.entries
    */
  def entries(): Collection[js.Tuple2[java.lang.String, Any]] = js.native
  
  /**
    * @see _.entriesIn
    */
  def entriesIn(): Collection[js.Tuple2[java.lang.String, Any]] = js.native
  
  /**
    * @see _.escape
    */
  def escape(): java.lang.String = js.native
  
  /**
    * @see _.escapeRegExp
    */
  def escapeRegExp(): java.lang.String = js.native
  
  /**
    * @see _.findKey
    */
  def findKey(): js.UndefOr[java.lang.String] = js.native
  def findKey(predicate: ObjectIteratee[TValue]): js.UndefOr[java.lang.String] = js.native
  
  /**
    * @see _.findLastKey
    */
  def findLastKey(): js.UndefOr[java.lang.String] = js.native
  def findLastKey(predicate: ObjectIteratee[TValue]): js.UndefOr[java.lang.String] = js.native
  
  /**
    * @see _.floor
    */
  def floor(): Double = js.native
  def floor(precision: Double): Double = js.native
  
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
  def functions(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.functionsIn
    */
  def functionsIn(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.gt
    */
  def gt(other: Any): Boolean = js.native
  
  /**
    * @see _.gte
    */
  def gte(other: Any): Boolean = js.native
  
  /**
    * @see _.has
    */
  def has(path: PropertyPath): Boolean = js.native
  
  /**
    * @see _.hasIn
    */
  def hasIn(path: PropertyPath): Boolean = js.native
  
  /**
    * @see _.identity
    */
  def identity(): TValue = js.native
  
  /**
    * @see _.inRange
    */
  def inRange(start: Double): Boolean = js.native
  def inRange(start: Double, end: Double): Boolean = js.native
  
  /**
    * @see _.invert
    */
  def invert(): Object[Dictionary[java.lang.String]] = js.native
  
  /**
    * @see _.invoke
    */
  def invoke(path: PropertyPath, args: Any*): Any = js.native
  
  /**
    * @see _.invokeMap
    */
  def invokeMap(methodName: java.lang.String, args: Any*): Collection[Any] = js.native
  /**
    * @see _.invokeMap
    */
  def invokeMap[TResult](method: js.Function1[/* repeated */ Any, TResult], args: Any*): Collection[TResult] = js.native
  
  /**
    * @see _.isArguments
    */
  def isArguments(): Boolean = js.native
  
  /**
    * @see _.isArray
    */
  def isArray(): Boolean = js.native
  
  /**
    * @see _.isArrayBuffer
    */
  def isArrayBuffer(): Boolean = js.native
  
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(): Boolean = js.native
  
  /**
    * @see _.isArrayLikeObject
    */
  def isArrayLikeObject(): Boolean = js.native
  
  /**
    * @see _.isBoolean
    */
  def isBoolean(): Boolean = js.native
  
  /**
    * @see _.isBuffer
    */
  def isBuffer(): Boolean = js.native
  
  /**
    * @see _.isDate
    */
  def isDate(): Boolean = js.native
  
  /**
    * @see _.isElement
    */
  def isElement(): Boolean = js.native
  
  /**
    * @see _.isEmpty
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * @see _.isEqual
    */
  def isEqual(other: Any): Boolean = js.native
  
  /**
    * @see _.isEqualWith
    */
  def isEqualWith(other: Any): Boolean = js.native
  def isEqualWith(other: Any, customizer: IsEqualCustomizer): Boolean = js.native
  
  /**
    * @see _.isError
    */
  def isError(): Boolean = js.native
  
  /**
    * @see _.isFinite
    */
  def isFinite(): Boolean = js.native
  
  /**
    * @see _.isFunction
    */
  def isFunction(): Boolean = js.native
  
  /**
    * @see _.isInteger
    */
  def isInteger(): Boolean = js.native
  
  /**
    * @see _.isLength
    */
  def isLength(): Boolean = js.native
  
  /**
    * @see _.isMap
    */
  def isMap(): Boolean = js.native
  
  /**
    * @see _.isMatch
    */
  def isMatch(source: js.Object): Boolean = js.native
  
  /**
    * @see _.isMatchWith
    */
  def isMatchWith(source: js.Object, customizer: isMatchWithCustomizer): Boolean = js.native
  
  /**
    * @see _.isNaN
    */
  def isNaN(): Boolean = js.native
  
  /**
    * @see _.isNative
    */
  def isNative(): Boolean = js.native
  
  /**
    * @see _.isNil
    */
  def isNil(): Boolean = js.native
  
  /**
    * @see _.isNull
    */
  def isNull(): Boolean = js.native
  
  /**
    * @see _.isNumber
    */
  def isNumber(): Boolean = js.native
  
  /**
    * @see _.isObject
    */
  def isObject(): /* is lodash.lodash.LoDashImplicitWrapper<object> */ Boolean = js.native
  
  /**
    * @see _.isObjectLike
    */
  def isObjectLike(): Boolean = js.native
  
  /**
    * @see _.isPlainObject
    */
  def isPlainObject(): Boolean = js.native
  
  /**
    * @see _.isRegExp
    */
  def isRegExp(): Boolean = js.native
  
  /**
    * @see _.isSafeInteger
    */
  def isSafeInteger(): Boolean = js.native
  
  /**
    * @see _.isSet
    */
  def isSet(): Boolean = js.native
  
  /**
    * @see _.isString
    */
  def isString(): Boolean = js.native
  
  /**
    * @see _.isSymbol
    */
  def isSymbol(): Boolean = js.native
  
  /**
    * @see _.isTypedArray
    */
  def isTypedArray(): Boolean = js.native
  
  /**
    * @see _.isUndefined
    */
  def isUndefined(): Boolean = js.native
  
  /**
    * @see _.isWeakMap
    */
  def isWeakMap(): Boolean = js.native
  
  /**
    * @see _.isWeakSet
    */
  def isWeakSet(): Boolean = js.native
  
  /**
    * @see _.kebabCase
    */
  def kebabCase(): java.lang.String = js.native
  
  /**
    * @see _.keys
    */
  def keys(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.keysIn
    */
  def keysIn(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.lowerCase
    */
  def lowerCase(): java.lang.String = js.native
  
  /**
    * @see _.lowerFirst
    */
  def lowerFirst(): java.lang.String = js.native
  
  /**
    * @see _.lt
    */
  def lt(other: Any): Boolean = js.native
  
  /**
    * @see _.lte
    */
  def lte(other: Any): Boolean = js.native
  
  /**
    * @see _.matches
    */
  def matches[V](): Function[js.Function1[/* value */ V, Boolean]] = js.native
  
  /**
    * @see _.matchesProperty
    */
  def matchesProperty[SrcValue](srcValue: SrcValue): Function[js.Function1[/* value */ Any, Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): Function[js.Function1[/* value */ Value, Boolean]] = js.native
  
  /**
    * @see _.mean
    */
  def mean(): Double = js.native
  
  /**
    * @see _.method
    */
  def method(args: Any*): Function[js.Function1[/* object */ Any, Any]] = js.native
  
  /**
    * @see _.methodOf
    */
  def methodOf(args: Any*): LoDashImplicitWrapper[js.Function1[/* path */ PropertyPath, Any]] = js.native
  
  /**
    * @see _.mixin
    */
  def mixin(): LoDashImplicitWrapper[LoDashStatic] = js.native
  def mixin(options: MixinOptions): LoDashImplicitWrapper[LoDashStatic] = js.native
  /**
    * @see _.mixin
    */
  def mixin(source: Dictionary[js.Function1[/* repeated */ Any, Any]]): this.type = js.native
  def mixin(source: Dictionary[js.Function1[/* repeated */ Any, Any]], options: MixinOptions): this.type = js.native
  
  /**
    * @see _.multiply
    */
  def multiply(multiplicand: Double): Double = js.native
  
  /**
    * @see _.noConflict
    */
  def noConflict(): Typeoflodash = js.native
  
  /**
    * @see _.noop
    */
  def noop(args: Any*): Unit = js.native
  
  /**
    * @see _.now
    */
  def now(): Double = js.native
  
  /**
    * @see _.nthArg
    */
  def nthArg(): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.pad
    */
  def pad(): java.lang.String = js.native
  def pad(length: Double): java.lang.String = js.native
  def pad(length: Double, chars: java.lang.String): java.lang.String = js.native
  def pad(length: Unit, chars: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.padEnd
    */
  def padEnd(): java.lang.String = js.native
  def padEnd(length: Double): java.lang.String = js.native
  def padEnd(length: Double, chars: java.lang.String): java.lang.String = js.native
  def padEnd(length: Unit, chars: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.padStart
    */
  def padStart(): java.lang.String = js.native
  def padStart(length: Double): java.lang.String = js.native
  def padStart(length: Double, chars: java.lang.String): java.lang.String = js.native
  def padStart(length: Unit, chars: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.parseInt
    */
  def parseInt(): Double = js.native
  def parseInt(radix: Double): Double = js.native
  
  /**
    * @see _.plant
    */
  def plant(value: Any): this.type = js.native
  
  /**
    * @see _.property
    */
  def property[TObj, TResult](): Function[js.Function1[/* obj */ TObj, TResult]] = js.native
  
  /**
    * @see _.propertyOf
    */
  def propertyOf(): LoDashImplicitWrapper[js.Function1[/* path */ PropertyPath, Any]] = js.native
  
  /**
    * @see _.random
    */
  def random(): Double = js.native
  def random(floating: Boolean): Double = js.native
  /**
    * @see _.random
    */
  def random(max: Double): Double = js.native
  def random(max: Double, floating: Boolean): Double = js.native
  
  /**
    * @see _.range
    */
  def range(): Collection[Double] = js.native
  def range(end: Double): Collection[Double] = js.native
  def range(end: Double, step: Double): Collection[Double] = js.native
  def range(end: Unit, step: Double): Collection[Double] = js.native
  
  /**
    * @see _.rangeRight
    */
  def rangeRight(): Collection[Double] = js.native
  def rangeRight(end: Double): Collection[Double] = js.native
  def rangeRight(end: Double, step: Double): Collection[Double] = js.native
  def rangeRight(end: Unit, step: Double): Collection[Double] = js.native
  
  /**
    * @see _.repeat
    */
  def repeat(): java.lang.String = js.native
  def repeat(n: Double): java.lang.String = js.native
  
  def replace(pattern: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def replace(pattern: java.lang.String, replacement: ReplaceFunction): java.lang.String = js.native
  def replace(pattern: js.RegExp, replacement: java.lang.String): java.lang.String = js.native
  /**
    * @see _.replace
    */
  def replace(pattern: js.RegExp, replacement: ReplaceFunction): java.lang.String = js.native
  def replace(replacement: java.lang.String): java.lang.String = js.native
  /**
    * @see _.replace
    */
  def replace(replacement: ReplaceFunction): java.lang.String = js.native
  
  /**
    * @see _.result
    */
  def result[TResult](path: PropertyPath): TResult = js.native
  def result[TResult](path: PropertyPath, defaultValue: TResult): TResult = js.native
  def result[TResult](path: PropertyPath, defaultValue: js.Function1[/* repeated */ Any, TResult]): TResult = js.native
  
  /**
    * @see _.reverse
    */
  def reverse(): this.type = js.native
  
  /**
    * @see _.round
    */
  def round(): Double = js.native
  def round(precision: Double): Double = js.native
  
  /**
    * @see _.runInContext
    */
  def runInContext(): LoDashStatic = js.native
  
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
  def setWith_TResult_ImpChain[TResult](path: PropertyPath, value: Any): ImpChain[TResult] = js.native
  @JSName("setWith")
  def setWith_TResult_ImpChain[TResult](path: PropertyPath, value: Any, customizer: SetWithCustomizer[TValue]): ImpChain[TResult] = js.native
  
  /**
    * @see _.set
    */
  @JSName("set")
  def set_TResult_ImpChain[TResult](path: PropertyPath, value: Any): ImpChain[TResult] = js.native
  
  /**
    * @see _.size
    */
  def size(): Double = js.native
  
  /**
    * @see _.snakeCase
    */
  def snakeCase(): java.lang.String = js.native
  
  /**
    * @see _.split
    */
  def split(): Collection[java.lang.String] = js.native
  def split(separator: java.lang.String): Collection[java.lang.String] = js.native
  def split(separator: java.lang.String, limit: Double): Collection[java.lang.String] = js.native
  def split(separator: js.RegExp): Collection[java.lang.String] = js.native
  def split(separator: js.RegExp, limit: Double): Collection[java.lang.String] = js.native
  def split(separator: Unit, limit: Double): Collection[java.lang.String] = js.native
  
  /**
    * @see _.startCase
    */
  def startCase(): java.lang.String = js.native
  
  /**
    * @see _.startsWith
    */
  def startsWith(): Boolean = js.native
  def startsWith(target: java.lang.String): Boolean = js.native
  def startsWith(target: java.lang.String, position: Double): Boolean = js.native
  def startsWith(target: Unit, position: Double): Boolean = js.native
  
  /**
    * @see _.stubArray
    */
  def stubArray(): js.Array[Any] = js.native
  
  /**
    * @see _.stubFalse
    */
  def stubFalse(): `false` = js.native
  
  /**
    * @see _.stubObject
    */
  def stubObject(): Any = js.native
  
  /**
    * @see _.stubString
    */
  def stubString(): java.lang.String = js.native
  
  /**
    * @see _.stubTrue
    */
  def stubTrue(): `true` = js.native
  
  /**
    * @see _.subtract
    */
  def subtract(subtrahend: Double): Double = js.native
  
  /**
    * @see _.sum
    */
  def sum(): Double = js.native
  
  /**
    * @see _.tap
    */
  def tap(interceptor: js.Function1[/* value */ TValue, Unit]): this.type = js.native
  
  /**
    * @see _.template
    */
  def template(): TemplateExecutor = js.native
  def template(options: TemplateOptions): TemplateExecutor = js.native
  
  /**
    * @see _.thru
    */
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): ImpChain[TResult] = js.native
  
  /**
    * @see _.times
    */
  def times(): js.Array[Double] = js.native
  /**
    * @see _.times
    */
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult]): js.Array[TResult] = js.native
  
  /**
    * @see _.toFinite
    */
  def toFinite(): Double = js.native
  
  /**
    * @see _.toInteger
    */
  def toInteger(): Double = js.native
  
  /**
    * @see _.toJSON
    */
  def toJSON(): TValue = js.native
  
  /**
    * @see _.toLength
    */
  def toLength(): Double = js.native
  
  /**
    * @see _.toLower
    */
  def toLower(): java.lang.String = js.native
  
  /**
    * @see _.toNumber
    */
  def toNumber(): Double = js.native
  
  /**
    * @see _.toPairs
    */
  def toPairs(): Collection[js.Tuple2[java.lang.String, Any]] = js.native
  
  /**
    * @see _.toPairsIn
    */
  def toPairsIn(): Collection[js.Tuple2[java.lang.String, Any]] = js.native
  
  /**
    * @see _.toPath
    */
  def toPath(): Collection[java.lang.String] = js.native
  
  /**
    * @see _.toPlainObject
    */
  def toPlainObject(): Object[Any] = js.native
  
  /**
    * @see _.toSafeInteger
    */
  def toSafeInteger(): Double = js.native
  
  /**
    * @see _.toUpper
    */
  def toUpper(): java.lang.String = js.native
  
  /**
    * @see _.trim
    */
  def trim(): java.lang.String = js.native
  def trim(chars: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.trimEnd
    */
  def trimEnd(): java.lang.String = js.native
  def trimEnd(chars: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.trimStart
    */
  def trimStart(): java.lang.String = js.native
  def trimStart(chars: java.lang.String): java.lang.String = js.native
  
  /**
    * @see _.truncate
    */
  def truncate(): java.lang.String = js.native
  def truncate(options: TruncateOptions): java.lang.String = js.native
  
  /**
    * @see _.unescape
    */
  def unescape(): java.lang.String = js.native
  
  /**
    * @see _.uniqueId
    */
  def uniqueId(): java.lang.String = js.native
  
  /**
    * @see _.unset
    */
  def unset(path: PropertyPath): Primitive[Boolean] = js.native
  
  /**
    * @see _.update
    */
  def update(path: PropertyPath, updater: js.Function1[/* value */ Any, Any]): Object[Any] = js.native
  
  /**
    * @see _.upperCase
    */
  def upperCase(): java.lang.String = js.native
  
  /**
    * @see _.upperFirst
    */
  def upperFirst(): java.lang.String = js.native
  
  /**
    * @see _.value
    */
  def value(): TValue = js.native
  
  /**
    * @see _.words
    */
  def words(): Collection[java.lang.String] = js.native
  def words(pattern: java.lang.String): Collection[java.lang.String] = js.native
  def words(pattern: js.RegExp): Collection[java.lang.String] = js.native
  
  /**
    * @see _.wrap
    */
  def wrap[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ TArgs, TResult]): Function[js.Function1[/* repeated */ TArgs, TResult]] = js.native
}
