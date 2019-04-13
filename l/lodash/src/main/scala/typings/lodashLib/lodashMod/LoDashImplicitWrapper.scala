package typings
package lodashLib.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prototype.plant
@js.native
trait LoDashImplicitWrapper[TValue] extends LoDashWrapper[TValue] {
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  var partialRight_Original: ImplicitPartialRight = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  var partial_Original: ImplicitPartial = js.native
  /**
    * @see _.add
    */
  def add(addend: scala.Double): scala.Double = js.native
  /**
    * @see _.after
    **/
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashImplicitWrapper[TFunc] = js.native
  /**
    * @see _.ary
    */
  def ary(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def ary(n: scala.Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.assign
    */
  def assign(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assign
    */
  def assign(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TResult](otherArgs: js.Any*): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TResult](otherArgs: js.Any*): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TResult](otherArgs: js.Any*): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.at
    */
  def at[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    props: PropertyPath*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.at
    */
  @JSName("at")
  def at_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], props: Many[java.lang.String]*): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.attempt
    */
  def attempt[TResult](args: js.Any*): TResult | stdLib.Error = js.native
  /**
    * @see _.before
    **/
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashImplicitWrapper[TFunc] = js.native
  /**
    * @see _.bind
    */
  def bind(thisArg: js.Any, partials: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.bindKey
    */
  def bindKey(key: java.lang.String, partials: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.camelCase
    */
  def camelCase(): java.lang.String = js.native
  /**
    * @see _.capitalize
    */
  def capitalize(): java.lang.String = js.native
  /**
    * @see _.castArray
    */
  def castArray[T](`this`: LoDashImplicitWrapper[Many[T]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.ceil
    */
  def ceil(): scala.Double = js.native
  def ceil(precision: scala.Double): scala.Double = js.native
  /**
    * @see _.chain
    */
  def chain(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.chunk
    */
  def chunk[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  def chunk[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], size: scala.Double): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.clamp
    */
  def clamp(lower: scala.Double, upper: scala.Double): scala.Double = js.native
  def clamp(upper: scala.Double): scala.Double = js.native
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
  def cloneDeepWith(customizer: CloneDeepWithCustomizer[TValue]): js.Any = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith(): TValue = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith[TResult /* <: js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null */](customizer: CloneWithCustomizer[TValue, TResult]): TResult = js.native
  /**
    * @see _.cloneWith
    */
  @JSName("cloneWith")
  def `cloneWith_TResult<union>`[TResult](customizer: CloneWithCustomizer[TValue, js.UndefOr[TResult]]): TResult | TValue = js.native
  /**
    * @see _.compact
    */
  @JSName("compact")
  def compact_[T](
    `this`: LoDashImplicitWrapper[
      js.UndefOr[
        (List[
          js.UndefOr[
            T | scala.Null | lodashLib.lodashLibNumbers.`false` | lodashLib.lodashLibStrings.Empty | lodashLib.lodashLibNumbers.`0`
          ]
        ]) | scala.Null
      ]
    ]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.compact
    */
  def concat[T](`this`: LoDashImplicitWrapper[Many[T]], values: Many[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.conforms
    */
  def conforms[T](`this`: LoDashImplicitWrapper[ConformsPredicateObject[T]]): LoDashImplicitWrapper[js.Function1[/* value */ T, scala.Boolean]] = js.native
  /**
    * @see _.conformsTo
    */
  def conformsTo[T](`this`: LoDashImplicitWrapper[T], source: ConformsPredicateObject[T]): scala.Boolean = js.native
  /**
    * @see _.constant
    */
  def constant(): LoDashImplicitWrapper[js.Function0[TValue]] = js.native
  /**
    * @see _.countBy
    */
  def countBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[Dictionary[scala.Double]] = js.native
  def countBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[Dictionary[scala.Double]] = js.native
  /**
    * @see _.countBy
    */
  @JSName("countBy")
  def countBy_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[Dictionary[scala.Double]] = js.native
  @JSName("countBy")
  def countBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    iteratee: ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashImplicitWrapper[Dictionary[scala.Double]] = js.native
  /**
    * @see _.create
    */
  def create[U /* <: js.Object */](): LoDashImplicitWrapper[TValue with U] = js.native
  def create[U /* <: js.Object */](properties: U): LoDashImplicitWrapper[TValue with U] = js.native
  /**
    * @see _.curry
    **/
  def curry(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curry(arity: scala.Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.curry
    **/
  def curry[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]]): LoDashImplicitWrapper[CurriedFunction1[T1, R]] = js.native
  def curry[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]], arity: scala.Double): LoDashImplicitWrapper[CurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curryRight
    **/
  def curryRight(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curryRight(arity: scala.Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.curryRight
    **/
  def curryRight[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]]): LoDashImplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  def curryRight[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]], arity: scala.Double): LoDashImplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashImplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]], arity: scala.Double): LoDashImplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashImplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](
    `this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]],
    arity: scala.Double
  ): LoDashImplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]): LoDashImplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]],
    arity: scala.Double
  ): LoDashImplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashImplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]],
    arity: scala.Double
  ): LoDashImplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashImplicitWrapper[CurriedFunction2[T1, T2, R]] = js.native
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]], arity: scala.Double): LoDashImplicitWrapper[CurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashImplicitWrapper[CurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](
    `this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]],
    arity: scala.Double
  ): LoDashImplicitWrapper[CurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]): LoDashImplicitWrapper[CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]],
    arity: scala.Double
  ): LoDashImplicitWrapper[CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashImplicitWrapper[CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]],
    arity: scala.Double
  ): LoDashImplicitWrapper[CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  /**
    * @see _.debounce
    */
  def debounce(): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: scala.Double): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: scala.Double, options: DebounceSettings): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  /**
    * @see _.deburr
    */
  def deburr(): java.lang.String = js.native
  /**
    * @see _.defaultTo
    */
  def defaultTo[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], defaultValue: T): T = js.native
  /**
    * @see _.defaultTo
    */
  @JSName("defaultTo")
  def `defaultTo_TTDefault<union>`[T, TDefault](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], defaultValue: TDefault): T | TDefault = js.native
  /**
    * @see _.defaults
    */
  def defaults(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.defaults
    */
  def defaults(sources: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource](source: TSource): LoDashImplicitWrapper[TSource with TValue] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TSource2 with TSource1 with TValue] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TSource3 with TSource2 with TSource1 with TValue] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TSource4 with TSource3 with TSource2 with TSource1 with TValue] = js.native
  /**
    * @see _.defaultsDeep
    **/
  def defaultsDeep(sources: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.defer
    */
  def defer(args: js.Any*): LoDashImplicitWrapper[scala.Double] = js.native
  /**
    * @see _.delay
    */
  def delay(wait: scala.Double, args: js.Any*): LoDashImplicitWrapper[scala.Double] = js.native
  /**
    * @see _.difference
    */
  def difference[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values: List[T2],
    iteratee: ValueIteratee[T1 | T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    iteratee: ValueIteratee[T1 | T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    values: (List[T7] | (ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values: List[T2],
    comparator: Comparator2[T1, T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.divide
    */
  def divide(divisor: scala.Double): scala.Double = js.native
  /**
    * @see _.drop
    */
  def drop[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def drop[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], n: scala.Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropRight
    */
  def dropRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def dropRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], n: scala.Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropRightWhile
    */
  def dropRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropWhile
    */
  def dropWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def dropWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.endsWith
    */
  def endsWith(): scala.Boolean = js.native
  def endsWith(target: java.lang.String): scala.Boolean = js.native
  def endsWith(target: java.lang.String, position: scala.Double): scala.Boolean = js.native
  /**
    * @see _.toPairs
    */
  def entries(): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  /**
    * @see _.toPairs
    */
  def entries[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  /**
    * @see _.entriesIn
    */
  def entriesIn(): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  /**
    * @see _.entriesIn
    */
  def entriesIn[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  /**
    * @see _.eq
    */
  def eq(other: js.Any): scala.Boolean = js.native
  /**
    * @see _.escape
    */
  def escape(): java.lang.String = js.native
  /**
    * @see _.escapeRegExp
    */
  def escapeRegExp(): java.lang.String = js.native
  /**
    * @see _.every
    */
  def every[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): scala.Boolean = js.native
  def every[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): scala.Boolean = js.native
  /**
    * @see _.every
    */
  @JSName("every")
  def every_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): scala.Boolean = js.native
  @JSName("every")
  def every_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean]
  ): scala.Boolean = js.native
  /**
    * @see _.extend
    */
  def extend(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.extend
    */
  def extend(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.fill
    */
  def fill[T](`this`: LoDashImplicitWrapper[js.UndefOr[js.Array[_] | List[_] | scala.Null]], value: T): LoDashImplicitWrapper[js.Array[T]] = js.native
  def fill[T, U](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[U] | List[U] | scala.Null]],
    value: T,
    start: scala.Double
  ): LoDashImplicitWrapper[js.Array[T | U]] = js.native
  def fill[T, U](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[U] | List[U] | scala.Null]],
    value: T,
    start: scala.Double,
    end: scala.Double
  ): LoDashImplicitWrapper[js.Array[T | U]] = js.native
  /**
    * @see _.fill
    */
  @JSName("fill")
  def fill_TU[T, U](`this`: LoDashImplicitWrapper[js.UndefOr[js.Array[U] | List[U] | scala.Null]], value: T): LoDashImplicitWrapper[js.Array[T | U]] = js.native
  /**
    * @see _.filter
    */
  def filter(`this`: LoDashImplicitWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def filter(
    `this`: LoDashImplicitWrapper[js.UndefOr[java.lang.String | scala.Null]],
    predicate: StringIterator[scala.Boolean]
  ): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def filter[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("filter")
  def filter_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_TObjectSAny[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIteratorTypeGuard[T, S]
  ): LoDashImplicitWrapper[js.Array[S]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_TST[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIteratorTypeGuard[T, S]
  ): LoDashImplicitWrapper[js.Array[S]] = js.native
  /**
    * @see _.find
    */
  def find[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  def find[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def find[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): js.UndefOr[T] = js.native
  /**
    * @see _.find
    */
  def find[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIteratorTypeGuard[T, S]
  ): js.UndefOr[S] = js.native
  def find[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.findIndex
    */
  def findIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): scala.Double = js.native
  def findIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): scala.Double = js.native
  def findIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): scala.Double = js.native
  /**
    * @see _.findKey
    */
  def findKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): js.UndefOr[java.lang.String] = js.native
  def findKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], predicate: ObjectIteratee[T]): js.UndefOr[java.lang.String] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  def findLast[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def findLast[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): js.UndefOr[T] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIteratorTypeGuard[T, S]
  ): js.UndefOr[S] = js.native
  def findLast[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.findLastIndex
    */
  def findLastIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): scala.Double = js.native
  def findLastIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): scala.Double = js.native
  def findLastIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): scala.Double = js.native
  /**
    * @see _.findLastKey
    */
  def findLastKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): js.UndefOr[java.lang.String] = js.native
  def findLastKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], predicate: ObjectIteratee[T]): js.UndefOr[java.lang.String] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  @JSName("findLast")
  def findLast_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  @JSName("findLast")
  def findLast_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_TObjectSAny[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIteratorTypeGuard[T, S]
  ): js.UndefOr[S] = js.native
  @JSName("findLast")
  def findLast_TObjectSAny[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  @JSName("find")
  def find_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  @JSName("find")
  def find_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_TObjectSAny[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIteratorTypeGuard[T, S]
  ): js.UndefOr[S] = js.native
  @JSName("find")
  def find_TObjectSAny[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.head
    */
  def first[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: java.lang.String): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Object): LoDashImplicitWrapper[js.Array[scala.Boolean]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T](
    `this`: LoDashImplicitWrapper[
      js.UndefOr[List[Many[T]] | Dictionary[Many[T]] | NumericDictionary[Many[T]] | scala.Null]
    ]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    iteratee: ObjectIterator[T, Many[TResult]]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: java.lang.String): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: js.Object): LoDashImplicitWrapper[js.Array[scala.Boolean]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T](
    `this`: LoDashImplicitWrapper[
      js.UndefOr[
        (List[ListOfRecursiveArraysOrValues[T] | T]) | (Dictionary[ListOfRecursiveArraysOrValues[T] | T]) | (NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]) | scala.Null
      ]
    ]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDeep
    */
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: java.lang.String): LoDashImplicitWrapper[js.Array[_]] = js.native
  def flatMapDepth(
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Object | scala.Null]],
    iteratee: java.lang.String,
    depth: scala.Double
  ): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: js.Object): LoDashImplicitWrapper[js.Array[scala.Boolean]] = js.native
  def flatMapDepth(
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Object | scala.Null]],
    iteratee: js.Object,
    depth: scala.Double
  ): LoDashImplicitWrapper[js.Array[scala.Boolean]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T](
    `this`: LoDashImplicitWrapper[
      js.UndefOr[
        (List[ListOfRecursiveArraysOrValues[T] | T]) | (Dictionary[ListOfRecursiveArraysOrValues[T] | T]) | (NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]) | scala.Null
      ]
    ]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: scala.Double
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDepth
    */
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: scala.Double
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMap
    */
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: ListIterator[T, Many[TResult]]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatten
    */
  def flatten[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[Many[T]] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flattenDeep
    */
  def flattenDeep[T](`this`: LoDashImplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flattenDeep
    */
  def flattenDepth[T](`this`: LoDashImplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def flattenDepth[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | scala.Null]],
    depth: scala.Double
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.floor
    */
  def floor(): scala.Double = js.native
  def floor(precision: scala.Double): scala.Double = js.native
  def flow(
    `this`: LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]],
    funcs: js.Array[Many[js.Function1[/* a */ _, _]]]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flow
    */
  // 0-argument first function
  def flow[R1, R2](`this`: LoDashImplicitWrapper[js.Function0[R1]], f2: js.Function1[/* a */ R1, R2]): LoDashImplicitWrapper[js.Function0[R2]] = js.native
  def flow[R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function0[R3]] = js.native
  def flow[R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function0[R4]] = js.native
  def flow[R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function0[R5]] = js.native
  def flow[R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function0[R6]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function0[R7]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function0[_]] = js.native
  def flowRight(
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ _, _]],
    f6: js.Function1[/* a */ js.Any, _],
    f5: js.Function1[/* a */ js.Any, _],
    f4: js.Function1[/* a */ js.Any, _],
    f3: js.Function1[/* a */ js.Any, _],
    f2: js.Function1[/* a */ js.Any, _],
    f1: js.Function0[_],
    funcs: (Many[js.Function1[/* repeated */ _, _]])*
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def flowRight(
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ _, _]],
    funcs: js.Array[Many[js.Function1[/* repeated */ _, _]]]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flowRight
    */
  // 0-argument first function
  def flowRight[R2, R1](`this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function0[R1]): LoDashImplicitWrapper[js.Function0[R2]] = js.native
  // any-argument first function
  def flowRight[R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R2]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R3]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R3]] = js.native
  // 2-argument first function
  def flowRight[A1, A2, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R4]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R4]] = js.native
  // 3-argument first function
  def flowRight[A1, A2, A3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  def flowRight[A1, A2, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R5]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R5]] = js.native
  // 4-argument first function
  def flowRight[A1, A2, A3, A4, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  def flowRight[A1, A2, A3, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  def flowRight[A1, A2, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R6]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  def flowRight[A1, A2, A3, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  def flowRight[A1, A2, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R7]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  def flowRight[A1, A2, A3, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  def flowRight[A1, A2, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  def flowRight[A1, A2, A3, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  def flowRight[A1, A2, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  def flowRight[A1, A2, A3, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  // 1-argument first function
  @JSName("flowRight")
  def flowRight_A1R2R1[A1, R2, R1](`this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function1[/* a1 */ A1, R1]): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flowRight")
  def flowRight_A1R3R2R1[A1, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flowRight")
  def flowRight_A1R4R3R2R1[A1, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flowRight")
  def flowRight_A1R5R4R3R2R1[A1, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flowRight")
  def flowRight_A1R6R5R4R3R2R1[A1, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flowRight")
  def flowRight_A1R7R6R5R4R3R2R1[A1, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  // 4-argument first function
  // any-argument first function
  @JSName("flow")
  def flow_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _]] = js.native
  // 3-argument first function
  @JSName("flow")
  def flow_A1A2A3R1R2[A1, A2, A3, R1, R2](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5[A1, A2, A3, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _]] = js.native
  // 2-argument first function
  @JSName("flow")
  def flow_A1A2R1R2[A1, A2, R1, R2](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3[A1, A2, R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5[A1, A2, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6[A1, A2, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, _]] = js.native
  // 1-argument first function
  @JSName("flow")
  def flow_A1R1R2[A1, R1, R2](`this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]], f2: js.Function1[/* a */ R1, R2]): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3[A1, R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4[A1, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5[A1, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6[A1, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, _]] = js.native
  /**
    @see _.fromPairs
    */
  def fromPairs(`this`: LoDashImplicitWrapper[js.UndefOr[List[js.Array[_]] | scala.Null]]): LoDashImplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.fromPairs
    */
  @JSName("fromPairs")
  def fromPairs_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[(List[js.Tuple2[PropertyName, T]]) | scala.Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.functions
    */
  def functions(): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  /**
    * @see _.functionsIn
    */
  def functionsIn(): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  /**
    * @see _.get
    */
  def get(`this`: LoDashImplicitWrapper[js.UndefOr[scala.Null]], path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: java.lang.String */](path: TKey): /* import warning: ImportType.apply Failed type conversion: TValue[TKey] */ js.Any = js.native
  def get[TKey /* <: java.lang.String */](path: js.Array[TKey]): /* import warning: ImportType.apply Failed type conversion: TValue[TKey] */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TResult](path: PropertyPath): js.Any = js.native
  def get[TResult](path: PropertyPath, defaultValue: js.Any): js.Any = js.native
  /**
    * @see _.get
    */
  def get[TDefault](`this`: LoDashImplicitWrapper[js.UndefOr[scala.Null]], path: PropertyPath, defaultValue: TDefault): TDefault = js.native
  /**
    * @see _.get
    */
  def get[T](`this`: LoDashImplicitWrapper[js.UndefOr[NumericDictionary[T] | scala.Null]], path: scala.Double): js.UndefOr[T] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */](`this`: LoDashImplicitWrapper[js.UndefOr[TObject | scala.Null]], path: TKey): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */](`this`: LoDashImplicitWrapper[js.UndefOr[TObject | scala.Null]], path: js.Array[TKey]): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[T, TDefault](
    `this`: LoDashImplicitWrapper[js.UndefOr[NumericDictionary[T] | scala.Null]],
    path: scala.Double,
    defaultValue: TDefault
  ): T | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](
    `this`: LoDashImplicitWrapper[js.UndefOr[TObject | scala.Null]],
    path: TKey,
    defaultValue: TDefault
  ): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](
    `this`: LoDashImplicitWrapper[js.UndefOr[TObject | scala.Null]],
    path: js.Array[TKey],
    defaultValue: TDefault
  ): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TT[T](`this`: LoDashImplicitWrapper[NumericDictionary[T]], path: scala.Double): T = js.native
  /**
    * @see _.groupBy
    */
  def groupBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[Dictionary[js.Array[T]]] = js.native
  def groupBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[Dictionary[js.Array[T]]] = js.native
  /**
    * @see _.groupBy
    */
  @JSName("groupBy")
  def groupBy_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    Dictionary[
      js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ] = js.native
  @JSName("groupBy")
  def groupBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    iteratee: ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashImplicitWrapper[
    Dictionary[
      js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ] = js.native
  /**
    * @see _.gt
    */
  def gt(other: js.Any): scala.Boolean = js.native
  /**
    * @see _.gte
    */
  def gte(other: js.Any): scala.Boolean = js.native
  /**
    * @see _.has
    */
  def has(path: PropertyPath): scala.Boolean = js.native
  /**
    * @see _.hasIn
    */
  def hasIn(path: PropertyPath): scala.Boolean = js.native
  /**
    * @see _.head
    */
  def head[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.identity
    */
  def identity(): TValue = js.native
  /**
    * @see _.inRange
    */
  def inRange(start: scala.Double): scala.Boolean = js.native
  def inRange(start: scala.Double, end: scala.Double): scala.Boolean = js.native
  /**
    * @see _.includes
    */
  def includes[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    target: T
  ): scala.Boolean = js.native
  def includes[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    target: T,
    fromIndex: scala.Double
  ): scala.Boolean = js.native
  /**
    * @see _.indexOf
    */
  def indexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T): scala.Double = js.native
  def indexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T, fromIndex: scala.Double): scala.Double = js.native
  /**
    * @see _.initial
    */
  def initial[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersection
    */
  def intersection[T](`this`: LoDashImplicitWrapper[List[T]], arrays: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values: List[T2],
    iteratee: ValueIteratee[T1 | T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    iteratee: ValueIteratee[T1 | T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (ValueIteratee[T1 | T2 | T3 | T4]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values: List[T2],
    comparator: Comparator2[T1, T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | scala.Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.invert
    */
  def invert(): LoDashImplicitWrapper[Dictionary[java.lang.String]] = js.native
  /**
    * @see _.invertBy
    */
  def invertBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]]
  ): LoDashImplicitWrapper[Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    interatee: ValueIteratee[T]
  ): LoDashImplicitWrapper[Dictionary[js.Array[java.lang.String]]] = js.native
  /**
    * @see _.invertBy
    */
  @JSName("invertBy")
  def invertBy_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[Dictionary[js.Array[java.lang.String]]] = js.native
  @JSName("invertBy")
  def invertBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    interatee: ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashImplicitWrapper[Dictionary[js.Array[java.lang.String]]] = js.native
  /**
    * @see _.invoke
    **/
  def invoke(path: PropertyPath, args: js.Any*): js.Any = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap(methodName: java.lang.String, args: js.Any*): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: js.Any*): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.isArguments
    */
  def isArguments(): scala.Boolean = js.native
  /**
    * @see _.isArray
    */
  def isArray(): scala.Boolean = js.native
  /**
    * @see _.isArrayBuffer
    */
  def isArrayBuffer(): scala.Boolean = js.native
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(): scala.Boolean = js.native
  /**
    * @see _.isArrayLikeObject
    */
  def isArrayLikeObject(): scala.Boolean = js.native
  /**
    * @see _.isBoolean
    */
  def isBoolean(): scala.Boolean = js.native
  /**
    * @see _.isBuffer
    */
  def isBuffer(): scala.Boolean = js.native
  /**
    * @see _.isDate
    */
  def isDate(): scala.Boolean = js.native
  /**
    * @see _.isElement
    */
  def isElement(): scala.Boolean = js.native
  /**
    * @see _.isEmpty
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * @see _.isEqual
    */
  def isEqual(other: js.Any): scala.Boolean = js.native
  /**
    * @see _.isEqualWith
    */
  def isEqualWith(other: js.Any): scala.Boolean = js.native
  def isEqualWith(other: js.Any, customizer: IsEqualCustomizer): scala.Boolean = js.native
  /**
    * @see _.isError
    */
  def isError(): scala.Boolean = js.native
  /**
    * @see _.isFinite
    */
  def isFinite(): scala.Boolean = js.native
  /**
    * @see _.isFunction
    */
  def isFunction(): scala.Boolean = js.native
  /**
    * @see _.isInteger
    */
  def isInteger(): scala.Boolean = js.native
  /**
    * @see _.isLength
    */
  def isLength(): scala.Boolean = js.native
  /**
    * @see _.isMap
    */
  def isMap(): scala.Boolean = js.native
  /**
    * @see _.isMatch
    */
  def isMatch(source: js.Object): scala.Boolean = js.native
  /**
    * @see _.isMatchWith
    */
  def isMatchWith(source: js.Object, customizer: isMatchWithCustomizer): scala.Boolean = js.native
  /**
    * @see _.isNaN
    */
  def isNaN(): scala.Boolean = js.native
  /**
    * see _.isNative
    */
  def isNative(): scala.Boolean = js.native
  /**
    * see _.isNil
    */
  def isNil(): scala.Boolean = js.native
  /**
    * see _.isNull
    */
  def isNull(): scala.Boolean = js.native
  /**
    * see _.isNumber
    */
  def isNumber(): scala.Boolean = js.native
  /**
    * see _.isObject
    */
  def isObject(): /* is lodash.lodash.LoDashImplicitWrapper<object> */ scala.Boolean = js.native
  /**
    * see _.isObjectLike
    */
  def isObjectLike(): scala.Boolean = js.native
  /**
    * see _.isPlainObject
    */
  def isPlainObject(): scala.Boolean = js.native
  /**
    * see _.isRegExp
    */
  def isRegExp(): scala.Boolean = js.native
  /**
    * see _.isSafeInteger
    */
  def isSafeInteger(): scala.Boolean = js.native
  /**
    * @see _.isSet
    */
  def isSet(): scala.Boolean = js.native
  /**
    * see _.isString
    */
  def isString(): scala.Boolean = js.native
  /**
    * see _.isSymbol
    */
  def isSymbol(): scala.Boolean = js.native
  /**
    * see _.isTypedArray
    */
  def isTypedArray(): scala.Boolean = js.native
  /**
    * see _.isUndefined
    */
  def isUndefined(): scala.Boolean = js.native
  /**
    * @see _.isSet
    */
  def isWeakMap(): scala.Boolean = js.native
  /**
    * @see _.isWeakSet
    */
  def isWeakSet(): scala.Boolean = js.native
  /**
    * @see _.iteratee
    */
  def iteratee[TFunction /* <: js.Function1[/* repeated */ js.Any, _] */](`this`: LoDashImplicitWrapper[TFunction | java.lang.String | js.Object]): LoDashImplicitWrapper[TFunction] = js.native
  /**
    * @see _.join
    */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  /**
    * @see _.kebabCase
    */
  def kebabCase(): java.lang.String = js.native
  /**
    * @see _.keyBy
    */
  def keyBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  def keyBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: ValueIterateeCustom[T, PropertyName]
  ): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.keyBy
    */
  @JSName("keyBy")
  def keyBy_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("keyBy")
  def keyBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    iteratee: ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): LoDashImplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.keys
    */
  def keys(): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  /**
    * @see _.keysIn
    */
  def keysIn(): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  /**
    * @see _.last
    */
  def last[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.indexOf
    */
  def lastIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T): scala.Double = js.native
  def lastIndexOf[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    value: T,
    fromIndex: lodashLib.lodashLibNumbers.`true`
  ): scala.Double = js.native
  def lastIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T, fromIndex: scala.Double): scala.Double = js.native
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
  def lt(other: js.Any): scala.Boolean = js.native
  /**
    * @see _.lte
    */
  def lte(other: js.Any): scala.Boolean = js.native
  /**
    * @see _.map
    */
  def map[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | List[T] | scala.Null | NumericDictionary[T]]]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def map[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    iteratee: java.lang.String
  ): LoDashImplicitWrapper[js.Array[_]] = js.native
  def map[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    iteratee: js.Object
  ): LoDashImplicitWrapper[js.Array[scala.Boolean]] = js.native
  /** @see _.map */
  def map[T, K /* <: java.lang.String */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    iteratee: K
  ): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ] = js.native
  /**
    * @see _.map
    */
  def map[T /* <: js.Object */, TResult](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], iteratee: ObjectIterator[T, TResult]): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.mapKeys
    */
  def mapKeys[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  def mapKeys[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ListIteratee[T]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapKeys
    */
  @JSName("mapKeys")
  def mapKeys_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("mapKeys")
  def mapKeys_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], iteratee: ObjectIteratee[T]): LoDashImplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(`this`: LoDashImplicitWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashImplicitWrapper[NumericDictionary[java.lang.String]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[java.lang.String | scala.Null]],
    callback: StringIterator[TResult]
  ): LoDashImplicitWrapper[NumericDictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | scala.Null]],
    iteratee: java.lang.String
  ): LoDashImplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | scala.Null]],
    iteratee: js.Object
  ): LoDashImplicitWrapper[Dictionary[scala.Boolean]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T, TKey /* <: java.lang.String */](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | scala.Null]],
    iteratee: TKey
  ): LoDashImplicitWrapper[
    Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any]
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | scala.Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[T | (js.UndefOr[T | scala.Null])]): LoDashImplicitWrapper[T] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], iteratee: java.lang.String): LoDashImplicitWrapper[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ lodashLib.lodashLibStrings.LoDashImplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], iteratee: js.Object): LoDashImplicitWrapper[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ lodashLib.lodashLibStrings.LoDashImplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_TObjectTResult[T /* <: js.Object */, TResult](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], callback: ObjectIterator[T, TResult]): LoDashImplicitWrapper[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ lodashLib.lodashLibStrings.LoDashImplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_TTResult[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | scala.Null]],
    callback: DictionaryIterator[T, TResult]
  ): LoDashImplicitWrapper[Dictionary[TResult]] = js.native
  /**
    * @see _.map
    */
  @JSName("map")
  def map_TTResult[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | scala.Null]],
    iteratee: (ArrayIterator[T, TResult]) | (ListIterator[T, TResult])
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.matches
    */
  def matches[V](): LoDashImplicitWrapper[js.Function1[/* value */ V, scala.Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  def matchesProperty[SrcValue](srcValue: SrcValue): LoDashImplicitWrapper[js.Function1[/* value */ _, scala.Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): LoDashImplicitWrapper[js.Function1[/* value */ Value, scala.Boolean]] = js.native
  /**
    * @see _.max
    */
  def max[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.maxBy
    */
  def maxBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  def maxBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  /**
    * @see _.mean
    */
  def mean(): scala.Double = js.native
  /**
    * @see _.meanBy
    */
  def meanBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): scala.Double = js.native
  def meanBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): scala.Double = js.native
  /**
    * @see _.memoize
    */
  def memoize(): LoDashImplicitWrapper[TValue with MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */ js.Any, _]): LoDashImplicitWrapper[TValue with MemoizedFunction] = js.native
  /**
    * @see _.merge
    */
  def merge(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource](source: TSource, customizer: MergeWithCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: MergeWithCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.method
    */
  def method(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* object */ _, _]] = js.native
  /**
    * @see _.methodOf
    */
  def methodOf(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  /**
    * @see _.min
    */
  def min[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.minBy
    */
  def minBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  def minBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  /**
    * @see _.mixin
    */
  def mixin(): LoDashImplicitWrapper[LoDashStatic] = js.native
  def mixin(options: MixinOptions): LoDashImplicitWrapper[LoDashStatic] = js.native
  /**
    * @see _.mixin
    */
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]]): this.type = js.native
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]], options: MixinOptions): this.type = js.native
  /**
    * @see _.multiply
    */
  def multiply(multiplicand: scala.Double): scala.Double = js.native
  /**
    * @see _.negate
    */
  def negate(`this`: LoDashImplicitWrapper[js.Function0[scala.Boolean] | (js.Function1[/* repeated */ _, _])]): LoDashImplicitWrapper[js.Function0[scala.Boolean]] = js.native
  @JSName("negate")
  def negate_A1[A1](`this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, scala.Boolean]]): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, scala.Boolean]] = js.native
  @JSName("negate")
  def negate_A1A2[A1, A2](`this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, scala.Boolean]]): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, scala.Boolean]] = js.native
  /**
    * @see _.noConflict
    */
  def noConflict(): LoDashStatic = js.native
  /**
    * @see _.noop
    */
  def noop(args: js.Any*): scala.Unit = js.native
  /**
    * @see _.now
    */
  def now(): scala.Double = js.native
  /**
    * @see _.nth
    */
  def nth[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  def nth[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], n: scala.Double): js.UndefOr[T] = js.native
  /**
    * @see _.nthArg
    */
  def nthArg(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.omit
    */
  def omit[T /* <: AnyKindOfDictionary */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], paths: Many[PropertyName]*): LoDashImplicitWrapper[T] = js.native
  /**
    * @see _.omitBy
    */
  def omitBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | scala.Null | NumericDictionary[T]]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  def omitBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | scala.Null | NumericDictionary[T]]],
    predicate: ValueKeyIteratee[T]
  ): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.omitBy
    */
  @JSName("omitBy")
  def omitBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashImplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], paths: Many[PropertyName]*): LoDashImplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_TObjectKString[T /* <: js.Object */, K /* <: java.lang.String */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], paths: Many[K]*): LoDashImplicitWrapper[Omit[T, K]] = js.native
  /**
    * @see _.orderBy
    */
  def orderBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def orderBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def orderBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])],
    orders: Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.orderBy
    */
  @JSName("orderBy")
  def orderBy_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("orderBy")
  def orderBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[scala.Null | T]],
    iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]
  ): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("orderBy")
  def orderBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[scala.Null | T]],
    iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])],
    orders: Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.over
    */
  def over[TResult](
    `this`: LoDashImplicitWrapper[Many[js.Function1[/* repeated */ _, TResult]]],
    iteratees: (Many[js.Function1[/* repeated */ _, TResult]])*
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, js.Array[TResult]]] = js.native
  /**
    * @see _.overArgs
    */
  def overArgs(transforms: (Many[js.Function1[/* repeated */ _, _]])*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.overEvery
    */
  def overEvery[T](predicates: (Many[js.Function1[/* repeated */ T, scala.Boolean]])*): LoDashImplicitWrapper[js.Function1[/* repeated */ T, scala.Boolean]] = js.native
  /**
    * @see _.overSome
    */
  def overSome[T](predicates: (Many[js.Function1[/* repeated */ T, scala.Boolean]])*): LoDashImplicitWrapper[js.Function1[/* repeated */ T, scala.Boolean]] = js.native
  /**
    * @see _.pad
    */
  def pad(): java.lang.String = js.native
  def pad(length: scala.Double): java.lang.String = js.native
  def pad(length: scala.Double, chars: java.lang.String): java.lang.String = js.native
  /**
    * @see _.padEnd
    */
  def padEnd(): java.lang.String = js.native
  def padEnd(length: scala.Double): java.lang.String = js.native
  def padEnd(length: scala.Double, chars: java.lang.String): java.lang.String = js.native
  /**
    * @see _.padStart
    */
  def padStart(): java.lang.String = js.native
  def padStart(length: scala.Double): java.lang.String = js.native
  def padStart(length: scala.Double, chars: java.lang.String): java.lang.String = js.native
  /**
    * @see _.parseInt
    */
  def parseInt(): scala.Double = js.native
  def parseInt(radix: scala.Double): scala.Double = js.native
  // catch-all
  /**
    * @see _.partial
    */
  def partial(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partial
    */
  def partial[R](`this`: LoDashImplicitWrapper[Function0[R]]): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]], arg1: T1): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], plc1: __, arg2: T2): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, arg3: T3): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, plc2: __, arg3: T3): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  // catch-all
  /**
    * @see _.partialRight
    */
  def partialRight(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partialRight
    */
  def partialRight[R](`this`: LoDashImplicitWrapper[Function0[R]]): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]], arg1: T1): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1, plc2: __): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, plc3: __): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, arg3: T3): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, plc3: __): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    plc4: __
  ): LoDashImplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    plc4: __
  ): LoDashImplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    plc4: __
  ): LoDashImplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    plc4: __
  ): LoDashImplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  // arity 1
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1R[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]]): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]]): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg2: T2): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  // arity 3
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]]): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg2: T2, arg3: T3): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg2: T2, plc3: __): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg3: T3): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  // arity 4
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]]): LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, arg3: T3, arg4: T4): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, arg3: T3, plc4: __): LoDashImplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, plc3: __, arg4: T4): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, plc3: __, plc4: __): LoDashImplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg3: T3, arg4: T4): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg3: T3, plc4: __): LoDashImplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg4: T4): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  // arity 1
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1R[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]]): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]]): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  // arity 3
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]]): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, arg2: T2): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  // arity 4
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]]): LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1): LoDashImplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, plc2: __, arg3: T3): LoDashImplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, arg2: T2): LoDashImplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, plc2: __, arg3: T3): LoDashImplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  /**
    * @see _.partition
    */
  def partition[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null | T]],
    callback: ValueIteratee[
      (/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): LoDashImplicitWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  /**
    * @see _.pick
    */
  def pick[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], props: PropertyPath*): LoDashImplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | scala.Null | NumericDictionary[T]]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  def pickBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | scala.Null | NumericDictionary[T]]],
    predicate: ValueKeyIteratee[T]
  ): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | scala.Null | NumericDictionary[T]]],
    predicate: ValueKeyIterateeTypeGuard[T, S]
  ): LoDashImplicitWrapper[Dictionary[S]] = js.native
  /**
    * @see _.pickBy
    */
  @JSName("pickBy")
  def pickBy_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[PartialObject[T]] = js.native
  @JSName("pickBy")
  def pickBy_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ): LoDashImplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.pick
    */
  @JSName("pick")
  def pick_TObjectUString[T /* <: js.Object */, U /* <: java.lang.String */](`this`: LoDashImplicitWrapper[T], props: Many[U]*): LoDashImplicitWrapper[stdLib.Pick[T, U]] = js.native
  /**
    * Creates a clone of the chained sequence planting value as the wrapped value.
    * @param value The value to plant as the wrapped value.
    * @return Returns the new lodash wrapper instance.
    */
  def plant[T](value: T): LoDashImplicitWrapper[T] = js.native
  def pop[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.property
    */
  def property[TObj, TResult](): LoDashImplicitWrapper[js.Function1[/* obj */ TObj, TResult]] = js.native
  /**
    * @see _.propertyOf
    */
  def propertyOf(): LoDashImplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  /**
    * @see _.pull
    */
  def pull[T](`this`: LoDashImplicitWrapper[List[T]], values: T*): this.type = js.native
  /**
    * @see _.pullAll
    */
  def pullAll[T](`this`: LoDashImplicitWrapper[List[T]]): this.type = js.native
  def pullAll[T](`this`: LoDashImplicitWrapper[List[T]], values: List[T]): this.type = js.native
  def push[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], items: T*): this.type = js.native
  /**
    * @see _.random
    */
  def random(): scala.Double = js.native
  def random(floating: scala.Boolean): scala.Double = js.native
  /**
    * @see _.random
    */
  def random(max: scala.Double): scala.Double = js.native
  def random(max: scala.Double, floating: scala.Boolean): scala.Double = js.native
  /**
    * @see _.range
    */
  def range(): LoDashImplicitWrapper[js.Array[scala.Double]] = js.native
  def range(end: scala.Double): LoDashImplicitWrapper[js.Array[scala.Double]] = js.native
  def range(end: scala.Double, step: scala.Double): LoDashImplicitWrapper[js.Array[scala.Double]] = js.native
  /**
    * @see _.rangeRight
    */
  def rangeRight(): LoDashImplicitWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(end: scala.Double): LoDashImplicitWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(end: scala.Double, step: scala.Double): LoDashImplicitWrapper[js.Array[scala.Double]] = js.native
  /**
    * @see _.rearg
    */
  def rearg(indexes: Many[scala.Double]*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | scala.Null]],
    callback: MemoListIterator[T, T, js.Array[T] | List[T]]
  ): js.UndefOr[T] = js.native
  /**
    * @see _.reduce
    **/
  /**
    * @see _.reduce
    **/
  def reduce[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | scala.Null]],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | scala.Null]],
    callback: MemoListIterator[T, T, js.Array[T] | List[T]]
  ): js.UndefOr[T] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | scala.Null]],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_TObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_TObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    callback: MemoObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reject
    */
  def reject(`this`: LoDashImplicitWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def reject(
    `this`: LoDashImplicitWrapper[js.UndefOr[java.lang.String | scala.Null]],
    predicate: StringIterator[scala.Boolean]
  ): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def reject[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("reject")
  def reject_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.remove
    */
  def remove[T](`this`: LoDashImplicitWrapper[List[T]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def remove[T](`this`: LoDashImplicitWrapper[List[T]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.repeat
    */
  def repeat(): java.lang.String = js.native
  def repeat(n: scala.Double): java.lang.String = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def replace(pattern: java.lang.String, replacement: ReplaceFunction): java.lang.String = js.native
  def replace(pattern: stdLib.RegExp, replacement: java.lang.String): java.lang.String = js.native
  /**
    * @see _.replace
    */
  def replace(pattern: stdLib.RegExp, replacement: ReplaceFunction): java.lang.String = js.native
  def replace(replacement: java.lang.String): java.lang.String = js.native
  /**
    * @see _.replace
    */
  def replace(replacement: ReplaceFunction): java.lang.String = js.native
  /**
    * @see _.rest
    */
  def rest(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def rest(start: scala.Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.result
    */
  def result[TResult](path: PropertyPath): TResult = js.native
  def result[TResult](path: PropertyPath, defaultValue: TResult): TResult = js.native
  def result[TResult](path: PropertyPath, defaultValue: js.Function1[/* repeated */ js.Any, TResult]): TResult = js.native
  /**
    * @see _.round
    */
  def round(): scala.Double = js.native
  def round(precision: scala.Double): scala.Double = js.native
  /**
    * @see _.runInContext
    */
  def runInContext(): LoDashStatic = js.native
  /**
    * @see _.sample
    */
  def sample[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]]
  ): js.UndefOr[T] = js.native
  /**
    * @see _.sampleSize
    */
  def sampleSize[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def sampleSize[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]],
    n: scala.Double
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sampleSize
    */
  @JSName("sampleSize")
  def sampleSize_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("sampleSize")
  def sampleSize_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], n: scala.Double): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.sample
    */
  @JSName("sample")
  def sample_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
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
  def setWith_TResultLoDashImplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashImplicitWrapper[TResult] = js.native
  @JSName("setWith")
  def setWith_TResultLoDashImplicitWrapper[TResult](path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[TValue]): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.set
    */
  @JSName("set")
  def set_TResultLoDashImplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashImplicitWrapper[TResult] = js.native
  def shift[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.shuffle
    */
  def shuffle[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.shuffle
    */
  @JSName("shuffle")
  def shuffle_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.size
    */
  def size(): scala.Double = js.native
  /**
    * @see _.slice
    */
  def slice[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def slice[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], start: scala.Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  def slice[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    start: scala.Double,
    end: scala.Double
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.snakeCase
    */
  def snakeCase(): java.lang.String = js.native
  /**
    * @see _.some
    */
  def some[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): scala.Boolean = js.native
  def some[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    predicate: ListIterateeCustom[T, scala.Boolean]
  ): scala.Boolean = js.native
  /**
    * @see _.some
    */
  @JSName("some")
  def some_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): scala.Boolean = js.native
  @JSName("some")
  def some_TObject[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]],
    predicate: ObjectIterateeCustom[T, scala.Boolean]
  ): scala.Boolean = js.native
  def sort[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): this.type = js.native
  def sort[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]
  ): this.type = js.native
  /**
    * @see _.sortBy
    */
  def sortBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratees: Many[ListIteratee[T]]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sortBy
    */
  @JSName("sortBy")
  def sortBy_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]], iteratees: Many[ObjectIteratee[T]]*): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.sortedIndex
    */
  def sortedIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T): scala.Double = js.native
  /**
    * @see _.sortedIndexBy
    */
  def sortedIndexBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T): scala.Double = js.native
  def sortedIndexBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    value: T,
    iteratee: ValueIteratee[T]
  ): scala.Double = js.native
  /**
    * @see _.sortedIndexOf
    */
  def sortedIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T): scala.Double = js.native
  /**
    * @see _.sortedLastIndex
    */
  def sortedLastIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T): scala.Double = js.native
  /**
    * @see _.sortedLastIndexBy
    */
  def sortedLastIndexBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    value: T,
    iteratee: ValueIteratee[T]
  ): scala.Double = js.native
  /**
    * @see _.sortedLastIndexOf
    */
  def sortedLastIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], value: T): scala.Double = js.native
  /**
    * @see _.sortedUniq
    */
  def sortedUniq[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sortedUniqBy
    */
  def sortedUniqBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def splice[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], start: scala.Double): this.type = js.native
  def splice[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    start: scala.Double,
    deleteCount: scala.Double,
    items: T*
  ): this.type = js.native
  /**
    * @see _.split
    */
  def split(): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String, limit: scala.Double): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp, limit: scala.Double): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](`this`: LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]]): LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](`this`: LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]], start: scala.Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.startCase
    */
  def startCase(): java.lang.String = js.native
  /**
    * @see _.startsWith
    */
  def startsWith(): scala.Boolean = js.native
  def startsWith(target: java.lang.String): scala.Boolean = js.native
  def startsWith(target: java.lang.String, position: scala.Double): scala.Boolean = js.native
  /**
    * @see _.stubArray
    */
  def stubArray(): js.Array[_] = js.native
  /**
    * @see _.stubFalse
    */
  def stubFalse(): lodashLib.lodashLibNumbers.`false` = js.native
  /**
    * @see _.stubObject
    */
  def stubObject(): js.Any = js.native
  /**
    * @see _.stubString
    */
  def stubString(): java.lang.String = js.native
  /**
    * @see _.stubTrue
    */
  def stubTrue(): lodashLib.lodashLibNumbers.`true` = js.native
  /**
    * @see _.subtract
    */
  def subtract(subtrahend: scala.Double): scala.Double = js.native
  /**
    * @see _.sum
    */
  def sum(): scala.Double = js.native
  /**
    * @see _.sumBy
    */
  def sumBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): scala.Double = js.native
  def sumBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: java.lang.String): scala.Double = js.native
  def sumBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: js.Function1[/* value */ T, scala.Double]
  ): scala.Double = js.native
  /**
    * @see _.tail
    */
  def tail[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.take
    */
  def take[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def take[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], n: scala.Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeRight
    */
  def takeRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def takeRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], n: scala.Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeRightWhile
    */
  def takeRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeWhile
    */
  def takeWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def takeWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.template
    */
  def template(): TemplateExecutor = js.native
  def template(options: TemplateOptions): TemplateExecutor = js.native
  /**
    * @see _.throttle
    */
  def throttle(): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: scala.Double): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: scala.Double, options: ThrottleSettings): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  /**
    * @see _.thru
    */
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.times
    */
  def times(): js.Array[scala.Double] = js.native
  /**
    * @see _.times
    */
  def times[TResult](iteratee: js.Function1[/* num */ scala.Double, TResult]): js.Array[TResult] = js.native
  /**
    * @see _.toArray
    */
  def toArray[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | scala.Null]]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.toArray
    */
  @JSName("toArray")
  def toArray_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[T]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.toFinite
    */
  def toFinite(): scala.Double = js.native
  /**
    * @see _.toInteger
    */
  def toInteger(): scala.Double = js.native
  /**
    * @see _.toLength
    */
  def toLength(): scala.Double = js.native
  /**
    * @see _.toLower
    */
  def toLower(): java.lang.String = js.native
  /**
    * @see _.toNumber
    */
  def toNumber(): scala.Double = js.native
  /**
    * @see _.toPairs
    */
  def toPairs(): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  /**
    * @see _.toPairs
    */
  def toPairs[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  /**
    * @see _.toPairsIn
    */
  def toPairsIn(): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  /**
    * @see _.toPairsIn
    */
  def toPairsIn[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  /**
    * @see _.toPath
    */
  def toPath(): LoDashImplicitWrapper[js.Array[java.lang.String]] = js.native
  /**
    * @see _.toPlainObject
    */
  def toPlainObject(): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.toSafeInteger
    */
  def toSafeInteger(): scala.Double = js.native
  /**
    * @see _.toUpper
    */
  def toUpper(): java.lang.String = js.native
  /**
    * @see _.transform
    */
  def transform(): LoDashImplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.transform
    */
  def transform(`this`: LoDashImplicitWrapper[js.Array[_]]): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `this`: LoDashImplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult]]) | (MemoVoidDictionaryIterator[T, Dictionary[TResult]])
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `this`: LoDashImplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult]]) | (MemoVoidDictionaryIterator[T, js.Array[TResult]]),
    accumulator: js.Array[TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `this`: LoDashImplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, Dictionary[TResult]]) | (MemoVoidDictionaryIterator[T, Dictionary[TResult]]),
    accumulator: Dictionary[TResult]
  ): LoDashImplicitWrapper[Dictionary[TResult]] = js.native
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
    * @see _.unary
    */
  def unary[T, TResult](`this`: LoDashImplicitWrapper[js.Function2[/* arg1 */ T, /* repeated */ _, TResult]]): LoDashImplicitWrapper[js.Function1[/* arg1 */ T, TResult]] = js.native
  /**
    * @see _.unescape
    */
  def unescape(): java.lang.String = js.native
  /**
    * @see _.union
    */
  def union[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays: (js.UndefOr[List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: scala.Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T],
    arrays5: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: scala.Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: List[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: scala.Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], comparator: Comparator[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniq
    */
  def uniq[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqBy
    */
  def uniqBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqWith
    */
  def uniqWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def uniqWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], comparator: Comparator[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqueId
    */
  def uniqueId(): java.lang.String = js.native
  /**
    * @see _.unset
    */
  def unset(path: PropertyPath): LoDashImplicitWrapper[scala.Boolean] = js.native
  def unshift[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], items: T*): this.type = js.native
  /**
    * @see _.unzip
    */
  def unzip[T](`this`: LoDashImplicitWrapper[js.UndefOr[js.Array[js.Array[T]] | List[List[T]] | scala.Null]]): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[List[T]] | scala.Null]]): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[List[T]] | scala.Null]],
    iteratee: js.Function1[/* repeated */ T, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.update
    */
  def update(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LoDashImplicitWrapper[_] = js.native
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
  def updateWith_TResultLoDashImplicitWrapper[TResult](path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LoDashImplicitWrapper[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResultLoDashImplicitWrapper[TResult](
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[TValue]
  ): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.upperCase
    */
  def upperCase(): java.lang.String = js.native
  /**
    * @see _.upperFirst
    */
  def upperFirst(): java.lang.String = js.native
  /**
    * @see _.values
    */
  def values(): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.values
    */
  def values[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | List[T] | scala.Null]]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.valuesIn
    */
  def valuesIn[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | List[T] | scala.Null]]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.valuesIn
    */
  @JSName("valuesIn")
  def valuesIn_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.values
    */
  @JSName("values")
  def values_TObject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]): LoDashImplicitWrapper[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  /**
    * @see _.without
    */
  def without[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], values: T*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.words
    */
  def words(): js.Array[java.lang.String] = js.native
  def words(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def words(pattern: stdLib.RegExp): js.Array[java.lang.String] = js.native
  /**
    * @see _.wrap
    */
  def wrap[TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ js.Any, TResult]): LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.wrap
    */
  @JSName("wrap")
  def wrap_TArgsTResult[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ TArgs, TResult]): LoDashImplicitWrapper[js.Function1[/* repeated */ TArgs, TResult]] = js.native
  /**
    * @see _.xor
    */
  def xor[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays: (js.UndefOr[List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xor
    */
  def xorBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: List[T],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays2: scala.Null,
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    comparator: (js.UndefOr[Comparator[T] | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]], comparator: Comparator[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.zip
    */
  def zip[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    arrays: (js.UndefOr[List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[js.Array[js.UndefOr[T]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2](`this`: LoDashImplicitWrapper[List[T1]], arrays2: List[T2]): LoDashImplicitWrapper[js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3](`this`: LoDashImplicitWrapper[List[T1]], arrays2: List[T2], arrays3: List[T3]): LoDashImplicitWrapper[js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4](`this`: LoDashImplicitWrapper[List[T1]], arrays2: List[T2], arrays3: List[T3], arrays4: List[T4]): LoDashImplicitWrapper[
    js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]]
  ] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4, T5](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    arrays5: List[T5]
  ): LoDashImplicitWrapper[
    js.Array[
      js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
    ]
  ] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject(`this`: LoDashImplicitWrapper[List[PropertyName]]): LoDashImplicitWrapper[Dictionary[js.UndefOr[scala.Nothing]]] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject[T](`this`: LoDashImplicitWrapper[List[PropertyName]], values: List[T]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.zipObjectDeep
    */
  def zipObjectDeep(`this`: LoDashImplicitWrapper[List[PropertyPath]]): LoDashImplicitWrapper[js.Object] = js.native
  def zipObjectDeep(`this`: LoDashImplicitWrapper[List[PropertyPath]], values: List[_]): LoDashImplicitWrapper[js.Object] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | scala.Null]],
    iteratee: (js.UndefOr[(js.Function1[/* repeated */ T, TResult]) | List[T] | scala.Null])*
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](`this`: LoDashImplicitWrapper[List[T]], iteratee: js.Function1[/* value1 */ T, TResult]): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    iteratee: js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    iteratee: js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, T5, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
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
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
}

