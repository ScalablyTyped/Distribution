package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Double
  
  var length: Double
}
object Duration {
  
  inline def apply(duration: Double, length: Double): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
