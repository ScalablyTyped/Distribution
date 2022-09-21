package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DataProfileConfigSnapshot extends StObject {
  
  /**
    * A copy of the configuration used to generate this profile.
    */
  var dataProfileJob: js.UndefOr[SchemaGooglePrivacyDlpV2DataProfileJobConfig] = js.undefined
  
  /**
    * A copy of the inspection config used to generate this profile. This is a copy of the inspect_template specified in `DataProfileJobConfig`.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2DataProfileConfigSnapshot {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DataProfileConfigSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DataProfileConfigSnapshot]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DataProfileConfigSnapshot](x: Self) {
    
    inline def setDataProfileJob(value: SchemaGooglePrivacyDlpV2DataProfileJobConfig): Self = StObject.set(x, "dataProfileJob", value.asInstanceOf[js.Any])
    
    inline def setDataProfileJobUndefined: Self = StObject.set(x, "dataProfileJob", js.undefined)
    
    inline def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
  }
}
