package typings.jest.mod.jest

import typings.jest.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.restoreAllMocks")
@js.native
object restoreAllMocks extends js.Object {
  /**
    * available since Jest 21.1.0
    * Restores all mocks back to their original value.
    * Equivalent to calling .mockRestore on every mocked function.
    * Beware that jest.restoreAllMocks() only works when mock was created with
    * jest.spyOn; other mocks will require you to manually restore them.
    */
  def apply(): Typeofjest = js.native
}

