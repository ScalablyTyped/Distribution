package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidateSizeOptions extends ZoomPanOptions {
  
  var debounceMoveend: js.UndefOr[Boolean] = js.native
  
  var pan: js.UndefOr[Boolean] = js.native
}
object InvalidateSizeOptions {
  
  @scala.inline
  def apply(): InvalidateSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidateSizeOptions]
  }
  
  @scala.inline
  implicit class InvalidateSizeOptionsMutableBuilder[Self <: InvalidateSizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebounceMoveend(value: Boolean): Self = StObject.set(x, "debounceMoveend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebounceMoveendUndefined: Self = StObject.set(x, "debounceMoveend", js.undefined)
    
    @scala.inline
    def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
  }
}
