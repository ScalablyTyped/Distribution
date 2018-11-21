package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Stack")
@js.native
object StackNs extends js.Object {
  /**
       * True if the provided value is a Stack
       */
  def isStack(maybeStack: js.Any): scala.Boolean = js.native
  /**
       * Creates a new Stack containing `values`.
       */
  def of[T](values: T*): immutableLib.immutableMod.Stack[T] = js.native
}

