package typings.i2cDashBus.asyncMod

import typings.i2cDashBus.Anon_ErrorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "reflectAll")
@js.native
object reflectAll extends js.Object {
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ Null, /* result */ Anon_ErrorValue[E, T], Unit], 
      Unit
    ]
  ] = js.native
}

