package typings.jestDashUtil

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util/build/ErrorWithStack", JSImport.Namespace)
@js.native
object buildErrorWithStackMod extends js.Object {
  @js.native
  class default protected () extends Error {
    def this(message: js.UndefOr[scala.Nothing], callsite: js.Function) = this()
    def this(message: String, callsite: js.Function) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  type ErrorWithStack = Error
}

