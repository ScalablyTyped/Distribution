package typings.jest.jestMod.jest

import org.scalablytyped.runtime.Instantiable1
import typings.jest.Typeofjest
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

@JSImport("jest", "jest.mock")
@js.native
object mock extends js.Object {
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def apply(moduleName: String): Typeofjest = js.native
  def apply(moduleName: String, factory: js.Function0[_]): Typeofjest = js.native
  def apply(moduleName: String, factory: js.Function0[_], options: MockOptions): Typeofjest = js.native
}

