package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mflags extends js.Object {
  def sanity_check(mflags: scala.Double, uflags: scala.Double): scala.Double
  def sanity_check_defaults(): scala.Double
  def sanity_reply(): scala.Double
}

object Anon_Mflags {
  @scala.inline
  def apply(
    sanity_check: (scala.Double, scala.Double) => scala.Double,
    sanity_check_defaults: () => scala.Double,
    sanity_reply: () => scala.Double
  ): Anon_Mflags = {
    val __obj = js.Dynamic.literal(sanity_check = js.Any.fromFunction2(sanity_check), sanity_check_defaults = js.Any.fromFunction0(sanity_check_defaults), sanity_reply = js.Any.fromFunction0(sanity_reply))
  
    __obj.asInstanceOf[Anon_Mflags]
  }
}

