package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Activity /////////////////////////////////////////////
@js.native
trait KoLiteActivityOptions extends js.Object {
  var align: js.UndefOr[String] = js.native
  var color: js.UndefOr[js.Any] = js.native
  var length: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double] = js.native
  var segments: js.UndefOr[Double] = js.native
  var space: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var valign: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object KoLiteActivityOptions {
  @scala.inline
  def apply(): KoLiteActivityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoLiteActivityOptions]
  }
  @scala.inline
  implicit class KoLiteActivityOptionsOps[Self <: KoLiteActivityOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSegments(value: Double): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setValign(value: String): Self = this.set("valign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

