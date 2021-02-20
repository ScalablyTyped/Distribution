package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyColor extends StObject {
  
  var bodyColor: js.UndefOr[String] = js.native
  
  var bodyFontSize: js.UndefOr[Double] = js.native
  
  var titleFontSize: js.UndefOr[Double] = js.native
}
object BodyColor {
  
  @scala.inline
  def apply(): BodyColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyColor]
  }
  
  @scala.inline
  implicit class BodyColorMutableBuilder[Self <: BodyColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyColor(value: String): Self = StObject.set(x, "bodyColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyColorUndefined: Self = StObject.set(x, "bodyColor", js.undefined)
    
    @scala.inline
    def setBodyFontSize(value: Double): Self = StObject.set(x, "bodyFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFontSizeUndefined: Self = StObject.set(x, "bodyFontSize", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
  }
}
