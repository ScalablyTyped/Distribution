package typings.luminoKeyboard

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.luminoKeyboard.mod.KeycodeLayout.CodeMap
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lumino/keyboard", "EN_US")
  @js.native
  val EN_US: IKeyboardLayout = js.native
  
  @JSImport("@lumino/keyboard", "KeycodeLayout")
  @js.native
  open class KeycodeLayout protected ()
    extends StObject
       with IKeyboardLayout {
    /**
      * Construct a new keycode layout.
      *
      * @param name - The human readable name for the layout.
      *
      * @param codes - A mapping of keycode to key value.
      *
      * @param modifierKeys - Array of modifier key names
      */
    def this(name: String, codes: CodeMap) = this()
    def this(name: String, codes: CodeMap, modifierKeys: js.Array[String]) = this()
    
    /* private */ var _codes: Any = js.native
    
    /* private */ var _keys: Any = js.native
    
    /* private */ var _modifierKeys: Any = js.native
    
    /**
      * Test whether the given key is a modifier key.
      *
      * @param key - The user provided key.
      *
      * @returns `true` if the key is a modifier key, `false` otherwise.
      *
      * #### Notes
      * This is necessary so that we don't process modifier keys pressed
      * in the middle of the key sequence.
      * E.g. "Shift C Ctrl P" is actually 4 keydown events:
      *   "Shift", "Shift P", "Ctrl", "Ctrl P",
      * and events for "Shift" and "Ctrl" should be ignored.
      */
    /* CompleteClass */
    override def isModifierKey(key: String): Boolean = js.native
    
    /**
      * Test whether the given key is a valid value for the layout.
      *
      * @param key - The user provided key to test for validity.
      *
      * @returns `true` if the key is valid, `false` otherwise.
      */
    /* CompleteClass */
    override def isValidKey(key: String): Boolean = js.native
    
    /**
      * Get the key for a `'keydown'` event.
      *
      * @param event - The event object for a `'keydown'` event.
      *
      * @returns The associated key value, or an empty string if the event
      *   does not represent a valid primary key.
      */
    /* CompleteClass */
    override def keyForKeydownEvent(event: KeyboardEvent): String = js.native
    
    /**
      * Get an array of all key values supported by the layout.
      *
      * @returns A new array of the supported key values.
      *
      * #### Notes
      * This can be useful for authoring tools and debugging, when it's
      * necessary to know which keys are available for shortcut use.
      */
    /* CompleteClass */
    override def keys(): js.Array[String] = js.native
    
    /**
      * The human readable name of the layout.
      *
      * This value is used primarily for display and debugging purposes.
      */
    /* CompleteClass */
    override val name: String = js.native
  }
  object KeycodeLayout {
    
    @JSImport("@lumino/keyboard", "KeycodeLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert array of keys to a key set.
      *
      * @param keys - The array that needs to be converted
      *
      * @returns A set of the keys in the array.
      */
    inline def convertToKeySet(keys: js.Array[String]): KeySet = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToKeySet")(keys.asInstanceOf[js.Any]).asInstanceOf[KeySet]
    
    /**
      * Extract the set of keys from a code map.
      *
      * @param code - The code map of interest.
      *
      * @returns A set of the keys in the code map.
      */
    inline def extractKeys(codes: CodeMap): KeySet = ^.asInstanceOf[js.Dynamic].applyDynamic("extractKeys")(codes.asInstanceOf[js.Any]).asInstanceOf[KeySet]
    
    /**
      * A type alias for a keycode map.
      */
    type CodeMap = NumberDictionary[String]
    
    /**
      * A type alias for a key set.
      */
    type KeySet = StringDictionary[Boolean]
  }
  
  inline def getKeyboardLayout(): IKeyboardLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyboardLayout")().asInstanceOf[IKeyboardLayout]
  
  inline def setKeyboardLayout(layout: IKeyboardLayout): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeyboardLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IKeyboardLayout extends StObject {
    
    /**
      * Test whether the given key is a modifier key.
      *
      * @param key - The user provided key.
      *
      * @returns `true` if the key is a modifier key, `false` otherwise.
      *
      * #### Notes
      * This is necessary so that we don't process modifier keys pressed
      * in the middle of the key sequence.
      * E.g. "Shift C Ctrl P" is actually 4 keydown events:
      *   "Shift", "Shift P", "Ctrl", "Ctrl P",
      * and events for "Shift" and "Ctrl" should be ignored.
      */
    def isModifierKey(key: String): Boolean
    
    /**
      * Test whether the given key is a valid value for the layout.
      *
      * @param key - The user provided key to test for validity.
      *
      * @returns `true` if the key is valid, `false` otherwise.
      */
    def isValidKey(key: String): Boolean
    
    /**
      * Get the key for a `'keydown'` event.
      *
      * @param event - The event object for a `'keydown'` event.
      *
      * @returns The associated key value, or an empty string if the event
      *   does not represent a valid primary key.
      */
    def keyForKeydownEvent(event: KeyboardEvent): String
    
    /**
      * Get an array of all key values supported by the layout.
      *
      * @returns A new array of the supported key values.
      *
      * #### Notes
      * This can be useful for authoring tools and debugging, when it's
      * necessary to know which keys are available for shortcut use.
      */
    def keys(): js.Array[String]
    
    /**
      * The human readable name of the layout.
      *
      * This value is used primarily for display and debugging purposes.
      */
    val name: String
  }
  object IKeyboardLayout {
    
    inline def apply(
      isModifierKey: String => Boolean,
      isValidKey: String => Boolean,
      keyForKeydownEvent: KeyboardEvent => String,
      keys: () => js.Array[String],
      name: String
    ): IKeyboardLayout = {
      val __obj = js.Dynamic.literal(isModifierKey = js.Any.fromFunction1(isModifierKey), isValidKey = js.Any.fromFunction1(isValidKey), keyForKeydownEvent = js.Any.fromFunction1(keyForKeydownEvent), keys = js.Any.fromFunction0(keys), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyboardLayout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IKeyboardLayout] (val x: Self) extends AnyVal {
      
      inline def setIsModifierKey(value: String => Boolean): Self = StObject.set(x, "isModifierKey", js.Any.fromFunction1(value))
      
      inline def setIsValidKey(value: String => Boolean): Self = StObject.set(x, "isValidKey", js.Any.fromFunction1(value))
      
      inline def setKeyForKeydownEvent(value: KeyboardEvent => String): Self = StObject.set(x, "keyForKeydownEvent", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
