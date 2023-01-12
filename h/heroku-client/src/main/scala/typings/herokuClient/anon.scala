package typings.herokuClient

import typings.herokuClient.mod.RequestCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encryptor extends StObject {
    
    var encryptor: js.Object
    
    var store: RequestCache
  }
  object Encryptor {
    
    inline def apply(encryptor: js.Object, store: RequestCache): Encryptor = {
      val __obj = js.Dynamic.literal(encryptor = encryptor.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encryptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encryptor] (val x: Self) extends AnyVal {
      
      inline def setEncryptor(value: js.Object): Self = StObject.set(x, "encryptor", value.asInstanceOf[js.Any])
      
      inline def setStore(value: RequestCache): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
