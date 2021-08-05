package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2RequestedOptions extends StObject {
  
  var jobConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.undefined
  
  /**
    * If run with an InspectTemplate, a snapshot of its state at the time of
    * this run.
    */
  var snapshotInspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.undefined
}
object SchemaGooglePrivacyDlpV2RequestedOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RequestedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RequestedOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RequestedOptions](x: Self) {
    
    inline def setJobConfig(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = StObject.set(x, "jobConfig", value.asInstanceOf[js.Any])
    
    inline def setJobConfigUndefined: Self = StObject.set(x, "jobConfig", js.undefined)
    
    inline def setSnapshotInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = StObject.set(x, "snapshotInspectTemplate", value.asInstanceOf[js.Any])
    
    inline def setSnapshotInspectTemplateUndefined: Self = StObject.set(x, "snapshotInspectTemplate", js.undefined)
  }
}
