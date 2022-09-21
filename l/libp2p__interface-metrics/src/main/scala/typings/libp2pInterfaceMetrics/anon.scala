package typings.libp2pInterfaceMetrics

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
    
    extension [Self <: ByteLength](x: Self) {
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    }
  }
}
