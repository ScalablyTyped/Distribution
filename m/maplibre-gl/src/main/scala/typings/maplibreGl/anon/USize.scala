package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USize extends StObject {
  
  var uSize: Double
  
  var uSizeT: Double
}
object USize {
  
  inline def apply(uSize: Double, uSizeT: Double): USize = {
    val __obj = js.Dynamic.literal(uSize = uSize.asInstanceOf[js.Any], uSizeT = uSizeT.asInstanceOf[js.Any])
    __obj.asInstanceOf[USize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USize] (val x: Self) extends AnyVal {
    
    inline def setUSize(value: Double): Self = StObject.set(x, "uSize", value.asInstanceOf[js.Any])
    
    inline def setUSizeT(value: Double): Self = StObject.set(x, "uSizeT", value.asInstanceOf[js.Any])
  }
}
