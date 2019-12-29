package typings.jasmineDashDataDashProvider

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jasmine-data-provider", JSImport.Namespace)
@js.native
object jasmineDashDataDashProviderMod extends js.Object {
  def apply[T](values: ValueType[js.Array[T]], func: js.Function1[/* data */ T, Unit]): Unit = js.native
  def apply[T](
    values: ValueType[Record[String, T]],
    func: js.Function2[/* data */ T, /* description */ String, Unit]
  ): Unit = js.native
  type ArrayFuncArgType[T] = js.Any
  type ValueType[T] = T | js.Function0[T]
}

