package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    companionSettings: SchemaSiteCompanionSetting = null,
    kind: String = null,
    orientation: String = null,
    skippableSettings: SchemaSiteSkippableSetting = null,
    transcodeSettings: SchemaSiteTranscodeSetting = null
  ): SchemaSiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (companionSettings != null) __obj.updateDynamic("companionSettings")(companionSettings.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (skippableSettings != null) __obj.updateDynamic("skippableSettings")(skippableSettings.asInstanceOf[js.Any])
    if (transcodeSettings != null) __obj.updateDynamic("transcodeSettings")(transcodeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteVideoSettings]
  }
}

