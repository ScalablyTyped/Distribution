package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ColorPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofColorPalette extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ColorPalette
  
  /* static member */
  var fn: ColorPalette
}
object TypeofColorPalette {
  
  @scala.inline
  def apply(extend: js.Object => ColorPalette, fn: ColorPalette): TypeofColorPalette = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofColorPalette]
  }
  
  @scala.inline
  implicit class TypeofColorPaletteMutableBuilder[Self <: TypeofColorPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ColorPalette): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ColorPalette): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
