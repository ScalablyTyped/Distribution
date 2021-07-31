package typings.jasmineDataProvider

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: js.Array[js.Any] */](values: ValueType[js.Array[T]], func: js.Function1[/* repeated */ ArrayFuncArgType[T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply[T](
    values: ValueType[Record[String, T]],
    func: js.Function2[/* data */ T, /* description */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jasmine-data-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ArrayFuncArgType[T] = js.Any
  
  type ValueType[T] = T | js.Function0[T]
}
