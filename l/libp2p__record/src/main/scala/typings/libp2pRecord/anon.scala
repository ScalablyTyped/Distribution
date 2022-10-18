package typings.libp2pRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: js.typedarray.Uint8Array
    
    var timeReceived: String
    
    var value: js.typedarray.Uint8Array
  }
  object Key {
    
    inline def apply(key: js.typedarray.Uint8Array, timeReceived: String, value: js.typedarray.Uint8Array): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], timeReceived = timeReceived.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTimeReceived(value: String): Self = StObject.set(x, "timeReceived", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
