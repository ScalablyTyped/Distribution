package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorate[Decoration] extends js.Object {
  /**
    * An option with extra properties to set on the error object
    */
  var decorate: js.UndefOr[Decoration] = js.native
}

object Decorate {
  @scala.inline
  def apply[Decoration](): Decorate[Decoration] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Decorate[Decoration]]
  }
  @scala.inline
  implicit class DecorateOps[Self <: Decorate[_], Decoration] (val x: Self with Decorate[Decoration]) extends AnyVal {
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
    def setDecorate(value: Decoration): Self = this.set("decorate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorate: Self = this.set("decorate", js.undefined)
  }
  
}

