package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofauthDb extends js.Object {
  def auth_check(srealm: String, stable: String, iflags: Double): Double = js.native
  def is_subscriber(suri: String, stable: String, iflags: Double): Double = js.native
}

object TypeofauthDb {
  @scala.inline
  def apply(auth_check: (String, String, Double) => Double, is_subscriber: (String, String, Double) => Double): TypeofauthDb = {
    val __obj = js.Dynamic.literal(auth_check = js.Any.fromFunction3(auth_check), is_subscriber = js.Any.fromFunction3(is_subscriber))
    __obj.asInstanceOf[TypeofauthDb]
  }
  @scala.inline
  implicit class TypeofauthDbOps[Self <: TypeofauthDb] (val x: Self) extends AnyVal {
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
    def setAuth_check(value: (String, String, Double) => Double): Self = this.set("auth_check", js.Any.fromFunction3(value))
    @scala.inline
    def setIs_subscriber(value: (String, String, Double) => Double): Self = this.set("is_subscriber", js.Any.fromFunction3(value))
  }
  
}

