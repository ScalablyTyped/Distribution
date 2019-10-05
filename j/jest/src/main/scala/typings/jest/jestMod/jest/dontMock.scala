package typings.jest.jestMod.jest

import typings.jest.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.dontMock")
@js.native
object dontMock extends js.Object {
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module from require() (e.g. that it should always return the real module).
    */
  def apply(moduleName: String): Typeofjest = js.native
}

