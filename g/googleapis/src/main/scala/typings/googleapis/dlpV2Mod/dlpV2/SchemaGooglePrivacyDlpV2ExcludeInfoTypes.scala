package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of exclude infoTypes.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ExcludeInfoTypes extends js.Object {
  /**
    * InfoType list in ExclusionRule rule drops a finding when it overlaps or
    * contained within with a finding of an infoType from this list. For
    * example, for `InspectionRuleSet.info_types` containing
    * &quot;PHONE_NUMBER&quot;` and `exclusion_rule` containing
    * `exclude_info_types.info_types` with &quot;EMAIL_ADDRESS&quot; the phone
    * number findings are dropped if they overlap with EMAIL_ADDRESS finding.
    * That leads to &quot;555-222-2222@example.org&quot; to generate only a
    * single finding, namely email address.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
}

object SchemaGooglePrivacyDlpV2ExcludeInfoTypes {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ExcludeInfoTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ExcludeInfoTypes]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ExcludeInfoTypesOps[Self <: SchemaGooglePrivacyDlpV2ExcludeInfoTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = this.set("infoTypes", js.Array(value :_*))
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypes: Self = this.set("infoTypes", js.undefined)
  }
  
}

