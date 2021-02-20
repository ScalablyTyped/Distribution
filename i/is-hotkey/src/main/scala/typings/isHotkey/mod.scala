package typings.isHotkey

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: String, event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: js.Array[String], event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", JSImport.Default)
  @js.native
  def default(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  
  @JSImport("is-hotkey", "compareHotkey")
  @js.native
  def compareHotkey(`object`: HotKey, event: KeyboardEvent): Boolean = js.native
  
  @JSImport("is-hotkey", "isCodeHotkey")
  @js.native
  def isCodeHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isCodeHotkey")
  @js.native
  def isCodeHotkey(hotkey: String, event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", "isCodeHotkey")
  @js.native
  def isCodeHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isCodeHotkey")
  @js.native
  def isCodeHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = js.native
  
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: String, event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isHotkey")
  @js.native
  def isHotkey(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  
  @JSImport("is-hotkey", "isKeyHotkey")
  @js.native
  def isKeyHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isKeyHotkey")
  @js.native
  def isKeyHotkey(hotkey: String, event: KeyboardEvent): Boolean = js.native
  @JSImport("is-hotkey", "isKeyHotkey")
  @js.native
  def isKeyHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSImport("is-hotkey", "isKeyHotkey")
  @js.native
  def isKeyHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = js.native
  
  @JSImport("is-hotkey", "parseHotkey")
  @js.native
  def parseHotkey(hotkey: String): HotKey = js.native
  @JSImport("is-hotkey", "parseHotkey")
  @js.native
  def parseHotkey(hotkey: String, options: HotKeyOptions): HotKey = js.native
  
  @JSImport("is-hotkey", "toKeyCode")
  @js.native
  def toKeyCode(name: String): Double = js.native
  
  @JSImport("is-hotkey", "toKeyName")
  @js.native
  def toKeyName(name: String): String = js.native
  
  @js.native
  trait HotKey extends StObject {
    
    var altKey: Boolean = js.native
    
    var ctrlKey: Boolean = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var metaKey: Boolean = js.native
    
    var shiftKey: Boolean = js.native
    
    var which: js.UndefOr[Double] = js.native
  }
  object HotKey {
    
    @scala.inline
    def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): HotKey = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotKey]
    }
    
    @scala.inline
    implicit class HotKeyMutableBuilder[Self <: HotKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
    }
  }
  
  @js.native
  trait HotKeyOptions extends StObject {
    
    var byKey: Boolean = js.native
  }
  object HotKeyOptions {
    
    @scala.inline
    def apply(byKey: Boolean): HotKeyOptions = {
      val __obj = js.Dynamic.literal(byKey = byKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotKeyOptions]
    }
    
    @scala.inline
    implicit class HotKeyOptionsMutableBuilder[Self <: HotKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByKey(value: Boolean): Self = StObject.set(x, "byKey", value.asInstanceOf[js.Any])
    }
  }
}
