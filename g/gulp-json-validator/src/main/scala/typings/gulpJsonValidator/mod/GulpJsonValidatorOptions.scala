package typings.gulpJsonValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpJsonValidatorOptions extends js.Object {
  var allowDuplicatedKeys: js.UndefOr[Boolean] = js.native
}

object GulpJsonValidatorOptions {
  @scala.inline
  def apply(): GulpJsonValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpJsonValidatorOptions]
  }
  @scala.inline
  implicit class GulpJsonValidatorOptionsOps[Self <: GulpJsonValidatorOptions] (val x: Self) extends AnyVal {
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
    def setAllowDuplicatedKeys(value: Boolean): Self = this.set("allowDuplicatedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDuplicatedKeys: Self = this.set("allowDuplicatedKeys", js.undefined)
  }
  
}

