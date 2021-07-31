package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
}
object BackgroundColorColor {
  
  @scala.inline
  def apply(): BackgroundColorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorColor]
  }
  
  @scala.inline
  implicit class BackgroundColorColorMutableBuilder[Self <: BackgroundColorColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
