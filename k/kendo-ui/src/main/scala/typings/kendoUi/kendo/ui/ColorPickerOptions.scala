package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPickerOptions extends StObject {
  
  var buttons: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ ColorPickerChangeEvent, Unit]] = js.undefined
  
  var clearButton: js.UndefOr[Boolean] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, Unit]] = js.undefined
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var messages: js.UndefOr[ColorPickerMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Boolean] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, Unit]] = js.undefined
  
  var palette: js.UndefOr[String | js.Any] = js.undefined
  
  var preview: js.UndefOr[Boolean] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ ColorPickerSelectEvent, Unit]] = js.undefined
  
  var tileSize: js.UndefOr[ColorPickerTileSize] = js.undefined
  
  var toolIcon: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ColorPickerOptions {
  
  @scala.inline
  def apply(): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerOptions]
  }
  
  @scala.inline
  implicit class ColorPickerOptionsMutableBuilder[Self <: ColorPickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: Boolean): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ColorPickerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ColorPickerEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setMessages(value: ColorPickerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ ColorPickerEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPalette(value: String | js.Any): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ ColorPickerSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setTileSize(value: ColorPickerTileSize): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setToolIcon(value: String): Self = StObject.set(x, "toolIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolIconUndefined: Self = StObject.set(x, "toolIcon", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
