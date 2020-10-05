package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertOptions extends js.Object {
  var cap: js.UndefOr[Boolean] = js.native
  var curry: js.UndefOr[Boolean] = js.native
  var fixed: js.UndefOr[Boolean] = js.native
  var immutable: js.UndefOr[Boolean] = js.native
  var rearg: js.UndefOr[Boolean] = js.native
}

object ConvertOptions {
  @scala.inline
  def apply(): ConvertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertOptions]
  }
  @scala.inline
  implicit class ConvertOptionsOps[Self <: ConvertOptions] (val x: Self) extends AnyVal {
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
    def setCap(value: Boolean): Self = this.set("cap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    @scala.inline
    def setCurry(value: Boolean): Self = this.set("curry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurry: Self = this.set("curry", js.undefined)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    @scala.inline
    def setRearg(value: Boolean): Self = this.set("rearg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRearg: Self = this.set("rearg", js.undefined)
  }
  
}

