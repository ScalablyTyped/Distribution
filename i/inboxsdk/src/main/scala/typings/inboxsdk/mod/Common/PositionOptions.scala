package typings.inboxsdk.mod.Common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionOptions extends js.Object {
  var bottomBuffer: js.UndefOr[Double] = js.native
  var buffer: js.UndefOr[Double] = js.native
  var forceHAlign: js.UndefOr[Boolean] = js.native
  var forcePosition: js.UndefOr[Boolean] = js.native
  var forceVAlign: js.UndefOr[Boolean] = js.native
  var hAlign: js.UndefOr[String] = js.native
  var leftBuffer: js.UndefOr[Double] = js.native
  var position: js.UndefOr[String] = js.native
  var rightBuffer: js.UndefOr[Double] = js.native
  var topBuffer: js.UndefOr[Double] = js.native
  var vAlign: js.UndefOr[String] = js.native
}

object PositionOptions {
  @scala.inline
  def apply(): PositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionOptions]
  }
  @scala.inline
  implicit class PositionOptionsOps[Self <: PositionOptions] (val x: Self) extends AnyVal {
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
    def setBottomBuffer(value: Double): Self = this.set("bottomBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomBuffer: Self = this.set("bottomBuffer", js.undefined)
    @scala.inline
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setForceHAlign(value: Boolean): Self = this.set("forceHAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHAlign: Self = this.set("forceHAlign", js.undefined)
    @scala.inline
    def setForcePosition(value: Boolean): Self = this.set("forcePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePosition: Self = this.set("forcePosition", js.undefined)
    @scala.inline
    def setForceVAlign(value: Boolean): Self = this.set("forceVAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceVAlign: Self = this.set("forceVAlign", js.undefined)
    @scala.inline
    def setHAlign(value: String): Self = this.set("hAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHAlign: Self = this.set("hAlign", js.undefined)
    @scala.inline
    def setLeftBuffer(value: Double): Self = this.set("leftBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftBuffer: Self = this.set("leftBuffer", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRightBuffer(value: Double): Self = this.set("rightBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightBuffer: Self = this.set("rightBuffer", js.undefined)
    @scala.inline
    def setTopBuffer(value: Double): Self = this.set("topBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopBuffer: Self = this.set("topBuffer", js.undefined)
    @scala.inline
    def setVAlign(value: String): Self = this.set("vAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVAlign: Self = this.set("vAlign", js.undefined)
  }
  
}

