package typings.jestDashValidate.jestDashValidateMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate", "ValidationError")
@js.native
class ValidationError protected () extends Error {
  def this(name: String, message: String) = this()
  def this(name: String, message: String, comment: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

