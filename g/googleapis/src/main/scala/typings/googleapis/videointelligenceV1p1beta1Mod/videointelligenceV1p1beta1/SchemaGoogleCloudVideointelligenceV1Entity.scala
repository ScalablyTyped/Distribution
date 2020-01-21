package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected entity from video analysis.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1Entity extends js.Object {
  /**
    * Textual description, e.g. `Fixed-gear bicycle`.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph
    * Search API](https://developers.google.com/knowledge-graph/).
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Language code for `description` in BCP-47 format.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1Entity {
  @scala.inline
  def apply(description: String = null, entityId: String = null, languageCode: String = null): SchemaGoogleCloudVideointelligenceV1Entity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1Entity]
  }
}

