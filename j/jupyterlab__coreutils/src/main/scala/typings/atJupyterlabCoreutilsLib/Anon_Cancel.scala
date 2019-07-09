package typings
package atJupyterlabCoreutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel[T, U, V /* <: java.lang.String */] extends js.Object {
  def cancel(last: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]): scala.Boolean
}

object Anon_Cancel {
  @scala.inline
  def apply[T, U, V /* <: java.lang.String */](cancel: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V] => scala.Boolean): Anon_Cancel[T, U, V] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
  
    __obj.asInstanceOf[Anon_Cancel[T, U, V]]
  }
}

