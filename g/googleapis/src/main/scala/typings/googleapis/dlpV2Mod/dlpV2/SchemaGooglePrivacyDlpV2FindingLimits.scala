package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2FindingLimits extends js.Object {
  /**
    * Configuration of findings limit given for specified infoTypes.
    */
  var maxFindingsPerInfoType: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit]] = js.native
  /**
    * Max number of findings that will be returned for each item scanned. When
    * set within `InspectDataSourceRequest`, the maximum returned is 2000
    * regardless if this is set higher. When set within
    * `InspectContentRequest`, this field is ignored.
    */
  var maxFindingsPerItem: js.UndefOr[Double] = js.native
  /**
    * Max number of findings that will be returned per request/job. When set
    * within `InspectContentRequest`, the maximum returned is 2000 regardless
    * if this is set higher.
    */
  var maxFindingsPerRequest: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2FindingLimits {
  @scala.inline
  def apply(
    maxFindingsPerInfoType: js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit] = null,
    maxFindingsPerItem: Int | Double = null,
    maxFindingsPerRequest: Int | Double = null
  ): SchemaGooglePrivacyDlpV2FindingLimits = {
    val __obj = js.Dynamic.literal()
    if (maxFindingsPerInfoType != null) __obj.updateDynamic("maxFindingsPerInfoType")(maxFindingsPerInfoType.asInstanceOf[js.Any])
    if (maxFindingsPerItem != null) __obj.updateDynamic("maxFindingsPerItem")(maxFindingsPerItem.asInstanceOf[js.Any])
    if (maxFindingsPerRequest != null) __obj.updateDynamic("maxFindingsPerRequest")(maxFindingsPerRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FindingLimits]
  }
}

