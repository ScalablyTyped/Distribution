package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeTransformation extends js.Object {
  /**
    * InfoTypes to apply the transformation to. An empty list will cause this
    * transformation to apply to all findings that correspond to infoTypes that
    * were requested in `InspectConfig`.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  /**
    * Primitive transformation to apply to the infoType. [required]
    */
  var primitiveTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeTransformation {
  @scala.inline
  def apply(
    infoTypes: js.Array[SchemaGooglePrivacyDlpV2InfoType] = null,
    primitiveTransformation: SchemaGooglePrivacyDlpV2PrimitiveTransformation = null
  ): SchemaGooglePrivacyDlpV2InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    if (primitiveTransformation != null) __obj.updateDynamic("primitiveTransformation")(primitiveTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformation]
  }
}

