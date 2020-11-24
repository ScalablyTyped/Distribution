package typings.matrixJsSdk.anon

import typings.std.Record
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSecretStorageKey extends js.Object {
  
  var cacheSecretStorageKey: js.UndefOr[js.Function2[/* keyId */ String, /* key */ Uint8Array, _]] = js.native
  
  var getCrossSigningKey: js.UndefOr[
    js.Function2[/* keyType */ String, /* pubKey */ Uint8Array, js.Promise[Uint8Array]]
  ] = js.native
  
  var getSecretStorageKey: js.UndefOr[
    js.Function2[
      /* keys */ Keys, 
      /* name */ String, 
      js.Promise[(js.Tuple2[String, Uint8Array]) | Null]
    ]
  ] = js.native
  
  var onSecretRequested: js.UndefOr[
    js.Function5[
      /* name */ String, 
      /* userId */ String, 
      /* deviceId */ String, 
      /* requestId */ String, 
      /* deviceTrust */ js.Any, 
      js.Promise[String]
    ]
  ] = js.native
  
  var saveCrossSigningKeys: js.UndefOr[js.Function1[/* keys */ Record[String, Uint8Array], _]] = js.native
  
  var shouldUpgradeDeviceVerifications: js.UndefOr[js.Function1[/* users */ Record[String, _], js.Promise[js.Array[String]]]] = js.native
}
object CacheSecretStorageKey {
  
  @scala.inline
  def apply(): CacheSecretStorageKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecretStorageKey]
  }
  
  @scala.inline
  implicit class CacheSecretStorageKeyOps[Self <: CacheSecretStorageKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheSecretStorageKey(value: (/* keyId */ String, /* key */ Uint8Array) => _): Self = this.set("cacheSecretStorageKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCacheSecretStorageKey: Self = this.set("cacheSecretStorageKey", js.undefined)
    
    @scala.inline
    def setGetCrossSigningKey(value: (/* keyType */ String, /* pubKey */ Uint8Array) => js.Promise[Uint8Array]): Self = this.set("getCrossSigningKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetCrossSigningKey: Self = this.set("getCrossSigningKey", js.undefined)
    
    @scala.inline
    def setGetSecretStorageKey(value: (/* keys */ Keys, /* name */ String) => js.Promise[(js.Tuple2[String, Uint8Array]) | Null]): Self = this.set("getSecretStorageKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetSecretStorageKey: Self = this.set("getSecretStorageKey", js.undefined)
    
    @scala.inline
    def setOnSecretRequested(
      value: (/* name */ String, /* userId */ String, /* deviceId */ String, /* requestId */ String, /* deviceTrust */ js.Any) => js.Promise[String]
    ): Self = this.set("onSecretRequested", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnSecretRequested: Self = this.set("onSecretRequested", js.undefined)
    
    @scala.inline
    def setSaveCrossSigningKeys(value: /* keys */ Record[String, Uint8Array] => _): Self = this.set("saveCrossSigningKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveCrossSigningKeys: Self = this.set("saveCrossSigningKeys", js.undefined)
    
    @scala.inline
    def setShouldUpgradeDeviceVerifications(value: /* users */ Record[String, _] => js.Promise[js.Array[String]]): Self = this.set("shouldUpgradeDeviceVerifications", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldUpgradeDeviceVerifications: Self = this.set("shouldUpgradeDeviceVerifications", js.undefined)
  }
}
