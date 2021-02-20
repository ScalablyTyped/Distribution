package typings.jasmineDataProvider

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jasmine-data-provider", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Array[_] */](values: ValueType[js.Array[T]], func: js.Function1[/* repeated */ ArrayFuncArgType[T], Unit]): Unit = js.native
  @JSImport("jasmine-data-provider", JSImport.Namespace)
  @js.native
  def apply[T](
    values: ValueType[Record[String, T]],
    func: js.Function2[/* data */ T, /* description */ String, Unit]
  ): Unit = js.native
  
  type ArrayFuncArgType[T] = js.Any
  
  type ValueType[T] = T | js.Function0[T]
}
