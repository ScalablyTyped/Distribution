package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceAppliedCapabilities extends StObject {
  
  /**
    * Whether the user can read related applied metadata on items.
    */
  var canRead: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can use this choice in search queries.
    */
  var canSearch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can select this choice on an item.
    */
  var canSelect: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceAppliedCapabilities {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceAppliedCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceAppliedCapabilities]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceAppliedCapabilities](x: Self) {
    
    inline def setCanRead(value: Boolean): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
    
    inline def setCanReadNull: Self = StObject.set(x, "canRead", null)
    
    inline def setCanReadUndefined: Self = StObject.set(x, "canRead", js.undefined)
    
    inline def setCanSearch(value: Boolean): Self = StObject.set(x, "canSearch", value.asInstanceOf[js.Any])
    
    inline def setCanSearchNull: Self = StObject.set(x, "canSearch", null)
    
    inline def setCanSearchUndefined: Self = StObject.set(x, "canSearch", js.undefined)
    
    inline def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
    
    inline def setCanSelectNull: Self = StObject.set(x, "canSelect", null)
    
    inline def setCanSelectUndefined: Self = StObject.set(x, "canSelect", js.undefined)
  }
}
