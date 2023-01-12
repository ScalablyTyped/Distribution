package typings.ioredis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: Any
  
  var string: Any
}
object Buffer {
  
  inline def apply(buffer: Any, string: Any): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: Any): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setString(value: Any): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
