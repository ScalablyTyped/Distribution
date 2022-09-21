package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2LifecycleDisabledPolicy extends StObject {
  
  /**
    * Whether to hide this disabled object in the search menu for Drive items. * When `false`, the object is generally shown in the UI as disabled but it appears in the search results when searching for Drive items. * When `true`, the object is generally hidden in the UI when searching for Drive items.
    */
  var hideInSearch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to show this disabled object in the apply menu on Drive items. * When `true`, the object is generally shown in the UI as disabled and is unselectable. * When `false`, the object is generally hidden in the UI.
    */
  var showInApply: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2LifecycleDisabledPolicy {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2LifecycleDisabledPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2LifecycleDisabledPolicy]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2LifecycleDisabledPolicy](x: Self) {
    
    inline def setHideInSearch(value: Boolean): Self = StObject.set(x, "hideInSearch", value.asInstanceOf[js.Any])
    
    inline def setHideInSearchNull: Self = StObject.set(x, "hideInSearch", null)
    
    inline def setHideInSearchUndefined: Self = StObject.set(x, "hideInSearch", js.undefined)
    
    inline def setShowInApply(value: Boolean): Self = StObject.set(x, "showInApply", value.asInstanceOf[js.Any])
    
    inline def setShowInApplyNull: Self = StObject.set(x, "showInApply", null)
    
    inline def setShowInApplyUndefined: Self = StObject.set(x, "showInApply", js.undefined)
  }
}
