package typings.libp2p

import typings.libp2p.distSrcKeychainCmsMod.CMS
import typings.libp2p.libp2pStrings.Ed25519
import typings.libp2p.libp2pStrings.RSA
import typings.libp2pComponents.mod.Components
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeychainMod {
  
  @JSImport("libp2p/dist/src/keychain", "KeyChain")
  @js.native
  open class KeyChain protected ()
    extends StObject
       with Startable {
    /**
      * Creates a new instance of a key chain
      */
    def this(components: Components, init: KeyChainInit) = this()
    
    /**
      * Gets an object that can encrypt/decrypt protected data
      * using the Cryptographic Message Syntax (CMS).
      *
      * CMS describes an encapsulation syntax for data protection. It
      * is used to digitally sign, digest, authenticate, or encrypt
      * arbitrary message content
      */
    def cms: CMS = js.native
    
    /* private */ val components: Any = js.native
    
    /**
      * Create a new key.
      *
      * @param {string} name - The local key name; cannot already exist.
      * @param {string} type - One of the key types; 'rsa'.
      * @param {number} [size = 2048] - The key size in bits. Used for rsa keys only
      */
    def createKey(name: String, `type`: RSA | Ed25519): js.Promise[KeyInfo] = js.native
    def createKey(name: String, `type`: RSA | Ed25519, size: Double): js.Promise[KeyInfo] = js.native
    
    /**
      * Export an existing key as a PEM encrypted PKCS #8 string
      */
    def exportKey(name: String, password: String): js.Promise[String] = js.native
    
    /**
      * Find a key by it's id
      */
    def findKeyById(id: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Find a key by it's name.
      *
      * @param {string} name - The local key name.
      * @returns {Promise<KeyInfo>}
      */
    def findKeyByName(name: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Gets the private key as PEM encoded PKCS #8 string
      */
    def getPrivateKey(name: String): js.Promise[String] = js.native
    
    /**
      * Import a new key from a PEM encoded PKCS #8 string
      *
      * @param {string} name - The local key name; must not already exist.
      * @param {string} pem - The PEM encoded PKCS #8 string
      * @param {string} password - The password.
      * @returns {Promise<KeyInfo>}
      */
    def importKey(name: String, pem: String, password: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Import a peer key
      */
    def importPeer(name: String, peer: PeerId): js.Promise[KeyInfo] = js.native
    
    /* private */ var init: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * List all the keys.
      *
      * @returns {Promise<KeyInfo[]>}
      */
    def listKeys(): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Remove an existing key.
      *
      * @param {string} name - The local key name; must already exist.
      * @returns {Promise<KeyInfo>}
      */
    def removeKey(name: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Rename a key
      *
      * @param {string} oldName - The old local key name; must already exist.
      * @param {string} newName - The new local key name; must not already exist.
      * @returns {Promise<KeyInfo>}
      */
    def renameKey(oldName: String, newName: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Rotate keychain password and re-encrypt all associated keys
      */
    def rotateKeychainPass(oldPass: String, newPass: String): js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  /* static members */
  object KeyChain {
    
    @JSImport("libp2p/dist/src/keychain", "KeyChain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generates the options for a keychain.  A random salt is produced.
      *
      * @returns {object}
      */
    inline def generateOptions(): KeyChainInit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateOptions")().asInstanceOf[KeyChainInit]
  }
  
  trait DekOptions extends StObject {
    
    var hash: String
    
    var iterationCount: Double
    
    var keyLength: Double
    
    var salt: String
  }
  object DekOptions {
    
    inline def apply(hash: String, iterationCount: Double, keyLength: Double, salt: String): DekOptions = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[DekOptions]
    }
    
    extension [Self <: DekOptions](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyChainInit extends StObject {
    
    var dek: js.UndefOr[DekOptions] = js.undefined
    
    var pass: js.UndefOr[String] = js.undefined
  }
  object KeyChainInit {
    
    inline def apply(): KeyChainInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyChainInit]
    }
    
    extension [Self <: KeyChainInit](x: Self) {
      
      inline def setDek(value: DekOptions): Self = StObject.set(x, "dek", value.asInstanceOf[js.Any])
      
      inline def setDekUndefined: Self = StObject.set(x, "dek", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    }
  }
  
  trait KeyInfo extends StObject {
    
    /**
      * The universally unique key id
      */
    var id: String
    
    /**
      * The local key name.
      */
    var name: String
  }
  object KeyInfo {
    
    inline def apply(id: String, name: String): KeyInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyInfo]
    }
    
    extension [Self <: KeyInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
