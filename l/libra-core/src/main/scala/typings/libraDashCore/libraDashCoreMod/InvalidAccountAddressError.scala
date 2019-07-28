package typings.libraDashCore.libraDashCoreMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "InvalidAccountAddressError")
@js.native
class InvalidAccountAddressError protected () extends Error {
  def this(invalidLength: String) = this()
  def this(invalidLength: Double) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

