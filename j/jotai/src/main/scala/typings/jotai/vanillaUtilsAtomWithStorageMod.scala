package typings.jotai

import typings.jotai.vanillaAtomMod.WritableAtom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsAtomWithStorageMod {
  
  @JSImport("jotai/vanilla/utils/atomWithStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atomWithStorage[Value](key: String, initialValue: Value): WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithStorage")(key.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit]]
  inline def atomWithStorage[Value](key: String, initialValue: Value, storage: AsyncStorage[Value]): WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithStorage")(key.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], storage.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit]]
  inline def atomWithStorage[Value](key: String, initialValue: Value, storage: SyncStorage[Value]): WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithStorage")(key.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], storage.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit]]
  
  inline def createJSONStorage[Value](getStringStorage: js.Function0[AsyncStringStorage]): AsyncStorage[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStringStorage.asInstanceOf[js.Any]).asInstanceOf[AsyncStorage[Value]]
  
  inline def createJSONStorage_Value_SyncStorage[Value](getStringStorage: js.Function0[SyncStringStorage]): SyncStorage[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStringStorage.asInstanceOf[js.Any]).asInstanceOf[SyncStorage[Value]]
  
  trait AsyncStorage[Value] extends StObject {
    
    def getItem(key: String, initialValue: Value): js.Promise[Value]
    
    def removeItem(key: String): js.Promise[Unit]
    
    def setItem(key: String, newValue: Value): js.Promise[Unit]
    
    var subscribe: js.UndefOr[
        js.Function3[
          /* key */ String, 
          /* callback */ js.Function1[/* value */ Value, Unit], 
          /* initialValue */ Value, 
          Unsubscribe
        ]
      ] = js.undefined
  }
  object AsyncStorage {
    
    inline def apply[Value](
      getItem: (String, Value) => js.Promise[Value],
      removeItem: String => js.Promise[Unit],
      setItem: (String, Value) => js.Promise[Unit]
    ): AsyncStorage[Value] = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction2(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[AsyncStorage[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncStorage[?], Value] (val x: Self & AsyncStorage[Value]) extends AnyVal {
      
      inline def setGetItem(value: (String, Value) => js.Promise[Value]): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
      
      inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, Value) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
      
      inline def setSubscribe(
        value: (/* key */ String, /* callback */ js.Function1[/* value */ Value, Unit], /* initialValue */ Value) => Unsubscribe
      ): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  trait AsyncStringStorage extends StObject {
    
    def getItem(key: String): js.Promise[String | Null]
    
    def removeItem(key: String): js.Promise[Unit]
    
    def setItem(key: String, newValue: String): js.Promise[Unit]
  }
  object AsyncStringStorage {
    
    inline def apply(
      getItem: String => js.Promise[String | Null],
      removeItem: String => js.Promise[Unit],
      setItem: (String, String) => js.Promise[Unit]
    ): AsyncStringStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[AsyncStringStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncStringStorage] (val x: Self) extends AnyVal {
      
      inline def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  type SetStateActionWithReset[Value] = Value | js.Symbol | (js.Function1[/* prev */ Value, Value | js.Symbol])
  
  trait SyncStorage[Value] extends StObject {
    
    def getItem(key: String, initialValue: Value): Value
    
    def removeItem(key: String): Unit
    
    def setItem(key: String, newValue: Value): Unit
    
    var subscribe: js.UndefOr[
        js.Function3[
          /* key */ String, 
          /* callback */ js.Function1[/* value */ Value, Unit], 
          /* initialValue */ Value, 
          Unsubscribe
        ]
      ] = js.undefined
  }
  object SyncStorage {
    
    inline def apply[Value](getItem: (String, Value) => Value, removeItem: String => Unit, setItem: (String, Value) => Unit): SyncStorage[Value] = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction2(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[SyncStorage[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncStorage[?], Value] (val x: Self & SyncStorage[Value]) extends AnyVal {
      
      inline def setGetItem(value: (String, Value) => Value): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
      
      inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, Value) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
      
      inline def setSubscribe(
        value: (/* key */ String, /* callback */ js.Function1[/* value */ Value, Unit], /* initialValue */ Value) => Unsubscribe
      ): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  trait SyncStringStorage extends StObject {
    
    def getItem(key: String): String | Null
    
    def removeItem(key: String): Unit
    
    def setItem(key: String, newValue: String): Unit
  }
  object SyncStringStorage {
    
    inline def apply(getItem: String => String | Null, removeItem: String => Unit, setItem: (String, String) => Unit): SyncStringStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[SyncStringStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncStringStorage] (val x: Self) extends AnyVal {
      
      inline def setGetItem(value: String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
