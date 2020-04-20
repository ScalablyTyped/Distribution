package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpua extends js.Object {
  def pua_set_publish(): Double
  def pua_update_contact(): Double
}

object Typeofpua {
  @scala.inline
  def apply(pua_set_publish: () => Double, pua_update_contact: () => Double): Typeofpua = {
    val __obj = js.Dynamic.literal(pua_set_publish = js.Any.fromFunction0(pua_set_publish), pua_update_contact = js.Any.fromFunction0(pua_update_contact))
    __obj.asInstanceOf[Typeofpua]
  }
}

