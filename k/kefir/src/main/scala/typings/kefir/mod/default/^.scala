package typings.kefir.mod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.kefir.AnonObservable
import typings.kefir.AnonOff
import typings.kefir.Fn0
import typings.kefir.Fn1
import typings.kefir.FnCall
import typings.kefir.FnCallError
import typings.kefir.FnCallFn
import typings.kefir.FnCallGenerator
import typings.kefir.FnCallIntervalFn
import typings.kefir.FnCallIntervalHandler
import typings.kefir.FnCallIntervalValues
import typings.kefir.FnCallObservable
import typings.kefir.FnCallObss
import typings.kefir.FnCallObssObssPCombinator
import typings.kefir.FnCallObssPassiveObssCombinator
import typings.kefir.FnCallPromise
import typings.kefir.FnCallSubscribe
import typings.kefir.FnCallTargetEventNameTransform
import typings.kefir.FnCallValue
import typings.kefir.mod.Emitter
import typings.kefir.mod.Observable
import typings.kefir.mod.Pool_
import typings.kefir.mod.Property
import typings.kefir.mod.Stream_
import typings.kefir.mod.ValueOfAnObservable
import typings.node.NodeJS.EventEmitter
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", JSImport.Default)
@js.native
object ^ extends js.Object {
  var Observable: Instantiable0[typings.kefir.mod.Observable[js.Object, js.Object]] = js.native
  var Pool: Instantiable0[Pool_[js.Object, js.Object]] = js.native
  var Property: Instantiable0[typings.kefir.mod.Property[js.Object, js.Object]] = js.native
  var Stream: Instantiable0[Stream_[js.Object, js.Object]] = js.native
  @JSName("combine")
  var combine_Original: FnCallObssObssPCombinator = js.native
  @JSName("concat")
  var concat_Original: FnCallObss = js.native
  @JSName("constantError")
  var constantError_Original: FnCallError = js.native
  @JSName("constant")
  var constant_Original: FnCallValue = js.native
  @JSName("fromCallback")
  var fromCallback_Original: FnCallFn = js.native
  @JSName("fromESObservable")
  var fromESObservable_Original: FnCallObservable = js.native
  @JSName("fromEvents")
  var fromEvents_Original: FnCallTargetEventNameTransform = js.native
  @JSName("fromNodeCallback")
  var fromNodeCallback_Original: Fn0 = js.native
  @JSName("fromPoll")
  var fromPoll_Original: FnCallIntervalFn = js.native
  @JSName("fromPromise")
  var fromPromise_Original: FnCallPromise = js.native
  @JSName("interval")
  var interval_Original: FnCall = js.native
  @JSName("later")
  var later_Original: FnCall = js.native
  @JSName("merge")
  var merge_Original: FnCallObss = js.native
  @JSName("pool")
  var pool_Original: Fn1 = js.native
  @JSName("repeat")
  var repeat_Original: FnCallGenerator = js.native
  @JSName("sequentially")
  var sequentially_Original: FnCallIntervalValues = js.native
  var staticLand: AnonObservable = js.native
  @JSName("stream")
  var stream_Original: FnCallSubscribe = js.native
  @JSName("withInterval")
  var withInterval_Original: FnCallIntervalHandler = js.native
  @JSName("zip")
  var zip_Original: FnCallObssPassiveObssCombinator = js.native
  def combine[T /* <: js.Tuple6[
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _], 
    Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple6[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[5] */ js.Any
      ]
    ], 
    _
  ] = js.native
  def combine[T, S, U](obss: js.Array[Observable[T, S]], combinator: js.Function1[/* repeated */ T, U]): Stream_[U, S] = js.native
  def combine[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Stream_[U, S] = js.native
  def combine[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Stream_[U, S] = js.native
  @JSName("combine")
  def combine_0[T /* <: js.Array[Observable[_, _]] */, P /* <: js.Array[Observable[_, _]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): Observable[K, _] = js.native
  @JSName("combine")
  def combine_T_ArrayNothing[T /* <: js.Array[scala.Nothing] */](obss: T): Stream_[scala.Nothing, scala.Nothing] = js.native
  @JSName("combine")
  def combine_T_ArrayObservableWildcardWildcard[T /* <: js.Array[Observable[_, _]] */](obss: T): Stream_[
    js.Array[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_ArrayObservableWildcardWildcardP_String[T /* <: js.Array[Observable[_, _]] */, P /* <: String */](obss: T): Stream_[
    js.Array[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_StringDictionaryObservableWildcardWildcard[T /* <: StringDictionary[Observable[_, _]] */](obss: T): Stream_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: kefir.kefir.ValueOfAnObservable<T[P]>}
    */ typings.kefir.kefirStrings.^  with T, 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple2ObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple2[Observable[_, _], Observable[_, _]] */](obss: T): Stream_[
    js.Tuple2[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple3ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple3[Observable[_, _], Observable[_, _], Observable[_, _]] */](obss: T): Stream_[
    js.Tuple3[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple4ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple4[Observable[_, _], Observable[_, _], Observable[_, _], Observable[_, _]] */](obss: T): Stream_[
    js.Tuple4[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple5ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple5[Observable[_, _], Observable[_, _], Observable[_, _], Observable[_, _], Observable[_, _]] */](obss: T): Stream_[
    js.Tuple5[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ]
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
  ] */](obss: T): Stream_[
    js.Tuple7[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[5] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[6] */ js.Any
      ]
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
  ] */](obss: T): Stream_[
    js.Tuple8[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[5] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[6] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[7] */ js.Any
      ]
    ], 
    _
  ] = js.native
  def concat[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
  def constant[T](value: T): Property[T, scala.Nothing] = js.native
  def constantError[T](error: T): Property[scala.Nothing, T] = js.native
  def fromCallback[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream_[T, scala.Nothing] = js.native
  def fromESObservable[T, S](observable: js.Any): Stream_[T, S] = js.native
  def fromEvents[T, S](target: AnonOff, eventName: String): Stream_[T, S] = js.native
  def fromEvents[T, S](target: AnonOff, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventTarget, eventName: String): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def fromNodeCallback[T, S](fn: js.Function1[/* callback */ js.Function2[/* error */ S | Null, /* result */ T, Unit], Unit]): Stream_[T, S] = js.native
  def fromPoll[T](interval: Double, fn: js.Function0[T]): Stream_[T, scala.Nothing] = js.native
  def fromPromise[T, S](promise: js.Promise[T]): Property[T, S] = js.native
  def interval[T](interval: Double, value: T): Stream_[T, scala.Nothing] = js.native
  def later[T](interval: Double, value: T): Stream_[T, scala.Nothing] = js.native
  def merge[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
  def pool[T, S](): Pool_[T, S] = js.native
  def repeat[T, S](generator: js.Function1[/* i */ Double, (Observable[T, S]) | Boolean]): Observable[T, S] = js.native
  def sequentially[T](interval: Double, values: js.Array[T]): Stream_[T, scala.Nothing] = js.native
  def stream[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream_[T, S] = js.native
  def withInterval[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream_[T, S] = js.native
  def zip[T, S, U](obss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def zip[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def zip[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Observable[U, S] = js.native
}

