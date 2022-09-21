package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBandingProperties extends StObject {
  
  /**
    * The first color that is alternating. (Required) Deprecated: Use first_band_color_style.
    */
  var firstBandColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The first color that is alternating. (Required) If first_band_color is also set, this field takes precedence.
    */
  var firstBandColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The color of the last row or column. If this field is not set, the last row or column is filled with either first_band_color or second_band_color, depending on the color of the previous row or column. Deprecated: Use footer_color_style.
    */
  var footerColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the last row or column. If this field is not set, the last row or column is filled with either first_band_color or second_band_color, depending on the color of the previous row or column. If footer_color is also set, this field takes precedence.
    */
  var footerColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The color of the first row or column. If this field is set, the first row or column is filled with this color and the colors alternate between first_band_color and second_band_color starting from the second row or column. Otherwise, the first row or column is filled with first_band_color and the colors proceed to alternate as they normally would. Deprecated: Use header_color_style.
    */
  var headerColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the first row or column. If this field is set, the first row or column is filled with this color and the colors alternate between first_band_color and second_band_color starting from the second row or column. Otherwise, the first row or column is filled with first_band_color and the colors proceed to alternate as they normally would. If header_color is also set, this field takes precedence.
    */
  var headerColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The second color that is alternating. (Required) Deprecated: Use second_band_color_style.
    */
  var secondBandColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The second color that is alternating. (Required) If second_band_color is also set, this field takes precedence.
    */
  var secondBandColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
}
object SchemaBandingProperties {
  
  inline def apply(): SchemaBandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBandingProperties]
  }
  
  extension [Self <: SchemaBandingProperties](x: Self) {
    
    inline def setFirstBandColor(value: SchemaColor): Self = StObject.set(x, "firstBandColor", value.asInstanceOf[js.Any])
    
    inline def setFirstBandColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "firstBandColorStyle", value.asInstanceOf[js.Any])
    
    inline def setFirstBandColorStyleUndefined: Self = StObject.set(x, "firstBandColorStyle", js.undefined)
    
    inline def setFirstBandColorUndefined: Self = StObject.set(x, "firstBandColor", js.undefined)
    
    inline def setFooterColor(value: SchemaColor): Self = StObject.set(x, "footerColor", value.asInstanceOf[js.Any])
    
    inline def setFooterColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "footerColorStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterColorStyleUndefined: Self = StObject.set(x, "footerColorStyle", js.undefined)
    
    inline def setFooterColorUndefined: Self = StObject.set(x, "footerColor", js.undefined)
    
    inline def setHeaderColor(value: SchemaColor): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "headerColorStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderColorStyleUndefined: Self = StObject.set(x, "headerColorStyle", js.undefined)
    
    inline def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
    
    inline def setSecondBandColor(value: SchemaColor): Self = StObject.set(x, "secondBandColor", value.asInstanceOf[js.Any])
    
    inline def setSecondBandColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "secondBandColorStyle", value.asInstanceOf[js.Any])
    
    inline def setSecondBandColorStyleUndefined: Self = StObject.set(x, "secondBandColorStyle", js.undefined)
    
    inline def setSecondBandColorUndefined: Self = StObject.set(x, "secondBandColor", js.undefined)
  }
}
