package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumTouches extends StObject {
  
  var numTouches: Double
}
object NumTouches {
  
  inline def apply(numTouches: Double): NumTouches = {
    val __obj = js.Dynamic.literal(numTouches = numTouches.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumTouches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumTouches] (val x: Self) extends AnyVal {
    
    inline def setNumTouches(value: Double): Self = StObject.set(x, "numTouches", value.asInstanceOf[js.Any])
  }
}
