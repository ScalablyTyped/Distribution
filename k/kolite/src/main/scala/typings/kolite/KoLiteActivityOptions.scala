package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Activity /////////////////////////////////////////////
trait KoLiteActivityOptions extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[js.Any] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var segments: js.UndefOr[Double] = js.undefined
  
  var space: js.UndefOr[Double] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var valign: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object KoLiteActivityOptions {
  
  @scala.inline
  def apply(): KoLiteActivityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoLiteActivityOptions]
  }
  
  @scala.inline
  implicit class KoLiteActivityOptionsMutableBuilder[Self <: KoLiteActivityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setValign(value: String): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
