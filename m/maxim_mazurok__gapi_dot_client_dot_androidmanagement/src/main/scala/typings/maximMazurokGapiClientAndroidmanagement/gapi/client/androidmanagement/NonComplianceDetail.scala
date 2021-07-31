package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonComplianceDetail extends StObject {
  
  /** If the policy setting could not be applied, the current value of the setting on the device. */
  var currentValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * For settings with nested fields, if a particular nested field is out of compliance, this specifies the full path to the offending field. The path is formatted in the same way the
    * policy JSON field would be referenced in JavaScript, that is: 1) For object-typed fields, the field name is followed by a dot then by a subfield name. 2) For array-typed fields, the
    * field name is followed by the array index enclosed in brackets. For example, to indicate a problem with the url field in the externalData field in the 3rd application, the path
    * would be applications[2].externalData.url
    */
  var fieldPath: js.UndefOr[String] = js.undefined
  
  /** If package_name is set and the non-compliance reason is APP_NOT_INSTALLED or APP_NOT_UPDATED, the detailed reason the app can't be installed or updated. */
  var installationFailureReason: js.UndefOr[String] = js.undefined
  
  /** The reason the device is not in compliance with the setting. */
  var nonComplianceReason: js.UndefOr[String] = js.undefined
  
  /** The package name indicating which app is out of compliance, if applicable. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The name of the policy setting. This is the JSON field name of a top-level Policy field. */
  var settingName: js.UndefOr[String] = js.undefined
}
object NonComplianceDetail {
  
  @scala.inline
  def apply(): NonComplianceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonComplianceDetail]
  }
  
  @scala.inline
  implicit class NonComplianceDetailMutableBuilder[Self <: NonComplianceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentValue(value: js.Any): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentValueUndefined: Self = StObject.set(x, "currentValue", js.undefined)
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    @scala.inline
    def setInstallationFailureReason(value: String): Self = StObject.set(x, "installationFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationFailureReasonUndefined: Self = StObject.set(x, "installationFailureReason", js.undefined)
    
    @scala.inline
    def setNonComplianceReason(value: String): Self = StObject.set(x, "nonComplianceReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonComplianceReasonUndefined: Self = StObject.set(x, "nonComplianceReason", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setSettingName(value: String): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
  }
}
