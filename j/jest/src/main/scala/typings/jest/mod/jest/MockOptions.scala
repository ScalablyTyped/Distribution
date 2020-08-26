package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockOptions extends js.Object {
  var virtual: js.UndefOr[Boolean] = js.native
}

object MockOptions {
  @scala.inline
  def apply(): MockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptions]
  }
  @scala.inline
  implicit class MockOptionsOps[Self <: MockOptions] (val x: Self) extends AnyVal {
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
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

