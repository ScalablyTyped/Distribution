package typings.kefir.kefirMod

import org.scalablytyped.runtime.StringDictionary
import typings.kefir.Anon_Off
import typings.kefir.kefirStrings.combine
import typings.node.NodeJSNs.EventEmitter
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
    */ combine with T, 
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
  def never(): Stream[scala.Nothing, scala.Nothing] = js.native
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

