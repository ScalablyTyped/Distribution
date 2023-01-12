package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomAny extends StObject {
  
  var zoom: Any
}
object ZoomAny {
  
  inline def apply(zoom: Any): ZoomAny = {
    val __obj = js.Dynamic.literal(zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoomAny] (val x: Self) extends AnyVal {
    
    inline def setZoom(value: Any): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
