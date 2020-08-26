package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait None extends js.Object {
  var None: Double = js.native
  var UseClipboard: Double = js.native
}

object None {
  @scala.inline
  def apply(None: Double, UseClipboard: Double): None = {
    val __obj = js.Dynamic.literal(None = None.asInstanceOf[js.Any], UseClipboard = UseClipboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
  @scala.inline
  implicit class NoneOps[Self <: None] (val x: Self) extends AnyVal {
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
    def setNone(value: Double): Self = this.set("None", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseClipboard(value: Double): Self = this.set("UseClipboard", value.asInstanceOf[js.Any])
  }
  
}

