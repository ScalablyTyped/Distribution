package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unsubscribe extends js.Object {
  def unsubscribe(): Unit
}

object Anon_Unsubscribe {
  @scala.inline
  def apply(unsubscribe: () => Unit): Anon_Unsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Anon_Unsubscribe]
  }
}

