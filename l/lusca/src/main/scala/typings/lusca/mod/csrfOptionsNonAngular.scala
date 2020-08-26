package typings.lusca.mod

import typings.lusca.anon.Name
import typings.lusca.luscaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait csrfOptionsNonAngular extends csrfOptionsAngularOrNonAngular {
  var angular: js.UndefOr[`false`] = js.native
  var cookie: js.UndefOr[String | Name] = js.native
}

object csrfOptionsNonAngular {
  @scala.inline
  def apply(): csrfOptionsNonAngular = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsNonAngular]
  }
  @scala.inline
  implicit class csrfOptionsNonAngularOps[Self <: csrfOptionsNonAngular] (val x: Self) extends AnyVal {
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
    def setAngular(value: `false`): Self = this.set("angular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngular: Self = this.set("angular", js.undefined)
    @scala.inline
    def setCookie(value: String | Name): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
  }
  
}

