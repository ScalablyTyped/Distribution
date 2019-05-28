package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgroup extends js.Object {
  def is_user_in(uri: java.lang.String, grp: java.lang.String): scala.Double
}

object Typeofgroup {
  @scala.inline
  def apply(is_user_in: (java.lang.String, java.lang.String) => scala.Double): Typeofgroup = {
    val __obj = js.Dynamic.literal(is_user_in = js.Any.fromFunction2(is_user_in))
  
    __obj.asInstanceOf[Typeofgroup]
  }
}

