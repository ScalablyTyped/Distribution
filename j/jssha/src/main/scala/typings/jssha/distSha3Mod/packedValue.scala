package typings.jssha.distSha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait packedValue extends StObject {
  
  var binLen: Double
  
  var value: js.Array[Double]
}
object packedValue {
  
  inline def apply(binLen: Double, value: js.Array[Double]): packedValue = {
    val __obj = js.Dynamic.literal(binLen = binLen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[packedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: packedValue] (val x: Self) extends AnyVal {
    
    inline def setBinLen(value: Double): Self = StObject.set(x, "binLen", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
