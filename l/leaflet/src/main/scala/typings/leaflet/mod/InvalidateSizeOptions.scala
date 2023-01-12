package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidateSizeOptions
  extends StObject
     with ZoomPanOptions {
  
  var debounceMoveend: js.UndefOr[Boolean] = js.undefined
  
  var pan: js.UndefOr[Boolean] = js.undefined
}
object InvalidateSizeOptions {
  
  inline def apply(): InvalidateSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidateSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidateSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setDebounceMoveend(value: Boolean): Self = StObject.set(x, "debounceMoveend", value.asInstanceOf[js.Any])
    
    inline def setDebounceMoveendUndefined: Self = StObject.set(x, "debounceMoveend", js.undefined)
    
    inline def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
  }
}
