package typings.jestWorker.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.jestWorker.anon.PostMessage
import typings.jestWorker.anon.TypeofEventEmitter
import typings.jestWorker.mod.^
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.Process
import typings.std.Exclude
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def messageParent(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("messageParent")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def messageParent(message: Any, parentProcess: Process): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("messageParent")(message.asInstanceOf[js.Any], parentProcess.asInstanceOf[js.Any])).asInstanceOf[Unit]

type ChildMessage = ChildMessageInitialize | ChildMessageCall | ChildMessageEnd | ChildMessageMemUsage

type ChildMessageCall = js.Tuple4[/* 1 */ Double, Boolean, String, js.Array[Any]]

type ChildMessageEnd = js.Tuple2[/* 2 */ Double, Boolean]

type ChildMessageInitialize = js.Tuple5[
/* 0 */ Double, 
Boolean, 
String, 
js.UndefOr[// file
js.Array[Any]], 
js.UndefOr[// setupArgs
MessagePort2]]

type ChildMessageMemUsage = js.Array[/* 3 */ Double]

type ExcludeReservedKeys[K] = Exclude[K, ReservedKeys]

type FunctionLike = js.Function1[/* args */ Any, Any]

type JestWorkerFarm[T /* <: Record[String, Any] */] = Worker2 & WorkerModule[T]

type MessagePort2 = Instantiable0[EventEmitter] & TypeofEventEmitter & PostMessage

type MethodLikeKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends jest-worker.jest-worker.FunctionLike? K : never}[keyof T] */ js.Any

type OnCustomMessage = js.Function1[/* message */ js.Array[Any] | Any, Unit]

type OnEnd = js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]

type OnStart = js.Function1[/* worker */ WorkerInterface, Unit]

type OnStateChangeHandler = js.Function2[/* state */ WorkerStates, /* oldState */ WorkerStates, Unit]

type Promisify[T /* <: FunctionLike */] = js.Function1[/* args */ Parameters[T], js.Promise[Any | ReturnType[T]]]

type WorkerCallback = js.Function5[
/* workerId */ Double, 
/* request */ ChildMessage, 
/* onStart */ OnStart, 
/* onEnd */ OnEnd, 
/* onCustomMessage */ OnCustomMessage, 
Unit]

type WorkerModule[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T as std.Extract<jest-worker.jest-worker.ExcludeReservedKeys<K>, jest-worker.jest-worker.MethodLikeKeys<T>> ]: T[K] extends jest-worker.jest-worker.FunctionLike? jest-worker.jest-worker.Promisify<T[K]> : never}
  */ typings.jestWorker.jestWorkerStrings.WorkerModule & TopLevel[Any]
