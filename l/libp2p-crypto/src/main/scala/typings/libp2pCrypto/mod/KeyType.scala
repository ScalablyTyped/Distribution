package typings.libp2pCrypto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.libp2pCrypto.libp2pCryptoStrings.Ed25519
  - typings.libp2pCrypto.libp2pCryptoStrings.RSA
  - typings.libp2pCrypto.libp2pCryptoStrings.secp256k1
*/
trait KeyType extends js.Object
object KeyType {
  
  @scala.inline
  def Ed25519: typings.libp2pCrypto.libp2pCryptoStrings.Ed25519 = "Ed25519".asInstanceOf[typings.libp2pCrypto.libp2pCryptoStrings.Ed25519]
  
  @scala.inline
  def RSA: typings.libp2pCrypto.libp2pCryptoStrings.RSA = "RSA".asInstanceOf[typings.libp2pCrypto.libp2pCryptoStrings.RSA]
  
  @scala.inline
  def secp256k1: typings.libp2pCrypto.libp2pCryptoStrings.secp256k1 = "secp256k1".asInstanceOf[typings.libp2pCrypto.libp2pCryptoStrings.secp256k1]
}
