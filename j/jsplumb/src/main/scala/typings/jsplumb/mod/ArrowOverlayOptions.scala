package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowOverlayOptions extends OverlayOptions {
  
  // 0.5
  var direction: js.UndefOr[Double] = js.native
  
  // 1
  var foldback: js.UndefOr[Double] = js.native
  
  // 20
  var length: js.UndefOr[Double] = js.native
  
  // 20
  var location: js.UndefOr[Double] = js.native
  
  // 0.623
  var paintStyle: js.UndefOr[PaintStyle] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ArrowOverlayOptions {
  
  @scala.inline
  def apply(): ArrowOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowOverlayOptions]
  }
  
  @scala.inline
  implicit class ArrowOverlayOptionsMutableBuilder[Self <: ArrowOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setFoldback(value: Double): Self = StObject.set(x, "foldback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldbackUndefined: Self = StObject.set(x, "foldback", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPaintStyle(value: PaintStyle): Self = StObject.set(x, "paintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintStyleUndefined: Self = StObject.set(x, "paintStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
