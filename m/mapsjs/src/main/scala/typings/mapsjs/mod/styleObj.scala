package typings.mapsjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait styleObj extends StObject {
  
  var dashArray: js.UndefOr[String] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double] = js.native
  
  var outlineColor: js.UndefOr[String] = js.native
  
  var outlineOpacity: js.UndefOr[Double] = js.native
  
  var outlineThicknessPix: js.UndefOr[Double] = js.native
}
object styleObj {
  
  @scala.inline
  def apply(): styleObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[styleObj]
  }
  
  @scala.inline
  implicit class styleObjMutableBuilder[Self <: styleObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineOpacity(value: Double): Self = StObject.set(x, "outlineOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOpacityUndefined: Self = StObject.set(x, "outlineOpacity", js.undefined)
    
    @scala.inline
    def setOutlineThicknessPix(value: Double): Self = StObject.set(x, "outlineThicknessPix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineThicknessPixUndefined: Self = StObject.set(x, "outlineThicknessPix", js.undefined)
  }
}
