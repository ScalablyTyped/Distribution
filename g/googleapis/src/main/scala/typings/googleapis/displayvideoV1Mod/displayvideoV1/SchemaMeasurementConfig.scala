package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMeasurementConfig extends StObject {
  
  /**
    * Whether or not to report DV360 cost to CM360.
    */
  var dv360ToCmCostReportingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether or not to include DV360 data in CM360 data transfer reports.
    */
  var dv360ToCmDataSharingEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMeasurementConfig {
  
  inline def apply(): SchemaMeasurementConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMeasurementConfig]
  }
  
  extension [Self <: SchemaMeasurementConfig](x: Self) {
    
    inline def setDv360ToCmCostReportingEnabled(value: Boolean): Self = StObject.set(x, "dv360ToCmCostReportingEnabled", value.asInstanceOf[js.Any])
    
    inline def setDv360ToCmCostReportingEnabledNull: Self = StObject.set(x, "dv360ToCmCostReportingEnabled", null)
    
    inline def setDv360ToCmCostReportingEnabledUndefined: Self = StObject.set(x, "dv360ToCmCostReportingEnabled", js.undefined)
    
    inline def setDv360ToCmDataSharingEnabled(value: Boolean): Self = StObject.set(x, "dv360ToCmDataSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setDv360ToCmDataSharingEnabledNull: Self = StObject.set(x, "dv360ToCmDataSharingEnabled", null)
    
    inline def setDv360ToCmDataSharingEnabledUndefined: Self = StObject.set(x, "dv360ToCmDataSharingEnabled", js.undefined)
  }
}
