package typings.ipfsCore.initMod

import typings.ipfsCore.ipfsCoreStrings.ed25519_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ipfsCore.ipfsCoreStrings.RSA
  - typings.ipfsCore.ipfsCoreStrings.ed25519_
  - typings.ipfsCore.ipfsCoreStrings.secp256k1
*/
trait KeyType extends js.Object
object KeyType {
  
  @scala.inline
  def RSA: typings.ipfsCore.ipfsCoreStrings.RSA = "RSA".asInstanceOf[typings.ipfsCore.ipfsCoreStrings.RSA]
  
  @scala.inline
  def ed25519: ed25519_ = "ed25519".asInstanceOf[ed25519_]
  
  @scala.inline
  def secp256k1: typings.ipfsCore.ipfsCoreStrings.secp256k1 = "secp256k1".asInstanceOf[typings.ipfsCore.ipfsCoreStrings.secp256k1]
}
