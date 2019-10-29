package typings.jestDashMock.jestDashMockMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mock[T, Y /* <: js.Array[_] */]
  extends js.Function
     with MockInstance[T, Y]
     with Instantiable1[/* args */ Y, T] {
  def apply(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Y is not an array type */ args: Y
  ): T = js.native
}

