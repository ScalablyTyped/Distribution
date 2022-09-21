package typings.isHotkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-hotkey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hotkey: String): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def default(hotkey: String, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEventLike, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def default(hotkey: String, options: HotKeyOptions, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def default(hotkey: js.Array[String], event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEventLike, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def default(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareHotkey(`object`: HotKey, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareHotkey")(`object`.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCodeHotkey(hotkey: String): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isCodeHotkey(hotkey: String, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isCodeHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isCodeHotkey(hotkey: js.Array[String], event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCodeHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isHotkey(hotkey: String): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isHotkey(hotkey: String, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isHotkey(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEventLike, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isHotkey(hotkey: String, options: HotKeyOptions, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isHotkey(hotkey: js.Array[String], event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isHotkey(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEventLike, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isHotkey(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isKeyHotkey(hotkey: String): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isKeyHotkey(hotkey: String, event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isKeyHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEventLike, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ KeyboardEventLike, Boolean]]
  inline def isKeyHotkey(hotkey: js.Array[String], event: KeyboardEventLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeyHotkey")(hotkey.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseHotkey(hotkey: String): HotKey = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHotkey")(hotkey.asInstanceOf[js.Any]).asInstanceOf[HotKey]
  inline def parseHotkey(hotkey: String, options: HotKeyOptions): HotKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHotkey")(hotkey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HotKey]
  
  inline def toKeyCode(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyCode")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toKeyName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait HotKey extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var key: js.UndefOr[String] = js.undefined
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
    
    var which: js.UndefOr[Double] = js.undefined
  }
  object HotKey {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): HotKey = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotKey]
    }
    
    extension [Self <: HotKey](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      inline def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
    }
  }
  
  trait HotKeyOptions extends StObject {
    
    var byKey: Boolean
  }
  object HotKeyOptions {
    
    inline def apply(byKey: Boolean): HotKeyOptions = {
      val __obj = js.Dynamic.literal(byKey = byKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotKeyOptions]
    }
    
    extension [Self <: HotKeyOptions](x: Self) {
      
      inline def setByKey(value: Boolean): Self = StObject.set(x, "byKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyboardEventLike extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var key: String
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
    
    var which: Double
  }
  object KeyboardEventLike {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, key: String, metaKey: Boolean, shiftKey: Boolean, which: Double): KeyboardEventLike = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardEventLike]
    }
    
    extension [Self <: KeyboardEventLike](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
}
