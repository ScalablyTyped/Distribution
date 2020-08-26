package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Brief description of the live stream cdn settings.
  */
@js.native
trait SchemaCdnSettings extends js.Object {
  /**
    * The format of the video stream that you are sending to Youtube.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The frame rate of the inbound video data.
    */
  var frameRate: js.UndefOr[String] = js.native
  /**
    * The ingestionInfo object contains information that YouTube provides that
    * you need to transmit your RTMP or HTTP stream to YouTube.
    */
  var ingestionInfo: js.UndefOr[SchemaIngestionInfo] = js.native
  /**
    * The method or protocol used to transmit the video stream.
    */
  var ingestionType: js.UndefOr[String] = js.native
  /**
    * The resolution of the inbound video data.
    */
  var resolution: js.UndefOr[String] = js.native
}

object SchemaCdnSettings {
  @scala.inline
  def apply(): SchemaCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCdnSettings]
  }
  @scala.inline
  implicit class SchemaCdnSettingsOps[Self <: SchemaCdnSettings] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFrameRate(value: String): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    @scala.inline
    def setIngestionInfo(value: SchemaIngestionInfo): Self = this.set("ingestionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestionInfo: Self = this.set("ingestionInfo", js.undefined)
    @scala.inline
    def setIngestionType(value: String): Self = this.set("ingestionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestionType: Self = this.set("ingestionType", js.undefined)
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
  
}

