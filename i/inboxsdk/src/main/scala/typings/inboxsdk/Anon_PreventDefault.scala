package typings.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreventDefault extends js.Object {
  def preventDefault(): Unit
}

object Anon_PreventDefault {
  @scala.inline
  def apply(preventDefault: () => Unit): Anon_PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
  
    __obj.asInstanceOf[Anon_PreventDefault]
  }
}

