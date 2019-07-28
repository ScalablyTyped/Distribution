package typings.kefir.kefirMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.kefir.Anon_Observable
import typings.kefir.Anon_Off
import typings.kefir.Fn_
import typings.kefir.Fn_Callback
import typings.kefir.Fn_CallbackError
import typings.kefir.Fn_Combinator
import typings.kefir.Fn_Emitter
import typings.kefir.Fn_EmitterSubscribe
import typings.kefir.Fn_Error
import typings.kefir.Fn_EventName
import typings.kefir.Fn_Fn
import typings.kefir.Fn_Generator
import typings.kefir.Fn_Interval
import typings.kefir.Fn_IntervalValues
import typings.kefir.Fn_Observable
import typings.kefir.Fn_Obss
import typings.kefir.Fn_Pool
import typings.kefir.Fn_Promise
import typings.kefir.Fn_Value
import typings.kefir.Fn_ValueNever
import typings.node.NodeJSNs.EventEmitter
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in defaultNs */
@JSImport("kefir", JSImport.Default)
@js.native
object default extends js.Object {
  var Observable: Instantiable0[typings.kefir.kefirMod.Observable[js.Object, js.Object]] = js.native
  var Pool: Instantiable0[typings.kefir.kefirMod.Pool[js.Object, js.Object]] = js.native
  var Property: Instantiable0[typings.kefir.kefirMod.Property[js.Object, js.Object]] = js.native
  var Stream: Instantiable0[typings.kefir.kefirMod.Stream[js.Object, js.Object]] = js.native
  @JSName("combine")
  var combine_Original: Fn_ = js.native
  @JSName("concat")
  var concat_Original: Fn_Obss = js.native
  @JSName("constantError")
  var constantError_Original: Fn_Error = js.native
  @JSName("constant")
  var constant_Original: Fn_ValueNever = js.native
  @JSName("fromCallback")
  var fromCallback_Original: Fn_Callback = js.native
  @JSName("fromESObservable")
  var fromESObservable_Original: Fn_Observable = js.native
  @JSName("fromEvents")
  var fromEvents_Original: Fn_EventName = js.native
  @JSName("fromNodeCallback")
  var fromNodeCallback_Original: Fn_CallbackError = js.native
  @JSName("fromPoll")
  var fromPoll_Original: Fn_Fn = js.native
  @JSName("fromPromise")
  var fromPromise_Original: Fn_Promise = js.native
  @JSName("interval")
  var interval_Original: Fn_Interval = js.native
  @JSName("later")
  var later_Original: Fn_Value = js.native
  @JSName("merge")
  var merge_Original: Fn_Obss = js.native
  @JSName("pool")
  var pool_Original: Fn_Pool = js.native
  @JSName("repeat")
  var repeat_Original: Fn_Generator = js.native
  @JSName("sequentially")
  var sequentially_Original: Fn_IntervalValues = js.native
  var staticLand: Anon_Observable = js.native
  @JSName("stream")
  var stream_Original: Fn_EmitterSubscribe = js.native
  @JSName("withInterval")
  var withInterval_Original: Fn_Emitter = js.native
  @JSName("zip")
  var zip_Original: Fn_Combinator = js.native
  def combine[T /* <: js.Tuple6[
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _]
  ] */](obss: T): Stream[
    js.Tuple6[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[1] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[2] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[3] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[4] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[5] */ js.Any]
    ], 
    _
  ] = js.native
  def combine[T, S, U](obss: js.Array[Observable[T, S]], combinator: js.Function1[/* repeated */ T, U]): Stream[U, S] = js.native
  def combine[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Stream[U, S] = js.native
  def combine[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Stream[U, S] = js.native
  @JSName("combine")
  def combine_0[T /* <: js.Array[Observable[_, _]] */, P /* <: js.Array[Observable[_, _]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): Observable[K, _] = js.native
  @JSName("combine")
  def combine_T_ArrayNothing[T /* <: js.Array[scala.Nothing] */](obss: T): Stream[scala.Nothing, scala.Nothing] = js.native
  @JSName("combine")
  def combine_T_ArrayObservableWildcardWildcard[T /* <: js.Array[Observable[_, _]] */](obss: T): Stream[
    js.Array[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_ArrayObservableWildcardWildcardP_String[T /* <: js.Array[Observable[_, _]] */, P /* <: String */](obss: T): Stream[
    js.Array[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_StringDictionaryObservableWildcardWildcard[T /* <: StringDictionary[Observable[_, _]] */](obss: T): Stream[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: kefir.kefir.ValueOfAnObservable<T[P]>}
    */ typings.kefir.kefirStrings.default with T, 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple2ObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple2[Observable[_, _], Observable[_, _]] */](obss: T): Stream[
    js.Tuple2[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[1] */ js.Any]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple3ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple3[Observable[_, _], Observable[_, _], Observable[_, _]] */](obss: T): Stream[
    js.Tuple3[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[1] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[2] */ js.Any]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple4ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple4[Observable[_, _], Observable[_, _], Observable[_, _], Observable[_, _]] */](obss: T): Stream[
    js.Tuple4[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[1] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[2] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[3] */ js.Any]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple5ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple5[Observable[_, _], Observable[_, _], Observable[_, _], Observable[_, _], Observable[_, _]] */](obss: T): Stream[
    js.Tuple5[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[1] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[2] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[3] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[4] */ js.Any]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple7ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple7[
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _]
  ] */](obss: T): Stream[
    js.Tuple7[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[1] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[2] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[3] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[4] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[5] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[6] */ js.Any]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple8ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple8[
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _]
  ] */](obss: T): Stream[
    js.Tuple8[
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[1] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[2] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[3] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[4] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[5] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[6] */ js.Any], 
      ValueOfAnObservable[/* import warning: ImportType.apply Failed type conversion: T[7] */ js.Any]
    ], 
    _
  ] = js.native
  def concat[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
  def constant[T](value: T): Property[T, scala.Nothing] = js.native
  def constantError[T](error: T): Property[scala.Nothing, T] = js.native
  def fromCallback[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream[T, scala.Nothing] = js.native
  def fromESObservable[T, S](observable: js.Any): Stream[T, S] = js.native
  def fromEvents[T, S](target: Anon_Off, eventName: String): Stream[T, S] = js.native
  def fromEvents[T, S](target: Anon_Off, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String): Stream[T, S] = js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
  def fromEvents[T, S](target: EventTarget, eventName: String): Stream[T, S] = js.native
  def fromEvents[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
  def fromNodeCallback[T, S](fn: js.Function1[/* callback */ js.Function2[/* error */ S | Null, /* result */ T, Unit], Unit]): Stream[T, S] = js.native
  def fromPoll[T](interval: Double, fn: js.Function0[T]): Stream[T, scala.Nothing] = js.native
  def fromPromise[T, S](promise: js.Promise[T]): Property[T, S] = js.native
  def interval[T](interval: Double, value: T): Stream[T, scala.Nothing] = js.native
  def later[T](wait: Double, value: T): Stream[T, scala.Nothing] = js.native
  def merge[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
  def pool[T, S](): Pool[T, S] = js.native
  def repeat[T, S](generator: js.Function1[/* i */ Double, (Observable[T, S]) | Boolean]): Observable[T, S] = js.native
  def sequentially[T](interval: Double, values: js.Array[T]): Stream[T, scala.Nothing] = js.native
  def stream[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream[T, S] = js.native
  def withInterval[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream[T, S] = js.native
  def zip[T, S, U](obss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def zip[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def zip[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Observable[U, S] = js.native
}

