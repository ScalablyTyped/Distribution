package typings.inboxsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Keyboard {
  
  trait KeyboardInstance extends StObject {
    
    def createShortcutHandle(keyboardShortcutDescriptor: KeyboardShortcutDescriptor): KeyboardShortcutHandle
  }
  object KeyboardInstance {
    
    inline def apply(createShortcutHandle: KeyboardShortcutDescriptor => KeyboardShortcutHandle): KeyboardInstance = {
      val __obj = js.Dynamic.literal(createShortcutHandle = js.Any.fromFunction1(createShortcutHandle))
      __obj.asInstanceOf[KeyboardInstance]
    }
    
    extension [Self <: KeyboardInstance](x: Self) {
      
      inline def setCreateShortcutHandle(value: KeyboardShortcutDescriptor => KeyboardShortcutHandle): Self = StObject.set(x, "createShortcutHandle", js.Any.fromFunction1(value))
    }
  }
  
  trait KeyboardShortcutDescriptor extends StObject {
    
    var chord: String
    
    var description: String
  }
  object KeyboardShortcutDescriptor {
    
    inline def apply(chord: String, description: String): KeyboardShortcutDescriptor = {
      val __obj = js.Dynamic.literal(chord = chord.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardShortcutDescriptor]
    }
    
    extension [Self <: KeyboardShortcutDescriptor](x: Self) {
      
      inline def setChord(value: String): Self = StObject.set(x, "chord", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyboardShortcutHandle extends StObject {
    
    def remove(): Unit
  }
  object KeyboardShortcutHandle {
    
    inline def apply(remove: () => Unit): KeyboardShortcutHandle = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[KeyboardShortcutHandle]
    }
    
    extension [Self <: KeyboardShortcutHandle](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
