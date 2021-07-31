package typings.matrixJsSdk

import typings.std.Record
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CacheSecretStorageKey extends StObject {
    
    var cacheSecretStorageKey: js.UndefOr[js.Function2[/* keyId */ String, /* key */ Uint8Array, js.Any]] = js.undefined
    
    var getCrossSigningKey: js.UndefOr[
        js.Function2[/* keyType */ String, /* pubKey */ Uint8Array, js.Promise[Uint8Array]]
      ] = js.undefined
    
    var getSecretStorageKey: js.UndefOr[
        js.Function2[
          /* keys */ Keys, 
          /* name */ String, 
          js.Promise[(js.Tuple2[String, Uint8Array]) | Null]
        ]
      ] = js.undefined
    
    var onSecretRequested: js.UndefOr[
        js.Function5[
          /* name */ String, 
          /* userId */ String, 
          /* deviceId */ String, 
          /* requestId */ String, 
          /* deviceTrust */ js.Any, 
          js.Promise[String]
        ]
      ] = js.undefined
    
    var saveCrossSigningKeys: js.UndefOr[js.Function1[/* keys */ Record[String, Uint8Array], js.Any]] = js.undefined
    
    var shouldUpgradeDeviceVerifications: js.UndefOr[js.Function1[/* users */ Record[String, js.Any], js.Promise[js.Array[String]]]] = js.undefined
  }
  object CacheSecretStorageKey {
    
    @scala.inline
    def apply(): CacheSecretStorageKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheSecretStorageKey]
    }
    
    @scala.inline
    implicit class CacheSecretStorageKeyMutableBuilder[Self <: CacheSecretStorageKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheSecretStorageKey(value: (/* keyId */ String, /* key */ Uint8Array) => js.Any): Self = StObject.set(x, "cacheSecretStorageKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCacheSecretStorageKeyUndefined: Self = StObject.set(x, "cacheSecretStorageKey", js.undefined)
      
      @scala.inline
      def setGetCrossSigningKey(value: (/* keyType */ String, /* pubKey */ Uint8Array) => js.Promise[Uint8Array]): Self = StObject.set(x, "getCrossSigningKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCrossSigningKeyUndefined: Self = StObject.set(x, "getCrossSigningKey", js.undefined)
      
      @scala.inline
      def setGetSecretStorageKey(value: (/* keys */ Keys, /* name */ String) => js.Promise[(js.Tuple2[String, Uint8Array]) | Null]): Self = StObject.set(x, "getSecretStorageKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetSecretStorageKeyUndefined: Self = StObject.set(x, "getSecretStorageKey", js.undefined)
      
      @scala.inline
      def setOnSecretRequested(
        value: (/* name */ String, /* userId */ String, /* deviceId */ String, /* requestId */ String, /* deviceTrust */ js.Any) => js.Promise[String]
      ): Self = StObject.set(x, "onSecretRequested", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnSecretRequestedUndefined: Self = StObject.set(x, "onSecretRequested", js.undefined)
      
      @scala.inline
      def setSaveCrossSigningKeys(value: /* keys */ Record[String, Uint8Array] => js.Any): Self = StObject.set(x, "saveCrossSigningKeys", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveCrossSigningKeysUndefined: Self = StObject.set(x, "saveCrossSigningKeys", js.undefined)
      
      @scala.inline
      def setShouldUpgradeDeviceVerifications(value: /* users */ Record[String, js.Any] => js.Promise[js.Array[String]]): Self = StObject.set(x, "shouldUpgradeDeviceVerifications", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldUpgradeDeviceVerificationsUndefined: Self = StObject.set(x, "shouldUpgradeDeviceVerifications", js.undefined)
    }
  }
  
  trait DeviceId extends StObject {
    
    var deviceId: String
    
    var olmDevice: PickleKey
    
    var userId: String
  }
  object DeviceId {
    
    @scala.inline
    def apply(deviceId: String, olmDevice: PickleKey, userId: String): DeviceId = {
      val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], olmDevice = olmDevice.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceId]
    }
    
    @scala.inline
    implicit class DeviceIdMutableBuilder[Self <: DeviceId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlmDevice(value: PickleKey): Self = StObject.set(x, "olmDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Keys extends StObject {
    
    var keys: Record[String, Pubkey]
  }
  object Keys {
    
    @scala.inline
    def apply(keys: Record[String, Pubkey]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    @scala.inline
    implicit class KeysMutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: Record[String, Pubkey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickleKey extends StObject {
    
    var pickleKey: String
    
    var pickledAccount: String
    
    var sessions: js.Array[Record[String, js.Any]]
  }
  object PickleKey {
    
    @scala.inline
    def apply(pickleKey: String, pickledAccount: String, sessions: js.Array[Record[String, js.Any]]): PickleKey = {
      val __obj = js.Dynamic.literal(pickleKey = pickleKey.asInstanceOf[js.Any], pickledAccount = pickledAccount.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickleKey]
    }
    
    @scala.inline
    implicit class PickleKeyMutableBuilder[Self <: PickleKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPickleKey(value: String): Self = StObject.set(x, "pickleKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickledAccount(value: String): Self = StObject.set(x, "pickledAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessions(value: js.Array[Record[String, js.Any]]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionsVarargs(value: (Record[String, js.Any])*): Self = StObject.set(x, "sessions", js.Array(value :_*))
    }
  }
  
  trait Promise extends StObject {
    
    var promise: js.Promise[js.Any]
    
    var reject: js.Any
    
    var resolve: js.Any
  }
  object Promise {
    
    @scala.inline
    def apply(promise: js.Promise[js.Any], reject: js.Any, resolve: js.Any): Promise = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise]
    }
    
    @scala.inline
    implicit class PromiseMutableBuilder[Self <: Promise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromise(value: js.Promise[js.Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReject(value: js.Any): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: js.Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pubkey extends StObject {
    
    var pubkey: Uint8Array
  }
  object Pubkey {
    
    @scala.inline
    def apply(pubkey: Uint8Array): Pubkey = {
      val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pubkey]
    }
    
    @scala.inline
    implicit class PubkeyMutableBuilder[Self <: Pubkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPubkey(value: Uint8Array): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    }
  }
}
