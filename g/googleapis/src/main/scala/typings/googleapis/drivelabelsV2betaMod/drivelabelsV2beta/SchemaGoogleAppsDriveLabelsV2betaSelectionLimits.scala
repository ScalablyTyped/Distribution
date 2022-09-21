package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaSelectionLimits extends StObject {
  
  /**
    * Limits for list-variant of a Field type.
    */
  var listLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaListLimits] = js.undefined
  
  /**
    * The max number of choices.
    */
  var maxChoices: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximum number of deleted choices.
    */
  var maxDeletedChoices: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximum length for display name.
    */
  var maxDisplayNameLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximum ID length for a selection options.
    */
  var maxIdLength: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaSelectionLimits {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaSelectionLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaSelectionLimits]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaSelectionLimits](x: Self) {
    
    inline def setListLimits(value: SchemaGoogleAppsDriveLabelsV2betaListLimits): Self = StObject.set(x, "listLimits", value.asInstanceOf[js.Any])
    
    inline def setListLimitsUndefined: Self = StObject.set(x, "listLimits", js.undefined)
    
    inline def setMaxChoices(value: Double): Self = StObject.set(x, "maxChoices", value.asInstanceOf[js.Any])
    
    inline def setMaxChoicesNull: Self = StObject.set(x, "maxChoices", null)
    
    inline def setMaxChoicesUndefined: Self = StObject.set(x, "maxChoices", js.undefined)
    
    inline def setMaxDeletedChoices(value: Double): Self = StObject.set(x, "maxDeletedChoices", value.asInstanceOf[js.Any])
    
    inline def setMaxDeletedChoicesNull: Self = StObject.set(x, "maxDeletedChoices", null)
    
    inline def setMaxDeletedChoicesUndefined: Self = StObject.set(x, "maxDeletedChoices", js.undefined)
    
    inline def setMaxDisplayNameLength(value: Double): Self = StObject.set(x, "maxDisplayNameLength", value.asInstanceOf[js.Any])
    
    inline def setMaxDisplayNameLengthNull: Self = StObject.set(x, "maxDisplayNameLength", null)
    
    inline def setMaxDisplayNameLengthUndefined: Self = StObject.set(x, "maxDisplayNameLength", js.undefined)
    
    inline def setMaxIdLength(value: Double): Self = StObject.set(x, "maxIdLength", value.asInstanceOf[js.Any])
    
    inline def setMaxIdLengthNull: Self = StObject.set(x, "maxIdLength", null)
    
    inline def setMaxIdLengthUndefined: Self = StObject.set(x, "maxIdLength", js.undefined)
  }
}
