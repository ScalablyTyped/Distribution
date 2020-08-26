package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeekParam extends js.Object {
  var offset: Double = js.native
  var position: Double = js.native
}

object SeekParam {
  @scala.inline
  def apply(offset: Double, position: Double): SeekParam = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekParam]
  }
  @scala.inline
  implicit class SeekParamOps[Self <: SeekParam] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

