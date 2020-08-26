package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveOptions extends Options {
  var exact: js.UndefOr[Boolean] = js.native
  var markDirty: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated
    */
  var push: js.UndefOr[Boolean] = js.native
}

object RemoveOptions {
  @scala.inline
  def apply(): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveOptions]
  }
  @scala.inline
  implicit class RemoveOptionsOps[Self <: RemoveOptions] (val x: Self) extends AnyVal {
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
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
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

