package typings.luminoKeyboard

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.luminoKeyboard.mod.KeycodeLayout.CodeMap
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/keyboard", "EN_US")
  @js.native
  val EN_US: IKeyboardLayout = js.native
  
  @JSImport("@lumino/keyboard", "KeycodeLayout")
  @js.native
  class KeycodeLayout protected () extends IKeyboardLayout {
    /**
      * Construct a new keycode layout.
      *
      * @param name - The human readable name for the layout.
      *
      * @param codes - A mapping of keycode to key value.
      */
    def this(name: String, codes: CodeMap) = this()
    
    var _codes: js.Any = js.native
    
    var _keys: js.Any = js.native
  }
  object KeycodeLayout {
    
    /**
      * Extract the set of keys from a code map.
      *
      * @param code - The code map of interest.
      *
      * @returns A set of the keys in the code map.
      */
    @JSImport("@lumino/keyboard", "KeycodeLayout.extractKeys")
    @js.native
    def extractKeys(codes: CodeMap): KeySet = js.native
    
    /**
      * A type alias for a keycode map.
      */
    type CodeMap = NumberDictionary[String]
    
    /**
      * A type alias for a key set.
      */
    type KeySet = StringDictionary[Boolean]
  }
  
  @JSImport("@lumino/keyboard", "getKeyboardLayout")
  @js.native
  def getKeyboardLayout(): IKeyboardLayout = js.native
  
  @JSImport("@lumino/keyboard", "setKeyboardLayout")
  @js.native
  def setKeyboardLayout(layout: IKeyboardLayout): Unit = js.native
  
  @js.native
  trait IKeyboardLayout extends StObject {
    
    /**
      * Test whether the given key is a valid value for the layout.
      *
      * @param key - The user provided key to test for validity.
      *
      * @returns `true` if the key is valid, `false` otherwise.
      */
    def isValidKey(key: String): Boolean = js.native
    
    /**
      * Get the key for a `'keydown'` event.
      *
      * @param event - The event object for a `'keydown'` event.
      *
      * @returns The associated key value, or an empty string if the event
      *   does not represent a valid primary key.
      */
    def keyForKeydownEvent(event: KeyboardEvent): String = js.native
    
    /**
      * Get an array of all key values supported by the layout.
      *
      * @returns A new array of the supported key values.
      *
      * #### Notes
      * This can be useful for authoring tools and debugging, when it's
      * necessary to know which keys are available for shortcut use.
      */
    def keys(): js.Array[String] = js.native
    
    /**
      * The human readable name of the layout.
      *
      * This value is used primarily for display and debugging purposes.
      */
    val name: String = js.native
  }
  object IKeyboardLayout {
    
    @scala.inline
    def apply(
      isValidKey: String => Boolean,
      keyForKeydownEvent: KeyboardEvent => String,
      keys: () => js.Array[String],
      name: String
    ): IKeyboardLayout = {
      val __obj = js.Dynamic.literal(isValidKey = js.Any.fromFunction1(isValidKey), keyForKeydownEvent = js.Any.fromFunction1(keyForKeydownEvent), keys = js.Any.fromFunction0(keys), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyboardLayout]
    }
    
    @scala.inline
    implicit class IKeyboardLayoutMutableBuilder[Self <: IKeyboardLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsValidKey(value: String => Boolean): Self = StObject.set(x, "isValidKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyForKeydownEvent(value: KeyboardEvent => String): Self = StObject.set(x, "keyForKeydownEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
