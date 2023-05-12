package typings.hlsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bytes extends StObject {
  
  var bytes: Double
  
  var duration: Double
}
object Bytes {
  
  inline def apply(bytes: Double, duration: Double): Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bytes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bytes] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
