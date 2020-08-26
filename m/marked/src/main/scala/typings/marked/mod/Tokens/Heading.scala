package typings.marked.mod.Tokens

import typings.marked.markedStrings.heading
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heading extends Token {
  var depth: Double = js.native
  var raw: String = js.native
  var text: String = js.native
  var `type`: heading = js.native
}

object Heading {
  @scala.inline
  def apply(depth: Double, raw: String, text: String, `type`: heading): Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heading]
  }
  @scala.inline
  implicit class HeadingOps[Self <: Heading] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: heading): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

