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
    
    extension [Self <: ByteLength](x: Self) {
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait Done extends StObject {
    
    var done: Boolean
  }
  object Done {
    
    inline def apply(done: Boolean): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    }
  }
}
