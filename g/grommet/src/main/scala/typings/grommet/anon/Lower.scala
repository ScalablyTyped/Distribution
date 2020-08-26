package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lower extends js.Object {
  var lower: js.UndefOr[String] = js.native
  var upper: js.UndefOr[String] = js.native
}

object Lower {
  @scala.inline
  def apply(): Lower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lower]
  }
  @scala.inline
  implicit class LowerOps[Self <: Lower] (val x: Self) extends AnyVal {
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
    def setLower(value: String): Self = this.set("lower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLower: Self = this.set("lower", js.undefined)
    @scala.inline
    def setUpper(value: String): Self = this.set("upper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpper: Self = this.set("upper", js.undefined)
  }
  
}

