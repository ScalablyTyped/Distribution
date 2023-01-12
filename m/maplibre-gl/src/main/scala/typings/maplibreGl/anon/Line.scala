package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  var __line__ : Double
}
object Line {
  
  inline def apply(__line__ : Double): Line = {
    val __obj = js.Dynamic.literal(__line__ = __line__.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    inline def set__line__(value: Double): Self = StObject.set(x, "__line__", value.asInstanceOf[js.Any])
  }
}
