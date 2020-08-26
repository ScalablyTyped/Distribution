package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInvideoBranding extends js.Object {
  var imageBytes: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var position: js.UndefOr[SchemaInvideoPosition] = js.native
  var targetChannelId: js.UndefOr[String] = js.native
  var timing: js.UndefOr[SchemaInvideoTiming] = js.native
}

object SchemaInvideoBranding {
  @scala.inline
  def apply(): SchemaInvideoBranding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoBranding]
  }
  @scala.inline
  implicit class SchemaInvideoBrandingOps[Self <: SchemaInvideoBranding] (val x: Self) extends AnyVal {
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
    def setImageBytes(value: String): Self = this.set("imageBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBytes: Self = this.set("imageBytes", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setPosition(value: SchemaInvideoPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTargetChannelId(value: String): Self = this.set("targetChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetChannelId: Self = this.set("targetChannelId", js.undefined)
    @scala.inline
    def setTiming(value: SchemaInvideoTiming): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
  
}

