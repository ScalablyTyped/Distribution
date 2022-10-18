package typings.jasmineDataProvider

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Array[Any] */](
    values: ValueType[js.Array[T]],
    func: js.Function1[(/* repeated */ ArrayFuncArgType[T]) | (/* data */ T), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[T](
    values: ValueType[Record[String, T]],
    func: js.Function2[/* data */ T, /* description */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jasmine-data-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer U> ? U : never
    }}}
    */
  @js.native
  trait ArrayFuncArgType[T] extends StObject
  
  type ValueType[T] = T | js.Function0[T]
}
