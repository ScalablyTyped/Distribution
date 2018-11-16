package typings
package locksLib.locksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locks", "CondVariable")
@js.native
class CondVariable protected () extends js.Object {
  /** Construct a new conditional variable with the specified initial value. */
  def this(initialValue: js.Any) = this()
  /** Get the current conditional variable value. */
  def get(): js.Any = js.native
  /** Set the conditional variable value. */
  def set(value: js.Any): scala.Unit = js.native
  /** Add a callback when the specified conditional variable value matches the specified value. */
  def wait(value: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

