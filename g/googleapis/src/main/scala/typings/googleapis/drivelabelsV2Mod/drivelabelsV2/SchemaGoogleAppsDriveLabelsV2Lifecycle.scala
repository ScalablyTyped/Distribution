package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2Lifecycle extends StObject {
  
  /**
    * The policy that governs how to show a disabled label, field, or selection choice.
    */
  var disabledPolicy: js.UndefOr[SchemaGoogleAppsDriveLabelsV2LifecycleDisabledPolicy] = js.undefined
  
  /**
    * Output only. Whether the object associated with this lifecycle has unpublished changes.
    */
  var hasUnpublishedChanges: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The state of the object associated with this lifecycle.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2Lifecycle {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2Lifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2Lifecycle]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2Lifecycle](x: Self) {
    
    inline def setDisabledPolicy(value: SchemaGoogleAppsDriveLabelsV2LifecycleDisabledPolicy): Self = StObject.set(x, "disabledPolicy", value.asInstanceOf[js.Any])
    
    inline def setDisabledPolicyUndefined: Self = StObject.set(x, "disabledPolicy", js.undefined)
    
    inline def setHasUnpublishedChanges(value: Boolean): Self = StObject.set(x, "hasUnpublishedChanges", value.asInstanceOf[js.Any])
    
    inline def setHasUnpublishedChangesNull: Self = StObject.set(x, "hasUnpublishedChanges", null)
    
    inline def setHasUnpublishedChangesUndefined: Self = StObject.set(x, "hasUnpublishedChanges", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
