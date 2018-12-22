package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: this interface is augmented in _lodash.d.ts
@js.native
trait LoDashExplicitSyncWrapper[TValue]
  extends lodashLib.lodashMod.underscoreNs.LoDashWrapper[TValue] {
  @JSName("partialRight")
  var partialRight_Original: lodashLib.lodashMod.underscoreNs.ExplicitPartialRight = js.native
  @JSName("partial")
  var partial_Original: lodashLib.lodashMod.underscoreNs.ExplicitPartial = js.native
  def add(addend: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def after[TFunc /* <: js.Function1[/* repeated */js.Any, _] */](func: TFunc): LoDashExplicitSyncWrapper[TFunc] = js.native
  def ary(): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def ary(n: scala.Double): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def assign(): LoDashExplicitSyncWrapper[TValue] = js.native
  def assign(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def assign[TSource](source: TSource): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def assignIn(): LoDashExplicitSyncWrapper[TValue] = js.native
  def assignIn(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def assignIn[TSource](source: TSource): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def assignInWith(): LoDashExplicitSyncWrapper[TValue] = js.native
  def assignInWith(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def assignInWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def assignInWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assignInWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def assignWith(): LoDashExplicitSyncWrapper[TValue] = js.native
  def assignWith(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def assignWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def assignWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assignWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def at[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    props: lodashLib.lodashMod.underscoreNs.Many[java.lang.String]*
  ): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("at")
  def at_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    props: lodashLib.lodashMod.underscoreNs.PropertyPath*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def attempt[TResult](args: js.Any*): LoDashExplicitSyncWrapper[TResult | stdLib.Error] = js.native
  def before[TFunc /* <: js.Function1[/* repeated */js.Any, _] */](func: TFunc): LoDashExplicitSyncWrapper[TFunc] = js.native
  def bind(thisArg: js.Any, partials: js.Any*): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def bindKey(key: java.lang.String, partials: js.Any*): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def camelCase(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def capitalize(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def castArray[T](`this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Many[T]]): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def ceil(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def ceil(precision: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def chain(): this.type = js.native
  def chunk[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[js.Array[T]]] = js.native
  def chunk[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    size: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[js.Array[T]]] = js.native
  def clamp(lower: scala.Double, upper: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def clamp(upper: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def cloneDeep(): this.type = js.native
  def cloneDeepWith(): this.type = js.native
  def cloneDeepWith(customizer: lodashLib.lodashMod.underscoreNs.CloneDeepWithCustomizer[TValue]): LoDashExplicitSyncWrapper[_] = js.native
  def cloneWith(): this.type = js.native
  def cloneWith[TResult](customizer: lodashLib.lodashMod.underscoreNs.CloneWithCustomizer[TValue, js.UndefOr[TResult]]): LoDashExplicitSyncWrapper[TResult | TValue] = js.native
  @JSName("cloneWith")
  def `cloneWith_TResult<union>`[TResult /* <: js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null */](customizer: lodashLib.lodashMod.underscoreNs.CloneWithCustomizer[TValue, TResult]): LoDashExplicitSyncWrapper[TResult] = js.native
  @JSName("compact")
  def `compact_`[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[
          js.UndefOr[
            T | scala.Null | lowdbLib.lowdbLibNumbers.`false` | lowdbLib.lowdbLibStrings.Empty | lowdbLib.lowdbLibNumbers.`0`
          ]
        ]) | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def concat[T](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Many[T]],
    values: lodashLib.lodashMod.underscoreNs.Many[T]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def conforms[T](`this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.ConformsPredicateObject[T]]): LoDashExplicitSyncWrapper[js.Function1[/* value */ T, scala.Boolean]] = js.native
  def conformsTo[T](
    `this`: LoDashExplicitSyncWrapper[T],
    source: lodashLib.lodashMod.underscoreNs.ConformsPredicateObject[T]
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def constant(): LoDashExplicitSyncWrapper[js.Function0[TValue]] = js.native
  def countBy[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  def countBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  @JSName("countBy")
  def countBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  @JSName("countBy")
  def countBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  def create[U /* <: js.Object */](): LoDashExplicitSyncWrapper[TValue with U] = js.native
  def create[U /* <: js.Object */](properties: U): LoDashExplicitSyncWrapper[TValue with U] = js.native
  def curry(): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curry(arity: scala.Double): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curry[T1, R](`this`: LoDashExplicitSyncWrapper[js.Function1[/* t1 */ T1, R]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction1[T1, R]] = js.native
  def curryRight(): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curryRight(arity: scala.Double): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curryRight[T1, R](`this`: LoDashExplicitSyncWrapper[js.Function1[/* t1 */ T1, R]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction1[T1, R]] = js.native
  def curryRight[T1, R](`this`: LoDashExplicitSyncWrapper[js.Function1[/* t1 */ T1, R]], arity: scala.Double): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction1[T1, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashExplicitSyncWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashExplicitSyncWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]], arity: scala.Double): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitSyncWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]],
    arity: scala.Double
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashExplicitSyncWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashExplicitSyncWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]],
    arity: scala.Double
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitSyncWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitSyncWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]],
    arity: scala.Double
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](`this`: LoDashExplicitSyncWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction2[T1, T2, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitSyncWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashExplicitSyncWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitSyncWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  def debounce(): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def debounce(wait: scala.Double): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def debounce(wait: scala.Double, options: lodashLib.lodashMod.underscoreNs.DebounceSettings): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def deburr(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def defaultTo[T](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]], defaultValue: T): LoDashExplicitSyncWrapper[T] = js.native
  @JSName("defaultTo")
  def defaultTo_TTDefault[T, TDefault](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]], defaultValue: TDefault): LoDashExplicitSyncWrapper[T | TDefault] = js.native
  def defaults(): LoDashExplicitSyncWrapper[TValue] = js.native
  def defaults(sources: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def defaults[TSource](source: TSource): LoDashExplicitSyncWrapper[TSource with TValue] = js.native
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitSyncWrapper[TSource2 with TSource1 with TValue] = js.native
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitSyncWrapper[TSource3 with TSource2 with TSource1 with TValue] = js.native
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitSyncWrapper[TSource4 with TSource3 with TSource2 with TSource1 with TValue] = js.native
  def defaultsDeep(sources: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def defer(args: js.Any*): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def delay(wait: scala.Double, args: js.Any*): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def difference[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def differenceBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def differenceBy[T1, T2](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4, T5](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    values4: lodashLib.lodashMod.underscoreNs.List[T5],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    values4: lodashLib.lodashMod.underscoreNs.List[T5],
    values5: lodashLib.lodashMod.underscoreNs.List[T6],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    values4: lodashLib.lodashMod.underscoreNs.List[T5],
    values5: lodashLib.lodashMod.underscoreNs.List[T6],
    values: (lodashLib.lodashMod.underscoreNs.List[T7] | (lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def differenceWith[T1, T2](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceWith[T1, T2, T3](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def differenceWith[T1, T2, T3, T4](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values: (lodashLib.lodashMod.underscoreNs.List[T4] | (lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def divide(divisor: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def drop[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def drop[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def dropRight[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def dropRight[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def dropWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def dropWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def endsWith(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def endsWith(target: java.lang.String): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def endsWith(target: java.lang.String, position: scala.Double): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def entries(): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def entries[T](
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  def entriesIn(): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def entriesIn[T](
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  // Note: we can't use TValue here,  because it generates a typescript error when strictFunctionTypes is enabled.
  def eq(other: js.Any): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def escape(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def escapeRegExp(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def every[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def every[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  @JSName("every")
  def every_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  @JSName("every")
  def every_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def extend(): LoDashExplicitSyncWrapper[TValue] = js.native
  def extend(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def extend[TSource](source: TSource): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def extendWith(): LoDashExplicitSyncWrapper[TValue] = js.native
  def extendWith(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def extendWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def extendWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def extendWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def fill[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[_] | lodashLib.lodashMod.underscoreNs.List[_] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def fill[T, U](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[U] | lodashLib.lodashMod.underscoreNs.List[U] | scala.Null]],
    value: T,
    start: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T | U]] = js.native
  def fill[T, U](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[U] | lodashLib.lodashMod.underscoreNs.List[U] | scala.Null]],
    value: T,
    start: scala.Double,
    end: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T | U]] = js.native
  @JSName("fill")
  def fill_TU[T, U](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[U] | lodashLib.lodashMod.underscoreNs.List[U] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[js.Array[T | U]] = js.native
  def filter(`this`: LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def filter(
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.StringIterator[scala.Boolean]
  ): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def filter[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("filter")
  def filter_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("filter")
  def filter_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("filter")
  def filter_TObject[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("filter")
  def filter_TObjectSAny[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S]
  ): LoDashExplicitSyncWrapper[js.Array[S]] = js.native
  @JSName("filter")
  def filter_TST[T, S /* <: T */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S]
  ): LoDashExplicitSyncWrapper[js.Array[S]] = js.native
  def find[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def find[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def find[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S]
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  def findIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def findIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def findIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def findKey[T](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String]] = js.native
  def findKey[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]
  ): LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String]] = js.native
  def findLast[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def findLast[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def findLast[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S]
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def findLastKey[T](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String]] = js.native
  def findLastKey[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]
  ): LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String]] = js.native
  @JSName("findLast")
  def findLast_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("findLast")
  def findLast_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("findLast")
  def findLast_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("findLast")
  def findLast_TST[T, S /* <: T */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S]
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  @JSName("findLast")
  def findLast_TST[T, S /* <: T */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("find")
  def find_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("find")
  def find_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("find")
  def find_TST[T, S /* <: T */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S]
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_TST[T, S /* <: T */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[js.UndefOr[S]] = js.native
  def first[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def flatMap(): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def flatMap(iteratee: java.lang.String): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def flatMap(iteratee: js.Object): LoDashExplicitSyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMap[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.Many[T]] | lodashLib.lodashMod.underscoreNs.Dictionary[lodashLib.lodashMod.underscoreNs.Many[T]] | lodashLib.lodashMod.underscoreNs.NumericDictionary[lodashLib.lodashMod.underscoreNs.Many[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def flatMap[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, lodashLib.lodashMod.underscoreNs.Many[TResult]]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def flatMapDeep(`this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: java.lang.String): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def flatMapDeep(`this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: js.Object): LoDashExplicitSyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMapDeep[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.Dictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.NumericDictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def flatMapDeep[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def flatMapDepth(`this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: java.lang.String): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def flatMapDepth(
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Object | scala.Null]],
    iteratee: java.lang.String,
    depth: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def flatMapDepth(`this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: js.Object): LoDashExplicitSyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMapDepth(
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Object | scala.Null]],
    iteratee: js.Object,
    depth: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMapDepth[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.Dictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.NumericDictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[T, lodashLib.lodashMod.underscoreNs.Many[TResult]]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def flatten[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.Many[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def flattenDeep[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | scala.Null]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def flattenDepth[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | scala.Null]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def flattenDepth[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | scala.Null]
    ],
    depth: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def floor(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def floor(precision: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def flow(
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]],
    funcs: js.Array[lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]]]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  // 0-argument first function
  def flow[R1, R2](`this`: LoDashExplicitSyncWrapper[js.Function0[R1]], f2: js.Function1[/* a */ R1, R2]): LoDashExplicitSyncWrapper[js.Function0[R2]] = js.native
  def flow[R1, R2, R3](
    `this`: LoDashExplicitSyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitSyncWrapper[js.Function0[R3]] = js.native
  def flow[R1, R2, R3, R4](
    `this`: LoDashExplicitSyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitSyncWrapper[js.Function0[R4]] = js.native
  def flow[R1, R2, R3, R4, R5](
    `this`: LoDashExplicitSyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitSyncWrapper[js.Function0[R5]] = js.native
  def flow[R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitSyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitSyncWrapper[js.Function0[R6]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitSyncWrapper[js.Function0[R7]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitSyncWrapper[js.Function0[_]] = js.native
  def flowRight(
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ _, _]],
    f6: js.Function1[/* a */ js.Any, _],
    f5: js.Function1[/* a */ js.Any, _],
    f4: js.Function1[/* a */ js.Any, _],
    f3: js.Function1[/* a */ js.Any, _],
    f2: js.Function1[/* a */ js.Any, _],
    f1: js.Function0[_],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, _]])*
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def flowRight(
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ _, _]],
    funcs: js.Array[lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, _]]]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  // 0-argument first function
  def flowRight[R2, R1](`this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function0[R1]): LoDashExplicitSyncWrapper[js.Function0[R2]] = js.native
  // any-argument first function
  def flowRight[R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, R2]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitSyncWrapper[js.Function0[R3]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, R3]] = js.native
  // 2-argument first function
  def flowRight[A1, A2, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitSyncWrapper[js.Function0[R4]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, R4]] = js.native
  // 3-argument first function
  def flowRight[A1, A2, A3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  def flowRight[A1, A2, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitSyncWrapper[js.Function0[R5]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, R5]] = js.native
  // 4-argument first function
  def flowRight[A1, A2, A3, A4, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  def flowRight[A1, A2, A3, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  def flowRight[A1, A2, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitSyncWrapper[js.Function0[R6]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  def flowRight[A1, A2, A3, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  def flowRight[A1, A2, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitSyncWrapper[js.Function0[R7]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  def flowRight[A1, A2, A3, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  def flowRight[A1, A2, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  def flowRight[A1, A2, A3, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  def flowRight[A1, A2, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  def flowRight[A1, A2, A3, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  // 1-argument first function
  @JSName("flowRight")
  def flowRight_A1R2R1[A1, R2, R1](`this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function1[/* a1 */ A1, R1]): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flowRight")
  def flowRight_A1R3R2R1[A1, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flowRight")
  def flowRight_A1R4R3R2R1[A1, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flowRight")
  def flowRight_A1R5R4R3R2R1[A1, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flowRight")
  def flowRight_A1R6R5R4R3R2R1[A1, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flowRight")
  def flowRight_A1R7R6R5R4R3R2R1[A1, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  // 4-argument first function
  // any-argument first function
  @JSName("flow")
  def flow_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    `this`: LoDashExplicitSyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    `this`: LoDashExplicitSyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    `this`: LoDashExplicitSyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitSyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitSyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitSyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _]] = js.native
  // 3-argument first function
  @JSName("flow")
  def flow_A1A2A3R1R2[A1, A2, A3, R1, R2](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5[A1, A2, A3, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitSyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _]] = js.native
  // 2-argument first function
  @JSName("flow")
  def flow_A1A2R1R2[A1, A2, R1, R2](
    `this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3[A1, A2, R1, R2, R3](
    `this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    `this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5[A1, A2, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6[A1, A2, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, _]] = js.native
  // 1-argument first function
  @JSName("flow")
  def flow_A1R1R2[A1, R1, R2](`this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R1]], f2: js.Function1[/* a */ R1, R2]): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3[A1, R1, R2, R3](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4[A1, R1, R2, R3, R4](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5[A1, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6[A1, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, _]] = js.native
  def fromPairs(
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[js.Array[_]] | scala.Null]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[_]] = js.native
  @JSName("fromPairs")
  def fromPairs_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[js.Tuple2[lodashLib.lodashMod.underscoreNs.PropertyName, T]]) | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def functions(): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def functionsIn(): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def get(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitSyncWrapper[_] = js.native
  def get(path: lodashLib.lodashMod.underscoreNs.PropertyPath, defaultValue: js.Any): LoDashExplicitSyncWrapper[_] = js.native
  def get(
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[scala.Null]],
    path: lodashLib.lodashMod.underscoreNs.PropertyPath
  ): LoDashExplicitSyncWrapper[js.UndefOr[scala.Nothing]] = js.native
  def get[TKey /* <: java.lang.String */](path: TKey): LoDashExplicitSyncWrapper[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TValue))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def get[TKey /* <: java.lang.String */](path: js.Array[TKey]): LoDashExplicitSyncWrapper[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TValue))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def get[TDefault](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[scala.Null]],
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    defaultValue: TDefault
  ): LoDashExplicitSyncWrapper[TDefault] = js.native
  def get[T](
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | (js.UndefOr[lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null])
    ],
    path: scala.Double
  ): LoDashExplicitSyncWrapper[T] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[TObject | scala.Null]], path: TKey): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any
    ]
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[TObject | scala.Null]], path: js.Array[TKey]): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any
    ]
  ] = js.native
  def get[T, TDefault](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null]],
    path: scala.Double,
    defaultValue: TDefault
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[TObject | scala.Null]],
    path: TKey,
    defaultValue: TDefault
  ): LoDashExplicitSyncWrapper[
    (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any) | TDefault
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[TObject | scala.Null]],
    path: js.Array[TKey],
    defaultValue: TDefault
  ): LoDashExplicitSyncWrapper[
    (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any) | TDefault
  ] = js.native
  def groupBy[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      js.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]
    ]
  ] = js.native
  def groupBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitSyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      js.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]
    ]
  ] = js.native
  @JSName("groupBy")
  def groupBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]]] = js.native
  @JSName("groupBy")
  def groupBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]]] = js.native
  def gt(other: js.Any): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def gte(other: js.Any): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def has(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def hasIn(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def head[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def identity(): this.type = js.native
  def inRange(start: scala.Double): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def inRange(start: scala.Double, end: scala.Double): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def includes[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    target: T
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def includes[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    target: T,
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def indexOf[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def indexOf[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def initial[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def intersection[T](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    arrays: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def intersectionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def intersectionBy[T1, T2](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def intersectionBy[T1, T2, T3](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def intersectionBy[T1, T2, T3, T4](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values: (lodashLib.lodashMod.underscoreNs.List[T4] | (lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4]))*
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def intersectionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def intersectionWith[T1, T2](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def intersectionWith[T1, T2, T3](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3]
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def intersectionWith[T1, T2, T3, T4](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values: (lodashLib.lodashMod.underscoreNs.List[T4] | (lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashExplicitSyncWrapper[js.Array[T1]] = js.native
  def invert(): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[java.lang.String]] = js.native
  def invertBy[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  @JSName("invertBy")
  def invertBy_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  @JSName("invertBy")
  def invertBy_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  def invoke(path: lodashLib.lodashMod.underscoreNs.PropertyPath, args: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def invokeMap(methodName: java.lang.String, args: js.Any*): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def invokeMap[TResult](method: js.Function1[/* repeated */js.Any, TResult], args: js.Any*): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def isArguments(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isArray(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isArrayBuffer(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isArrayLike(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isArrayLikeObject(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isBoolean(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isBuffer(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isDate(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isElement(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isEmpty(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isEqual(other: js.Any): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isEqualWith(other: js.Any): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isEqualWith(other: js.Any, customizer: lodashLib.lodashMod.underscoreNs.IsEqualCustomizer): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isError(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isFinite(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isFunction(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isInteger(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isLength(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isMap(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isMatch(source: js.Object): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isMatchWith(source: js.Object, customizer: lodashLib.lodashMod.underscoreNs.isMatchWithCustomizer): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isNaN(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isNative(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isNil(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isNull(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isNumber(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isObject(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isObjectLike(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isPlainObject(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isRegExp(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isSafeInteger(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isSet(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isString(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isSymbol(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isTypedArray(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isUndefined(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isWeakMap(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def isWeakSet(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def iteratee[TFunction /* <: js.Function1[/* repeated */js.Any, _] */](`this`: LoDashExplicitSyncWrapper[TFunction | java.lang.String | js.Object]): LoDashExplicitSyncWrapper[TFunction] = js.native
  def join(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def join(separator: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def kebabCase(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def keyBy[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def keyBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      lodashLib.lodashMod.underscoreNs.PropertyName
    ]
  ): LoDashExplicitSyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("keyBy")
  def keyBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("keyBy")
  def keyBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, lodashLib.lodashMod.underscoreNs.PropertyName]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def keys(): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def keysIn(): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def last[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def lastIndexOf[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def lastIndexOf[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    fromIndex: lowdbLib.lowdbLibNumbers.`true`
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def lastIndexOf[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    fromIndex: scala.Double
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def lowerCase(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def lowerFirst(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def lt(other: js.Any): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def lte(other: js.Any): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def map[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def map[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: java.lang.String
  ): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def map[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: js.Object
  ): LoDashExplicitSyncWrapper[js.Array[scala.Boolean]] = js.native
  def map[T, K /* <: java.lang.String */](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: K
  ): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ] = js.native
  def map[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, TResult]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def mapKeys[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def mapKeys[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]
  ): LoDashExplicitSyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("mapKeys")
  def mapKeys_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("mapKeys")
  def mapKeys_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def mapValues(`this`: LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.NumericDictionary[java.lang.String]] = js.native
  def mapValues[TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.StringIterator[TResult]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.NumericDictionary[TResult]] = js.native
  def mapValues[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]], iteratee: java.lang.String): LoDashExplicitSyncWrapper[lowdbLib.lowdbLibStrings.LoDashExplicitSyncWrapper with js.Any] = js.native
  def mapValues[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]], iteratee: js.Object): LoDashExplicitSyncWrapper[lowdbLib.lowdbLibStrings.LoDashExplicitSyncWrapper with js.Any] = js.native
  def mapValues[T, TKey /* <: java.lang.String */](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: TKey
  ): LoDashExplicitSyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(TKey))) */js.Any
    ]
  ] = js.native
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: java.lang.String
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[_]] = js.native
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: js.Object
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Boolean]] = js.native
  @JSName("mapValues")
  def mapValues_TObject[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[T | (js.UndefOr[T | scala.Null])]): LoDashExplicitSyncWrapper[T] = js.native
  @JSName("mapValues")
  def mapValues_TObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, TResult]
  ): LoDashExplicitSyncWrapper[lowdbLib.lowdbLibStrings.LoDashExplicitSyncWrapper with js.Any] = js.native
  @JSName("mapValues")
  def mapValues_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    callback: lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, TResult]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[TResult]] = js.native
  @JSName("map")
  def map_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: (lodashLib.lodashMod.underscoreNs.ArrayIterator[T, TResult]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, TResult])
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def matches[V](): LoDashExplicitSyncWrapper[js.Function1[/* value */ V, scala.Boolean]] = js.native
  def matchesProperty[SrcValue](srcValue: SrcValue): LoDashExplicitSyncWrapper[js.Function1[/* value */ _, scala.Boolean]] = js.native
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): LoDashExplicitSyncWrapper[js.Function1[/* value */ Value, scala.Boolean]] = js.native
  def max[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def maxBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def maxBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def mean(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def meanBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def meanBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def memoize(): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */js.Any, _]): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.MemoizedFunction] = js.native
  def merge(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def merge[TSource](source: TSource): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def mergeWith(otherArgs: js.Any*): LoDashExplicitSyncWrapper[_] = js.native
  def mergeWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer): LoDashExplicitSyncWrapper[TValue with TSource] = js.native
  def mergeWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2] = js.native
  def mergeWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer
  ): LoDashExplicitSyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def method(args: js.Any*): LoDashExplicitSyncWrapper[js.Function1[/* object */ _, _]] = js.native
  def methodOf(args: js.Any*): LoDashExplicitSyncWrapper[js.Function1[/* path */ lodashLib.lodashMod.underscoreNs.PropertyPath, _]] = js.native
  def min[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def minBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def minBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def mixin(): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.LoDashStatic] = js.native
  def mixin(options: lodashLib.lodashMod.underscoreNs.MixinOptions): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.LoDashStatic] = js.native
  def mixin(source: lodashLib.lodashMod.underscoreNs.Dictionary[js.Function1[/* repeated */_, _]]): this.type = js.native
  def mixin(
    source: lodashLib.lodashMod.underscoreNs.Dictionary[js.Function1[/* repeated */_, _]],
    options: lodashLib.lodashMod.underscoreNs.MixinOptions
  ): this.type = js.native
  def multiply(multiplicand: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def negate(
    `this`: LoDashExplicitSyncWrapper[js.Function0[scala.Boolean] | (js.Function1[/* repeated */_, _])]
  ): LoDashExplicitSyncWrapper[js.Function0[scala.Boolean]] = js.native
  @JSName("negate")
  def negate_A1[A1](`this`: LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, scala.Boolean]]): LoDashExplicitSyncWrapper[js.Function1[/* a1 */ A1, scala.Boolean]] = js.native
  @JSName("negate")
  def negate_A1A2[A1, A2](`this`: LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, scala.Boolean]]): LoDashExplicitSyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, scala.Boolean]] = js.native
  def noConflict(): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.LoDashStatic] = js.native
  def noop(args: js.Any*): LoDashExplicitSyncWrapper[js.UndefOr[scala.Nothing]] = js.native
  def now(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def nth[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def nth[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def nthArg(): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def omit[T /* <: lodashLib.lodashMod.underscoreNs.AnyKindOfDictionary */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    paths: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.PropertyName]*
  ): LoDashExplicitSyncWrapper[T] = js.native
  def omitBy[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def omitBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  @JSName("omitBy")
  def omitBy_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("omit")
  def omit_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    paths: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.PropertyName]*
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  @JSName("omit")
  def omit_TObjectKString[T /* <: js.Object */, K /* <: java.lang.String */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    paths: lodashLib.lodashMod.underscoreNs.Many[K]*
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Omit[T, K]] = js.native
  def orderBy[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def orderBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[scala.Null | T]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ObjectIteratee[T] | (lodashLib.lodashMod.underscoreNs.ObjectIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ]
  ): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def orderBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[scala.Null | T]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ObjectIteratee[T] | (lodashLib.lodashMod.underscoreNs.ObjectIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lowdbLib.lowdbLibStrings.asc | lowdbLib.lowdbLibStrings.desc]
  ): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ListIteratee[T] | (lodashLib.lodashMod.underscoreNs.ListIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ListIteratee[T] | (lodashLib.lodashMod.underscoreNs.ListIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lowdbLib.lowdbLibStrings.asc | lowdbLib.lowdbLibStrings.desc]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def over[TResult](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, TResult]]],
    iteratees: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, TResult]])*
  ): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, js.Array[TResult]]] = js.native
  def overArgs(transforms: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, _]])*): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def overEvery[T](predicates: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */T, scala.Boolean]])*): LoDashExplicitSyncWrapper[js.Function1[/* repeated */T, scala.Boolean]] = js.native
  def overSome[T](predicates: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */T, scala.Boolean]])*): LoDashExplicitSyncWrapper[js.Function1[/* repeated */T, scala.Boolean]] = js.native
  def pad(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def pad(length: scala.Double): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def pad(length: scala.Double, chars: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def padEnd(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def padEnd(length: scala.Double): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def padEnd(length: scala.Double, chars: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def padStart(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def padStart(length: scala.Double): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def padStart(length: scala.Double, chars: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def parseInt(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def parseInt(radix: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  // catch-all
  def partial(args: js.Any*): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[js.Function1[/* repeated */_, _]] = js.native
  // arity 0
  def partial[R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partial[T1, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]],
    arg1: T1
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partial[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]],
    arg1: T1,
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partial[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  def partial[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partial[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T2, R]] = js.native
  def partial[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    arg2: T2,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  def partial[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T3, R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T2, R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T2, T3, R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T3, R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]] = js.native
  def partial[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]] = js.native
  // catch-all
  def partialRight(args: js.Any*): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[js.Function1[/* repeated */_, _]] = js.native
  // arity 0
  def partialRight[R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partialRight[T1, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]],
    arg1: T1
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partialRight[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]],
    arg1: T1,
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partialRight[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T2, R]] = js.native
  def partialRight[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partialRight[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1,
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T3, R]] = js.native
  def partialRight[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T2, R]] = js.native
  def partialRight[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    plc3: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T2, T3, R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function0[R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    plc4: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T4, R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T3, R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    plc4: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T3, T4, R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T2, R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3,
    plc4: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T2, T4, R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T2, T3, R]] = js.native
  def partialRight[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    plc4: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T2, T3, T4, R]] = js.native
  // arity 1
  @JSName("partialRight")
  def partialRight_T1R[T1, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  // arity 2
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]],
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  // arity 3
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg2: T2,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T3, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]] = js.native
  // arity 4
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg2: T2,
    arg3: T3,
    plc4: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T4, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T3, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg2: T2,
    plc3: lodashLib.lodashMod.underscoreNs.`__`,
    plc4: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T3, T4, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg3: T3,
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg3: T3,
    plc4: lodashLib.lodashMod.underscoreNs.`__`
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T4, R]] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg4: T4
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]] = js.native
  // arity 1
  @JSName("partial")
  def partial_T1R[T1, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T1, R]] = js.native
  // arity 2
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]] = js.native
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T2, R]],
    arg1: T1
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T2, R]] = js.native
  // arity 3
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T2, T3, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    arg1: T1,
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T3, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T3, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T3, R]] = js.native
  // arity 4
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]]
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T2, T3, T4, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T3, T4, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function1[T4, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T2, T4, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    arg2: T2
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T3, T4, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    arg2: T2,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function2[T1, T4, R]] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function4[T1, T2, T3, T4, R]],
    plc1: lodashLib.lodashMod.underscoreNs.`__`,
    plc2: lodashLib.lodashMod.underscoreNs.`__`,
    arg3: T3
  ): lodashLib.lodashMod.underscoreNs.LoDashExplicitWrapper[lodashLib.lodashMod.underscoreNs.Function3[T1, T2, T4, R]] = js.native
  def partition[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null | T]],
    callback: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any) | T
    ]
  ): LoDashExplicitSyncWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  def pick[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    props: lodashLib.lodashMod.underscoreNs.PropertyPath*
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  def pickBy[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  def pickBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  def pickBy[T, S /* <: T */](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIterateeTypeGuard[T, S]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[S]] = js.native
  @JSName("pickBy")
  def pickBy_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("pickBy")
  def pickBy_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("pick")
  def pick_TObjectUString[T /* <: js.Object */, U /* <: java.lang.String */](`this`: LoDashExplicitSyncWrapper[T], props: lodashLib.lodashMod.underscoreNs.Many[U]*): LoDashExplicitSyncWrapper[stdLib.Pick[T, U]] = js.native
  def plant[T](value: T): LoDashExplicitSyncWrapper[T] = js.native
  def pop[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def property[TObj, TResult](): LoDashExplicitSyncWrapper[js.Function1[/* obj */ TObj, TResult]] = js.native
  def propertyOf(): LoDashExplicitSyncWrapper[js.Function1[/* path */ lodashLib.lodashMod.underscoreNs.PropertyPath, _]] = js.native
  def pull[T](`this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]], values: T*): this.type = js.native
  def pullAll[T](`this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]]): this.type = js.native
  def pullAll[T](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    values: lodashLib.lodashMod.underscoreNs.List[T]
  ): this.type = js.native
  def push[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    items: T*
  ): this.type = js.native
  def random(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def random(floating: scala.Boolean): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def random(max: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def random(max: scala.Double, floating: scala.Boolean): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def range(): LoDashExplicitSyncWrapper[js.Array[scala.Double]] = js.native
  def range(end: scala.Double): LoDashExplicitSyncWrapper[js.Array[scala.Double]] = js.native
  def range(end: scala.Double, step: scala.Double): LoDashExplicitSyncWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(): LoDashExplicitSyncWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(end: scala.Double): LoDashExplicitSyncWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(end: scala.Double, step: scala.Double): LoDashExplicitSyncWrapper[js.Array[scala.Double]] = js.native
  def rearg(indexes: lodashLib.lodashMod.underscoreNs.Many[scala.Double]*): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def reduce[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      T
    ]
  ): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def reduce[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  def reduceRight[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      T
    ]
  ): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def reduceRight[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, T, js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("reduceRight")
  def reduceRight_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, TResult, js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T]],
    accumulator: TResult
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  @JSName("reduce")
  def reduce_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, T, js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  @JSName("reduce")
  def reduce_TTResult[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, TResult, js.Array[T] | lodashLib.lodashMod.underscoreNs.List[T]],
    accumulator: TResult
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  def reject(`this`: LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def reject(
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[java.lang.String | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.StringIterator[scala.Boolean]
  ): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def reject[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("reject")
  def reject_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("reject")
  def reject_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("reject")
  def reject_TObject[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def remove[T](`this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]]): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def remove[T](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def repeat(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def repeat(n: scala.Double): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def replace(pattern: java.lang.String, replacement: lodashLib.lodashMod.underscoreNs.ReplaceFunction): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def replace(pattern: stdLib.RegExp, replacement: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def replace(pattern: stdLib.RegExp, replacement: lodashLib.lodashMod.underscoreNs.ReplaceFunction): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def replace(replacement: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def replace(replacement: lodashLib.lodashMod.underscoreNs.ReplaceFunction): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def rest(): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def rest(start: scala.Double): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def result[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitSyncWrapper[TResult] = js.native
  def result[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath, defaultValue: TResult): LoDashExplicitSyncWrapper[TResult] = js.native
  def result[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    defaultValue: js.Function1[/* repeated */js.Any, TResult]
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  def round(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def round(precision: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sample[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def sampleSize[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def sampleSize[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]], n: scala.Double): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("sampleSize")
  def sampleSize_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("sampleSize")
  def sampleSize_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    n: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("sample")
  def sample_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def set(path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): this.type = js.native
  def setWith(path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): this.type = js.native
  def setWith(
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    value: js.Any,
    customizer: lodashLib.lodashMod.underscoreNs.SetWithCustomizer[TValue]
  ): this.type = js.native
  @JSName("setWith")
  def setWith_TResultLoDashExplicitSyncWrapper[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): LoDashExplicitSyncWrapper[TResult] = js.native
  @JSName("setWith")
  def setWith_TResultLoDashExplicitSyncWrapper[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    value: js.Any,
    customizer: lodashLib.lodashMod.underscoreNs.SetWithCustomizer[TValue]
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  @JSName("set")
  def set_TResultLoDashExplicitSyncWrapper[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): LoDashExplicitSyncWrapper[TResult] = js.native
  def shift[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.UndefOr[T]] = js.native
  def shuffle[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("shuffle")
  def shuffle_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def size(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def slice[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def slice[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def slice[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double,
    end: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def snakeCase(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def some[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def some[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  @JSName("some")
  def some_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  @JSName("some")
  def some_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def sort[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): this.type = js.native
  def sort[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]
  ): this.type = js.native
  def sortBy[T /* <: js.Object */](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]]*
  ): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("sortBy")
  def sortBy_T[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ListIteratee[T]]*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def sortedIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sortedIndexBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sortedIndexBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sortedIndexOf[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sortedLastIndex[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sortedLastIndexBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sortedLastIndexOf[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sortedUniq[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def sortedUniqBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def splice[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double
  ): this.type = js.native
  def splice[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double,
    deleteCount: scala.Double,
    items: T*
  ): this.type = js.native
  def split(): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String, limit: scala.Double): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp, limit: scala.Double): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def spread[TResult](`this`: LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, TResult]]): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, TResult]] = js.native
  def spread[TResult](`this`: LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, TResult]], start: scala.Double): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, TResult]] = js.native
  def startCase(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def startsWith(): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def startsWith(target: java.lang.String): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def startsWith(target: java.lang.String, position: scala.Double): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def stubArray(): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def stubFalse(): LoDashExplicitSyncWrapper[lowdbLib.lowdbLibNumbers.`false`] = js.native
  def stubObject(): LoDashExplicitSyncWrapper[_] = js.native
  def stubString(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def stubTrue(): LoDashExplicitSyncWrapper[lowdbLib.lowdbLibNumbers.`true`] = js.native
  def subtract(subtrahend: scala.Double): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sum(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sumBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sumBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: java.lang.String
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def sumBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: js.Function1[/* value */ T, scala.Double]
  ): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def tail[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def take[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def take[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def takeRight[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def takeRight[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def takeWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def takeWhile[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def template(): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.TemplateExecutor] = js.native
  def template(options: lodashLib.lodashMod.underscoreNs.TemplateOptions): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.TemplateExecutor] = js.native
  def throttle(): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def throttle(wait: scala.Double): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def throttle(wait: scala.Double, options: lodashLib.lodashMod.underscoreNs.ThrottleSettings): LoDashExplicitSyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): LoDashExplicitSyncWrapper[TResult] = js.native
  def times(): LoDashExplicitSyncWrapper[js.Array[scala.Double]] = js.native
  def times[TResult](iteratee: js.Function1[/* num */ scala.Double, TResult]): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def toArray[T /* <: js.Object */](`this`: lodashLib.lodashMod.underscoreNs.LoDashImplicitWrapper[T]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def toArray[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def toFinite(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def toInteger(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def toLength(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def toLower(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def toNumber(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def toPairs(): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def toPairs[T](
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  def toPairsIn(): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def toPairsIn[T](
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  def toPath(): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def toPlainObject(): LoDashExplicitSyncWrapper[_] = js.native
  def toSafeInteger(): LoDashExplicitSyncWrapper[scala.Double] = js.native
  def toUpper(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def transform(): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[_]] = js.native
  def transform(`this`: LoDashExplicitSyncWrapper[js.Array[_]]): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.Array[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T]],
    iteratee: (lodashLib.lodashMod.underscoreNs.MemoVoidArrayIterator[T, js.Array[TResult] | lodashLib.lodashMod.underscoreNs.Dictionary[TResult]]) | (lodashLib.lodashMod.underscoreNs.MemoVoidDictionaryIterator[T, js.Array[TResult] | lodashLib.lodashMod.underscoreNs.Dictionary[TResult]])
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.Array[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T]],
    iteratee: (lodashLib.lodashMod.underscoreNs.MemoVoidArrayIterator[T, js.Array[TResult]]) | (lodashLib.lodashMod.underscoreNs.MemoVoidDictionaryIterator[T, js.Array[TResult]]),
    accumulator: js.Array[TResult]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.Array[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T]],
    iteratee: (lodashLib.lodashMod.underscoreNs.MemoVoidArrayIterator[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]]) | (lodashLib.lodashMod.underscoreNs.MemoVoidDictionaryIterator[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]]),
    accumulator: lodashLib.lodashMod.underscoreNs.Dictionary[TResult]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[TResult]] = js.native
  def trim(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def trim(chars: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def trimEnd(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def trimEnd(chars: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def trimStart(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def trimStart(chars: java.lang.String): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def truncate(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def truncate(options: lodashLib.lodashMod.underscoreNs.TruncateOptions): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def unary[T, TResult](`this`: LoDashExplicitSyncWrapper[js.Function2[/* arg1 */ T, /* repeated */_, TResult]]): LoDashExplicitSyncWrapper[js.Function1[/* arg1 */ T, TResult]] = js.native
  def unescape(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def union[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays: (js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T],
    arrays5: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def uniq[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def uniqBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def uniqWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def uniqWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def uniqueId(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def unset(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitSyncWrapper[scala.Boolean] = js.native
  def unshift[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    items: T*
  ): this.type = js.native
  def unzip[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        js.Array[js.Array[T]] | lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[js.Array[T]]] = js.native
  def unzipWith[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[js.Array[T]]] = js.native
  def unzipWith[T, TResult](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]] | scala.Null
      ]
    ],
    iteratee: js.Function1[/* repeated */T, TResult]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def update(path: lodashLib.lodashMod.underscoreNs.PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LoDashExplicitSyncWrapper[_] = js.native
  def updateWith(
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): this.type = js.native
  def updateWith(
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: lodashLib.lodashMod.underscoreNs.SetWithCustomizer[TValue]
  ): this.type = js.native
  @JSName("updateWith")
  def updateWith_TResultLoDashExplicitSyncWrapper[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResultLoDashExplicitSyncWrapper[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: lodashLib.lodashMod.underscoreNs.SetWithCustomizer[TValue]
  ): LoDashExplicitSyncWrapper[TResult] = js.native
  def upperCase(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def upperFirst(): LoDashExplicitSyncWrapper[java.lang.String] = js.native
  def values(): LoDashExplicitSyncWrapper[js.Array[_]] = js.native
  def values[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def valuesIn[T /* <: js.Object */](`this`: LoDashExplicitSyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitSyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("valuesIn")
  def valuesIn_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  @JSName("values")
  def values_T[T](
    `this`: LoDashExplicitSyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
      ]
    ]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def without[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: T*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def words(): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def words(pattern: java.lang.String): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def words(pattern: stdLib.RegExp): LoDashExplicitSyncWrapper[js.Array[java.lang.String]] = js.native
  def wrap[TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */js.Any, TResult]): LoDashExplicitSyncWrapper[js.Function1[/* repeated */_, TResult]] = js.native
  @JSName("wrap")
  def wrap_TArgsTResult[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */TArgs, TResult]): LoDashExplicitSyncWrapper[js.Function1[/* repeated */TArgs, TResult]] = js.native
  def write(): TValue = js.native
  def xor[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays: (js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitSyncWrapper[js.Array[T]] = js.native
  def zip[T](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays: (js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null])*
  ): LoDashExplicitSyncWrapper[js.Array[js.Array[js.UndefOr[T]]]] = js.native
  def zip[T1, T2](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2]
  ): LoDashExplicitSyncWrapper[js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]] = js.native
  def zip[T1, T2, T3](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3]
  ): LoDashExplicitSyncWrapper[js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]]] = js.native
  def zip[T1, T2, T3, T4](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T4]
  ): LoDashExplicitSyncWrapper[
    js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]]
  ] = js.native
  def zip[T1, T2, T3, T4, T5](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T4],
    arrays5: lodashLib.lodashMod.underscoreNs.List[T5]
  ): LoDashExplicitSyncWrapper[
    js.Array[
      js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
    ]
  ] = js.native
  def zipObject(
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyName]
    ]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.UndefOr[scala.Nothing]]] = js.native
  def zipObject[T](
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyName]
    ],
    values: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def zipObjectDeep(
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyPath]
    ]
  ): LoDashExplicitSyncWrapper[js.Object] = js.native
  def zipObjectDeep(
    `this`: LoDashExplicitSyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyPath]
    ],
    values: lodashLib.lodashMod.underscoreNs.List[_]
  ): LoDashExplicitSyncWrapper[js.Object] = js.native
  def zipWith[T, TResult](
    `this`: LoDashExplicitSyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: (js.UndefOr[
      (js.Function1[/* repeated */T, TResult]) | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T, TResult](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    iteratee: js.Function1[/* value1 */ T, TResult]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, TResult](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, T3, TResult](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    iteratee: js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, TResult]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, T3, T4, TResult](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T4],
    iteratee: js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, TResult]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, T3, T4, T5, TResult](
    `this`: LoDashExplicitSyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T4],
    arrays5: lodashLib.lodashMod.underscoreNs.List[T5],
    iteratee: js.Function5[
      /* value1 */ T1, 
      /* value2 */ T2, 
      /* value3 */ T3, 
      /* value4 */ T4, 
      /* value5 */ T5, 
      TResult
    ]
  ): LoDashExplicitSyncWrapper[js.Array[TResult]] = js.native
}

