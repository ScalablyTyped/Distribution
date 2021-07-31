package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[Double] = js.undefined
  
  var primaryColor: js.UndefOr[String] = js.undefined
  
  var primaryTextColor: js.UndefOr[String] = js.undefined
  
  var secondaryColor: js.UndefOr[String] = js.undefined
  
  var secondaryTextColor: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object FontWeight {
  
  @scala.inline
  def apply(): FontWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeight]
  }
  
  @scala.inline
  implicit class FontWeightMutableBuilder[Self <: FontWeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
    
    @scala.inline
    def setPrimaryTextColor(value: String): Self = StObject.set(x, "primaryTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryTextColorUndefined: Self = StObject.set(x, "primaryTextColor", js.undefined)
    
    @scala.inline
    def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    
    @scala.inline
    def setSecondaryTextColor(value: String): Self = StObject.set(x, "secondaryTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTextColorUndefined: Self = StObject.set(x, "secondaryTextColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
