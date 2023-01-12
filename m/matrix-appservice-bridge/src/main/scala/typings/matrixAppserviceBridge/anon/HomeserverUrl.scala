package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.libComponentsEncryptionMod.ClientEncryptionStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HomeserverUrl extends StObject {
  
  var homeserverUrl: String
  
  var store: ClientEncryptionStore
}
object HomeserverUrl {
  
  inline def apply(homeserverUrl: String, store: ClientEncryptionStore): HomeserverUrl = {
    val __obj = js.Dynamic.literal(homeserverUrl = homeserverUrl.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeserverUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HomeserverUrl] (val x: Self) extends AnyVal {
    
    inline def setHomeserverUrl(value: String): Self = StObject.set(x, "homeserverUrl", value.asInstanceOf[js.Any])
    
    inline def setStore(value: ClientEncryptionStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
