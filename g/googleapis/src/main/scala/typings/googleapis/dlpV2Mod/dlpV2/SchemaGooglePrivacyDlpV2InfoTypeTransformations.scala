package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of transformation that will scan unstructured text and apply various
  * `PrimitiveTransformation`s to each finding, where the transformation is
  * applied to only values that were identified as a specific info_type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeTransformations extends js.Object {
  /**
    * Transformation for each infoType. Cannot specify more than one for a
    * given infoType. [required]
    */
  var transformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation]] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeTransformations {
  @scala.inline
  def apply(transformations: js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation] = null): SchemaGooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformations]
  }
}

