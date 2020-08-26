package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EraseOptions extends Options {
  var push: js.UndefOr[Boolean] = js.native
}

object EraseOptions {
  @scala.inline
  def apply(): EraseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EraseOptions]
  }
  @scala.inline
  implicit class EraseOptionsOps[Self <: EraseOptions] (val x: Self) extends AnyVal {
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
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
  }
  
}

