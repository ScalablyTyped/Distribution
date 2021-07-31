package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.encryptionMod.ClientEncryptionStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HomeserverUrl extends StObject {
  
  var homeserverUrl: String
  
  var store: ClientEncryptionStore
}
object HomeserverUrl {
  
  @scala.inline
  def apply(homeserverUrl: String, store: ClientEncryptionStore): HomeserverUrl = {
    val __obj = js.Dynamic.literal(homeserverUrl = homeserverUrl.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeserverUrl]
  }
  
  @scala.inline
  implicit class HomeserverUrlMutableBuilder[Self <: HomeserverUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomeserverUrl(value: String): Self = StObject.set(x, "homeserverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: ClientEncryptionStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
