package typings.maplibreMaplibreGlStyleSpec.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueZoom extends StObject {
  
  var value: String | Double | Boolean
  
  var zoom: Double
}
object ValueZoom {
  
  inline def apply(value: String | Double | Boolean, zoom: Double): ValueZoom = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueZoom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueZoom] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
