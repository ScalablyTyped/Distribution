package typings.inboxsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Keyboard {
  
  @js.native
  trait KeyboardInstance extends StObject {
    
    def createShortcutHandle(keyboardShortcutDescriptor: KeyboardShortcutDescriptor): KeyboardShortcutHandle = js.native
  }
  object KeyboardInstance {
    
    @scala.inline
    def apply(createShortcutHandle: KeyboardShortcutDescriptor => KeyboardShortcutHandle): KeyboardInstance = {
      val __obj = js.Dynamic.literal(createShortcutHandle = js.Any.fromFunction1(createShortcutHandle))
      __obj.asInstanceOf[KeyboardInstance]
    }
    
    @scala.inline
    implicit class KeyboardInstanceMutableBuilder[Self <: KeyboardInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateShortcutHandle(value: KeyboardShortcutDescriptor => KeyboardShortcutHandle): Self = StObject.set(x, "createShortcutHandle", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait KeyboardShortcutDescriptor extends StObject {
    
    var chord: String = js.native
    
    var description: String = js.native
  }
  object KeyboardShortcutDescriptor {
    
    @scala.inline
    def apply(chord: String, description: String): KeyboardShortcutDescriptor = {
      val __obj = js.Dynamic.literal(chord = chord.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardShortcutDescriptor]
    }
    
    @scala.inline
    implicit class KeyboardShortcutDescriptorMutableBuilder[Self <: KeyboardShortcutDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChord(value: String): Self = StObject.set(x, "chord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyboardShortcutHandle extends StObject {
    
    def remove(): Unit = js.native
  }
  object KeyboardShortcutHandle {
    
    @scala.inline
    def apply(remove: () => Unit): KeyboardShortcutHandle = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[KeyboardShortcutHandle]
    }
    
    @scala.inline
    implicit class KeyboardShortcutHandleMutableBuilder[Self <: KeyboardShortcutHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
