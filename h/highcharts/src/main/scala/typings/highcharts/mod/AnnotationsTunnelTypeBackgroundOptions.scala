package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTunnelTypeBackgroundOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object AnnotationsTunnelTypeBackgroundOptions {
  
  @scala.inline
  def apply(): AnnotationsTunnelTypeBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelTypeBackgroundOptions]
  }
  
  @scala.inline
  implicit class AnnotationsTunnelTypeBackgroundOptionsMutableBuilder[Self <: AnnotationsTunnelTypeBackgroundOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
