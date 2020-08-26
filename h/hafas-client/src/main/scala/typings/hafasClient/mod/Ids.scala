package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ids extends js.Object {
  /** DELFI Haltestellen ID */
  var dhid: js.UndefOr[String] = js.native
}

object Ids {
  @scala.inline
  def apply(): Ids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ids]
  }
  @scala.inline
  implicit class IdsOps[Self <: Ids] (val x: Self) extends AnyVal {
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
    def setDhid(value: String): Self = this.set("dhid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDhid: Self = this.set("dhid", js.undefined)
  }
  
}

