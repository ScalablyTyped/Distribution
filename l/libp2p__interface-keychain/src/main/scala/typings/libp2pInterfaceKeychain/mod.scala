package typings.libp2pInterfaceKeychain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait KeyChain extends StObject {
    
    def createKey(name: String, `type`: KeyType): js.Promise[KeyInfo] = js.native
    def createKey(name: String, `type`: KeyType, size: Double): js.Promise[KeyInfo] = js.native
    
    def exportKey(name: String, password: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Multibase<'m'> */ Any
      ] = js.native
    
    def findKeyById(id: String): js.Promise[KeyInfo] = js.native
    
    def findKeyByName(name: String): js.Promise[KeyInfo] = js.native
    
    def importKey(name: String, pem: String, password: String): js.Promise[KeyInfo] = js.native
    
    def listKeys(): js.Promise[js.Array[KeyInfo]] = js.native
    
    def removeKey(name: String): js.Promise[KeyInfo] = js.native
    
    def renameKey(oldName: String, newName: String): js.Promise[KeyInfo] = js.native
  }
  
  trait KeyInfo extends StObject {
    
    /**
      * The universally unique key id
      */
    var id: String
    
    /**
      * The local key name
      */
    var name: String
  }
  object KeyInfo {
    
    inline def apply(id: String, name: String): KeyInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.Ed25519
    - typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.RSA
  */
  trait KeyType extends StObject
  object KeyType {
    
    inline def Ed25519: typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.Ed25519 = "Ed25519".asInstanceOf[typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.Ed25519]
    
    inline def RSA: typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.RSA = "RSA".asInstanceOf[typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.RSA]
  }
}
