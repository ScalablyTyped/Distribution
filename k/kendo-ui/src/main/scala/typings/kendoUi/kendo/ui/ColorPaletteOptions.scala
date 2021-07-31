package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPaletteOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ ColorPaletteEvent, Unit]] = js.undefined
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var palette: js.UndefOr[String | js.Any] = js.undefined
  
  var tileSize: js.UndefOr[ColorPaletteTileSize] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ColorPaletteOptions {
  
  @scala.inline
  def apply(): ColorPaletteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPaletteOptions]
  }
  
  @scala.inline
  implicit class ColorPaletteOptionsMutableBuilder[Self <: ColorPaletteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ ColorPaletteEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPalette(value: String | js.Any): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setTileSize(value: ColorPaletteTileSize): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
