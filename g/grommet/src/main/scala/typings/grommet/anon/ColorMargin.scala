package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMargin extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
}
object ColorMargin {
  
  @scala.inline
  def apply(): ColorMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMargin]
  }
  
  @scala.inline
  implicit class ColorMarginMutableBuilder[Self <: ColorMargin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
  }
}
