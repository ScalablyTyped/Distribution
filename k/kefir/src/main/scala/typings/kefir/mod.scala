package typings.kefir

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.kefir.anon.Ap
import typings.kefir.anon.Convert
import typings.kefir.anon.FlushOnChange
import typings.kefir.anon.FlushOnEnd
import typings.kefir.anon.Fn0
import typings.kefir.anon.Fn1
import typings.kefir.anon.FnCall
import typings.kefir.anon.FnCallError
import typings.kefir.anon.FnCallFn
import typings.kefir.anon.FnCallGenerator
import typings.kefir.anon.FnCallIntervalFn
import typings.kefir.anon.FnCallIntervalHandler
import typings.kefir.anon.FnCallIntervalValues
import typings.kefir.anon.FnCallObservable
import typings.kefir.anon.FnCallObss
import typings.kefir.anon.FnCallObssObssPCombinator
import typings.kefir.anon.FnCallObssPassiveObssCombinator
import typings.kefir.anon.FnCallPromise
import typings.kefir.anon.FnCallSubscribe
import typings.kefir.anon.FnCallTargetEventNameTransform
import typings.kefir.anon.FnCallValue
import typings.kefir.anon.Immediate
import typings.kefir.anon.Leading
import typings.kefir.anon.Off
import typings.kefir.anon.Unsubscribe
import typings.kefir.anon.Value
import typings.kefir.kefirStrings.combine
import typings.kefir.kefirStrings.end
import typings.kefir.kefirStrings.error
import typings.kefir.kefirStrings.value
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("kefir", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kefir", "default.Observable")
    @js.native
    def Observable: Instantiable0[typings.kefir.mod.Observable[js.Object, js.Object]] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("kefir", "default.Observable")
    @js.native
    class ObservableCls[T, S] () extends Observable[T, S]
    
    @scala.inline
    def Observable_=(x: Instantiable0[Observable[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Observable")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("kefir", "default.Pool")
    @js.native
    class PoolCls[T, S] () extends Pool_[T, S]
    
    @JSImport("kefir", "default.Pool")
    @js.native
    def Pool_ : Instantiable0[typings.kefir.mod.Pool_[js.Object, js.Object]] = js.native
    
    @scala.inline
    def Pool__=(x: Instantiable0[Pool_[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pool")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.Property")
    @js.native
    def Property: Instantiable0[typings.kefir.mod.Property[js.Object, js.Object]] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("kefir", "default.Property")
    @js.native
    class PropertyCls[T, S] () extends Property[T, S]
    
    @scala.inline
    def Property_=(x: Instantiable0[Property[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Property")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("kefir", "default.Stream")
    @js.native
    class StreamCls[T, S] () extends Stream_[T, S]
    
    @JSImport("kefir", "default.Stream")
    @js.native
    def Stream_ : Instantiable0[typings.kefir.mod.Stream_[js.Object, js.Object]] = js.native
    
    @scala.inline
    def Stream__=(x: Instantiable0[Stream_[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stream")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.combine")
    @js.native
    def combine: FnCallObssObssPCombinator = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine[T /* <: js.Array[Observable[_, _]] */](obss: T): Stream_[
        js.Array[
          ValueOfAnObservable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ], 
        _
      ] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine[T /* <: StringDictionary[Observable[_, _]] */, K /* <: StringDictionary[Observable[_, _]] */](obss: T, passiveObss: K): Stream_[typings.kefir.kefirStrings.combine with TopLevel[T] with TopLevel[K], _] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine[T, S, U](obss: js.Array[Observable[T, S]], combinator: js.Function1[/* repeated */ T, U]): Stream_[U, S] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Stream_[U, S] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine[T, S, U](
      obss: js.Array[Observable[T, S]],
      passiveObss: js.Array[Observable[T, S]],
      combinator: js.Function1[/* repeated */ T, U]
    ): Stream_[U, S] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine_0[T /* <: js.Array[Observable[_, _]] */, P /* <: js.Array[Observable[_, _]] */, K](
      obss: T,
      obssP: P,
      combinator: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
          K
        ]
    ): Observable[K, _] = js.native
    @scala.inline
    def combine_=(x: FnCallObssObssPCombinator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combine")(x.asInstanceOf[js.Any])
    @JSImport("kefir", "default.combine")
    @js.native
    def combine_T_ArrayNothing[T /* <: js.Array[scala.Nothing] */](obss: T): Stream_[scala.Nothing, scala.Nothing] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine_T_ArrayObservableWildcardWildcardP_String[T /* <: js.Array[Observable[_, _]] */, P /* <: /* keyof T */ String */](obss: T): Stream_[
        js.Array[
          ValueOfAnObservable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ], 
        _
      ] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
    def combine_T_StringDictionaryObservableWildcardWildcard[T /* <: StringDictionary[Observable[_, _]] */](obss: T): Stream_[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: kefir.kefir.ValueOfAnObservable<T[P]>}
      */ combine with TopLevel[T], 
        _
      ] = js.native
    @JSImport("kefir", "default.combine")
    @js.native
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
    @JSImport("kefir", "default.combine")
    @js.native
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
    @JSImport("kefir", "default.combine")
    @js.native
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
    @JSImport("kefir", "default.combine")
    @js.native
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
    @JSImport("kefir", "default.combine")
    @js.native
    def combine_T_Tuple6ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple6[
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
    @JSImport("kefir", "default.combine")
    @js.native
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
    @JSImport("kefir", "default.combine")
    @js.native
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
    
    @JSImport("kefir", "default.concat")
    @js.native
    def concat: FnCallObss = js.native
    @JSImport("kefir", "default.concat")
    @js.native
    def concat[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
    @scala.inline
    def concat_=(x: FnCallObss): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concat")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.constant")
    @js.native
    def constant: FnCallValue = js.native
    @JSImport("kefir", "default.constant")
    @js.native
    def constant[T](value: T): Property[T, scala.Nothing] = js.native
    
    @JSImport("kefir", "default.constantError")
    @js.native
    def constantError: FnCallError = js.native
    @JSImport("kefir", "default.constantError")
    @js.native
    def constantError[T](error: T): Property[scala.Nothing, T] = js.native
    @scala.inline
    def constantError_=(x: FnCallError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constantError")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def constant_=(x: FnCallValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constant")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.fromCallback")
    @js.native
    def fromCallback: FnCallFn = js.native
    @JSImport("kefir", "default.fromCallback")
    @js.native
    def fromCallback[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream_[T, scala.Nothing] = js.native
    @scala.inline
    def fromCallback_=(x: FnCallFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromCallback")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.fromESObservable")
    @js.native
    def fromESObservable: FnCallObservable = js.native
    @JSImport("kefir", "default.fromESObservable")
    @js.native
    def fromESObservable[T, S](observable: js.Any): Stream_[T, S] = js.native
    @scala.inline
    def fromESObservable_=(x: FnCallObservable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromESObservable")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.fromEvents")
    @js.native
    def fromEvents: FnCallTargetEventNameTransform = js.native
    @JSImport("kefir", "default.fromEvents")
    @js.native
    def fromEvents[T, S](target: Off, eventName: String): Stream_[T, S] = js.native
    @JSImport("kefir", "default.fromEvents")
    @js.native
    def fromEvents[T, S](target: Off, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
    @JSImport("kefir", "default.fromEvents")
    @js.native
    def fromEvents[T, S](target: EventEmitter, eventName: String): Stream_[T, S] = js.native
    @JSImport("kefir", "default.fromEvents")
    @js.native
    def fromEvents[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
    @JSImport("kefir", "default.fromEvents")
    @js.native
    def fromEvents[T, S](target: EventTarget, eventName: String): Stream_[T, S] = js.native
    @JSImport("kefir", "default.fromEvents")
    @js.native
    def fromEvents[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
    @scala.inline
    def fromEvents_=(x: FnCallTargetEventNameTransform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEvents")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.fromNodeCallback")
    @js.native
    def fromNodeCallback: Fn0 = js.native
    @JSImport("kefir", "default.fromNodeCallback")
    @js.native
    def fromNodeCallback[T, S](fn: js.Function1[/* callback */ js.Function2[/* error */ S | Null, /* result */ T, Unit], Unit]): Stream_[T, S] = js.native
    @scala.inline
    def fromNodeCallback_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromNodeCallback")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.fromPoll")
    @js.native
    def fromPoll: FnCallIntervalFn = js.native
    @JSImport("kefir", "default.fromPoll")
    @js.native
    def fromPoll[T](interval: Double, fn: js.Function0[T]): Stream_[T, scala.Nothing] = js.native
    @scala.inline
    def fromPoll_=(x: FnCallIntervalFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPoll")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.fromPromise")
    @js.native
    def fromPromise: FnCallPromise = js.native
    @JSImport("kefir", "default.fromPromise")
    @js.native
    def fromPromise[T, S](promise: js.Promise[T]): Property[T, S] = js.native
    @scala.inline
    def fromPromise_=(x: FnCallPromise): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPromise")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.interval")
    @js.native
    def interval: FnCall = js.native
    @JSImport("kefir", "default.interval")
    @js.native
    def interval[T](interval: Double, value: T): Stream_[T, scala.Nothing] = js.native
    @scala.inline
    def interval_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.later")
    @js.native
    def later: FnCall = js.native
    @JSImport("kefir", "default.later")
    @js.native
    def later[T](interval: Double, value: T): Stream_[T, scala.Nothing] = js.native
    @scala.inline
    def later_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("later")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.merge")
    @js.native
    def merge: FnCallObss = js.native
    @JSImport("kefir", "default.merge")
    @js.native
    def merge[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
    @scala.inline
    def merge_=(x: FnCallObss): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.pool")
    @js.native
    def pool[T, S](): Pool_[T, S] = js.native
    @JSImport("kefir", "default.pool")
    @js.native
    def pool_Fdefault: Fn1 = js.native
    
    @scala.inline
    def pool_Fdefault_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pool")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.repeat")
    @js.native
    def repeat: FnCallGenerator = js.native
    @JSImport("kefir", "default.repeat")
    @js.native
    def repeat[T, S](generator: js.Function1[/* i */ Double, (Observable[T, S]) | Boolean]): Observable[T, S] = js.native
    @scala.inline
    def repeat_=(x: FnCallGenerator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeat")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.sequentially")
    @js.native
    def sequentially: FnCallIntervalValues = js.native
    @JSImport("kefir", "default.sequentially")
    @js.native
    def sequentially[T](interval: Double, values: js.Array[T]): Stream_[T, scala.Nothing] = js.native
    @scala.inline
    def sequentially_=(x: FnCallIntervalValues): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sequentially")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.staticLand")
    @js.native
    def staticLand: typings.kefir.anon.Observable = js.native
    @scala.inline
    def staticLand_=(x: typings.kefir.anon.Observable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticLand")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.stream")
    @js.native
    def stream: FnCallSubscribe = js.native
    @JSImport("kefir", "default.stream")
    @js.native
    def stream[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream_[T, S] = js.native
    @scala.inline
    def stream_=(x: FnCallSubscribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.withInterval")
    @js.native
    def withInterval: FnCallIntervalHandler = js.native
    @JSImport("kefir", "default.withInterval")
    @js.native
    def withInterval[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream_[T, S] = js.native
    @scala.inline
    def withInterval_=(x: FnCallIntervalHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("kefir", "default.zip")
    @js.native
    def zip: FnCallObssPassiveObssCombinator = js.native
    @JSImport("kefir", "default.zip")
    @js.native
    def zip[T, S, U](obss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
    @JSImport("kefir", "default.zip")
    @js.native
    def zip[T, S, U](
      obss: js.Array[Observable[T, S]],
      passiveObss: js.UndefOr[scala.Nothing],
      combinator: js.Function1[/* repeated */ T, U]
    ): Observable[U, S] = js.native
    @JSImport("kefir", "default.zip")
    @js.native
    def zip[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
    @JSImport("kefir", "default.zip")
    @js.native
    def zip[T, S, U](
      obss: js.Array[Observable[T, S]],
      passiveObss: js.Array[Observable[T, S]],
      combinator: js.Function1[/* repeated */ T, U]
    ): Observable[U, S] = js.native
    @scala.inline
    def zip_=(x: FnCallObssPassiveObssCombinator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zip")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("kefir", "Observable")
  @js.native
  class Observable[T, S] () extends StObject {
    
    @JSName("")
    var _empty: T = js.native
    
    def awaiting[U, V](otherObs: Observable[U, V]): Observable[Boolean, S] = js.native
    
    def beforeEnd[U](fn: js.Function0[U]): Observable[T | U, S] = js.native
    
    def bufferBy[U, V](otherObs: Observable[U, V]): Observable[js.Array[T], S] = js.native
    def bufferBy[U, V](otherObs: Observable[U, V], options: FlushOnEnd): Observable[js.Array[T], S] = js.native
    
    def bufferWhile(predicate: js.Function1[/* value */ T, Boolean]): Observable[js.Array[T], S] = js.native
    
    def bufferWhileBy[U](otherObs: Observable[Boolean, U]): Observable[js.Array[T], S] = js.native
    def bufferWhileBy[U](otherObs: Observable[Boolean, U], options: FlushOnChange): Observable[js.Array[T], S] = js.native
    
    def bufferWithCount(count: Double): Observable[js.Array[T], S] = js.native
    def bufferWithCount(count: Double, options: FlushOnEnd): Observable[js.Array[T], S] = js.native
    
    def bufferWithTimeOrCount(interval: Double, count: Double): Observable[js.Array[T], S] = js.native
    def bufferWithTimeOrCount(interval: Double, count: Double, options: FlushOnEnd): Observable[js.Array[T], S] = js.native
    
    def changes(): Observable[T, S] = js.native
    
    // Combine streams
    def combine[U, V, W](otherObs: Observable[U, V]): Observable[W, S | V] = js.native
    def combine[U, V, W](otherObs: Observable[U, V], combinator: js.Function2[/* value */ T, /* repeated */ U, W]): Observable[W, S | V] = js.native
    
    def concat[U, V](otherObs: Observable[U, V]): Observable[T | U, S | V] = js.native
    
    def debounce(wait: Double): Observable[T, S] = js.native
    def debounce(wait: Double, options: Immediate): Observable[T, S] = js.native
    
    def delay(wait: Double): Observable[T, S] = js.native
    
    def diff(): Observable[T, S] = js.native
    def diff(fn: js.UndefOr[scala.Nothing], seed: T): Observable[T, S] = js.native
    def diff(fn: js.Function2[/* prev */ T, /* next */ T, T]): Observable[T, S] = js.native
    def diff(fn: js.Function2[/* prev */ T, /* next */ T, T], seed: T): Observable[T, S] = js.native
    
    def endOnError(): Observable[T, S] = js.native
    
    def errorsToValues[U](): Observable[T | U, scala.Nothing] = js.native
    def errorsToValues[U](handler: js.Function1[/* error */ S, Value[U]]): Observable[T | U, scala.Nothing] = js.native
    
    def filter(): Observable[T, S] = js.native
    def filter(predicate: js.Function1[/* value */ T, Boolean]): Observable[T, S] = js.native
    
    // Combine two streams
    def filterBy[U](otherObs: Observable[Boolean, U]): Observable[T, S] = js.native
    
    def filterErrors(): Observable[T, S] = js.native
    def filterErrors(predicate: js.Function1[/* error */ S, Boolean]): Observable[T, S] = js.native
    
    @JSName("filter")
    def filter_U_T[U /* <: T */](fn: js.Function1[/* value */ T, /* is U */ Boolean]): Observable[U, S] = js.native
    
    def flatMap[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
    def flatMap[U, V](transform: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V | S] = js.native
    
    def flatMapConcat[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
    def flatMapConcat[U, V](fn: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V | S] = js.native
    
    def flatMapConcurLimit[U, V](fn: js.Function1[/* value */ T, Observable[U, V]], limit: Double): Observable[U, V | S] = js.native
    
    def flatMapErrors[U, V](transform: js.Function1[/* error */ S, Observable[U, V]]): Observable[U | T, V] = js.native
    
    def flatMapFirst[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
    def flatMapFirst[U, V](fn: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V | S] = js.native
    
    def flatMapLatest[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
    def flatMapLatest[U, V](fn: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V | S] = js.native
    
    def flatten[U](): Stream_[U, S] = js.native
    def flatten[U](transformer: js.Function1[/* value */ T, js.Array[U]]): Stream_[U, S] = js.native
    
    def ignoreEnd(): Observable[T, S] = js.native
    
    def ignoreErrors(): Observable[T, scala.Nothing] = js.native
    
    def ignoreValues(): Observable[scala.Nothing, S] = js.native
    
    def last(): Observable[T, S] = js.native
    
    def log(): this.type = js.native
    def log(name: String): this.type = js.native
    
    // Modify an stream
    def map[U](fn: js.Function1[/* value */ T, U]): Observable[U, S] = js.native
    
    def mapErrors[U](fn: js.Function1[/* error */ S, U]): Observable[T, U] = js.native
    
    def merge[U, V](otherObs: Observable[U, V]): Observable[T | U, S | V] = js.native
    
    def observe(): Subscription = js.native
    def observe(onValue: js.UndefOr[scala.Nothing], onError: js.UndefOr[scala.Nothing], onEnd: js.Function0[Unit]): Subscription = js.native
    def observe(onValue: js.UndefOr[scala.Nothing], onError: js.Function1[/* error */ S, Unit]): Subscription = js.native
    def observe(
      onValue: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ S, Unit],
      onEnd: js.Function0[Unit]
    ): Subscription = js.native
    def observe(onValue: js.Function1[/* value */ T, Unit]): Subscription = js.native
    def observe(
      onValue: js.Function1[/* value */ T, Unit],
      onError: js.UndefOr[scala.Nothing],
      onEnd: js.Function0[Unit]
    ): Subscription = js.native
    def observe(onValue: js.Function1[/* value */ T, Unit], onError: js.Function1[/* error */ S, Unit]): Subscription = js.native
    def observe(
      onValue: js.Function1[/* value */ T, Unit],
      onError: js.Function1[/* error */ S, Unit],
      onEnd: js.Function0[Unit]
    ): Subscription = js.native
    // This method is designed to replace all other methods for subscribing
    def observe(params: Observer[T, S]): Subscription = js.native
    
    def offAny(callback: js.Function1[/* event */ Event[T, S], Unit]): this.type = js.native
    
    def offEnd(callback: js.Function0[Unit]): this.type = js.native
    
    def offError(callback: js.Function1[/* error */ S, Unit]): this.type = js.native
    
    def offLog(): this.type = js.native
    def offLog(name: String): this.type = js.native
    
    def offSpy(): this.type = js.native
    def offSpy(name: String): this.type = js.native
    
    def offValue(callback: js.Function1[/* value */ T, Unit]): this.type = js.native
    
    def onAny(callback: js.Function1[/* event */ Event[T, S], Unit]): this.type = js.native
    
    def onEnd(callback: js.Function0[Unit]): this.type = js.native
    
    def onError(callback: js.Function1[/* error */ S, Unit]): this.type = js.native
    
    // Subscribe / add side effects
    def onValue(callback: js.Function1[/* value */ T, Unit]): this.type = js.native
    
    def sampledBy(otherObs: Observable[_, _]): Observable[T, S] = js.native
    def sampledBy[U, W](otherObs: Observable[U, _], combinator: js.Function2[/* a */ T, /* b */ U, W]): Observable[W, S] = js.native
    
    def scan[W](fn: js.Function2[/* prev */ T | W, /* next */ T, W]): Observable[W, S] = js.native
    def scan[W](fn: js.Function2[/* prev */ W, /* next */ T, W], seed: W): Observable[W, S] = js.native
    
    def setName(selfName: String): this.type = js.native
    def setName(source: Observable[_, _], selfName: String): this.type = js.native
    
    def skip(n: Double): Observable[T, S] = js.native
    
    def skipDuplicates(): Observable[T, S] = js.native
    def skipDuplicates(comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): Observable[T, S] = js.native
    
    def skipUntilBy[U, V](otherObs: Observable[U, V]): Observable[U, V] = js.native
    
    def skipWhile(): Observable[T, S] = js.native
    def skipWhile(predicate: js.Function1[/* value */ T, Boolean]): Observable[T, S] = js.native
    
    def slidingWindow(max: Double): Observable[js.Array[T], S] = js.native
    def slidingWindow(max: Double, mix: Double): Observable[js.Array[T], S] = js.native
    
    def spy(): this.type = js.native
    def spy(name: String): this.type = js.native
    
    def take(n: Double): Observable[T, S] = js.native
    
    def takeErrors(n: Double): Observable[T, S] = js.native
    
    def takeUntilBy[U, V](otherObs: Observable[U, V]): Observable[T, S] = js.native
    
    def takeWhile(): Observable[T, S] = js.native
    def takeWhile(predicate: js.Function1[/* value */ T, Boolean]): Observable[T, S] = js.native
    
    def throttle(wait: Double): Observable[T, S] = js.native
    def throttle(wait: Double, options: Leading): Observable[T, S] = js.native
    
    def thru[R](cb: js.Function1[/* obs */ Observable[T, S], R]): R = js.native
    
    def toESObservable(): ESObservable[T, S] = js.native
    
    def toPromise(): js.Promise[T] = js.native
    def toPromise[W /* <: js.Thenable[T] */](PromiseConstructor: js.Function0[W]): W = js.native
    
    // TypeScript hack to enable value unwrapping for combine/flatMap
    def toProperty(): Property[T, S] = js.native
    def toProperty[T2](getCurrent: js.Function0[T2]): Property[T | T2, S] = js.native
    @JSName("toProperty")
    def toProperty_T2[T2](): Property[T | T2, S] = js.native
    
    def transduce[U](transducer: js.Any): Observable[U, S] = js.native
    
    def valuesToErrors(): Observable[scala.Nothing, S | T] = js.native
    def valuesToErrors[U](handler: js.Function1[/* value */ T, Convert[U]]): Observable[scala.Nothing, S | U] = js.native
    
    def withHandler[U, V](handler: js.Function2[/* emitter */ Emitter[U, S], /* event */ Event[T, S], Unit]): Observable[U, S] = js.native
    
    def zip[U, V, W](otherObs: Observable[U, V]): Observable[W, S | V] = js.native
    def zip[U, V, W](otherObs: Observable[U, V], combinator: js.Function2[/* value */ T, /* repeated */ U, W]): Observable[W, S | V] = js.native
  }
  
  @JSImport("kefir", "Pool")
  @js.native
  class Pool_[T, S] () extends Observable[T, S] {
    
    def plug(obs: Observable[T, S]): this.type = js.native
    
    def unplug(obs: Observable[T, S]): this.type = js.native
  }
  
  @JSImport("kefir", "Property")
  @js.native
  class Property[T, S] () extends Observable[T, S]
  
  @JSImport("kefir", "Stream")
  @js.native
  class Stream_[T, S] () extends Observable[T, S]
  
  @JSImport("kefir", "combine")
  @js.native
  def combine[T /* <: js.Array[Observable[_, _]] */](obss: T): Stream_[
    js.Array[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine[T /* <: StringDictionary[Observable[_, _]] */, K /* <: StringDictionary[Observable[_, _]] */](obss: T, passiveObss: K): Stream_[typings.kefir.kefirStrings.combine with TopLevel[T] with TopLevel[K], _] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine[T, S, U](obss: js.Array[Observable[T, S]], combinator: js.Function1[/* repeated */ T, U]): Stream_[U, S] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Stream_[U, S] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Stream_[U, S] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine_0[T /* <: js.Array[Observable[_, _]] */, P /* <: js.Array[Observable[_, _]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): Observable[K, _] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine_T_ArrayNothing[T /* <: js.Array[scala.Nothing] */](obss: T): Stream_[scala.Nothing, scala.Nothing] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine_T_ArrayObservableWildcardWildcardP_String[T /* <: js.Array[Observable[_, _]] */, P /* <: /* keyof T */ String */](obss: T): Stream_[
    js.Array[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSImport("kefir", "combine")
  @js.native
  def combine_T_StringDictionaryObservableWildcardWildcard[T /* <: StringDictionary[Observable[_, _]] */](obss: T): Stream_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: kefir.kefir.ValueOfAnObservable<T[P]>}
    */ combine with TopLevel[T], 
    _
  ] = js.native
  @JSImport("kefir", "combine")
  @js.native
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
  @JSImport("kefir", "combine")
  @js.native
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
  @JSImport("kefir", "combine")
  @js.native
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
  @JSImport("kefir", "combine")
  @js.native
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
  @JSImport("kefir", "combine")
  @js.native
  def combine_T_Tuple6ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple6[
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
  @JSImport("kefir", "combine")
  @js.native
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
  @JSImport("kefir", "combine")
  @js.native
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
  
  @JSImport("kefir", "concat")
  @js.native
  def concat[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
  
  @JSImport("kefir", "constant")
  @js.native
  def constant[T](value: T): Property[T, scala.Nothing] = js.native
  
  @JSImport("kefir", "constantError")
  @js.native
  def constantError[T](error: T): Property[scala.Nothing, T] = js.native
  
  @JSImport("kefir", "fromCallback")
  @js.native
  def fromCallback[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream_[T, scala.Nothing] = js.native
  
  @JSImport("kefir", "fromESObservable")
  @js.native
  def fromESObservable[T, S](observable: js.Any): Stream_[T, S] = js.native
  
  @JSImport("kefir", "fromEvents")
  @js.native
  def fromEvents[T, S](target: Off, eventName: String): Stream_[T, S] = js.native
  @JSImport("kefir", "fromEvents")
  @js.native
  def fromEvents[T, S](target: Off, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  @JSImport("kefir", "fromEvents")
  @js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String): Stream_[T, S] = js.native
  @JSImport("kefir", "fromEvents")
  @js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  @JSImport("kefir", "fromEvents")
  @js.native
  def fromEvents[T, S](target: EventTarget, eventName: String): Stream_[T, S] = js.native
  @JSImport("kefir", "fromEvents")
  @js.native
  def fromEvents[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  
  @JSImport("kefir", "fromNodeCallback")
  @js.native
  def fromNodeCallback[T, S](fn: js.Function1[/* callback */ js.Function2[/* error */ S | Null, /* result */ T, Unit], Unit]): Stream_[T, S] = js.native
  
  @JSImport("kefir", "fromPoll")
  @js.native
  def fromPoll[T](interval: Double, fn: js.Function0[T]): Stream_[T, scala.Nothing] = js.native
  
  @JSImport("kefir", "fromPromise")
  @js.native
  def fromPromise[T, S](promise: js.Promise[T]): Property[T, S] = js.native
  
  @JSImport("kefir", "interval")
  @js.native
  def interval[T](interval: Double, value: T): Stream_[T, scala.Nothing] = js.native
  
  @JSImport("kefir", "later")
  @js.native
  def later[T](wait: Double, value: T): Stream_[T, scala.Nothing] = js.native
  
  @JSImport("kefir", "merge")
  @js.native
  def merge[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
  
  @JSImport("kefir", "never")
  @js.native
  def never(): Stream_[scala.Nothing, scala.Nothing] = js.native
  
  @JSImport("kefir", "pool")
  @js.native
  def pool[T, S](): Pool_[T, S] = js.native
  
  @JSImport("kefir", "repeat")
  @js.native
  def repeat[T, S](generator: js.Function1[/* i */ Double, (Observable[T, S]) | Boolean]): Observable[T, S] = js.native
  
  @JSImport("kefir", "sequentially")
  @js.native
  def sequentially[T](interval: Double, values: js.Array[T]): Stream_[T, scala.Nothing] = js.native
  
  object staticLand {
    
    @JSImport("kefir", "staticLand")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kefir", "staticLand.Observable")
    @js.native
    def Observable: Ap = js.native
    @scala.inline
    def Observable_=(x: Ap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Observable")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("kefir", "stream")
  @js.native
  def stream[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream_[T, S] = js.native
  
  @JSImport("kefir", "withInterval")
  @js.native
  def withInterval[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream_[T, S] = js.native
  
  @JSImport("kefir", "zip")
  @js.native
  def zip[T, S, U](obss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  @JSImport("kefir", "zip")
  @js.native
  def zip[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.UndefOr[scala.Nothing],
    combinator: js.Function1[/* repeated */ T, U]
  ): Observable[U, S] = js.native
  @JSImport("kefir", "zip")
  @js.native
  def zip[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  @JSImport("kefir", "zip")
  @js.native
  def zip[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Observable[U, S] = js.native
  
  @js.native
  trait ESObservable[T, S] extends StObject {
    
    def subscribe(callbacks: ESObserver[T, S]): Unsubscribe = js.native
  }
  object ESObservable {
    
    @scala.inline
    def apply[T, S](subscribe: ESObserver[T, S] => Unsubscribe): ESObservable[T, S] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[ESObservable[T, S]]
    }
    
    @scala.inline
    implicit class ESObservableMutableBuilder[Self <: ESObservable[_, _], T, S] (val x: Self with (ESObservable[T, S])) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: ESObserver[T, S] => Unsubscribe): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ESObserver[T, S] extends StObject {
    
    var complete: js.UndefOr[js.Function0[_]] = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ S, _]] = js.native
    
    var next: js.UndefOr[js.Function1[/* value */ T, _]] = js.native
    
    var start: js.UndefOr[js.Function] = js.native
  }
  object ESObserver {
    
    @scala.inline
    def apply[T, S](): ESObserver[T, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESObserver[T, S]]
    }
    
    @scala.inline
    implicit class ESObserverMutableBuilder[Self <: ESObserver[_, _], T, S] (val x: Self with (ESObserver[T, S])) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => _): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ S => _): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: /* value */ T => _): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setStart(value: js.Function): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait Emitter[V, E] extends StObject {
    
    // Deprecated methods
    def emit(value: V): Boolean = js.native
    
    def emitEvent(event: Event[V, E]): Boolean = js.native
    
    def end(): Unit = js.native
    
    def error(e: E): Boolean = js.native
    
    def event(event: Event[V, E]): Boolean = js.native
    
    def value(value: V): Boolean = js.native
  }
  object Emitter {
    
    @scala.inline
    def apply[V, E](
      emit: V => Boolean,
      emitEvent: Event[V, E] => Boolean,
      end: () => Unit,
      error: E => Boolean,
      event: Event[V, E] => Boolean,
      value: V => Boolean
    ): Emitter[V, E] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), emitEvent = js.Any.fromFunction1(emitEvent), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), event = js.Any.fromFunction1(event), value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[Emitter[V, E]]
    }
    
    @scala.inline
    implicit class EmitterMutableBuilder[Self <: Emitter[_, _], V, E] (val x: Self with (Emitter[V, E])) extends AnyVal {
      
      @scala.inline
      def setEmit(value: V => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmitEvent(value: Event[V, E] => Boolean): Self = StObject.set(x, "emitEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: E => Boolean): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEvent(value: Event[V, E] => Boolean): Self = StObject.set(x, "event", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: V => Boolean): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.kefir.anon.Type[V]
    - typings.kefir.anon.TypeValue[E]
    - typings.kefir.anon.ValueVoid
  */
  trait Event[V, E] extends StObject
  object Event {
    
    @scala.inline
    def Type[V](`type`: value, value: V): typings.kefir.anon.Type[V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.kefir.anon.Type[V]]
    }
    
    @scala.inline
    def TypeValue[E](`type`: error, value: E): typings.kefir.anon.TypeValue[E] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.kefir.anon.TypeValue[E]]
    }
    
    @scala.inline
    def ValueVoid(`type`: end, value: Unit): typings.kefir.anon.ValueVoid = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.kefir.anon.ValueVoid]
    }
  }
  
  @js.native
  trait Observer[T, S] extends StObject {
    
    var end: js.UndefOr[js.Function0[Unit]] = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ S, Unit]] = js.native
    
    var value: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  }
  object Observer {
    
    @scala.inline
    def apply[T, S](): Observer[T, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer[T, S]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[_, _], T, S] (val x: Self with (Observer[T, S])) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ S => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setValue(value: /* value */ T => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    val closed: Boolean = js.native
    
    def unsubscribe(): Unit = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(closed: Boolean, unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  type ValueOfAnObservable[T /* <: Observable[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[''] */ js.Any
}
