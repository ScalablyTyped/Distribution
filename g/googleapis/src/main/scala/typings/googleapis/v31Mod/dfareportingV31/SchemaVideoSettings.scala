package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Settings
  */
@js.native
trait SchemaVideoSettings extends js.Object {
  /**
    * Settings for the companion creatives of video creatives served to this
    * placement.
    */
  var companionSettings: js.UndefOr[SchemaCompanionSetting] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Orientation of a video placement. If this value is set, placement will
    * return assets matching the specified orientation.
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Settings for the skippability of video creatives served to this
    * placement. If this object is provided, the creative-level skippable
    * settings will be overridden.
    */
  var skippableSettings: js.UndefOr[SchemaSkippableSetting] = js.native
  /**
    * Settings for the transcodes of video creatives served to this placement.
    * If this object is provided, the creative-level transcode settings will be
    * overridden.
    */
  var transcodeSettings: js.UndefOr[SchemaTranscodeSetting] = js.native
}

object SchemaVideoSettings {
  @scala.inline
  def apply(): SchemaVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSettings]
  }
  @scala.inline
  implicit class SchemaVideoSettingsOps[Self <: SchemaVideoSettings] (val x: Self) extends AnyVal {
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
    def setCompanionSettings(value: SchemaCompanionSetting): Self = this.set("companionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanionSettings: Self = this.set("companionSettings", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSkippableSettings(value: SchemaSkippableSetting): Self = this.set("skippableSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippableSettings: Self = this.set("skippableSettings", js.undefined)
    @scala.inline
    def setTranscodeSettings(value: SchemaTranscodeSetting): Self = this.set("transcodeSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscodeSettings: Self = this.set("transcodeSettings", js.undefined)
  }
  
}

