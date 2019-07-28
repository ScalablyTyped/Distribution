package typings.atIonicCliDashFramework.errorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/errors", "BaseError")
@js.native
abstract class BaseError protected () extends Error {
  def this(message: String) = this()
  var code: js.UndefOr[String] = js.native
  var error: js.UndefOr[Error] = js.native
  var exitCode: js.UndefOr[Double] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("stack")
  var stack_BaseError: String = js.native
  def inspect(): String = js.native
}

