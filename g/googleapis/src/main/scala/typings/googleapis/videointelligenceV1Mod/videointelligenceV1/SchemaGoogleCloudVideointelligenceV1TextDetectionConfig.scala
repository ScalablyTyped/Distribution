package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for TEXT_DETECTION.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1TextDetectionConfig extends js.Object {
  /**
    * Language hint can be specified if the language to be detected is known a
    * priori. It can increase the accuracy of the detection. Language hint must
    * be language code in BCP-47 format.  Automatic language detection is
    * performed if no hint is provided.
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1TextDetectionConfig {
  @scala.inline
  def apply(languageHints: js.Array[String] = null): SchemaGoogleCloudVideointelligenceV1TextDetectionConfig = {
    val __obj = js.Dynamic.literal()
    if (languageHints != null) __obj.updateDynamic("languageHints")(languageHints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1TextDetectionConfig]
  }
}

