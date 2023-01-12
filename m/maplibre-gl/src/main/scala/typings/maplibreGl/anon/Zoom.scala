package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zoom extends StObject {
  
  var value: String | Double | Boolean
  
  var zoom: Double
}
object Zoom {
  
  inline def apply(value: String | Double | Boolean, zoom: Double): Zoom = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zoom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Zoom] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
