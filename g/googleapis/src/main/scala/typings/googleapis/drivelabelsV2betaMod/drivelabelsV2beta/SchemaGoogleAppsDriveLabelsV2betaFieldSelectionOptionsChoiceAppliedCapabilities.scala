package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoiceAppliedCapabilities extends StObject {
  
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
object SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoiceAppliedCapabilities {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoiceAppliedCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoiceAppliedCapabilities]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoiceAppliedCapabilities](x: Self) {
    
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
