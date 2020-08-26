package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InheritanceOptions extends js.Object {
  var only: js.UndefOr[Boolean] = js.native
}

object InheritanceOptions {
  @scala.inline
  def apply(): InheritanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InheritanceOptions]
  }
  @scala.inline
  implicit class InheritanceOptionsOps[Self <: InheritanceOptions] (val x: Self) extends AnyVal {
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
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
  }
  
}

