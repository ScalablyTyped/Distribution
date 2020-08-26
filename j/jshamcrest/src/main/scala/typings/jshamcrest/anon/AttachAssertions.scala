package typings.jshamcrest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachAssertions extends js.Object {
  var attachAssertions: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[js.Object] = js.native
}

object AttachAssertions {
  @scala.inline
  def apply(): AttachAssertions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachAssertions]
  }
  @scala.inline
  implicit class AttachAssertionsOps[Self <: AttachAssertions] (val x: Self) extends AnyVal {
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
    def setAttachAssertions(value: Boolean): Self = this.set("attachAssertions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachAssertions: Self = this.set("attachAssertions", js.undefined)
    @scala.inline
    def setScope(value: js.Object): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

