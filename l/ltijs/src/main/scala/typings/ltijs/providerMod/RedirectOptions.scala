package typings.ltijs.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectOptions extends js.Object {
  var ignoreRoot: js.UndefOr[Boolean] = js.native
  var isNewResource: js.UndefOr[Boolean] = js.native
}

object RedirectOptions {
  @scala.inline
  def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  @scala.inline
  implicit class RedirectOptionsOps[Self <: RedirectOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreRoot(value: Boolean): Self = this.set("ignoreRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreRoot: Self = this.set("ignoreRoot", js.undefined)
    @scala.inline
    def setIsNewResource(value: Boolean): Self = this.set("isNewResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNewResource: Self = this.set("isNewResource", js.undefined)
  }
  
}

