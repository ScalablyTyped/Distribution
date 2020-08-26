package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowdifferentnesting extends js.Object {
  var allow_different_nesting: js.UndefOr[Boolean] = js.native
  var siblings_only: js.UndefOr[Boolean] = js.native
}

object Allowdifferentnesting {
  @scala.inline
  def apply(): Allowdifferentnesting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowdifferentnesting]
  }
  @scala.inline
  implicit class AllowdifferentnestingOps[Self <: Allowdifferentnesting] (val x: Self) extends AnyVal {
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
    def setAllow_different_nesting(value: Boolean): Self = this.set("allow_different_nesting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_different_nesting: Self = this.set("allow_different_nesting", js.undefined)
    @scala.inline
    def setSiblings_only(value: Boolean): Self = this.set("siblings_only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiblings_only: Self = this.set("siblings_only", js.undefined)
  }
  
}

