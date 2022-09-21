package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2HybridInspectJobTriggerRequest extends StObject {
  
  /**
    * The item to inspect.
    */
  var hybridItem: js.UndefOr[SchemaGooglePrivacyDlpV2HybridContentItem] = js.undefined
}
object SchemaGooglePrivacyDlpV2HybridInspectJobTriggerRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2HybridInspectJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HybridInspectJobTriggerRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2HybridInspectJobTriggerRequest](x: Self) {
    
    inline def setHybridItem(value: SchemaGooglePrivacyDlpV2HybridContentItem): Self = StObject.set(x, "hybridItem", value.asInstanceOf[js.Any])
    
    inline def setHybridItemUndefined: Self = StObject.set(x, "hybridItem", js.undefined)
  }
}
