package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofgroup extends js.Object {
  def is_user_in(uri: String, grp: String): Double = js.native
}

object Typeofgroup {
  @scala.inline
  def apply(is_user_in: (String, String) => Double): Typeofgroup = {
    val __obj = js.Dynamic.literal(is_user_in = js.Any.fromFunction2(is_user_in))
    __obj.asInstanceOf[Typeofgroup]
  }
  @scala.inline
  implicit class TypeofgroupOps[Self <: Typeofgroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIs_user_in(value: (String, String) => Double): Self = this.set("is_user_in", js.Any.fromFunction2(value))
  }
  
}

