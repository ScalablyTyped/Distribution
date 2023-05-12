package typings.libp2pKeychain

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceKeychain.mod.KeyChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/keychain", "DefaultKeyChain")
  @js.native
  open class DefaultKeyChain protected ()
    extends StObject
       with KeyChain {
    /**
      * Creates a new instance of a key chain
      */
    def this(components: KeyChainComponents, init: KeyChainInit) = this()
    
    /* private */ val components: Any = js.native
    
    /**
      * Gets the private key as PEM encoded PKCS #8 string
      */
    def getPrivateKey(name: String): js.Promise[String] = js.native
    
    /* private */ val init: Any = js.native
  }
  /* static members */
  object DefaultKeyChain {
    
    @JSImport("@libp2p/keychain", "DefaultKeyChain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generates the options for a keychain.  A random salt is produced.
      *
      * @returns {object}
      */
    inline def generateOptions(): KeyChainInit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateOptions")().asInstanceOf[KeyChainInit]
  }
  
  trait DEKConfig extends StObject {
    
    var hash: String
    
    var iterationCount: Double
    
    var keyLength: Double
    
    var salt: String
  }
  object DEKConfig {
    
    inline def apply(hash: String, iterationCount: Double, keyLength: Double, salt: String): DEKConfig = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEKConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DEKConfig] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyChainComponents extends StObject {
    
    var datastore: Datastore[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object
      ]
  }
  object KeyChainComponents {
    
    inline def apply(
      datastore: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ]
    ): KeyChainComponents = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyChainComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyChainComponents] (val x: Self) extends AnyVal {
      
      inline def setDatastore(
        value: Datastore[
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object
            ]
      ): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyChainInit extends StObject {
    
    var dek: js.UndefOr[DEKConfig] = js.undefined
    
    var pass: js.UndefOr[String] = js.undefined
  }
  object KeyChainInit {
    
    inline def apply(): KeyChainInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyChainInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyChainInit] (val x: Self) extends AnyVal {
      
      inline def setDek(value: DEKConfig): Self = StObject.set(x, "dek", value.asInstanceOf[js.Any])
      
      inline def setDekUndefined: Self = StObject.set(x, "dek", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    }
  }
}
