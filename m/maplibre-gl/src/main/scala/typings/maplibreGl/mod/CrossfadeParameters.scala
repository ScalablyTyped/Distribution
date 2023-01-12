package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossfadeParameters extends StObject {
  
  var fromScale: Double
  
  var t: Double
  
  var toScale: Double
}
object CrossfadeParameters {
  
  inline def apply(fromScale: Double, t: Double, toScale: Double): CrossfadeParameters = {
    val __obj = js.Dynamic.literal(fromScale = fromScale.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], toScale = toScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossfadeParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossfadeParameters] (val x: Self) extends AnyVal {
    
    inline def setFromScale(value: Double): Self = StObject.set(x, "fromScale", value.asInstanceOf[js.Any])
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setToScale(value: Double): Self = StObject.set(x, "toScale", value.asInstanceOf[js.Any])
  }
}
