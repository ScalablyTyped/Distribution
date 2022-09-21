package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2LabelAppliedCapabilities extends StObject {
  
  /**
    * Whether the user can apply this label to items.
    */
  var canApply: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can read applied metadata related to this label.
    */
  var canRead: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can remove this label from items.
    */
  var canRemove: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2LabelAppliedCapabilities {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2LabelAppliedCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2LabelAppliedCapabilities]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2LabelAppliedCapabilities](x: Self) {
    
    inline def setCanApply(value: Boolean): Self = StObject.set(x, "canApply", value.asInstanceOf[js.Any])
    
    inline def setCanApplyNull: Self = StObject.set(x, "canApply", null)
    
    inline def setCanApplyUndefined: Self = StObject.set(x, "canApply", js.undefined)
    
    inline def setCanRead(value: Boolean): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
    
    inline def setCanReadNull: Self = StObject.set(x, "canRead", null)
    
    inline def setCanReadUndefined: Self = StObject.set(x, "canRead", js.undefined)
    
    inline def setCanRemove(value: Boolean): Self = StObject.set(x, "canRemove", value.asInstanceOf[js.Any])
    
    inline def setCanRemoveNull: Self = StObject.set(x, "canRemove", null)
    
    inline def setCanRemoveUndefined: Self = StObject.set(x, "canRemove", js.undefined)
  }
}
