package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of exclude infoTypes.
  */
trait SchemaGooglePrivacyDlpV2ExcludeInfoTypes extends StObject {
  
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
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.undefined
}
object SchemaGooglePrivacyDlpV2ExcludeInfoTypes {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ExcludeInfoTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ExcludeInfoTypes]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ExcludeInfoTypesMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ExcludeInfoTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
  }
}
