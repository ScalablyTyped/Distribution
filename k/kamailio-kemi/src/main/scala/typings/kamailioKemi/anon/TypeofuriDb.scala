package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofuriDb extends js.Object {
  def check_from(): Double = js.native
  def check_to(): Double = js.native
  def check_uri(suri: String): Double = js.native
  def check_uri_realm(suri: String, susername: String, srealm: String): Double = js.native
  def does_uri_exist(): Double = js.native
}

object TypeofuriDb {
  @scala.inline
  def apply(
    check_from: () => Double,
    check_to: () => Double,
    check_uri: String => Double,
    check_uri_realm: (String, String, String) => Double,
    does_uri_exist: () => Double
  ): TypeofuriDb = {
    val __obj = js.Dynamic.literal(check_from = js.Any.fromFunction0(check_from), check_to = js.Any.fromFunction0(check_to), check_uri = js.Any.fromFunction1(check_uri), check_uri_realm = js.Any.fromFunction3(check_uri_realm), does_uri_exist = js.Any.fromFunction0(does_uri_exist))
    __obj.asInstanceOf[TypeofuriDb]
  }
  @scala.inline
  implicit class TypeofuriDbOps[Self <: TypeofuriDb] (val x: Self) extends AnyVal {
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
    def setCheck_from(value: () => Double): Self = this.set("check_from", js.Any.fromFunction0(value))
    @scala.inline
    def setCheck_to(value: () => Double): Self = this.set("check_to", js.Any.fromFunction0(value))
    @scala.inline
    def setCheck_uri(value: String => Double): Self = this.set("check_uri", js.Any.fromFunction1(value))
    @scala.inline
    def setCheck_uri_realm(value: (String, String, String) => Double): Self = this.set("check_uri_realm", js.Any.fromFunction3(value))
    @scala.inline
    def setDoes_uri_exist(value: () => Double): Self = this.set("does_uri_exist", js.Any.fromFunction0(value))
  }
  
}

