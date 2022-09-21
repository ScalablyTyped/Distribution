package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBaselineValueFormat extends StObject {
  
  /**
    * The comparison type of key value with baseline value.
    */
  var comparisonType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description which is appended after the baseline value. This field is optional.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Color to be used, in case baseline value represents a negative change for key value. This field is optional. Deprecated: Use negative_color_style.
    */
  var negativeColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * Color to be used, in case baseline value represents a negative change for key value. This field is optional. If negative_color is also set, this field takes precedence.
    */
  var negativeColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * Specifies the horizontal text positioning of baseline value. This field is optional. If not specified, default positioning is used.
    */
  var position: js.UndefOr[SchemaTextPosition] = js.undefined
  
  /**
    * Color to be used, in case baseline value represents a positive change for key value. This field is optional. Deprecated: Use positive_color_style.
    */
  var positiveColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * Color to be used, in case baseline value represents a positive change for key value. This field is optional. If positive_color is also set, this field takes precedence.
    */
  var positiveColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * Text formatting options for baseline value. The link field is not supported.
    */
  var textFormat: js.UndefOr[SchemaTextFormat] = js.undefined
}
object SchemaBaselineValueFormat {
  
  inline def apply(): SchemaBaselineValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBaselineValueFormat]
  }
  
  extension [Self <: SchemaBaselineValueFormat](x: Self) {
    
    inline def setComparisonType(value: String): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    inline def setComparisonTypeNull: Self = StObject.set(x, "comparisonType", null)
    
    inline def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNegativeColor(value: SchemaColor): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "negativeColorStyle", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorStyleUndefined: Self = StObject.set(x, "negativeColorStyle", js.undefined)
    
    inline def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    inline def setPosition(value: SchemaTextPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositiveColor(value: SchemaColor): Self = StObject.set(x, "positiveColor", value.asInstanceOf[js.Any])
    
    inline def setPositiveColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "positiveColorStyle", value.asInstanceOf[js.Any])
    
    inline def setPositiveColorStyleUndefined: Self = StObject.set(x, "positiveColorStyle", js.undefined)
    
    inline def setPositiveColorUndefined: Self = StObject.set(x, "positiveColor", js.undefined)
    
    inline def setTextFormat(value: SchemaTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
