package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorValue extends StObject {
  
  var color: js.UndefOr[String | Dark] = js.undefined
  
  var value: Double
}
object ColorValue {
  
  @scala.inline
  def apply(value: Double): ColorValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorValue]
  }
  
  @scala.inline
  implicit class ColorValueMutableBuilder[Self <: ColorValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
