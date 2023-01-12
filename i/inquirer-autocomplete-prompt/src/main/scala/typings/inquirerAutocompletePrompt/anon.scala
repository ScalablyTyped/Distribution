package typings.inquirerAutocompletePrompt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ctrl extends StObject {
    
    var ctrl: Boolean
    
    var name: String
  }
  object Ctrl {
    
    inline def apply(ctrl: Boolean, name: String): Ctrl = {
      val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ctrl] (val x: Self) extends AnyVal {
      
      inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: Ctrl
    
    var value: String
  }
  object Key {
    
    inline def apply(key: Ctrl, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: Ctrl): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
