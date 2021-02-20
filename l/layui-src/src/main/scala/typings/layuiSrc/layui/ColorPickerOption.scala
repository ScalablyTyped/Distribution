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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPickerOption extends StObject {
  
  var aplha: js.UndefOr[Boolean] = js.native
  
  var change: js.UndefOr[js.Function1[/* color */ js.Any, Unit]] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  var done: js.UndefOr[js.Function1[/* color */ js.Any, Unit]] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var format: js.UndefOr[hex | rgb | rgba] = js.native
  
  var predefine: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[lg | sm | xs] = js.native
}
object ColorPickerOption {
  
  @scala.inline
  def apply(): ColorPickerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerOption]
  }
  
  @scala.inline
  implicit class ColorPickerOptionMutableBuilder[Self <: ColorPickerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAplha(value: Boolean): Self = StObject.set(x, "aplha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAplhaUndefined: Self = StObject.set(x, "aplha", js.undefined)
    
    @scala.inline
    def setChange(value: /* color */ js.Any => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setDone(value: /* color */ js.Any => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setFormat(value: hex | rgb | rgba): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPredefine(value: Boolean): Self = StObject.set(x, "predefine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefineUndefined: Self = StObject.set(x, "predefine", js.undefined)
    
    @scala.inline
    def setSize(value: lg | sm | xs): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
