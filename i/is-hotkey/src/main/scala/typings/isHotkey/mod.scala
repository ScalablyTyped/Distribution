package typings.isHotkey

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-hotkey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def default(hotkey: String, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def default(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def default(hotkey: js.Array[String], event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def default(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def compareHotkey(`object`: HotKey, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareHotkey")(`object`.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isCodeHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isCodeHotkey(hotkey: String, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isCodeHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isCodeHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isHotkey(hotkey: String, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isHotkey(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isHotkey(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isHotkey(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isHotkey(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isKeyHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isKeyHotkey(hotkey: String, event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isKeyHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Boolean]]
  @scala.inline
  def isKeyHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def parseHotkey(hotkey: String): HotKey = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[HotKey]
  @scala.inline
  def parseHotkey(hotkey: String, options: HotKeyOptions): HotKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HotKey]
  
  @scala.inline
  def toKeyCode(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyCode")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toKeyName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait HotKey extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var key: js.UndefOr[String] = js.undefined
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
    
    var which: js.UndefOr[Double] = js.undefined
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
  
  trait HotKeyOptions extends StObject {
    
    var byKey: Boolean
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
