package typings.libp2pInterfaceKeychain

import typings.libp2pInterfaceKeychain.mod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pInterfaceKeychainStrings {
  
  @js.native
  sealed trait Ed25519
    extends StObject
       with KeyType
  inline def Ed25519: Ed25519 = "Ed25519".asInstanceOf[Ed25519]
  
  @js.native
  sealed trait RSA
    extends StObject
       with KeyType
  inline def RSA: RSA = "RSA".asInstanceOf[RSA]
  
  @js.native
  sealed trait m extends StObject
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait secp256k1
    extends StObject
       with KeyType
  inline def secp256k1: secp256k1 = "secp256k1".asInstanceOf[secp256k1]
}
