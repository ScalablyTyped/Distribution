package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyOptions extends js.Object {
  var each: js.UndefOr[Boolean] = js.native
  var once: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[Boolean] = js.native
  var schema: js.UndefOr[Boolean] = js.native
}

object ModifyOptions {
  @scala.inline
  def apply(): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptions]
  }
  @scala.inline
  implicit class ModifyOptionsOps[Self <: ModifyOptions] (val x: Self) extends AnyVal {
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
    def setEach(value: Boolean): Self = this.set("each", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setRef(value: Boolean): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setSchema(value: Boolean): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

