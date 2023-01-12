package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumTaps extends StObject {
  
  var numTaps: Double
  
  var numTouches: Double
}
object NumTaps {
  
  inline def apply(numTaps: Double, numTouches: Double): NumTaps = {
    val __obj = js.Dynamic.literal(numTaps = numTaps.asInstanceOf[js.Any], numTouches = numTouches.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumTaps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumTaps] (val x: Self) extends AnyVal {
    
    inline def setNumTaps(value: Double): Self = StObject.set(x, "numTaps", value.asInstanceOf[js.Any])
    
    inline def setNumTouches(value: Double): Self = StObject.set(x, "numTouches", value.asInstanceOf[js.Any])
  }
}
