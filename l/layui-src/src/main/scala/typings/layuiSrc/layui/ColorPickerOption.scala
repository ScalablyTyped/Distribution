package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.hex
import typings.layuiSrc.layuiSrcStrings.lg
import typings.layuiSrc.layuiSrcStrings.rgb
import typings.layuiSrc.layuiSrcStrings.rgba
import typings.layuiSrc.layuiSrcStrings.sm
import typings.layuiSrc.layuiSrcStrings.xs
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPickerOption extends js.Object {
  
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
  implicit class ColorPickerOptionOps[Self <: ColorPickerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAplha(value: Boolean): Self = this.set("aplha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAplha: Self = this.set("aplha", js.undefined)
    
    @scala.inline
    def setChange(value: /* color */ js.Any => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDone(value: /* color */ js.Any => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setFormat(value: hex | rgb | rgba): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setPredefine(value: Boolean): Self = this.set("predefine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefine: Self = this.set("predefine", js.undefined)
    
    @scala.inline
    def setSize(value: lg | sm | xs): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
