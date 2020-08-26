package typings.ionicReact.routerOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOptions extends js.Object {
  var as: js.UndefOr[String] = js.native
  var unmount: js.UndefOr[Boolean] = js.native
}

object RouterOptions {
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setUnmount(value: Boolean): Self = this.set("unmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmount: Self = this.set("unmount", js.undefined)
  }
  
}

