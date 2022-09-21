package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldLimits extends StObject {
  
  /**
    * Date Field limits.
    */
  var dateLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDateLimits] = js.undefined
  
  /**
    * Integer Field limits.
    */
  var integerLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaIntegerLimits] = js.undefined
  
  /**
    * Long text Field limits.
    */
  var longTextLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaLongTextLimits] = js.undefined
  
  /**
    * Limits for Field description, also called help text.
    */
  var maxDescriptionLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Limits for Field title.
    */
  var maxDisplayNameLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max length for the id.
    */
  var maxIdLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Selection Field limits.
    */
  var selectionLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaSelectionLimits] = js.undefined
  
  /**
    * The relevant limits for the specified Field.Type. Text Field limits.
    */
  var textLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaTextLimits] = js.undefined
  
  /**
    * User Field limits.
    */
  var userLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaUserLimits] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaFieldLimits {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldLimits]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldLimits](x: Self) {
    
    inline def setDateLimits(value: SchemaGoogleAppsDriveLabelsV2betaDateLimits): Self = StObject.set(x, "dateLimits", value.asInstanceOf[js.Any])
    
    inline def setDateLimitsUndefined: Self = StObject.set(x, "dateLimits", js.undefined)
    
    inline def setIntegerLimits(value: SchemaGoogleAppsDriveLabelsV2betaIntegerLimits): Self = StObject.set(x, "integerLimits", value.asInstanceOf[js.Any])
    
    inline def setIntegerLimitsUndefined: Self = StObject.set(x, "integerLimits", js.undefined)
    
    inline def setLongTextLimits(value: SchemaGoogleAppsDriveLabelsV2betaLongTextLimits): Self = StObject.set(x, "longTextLimits", value.asInstanceOf[js.Any])
    
    inline def setLongTextLimitsUndefined: Self = StObject.set(x, "longTextLimits", js.undefined)
    
    inline def setMaxDescriptionLength(value: Double): Self = StObject.set(x, "maxDescriptionLength", value.asInstanceOf[js.Any])
    
    inline def setMaxDescriptionLengthNull: Self = StObject.set(x, "maxDescriptionLength", null)
    
    inline def setMaxDescriptionLengthUndefined: Self = StObject.set(x, "maxDescriptionLength", js.undefined)
    
    inline def setMaxDisplayNameLength(value: Double): Self = StObject.set(x, "maxDisplayNameLength", value.asInstanceOf[js.Any])
    
    inline def setMaxDisplayNameLengthNull: Self = StObject.set(x, "maxDisplayNameLength", null)
    
    inline def setMaxDisplayNameLengthUndefined: Self = StObject.set(x, "maxDisplayNameLength", js.undefined)
    
    inline def setMaxIdLength(value: Double): Self = StObject.set(x, "maxIdLength", value.asInstanceOf[js.Any])
    
    inline def setMaxIdLengthNull: Self = StObject.set(x, "maxIdLength", null)
    
    inline def setMaxIdLengthUndefined: Self = StObject.set(x, "maxIdLength", js.undefined)
    
    inline def setSelectionLimits(value: SchemaGoogleAppsDriveLabelsV2betaSelectionLimits): Self = StObject.set(x, "selectionLimits", value.asInstanceOf[js.Any])
    
    inline def setSelectionLimitsUndefined: Self = StObject.set(x, "selectionLimits", js.undefined)
    
    inline def setTextLimits(value: SchemaGoogleAppsDriveLabelsV2betaTextLimits): Self = StObject.set(x, "textLimits", value.asInstanceOf[js.Any])
    
    inline def setTextLimitsUndefined: Self = StObject.set(x, "textLimits", js.undefined)
    
    inline def setUserLimits(value: SchemaGoogleAppsDriveLabelsV2betaUserLimits): Self = StObject.set(x, "userLimits", value.asInstanceOf[js.Any])
    
    inline def setUserLimitsUndefined: Self = StObject.set(x, "userLimits", js.undefined)
  }
}
