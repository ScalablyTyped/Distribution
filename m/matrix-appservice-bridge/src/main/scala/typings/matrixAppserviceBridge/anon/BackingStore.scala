package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.libComponentsIntentMod.IntentBackingStore
import typings.matrixAppserviceBridge.libComponentsIntentMod.OnEventSentHook
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackingStore extends StObject {
  
  var backingStore: IntentBackingStore
  
  var caching: Ttl
  
  var dontCheckPowerLevel: js.UndefOr[Boolean] = js.undefined
  
  var dontJoin: js.UndefOr[Boolean] = js.undefined
  
  var enablePresence: Boolean
  
  var getJsSdkClient: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onEventSent: js.UndefOr[OnEventSentHook] = js.undefined
  
  var registered: js.UndefOr[Boolean] = js.undefined
}
object BackingStore {
  
  inline def apply(backingStore: IntentBackingStore, caching: Ttl, enablePresence: Boolean): BackingStore = {
    val __obj = js.Dynamic.literal(backingStore = backingStore.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], enablePresence = enablePresence.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackingStore]
  }
  
  extension [Self <: BackingStore](x: Self) {
    
    inline def setBackingStore(value: IntentBackingStore): Self = StObject.set(x, "backingStore", value.asInstanceOf[js.Any])
    
    inline def setCaching(value: Ttl): Self = StObject.set(x, "caching", value.asInstanceOf[js.Any])
    
    inline def setDontCheckPowerLevel(value: Boolean): Self = StObject.set(x, "dontCheckPowerLevel", value.asInstanceOf[js.Any])
    
    inline def setDontCheckPowerLevelUndefined: Self = StObject.set(x, "dontCheckPowerLevel", js.undefined)
    
    inline def setDontJoin(value: Boolean): Self = StObject.set(x, "dontJoin", value.asInstanceOf[js.Any])
    
    inline def setDontJoinUndefined: Self = StObject.set(x, "dontJoin", js.undefined)
    
    inline def setEnablePresence(value: Boolean): Self = StObject.set(x, "enablePresence", value.asInstanceOf[js.Any])
    
    inline def setGetJsSdkClient(value: () => Any): Self = StObject.set(x, "getJsSdkClient", js.Any.fromFunction0(value))
    
    inline def setGetJsSdkClientUndefined: Self = StObject.set(x, "getJsSdkClient", js.undefined)
    
    inline def setOnEventSent(
      value: (/* roomId */ String, /* type */ String, /* content */ Record[String, Any], /* eventId */ String) => Unit
    ): Self = StObject.set(x, "onEventSent", js.Any.fromFunction4(value))
    
    inline def setOnEventSentUndefined: Self = StObject.set(x, "onEventSent", js.undefined)
    
    inline def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    inline def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
  }
}
