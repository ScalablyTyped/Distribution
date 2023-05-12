package typings.itPushable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ByteLength extends StObject {
    
    var byteLength: Double
  }
  object ByteLength {
    
    inline def apply(byteLength: Double): ByteLength = {
      val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteLength]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ByteLength] (val x: Self) extends AnyVal {
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    }
  }
}
