package typings.jestWorker.mod

import typings.jestWorker.mod.^
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

type ChildMessageCall = js.Tuple4[
/* 1 */ /* type */ Double, 
/* isProcessed */ Boolean, 
/* methodName */ String, 
/* args */ js.Array[Any]]

type ChildMessageEnd = js.Tuple2[/* 2 */ /* type */ Double, /* isProcessed */ Boolean]

type ChildMessageInitialize = js.Tuple5[
/* 0 */ /* type */ Double, 
/* isProcessed */ Boolean, 
/* fileName */ String, 
/* setupArgs */ js.Array[Any], 
/* workerId */ js.UndefOr[String]]

type ChildMessageMemUsage = js.Array[/* 3 */ /* type */ Double]

type ExcludeReservedKeys[K] = Exclude[K, ReservedKeys]

type FunctionLike = js.Function1[/* args */ Any, Any]

type JestWorkerFarm[T /* <: Record[String, Any] */] = Worker2 & WorkerModule[T]

type MethodLikeKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends jest-worker.jest-worker.FunctionLike? K : never}[keyof T] */ js.Any

type OnCustomMessage = js.Function1[/* message */ js.Array[Any] | Any, Unit]

type OnEnd = js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]

type OnStart = js.Function1[/* worker */ WorkerInterface, Unit]

type OnStateChangeHandler = js.Function2[/* state */ WorkerStates, /* oldState */ WorkerStates, Unit]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  std.ReturnType<T> extends std.Promise<infer R> ? (args : std.Parameters<T>): std.Promise<R> : (args : std.Parameters<T>): std.Promise<std.ReturnType<T>>
  }}}
  */
type Promisify[T /* <: FunctionLike */] = js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]]]

type WorkerCallback = js.Function5[
/* workerId */ Double, 
/* request */ ChildMessage, 
/* onStart */ OnStart, 
/* onEnd */ OnEnd, 
/* onCustomMessage */ OnCustomMessage, 
Unit]
