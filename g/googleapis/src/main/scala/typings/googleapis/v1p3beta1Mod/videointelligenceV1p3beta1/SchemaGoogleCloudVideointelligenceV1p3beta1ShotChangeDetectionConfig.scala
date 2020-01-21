package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for SHOT_CHANGE_DETECTION.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1ShotChangeDetectionConfig extends js.Object {
  /**
    * Model to use for shot change detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1ShotChangeDetectionConfig {
  @scala.inline
  def apply(model: String = null): SchemaGoogleCloudVideointelligenceV1p3beta1ShotChangeDetectionConfig = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1ShotChangeDetectionConfig]
  }
}

