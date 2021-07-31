package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorFontWeight extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[Double] = js.undefined
}
object ColorFontWeight {
  
  @scala.inline
  def apply(): ColorFontWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorFontWeight]
  }
  
  @scala.inline
  implicit class ColorFontWeightMutableBuilder[Self <: ColorFontWeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
  }
}
