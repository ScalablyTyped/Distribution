package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of Google Cloud Vision API detection to perform, and the maximum
  * number of results to return for that type. Multiple `Feature` objects can
  * be specified in the `features` list.
  */
@js.native
trait SchemaFeature extends js.Object {
  /**
    * Maximum number of results of this type. Does not apply to
    * `TEXT_DETECTION`, `DOCUMENT_TEXT_DETECTION`, or `CROP_HINTS`.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Model to use for the feature. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The feature type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaFeature {
  @scala.inline
  def apply(maxResults: Int | Double = null, model: String = null, `type`: String = null): SchemaFeature = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFeature]
  }
}

