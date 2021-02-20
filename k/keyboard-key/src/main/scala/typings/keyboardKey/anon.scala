package typings.keyboardKey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<std.KeyboardEvent, 'key' | 'keyCode' | 'which'> */
  @js.native
  trait PickKeyboardEventkeykeyCo extends StObject {
    
    var key: String = js.native
    
    var keyCode: Double = js.native
    
    var which: Double = js.native
  }
  object PickKeyboardEventkeykeyCo {
    
    @scala.inline
    def apply(key: String, keyCode: Double, which: Double): PickKeyboardEventkeykeyCo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickKeyboardEventkeykeyCo]
    }
    
    @scala.inline
    implicit class PickKeyboardEventkeykeyCoMutableBuilder[Self <: PickKeyboardEventkeykeyCo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.KeyboardEvent, 'key' | 'keyCode' | 'which' | 'shiftKey'> */
  @js.native
  trait PickKeyboardEventkeykeyCoKey extends StObject {
    
    var key: String = js.native
    
    var keyCode: Double = js.native
    
    var shiftKey: Boolean = js.native
    
    var which: Double = js.native
  }
  object PickKeyboardEventkeykeyCoKey {
    
    @scala.inline
    def apply(key: String, keyCode: Double, shiftKey: Boolean, which: Double): PickKeyboardEventkeykeyCoKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickKeyboardEventkeykeyCoKey]
    }
    
    @scala.inline
    implicit class PickKeyboardEventkeykeyCoKeyMutableBuilder[Self <: PickKeyboardEventkeykeyCoKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
}
