package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stubs extends js.Object {
  var stubs: js.UndefOr[Double] = js.native
}

object Stubs {
  @scala.inline
  def apply(): Stubs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stubs]
  }
  @scala.inline
  implicit class StubsOps[Self <: Stubs] (val x: Self) extends AnyVal {
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
    def setStubs(value: Double): Self = this.set("stubs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStubs: Self = this.set("stubs", js.undefined)
  }
  
}

