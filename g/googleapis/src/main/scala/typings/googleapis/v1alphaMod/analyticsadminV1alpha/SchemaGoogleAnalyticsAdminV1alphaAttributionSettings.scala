package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAttributionSettings extends StObject {
  
  /**
    * Required. The lookback window configuration for acquisition conversion events. The default window size is 30 days.
    */
  var acquisitionConversionEventLookbackWindow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of this attribution settings resource. Format: properties/{property_id\}/attributionSettings Example: "properties/1000/attributionSettings"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The lookback window for all other, non-acquisition conversion events. The default window size is 90 days.
    */
  var otherConversionEventLookbackWindow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The reporting attribution model used to calculate conversion credit in this property's reports. Changing the attribution model will apply to both historical and future data. These changes will be reflected in reports with conversion and revenue data. User and session data will be unaffected.
    */
  var reportingAttributionModel: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAttributionSettings {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAttributionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAttributionSettings](x: Self) {
    
    inline def setAcquisitionConversionEventLookbackWindow(value: String): Self = StObject.set(x, "acquisitionConversionEventLookbackWindow", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionConversionEventLookbackWindowNull: Self = StObject.set(x, "acquisitionConversionEventLookbackWindow", null)
    
    inline def setAcquisitionConversionEventLookbackWindowUndefined: Self = StObject.set(x, "acquisitionConversionEventLookbackWindow", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOtherConversionEventLookbackWindow(value: String): Self = StObject.set(x, "otherConversionEventLookbackWindow", value.asInstanceOf[js.Any])
    
    inline def setOtherConversionEventLookbackWindowNull: Self = StObject.set(x, "otherConversionEventLookbackWindow", null)
    
    inline def setOtherConversionEventLookbackWindowUndefined: Self = StObject.set(x, "otherConversionEventLookbackWindow", js.undefined)
    
    inline def setReportingAttributionModel(value: String): Self = StObject.set(x, "reportingAttributionModel", value.asInstanceOf[js.Any])
    
    inline def setReportingAttributionModelNull: Self = StObject.set(x, "reportingAttributionModel", null)
    
    inline def setReportingAttributionModelUndefined: Self = StObject.set(x, "reportingAttributionModel", js.undefined)
  }
}
