package typings.jimp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlendMode extends js.Object {
  var mode: String = js.native
  var opacityDest: Double = js.native
  var opacitySource: Double = js.native
}

object BlendMode {
  @scala.inline
  def apply(mode: String, opacityDest: Double, opacitySource: Double): BlendMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], opacityDest = opacityDest.asInstanceOf[js.Any], opacitySource = opacitySource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendMode]
  }
  @scala.inline
  implicit class BlendModeOps[Self <: BlendMode] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacityDest(value: Double): Self = this.set("opacityDest", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacitySource(value: Double): Self = this.set("opacitySource", value.asInstanceOf[js.Any])
  }
  
}

