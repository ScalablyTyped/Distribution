package typings.libp2pInterfaceKeychain

import typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.m
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.distTypesSrcBasesInterfaceMod.Multibase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait KeyChain extends StObject {
    
    /**
      * Create a key in the keychain.
      *
      * @example
      *
      * ```js
      * const keyInfo = await libp2p.keychain.createKey('keyTest', 'RSA', 4096)
      * ```
      */
    def createKey(name: String, `type`: KeyType): js.Promise[KeyInfo] = js.native
    def createKey(name: String, `type`: KeyType, size: Double): js.Promise[KeyInfo] = js.native
    
    /**
      * Export an existing key as a PEM encrypted PKCS #8 string.
      *
      * @example
      *
      * ```js
      * await libp2p.keychain.createKey('keyTest', 'RSA', 4096)
      * const pemKey = await libp2p.keychain.exportKey('keyTest', 'password123')
      * ```
      */
    def exportKey(name: String, password: String): js.Promise[Multibase[m]] = js.native
    
    /**
      * Export an existing key as a PeerId
      *
      * @example
      *
      * ```js
      * const peerId = await libp2p.keychain.exportPeerId('key-name')
      * ```
      */
    def exportPeerId(name: String): js.Promise[PeerId] = js.native
    
    /**
      * Find a key by it's id.
      *
      * @example
      *
      * ```js
      * const keyInfo = await libp2p.keychain.createKey('keyTest', 'RSA', 4096)
      * const keyInfo2 = await libp2p.keychain.findKeyById(keyInfo.id)
      * ```
      */
    def findKeyById(id: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Find a key by it's name.
      *
      * @example
      *
      * ```js
      * const keyInfo = await libp2p.keychain.createKey('keyTest', 'RSA', 4096)
      * const keyInfo2 = await libp2p.keychain.findKeyByName('keyTest')
      * ```
      */
    def findKeyByName(name: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Import a new key from a PEM encoded PKCS #8 string.
      *
      * @example
      *
      * ```js
      * await libp2p.keychain.createKey('keyTest', 'RSA', 4096)
      * const pemKey = await libp2p.keychain.exportKey('keyTest', 'password123')
      * const keyInfo = await libp2p.keychain.importKey('keyTestImport', pemKey, 'password123')
      * ```
      */
    def importKey(name: String, pem: String, password: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Import a new key from a PeerId with a private key component
      *
      * @example
      *
      * ```js
      * const keyInfo = await libp2p.keychain.importPeer('keyTestImport', peerIdFromString('12D3Foo...'))
      * ```
      */
    def importPeer(name: String, peerId: PeerId): js.Promise[KeyInfo] = js.native
    
    /**
      * List all the keys.
      *
      * @example
      *
      * ```js
      * const keyInfos = await libp2p.keychain.listKeys()
      * ```
      */
    def listKeys(): js.Promise[js.Array[KeyInfo]] = js.native
    
    /**
      * Removes a key from the keychain.
      *
      * @example
      *
      * ```js
      * await libp2p.keychain.createKey('keyTest', 'RSA', 4096)
      * const keyInfo = await libp2p.keychain.removeKey('keyTest')
      * ```
      */
    def removeKey(name: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Rename a key in the keychain.
      *
      * @example
      *
      * ```js
      * await libp2p.keychain.createKey('keyTest', 'RSA', 4096)
      * const keyInfo = await libp2p.keychain.renameKey('keyTest', 'keyNewNtest')
      * ```
      */
    def renameKey(oldName: String, newName: String): js.Promise[KeyInfo] = js.native
    
    /**
      * Rotate keychain password and re-encrypt all associated keys
      *
      * @example
      *
      * ```js
      * await libp2p.keychain.rotateKeychainPass('oldPassword', 'newPassword')
      * ```
      */
    def rotateKeychainPass(oldPass: String, newPass: String): js.Promise[Unit] = js.native
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
    - typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.RSA
    - typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.Ed25519
    - typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.secp256k1
  */
  trait KeyType extends StObject
  object KeyType {
    
    inline def Ed25519: typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.Ed25519 = "Ed25519".asInstanceOf[typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.Ed25519]
    
    inline def RSA: typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.RSA = "RSA".asInstanceOf[typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.RSA]
    
    inline def secp256k1: typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.secp256k1 = "secp256k1".asInstanceOf[typings.libp2pInterfaceKeychain.libp2pInterfaceKeychainStrings.secp256k1]
  }
}
