package typings.graphqlCompose.toInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToInputObjectTypeOpts extends js.Object {
  var postfix: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object ToInputObjectTypeOpts {
  @scala.inline
  def apply(): ToInputObjectTypeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToInputObjectTypeOpts]
  }
  @scala.inline
  implicit class ToInputObjectTypeOptsOps[Self <: ToInputObjectTypeOpts] (val x: Self) extends AnyVal {
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
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

