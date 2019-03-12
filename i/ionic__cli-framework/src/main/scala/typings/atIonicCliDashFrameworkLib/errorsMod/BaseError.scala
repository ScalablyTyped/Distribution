package typings
package atIonicCliDashFrameworkLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/errors", "BaseError")
@js.native
abstract class BaseError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  var code: js.UndefOr[java.lang.String] = js.native
  var error: js.UndefOr[stdLib.Error] = js.native
  var exitCode: js.UndefOr[scala.Double] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("stack")
  var stack_BaseError: java.lang.String = js.native
  def inspect(): java.lang.String = js.native
}

