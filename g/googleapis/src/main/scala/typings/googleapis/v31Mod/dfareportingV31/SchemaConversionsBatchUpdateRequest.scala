package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update Conversions Request.
  */
@js.native
trait SchemaConversionsBatchUpdateRequest extends js.Object {
  /**
    * The set of conversions to update.
    */
  var conversions: js.UndefOr[js.Array[SchemaConversion]] = js.native
  /**
    * Describes how encryptedUserId is encrypted. This is a required field if
    * encryptedUserId is used.
    */
  var encryptionInfo: js.UndefOr[SchemaEncryptionInfo] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchUpdateRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaConversionsBatchUpdateRequest {
  @scala.inline
  def apply(
    conversions: js.Array[SchemaConversion] = null,
    encryptionInfo: SchemaEncryptionInfo = null,
    kind: String = null
  ): SchemaConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (conversions != null) __obj.updateDynamic("conversions")(conversions.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConversionsBatchUpdateRequest]
  }
}

