package typings.keyboardKey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<std.KeyboardEvent, 'key' | 'keyCode' | 'which'> */
  trait PickKeyboardEventkeykeyCo extends StObject {
    
    var key: String
    
    var keyCode: Double
    
    var which: Double
  }
  object PickKeyboardEventkeykeyCo {
    
    inline def apply(key: String, keyCode: Double, which: Double): PickKeyboardEventkeykeyCo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickKeyboardEventkeykeyCo]
    }
    
    extension [Self <: PickKeyboardEventkeykeyCo](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.KeyboardEvent, 'key' | 'keyCode' | 'which' | 'shiftKey'> */
  trait PickKeyboardEventkeykeyCoKey extends StObject {
    
    var key: String
    
    var keyCode: Double
    
    var shiftKey: Boolean
    
    var which: Double
  }
  object PickKeyboardEventkeykeyCoKey {
    
    inline def apply(key: String, keyCode: Double, shiftKey: Boolean, which: Double): PickKeyboardEventkeykeyCoKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickKeyboardEventkeykeyCoKey]
    }
    
    extension [Self <: PickKeyboardEventkeykeyCoKey](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
}
