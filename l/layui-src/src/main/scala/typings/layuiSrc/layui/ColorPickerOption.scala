package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.hex
import typings.layuiSrc.layuiSrcStrings.lg
import typings.layuiSrc.layuiSrcStrings.rgb
import typings.layuiSrc.layuiSrcStrings.rgba
import typings.layuiSrc.layuiSrcStrings.sm
import typings.layuiSrc.layuiSrcStrings.xs
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPickerOption extends StObject {
  
  var aplha: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* color */ js.Any, Unit]] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var done: js.UndefOr[js.Function1[/* color */ js.Any, Unit]] = js.undefined
  
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var format: js.UndefOr[hex | rgb | rgba] = js.undefined
  
  var predefine: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[lg | sm | xs] = js.undefined
}
object ColorPickerOption {
  
  inline def apply(): ColorPickerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerOption]
  }
  
  extension [Self <: ColorPickerOption](x: Self) {
    
    inline def setAplha(value: Boolean): Self = StObject.set(x, "aplha", value.asInstanceOf[js.Any])
    
    inline def setAplhaUndefined: Self = StObject.set(x, "aplha", js.undefined)
    
    inline def setChange(value: /* color */ js.Any => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    inline def setDone(value: /* color */ js.Any => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setFormat(value: hex | rgb | rgba): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPredefine(value: Boolean): Self = StObject.set(x, "predefine", value.asInstanceOf[js.Any])
    
    inline def setPredefineUndefined: Self = StObject.set(x, "predefine", js.undefined)
    
    inline def setSize(value: lg | sm | xs): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
