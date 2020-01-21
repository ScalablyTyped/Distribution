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
  def apply(
    companionSettings: SchemaCompanionSetting = null,
    kind: String = null,
    orientation: String = null,
    skippableSettings: SchemaSkippableSetting = null,
    transcodeSettings: SchemaTranscodeSetting = null
  ): SchemaVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (companionSettings != null) __obj.updateDynamic("companionSettings")(companionSettings.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (skippableSettings != null) __obj.updateDynamic("skippableSettings")(skippableSettings.asInstanceOf[js.Any])
    if (transcodeSettings != null) __obj.updateDynamic("transcodeSettings")(transcodeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoSettings]
  }
}

