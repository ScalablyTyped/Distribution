package typings.immutable.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Stack")
@js.native
object StackNs extends js.Object {
  /**
    * True if the provided value is a Stack
    */
  def isStack(maybeStack: js.Any): /* is immutable.immutable.Stack<any> */ Boolean = js.native
  /**
    * Creates a new Stack containing `values`.
    */
  def of[T](values: T*): Stack[T] = js.native
}

