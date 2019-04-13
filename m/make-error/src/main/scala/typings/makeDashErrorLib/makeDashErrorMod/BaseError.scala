package typings
package makeDashErrorLib.makeDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("make-error", "BaseError")
@js.native
class BaseError ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("stack")
  var stack_BaseError: java.lang.String = js.native
}

