package typings.jsplumb.mod

import typings.jsplumb.anon.BorderStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOverlayOptions
  extends StObject
     with OverlayOptions {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var label: String
  
  // 0.5
  var labelStyle: js.UndefOr[BorderStyle] = js.undefined
  
  var location: js.UndefOr[Double] = js.undefined
}
object LabelOverlayOptions {
  
  inline def apply(label: String): LabelOverlayOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOverlayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelOverlayOptions] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: BorderStyle): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
