package typings.jsplumb.mod

import typings.jsplumb.anon.BorderStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOverlayOptions extends OverlayOptions {
  
  var cssClass: js.UndefOr[String] = js.native
  
  var label: String = js.native
  
  // 0.5
  var labelStyle: js.UndefOr[BorderStyle] = js.native
  
  var location: js.UndefOr[Double] = js.native
}
object LabelOverlayOptions {
  
  @scala.inline
  def apply(label: String): LabelOverlayOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOverlayOptions]
  }
  
  @scala.inline
  implicit class LabelOverlayOptionsMutableBuilder[Self <: LabelOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: BorderStyle): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
