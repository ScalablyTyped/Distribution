package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaintStyle extends StObject {
  
  var fill: js.UndefOr[String] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object PaintStyle {
  
  @scala.inline
  def apply(): PaintStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaintStyle]
  }
  
  @scala.inline
  implicit class PaintStyleMutableBuilder[Self <: PaintStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
