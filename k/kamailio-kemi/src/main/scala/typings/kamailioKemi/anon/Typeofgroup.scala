package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgroup extends js.Object {
  def is_user_in(uri: String, grp: String): Double
}

object Typeofgroup {
  @scala.inline
  def apply(is_user_in: (String, String) => Double): Typeofgroup = {
    val __obj = js.Dynamic.literal(is_user_in = js.Any.fromFunction2(is_user_in))
    __obj.asInstanceOf[Typeofgroup]
  }
}

