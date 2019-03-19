package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grp extends js.Object {
  def is_user_in(uri: java.lang.String, grp: java.lang.String): scala.Double
}

object Anon_Grp {
  @scala.inline
  def apply(is_user_in: (java.lang.String, java.lang.String) => scala.Double): Anon_Grp = {
    val __obj = js.Dynamic.literal(is_user_in = js.Any.fromFunction2(is_user_in))
  
    __obj.asInstanceOf[Anon_Grp]
  }
}

