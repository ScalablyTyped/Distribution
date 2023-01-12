package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomDelta extends StObject {
  
  var zoomDelta: Double
}
object ZoomDelta {
  
  inline def apply(zoomDelta: Double): ZoomDelta = {
    val __obj = js.Dynamic.literal(zoomDelta = zoomDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoomDelta] (val x: Self) extends AnyVal {
    
    inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
  }
}
