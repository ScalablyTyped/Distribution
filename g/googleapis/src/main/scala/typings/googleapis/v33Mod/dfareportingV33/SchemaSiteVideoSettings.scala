package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video Settings
  */
@js.native
trait SchemaSiteVideoSettings extends js.Object {
  
  /**
    * Settings for the companion creatives of video creatives served to this
    * site.
    */
  var companionSettings: js.UndefOr[SchemaSiteCompanionSetting] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteVideoSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Orientation of a site template used for video. This will act as default
    * for new placements created under this site.
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * Settings for the skippability of video creatives served to this site.
    * This will act as default for new placements created under this site.
    */
  var skippableSettings: js.UndefOr[SchemaSiteSkippableSetting] = js.native
  
  /**
    * Settings for the transcodes of video creatives served to this site. This
    * will act as default for new placements created under this site.
    */
  var transcodeSettings: js.UndefOr[SchemaSiteTranscodeSetting] = js.native
}
object SchemaSiteVideoSettings {
  
  @scala.inline
  def apply(): SchemaSiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVideoSettings]
  }
  
  @scala.inline
  implicit class SchemaSiteVideoSettingsOps[Self <: SchemaSiteVideoSettings] (val x: Self) extends AnyVal {
    
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
    def setCompanionSettings(value: SchemaSiteCompanionSetting): Self = this.set("companionSettings", value.asInstanceOf[js.Any])
    
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
    def setSkippableSettings(value: SchemaSiteSkippableSetting): Self = this.set("skippableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippableSettings: Self = this.set("skippableSettings", js.undefined)
    
    @scala.inline
    def setTranscodeSettings(value: SchemaSiteTranscodeSetting): Self = this.set("transcodeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeSettings: Self = this.set("transcodeSettings", js.undefined)
  }
}
