package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties referring a single dimension (either row or column). If both
  * BandedRange.row_properties and BandedRange.column_properties are set, the
  * fill colors are applied to cells according to the following rules:  *
  * header_color and footer_color take priority over band colors. *
  * first_band_color takes priority over second_band_color. * row_properties
  * takes priority over column_properties.  For example, the first row color
  * takes priority over the first column color, but the first column color
  * takes priority over the second row color. Similarly, the row header takes
  * priority over the column header in the top left cell, but the column header
  * takes priority over the first row color if the row header is not set.
  */
trait SchemaBandingProperties extends StObject {
  
  /**
    * The first color that is alternating. (Required)
    */
  var firstBandColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the last row or column. If this field is not set, the last
    * row or column will be filled with either first_band_color or
    * second_band_color, depending on the color of the previous row or column.
    */
  var footerColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the first row or column. If this field is set, the first row
    * or column will be filled with this color and the colors will alternate
    * between first_band_color and second_band_color starting from the second
    * row or column. Otherwise, the first row or column will be filled with
    * first_band_color and the colors will proceed to alternate as they
    * normally would.
    */
  var headerColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The second color that is alternating. (Required)
    */
  var secondBandColor: js.UndefOr[SchemaColor] = js.undefined
}
object SchemaBandingProperties {
  
  @scala.inline
  def apply(): SchemaBandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBandingProperties]
  }
  
  @scala.inline
  implicit class SchemaBandingPropertiesMutableBuilder[Self <: SchemaBandingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstBandColor(value: SchemaColor): Self = StObject.set(x, "firstBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBandColorUndefined: Self = StObject.set(x, "firstBandColor", js.undefined)
    
    @scala.inline
    def setFooterColor(value: SchemaColor): Self = StObject.set(x, "footerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterColorUndefined: Self = StObject.set(x, "footerColor", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: SchemaColor): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
    
    @scala.inline
    def setSecondBandColor(value: SchemaColor): Self = StObject.set(x, "secondBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondBandColorUndefined: Self = StObject.set(x, "secondBandColor", js.undefined)
  }
}
