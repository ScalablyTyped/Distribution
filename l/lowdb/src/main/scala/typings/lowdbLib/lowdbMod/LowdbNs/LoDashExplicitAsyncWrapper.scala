package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: this interface is augmented in _lodash.d.ts
@js.native
trait LoDashExplicitAsyncWrapper[TValue]
  extends lodashLib.lodashMod.underscoreNs.LoDashWrapper[TValue] {
  @JSName("partialRight")
  var partialRight_Original: lodashLib.lodashMod.underscoreNs.ExplicitPartialRight = js.native
  @JSName("partial")
  var partial_Original: lodashLib.lodashMod.underscoreNs.ExplicitPartial = js.native
  def add(addend: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def after[TFunc /* <: js.Function1[/* repeated */js.Any, _] */](func: TFunc): LoDashExplicitAsyncWrapper[TFunc] = js.native
  def ary(): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def ary(n: scala.Double): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def assign(): LoDashExplicitAsyncWrapper[TValue] = js.native
  def assign(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def assign[TSource](source: TSource): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def assignIn(): LoDashExplicitAsyncWrapper[TValue] = js.native
  def assignIn(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def assignIn[TSource](source: TSource): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def assignInWith(): LoDashExplicitAsyncWrapper[TValue] = js.native
  def assignInWith(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def assignInWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def assignInWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assignInWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def assignWith(): LoDashExplicitAsyncWrapper[TValue] = js.native
  def assignWith(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def assignWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def assignWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def assignWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def at[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    props: lodashLib.lodashMod.underscoreNs.PropertyPath*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("at")
  def at_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    props: lodashLib.lodashMod.underscoreNs.Many[java.lang.String]*
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def attempt[TResult](args: js.Any*): LoDashExplicitAsyncWrapper[TResult | stdLib.Error] = js.native
  def before[TFunc /* <: js.Function1[/* repeated */js.Any, _] */](func: TFunc): LoDashExplicitAsyncWrapper[TFunc] = js.native
  def bind(thisArg: js.Any, partials: js.Any*): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def bindKey(key: java.lang.String, partials: js.Any*): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def camelCase(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def capitalize(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def castArray[T](`this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Many[T]]): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def ceil(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def ceil(precision: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def chain(): this.type = js.native
  def chunk[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Array[T]]] = js.native
  def chunk[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    size: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[js.Array[T]]] = js.native
  def clamp(lower: scala.Double, upper: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def clamp(upper: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def cloneDeep(): this.type = js.native
  def cloneDeepWith(): this.type = js.native
  def cloneDeepWith(customizer: lodashLib.lodashMod.underscoreNs.CloneDeepWithCustomizer[TValue]): LoDashExplicitAsyncWrapper[_] = js.native
  def cloneWith(): this.type = js.native
  def cloneWith[TResult /* <: js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null */](customizer: lodashLib.lodashMod.underscoreNs.CloneWithCustomizer[TValue, TResult]): LoDashExplicitAsyncWrapper[TResult] = js.native
  @JSName("cloneWith")
  def cloneWith_TResult[TResult](customizer: lodashLib.lodashMod.underscoreNs.CloneWithCustomizer[TValue, js.UndefOr[TResult]]): LoDashExplicitAsyncWrapper[TResult | TValue] = js.native
  @JSName("compact")
  def `compact_`[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[
          js.UndefOr[
            T | scala.Null | lowdbLib.lowdbLibNumbers.`false` | lowdbLib.lowdbLibStrings.Empty | lowdbLib.lowdbLibNumbers.`0`
          ]
        ]) | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def concat[T](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Many[T]],
    values: lodashLib.lodashMod.underscoreNs.Many[T]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def conforms[T](`this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.ConformsPredicateObject[T]]): LoDashExplicitAsyncWrapper[js.Function1[/* value */ T, scala.Boolean]] = js.native
  def conformsTo[T](
    `this`: LoDashExplicitAsyncWrapper[T],
    source: lodashLib.lodashMod.underscoreNs.ConformsPredicateObject[T]
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def constant(): LoDashExplicitAsyncWrapper[js.Function0[TValue]] = js.native
  def countBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  def countBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  @JSName("countBy")
  def countBy_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  @JSName("countBy")
  def countBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double]] = js.native
  def create[U /* <: js.Object */](): LoDashExplicitAsyncWrapper[TValue with U] = js.native
  def create[U /* <: js.Object */](properties: U): LoDashExplicitAsyncWrapper[TValue with U] = js.native
  def curry(): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curry(arity: scala.Double): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curry[T1, R](`this`: LoDashExplicitAsyncWrapper[js.Function1[/* t1 */ T1, R]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction1[T1, R]] = js.native
  def curryRight(): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curryRight(arity: scala.Double): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def curryRight[T1, R](`this`: LoDashExplicitAsyncWrapper[js.Function1[/* t1 */ T1, R]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction1[T1, R]] = js.native
  def curryRight[T1, R](`this`: LoDashExplicitAsyncWrapper[js.Function1[/* t1 */ T1, R]], arity: scala.Double): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction1[T1, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashExplicitAsyncWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashExplicitAsyncWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]], arity: scala.Double): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitAsyncWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]],
    arity: scala.Double
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashExplicitAsyncWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashExplicitAsyncWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]],
    arity: scala.Double
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitAsyncWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitAsyncWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]],
    arity: scala.Double
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](`this`: LoDashExplicitAsyncWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction2[T1, T2, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](`this`: LoDashExplicitAsyncWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashExplicitAsyncWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashExplicitAsyncWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  def debounce(): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def debounce(wait: scala.Double): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def debounce(wait: scala.Double, options: lodashLib.lodashMod.underscoreNs.DebounceSettings): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def deburr(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def defaultTo[T](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]], defaultValue: T): LoDashExplicitAsyncWrapper[T] = js.native
  @JSName("defaultTo")
  def defaultTo_TTDefault[T, TDefault](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]], defaultValue: TDefault): LoDashExplicitAsyncWrapper[T | TDefault] = js.native
  def defaults(): LoDashExplicitAsyncWrapper[TValue] = js.native
  def defaults(sources: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def defaults[TSource](source: TSource): LoDashExplicitAsyncWrapper[TSource with TValue] = js.native
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitAsyncWrapper[TSource2 with TSource1 with TValue] = js.native
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitAsyncWrapper[TSource3 with TSource2 with TSource1 with TValue] = js.native
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitAsyncWrapper[TSource4 with TSource3 with TSource2 with TSource1 with TValue] = js.native
  def defaultsDeep(sources: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def defer(args: js.Any*): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def delay(wait: scala.Double, args: js.Any*): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def difference[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def differenceBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def differenceBy[T1, T2](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4, T5](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    values4: lodashLib.lodashMod.underscoreNs.List[T5],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    values4: lodashLib.lodashMod.underscoreNs.List[T5],
    values5: lodashLib.lodashMod.underscoreNs.List[T6],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values3: lodashLib.lodashMod.underscoreNs.List[T4],
    values4: lodashLib.lodashMod.underscoreNs.List[T5],
    values5: lodashLib.lodashMod.underscoreNs.List[T6],
    values: (lodashLib.lodashMod.underscoreNs.List[T7] | (lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def differenceWith[T1, T2](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceWith[T1, T2, T3](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def differenceWith[T1, T2, T3, T4](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values: (lodashLib.lodashMod.underscoreNs.List[T4] | (lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def divide(divisor: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def drop[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def drop[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def dropRight[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def dropRight[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def dropWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def dropWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def endsWith(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def endsWith(target: java.lang.String): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def endsWith(target: java.lang.String, position: scala.Double): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def entries(): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def entries[T](
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  def entriesIn(): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def entriesIn[T](
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  // Note: we can't use TValue here,  because it generates a typescript error when strictFunctionTypes is enabled.
  def eq(other: js.Any): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def escape(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def escapeRegExp(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def every[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def every[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  @JSName("every")
  def every_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  @JSName("every")
  def every_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def extend(): LoDashExplicitAsyncWrapper[TValue] = js.native
  def extend(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def extend[TSource](source: TSource): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def extendWith(): LoDashExplicitAsyncWrapper[TValue] = js.native
  def extendWith(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def extendWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def extendWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def extendWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def fill[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[_] | scala.Null | lodashLib.lodashMod.underscoreNs.List[_]]],
    value: T
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def fill[T, U](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[U] | scala.Null | lodashLib.lodashMod.underscoreNs.List[U]]],
    value: T,
    start: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T | U]] = js.native
  def fill[T, U](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[U] | scala.Null | lodashLib.lodashMod.underscoreNs.List[U]]],
    value: T,
    start: scala.Double,
    end: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T | U]] = js.native
  @JSName("fill")
  def fill_TU[T, U](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[U] | scala.Null | lodashLib.lodashMod.underscoreNs.List[U]]],
    value: T
  ): LoDashExplicitAsyncWrapper[js.Array[T | U]] = js.native
  def filter(`this`: LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def filter(
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.StringIterator[scala.Boolean]
  ): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def filter[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("filter")
  def filter_T[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("filter")
  def filter_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("filter")
  def filter_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("filter")
  def filter_TObjectSAny[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S]
  ): LoDashExplicitAsyncWrapper[js.Array[S]] = js.native
  @JSName("filter")
  def filter_TST[T, S /* <: T */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S]
  ): LoDashExplicitAsyncWrapper[js.Array[S]] = js.native
  def find[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def find[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def find[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  def findIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def findIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def findIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def findKey[T](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String]] = js.native
  def findKey[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String]] = js.native
  def findLast[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def findLast[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def findLast[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def findLastIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def findLastKey[T](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String]] = js.native
  def findLastKey[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String]] = js.native
  @JSName("findLast")
  def findLast_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("findLast")
  def findLast_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("findLast")
  def findLast_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("findLast")
  def findLast_TST[T, S /* <: T */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  @JSName("findLast")
  def findLast_TST[T, S /* <: T */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("find")
  def find_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("find")
  def find_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("find")
  def find_TST[T, S /* <: T */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_TST[T, S /* <: T */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratorTypeGuard[T, S],
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[js.UndefOr[S]] = js.native
  def first[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def flatMap(): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def flatMap(iteratee: java.lang.String): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def flatMap(iteratee: js.Object): LoDashExplicitAsyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMap[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.Many[T]] | lodashLib.lodashMod.underscoreNs.Dictionary[lodashLib.lodashMod.underscoreNs.Many[T]] | lodashLib.lodashMod.underscoreNs.NumericDictionary[lodashLib.lodashMod.underscoreNs.Many[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def flatMap[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, lodashLib.lodashMod.underscoreNs.Many[TResult]]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def flatMapDeep(`this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: java.lang.String): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def flatMapDeep(`this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: js.Object): LoDashExplicitAsyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMapDeep[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.Dictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.NumericDictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def flatMapDeep[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def flatMapDepth(`this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: java.lang.String): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def flatMapDepth(
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Object | scala.Null]],
    iteratee: java.lang.String,
    depth: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def flatMapDepth(`this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Object | scala.Null]], iteratee: js.Object): LoDashExplicitAsyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMapDepth(
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Object | scala.Null]],
    iteratee: js.Object,
    depth: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[scala.Boolean]] = js.native
  def flatMapDepth[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.Dictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | (lodashLib.lodashMod.underscoreNs.NumericDictionary[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | T]) | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[
      T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[T, lodashLib.lodashMod.underscoreNs.Many[TResult]]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def flatten[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.Many[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def flattenDeep[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | scala.Null]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def flattenDepth[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | scala.Null]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def flattenDepth[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[T] | scala.Null]
    ],
    depth: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def floor(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def floor(precision: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def flow(
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]],
    funcs: js.Array[lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]]]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  // 0-argument first function
  def flow[R1, R2](`this`: LoDashExplicitAsyncWrapper[js.Function0[R1]], f2: js.Function1[/* a */ R1, R2]): LoDashExplicitAsyncWrapper[js.Function0[R2]] = js.native
  def flow[R1, R2, R3](
    `this`: LoDashExplicitAsyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitAsyncWrapper[js.Function0[R3]] = js.native
  def flow[R1, R2, R3, R4](
    `this`: LoDashExplicitAsyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitAsyncWrapper[js.Function0[R4]] = js.native
  def flow[R1, R2, R3, R4, R5](
    `this`: LoDashExplicitAsyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitAsyncWrapper[js.Function0[R5]] = js.native
  def flow[R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitAsyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitAsyncWrapper[js.Function0[R6]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitAsyncWrapper[js.Function0[R7]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitAsyncWrapper[js.Function0[_]] = js.native
  def flowRight(
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ _, _]],
    f6: js.Function1[/* a */ js.Any, _],
    f5: js.Function1[/* a */ js.Any, _],
    f4: js.Function1[/* a */ js.Any, _],
    f3: js.Function1[/* a */ js.Any, _],
    f2: js.Function1[/* a */ js.Any, _],
    f1: js.Function0[_],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, _]])*
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def flowRight(
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ _, _]],
    funcs: js.Array[lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, _]]]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  // 0-argument first function
  def flowRight[R2, R1](`this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function0[R1]): LoDashExplicitAsyncWrapper[js.Function0[R2]] = js.native
  // any-argument first function
  def flowRight[R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, R2]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitAsyncWrapper[js.Function0[R3]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, R3]] = js.native
  // 2-argument first function
  def flowRight[A1, A2, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitAsyncWrapper[js.Function0[R4]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, R4]] = js.native
  // 3-argument first function
  def flowRight[A1, A2, A3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  def flowRight[A1, A2, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitAsyncWrapper[js.Function0[R5]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, R5]] = js.native
  // 4-argument first function
  def flowRight[A1, A2, A3, A4, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  def flowRight[A1, A2, A3, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  def flowRight[A1, A2, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitAsyncWrapper[js.Function0[R6]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  def flowRight[A1, A2, A3, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  def flowRight[A1, A2, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitAsyncWrapper[js.Function0[R7]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */js.Any, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  def flowRight[A1, A2, A3, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  def flowRight[A1, A2, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  def flowRight[A1, A2, A3, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  def flowRight[A1, A2, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  def flowRight[A1, A2, A3, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  // 1-argument first function
  @JSName("flowRight")
  def flowRight_A1R2R1[A1, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flowRight")
  def flowRight_A1R3R2R1[A1, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flowRight")
  def flowRight_A1R4R3R2R1[A1, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flowRight")
  def flowRight_A1R5R4R3R2R1[A1, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flowRight")
  def flowRight_A1R6R5R4R3R2R1[A1, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flowRight")
  def flowRight_A1R7R6R5R4R3R2R1[A1, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  // 4-argument first function
  // any-argument first function
  @JSName("flow")
  def flow_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    `this`: LoDashExplicitAsyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    `this`: LoDashExplicitAsyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    `this`: LoDashExplicitAsyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitAsyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitAsyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */_, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitAsyncWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _]] = js.native
  // 3-argument first function
  @JSName("flow")
  def flow_A1A2A3R1R2[A1, A2, A3, R1, R2](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5[A1, A2, A3, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitAsyncWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _]] = js.native
  // 2-argument first function
  @JSName("flow")
  def flow_A1A2R1R2[A1, A2, R1, R2](
    `this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3[A1, A2, R1, R2, R3](
    `this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    `this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5[A1, A2, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6[A1, A2, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, _]] = js.native
  // 1-argument first function
  @JSName("flow")
  def flow_A1R1R2[A1, R1, R2](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3[A1, R1, R2, R3](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4[A1, R1, R2, R3, R4](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5[A1, R1, R2, R3, R4, R5](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6[A1, R1, R2, R3, R4, R5, R6](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, _]] = js.native
  def fromPairs(
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[js.Array[_]] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[_]] = js.native
  @JSName("fromPairs")
  def fromPairs_T[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        (lodashLib.lodashMod.underscoreNs.List[js.Tuple2[lodashLib.lodashMod.underscoreNs.PropertyName, T]]) | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def functions(): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def functionsIn(): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def get(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitAsyncWrapper[_] = js.native
  def get(path: lodashLib.lodashMod.underscoreNs.PropertyPath, defaultValue: js.Any): LoDashExplicitAsyncWrapper[_] = js.native
  def get(
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[scala.Null]],
    path: lodashLib.lodashMod.underscoreNs.PropertyPath
  ): LoDashExplicitAsyncWrapper[js.UndefOr[scala.Nothing]] = js.native
  def get[TKey /* <: java.lang.String */](path: TKey): LoDashExplicitAsyncWrapper[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TValue))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def get[TKey /* <: java.lang.String */](path: js.Array[TKey]): LoDashExplicitAsyncWrapper[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TValue))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def get[TDefault](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[scala.Null]],
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    defaultValue: TDefault
  ): LoDashExplicitAsyncWrapper[TDefault] = js.native
  def get[T](
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | (js.UndefOr[lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null])
    ],
    path: scala.Double
  ): LoDashExplicitAsyncWrapper[T] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[TObject | scala.Null]], path: TKey): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any
    ]
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[TObject | scala.Null]], path: js.Array[TKey]): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any
    ]
  ] = js.native
  def get[T, TDefault](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null]],
    path: scala.Double,
    defaultValue: TDefault
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[TObject | scala.Null]],
    path: TKey,
    defaultValue: TDefault
  ): LoDashExplicitAsyncWrapper[
    (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any) | TDefault
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[TObject | scala.Null]],
    path: js.Array[TKey],
    defaultValue: TDefault
  ): LoDashExplicitAsyncWrapper[
    (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TObject))),List()),Left(TsIdentSimple(TKey))) */js.Any) | TDefault
  ] = js.native
  def groupBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]]] = js.native
  def groupBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]]] = js.native
  @JSName("groupBy")
  def groupBy_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      js.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]
    ]
  ] = js.native
  @JSName("groupBy")
  def groupBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitAsyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      js.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]
    ]
  ] = js.native
  def gt(other: js.Any): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def gte(other: js.Any): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def has(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def hasIn(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def head[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def identity(): this.type = js.native
  def inRange(start: scala.Double): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def inRange(start: scala.Double, end: scala.Double): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def includes[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    target: T
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def includes[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    target: T,
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def indexOf[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def indexOf[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def initial[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def intersection[T](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    arrays: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def intersectionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def intersectionBy[T1, T2](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def intersectionBy[T1, T2, T3](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def intersectionBy[T1, T2, T3, T4](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values: (lodashLib.lodashMod.underscoreNs.List[T4] | (lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2 | T3 | T4]))*
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def intersectionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def intersectionWith[T1, T2](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values: lodashLib.lodashMod.underscoreNs.List[T2],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def intersectionWith[T1, T2, T3](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3]
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def intersectionWith[T1, T2, T3, T4](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T1] | scala.Null]],
    values1: lodashLib.lodashMod.underscoreNs.List[T2],
    values2: lodashLib.lodashMod.underscoreNs.List[T3],
    values: (lodashLib.lodashMod.underscoreNs.List[T4] | (lodashLib.lodashMod.underscoreNs.Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashExplicitAsyncWrapper[js.Array[T1]] = js.native
  def invert(): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[java.lang.String]] = js.native
  def invertBy[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  @JSName("invertBy")
  def invertBy_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  @JSName("invertBy")
  def invertBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]]] = js.native
  def invoke(path: lodashLib.lodashMod.underscoreNs.PropertyPath, args: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def invokeMap(methodName: java.lang.String, args: js.Any*): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def invokeMap[TResult](method: js.Function1[/* repeated */js.Any, TResult], args: js.Any*): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def isArguments(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isArray(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isArrayBuffer(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isArrayLike(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isArrayLikeObject(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isBoolean(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isBuffer(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isDate(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isElement(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isEmpty(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isEqual(other: js.Any): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isEqualWith(other: js.Any): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isEqualWith(other: js.Any, customizer: lodashLib.lodashMod.underscoreNs.IsEqualCustomizer): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isError(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isFinite(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isFunction(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isInteger(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isLength(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isMap(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isMatch(source: js.Object): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isMatchWith(source: js.Object, customizer: lodashLib.lodashMod.underscoreNs.isMatchWithCustomizer): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isNaN(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isNative(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isNil(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isNull(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isNumber(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isObject(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isObjectLike(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isPlainObject(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isRegExp(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isSafeInteger(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isSet(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isString(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isSymbol(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isTypedArray(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isUndefined(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isWeakMap(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def isWeakSet(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def iteratee[TFunction /* <: js.Function1[/* repeated */js.Any, _] */](`this`: LoDashExplicitAsyncWrapper[TFunction | java.lang.String | js.Object]): LoDashExplicitAsyncWrapper[TFunction] = js.native
  def join(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def join(separator: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def kebabCase(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def keyBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def keyBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, lodashLib.lodashMod.underscoreNs.PropertyName]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("keyBy")
  def keyBy_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("keyBy")
  def keyBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      lodashLib.lodashMod.underscoreNs.PropertyName
    ]
  ): LoDashExplicitAsyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def keys(): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def keysIn(): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def last[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def lastIndexOf[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def lastIndexOf[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    fromIndex: lowdbLib.lowdbLibNumbers.`true`
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def lastIndexOf[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    fromIndex: scala.Double
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def lowerCase(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def lowerFirst(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def lt(other: js.Any): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def lte(other: js.Any): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def map[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def map[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: java.lang.String
  ): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def map[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: js.Object
  ): LoDashExplicitAsyncWrapper[js.Array[scala.Boolean]] = js.native
  def map[T, K /* <: java.lang.String */](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: K
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ] = js.native
  def map[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, TResult]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def mapKeys[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def mapKeys[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("mapKeys")
  def mapKeys_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("mapKeys")
  def mapKeys_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]
  ): LoDashExplicitAsyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def mapValues(`this`: LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.NumericDictionary[java.lang.String]] = js.native
  def mapValues[TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.StringIterator[TResult]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.NumericDictionary[TResult]] = js.native
  def mapValues[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: java.lang.String
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[_]] = js.native
  def mapValues[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: js.Object
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[scala.Boolean]] = js.native
  def mapValues[T, TKey /* <: java.lang.String */](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    iteratee: TKey
  ): LoDashExplicitAsyncWrapper[
    lodashLib.lodashMod.underscoreNs.Dictionary[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(TKey))) */js.Any
    ]
  ] = js.native
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("mapValues")
  def mapValues_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[T | (js.UndefOr[T | scala.Null])]): LoDashExplicitAsyncWrapper[T] = js.native
  @JSName("mapValues")
  def mapValues_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]], iteratee: java.lang.String): LoDashExplicitAsyncWrapper[lowdbLib.lowdbLibStrings.LoDashExplicitAsyncWrapper with js.Any] = js.native
  @JSName("mapValues")
  def mapValues_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]], iteratee: js.Object): LoDashExplicitAsyncWrapper[lowdbLib.lowdbLibStrings.LoDashExplicitAsyncWrapper with js.Any] = js.native
  @JSName("mapValues")
  def mapValues_TObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, TResult]
  ): LoDashExplicitAsyncWrapper[lowdbLib.lowdbLibStrings.LoDashExplicitAsyncWrapper with js.Any] = js.native
  @JSName("mapValues")
  def mapValues_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    callback: lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, TResult]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[TResult]] = js.native
  @JSName("map")
  def map_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[T] | scala.Null | lodashLib.lodashMod.underscoreNs.List[T]]],
    iteratee: (lodashLib.lodashMod.underscoreNs.ArrayIterator[T, TResult]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, TResult])
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def matches[V](): LoDashExplicitAsyncWrapper[js.Function1[/* value */ V, scala.Boolean]] = js.native
  def matchesProperty[SrcValue](srcValue: SrcValue): LoDashExplicitAsyncWrapper[js.Function1[/* value */ _, scala.Boolean]] = js.native
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): LoDashExplicitAsyncWrapper[js.Function1[/* value */ Value, scala.Boolean]] = js.native
  def max[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def maxBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def maxBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def mean(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def meanBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def meanBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def memoize(): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */js.Any, _]): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.MemoizedFunction] = js.native
  def merge(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def merge[TSource](source: TSource): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def mergeWith(otherArgs: js.Any*): LoDashExplicitAsyncWrapper[_] = js.native
  def mergeWith[TSource](source: TSource, customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer): LoDashExplicitAsyncWrapper[TValue with TSource] = js.native
  def mergeWith[TSource1, TSource2](
    source1: TSource1,
    source2: TSource2,
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2] = js.native
  def mergeWith[TSource1, TSource2, TSource3](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer
  ): LoDashExplicitAsyncWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  def method(args: js.Any*): LoDashExplicitAsyncWrapper[js.Function1[/* object */ _, _]] = js.native
  def methodOf(args: js.Any*): LoDashExplicitAsyncWrapper[js.Function1[/* path */ lodashLib.lodashMod.underscoreNs.PropertyPath, _]] = js.native
  def min[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def minBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def minBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def mixin(): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.LoDashStatic] = js.native
  def mixin(options: lodashLib.lodashMod.underscoreNs.MixinOptions): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.LoDashStatic] = js.native
  def mixin(source: lodashLib.lodashMod.underscoreNs.Dictionary[js.Function1[/* repeated */_, _]]): this.type = js.native
  def mixin(
    source: lodashLib.lodashMod.underscoreNs.Dictionary[js.Function1[/* repeated */_, _]],
    options: lodashLib.lodashMod.underscoreNs.MixinOptions
  ): this.type = js.native
  def multiply(multiplicand: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def negate(
    `this`: LoDashExplicitAsyncWrapper[js.Function0[scala.Boolean] | (js.Function1[/* repeated */_, _])]
  ): LoDashExplicitAsyncWrapper[js.Function0[scala.Boolean]] = js.native
  @JSName("negate")
  def negate_A1[A1](`this`: LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, scala.Boolean]]): LoDashExplicitAsyncWrapper[js.Function1[/* a1 */ A1, scala.Boolean]] = js.native
  @JSName("negate")
  def negate_A1A2[A1, A2](`this`: LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, scala.Boolean]]): LoDashExplicitAsyncWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, scala.Boolean]] = js.native
  def noConflict(): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.LoDashStatic] = js.native
  def noop(args: js.Any*): LoDashExplicitAsyncWrapper[js.UndefOr[scala.Nothing]] = js.native
  def now(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def nth[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def nth[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def nthArg(): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def omit[T /* <: lodashLib.lodashMod.underscoreNs.AnyKindOfDictionary */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    paths: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.PropertyName]*
  ): LoDashExplicitAsyncWrapper[T] = js.native
  def omitBy[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def omitBy[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  @JSName("omitBy")
  def omitBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  @JSName("omit")
  def omit_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    paths: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.PropertyName]*
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  @JSName("omit")
  def omit_TObjectKString[T /* <: js.Object */, K /* <: java.lang.String */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    paths: lodashLib.lodashMod.underscoreNs.Many[K]*
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Omit[T, K]] = js.native
  def orderBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def orderBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ListIteratee[T] | (lodashLib.lodashMod.underscoreNs.ListIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def orderBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ListIteratee[T] | (lodashLib.lodashMod.underscoreNs.ListIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lowdbLib.lowdbLibStrings.asc | lowdbLib.lowdbLibStrings.desc]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("orderBy")
  def orderBy_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("orderBy")
  def orderBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ObjectIteratee[T] | (lodashLib.lodashMod.underscoreNs.ObjectIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ]
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("orderBy")
  def orderBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ObjectIteratee[T] | (lodashLib.lodashMod.underscoreNs.ObjectIterator[T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lowdbLib.lowdbLibStrings.asc | lowdbLib.lowdbLibStrings.desc]
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def over[TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, TResult]]],
    iteratees: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, TResult]])*
  ): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, js.Array[TResult]]] = js.native
  def overArgs(transforms: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */_, _]])*): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def overEvery[T](predicates: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */T, scala.Boolean]])*): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */T, scala.Boolean]] = js.native
  def overSome[T](predicates: (lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* repeated */T, scala.Boolean]])*): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */T, scala.Boolean]] = js.native
  def pad(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def pad(length: scala.Double): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def pad(length: scala.Double, chars: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def padEnd(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def padEnd(length: scala.Double): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def padEnd(length: scala.Double, chars: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def padStart(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def padStart(length: scala.Double): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def padStart(length: scala.Double, chars: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def parseInt(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def parseInt(radix: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
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
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null | T]],
    callback: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      T | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any)
    ]
  ): LoDashExplicitAsyncWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  def pick[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    props: lodashLib.lodashMod.underscoreNs.PropertyPath*
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  def pickBy[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def pickBy[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def pickBy[T, S /* <: T */](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | scala.Null | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
      ]
    ],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIterateeTypeGuard[T, S]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[S]] = js.native
  @JSName("pickBy")
  def pickBy_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  @JSName("pickBy")
  def pickBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.PartialObject[T]] = js.native
  @JSName("pick")
  def pick_TObjectUString[T /* <: js.Object */, U /* <: java.lang.String */](`this`: LoDashExplicitAsyncWrapper[T], props: lodashLib.lodashMod.underscoreNs.Many[U]*): LoDashExplicitAsyncWrapper[stdLib.Pick[T, U]] = js.native
  def plant[T](value: T): LoDashExplicitAsyncWrapper[T] = js.native
  def pop[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def property[TObj, TResult](): LoDashExplicitAsyncWrapper[js.Function1[/* obj */ TObj, TResult]] = js.native
  def propertyOf(): LoDashExplicitAsyncWrapper[js.Function1[/* path */ lodashLib.lodashMod.underscoreNs.PropertyPath, _]] = js.native
  def pull[T](`this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]], values: T*): this.type = js.native
  def pullAll[T](`this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]]): this.type = js.native
  def pullAll[T](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    values: lodashLib.lodashMod.underscoreNs.List[T]
  ): this.type = js.native
  def push[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    items: T*
  ): this.type = js.native
  def random(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def random(floating: scala.Boolean): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def random(max: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def random(max: scala.Double, floating: scala.Boolean): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def range(): LoDashExplicitAsyncWrapper[js.Array[scala.Double]] = js.native
  def range(end: scala.Double): LoDashExplicitAsyncWrapper[js.Array[scala.Double]] = js.native
  def range(end: scala.Double, step: scala.Double): LoDashExplicitAsyncWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(): LoDashExplicitAsyncWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(end: scala.Double): LoDashExplicitAsyncWrapper[js.Array[scala.Double]] = js.native
  def rangeRight(end: scala.Double, step: scala.Double): LoDashExplicitAsyncWrapper[js.Array[scala.Double]] = js.native
  def rearg(indexes: lodashLib.lodashMod.underscoreNs.Many[scala.Double]*): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def reduce[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[T] | scala.Null | lodashLib.lodashMod.underscoreNs.List[T]]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, T, lodashLib.lodashMod.underscoreNs.List[T] | js.Array[T]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def reduce[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  def reduceRight[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[T] | scala.Null | lodashLib.lodashMod.underscoreNs.List[T]]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, T, lodashLib.lodashMod.underscoreNs.List[T] | js.Array[T]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def reduceRight[T /* <: js.Object */, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      T
    ]
  ): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("reduceRight")
  def reduceRight_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[T] | scala.Null | lodashLib.lodashMod.underscoreNs.List[T]]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, TResult, lodashLib.lodashMod.underscoreNs.List[T] | js.Array[T]],
    accumulator: TResult
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  @JSName("reduce")
  def reduce_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    callback: lodashLib.lodashMod.underscoreNs.MemoObjectIterator[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      T
    ]
  ): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("reduce")
  def reduce_TTResult[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[js.Array[T] | scala.Null | lodashLib.lodashMod.underscoreNs.List[T]]],
    callback: lodashLib.lodashMod.underscoreNs.MemoListIterator[T, TResult, lodashLib.lodashMod.underscoreNs.List[T] | js.Array[T]],
    accumulator: TResult
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  def reject(`this`: LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String | scala.Null]]): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def reject(
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[java.lang.String | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.StringIterator[scala.Boolean]
  ): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def reject[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("reject")
  def reject_T[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("reject")
  def reject_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("reject")
  def reject_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def remove[T](`this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]]): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def remove[T](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def repeat(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def repeat(n: scala.Double): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def replace(pattern: java.lang.String, replacement: lodashLib.lodashMod.underscoreNs.ReplaceFunction): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def replace(pattern: stdLib.RegExp, replacement: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def replace(pattern: stdLib.RegExp, replacement: lodashLib.lodashMod.underscoreNs.ReplaceFunction): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def replace(replacement: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def replace(replacement: lodashLib.lodashMod.underscoreNs.ReplaceFunction): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def rest(): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def rest(start: scala.Double): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, _]] = js.native
  def result[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitAsyncWrapper[TResult] = js.native
  def result[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath, defaultValue: TResult): LoDashExplicitAsyncWrapper[TResult] = js.native
  def result[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    defaultValue: js.Function1[/* repeated */js.Any, TResult]
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  def round(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def round(precision: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sample[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def sampleSize[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def sampleSize[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ],
    n: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("sampleSize")
  def sampleSize_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("sampleSize")
  def sampleSize_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]], n: scala.Double): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("sample")
  def sample_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.UndefOr[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def set(path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): this.type = js.native
  def setWith(path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): this.type = js.native
  def setWith(
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    value: js.Any,
    customizer: lodashLib.lodashMod.underscoreNs.SetWithCustomizer[TValue]
  ): this.type = js.native
  @JSName("setWith")
  def setWith_TResultLoDashExplicitAsyncWrapper[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): LoDashExplicitAsyncWrapper[TResult] = js.native
  @JSName("setWith")
  def setWith_TResultLoDashExplicitAsyncWrapper[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    value: js.Any,
    customizer: lodashLib.lodashMod.underscoreNs.SetWithCustomizer[TValue]
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  @JSName("set")
  def set_TResultLoDashExplicitAsyncWrapper[TResult](path: lodashLib.lodashMod.underscoreNs.PropertyPath, value: js.Any): LoDashExplicitAsyncWrapper[TResult] = js.native
  def shift[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.UndefOr[T]] = js.native
  def shuffle[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("shuffle")
  def shuffle_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def size(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def slice[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def slice[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def slice[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double,
    end: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def snakeCase(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def some[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def some[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  @JSName("some")
  def some_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  @JSName("some")
  def some_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ObjectIterateeCustom[T, scala.Boolean]
  ): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def sort[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): this.type = js.native
  def sort[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]
  ): this.type = js.native
  def sortBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ListIteratee[T]]*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("sortBy")
  def sortBy_TObject[T /* <: js.Object */](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]],
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ObjectIteratee[T]]*
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def sortedIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sortedIndexBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sortedIndexBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sortedIndexOf[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sortedLastIndex[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sortedLastIndexBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sortedLastIndexOf[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    value: T
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sortedUniq[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def sortedUniqBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def splice[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double
  ): this.type = js.native
  def splice[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    start: scala.Double,
    deleteCount: scala.Double,
    items: T*
  ): this.type = js.native
  def split(): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String, limit: scala.Double): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp, limit: scala.Double): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def spread[TResult](`this`: LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, TResult]]): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, TResult]] = js.native
  def spread[TResult](`this`: LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, TResult]], start: scala.Double): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, TResult]] = js.native
  def startCase(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def startsWith(): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def startsWith(target: java.lang.String): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def startsWith(target: java.lang.String, position: scala.Double): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def stubArray(): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def stubFalse(): LoDashExplicitAsyncWrapper[lowdbLib.lowdbLibNumbers.`false`] = js.native
  def stubObject(): LoDashExplicitAsyncWrapper[_] = js.native
  def stubString(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def stubTrue(): LoDashExplicitAsyncWrapper[lowdbLib.lowdbLibNumbers.`true`] = js.native
  def subtract(subtrahend: scala.Double): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sum(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sumBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sumBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: java.lang.String
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def sumBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: js.Function1[/* value */ T, scala.Double]
  ): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def tail[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def take[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def take[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def takeRight[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def takeRight[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    n: scala.Double
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def takeWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def takeWhile[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    predicate: lodashLib.lodashMod.underscoreNs.ListIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def template(): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.TemplateExecutor] = js.native
  def template(options: lodashLib.lodashMod.underscoreNs.TemplateOptions): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.TemplateExecutor] = js.native
  def throttle(): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def throttle(wait: scala.Double): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def throttle(wait: scala.Double, options: lodashLib.lodashMod.underscoreNs.ThrottleSettings): LoDashExplicitAsyncWrapper[TValue with lodashLib.lodashMod.underscoreNs.Cancelable] = js.native
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): LoDashExplicitAsyncWrapper[TResult] = js.native
  def times(): LoDashExplicitAsyncWrapper[js.Array[scala.Double]] = js.native
  def times[TResult](iteratee: js.Function1[/* num */ scala.Double, TResult]): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def toArray[T /* <: js.Object */](`this`: lodashLib.lodashMod.underscoreNs.LoDashImplicitWrapper[T]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def toArray[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[T] | lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def toFinite(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def toInteger(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def toLength(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def toLower(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def toNumber(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def toPairs(): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def toPairs[T](
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  def toPairsIn(): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, _]]] = js.native
  def toPairsIn[T](
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[java.lang.String, T]]] = js.native
  def toPath(): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def toPlainObject(): LoDashExplicitAsyncWrapper[_] = js.native
  def toSafeInteger(): LoDashExplicitAsyncWrapper[scala.Double] = js.native
  def toUpper(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def transform(): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[_]] = js.native
  def transform(`this`: LoDashExplicitAsyncWrapper[js.Array[_]]): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T] | js.Array[T]],
    iteratee: (lodashLib.lodashMod.underscoreNs.MemoVoidArrayIterator[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult] | js.Array[TResult]]) | (lodashLib.lodashMod.underscoreNs.MemoVoidDictionaryIterator[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult] | js.Array[TResult]])
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T] | js.Array[T]],
    iteratee: (lodashLib.lodashMod.underscoreNs.MemoVoidArrayIterator[T, js.Array[TResult]]) | (lodashLib.lodashMod.underscoreNs.MemoVoidDictionaryIterator[T, js.Array[TResult]]),
    accumulator: js.Array[TResult]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T] | js.Array[T]],
    iteratee: (lodashLib.lodashMod.underscoreNs.MemoVoidArrayIterator[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]]) | (lodashLib.lodashMod.underscoreNs.MemoVoidDictionaryIterator[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]]),
    accumulator: lodashLib.lodashMod.underscoreNs.Dictionary[TResult]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[TResult]] = js.native
  def trim(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def trim(chars: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def trimEnd(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def trimEnd(chars: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def trimStart(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def trimStart(chars: java.lang.String): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def truncate(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def truncate(options: lodashLib.lodashMod.underscoreNs.TruncateOptions): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def unary[T, TResult](`this`: LoDashExplicitAsyncWrapper[js.Function2[/* arg1 */ T, /* repeated */_, TResult]]): LoDashExplicitAsyncWrapper[js.Function1[/* arg1 */ T, TResult]] = js.native
  def unescape(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def union[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays: (js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T],
    arrays5: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def uniq[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def uniqBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def uniqWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def uniqWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def uniqueId(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def unset(path: lodashLib.lodashMod.underscoreNs.PropertyPath): LoDashExplicitAsyncWrapper[scala.Boolean] = js.native
  def unshift[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    items: T*
  ): this.type = js.native
  def unzip[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        js.Array[js.Array[T]] | lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Array[T]]] = js.native
  def unzipWith[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Array[T]]] = js.native
  def unzipWith[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]] | scala.Null
      ]
    ],
    iteratee: js.Function1[/* repeated */T, TResult]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def update(path: lodashLib.lodashMod.underscoreNs.PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LoDashExplicitAsyncWrapper[_] = js.native
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
  def updateWith_TResultLoDashExplicitAsyncWrapper[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResultLoDashExplicitAsyncWrapper[TResult](
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: lodashLib.lodashMod.underscoreNs.SetWithCustomizer[TValue]
  ): LoDashExplicitAsyncWrapper[TResult] = js.native
  def upperCase(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def upperFirst(): LoDashExplicitAsyncWrapper[java.lang.String] = js.native
  def values(): LoDashExplicitAsyncWrapper[js.Array[_]] = js.native
  def values[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def valuesIn[T](
    `this`: LoDashExplicitAsyncWrapper[
      js.UndefOr[
        lodashLib.lodashMod.underscoreNs.Dictionary[T] | lodashLib.lodashMod.underscoreNs.NumericDictionary[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
      ]
    ]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  @JSName("valuesIn")
  def valuesIn_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  @JSName("values")
  def values_TObject[T /* <: js.Object */](`this`: LoDashExplicitAsyncWrapper[js.UndefOr[T | scala.Null]]): LoDashExplicitAsyncWrapper[
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ]
  ] = js.native
  def without[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    values: T*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def words(): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def words(pattern: java.lang.String): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def words(pattern: stdLib.RegExp): LoDashExplicitAsyncWrapper[js.Array[java.lang.String]] = js.native
  def wrap[TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */js.Any, TResult]): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */_, TResult]] = js.native
  @JSName("wrap")
  def wrap_TArgsTResult[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */TArgs, TResult]): LoDashExplicitAsyncWrapper[js.Function1[/* repeated */TArgs, TResult]] = js.native
  def write(): js.Promise[TValue] = js.native
  def xor[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays: (js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    arrays3: lodashLib.lodashMod.underscoreNs.List[T],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays2: scala.Null,
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: (js.UndefOr[
      lodashLib.lodashMod.underscoreNs.Comparator[T] | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    comparator: lodashLib.lodashMod.underscoreNs.Comparator[T]
  ): LoDashExplicitAsyncWrapper[js.Array[T]] = js.native
  def zip[T](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    arrays: (js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null])*
  ): LoDashExplicitAsyncWrapper[js.Array[js.Array[js.UndefOr[T]]]] = js.native
  def zip[T1, T2](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]] = js.native
  def zip[T1, T2, T3](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3]
  ): LoDashExplicitAsyncWrapper[js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]]] = js.native
  def zip[T1, T2, T3, T4](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T4]
  ): LoDashExplicitAsyncWrapper[
    js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]]
  ] = js.native
  def zip[T1, T2, T3, T4, T5](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T4],
    arrays5: lodashLib.lodashMod.underscoreNs.List[T5]
  ): LoDashExplicitAsyncWrapper[
    js.Array[
      js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
    ]
  ] = js.native
  def zipObject(
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyName]
    ]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[js.UndefOr[scala.Nothing]]] = js.native
  def zipObject[T](
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyName]
    ],
    values: lodashLib.lodashMod.underscoreNs.List[T]
  ): LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.Dictionary[T]] = js.native
  def zipObjectDeep(
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyPath]
    ]
  ): LoDashExplicitAsyncWrapper[js.Object] = js.native
  def zipObjectDeep(
    `this`: LoDashExplicitAsyncWrapper[
      lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.PropertyPath]
    ],
    values: lodashLib.lodashMod.underscoreNs.List[_]
  ): LoDashExplicitAsyncWrapper[js.Object] = js.native
  def zipWith[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[js.UndefOr[lodashLib.lodashMod.underscoreNs.List[T] | scala.Null]],
    iteratee: (js.UndefOr[
      (js.Function1[/* repeated */T, TResult]) | lodashLib.lodashMod.underscoreNs.List[T] | scala.Null
    ])*
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T]],
    iteratee: js.Function1[/* value1 */ T, TResult]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, T3, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    iteratee: js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, TResult]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, T3, T4, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
    arrays2: lodashLib.lodashMod.underscoreNs.List[T2],
    arrays3: lodashLib.lodashMod.underscoreNs.List[T3],
    arrays4: lodashLib.lodashMod.underscoreNs.List[T4],
    iteratee: js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, TResult]
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
  def zipWith[T1, T2, T3, T4, T5, TResult](
    `this`: LoDashExplicitAsyncWrapper[lodashLib.lodashMod.underscoreNs.List[T1]],
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
  ): LoDashExplicitAsyncWrapper[js.Array[TResult]] = js.native
}

