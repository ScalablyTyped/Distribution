package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOptions extends Options {
  var additionalSearchFields: js.UndefOr[js.Any] = js.native
  var markDirty: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated
    */
  var push: js.UndefOr[Boolean] = js.native
}

object AddOptions {
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  @scala.inline
  implicit class AddOptionsOps[Self <: AddOptions] (val x: Self) extends AnyVal {
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
    def setAdditionalSearchFields(value: js.Any): Self = this.set("additionalSearchFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalSearchFields: Self = this.set("additionalSearchFields", js.undefined)
    @scala.inline
    def setMarkDirty(value: Boolean): Self = this.set("markDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkDirty: Self = this.set("markDirty", js.undefined)
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
  }
  
}

