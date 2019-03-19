package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callcontrol extends js.Object {
  def call_control(): scala.Double
}

object Anon_Callcontrol {
  @scala.inline
  def apply(call_control: () => scala.Double): Anon_Callcontrol = {
    val __obj = js.Dynamic.literal(call_control = js.Any.fromFunction0(call_control))
  
    __obj.asInstanceOf[Anon_Callcontrol]
  }
}

