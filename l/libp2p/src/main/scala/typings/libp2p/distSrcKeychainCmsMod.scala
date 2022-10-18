package typings.libp2p

import typings.libp2p.distSrcKeychainMod.KeyChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeychainCmsMod {
  
  @JSImport("libp2p/dist/src/keychain/cms", "CMS")
  @js.native
  open class CMS protected () extends StObject {
    /**
      * Creates a new instance with a keychain
      */
    def this(keychain: KeyChain, dek: String) = this()
    
    /**
      * Reads some protected data.
      *
      * The keychain must contain one of the keys used to encrypt the data.  If none of the keys
      * exists, an Error is returned with the property 'missingKeys'.  It is array of key ids.
      */
    def decrypt(cmsData: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Creates some protected data.
      *
      * The output Uint8Array contains the PKCS #7 message in DER.
      */
    def encrypt(name: String, plain: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* private */ val keychain: Any = js.native
  }
}
