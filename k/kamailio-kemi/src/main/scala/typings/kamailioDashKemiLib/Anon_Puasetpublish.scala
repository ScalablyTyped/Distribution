package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Puasetpublish extends js.Object {
  def pua_set_publish(): scala.Double
  def pua_update_contact(): scala.Double
}

object Anon_Puasetpublish {
  @scala.inline
  def apply(pua_set_publish: () => scala.Double, pua_update_contact: () => scala.Double): Anon_Puasetpublish = {
    val __obj = js.Dynamic.literal(pua_set_publish = js.Any.fromFunction0(pua_set_publish), pua_update_contact = js.Any.fromFunction0(pua_update_contact))
  
    __obj.asInstanceOf[Anon_Puasetpublish]
  }
}

