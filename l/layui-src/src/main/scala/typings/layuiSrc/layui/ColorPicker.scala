package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPicker extends StObject {
  
  def render(option: ColorPickerOption): ColorPicker = js.native
}
object ColorPicker {
  
  @scala.inline
  def apply(render: ColorPickerOption => ColorPicker): ColorPicker = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[ColorPicker]
  }
  
  @scala.inline
  implicit class ColorPickerMutableBuilder[Self <: ColorPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: ColorPickerOption => ColorPicker): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
