package typings.kerberos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapOptions extends js.Object {
  /**
    * @description The user to authorize
    */
  var user: js.UndefOr[String] = js.native
}

object WrapOptions {
  @scala.inline
  def apply(): WrapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapOptions]
  }
  @scala.inline
  implicit class WrapOptionsOps[Self <: WrapOptions] (val x: Self) extends AnyVal {
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
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

