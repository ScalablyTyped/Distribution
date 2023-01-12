package typings.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOverlayStyleOptions
  extends StObject
     with /* name */ StringDictionary[Any] {
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object ImageOverlayStyleOptions {
  
  inline def apply(): ImageOverlayStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOverlayStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageOverlayStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
