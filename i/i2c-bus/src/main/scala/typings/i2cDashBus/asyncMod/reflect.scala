package typings.i2cDashBus.asyncMod

import typings.i2cDashBus.Anon_ErrorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "reflect")
@js.native
object reflect extends js.Object {
  def apply[T, E](fn: AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ Null, /* result */ Anon_ErrorValue[E, T], Unit], 
    Unit
  ] = js.native
}

