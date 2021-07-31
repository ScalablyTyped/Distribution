package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSide extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var side: js.UndefOr[String] = js.undefined
}
object ColorSide {
  
  @scala.inline
  def apply(): ColorSide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSide]
  }
  
  @scala.inline
  implicit class ColorSideMutableBuilder[Self <: ColorSide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
  }
}
