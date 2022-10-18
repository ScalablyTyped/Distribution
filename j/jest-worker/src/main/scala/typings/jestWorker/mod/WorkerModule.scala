package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof T as std.Extract<jest-worker.jest-worker.ExcludeReservedKeys<K>, jest-worker.jest-worker.MethodLikeKeys<T>> ]: T[K] extends jest-worker.jest-worker.FunctionLike? jest-worker.jest-worker.Promisify<T[K]> : never}
  }}}
  */
@js.native
trait WorkerModule[T] extends StObject
