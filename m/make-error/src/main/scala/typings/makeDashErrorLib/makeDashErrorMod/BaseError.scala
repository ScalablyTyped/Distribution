package typings
package makeDashErrorLib.makeDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("make-error", "BaseError")
@js.native
class BaseError ()
  extends makeDashErrorLib.makeDashErrorMod.makeErrorNs.BaseError {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("stack")
  override var stack_BaseError: java.lang.String = js.native
}

