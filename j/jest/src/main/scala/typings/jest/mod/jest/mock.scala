package typings.jest.mod.jest

import typings.jest.anon.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.mock")
@js.native
object mock extends js.Object {
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def apply(moduleName: String): Typeofjest = js.native
  def apply(moduleName: String, factory: js.UndefOr[scala.Nothing], options: MockOptions): Typeofjest = js.native
  def apply(moduleName: String, factory: js.Function0[_]): Typeofjest = js.native
  def apply(moduleName: String, factory: js.Function0[_], options: MockOptions): Typeofjest = js.native
}

