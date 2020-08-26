package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jiggle extends js.Object {
  var duration: js.UndefOr[String] = js.native
  var jiggle: js.UndefOr[Duration] = js.native
}

object Jiggle {
  @scala.inline
  def apply(): Jiggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jiggle]
  }
  @scala.inline
  implicit class JiggleOps[Self <: Jiggle] (val x: Self) extends AnyVal {
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setJiggle(value: Duration): Self = this.set("jiggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJiggle: Self = this.set("jiggle", js.undefined)
  }
  
}

