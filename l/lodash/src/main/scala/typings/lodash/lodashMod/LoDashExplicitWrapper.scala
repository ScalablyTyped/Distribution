package typings.lodash.lodashMod

import typings.lodash.Typeoflodash
import typings.lodash.lodashNumbers.`0`
import typings.lodash.lodashNumbers.`false`
import typings.lodash.lodashNumbers.`true`
import typings.lodash.lodashStrings.Empty
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.std.Error
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Pick
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoDashExplicitWrapper[TValue] extends LoDashWrapper[TValue] {
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  var partialRight_Original: ExplicitPartialRight = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  var partial_Original: ExplicitPartial = js.native
  /**
    * @see _.add
    */
  def add(addend: Double): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.after
    **/
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashExplicitWrapper[TFunc] = js.native
  /**
    * @see _.ary
    */
  def ary(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def ary(n: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.assign
    */
  def assign(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assign
    */
  def assign(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.at
    */
  def at[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], props: Many[String]*): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.at
    */
  @JSName("at")
  def at_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    props: PropertyPath*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.attempt
    */
  def attempt[TResult](args: js.Any*): LoDashExplicitWrapper[TResult | Error] = js.native
  /**
    * @see _.before
    **/
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashExplicitWrapper[TFunc] = js.native
  /**
    * @see _.bind
    */
  def bind(thisArg: js.Any, partials: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.bindKey
    */
  def bindKey(key: String, partials: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.camelCase
    */
  def camelCase(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.capitalize
    */
  def capitalize(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.castArray
    */
  def castArray[T](`this`: LoDashExplicitWrapper[Many[T]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.ceil
    */
  def ceil(): LoDashExplicitWrapper[Double] = js.native
  def ceil(precision: Double): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.chain
    */
  def chain(): this.type = js.native
  /**
    * @see _.chunk
    */
  def chunk[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  def chunk[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], size: Double): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.clamp
    */
  def clamp(lower: Double, upper: Double): LoDashExplicitWrapper[Double] = js.native
  def clamp(upper: Double): LoDashExplicitWrapper[Double] = js.native
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
  def cloneDeepWith(customizer: CloneDeepWithCustomizer[TValue]): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith(): this.type = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith[TResult](customizer: CloneWithCustomizer[TValue, js.UndefOr[TResult]]): LoDashExplicitWrapper[TResult | TValue] = js.native
  /**
    * @see _.cloneWith
    */
  @JSName("cloneWith")
  def cloneWith_TResult_UnionObjectStringDoubleBooleanNull[TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[TValue, TResult]): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.compact
    */
  def compact[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[(List[js.UndefOr[T | Null | `false` | Empty | `0`]]) | Null]]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.compact
    */
  def concat[T](`this`: LoDashExplicitWrapper[Many[T]], values: Many[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.conforms
    */
  def conforms[T](`this`: LoDashExplicitWrapper[ConformsPredicateObject[T]]): LoDashExplicitWrapper[js.Function1[/* value */ T, Boolean]] = js.native
  /**
    * @see _.conformsTo
    */
  def conformsTo[T](`this`: LoDashExplicitWrapper[T], source: ConformsPredicateObject[T]): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.constant
    */
  def constant(): LoDashExplicitWrapper[js.Function0[TValue]] = js.native
  /**
    * @see _.countBy
    */
  def countBy[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  def countBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  /**
    * @see _.countBy
    */
  @JSName("countBy")
  def countBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  @JSName("countBy")
  def countBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  /**
    * @see _.create
    */
  def create[U /* <: js.Object */](): LoDashExplicitWrapper[TValue with U] = js.native
  def create[U /* <: js.Object */](properties: U): LoDashExplicitWrapper[TValue with U] = js.native
  /**
    * @see _.curry
    **/
  def curry(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curry(arity: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.curry
    **/
  def curry[T1, R](`this`: LoDashExplicitWrapper[js.Function1[/* t1 */ T1, R]]): LoDashExplicitWrapper[CurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curryRight
    **/
  def curryRight(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curryRight(arity: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.curryRight
    **/
  def curryRight[T1, R](`this`: LoDashExplicitWrapper[js.Function1[/* t1 */ T1, R]]): LoDashExplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  def curryRight[T1, R](`this`: LoDashExplicitWrapper[js.Function1[/* t1 */ T1, R]], arity: Double): LoDashExplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashExplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashExplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashExplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]], arity: Double): LoDashExplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashExplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](
    `this`: LoDashExplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]],
    arity: Double
  ): LoDashExplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]): LoDashExplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]],
    arity: Double
  ): LoDashExplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashExplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]],
    arity: Double
  ): LoDashExplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](`this`: LoDashExplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashExplicitWrapper[CurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashExplicitWrapper[CurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]): LoDashExplicitWrapper[CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashExplicitWrapper[CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  /**
    * @see _.debounce
    */
  def debounce(): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: Double): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: Double, options: DebounceSettings): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  /**
    * @see _.deburr
    */
  def deburr(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.defaultTo
    */
  def defaultTo[T](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], defaultValue: T): LoDashExplicitWrapper[T] = js.native
  /**
    * @see _.defaultTo
    */
  @JSName("defaultTo")
  def defaultTo_TTDefault[T, TDefault](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], defaultValue: TDefault): LoDashExplicitWrapper[T | TDefault] = js.native
  /**
    * @see _.defaults
    */
  def defaults(): LoDashExplicitWrapper[NonNullable[TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults(sources: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource](source: TSource): LoDashExplicitWrapper[NonNullable[TSource with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[NonNullable[TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[NonNullable[TSource3 with TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[NonNullable[TSource4 with TSource3 with TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaultsDeep
    **/
  def defaultsDeep(sources: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.defer
    */
  def defer(args: js.Any*): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.delay
    */
  def delay(wait: Double, args: js.Any*): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.difference
    */
  def difference[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    iteratee: ValueIteratee[T1 | T2]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    iteratee: ValueIteratee[T1 | T2 | T3]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    values: (List[T7] | (ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    comparator: Comparator2[T1, T2]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3, T4](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.divide
    */
  def divide(divisor: Double): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.drop
    */
  def drop[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def drop[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropRight
    */
  def dropRight[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def dropRight[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropRightWhile
    */
  def dropRightWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropWhile
    */
  def dropWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def dropWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.endsWith
    */
  def endsWith(): LoDashExplicitWrapper[Boolean] = js.native
  def endsWith(target: String): LoDashExplicitWrapper[Boolean] = js.native
  def endsWith(target: String, position: Double): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.toPairs
    */
  def entries(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.toPairs
    */
  def entries[T](`this`: LoDashExplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.entriesIn
    */
  def entriesIn(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.entriesIn
    */
  def entriesIn[T](`this`: LoDashExplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.eq
    */
  def eq(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.escape
    */
  def escape(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.escapeRegExp
    */
  def escapeRegExp(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.every
    */
  def every[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[Boolean] = js.native
  def every[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.every
    */
  @JSName("every")
  def every_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Boolean] = js.native
  @JSName("every")
  def every_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.extend
    */
  def extend(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.extend
    */
  def extend(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.fill
    */
  def fill[T](`this`: LoDashExplicitWrapper[js.UndefOr[js.Array[_] | List[_] | Null]], value: T): LoDashExplicitWrapper[js.Array[T]] = js.native
  def fill[T, U](`this`: LoDashExplicitWrapper[js.UndefOr[js.Array[U] | List[U] | Null]], value: T, start: Double): LoDashExplicitWrapper[js.Array[T | U]] = js.native
  def fill[T, U](
    `this`: LoDashExplicitWrapper[js.UndefOr[js.Array[U] | List[U] | Null]],
    value: T,
    start: Double,
    end: Double
  ): LoDashExplicitWrapper[js.Array[T | U]] = js.native
  /**
    * @see _.fill
    */
  @JSName("fill")
  def fill_TU[T, U](`this`: LoDashExplicitWrapper[js.UndefOr[js.Array[U] | List[U] | Null]], value: T): LoDashExplicitWrapper[js.Array[T | U]] = js.native
  /**
    * @see _.filter
    */
  def filter(`this`: LoDashExplicitWrapper[js.UndefOr[String | Null]]): LoDashExplicitWrapper[js.Array[String]] = js.native
  def filter(`this`: LoDashExplicitWrapper[js.UndefOr[String | Null]], predicate: StringIterator[Boolean]): LoDashExplicitWrapper[js.Array[String]] = js.native
  def filter[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  @JSName("filter")
  def filter_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.Array[S]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T_Object[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.Array[S]] = js.native
  /**
    * @see _.find
    */
  def find[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def find[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def find[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIterateeCustom[T, Boolean],
    fromIndex: Double
  ): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.find
    */
  def find[T, S /* <: T */](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  def find[T, S /* <: T */](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIteratorTypeGuard[T, S],
    fromIndex: Double
  ): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  /**
    * @see _.findIndex
    */
  def findIndex[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Double] = js.native
  def findIndex[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[Double] = js.native
  def findIndex[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.findKey
    */
  def findKey[T](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  def findKey[T](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratee[T]): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def findLast[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def findLast[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIterateeCustom[T, Boolean],
    fromIndex: Double
  ): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T, S /* <: T */](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  def findLast[T, S /* <: T */](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIteratorTypeGuard[T, S],
    fromIndex: Double
  ): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  /**
    * @see _.findLastIndex
    */
  def findLastIndex[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Double] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[Double] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.findLastKey
    */
  def findLastKey[T](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  def findLastKey[T](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratee[T]): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  @JSName("findLast")
  def findLast_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  @JSName("findLast")
  def findLast_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  @JSName("findLast")
  def findLast_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIteratorTypeGuard[T, S],
    fromIndex: Double
  ): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  @JSName("find")
  def find_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  @JSName("find")
  def find_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIteratorTypeGuard[T, S],
    fromIndex: Double
  ): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  /**
    * @see _.head
    */
  def first[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: String): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Object): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T](
    `this`: LoDashExplicitWrapper[
      js.UndefOr[List[Many[T]] | Dictionary[Many[T]] | NumericDictionary[Many[T]] | Null]
    ]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T /* <: js.Object */, TResult](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, Many[TResult]]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(`this`: LoDashExplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: String): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(`this`: LoDashExplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: js.Object): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T](
    `this`: LoDashExplicitWrapper[
      js.UndefOr[
        (List[ListOfRecursiveArraysOrValues[T] | T]) | (Dictionary[ListOfRecursiveArraysOrValues[T] | T]) | (NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]) | Null
      ]
    ]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDeep
    */
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(`this`: LoDashExplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: String): LoDashExplicitWrapper[js.Array[_]] = js.native
  def flatMapDepth(`this`: LoDashExplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: String, depth: Double): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(`this`: LoDashExplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: js.Object): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  def flatMapDepth(`this`: LoDashExplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: js.Object, depth: Double): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T](
    `this`: LoDashExplicitWrapper[
      js.UndefOr[
        (List[ListOfRecursiveArraysOrValues[T] | T]) | (Dictionary[ListOfRecursiveArraysOrValues[T] | T]) | (NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]) | Null
      ]
    ]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDepth
    */
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMap
    */
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, Many[TResult]]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatten
    */
  def flatten[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[Many[T]] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flattenDeep
    */
  def flattenDeep[T](`this`: LoDashExplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flattenDeep
    */
  def flattenDepth[T](`this`: LoDashExplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def flattenDepth[T](`this`: LoDashExplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | Null]], depth: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.floor
    */
  def floor(): LoDashExplicitWrapper[Double] = js.native
  def floor(precision: Double): LoDashExplicitWrapper[Double] = js.native
  def flow(
    `this`: LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]],
    funcs: js.Array[Many[js.Function1[/* a */ _, _]]]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flow
    */
  // 0-argument first function
  def flow[R1, R2](`this`: LoDashExplicitWrapper[js.Function0[R1]], f2: js.Function1[/* a */ R1, R2]): LoDashExplicitWrapper[js.Function0[R2]] = js.native
  def flow[R1, R2, R3](
    `this`: LoDashExplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitWrapper[js.Function0[R3]] = js.native
  def flow[R1, R2, R3, R4](
    `this`: LoDashExplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function0[R4]] = js.native
  def flow[R1, R2, R3, R4, R5](
    `this`: LoDashExplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function0[R5]] = js.native
  def flow[R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function0[R6]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function0[R7]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function0[_]] = js.native
  def flowRight(
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ _, _]],
    f6: js.Function1[/* a */ js.Any, _],
    f5: js.Function1[/* a */ js.Any, _],
    f4: js.Function1[/* a */ js.Any, _],
    f3: js.Function1[/* a */ js.Any, _],
    f2: js.Function1[/* a */ js.Any, _],
    f1: js.Function0[_],
    funcs: (Many[js.Function1[/* repeated */ _, _]])*
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def flowRight(
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ _, _]],
    funcs: js.Array[Many[js.Function1[/* repeated */ _, _]]]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flowRight
    */
  // 0-argument first function
  def flowRight[R2, R1](`this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function0[R1]): LoDashExplicitWrapper[js.Function0[R2]] = js.native
  // any-argument first function
  def flowRight[R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R2]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R3]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R3]] = js.native
  // 2-argument first function
  def flowRight[A1, A2, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R4]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R4]] = js.native
  // 3-argument first function
  def flowRight[A1, A2, A3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  def flowRight[A1, A2, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R5]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R5]] = js.native
  // 4-argument first function
  def flowRight[A1, A2, A3, A4, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  def flowRight[A1, A2, A3, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  def flowRight[A1, A2, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R6]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  def flowRight[A1, A2, A3, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  def flowRight[A1, A2, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R7]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  def flowRight[A1, A2, A3, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  def flowRight[A1, A2, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  def flowRight[A1, A2, A3, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  def flowRight[A1, A2, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  def flowRight[A1, A2, A3, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  // 1-argument first function
  @JSName("flowRight")
  def flowRight_A1R2R1[A1, R2, R1](`this`: LoDashExplicitWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function1[/* a1 */ A1, R1]): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flowRight")
  def flowRight_A1R3R2R1[A1, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flowRight")
  def flowRight_A1R4R3R2R1[A1, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flowRight")
  def flowRight_A1R5R4R3R2R1[A1, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flowRight")
  def flowRight_A1R6R5R4R3R2R1[A1, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flowRight")
  def flowRight_A1R7R6R5R4R3R2R1[A1, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  // 4-argument first function
  // any-argument first function
  @JSName("flow")
  def flow_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    `this`: LoDashExplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    `this`: LoDashExplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    `this`: LoDashExplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _]] = js.native
  // 3-argument first function
  @JSName("flow")
  def flow_A1A2A3R1R2[A1, A2, A3, R1, R2](
    `this`: LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    `this`: LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    `this`: LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5[A1, A2, A3, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _]] = js.native
  // 2-argument first function
  @JSName("flow")
  def flow_A1A2R1R2[A1, A2, R1, R2](
    `this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3[A1, A2, R1, R2, R3](
    `this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    `this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5[A1, A2, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6[A1, A2, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, _]] = js.native
  // 1-argument first function
  @JSName("flow")
  def flow_A1R1R2[A1, R1, R2](`this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R1]], f2: js.Function1[/* a */ R1, R2]): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3[A1, R1, R2, R3](
    `this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4[A1, R1, R2, R3, R4](
    `this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5[A1, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6[A1, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, _]] = js.native
  /**
    @see _.fromPairs
    */
  def fromPairs(`this`: LoDashExplicitWrapper[js.UndefOr[List[js.Array[_]] | Null]]): LoDashExplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.fromPairs
    */
  @JSName("fromPairs")
  def fromPairs_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[(List[js.Tuple2[PropertyName, T]]) | Null]]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.functions
    */
  def functions(): LoDashExplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.functionsIn
    */
  def functionsIn(): LoDashExplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.get
    */
  def get(path: PropertyPath): LoDashExplicitWrapper[_] = js.native
  def get(path: PropertyPath, defaultValue: js.Any): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.get
    */
  def get(`this`: LoDashExplicitWrapper[js.UndefOr[Null]], path: PropertyPath): LoDashExplicitWrapper[js.UndefOr[scala.Nothing]] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: String */](path: TKey): LoDashExplicitWrapper[
    /* import warning: ImportType.apply Failed type conversion: TValue[TKey] */ js.Any
  ] = js.native
  def get[TKey /* <: String */](path: js.Array[TKey]): LoDashExplicitWrapper[
    /* import warning: ImportType.apply Failed type conversion: TValue[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[T](`this`: LoDashExplicitWrapper[js.UndefOr[Null | NumericDictionary[T]]], path: Double): LoDashExplicitWrapper[T] = js.native
  /**
    * @see _.get
    */
  def get[TDefault](`this`: LoDashExplicitWrapper[js.UndefOr[Null]], path: PropertyPath, defaultValue: TDefault): LoDashExplicitWrapper[TDefault] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TValue[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LoDashExplicitWrapper[
    /* import warning: ImportType.apply Failed type conversion: TValue[TKey1][TKey2] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: String */](`this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]], path: TKey): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
    ]
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: String */](`this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]], path: js.Array[TKey]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.get
    */
  def get[T, TDefault](
    `this`: LoDashExplicitWrapper[js.UndefOr[NumericDictionary[T] | Null]],
    path: Double,
    defaultValue: TDefault
  ): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TValue[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TValue[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LoDashExplicitWrapper[
    /* import warning: ImportType.apply Failed type conversion: TValue[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: String */, TDefault](`this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]], path: TKey, defaultValue: TDefault): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: String */, TDefault](
    `this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Array[TKey],
    defaultValue: TDefault
  ): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](`this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]], path: js.Tuple2[TKey1, TKey2]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TValue[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TValue[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TValue[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LoDashExplicitWrapper[
    /* import warning: ImportType.apply Failed type conversion: TValue[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](
    `this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Tuple2[TKey1, TKey2],
    defaultValue: TDefault
  ): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](`this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]], path: js.Tuple3[TKey1, TKey2, TKey3]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](
    `this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Tuple3[TKey1, TKey2, TKey3],
    defaultValue: TDefault
  ): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](
    `this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]
  ): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](
    `this`: LoDashExplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Tuple4[TKey1, TKey2, TKey3, TKey4],
    defaultValue: TDefault
  ): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.groupBy
    */
  def groupBy[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    Dictionary[
      js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ] = js.native
  def groupBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashExplicitWrapper[
    Dictionary[
      js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ] = js.native
  /**
    * @see _.groupBy
    */
  @JSName("groupBy")
  def groupBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Dictionary[js.Array[T]]] = js.native
  @JSName("groupBy")
  def groupBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Dictionary[js.Array[T]]] = js.native
  /**
    * @see _.gt
    */
  def gt(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.gte
    */
  def gte(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.has
    */
  def has(path: PropertyPath): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.hasIn
    */
  def hasIn(path: PropertyPath): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.head
    */
  def head[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.identity
    */
  def identity(): this.type = js.native
  /**
    * @see _.inRange
    */
  def inRange(start: Double): LoDashExplicitWrapper[Boolean] = js.native
  def inRange(start: Double, end: Double): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.includes
    */
  def includes[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    target: T
  ): LoDashExplicitWrapper[Boolean] = js.native
  def includes[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    target: T,
    fromIndex: Double
  ): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.indexOf
    */
  def indexOf[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T): LoDashExplicitWrapper[Double] = js.native
  def indexOf[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T, fromIndex: Double): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.initial
    */
  def initial[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersection
    */
  def intersection[T](`this`: LoDashExplicitWrapper[List[T]], arrays: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: (List[T2] | (ValueIteratee[T1 | T2]))*
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    iteratee: ValueIteratee[T1 | T2]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    iteratee: ValueIteratee[T1 | T2 | T3]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3, T4](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (ValueIteratee[T1 | T2 | T3 | T4]))*
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    comparator: Comparator2[T1, T2]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3, T4](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.invert
    */
  def invert(): LoDashExplicitWrapper[Dictionary[String]] = js.native
  /**
    * @see _.invertBy
    */
  def invertBy[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  def invertBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    interatee: ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  /**
    * @see _.invertBy
    */
  @JSName("invertBy")
  def invertBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  @JSName("invertBy")
  def invertBy_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    interatee: ValueIteratee[T]
  ): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  /**
    * @see _.invoke
    **/
  def invoke(path: PropertyPath, args: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap(methodName: String, args: js.Any*): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: js.Any*): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.isArguments
    */
  def isArguments(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isArray
    */
  def isArray(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isArrayBuffer
    */
  def isArrayBuffer(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isArrayLikeObject
    */
  def isArrayLikeObject(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isBoolean
    */
  def isBoolean(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isBuffer
    */
  def isBuffer(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isDate
    */
  def isDate(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isElement
    */
  def isElement(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isEmpty
    */
  def isEmpty(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isEqual
    */
  def isEqual(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isEqualWith
    */
  def isEqualWith(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  def isEqualWith(other: js.Any, customizer: IsEqualCustomizer): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isError
    */
  def isError(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isFinite
    */
  def isFinite(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isFunction
    */
  def isFunction(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isInteger
    */
  def isInteger(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isLength
    */
  def isLength(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isMap
    */
  def isMap(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isMatch
    */
  def isMatch(source: js.Object): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isMatchWith
    */
  def isMatchWith(source: js.Object, customizer: isMatchWithCustomizer): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isNaN
    */
  def isNaN(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isNative
    */
  def isNative(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isNil
    */
  def isNil(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isNull
    */
  def isNull(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isNumber
    */
  def isNumber(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isObject
    */
  def isObject(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isObjectLike
    */
  def isObjectLike(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isPlainObject
    */
  def isPlainObject(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isRegExp
    */
  def isRegExp(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isSafeInteger
    */
  def isSafeInteger(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isSet
    */
  def isSet(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isString
    */
  def isString(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isSymbol
    */
  def isSymbol(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isTypedArray
    */
  def isTypedArray(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * see _.isUndefined
    */
  def isUndefined(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isSet
    */
  def isWeakMap(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.isWeakSet
    */
  def isWeakSet(): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.iteratee
    */
  def iteratee[TFunction /* <: js.Function1[/* repeated */ js.Any, _] */](`this`: LoDashExplicitWrapper[TFunction | String | js.Object]): LoDashExplicitWrapper[TFunction] = js.native
  /**
    * @see _.join
    */
  def join(): LoDashExplicitWrapper[String] = js.native
  def join(separator: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.kebabCase
    */
  def kebabCase(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.keyBy
    */
  def keyBy[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def keyBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): LoDashExplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.keyBy
    */
  @JSName("keyBy")
  def keyBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  @JSName("keyBy")
  def keyBy_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ValueIterateeCustom[T, PropertyName]
  ): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.keys
    */
  def keys(): LoDashExplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.keysIn
    */
  def keysIn(): LoDashExplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.last
    */
  def last[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.indexOf
    */
  def lastIndexOf[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T): LoDashExplicitWrapper[Double] = js.native
  def lastIndexOf[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T, fromIndex: Double): LoDashExplicitWrapper[Double] = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T, fromIndex: `true`): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.lowerCase
    */
  def lowerCase(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.lowerFirst
    */
  def lowerFirst(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.lt
    */
  def lt(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.lte
    */
  def lte(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.map
    */
  def map[T](`this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | List[T] | Null | NumericDictionary[T]]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def map[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: String
  ): LoDashExplicitWrapper[js.Array[_]] = js.native
  def map[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: js.Object
  ): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /** @see _.map */
  def map[T, K /* <: String */](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: K
  ): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ] = js.native
  /**
    * @see _.map
    */
  def map[T /* <: js.Object */, TResult](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.mapKeys
    */
  def mapKeys[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def mapKeys[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], iteratee: ObjectIteratee[T]): LoDashExplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.mapKeys
    */
  @JSName("mapKeys")
  def mapKeys_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  @JSName("mapKeys")
  def mapKeys_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ListIteratee[T]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(`this`: LoDashExplicitWrapper[js.UndefOr[String | Null]]): LoDashExplicitWrapper[NumericDictionary[String]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](`this`: LoDashExplicitWrapper[js.UndefOr[String | Null]], callback: StringIterator[TResult]): LoDashExplicitWrapper[NumericDictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], iteratee: String): LoDashExplicitWrapper[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typings.lodash.lodashStrings.LoDashExplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], iteratee: js.Object): LoDashExplicitWrapper[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typings.lodash.lodashStrings.LoDashExplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T, TKey /* <: String */](
    `this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: TKey
  ): LoDashExplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any]
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: String
  ): LoDashExplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: js.Object
  ): LoDashExplicitWrapper[Dictionary[Boolean]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    callback: DictionaryIterator[T, TResult]
  ): LoDashExplicitWrapper[Dictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_Object[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[Null | T]]): LoDashExplicitWrapper[T] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_ObjectTResult[T /* <: js.Object */, TResult](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], callback: ObjectIterator[T, TResult]): LoDashExplicitWrapper[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typings.lodash.lodashStrings.LoDashExplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.map
    */
  @JSName("map")
  def map_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    iteratee: (ArrayIterator[T, TResult]) | (ListIterator[T, TResult])
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.matches
    */
  def matches[V](): LoDashExplicitWrapper[js.Function1[/* value */ V, Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  def matchesProperty[SrcValue](srcValue: SrcValue): LoDashExplicitWrapper[js.Function1[/* value */ _, Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): LoDashExplicitWrapper[js.Function1[/* value */ Value, Boolean]] = js.native
  /**
    * @see _.max
    */
  def max[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.maxBy
    */
  def maxBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def maxBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.mean
    */
  def mean(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.meanBy
    */
  def meanBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Double] = js.native
  def meanBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.memoize
    */
  def memoize(): LoDashExplicitWrapper[TValue with MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */ js.Any, _]): LoDashExplicitWrapper[TValue with MemoizedFunction] = js.native
  /**
    * @see _.merge
    */
  def merge(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource](source: TSource, customizer: MergeWithCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: MergeWithCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.method
    */
  def method(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* object */ _, _]] = js.native
  /**
    * @see _.methodOf
    */
  def methodOf(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  /**
    * @see _.min
    */
  def min[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.minBy
    */
  def minBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def minBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.mixin
    */
  def mixin(): LoDashExplicitWrapper[LoDashStatic] = js.native
  def mixin(options: MixinOptions): LoDashExplicitWrapper[LoDashStatic] = js.native
  /**
    * @see _.mixin
    */
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]]): this.type = js.native
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]], options: MixinOptions): this.type = js.native
  /**
    * @see _.multiply
    */
  def multiply(multiplicand: Double): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.negate
    */
  def negate(`this`: LoDashExplicitWrapper[js.Function0[Boolean] | (js.Function1[/* repeated */ _, _])]): LoDashExplicitWrapper[js.Function0[Boolean]] = js.native
  @JSName("negate")
  def negate_A1[A1](`this`: LoDashExplicitWrapper[js.Function1[/* a1 */ A1, Boolean]]): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, Boolean]] = js.native
  @JSName("negate")
  def negate_A1A2[A1, A2](`this`: LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, Boolean]]): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, Boolean]] = js.native
  /**
    * @see _.noConflict
    */
  def noConflict(): LoDashExplicitWrapper[Typeoflodash] = js.native
  /**
    * @see _.noop
    */
  def noop(args: js.Any*): LoDashExplicitWrapper[js.UndefOr[scala.Nothing]] = js.native
  /**
    * @see _.now
    */
  def now(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.nth
    */
  def nth[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def nth[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.nthArg
    */
  def nthArg(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.omit
    */
  def omit[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], paths: Many[PropertyName]*): LoDashExplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.omitBy
    */
  def omitBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.omitBy
    */
  def omitBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    predicate: ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashExplicitWrapper[PartialObject[T]] = js.native
  @JSName("omitBy")
  def omitBy_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]],
    predicate: ValueKeyIteratee[T]
  ): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_AnyKindOfDictionary[T /* <: AnyKindOfDictionary */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], paths: Many[PropertyName]*): LoDashExplicitWrapper[T] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_ObjectK_String[T /* <: js.Object */, K /* <: String */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], paths: Many[K]*): LoDashExplicitWrapper[Omit[T, K]] = js.native
  /**
    * @see _.orderBy
    */
  def orderBy[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def orderBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[Null | T]],
    iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]
  ): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def orderBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[Null | T]],
    iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])],
    orders: Many[Boolean | asc | desc]
  ): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.orderBy
    */
  @JSName("orderBy")
  def orderBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])],
    orders: Many[Boolean | asc | desc]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.over
    */
  def over[TResult](
    `this`: LoDashExplicitWrapper[Many[js.Function1[/* repeated */ _, TResult]]],
    iteratees: (Many[js.Function1[/* repeated */ _, TResult]])*
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, js.Array[TResult]]] = js.native
  /**
    * @see _.overArgs
    */
  def overArgs(transforms: (Many[js.Function1[/* repeated */ _, _]])*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.overEvery
    */
  def overEvery[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): LoDashExplicitWrapper[js.Function1[/* repeated */ T, Boolean]] = js.native
  /**
    * @see _.overSome
    */
  def overSome[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): LoDashExplicitWrapper[js.Function1[/* repeated */ T, Boolean]] = js.native
  /**
    * @see _.pad
    */
  def pad(): LoDashExplicitWrapper[String] = js.native
  def pad(length: Double): LoDashExplicitWrapper[String] = js.native
  def pad(length: Double, chars: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.padEnd
    */
  def padEnd(): LoDashExplicitWrapper[String] = js.native
  def padEnd(length: Double): LoDashExplicitWrapper[String] = js.native
  def padEnd(length: Double, chars: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.padStart
    */
  def padStart(): LoDashExplicitWrapper[String] = js.native
  def padStart(length: Double): LoDashExplicitWrapper[String] = js.native
  def padStart(length: Double, chars: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.parseInt
    */
  def parseInt(): LoDashExplicitWrapper[Double] = js.native
  def parseInt(radix: Double): LoDashExplicitWrapper[Double] = js.native
  // catch-all
  /**
    * @see _.partial
    */
  def partial(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partial
    */
  def partial[R](`this`: LoDashExplicitWrapper[Function0[R]]): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, R](`this`: LoDashExplicitWrapper[Function1[T1, R]], arg1: T1): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]], arg1: T1, arg2: T2): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]], plc1: __, arg2: T2): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, arg3: T3): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, plc2: __, arg3: T3): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  // catch-all
  /**
    * @see _.partialRight
    */
  def partialRight(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partialRight
    */
  def partialRight[R](`this`: LoDashExplicitWrapper[Function0[R]]): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, R](`this`: LoDashExplicitWrapper[Function1[T1, R]], arg1: T1): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]], arg1: T1, arg2: T2): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]], arg1: T1, plc2: __): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, plc3: __): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, arg3: T3): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, plc3: __): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    plc4: __
  ): LoDashExplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    plc4: __
  ): LoDashExplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    plc4: __
  ): LoDashExplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    plc4: __
  ): LoDashExplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  // arity 1
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1R[T1, R](`this`: LoDashExplicitWrapper[Function1[T1, R]]): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]]): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]], arg2: T2): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  // arity 3
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]]): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg2: T2, arg3: T3): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg2: T2, plc3: __): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg3: T3): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  // arity 4
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]]): LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, arg3: T3, plc4: __): LoDashExplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, plc3: __, arg4: T4): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, plc3: __, plc4: __): LoDashExplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg3: T3, arg4: T4): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg3: T3, plc4: __): LoDashExplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg4: T4): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  // arity 1
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1R[T1, R](`this`: LoDashExplicitWrapper[Function1[T1, R]]): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]]): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](`this`: LoDashExplicitWrapper[Function2[T1, T2, R]], arg1: T1): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  // arity 3
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]]): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, arg2: T2): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  // arity 4
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]]): LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1): LoDashExplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, arg2: T2): LoDashExplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, plc2: __, arg3: T3): LoDashExplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, arg2: T2): LoDashExplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, plc2: __, arg3: T3): LoDashExplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  /**
    * @see _.partition
    */
  def partition[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null | T]],
    callback: ValueIteratee[
      (/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): LoDashExplicitWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  /**
    * @see _.partition
    */
  def partition[T, U /* <: T */](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], callback: ValueIteratorTypeGuard[T, U]): LoDashExplicitWrapper[js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]] = js.native
  /**
    * @see _.pick
    */
  def pick[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], props: PropertyPath*): LoDashExplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[PartialObject[T]] = js.native
  def pickBy[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    predicate: ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashExplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T, S /* <: T */](
    `this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]],
    predicate: ValueKeyIterateeTypeGuard[T, S]
  ): LoDashExplicitWrapper[Dictionary[S]] = js.native
  /**
    * @see _.pickBy
    */
  @JSName("pickBy")
  def pickBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  @JSName("pickBy")
  def pickBy_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]],
    predicate: ValueKeyIteratee[T]
  ): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.pick
    */
  @JSName("pick")
  def pick_T_ObjectU_String[T /* <: js.Object */, U /* <: String */](`this`: LoDashExplicitWrapper[T], props: Many[U]*): LoDashExplicitWrapper[Pick[T, U]] = js.native
  /**
    * @see _.plant
    */
  def plant[T](value: T): LoDashExplicitWrapper[T] = js.native
  def pop[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.property
    */
  def property[TObj, TResult](): LoDashExplicitWrapper[js.Function1[/* obj */ TObj, TResult]] = js.native
  /**
    * @see _.propertyOf
    */
  def propertyOf(): LoDashExplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  /**
    * @see _.pull
    */
  def pull[T](`this`: LoDashExplicitWrapper[List[T]], values: T*): this.type = js.native
  /**
    * @see _.pullAll
    */
  def pullAll[T](`this`: LoDashExplicitWrapper[List[T]]): this.type = js.native
  def pullAll[T](`this`: LoDashExplicitWrapper[List[T]], values: List[T]): this.type = js.native
  def push[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], items: T*): this.type = js.native
  /**
    * @see _.random
    */
  def random(): LoDashExplicitWrapper[Double] = js.native
  def random(floating: Boolean): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.random
    */
  def random(max: Double): LoDashExplicitWrapper[Double] = js.native
  def random(max: Double, floating: Boolean): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.range
    */
  def range(): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def range(end: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def range(end: Double, step: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  /**
    * @see _.rangeRight
    */
  def rangeRight(): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def rangeRight(end: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def rangeRight(end: Double, step: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  /**
    * @see _.rearg
    */
  def rearg(indexes: Many[Double]*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T /* <: js.Object */](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, T, js.Array[T] | List[T]]
  ): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, T, js.Array[T] | List[T]]
  ): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_TTResult[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.reject
    */
  def reject(`this`: LoDashExplicitWrapper[js.UndefOr[String | Null]]): LoDashExplicitWrapper[js.Array[String]] = js.native
  def reject(`this`: LoDashExplicitWrapper[js.UndefOr[String | Null]], predicate: StringIterator[Boolean]): LoDashExplicitWrapper[js.Array[String]] = js.native
  def reject[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  @JSName("reject")
  def reject_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T_Object[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.remove
    */
  def remove[T](`this`: LoDashExplicitWrapper[List[T]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def remove[T](`this`: LoDashExplicitWrapper[List[T]], predicate: ListIterator[T, NotVoid]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.repeat
    */
  def repeat(): LoDashExplicitWrapper[String] = js.native
  def repeat(n: Double): LoDashExplicitWrapper[String] = js.native
  def replace(pattern: String, replacement: String): LoDashExplicitWrapper[String] = js.native
  def replace(pattern: String, replacement: ReplaceFunction): LoDashExplicitWrapper[String] = js.native
  def replace(pattern: RegExp, replacement: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.replace
    */
  def replace(pattern: RegExp, replacement: ReplaceFunction): LoDashExplicitWrapper[String] = js.native
  def replace(replacement: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.replace
    */
  def replace(replacement: ReplaceFunction): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.rest
    */
  def rest(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def rest(start: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.result
    */
  def result[TResult](path: PropertyPath): LoDashExplicitWrapper[TResult] = js.native
  def result[TResult](path: PropertyPath, defaultValue: TResult): LoDashExplicitWrapper[TResult] = js.native
  def result[TResult](path: PropertyPath, defaultValue: js.Function1[/* repeated */ js.Any, TResult]): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.round
    */
  def round(): LoDashExplicitWrapper[Double] = js.native
  def round(precision: Double): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sample
    */
  def sample[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.sampleSize
    */
  def sampleSize[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def sampleSize[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], n: Double): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.sampleSize
    */
  @JSName("sampleSize")
  def sampleSize_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  @JSName("sampleSize")
  def sampleSize_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    n: Double
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sample
    */
  @JSName("sample")
  def sample_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.set
    */
  def set(path: PropertyPath, value: js.Any): this.type = js.native
  /**
    * @see _.setWith
    */
  def setWith(path: PropertyPath, value: js.Any): this.type = js.native
  def setWith(path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[TValue]): this.type = js.native
  /**
    * @see _.setWith
    */
  @JSName("setWith")
  def setWith_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashExplicitWrapper[TResult] = js.native
  @JSName("setWith")
  def setWith_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[TValue]): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.set
    */
  @JSName("set")
  def set_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashExplicitWrapper[TResult] = js.native
  def shift[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.shuffle
    */
  def shuffle[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.shuffle
    */
  @JSName("shuffle")
  def shuffle_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.size
    */
  def size(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.slice
    */
  def slice[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def slice[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], start: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  def slice[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], start: Double, end: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.snakeCase
    */
  def snakeCase(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.some
    */
  def some[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[Boolean] = js.native
  def some[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.some
    */
  @JSName("some")
  def some_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Boolean] = js.native
  @JSName("some")
  def some_T[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashExplicitWrapper[Boolean] = js.native
  def sort[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): this.type = js.native
  def sort[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    compareFn: js.Function2[/* a */ T, /* b */ T, Double]
  ): this.type = js.native
  /**
    * @see _.sortBy
    */
  def sortBy[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]], iteratees: Many[ObjectIteratee[T]]*): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.sortBy
    */
  @JSName("sortBy")
  def sortBy_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratees: Many[ListIteratee[T]]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sortedIndex
    */
  def sortedIndex[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sortedIndexBy
    */
  def sortedIndexBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T): LoDashExplicitWrapper[Double] = js.native
  def sortedIndexBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sortedIndexOf
    */
  def sortedIndexOf[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sortedLastIndex
    */
  def sortedLastIndex[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sortedLastIndexBy
    */
  def sortedLastIndexBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sortedLastIndexOf
    */
  def sortedLastIndexOf[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], value: T): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sortedUniq
    */
  def sortedUniq[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sortedUniqBy
    */
  def sortedUniqBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def splice[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], start: Double): this.type = js.native
  def splice[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    start: Double,
    deleteCount: Double,
    items: T*
  ): this.type = js.native
  /**
    * @see _.split
    */
  def split(): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: String): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: String, limit: Double): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: RegExp): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: RegExp, limit: Double): LoDashExplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](`this`: LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]]): LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](`this`: LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]], start: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.startCase
    */
  def startCase(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.startsWith
    */
  def startsWith(): LoDashExplicitWrapper[Boolean] = js.native
  def startsWith(target: String): LoDashExplicitWrapper[Boolean] = js.native
  def startsWith(target: String, position: Double): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.stubArray
    */
  def stubArray(): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.stubFalse
    */
  def stubFalse(): LoDashExplicitWrapper[`false`] = js.native
  /**
    * @see _.stubObject
    */
  def stubObject(): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.stubString
    */
  def stubString(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.stubTrue
    */
  def stubTrue(): LoDashExplicitWrapper[`true`] = js.native
  /**
    * @see _.subtract
    */
  def subtract(subtrahend: Double): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sum
    */
  def sum(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.sumBy
    */
  def sumBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[Double] = js.native
  def sumBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: String): LoDashExplicitWrapper[Double] = js.native
  def sumBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: js.Function1[/* value */ T, Double]
  ): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.tail
    */
  def tail[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.take
    */
  def take[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def take[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeRight
    */
  def takeRight[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def takeRight[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeRightWhile
    */
  def takeRightWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeWhile
    */
  def takeWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def takeWhile[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.template
    */
  def template(): LoDashExplicitWrapper[TemplateExecutor] = js.native
  def template(options: TemplateOptions): LoDashExplicitWrapper[TemplateExecutor] = js.native
  /**
    * @see _.throttle
    */
  def throttle(): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: Double): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: Double, options: ThrottleSettings): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  /**
    * @see _.thru
    */
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.times
    */
  def times(): LoDashExplicitWrapper[js.Array[Double]] = js.native
  /**
    * @see _.times
    */
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.toArray
    */
  def toArray[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.toArray
    */
  def toArray[T /* <: js.Object */](`this`: LoDashImplicitWrapper[T]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.toFinite
    */
  def toFinite(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.toInteger
    */
  def toInteger(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.toLength
    */
  def toLength(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.toLower
    */
  def toLower(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.toNumber
    */
  def toNumber(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.toPairs
    */
  def toPairs(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.toPairs
    */
  def toPairs[T](`this`: LoDashExplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.toPairsIn
    */
  def toPairsIn(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.toPairsIn
    */
  def toPairsIn[T](`this`: LoDashExplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.toPath
    */
  def toPath(): LoDashExplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.toPlainObject
    */
  def toPlainObject(): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.toSafeInteger
    */
  def toSafeInteger(): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.toUpper
    */
  def toUpper(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.transform
    */
  def transform(): LoDashExplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.transform
    */
  def transform(`this`: LoDashExplicitWrapper[js.Array[_]]): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `this`: LoDashExplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult] | Dictionary[TResult]]) | (MemoVoidDictionaryIterator[T, js.Array[TResult] | Dictionary[TResult]])
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult]]) | (MemoVoidDictionaryIterator[T, js.Array[TResult]]),
    accumulator: js.Array[TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, Dictionary[TResult]]) | (MemoVoidDictionaryIterator[T, Dictionary[TResult]]),
    accumulator: Dictionary[TResult]
  ): LoDashExplicitWrapper[Dictionary[TResult]] = js.native
  /**
    * @see _.trim
    */
  def trim(): LoDashExplicitWrapper[String] = js.native
  def trim(chars: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.trimEnd
    */
  def trimEnd(): LoDashExplicitWrapper[String] = js.native
  def trimEnd(chars: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.trimStart
    */
  def trimStart(): LoDashExplicitWrapper[String] = js.native
  def trimStart(chars: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.truncate
    */
  def truncate(): LoDashExplicitWrapper[String] = js.native
  def truncate(options: TruncateOptions): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.unary
    */
  def unary[T, TResult](`this`: LoDashExplicitWrapper[js.Function2[/* arg1 */ T, /* repeated */ _, TResult]]): LoDashExplicitWrapper[js.Function1[/* arg1 */ T, TResult]] = js.native
  /**
    * @see _.unescape
    */
  def unescape(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.union
    */
  def union[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays: (js.UndefOr[List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: Null,
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: Null, arrays3: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: Null,
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T], arrays3: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T],
    arrays5: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: Comparator[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    comparator: Comparator[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: Comparator[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniq
    */
  def uniq[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqBy
    */
  def uniqBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqWith
    */
  def uniqWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def uniqWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqueId
    */
  def uniqueId(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.unset
    */
  def unset(path: PropertyPath): LoDashExplicitWrapper[Boolean] = js.native
  def unshift[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], items: T*): this.type = js.native
  /**
    * @see _.unzip
    */
  def unzip[T](`this`: LoDashExplicitWrapper[js.UndefOr[js.Array[js.Array[T]] | List[List[T]] | Null]]): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[List[T]] | Null]]): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[List[T]] | Null]],
    iteratee: js.Function1[/* repeated */ T, TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.update
    */
  def update(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.updateWith
    */
  def updateWith(path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): this.type = js.native
  def updateWith(
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[TValue]
  ): this.type = js.native
  /**
    * @see _.updateWith
    */
  @JSName("updateWith")
  def updateWith_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LoDashExplicitWrapper[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResult_LoDashExplicitWrapper[TResult](
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[TValue]
  ): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.upperCase
    */
  def upperCase(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.upperFirst
    */
  def upperFirst(): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.values
    */
  def values(): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.values
    */
  def values[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.valuesIn
    */
  def valuesIn[T /* <: js.Object */](`this`: LoDashExplicitWrapper[js.UndefOr[T | Null]]): LoDashExplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.valuesIn
    */
  @JSName("valuesIn")
  def valuesIn_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.values
    */
  @JSName("values")
  def values_T[T](`this`: LoDashExplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.without
    */
  def without[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], values: T*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.words
    */
  def words(): LoDashExplicitWrapper[js.Array[String]] = js.native
  def words(pattern: String): LoDashExplicitWrapper[js.Array[String]] = js.native
  def words(pattern: RegExp): LoDashExplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.wrap
    */
  def wrap[TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ js.Any, TResult]): LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.wrap
    */
  @JSName("wrap")
  def wrap_TArgsTResult[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ TArgs, TResult]): LoDashExplicitWrapper[js.Function1[/* repeated */ TArgs, TResult]] = js.native
  /**
    * @see _.xor
    */
  def xor[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays: (js.UndefOr[List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: Comparator[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    comparator: Comparator[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: Comparator[T]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.zip
    */
  def zip[T](`this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]], arrays: (js.UndefOr[List[T] | Null])*): LoDashExplicitWrapper[js.Array[js.Array[js.UndefOr[T]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2](`this`: LoDashExplicitWrapper[List[T1]], arrays2: List[T2]): LoDashExplicitWrapper[js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3](`this`: LoDashExplicitWrapper[List[T1]], arrays2: List[T2], arrays3: List[T3]): LoDashExplicitWrapper[js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4](`this`: LoDashExplicitWrapper[List[T1]], arrays2: List[T2], arrays3: List[T3], arrays4: List[T4]): LoDashExplicitWrapper[
    js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]]
  ] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4, T5](
    `this`: LoDashExplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    arrays5: List[T5]
  ): LoDashExplicitWrapper[
    js.Array[
      js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
    ]
  ] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject(`this`: LoDashExplicitWrapper[List[PropertyName]]): LoDashExplicitWrapper[Dictionary[js.UndefOr[scala.Nothing]]] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject[T](`this`: LoDashExplicitWrapper[List[PropertyName]], values: List[T]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.zipObjectDeep
    */
  def zipObjectDeep(`this`: LoDashExplicitWrapper[List[PropertyPath]]): LoDashExplicitWrapper[js.Object] = js.native
  def zipObjectDeep(`this`: LoDashExplicitWrapper[List[PropertyPath]], values: List[_]): LoDashExplicitWrapper[js.Object] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](
    `this`: LoDashExplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: (js.UndefOr[(js.Function1[/* repeated */ T, TResult]) | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](`this`: LoDashExplicitWrapper[List[T]], iteratee: js.Function1[/* value1 */ T, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, TResult](
    `this`: LoDashExplicitWrapper[List[T1]],
    arrays2: List[T2],
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, TResult](
    `this`: LoDashExplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    iteratee: js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, TResult](
    `this`: LoDashExplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    iteratee: js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, T5, TResult](
    `this`: LoDashExplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    arrays5: List[T5],
    iteratee: js.Function5[
      /* value1 */ T1, 
      /* value2 */ T2, 
      /* value3 */ T3, 
      /* value4 */ T4, 
      /* value5 */ T5, 
      TResult
    ]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
}

