package typings.atJupyterlabCoreutils

import typings.atJupyterlabCoreutils.libInterfacesMod.IPollNs.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel[T, U, V /* <: String */] extends js.Object {
  def cancel(last: State[T, U, V]): Boolean
}

object Anon_Cancel {
  @scala.inline
  def apply[T, U, V /* <: String */](cancel: State[T, U, V] => Boolean): Anon_Cancel[T, U, V] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
  
    __obj.asInstanceOf[Anon_Cancel[T, U, V]]
  }
}

