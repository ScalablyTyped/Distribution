package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subtext extends js.Object {
  var subtext: js.UndefOr[String] = js.native
  var text: String = js.native
}

object Subtext {
  @scala.inline
  def apply(text: String): Subtext = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtext]
  }
  @scala.inline
  implicit class SubtextOps[Self <: Subtext] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtext(value: String): Self = this.set("subtext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtext: Self = this.set("subtext", js.undefined)
  }
  
}

